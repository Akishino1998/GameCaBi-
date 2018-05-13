import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class confim here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class confim extends tombol
{
    /**
     * Act - do whatever the confim wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            getWorld().removeObjects(getWorld().getObjects(text_modal.class));
            getWorld().removeObjects(getWorld().getObjects(confim.class));
        }  
    }
    public confim()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 630, image.getHeight() - 170);
        setImage(image);
        
    }
}
