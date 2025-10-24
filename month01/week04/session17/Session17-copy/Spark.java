import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spark here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spark extends Actor
{
    /**
     * Act - do whatever the Spark wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int life = 25;
    public void act()
    {
        life--;
        turn(15);
        if (life <= 0) {
            getWorld().removeObject(this);
        }
    }
}
