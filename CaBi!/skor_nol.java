import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class skor_nol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class skor_nol extends Actor
{
    /**
     * Act - do whatever the skor_nol wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean play = false;
    public void act() 
    {
        if(isTouching(chara.class)){
            if(play == false){   
                GreenfootSound sound = new GreenfootSound("Get-sound.mp3");
                sound.play();
                play = true;
            }
        }else{
            play = false;
        }
    }    
    public skor_nol()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 20, image.getHeight() - 20);
        setImage(image);
    }
}
