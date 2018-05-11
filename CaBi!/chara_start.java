import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class chara_start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class chara_start extends Actor
{
    /**
     * Act - do whatever the chara_start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int jeda = 10;
    int stat = 1;
    public void act() 
    {
        if(jeda==0){
            if(stat == 1){
                setImage("Dead (10).png");
                stat = 2;
            }else if(stat == 2){
                setImage("Dead (15).png");
                stat = 3;
            }else if(stat == 3){
                setImage("Dead (20).png");
                stat = 4;
            }else if(stat == 4){
                setImage("Dead (20).png");
                stat = 5;
            }else if(stat == 5){
                setImage("Dead (25).png");
                stat = 6;
            }else if(stat == 6){
                setImage("Dead (30).png");
                stat = 1;
            }
            
            jeda=10;
        }else{
            jeda--;
        }
    }   
}
