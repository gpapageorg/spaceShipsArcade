package spaceShips;

import mainPackage.Main;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class SpaceShipZero extends SpaceShip
{
    public static Image img;

    static
    {
        try
        {
            SpaceShipZero.img = ImageIO.read(Main.class.getResource("../Resources/images/ZERO.png"));
        }
        catch (Exception ex) {System.out.println("Skata" + ex);}
    }
    public SpaceShipZero()
    {
        SpaceShipName = "ALPHA";
        horPace = 5;
        verPace = 5;
        xCoord = 0;
        yCoord = Main.cosmosHeight - Main.spaceShipHeight - Main.yOffSet;
        super.SpaceShipImageIcon = new ImageIcon(SpaceShipZero.img);
    }
}
