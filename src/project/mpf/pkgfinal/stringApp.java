/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.mpf.pkgfinal;
    import java.lang.System;
    import java.lang.String;

/** *
 * @author Niko
 */
public class stringApp {
    public static void main(String Args[]){
        String a = "Hello World";
        System.out.println(a);
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println("["+a+"]");
        a=a.trim();
        System.out.println("["+a+"]");
        a=a.replace('e', '2');
        a=a.replace('l', '1');
        System.out.println("["+a+"]");
        int b=a.indexOf('2');
        int c=a.indexOf('1');
        char ch[]=a.toCharArray();
        ch[b] = 'e';
        ch[c] = 'l';
        a = new String(ch);
        System.out.println(a);
        
    
    
    }
}
