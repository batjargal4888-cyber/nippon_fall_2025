import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wombat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wombat extends Actor
{
    /**
     * Act - do whatever the Wombat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Хэрэглэгчийн удирдлага
        if (Greenfoot.isKeyDown("left")) turn(-4);
        if (Greenfoot.isKeyDown("right")) turn(4);

        // Хөдөлгөөн
        move(5);
        
        // Өт идэх
        if (isTouching(Worm.class))
        {
            removeTouching(Worm.class);
            
            // Дараагийн Worm руу чиглүүлэх
            java.util.List<Worm> worms = getWorld().getObjects(Worm.class);
            if(!worms.isEmpty()) {
                Worm nextWorm = worms.get(0);
                turnTowards(nextWorm.getX(), nextWorm.getY());
        }
    }            
        
        // Ирмэг шалгах
        if (isAtEdge()) turn(17);
    }
}
