import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ulang extends tombol
{
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            MyWorld MyWorld = new MyWorld();
            Greenfoot.setWorld(MyWorld);
            
        }
    }    
}
