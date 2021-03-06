import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{

    public tanah_1 tanah = new tanah_1();
    public tanah_1 tanah2 = new tanah_1();
    public tanah_1 tanah3 = new tanah_1();
    public tanah_2 tanahgerak = new tanah_2();
    public chara karakter = new chara();
    public skor_papan papanskor = new skor_papan();
    int bintang = 50;
    GreenfootSound sound = new GreenfootSound("Play-sound.mp3");   
    public MyWorld()
    {    
        super(1000, 600, 1);
        addObject(tanah, 50, 600);
        addObject(tanah2, 300, 500);
        addObject(tanah3, 87, 391);
        addObject(tanahgerak, 400, 200);
        addObject(karakter, 50, 500);
        addObject(papanskor, 517, 40);
        for(int i= 0; i<3; i++){
            addObject(new skor_nol(),417+bintang, 55);
            bintang+=50;
        }
        sound.stop();
        sound.playLoop();
        prepare();
    }
    public gameover selesai = new gameover();
    ulang ulang = new ulang();
    boolean gameover = false;
    public void selesai(){
        if(gameover == false){
            if(karakter.getY()+1>=getHeight()){
                addObject(selesai, getWidth()/2, getHeight()/2);
                addObject(ulang, 500, 400);
                removeObjects(getObjects(chara.class));
                sound.pause();
                GreenfootSound sound = new GreenfootSound("Gameover-sound.mp3");
                sound.play();
                gameover = true;
            }
        }
    }
    public void act(){
        selesai();
    } 
    private void prepare()
    {
        tanah_1 tanah_1 = new tanah_1();
        addObject(tanah_1,724,325);        
        tanah_1.setLocation(995,586);
        penutup penutup = new penutup();
        addObject(penutup,887,488);
        penutup.setLocation(898,464);
        pintu pintu = new pintu();
        addObject(pintu,862,378);
        pintu.setLocation(975,533);
        tanah_1 tanah_12 = new tanah_1();
        addObject(tanah_12,404,353);
        tanah_12.setLocation(269,249);
        tanah_1 tanah_13 = new tanah_1();
        addObject(tanah_13,609,399);
        tanah_13.setLocation(989,326);
        bantuan bantuan = new bantuan();
        addObject(bantuan,768,49);
        bantuan.setLocation(867,52);
        bantuan.setLocation(958,42);
        
    }
}
