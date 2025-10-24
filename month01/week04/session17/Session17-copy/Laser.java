import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser extends Actor {
    private int speed = 6;
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

            world.removeObject(hit);  // эхлээд asteroid устгана
            world.removeObject(this); // дараа нь laser устгана

            // одоо x, y ашиглахад аюулгүй (Laser болон Asteroid устсан ч)
            // Spark эффект
            for (int i = 0; i < 5; i++) {
                int dx = Greenfoot.getRandomNumber(21) - 10;
                int dy = Greenfoot.getRandomNumber(21) - 10;
                world.addObject(new Spark(), x + dx, y + dy);
            }

            // 20% магадлалтай PowerUp
            if (Greenfoot.getRandomNumber(10) < 2) {
                world.addObject(new PowerUp(), x, y);
            }

            return; // act() дуусгана
        }

        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}
