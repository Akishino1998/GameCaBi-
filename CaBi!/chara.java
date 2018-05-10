import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class chara here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
dwdwdawd
 */
public class chara extends Actor
{
    public chara(){
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 350, image.getHeight() - 400);
        setImage(image);
    }
    int kec = 1;
    int keyup = 1;
    public void act() 
    {
        
        belok();
        loncat();
        jatuh();
        selesai();
        
    }   
    public void belok(){
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+2, getY());
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-2, getY());
        }
    }
    public void loncat(){
        if(Greenfoot.isKeyDown("up")){
            if(isTouching(tanah_1.class)){
                if(keyup == 1){
                for(int i = 0; i<=55;i++){
                    setLocation(getX(), getY()-2);
                    Greenfoot.delay(1);
                    
                    belok();
                    }
                keyup=0;
                gesertanah();
                }
            }
            if(isTouching(tanah_2.class)){
                if(keyup == 1){
                for(int i = 0; i<=55;i++){
                    setLocation(getX(), getY()-2);
                    Greenfoot.delay(1);
                    
                    belok();
                    }
                keyup=0;
                gesertanah();
                }
            }
            if(isTouching(penutup.class)){
                if(keyup == 1){
                for(int i = 0; i<=55;i++){
                    setLocation(getX(), getY()-2);
                    Greenfoot.delay(1);
                    
                    belok();
                    }
                keyup=0;
                }
            }
        }
    }
    public void jatuh(){
        if(!isTouching(penutup.class)){
            if(!isTouching(tanah_2.class)){
              if(!isTouching(tanah_1.class)){
                setLocation(getX(), getY()+2);
                Greenfoot.delay(1);
              }
              if(isTouching(tanah_1.class)){
                keyup=1;
              }
            }
        }
        
        if(isTouching(tanah_2.class)){
            keyup=1;
        }
        if(isTouching(penutup.class)){
            keyup=1;
        }
        
    }
    int bintang = 0;
    //public penutup penutup = new penutup();
    public void gesertanah(){
        if(isTouching(skor_isi.class)){
            bintang++;
        }
    }
    public finis finiss = new finis();
    protected void selesai(){
        if(isTouching(pintu.class) && bintang >= 3){
            getWorld().addObject(finiss, 500, 300);
            Greenfoot.stop();
        }
        
    }
}


