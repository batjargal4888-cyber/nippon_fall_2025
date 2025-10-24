import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ship extends Actor {
    public Ship(){
        
        // Ship but smaller
        GreenfootImage image = getImage();
        image.scale(30, 30); // 30x30 pixel
        setImage(image);
    }
    
    public void act(){
        
        // Using Arrow key every direction
        if (Greenfoot.isKeyDown("left")) turn(-5);
        if (Greenfoot.isKeyDown("right")) turn(5);
        if (Greenfoot.isKeyDown("up")) move(4);
        if (Greenfoot.isKeyDown("down")) move(-4);
    }
    
    private void shootLaser(){
        
        // Shoot Laser to rotated direction
        if (Greenfoot.isKeyDown("space")) {
            getWorld().addObject(new Laser(getRotation()), getX(), getY());
        }
    }
    
    private void checkCollisions() {
        
        // Ship Astronaut collision check
        if (isTouching(Astronaut.class)) {
            removeTouching(Astronaut.class);
            ((Space)getWorld()).increaseScore();
        }
        
        // Ship Asteroid collision check
        if (isTouching(Asteroid.class)) {
            removeTouching(Asteroid.class);
            ((Space)getWorld()).loseLife();
        }
    }
}
