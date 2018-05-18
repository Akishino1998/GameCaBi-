import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class confim extends tombol
{
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
