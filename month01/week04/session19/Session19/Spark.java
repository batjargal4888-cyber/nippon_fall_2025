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
    private int life = 30;
    private double dx;
    private double dy;
    public Spark(double angle){
        double speed = 1.0;
        dx = Math.cos(angle) * speed;
        dy = -Math.sin(angle) * speed;
    }
    public void act()
    {
        // Add your action code here.
        setLocation((int)(getX() + dx), (int)(getY() + dy));
        life--;
        move(1);
        if(life <= 0){
            getWorld().removeObject(this);
        }
    }
}
