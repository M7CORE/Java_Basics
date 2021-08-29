/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dog;

import java.awt.Color;

/**
 *
 * @author kwhiting
 */
public class Dog 
{
    private String name;
    private Color color;
    private String breed;
    private boolean hungry;
    private int height;
    
    protected boolean isBarking()
    {
        return false;
    }
    
    public boolean isFetching()
    {
        return true;
    }
    
    protected boolean isWaggingTail()
    {
        return true;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * @return the hungry
     */
    public boolean isHungry() {
        return hungry;
    }

    /**
     * @param hungry the hungry to set
     */
    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }
    
}
