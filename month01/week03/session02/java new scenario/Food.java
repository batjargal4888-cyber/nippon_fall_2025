import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Food here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Food extends Actor
{
    /**
     * Act - do whatever the Food wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int score = 0;
    int numberOfLives = 3;
    int speed = 10;
    
    double weight = 80.5;
    String pizzaName = "Hawai Pizza";
    boolean isItTrue = false;

    public void act()
    {
        // Add your action code here.
        move(speed); // 10
        move(speed); // 10
        move(speed); // 10
        move(speed); // 10
        move(speed); // 10
        System.out.println(score);
        System.out.println(numberOfLives);
        System.out.println(speed);
        
        System.out.println(weight);
        System.out.println(pizzaName);
        System.out.println(isItTrue);
    }
}
