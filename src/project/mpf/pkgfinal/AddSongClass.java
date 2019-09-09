/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.mpf.pkgfinal;
import java.awt.*;
import java.io.*;
import java.util.*;
/**
 *
 * @author Niko
 */
public class AddSongClass {
    public static void main(String[] args) throws IOException{
        Desktop desktop = Desktop.getDesktop();
        File openFile = new File("C:\\");
        try{desktop.open(openFile);
        }catch(IOException i){
            i.printStackTrace();
        }
    }
}
