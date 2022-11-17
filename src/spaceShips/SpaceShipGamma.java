package spaceShips;

import mainPackage.Main;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class SpaceShipGamma extends SpaceShip
{
    public static Image img;

    static
    {
        try
        {
            SpaceShipGamma.img = ImageIO.read(Main.class.getResource("../Resources/images/GAMA.png"));
        }
        catch (Exception ex) {System.out.println(ex);}
    }

    public SpaceShipGamma()
    {
        SpaceShipName = "GAMMA";
        horPace = 30;
        verPace = 30;
        xCoord = 0;
        yCoord = Main.cosmosHeight - Main.spaceShipHeight - Main.yOffSet;
        super.SpaceShipImageIcon = new ImageIcon(SpaceShipGamma.img);
    }
}
