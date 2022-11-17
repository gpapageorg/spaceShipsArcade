package gui;

import spaceShips.SpaceShip;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePlayScreen extends JPanel implements KeyListener
{
    private static final long serialVersionUID = 1L;

    private SpaceShip spaceShip;

    GamePlayScreen()
    {
        addKeyListener(this);
        setVisible(true);
        this.setBackground(Color.BLACK);
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        spaceShip.getIcon().paintIcon(this, g, spaceShip.getX(), spaceShip.getY());
    }
    @Override
    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyCode() == KeyEvent.VK_UP) spaceShip.moveUP();
        if(e.getKeyCode() == KeyEvent.VK_DOWN) spaceShip.moveDOWN();
        if(e.getKeyCode() == KeyEvent.VK_LEFT) spaceShip.moveLEFT();
        if(e.getKeyCode() == KeyEvent.VK_RIGHT) spaceShip.moveRIGHT();
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e){}

    @Override
    public void keyTyped(KeyEvent e) {}
    public void setUserSpaceShip(SpaceShip sp)
    {
        spaceShip = sp;
    }
}
