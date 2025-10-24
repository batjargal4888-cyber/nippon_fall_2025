import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Space extends World {
    
    // World have 0 score & 3 lives from the start
    private int score = 0;
    private int lives = 3;
    
    // Space info
    public Space() {    
        // Small Space: 600x400 pixel
        super(600, 400, 1); 
    }
    
    // Space objects add
    private void prepare() {
        // Ship add
        addObject(new Ship(), getWidth() / 2, getHeight() / 2);
        
        // Asteroid add
        for (int i = 0; i <= 15; i++) {
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(new Asteroid(), x, y);
        }
        
        // Astronaut add
        for (int i = 0; i <= 5; i++) {
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(new Astronaut(), x, y);
        }
    }
    
    // Score section add
    public void increaseScore() {
        score ++;
        showText("Score: " + score, 70, 20);
        if (score == 5) {
            showText("YOU WIN!", getWidth() / 2, getHeight() / 2);
            Greenfoot.stop();
        }
    }
    
    // Life section add
    public void loseLife() {
        lives --;
        showText("Lives: " + lives, 520, 20);
        if (lives <= 0) {
            showText("YOU LOSE!", getWidth() / 2, getHeight() / 2);
            Greenfoot.stop();
        }
    }
}
