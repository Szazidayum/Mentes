/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Szabrina
 */
public class Mentes {

    String szoveg = "ez egy sor";
    
    public static void main(String[] args) {
        new Mentes().feladat();
    }
    
    private void feladat(){
        for (int i = 0; i < 10; i++) {
            szoveg += "\nuj sor";
        }
        
        irasFajlba();
        fajlbolOlvas();
    }
    
    private void irasFajlba(){
        try {
            Files.write(Paths.get("adat.txt"), szoveg.getBytes());
        } catch (IOException ex) {
            Logger.getLogger(Mentes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void fajlbolOlvas(){
        try {
            List<String> sorok = Files.readAllLines(Paths.get("adat.txt"));
            System.out.println("sorok:");
            for (String sor : sorok) {
                System.out.println(sor);
            }
        } catch (IOException ex) {
            Logger.getLogger(Mentes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
