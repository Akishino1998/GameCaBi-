import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class penutup extends Actor
{
    int i = 1;
    boolean goback = false;
    public void act(){
        if(goback == false){
            setLocation(getX()+1,getY());
            if(getX() >= 999){
                goback = true;
            }
        }
        else{
            setLocation(getX()-1,getY());
            if(getX() <= 800){
                goback = false;
            }
        }
        
    }   
    public penutup()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 140, image.getHeight() - 40);
        setImage(image);
        
    }
}
