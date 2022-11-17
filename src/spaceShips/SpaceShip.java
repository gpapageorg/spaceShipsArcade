package spaceShips;

import mainPackage.Main;

import javax.swing.*;
import java.awt.*;

abstract public class SpaceShip implements Navigation
{
    protected String SpaceShipName;
    protected int horPace;
    protected int verPace;
    protected int xCoord;
    protected int yCoord;

    protected ImageIcon SpaceShipImageIcon;

    public int moveUP()
    {
        yCoord -= verPace;
        if (yCoord <= Main.yOffSet) yCoord = Main.yOffSet;

        return yCoord;
    }

    public int moveDOWN()
    {
        int limit = Main.cosmosHeight - Main.spaceShipHeight - Main.yOffSet;
        yCoord += verPace;
        if(yCoord >= limit) yCoord = limit;
        return yCoord;
    }

    public int moveRIGHT()
    {
        xCoord += horPace;
        int limit = Main.cosmosWidth - Main.spaceShipWidth;
        if (xCoord >= limit) xCoord = limit;

        return yCoord;
    }

    public int moveLEFT()
    {
        xCoord -= horPace;
        if(xCoord < 0) xCoord = 0;

        return xCoord;
    }

    public void printCords()
    {
        System.out.println("Spaceship"+SpaceShipName+" "+ "Xcoords:"+xCoord+" Ycoords:"+yCoord);

    }

    public int getY(){return yCoord;}
    public int getX(){return xCoord;}
    public ImageIcon getIcon(){return SpaceShipImageIcon;}

}
