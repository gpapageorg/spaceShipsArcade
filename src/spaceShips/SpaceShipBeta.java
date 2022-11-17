package spaceShips;

import mainPackage.Main;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class SpaceShipBeta extends SpaceShip
{
    public static Image img;

    static
    {
        try
        {
            SpaceShipBeta.img = ImageIO.read(Main.class.getResource("../Resources/images/BETA.png"));
        }
        catch (Exception ex) {System.out.println(ex);}
    }
    public SpaceShipBeta()
    {
        SpaceShipName = "BETA";
        horPace = 20;
        verPace = 20;
        xCoord = 0;
        yCoord = Main.cosmosHeight - Main.spaceShipHeight - Main.yOffSet;
        super.SpaceShipImageIcon = new ImageIcon(SpaceShipBeta.img);

    }
}
