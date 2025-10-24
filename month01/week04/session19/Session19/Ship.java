import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ship extends Actor
{
    /**
     * Act - do whatever the Ship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 4;
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX() - speed, getY());
        } else if (Greenfoot.isKeyDown("right")){
            setLocation(getX() + speed, getY());
        } else if (Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY() - speed);
        } else if (Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY() + speed);
        }
        if("space".equals(Greenfoot.getKey())){
            getWorld().addObject(new Laser(), getX() + 5, getY());
        }
    }
}    
