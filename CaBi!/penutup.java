import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class penutup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class penutup extends Actor
{
    /**
     * Act - do whatever the penutup wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
