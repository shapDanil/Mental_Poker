package com.company;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import javax.imageio.ImageIO;
import javax.swing.*;

class pairImg{
    private JLabel l1,l2;
    public pairImg(int x, int y){

    }

}
public class GUI extends JFrame {

    public GUI(int countPlayers, long[][] carts){
        JFrame frame = new JFrame();
        frame.setBounds(100,100,1555,1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        JLabel[] arr1 = new JLabel[countPlayers];
        JLabel[] arr2 = new JLabel[countPlayers];
        for(int i=0,j=0, delx = 67, dely = 100;i<countPlayers;i++,j+=2){
            if(delx*j +63 > 1300){
                j=0;
                dely+=100;
            }
            arr1[i] = new JLabel("");
            arr2[i] = new JLabel("");
            arr1[i].setBounds(63 + delx*j,63 +dely,55,85);
            arr2[i].setBounds(63 + delx*j + 57,63 + dely,55,85);
            BufferedImage img = null;
            BufferedImage img1 = null;
            try {
                img = ImageIO.read(new File("G:\\MentalPoker\\src\\com\\company\\res\\Screenshot_"+ (carts[i][2] + 1) + ".png"));
                img1 = ImageIO.read(new File("G:\\MentalPoker\\src\\com\\company\\res\\Screenshot_"+ (carts[i][3] +1) + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Image dimg = img.getScaledInstance(arr1[i].getWidth(), arr1[i].getHeight(),
                    Image.SCALE_SMOOTH);
            Image dimg1 = img1.getScaledInstance(arr2[i].getWidth(), arr2[i].getHeight(),
                    Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(dimg);
            ImageIcon imageIcon1 = new ImageIcon(dimg1);
            arr1[i].setIcon(imageIcon);
            arr2[i].setIcon(imageIcon1);

            frame.getContentPane().add(arr1[i]);
            frame.getContentPane().add(arr2[i]);
        }


        frame.setVisible(true);
        /*Dimension labelSize = new Dimension(40, 40);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,750);
        frame.setVisible(true);
        //frame.pack();
        BufferedImage img = null;
        //JLabel b3 = new JLabel();
       /*
        try {
            img = ImageIO.read(new File("G:\\MentalPoker\\src\\com\\company\\res\\Screenshot_1.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img.getScaledInstance(b3.getWidth(), b3.getHeight(),
                Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);*/
       /* JLabel b3 = new JLabel(new ImageIcon("G:\\MentalPoker\\src\\com\\company\\res\\Screenshot_1.png"));
        b3.setPreferredSize(labelSize);
        b3.setLocation(210,212);
       // b3.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("G:\\MentalPoker\\src\\com\\company\\res\\Screenshot_1.png")).getImage().getScaledInstance(200, 50, Image.SCALE_SMOOTH)));
       //
        frame.add(b3);*/
    }

}
