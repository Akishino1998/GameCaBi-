import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class chara_start extends Actor
{
    int jeda = 5;
    int stat = 0;
    String chara[] = {"Walk (1).png","Walk (2).png","Walk (3).png","Walk (4).png","Walk (5).png","Walk (5).png",
        "Walk (6).png","Walk (7).png","Walk (8).png","Walk (9).png","Walk (10).png","Walk (11).png","Walk (12).png",
        "Walk (13).png","Walk (14).png","Walk (15).png","Walk (16).png","Walk (17).png","Walk (18).png","Walk (19).png","Walk (20).png"};
    
    public void act() 
    {
        if(jeda==0){
            setImage(chara[stat]);
            stat++;
            if(stat==20){
                stat = 0;
            }
            jeda=10;
        }else{
            jeda--;
        }
        
        if(stat < 0){
            stat = 2;
        }
    }   
}
