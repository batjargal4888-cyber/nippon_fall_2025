import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    int score;
    public Space()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        score = 0;
        updateScoreDisplay();
        addObject(new Ship(), 100, 100);
        // For Loop ашиглан 10 ширхэг Wombat object үүсгээрэй.
        for (int i = 1; i <= 20; i++) {
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(new Asteroid(), x, y);
        }
    }
    public void addScore(int points){
        score = score + points;
        updateScoreDisplay();
    }
    private void updateScoreDisplay(){
        showText("Score: " + score, 80, 25);
    }
}
