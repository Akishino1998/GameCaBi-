import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class pintu extends Actor
{   
    public pintu()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 400, image.getHeight() - 440);
        setImage(image);
    }
}
