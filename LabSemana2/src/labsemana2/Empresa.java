/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labsemana2;

import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author David
 */
public class Empresa {
    public static ArrayList<EmpleadoNormal> listaEmpleados;
    
    
    public Empresa(ArrayList<EmpleadoNormal> lista){
        listaEmpleados = lista;
        
        
        JFrame screen = new JFrame();
        screen.setSize(1000, 800);  //Tamaño standard para menus
        screen.setResizable(false);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.setLocationRelativeTo(null);
        screen.setLayout(null);
        
        JLabel tituloPrincipal =  new JLabel("MENU PRINCIPAL DE EMPRESA");
        tituloPrincipal.setBounds(150, 50, 800, 85);
        tituloPrincipal.setFont(new Font("Serif", Font.BOLD, 30));
        
        
        
        screen.add(tituloPrincipal);
        screen.setVisible(true);
    }
    
    
    public static void main(String[] args) {
        Empresa ventana = new Empresa(listaEmpleados);
    }
    
}
