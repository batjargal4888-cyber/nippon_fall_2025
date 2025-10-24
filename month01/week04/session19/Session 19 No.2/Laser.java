import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser extends Actor
{
    /**
     * Act - do whatever the Laser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 10;
    public Laser(int rotation) {
        setRotation(rotation);
    }
    public void act()
    {
        move(speed);
        Asteroid hit = (Asteroid) getOneIntersectingObject(Asteroid.class);
        if (hit != null) {
            World world = getWorld();
            int x = getX();
            int y = getY();
            world.remove
        }
    }
}
