import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    public tanah_1 tanah = new tanah_1();
    public tanah_1 tanah2 = new tanah_1();
    public tanah_1 tanah3 = new tanah_1();
    public tanah_2 tanahgerak = new tanah_2();
    public chara karakter = new chara();
    public skor_papan papanskor = new skor_papan();
    int bintang = 50;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        addObject(tanah, 50, 600);
        addObject(tanah2, 300, 500);
        addObject(tanah3, 87, 391);
        addObject(tanahgerak, 400, 200);
        addObject(karakter, 50, 500);
        addObject(papanskor, 517, 40);

        for(int i= 0; i<3; i++){
            addObject(new skor_isi(),417+bintang, 55);
            bintang+=50;

        }

        prepare();
    }
    public gameover selesai = new gameover();
    
    public void act(){
        
        if(karakter.getY()+1>=getHeight()){
            addObject(selesai, getWidth()/2, getHeight()/2);
            Greenfoot.stop();
        }
        showText("X = "+String.valueOf(karakter.getX())+", Y = "+String.valueOf(karakter.getY()),100,50);
        splashStart splash = new splashStart();
        Greenfoot.setWorld(splash);
        
    } 

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
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
        tanah_13.setLocation(609,399);
        tanah_13.setLocation(609,399);
        tanah_13.setLocation(609,399);
        tanah_13.setLocation(609,399);
        tanah_13.setLocation(609,399);
        tanah_13.setLocation(609,399);
        tanah_13.setLocation(609,399);
        tanah_13.setLocation(609,399);
        tanah_13.setLocation(609,399);
        tanah_13.setLocation(609,399);
        tanah_13.setLocation(609,399);
        tanah_13.setLocation(609,399);
        tanah_13.setLocation(609,399);
        tanah_13.setLocation(609,399);
        tanah_13.setLocation(609,399);
        tanah_13.setLocation(609,399);
        tanah_13.setLocation(609,399);
        tanah_13.setLocation(928,348);
        tanah_13.setLocation(928,348);
        tanah_13.setLocation(928,348);
        tanah_13.setLocation(928,348);
        tanah_13.setLocation(928,348);
        tanah_13.setLocation(928,348);
        tanah_13.setLocation(928,348);
        tanah_13.setLocation(928,348);
        tanah_13.setLocation(928,348);
        tanah_13.setLocation(928,348);
        tanah_13.setLocation(928,348);
        tanah_13.setLocation(928,348);
        tanah_13.setLocation(928,348);
        tanah_13.setLocation(928,348);
        tanah_13.setLocation(928,348);
        tanah_13.setLocation(928,348);
        tanah_13.setLocation(928,348);
        tanah_13.setLocation(962,348);
        tanah_13.setLocation(962,348);
        tanah_13.setLocation(962,348);
        tanah_13.setLocation(962,348);
        tanah_13.setLocation(962,348);
        tanah_13.setLocation(962,348);
        tanah_13.setLocation(962,348);
        tanah_13.setLocation(962,348);
        tanah_13.setLocation(962,348);
        tanah_13.setLocation(962,348);
        tanah_13.setLocation(962,348);
        tanah_13.setLocation(962,348);
        tanah_13.setLocation(993,349);
        tanah_13.setLocation(993,349);
        tanah_13.setLocation(993,349);
        tanah_13.setLocation(993,349);
        tanah_13.setLocation(993,349);
        tanah_13.setLocation(989,326);
    }
}
