import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pintu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pintu extends Actor
{
    /**
     * Act - do whatever the pintu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public pintu()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 400, image.getHeight() - 440);
        setImage(image);
    }
}