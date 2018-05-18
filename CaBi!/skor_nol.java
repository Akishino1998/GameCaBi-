import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class skor_nol extends Actor
{
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
