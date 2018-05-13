import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bantuan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bantuan extends tombol
{
    /**
     * Act - do whatever the bantuan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            text_modal text_modal = new text_modal();
            getWorld().addObject(text_modal,495,283);
            confim confim = new confim();
            getWorld().addObject(confim,497,388);
        }
    }  
    public bantuan()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 200, image.getHeight() - 230);
        setImage(image);
        
    }
}
