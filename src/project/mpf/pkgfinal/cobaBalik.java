/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.mpf.pkgfinal;

import java.io.*;
public class cobaBalik {
public static void main(String[] args) throws IOException{
BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); 
String s1;
int i;

System.out.print("Masukkan Kata/Kalimat : ");
s1 = input.readLine();
System.out.print("Dibalik menjadi : ");

for(i=s1.length()-1;i>=0;i--){
char c = s1.charAt(i);
System.out.print(c);
} 
}
}