import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ship extends Actor
{
    public void act() {
        moveShip();
        shootLaser();
        checkCollisions();
    }
    private void moveShip() {
        if (Greenfoot.isKeyDown("left")) turn(-5);
        if (Greenfoot.isKeyDown("right")) turn(5);
        if (Greenfoot.isKeyDown("up")) move(4);
    }
    private void shootLaser() {
        if (Greenfoot.isKeyDown("space")) {
            getWorld().addObject(new Laser(getRotation()), getX(), getY());
        }
    }
    private void checkCollisions() {
        if (isTouching(Astronaut.class)) {
            removeTouching(Astronaut.class);
            ((Space)getWorld()).increaseScore();
        }
        if (isTouching(Asteroid.class)) {
            removeTouching(Asteroid.class);
            ((Space)getWorld()).loseLife();
        }
    }
}
