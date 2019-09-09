/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.mpf.pkgfinal;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Niko
 */
public class Testing extends JPanel{
    public static void main(String[]args){
                JFrame F = new JFrame();
        F.add(new Testing());
        F.setSize(600,600);
        F.setVisible(true);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }                                      

    public void paintComponent(Graphics g){AffineTransform at = AffineTransform.getTranslateInstance(160, 96);
        at.scale(0.6,0.6);
        BufferedImage a = LoadImage("ImagePackages/stop_icon.png");
        
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.drawImage(a, at, null);
        }
    
    BufferedImage LoadImage(String filename){
        BufferedImage img = null;
        
        try{
            img = ImageIO.read(new File(filename));
        }catch(IOException e){
        
        }return img;
    }
  
}

