import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tanah_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tanah_1 extends Actor
{
    /**
     * Act - do whatever the tanah_1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public chara karakter = new chara();
    public void act() 
    {
        
    }    
    public tanah_1()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 170, image.getHeight() - 50);
        setImage(image);
        
    }
}
