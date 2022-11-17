package spaceShips;

import mainPackage.Main;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class SpaceShipDelta extends SpaceShip
{
    public static Image img;

    static
    {
        try
        {
            SpaceShipDelta.img = ImageIO.read(Main.class.getResource("../Resources/images/DELTA.png"));
        }
        catch (Exception ex) {System.out.println(ex);}
    }
    public SpaceShipDelta()
    {
        SpaceShipName = "DELTA";
        horPace = 40;
        verPace = 40;
        xCoord = 0;
        yCoord = Main.cosmosHeight - Main.spaceShipHeight - Main.yOffSet;
        super.SpaceShipImageIcon = new ImageIcon(SpaceShipDelta.img);
    }
}
