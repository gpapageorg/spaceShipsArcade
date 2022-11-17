package spaceShips;

import mainPackage.Main;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class SpaceShipEnemy extends SpaceShip
{
    public static Image img;

    static
    {
        try
        {
            SpaceShipEnemy.img = ImageIO.read(Main.class.getResource("../Resources/images/ENEMY.png"));
        }
        catch (Exception ex) {System.out.println(ex);}
    }
    public SpaceShipEnemy()
    {
        SpaceShipName = "ENEMY";
        horPace = 40;
        verPace = 40;
        xCoord = 0;
        yCoord = Main.cosmosHeight - Main.spaceShipHeight - Main.yOffSet;
        super.SpaceShipImageIcon = new ImageIcon(SpaceShipEnemy.img);
    }
}
