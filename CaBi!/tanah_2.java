import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class tanah_2 extends Actor
{
    /**
     * Act - do whatever the tanah_2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */  
    int i = 1;
    boolean goback = false;
    public void act(){
        if(goback == false){
            setLocation(getX()+1,getY());
            if(getX() >= 600){
                goback = true;
            }
        }
        else{
            setLocation(getX()-1,getY());
            if(getX() <= 400){
                goback = false;
            }
        }
        
    }
    public tanah_2()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 140, image.getHeight() - 40);
        setImage(image);
    }
}
