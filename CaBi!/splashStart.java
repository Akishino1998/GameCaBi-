import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class splashStart extends World
{
    public splashStart()
    {    
        super(1000, 600, 1);
        prepare();
        
        
    }
    GreenfootSound sound = new GreenfootSound("Start-sound.mp3");
    boolean play = false;
    public void act(){
        if (Greenfoot.mouseClicked(null)) Greenfoot.setWorld(new MyWorld());
        start start = new start();
        sound.play();
        if(Greenfoot.mouseClicked(start.class)){
            MyWorld MyWorld = new MyWorld();
            Greenfoot.setWorld(MyWorld);
            sound.pause();
        }
    }
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
        chara_start chara_start2 = new chara_start();
        addObject(chara_start2,286,242);
        chara_start.setLocation(673,271);
        removeObject(chara_start);
        chara_start2.setLocation(504,192);
        removeObject(bantuan);
        chara_start2.setLocation(793,345);
        chara_start2.setLocation(802,178);
    }
}
