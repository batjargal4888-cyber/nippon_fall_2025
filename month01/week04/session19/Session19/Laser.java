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
    public void act()
    {
        // Add your action code here.
        move(10);
        setLocation(getX() + 10, getY());
        Actor asteroid = getOneIntersectingObject(Asteroid.class);
        if(asteroid != null){
            Space space = (Space) getWorld();
            int centerX = asteroid.getX();
            int centerY = asteroid.getY();
            space.addScore(10);
            getWorld().removeObject(asteroid);
            int sparkCount = 5;
            int radius = 40;
            for(int i = 0; i < sparkCount; i++){
                double angle = Math.toRadians(i * (360.0 / sparkCount));
                int sparkX = (int)(centerX + Math.cos(angle) * radius);
                int sparkY = (int)(centerY - Math.sin(angle) * radius);
                Spark spark = new Spark(angle);
                space.addObject(spark, sparkX, sparkY);
            }
            getWorld().removeObject(this);
        }
    }
}
