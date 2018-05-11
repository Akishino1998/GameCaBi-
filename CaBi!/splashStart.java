import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class splashStart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class splashStart extends World
{

    /**
     * Constructor for objects of class splashStart.
     * 
     */
    public splashStart()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        prepare();
        
    }


    public void act(){
        if (Greenfoot.mouseClicked(null)) Greenfoot.setWorld(new MyWorld());
        start start = new start();
        if(Greenfoot.mousePressed(start)){
            showText("dawdadadawda", 100, 50);
        }
        showText("dawdadadawda", 50, 50);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        chara_start chara_start = new chara_start();
        addObject(chara_start,776,200);
        chara_start.setLocation(610,203);
        start start = new start();
        addObject(start,544,357);
        start.setLocation(525,353);
        chara_start.setLocation(604,217);
        start.setLocation(524,363);
        start.setLocation(252,327);
        start.setLocation(162,507);
        start.setLocation(150,525);
        bantuan bantuan = new bantuan();
        addObject(bantuan,856,560);
        bantuan.setLocation(849,46);
    }
}
