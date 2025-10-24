/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labsemana2;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;ja

/**
 *
 * @author David
 */
public class ventanaGenReporte {

    private JTextArea areaTexto;
    private static ArrayList<EmpleadoNormal> listaEmpleados;

    public ventanaGenReporte(ArrayList<EmpleadoNormal> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;

        JFrame screen = new JFrame();
        screen.setSize(800, 600);  //Tamaño standard para menus
        screen.setResizable(false);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.setLocationRelativeTo(null);
        screen.setLayout(null);

        JLabel tituloPrincipal = new JLabel("Lista de Reportes Empleados");
        tituloPrincipal.setBounds(150, 50, 800, 85);
        tituloPrincipal.setFont(new Font("Serif", Font.BOLD, 30));
        
        areaTexto=new JTextArea();
        areaTexto.setEditable(false);
        areaTexto.setFont(new Font("Serif", Font.BOLD, 30));
        add(new JScrollpane(areaTexto),BorderLayout.Center);
        
        JButton btMostrar=new JButton("Mostrar Empleados");
        

    }

}
