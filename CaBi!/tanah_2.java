import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class tanah_2 extends Actor
{
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
