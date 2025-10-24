import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Asteroid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteroid extends Actor
{
    private int speed;
    public Asteroid() {
        setRotation(Greenfoot.getRandomNumber(360));
        speed = 1 + Greenfoot.getRandomNumber(3);
    }
    public void act()
    {
        move(speed);
        if (isAtEdge()) {
            turn(Greenfoot.getRandomNumber(45) - 22);
        }
    }
}
