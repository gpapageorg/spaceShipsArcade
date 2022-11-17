package spaceShips;

import mainPackage.Main;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class SpaceShipAlpha extends SpaceShip
{
    public static Image img;

    static
    {
        try
        {
            SpaceShipAlpha.img = ImageIO.read(Main.class.getResource("../Resources/images/ALPHA.png"));
        }
        catch (Exception ex) {System.out.println(ex);}
    }
    public SpaceShipAlpha()
    {
        SpaceShipName = "ALPHA";
        horPace = 10;
        verPace = 10;
        xCoord = 0;
        yCoord = Main.cosmosHeight - Main.spaceShipHeight - Main.yOffSet;
        super.SpaceShipImageIcon = new ImageIcon(SpaceShipAlpha.img);

    }



}
