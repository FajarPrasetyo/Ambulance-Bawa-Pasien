import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class car extends parent
{
    int speed = -5;
    public void act()
    {   
        
        
    car a = new car();
    Actor i = getOneIntersectingObject(carblue.class);
    move(speed);
    checkdouble(i);
    end();
    
    }
    
    
}
