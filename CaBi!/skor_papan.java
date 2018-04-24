import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class skor_papan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class skor_papan extends Actor
{
    /**
     * Act - do whatever the skor_papan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public skor_papan()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 80, image.getHeight() - 80);
        setImage(image);
    }
}
