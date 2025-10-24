import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends World
{
    private int score = 0;
    private int lives = 3;
    public Space() {
        super(1000, 1000, 1);
        prepare();
    }
    private void prepare() {
        for (int i = 0; i <15; i++) {
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(new Asteroid(), x, y);
        }
        for (int i = 0; i < 5; i++) {
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(new Astronaut(), x, y);
        }
        addObject(new Ship(), getWidth() / 2, getHeight() / 2);
    }
    public void increaseScore() {
        score++;
        showText("Score: " + score, 70, 20);
        if (score == 5) {
            showText("YOU WIN!", getWidth() / 2, getHeight() / 2);
            Greenfoot.stop();
        }
    }
    public void loseLife() {
        lives--;
        showText("Lives: " + lives, 520, 20);
        if (lives <= 0) {
            showText("YOU LOSE!", getWidth() / 2, getHeight() / 2);
            Greenfoot.stop();
        }
    }
}    