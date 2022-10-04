import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class carblue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class carblue extends parent
{
    int speed = 3;
    
    public void act()
    {   
        carblue a = new carblue();
        Actor i = getOneIntersectingObject(carblue.class);
    
       move(speed);
       checkdouble(i);
       end();
    }
}
