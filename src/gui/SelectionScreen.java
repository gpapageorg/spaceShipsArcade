package gui;

import spaceShips.*;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;


public class SelectionScreen extends JPanel
{
     Font arcadeOne;
    private static final long serialVersionUID = 1L;
    Player player = new Player();
    SelectionScreen()
    {
        arcadeOne = loadFont("../Resources/fonts/ARCADE_N.TTF");

        player.playMusic("C:\\Users\\georg\\Documents\\Development\\Java\\UniProjects\\Week7\\src\\Resources\\audio\\selectionmusic.wav");

        this.setLayout(new BorderLayout(0,0));
        this.add(createNorthPanel(), BorderLayout.NORTH);
        this.add(createCenterPanel(), BorderLayout.CENTER);
        this.add(createSouthPanel(), BorderLayout.SOUTH);
    }
    private JPanel createNorthPanel()
    {
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(100,190));
        JLabel label = new JLabel("SELECT YOUR SPACESHIP");
        label.setFont(arcadeOne);
        label.setFont(label.getFont().deriveFont(Font.BOLD,30));
        label.setForeground(Color.YELLOW);
        panel.setBackground(Color.BLACK);

        panel.add(label);
        return panel;
    }
    private JPanel createCenterPanel()
    {
        JButton btnSpaceShipZero = new JButton("ZERO");
        JButton btnSpaceShipAlpha = new JButton("ALPHA");
        JButton btnSpaceShipBeta = new JButton("BETA");
        JButton btnSpaceShipGamma = new JButton("GAMA");
        JButton btnSpaceShipDelta = new JButton("DELTA");

        btnSpaceShipZero.addActionListener(new SpaceShipSelectionButtonHandler("SZERO", btnSpaceShipZero, player));
        btnSpaceShipAlpha.addActionListener(new SpaceShipSelectionButtonHandler("SALPHA", btnSpaceShipAlpha, player));
        btnSpaceShipBeta.addActionListener(new SpaceShipSelectionButtonHandler("SBETA", btnSpaceShipBeta, player));
        btnSpaceShipGamma.addActionListener(new SpaceShipSelectionButtonHandler("SGAMA", btnSpaceShipGamma, player));
        btnSpaceShipDelta.addActionListener(new SpaceShipSelectionButtonHandler("SDELTA", btnSpaceShipDelta, player));

        addHover(btnSpaceShipZero);
        addHover(btnSpaceShipAlpha);
        addHover(btnSpaceShipBeta);
        addHover(btnSpaceShipGamma);
        addHover(btnSpaceShipDelta);

        configureButtonText(btnSpaceShipZero);
        configureButtonText(btnSpaceShipAlpha);
        configureButtonText(btnSpaceShipBeta);
        configureButtonText(btnSpaceShipGamma);
        configureButtonText(btnSpaceShipDelta);

        btnSpaceShipZero.setIcon(new ImageIcon(SpaceShipZero.img));
        btnSpaceShipAlpha.setIcon(new ImageIcon(SpaceShipAlpha.img));
        btnSpaceShipBeta.setIcon(new ImageIcon(SpaceShipBeta.img));
        btnSpaceShipGamma.setIcon(new ImageIcon(SpaceShipGamma.img));
        btnSpaceShipDelta.setIcon(new ImageIcon(SpaceShipDelta.img));

        makeBtnTransparent(btnSpaceShipZero);
        makeBtnTransparent(btnSpaceShipAlpha);
        makeBtnTransparent(btnSpaceShipBeta);
        makeBtnTransparent(btnSpaceShipGamma);
        makeBtnTransparent(btnSpaceShipDelta);



        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout());
        panel.setBackground(Color.BLACK);
        panel.add(btnSpaceShipZero);
        panel.add(btnSpaceShipAlpha);
        panel.add(btnSpaceShipBeta);
        panel.add(btnSpaceShipGamma);
        panel.add(btnSpaceShipDelta);

        return panel;
    }

    private JPanel createSouthPanel()
    {
        JButton btnExit = new JButton("EXIT");
        JPanel tmp = new JPanel();
        JPanel panel = new JPanel();
        tmp.setLayout(new BorderLayout());
        tmp.setPreferredSize(new Dimension(100,50));
        panel.setPreferredSize(new Dimension(800,200));
        panel.setBackground(Color.BLACK);
        tmp.setBackground(Color.WHITE);

        tmp.add(btnExit, BorderLayout.CENTER);
        panel.add(tmp);
        return panel;
    }

    private void makeBtnTransparent(JButton btn)
    {
        btn.setOpaque(false);
        btn.setContentAreaFilled(false);
        btn.setBorderPainted(false);
    }


    private void addHover(JButton btn)
    {
        btn.addMouseListener(new java.awt.event.MouseAdapter()
        {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btn.setBorderPainted(true);
                btn.setBorder(new LineBorder(Color.YELLOW, 5));
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btn.setBorderPainted(false);
            }
        });
    }

    private void configureButtonText(JButton btn)
    {
        btn.setFont(arcadeOne);
        btn.setFont(btn.getFont().deriveFont(Font.BOLD, 15));
        btn.setForeground(Color.RED);
        btn.setHorizontalTextPosition(JButton.CENTER);
        btn.setVerticalTextPosition(JButton.NORTH);
    }

    private Font loadFont(String path)
    {
        Font font = null;
        try{
            InputStream io = getClass().getResourceAsStream(path);
            font = Font.createFont(Font.TRUETYPE_FONT, io);
        }
        catch (FontFormatException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return font;
    }


}

class SpaceShipSelectionButtonHandler implements ActionListener
{
    String name;
    JButton btn;
    Player ms;
    SpaceShipSelectionButtonHandler(String name, JButton btn, Player ms)
    {
        this.name = name;
        this.btn = btn;
        this.ms = ms;
    }
    public void actionPerformed(ActionEvent ev)
    {
        SpaceFrame.cardLayout.next(SpaceFrame.spaceFramePanel);
        SpaceFrame.gamePlayScreen.setFocusable(true);
        SpaceFrame.gamePlayScreen.requestFocus();
        ms.stopMusic();

        if(name.equalsIgnoreCase("SZERO")) SpaceFrame.gamePlayScreen.setUserSpaceShip(new SpaceShipZero());
        if(name.equalsIgnoreCase("SALPHA")) SpaceFrame.gamePlayScreen.setUserSpaceShip(new SpaceShipAlpha());
        if(name.equalsIgnoreCase("SBETA")) SpaceFrame.gamePlayScreen.setUserSpaceShip(new SpaceShipBeta());
        if(name.equalsIgnoreCase("SGAMA")) SpaceFrame.gamePlayScreen.setUserSpaceShip(new SpaceShipGamma());
        if(name.equalsIgnoreCase("SDELTA")) SpaceFrame.gamePlayScreen.setUserSpaceShip(new SpaceShipDelta());
    }
}




