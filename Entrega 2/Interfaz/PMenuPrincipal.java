package Interfaz;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.*;

import javax.swing.JButton; 
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.*;
import javax.swing.*;
import javax.swing.JFrame;

import javax.swing.JPanel;

public class PMenuPrincipal extends JPanel {
    private VentanaMenuPrincipal ventanaMenuPrincipal;
    private JPanel panelCentral;
    private JPanel panelAbajo;

    public PMenuPrincipal(VentanaMenuPrincipal ventanaMenuPrincipal) {
        this.ventanaMenuPrincipal = ventanaMenuPrincipal;
        this.setBackground(new Color(02,28, 30) ); //fondo

        GridLayout grid = new GridLayout(3, 1, 0, 0); //será un tabla (fila, columna, espacios entre cuadros (horizotal y vertical))
        this.setLayout(grid);
        
        panelCentral = new JPanel(); // crear un penel dentro de otro
        GridLayout grid1 = new GridLayout(3, 1, 0, 5); //será un tabla (fila, columna, espacios entre cuadros (horizotal y vertical))
        panelCentral.setLayout(grid1);
        panelCentral.setBackground(new Color(02,28, 30) ); //fondo

        JLabel titulo = new JLabel("¡Bienvenido al Gestor de proyectos!", SwingConstants.CENTER);
        titulo.setOpaque(true);
        titulo.setFont(new Font("Aharoni", Font.BOLD, 25));
        titulo.setBorder(new EmptyBorder(50, 0, 20, 0));
        titulo.setBackground(new Color(02,28, 30) );
        titulo.setForeground( new Color(44,120, 115) );
        this.add(titulo, BorderLayout.NORTH);

        JLabel instruccion = new JLabel("Seleccione una opción: ", SwingConstants.CENTER);
        instruccion.setOpaque(true);
        instruccion.setFont(new Font("Congenial SemiBold", Font.PLAIN, 20));
        instruccion.setBackground(new Color(02,28, 30) ); //fondo principal
        instruccion.setForeground( new Color(111,185, 143) ); //letra principal

        JButton boton1 = (new JButton("Crear un nuevo proyecto"));
        JButton boton2 = (new JButton("Gestionar un  proyecto"));
        boton1.setBackground(new Color(111,185, 143)  ); //fondo botones
        boton1.setForeground(new Color(02,28, 30) ); //letra botones
        boton2.setBackground(new Color(111,185, 143)  );
        boton2.setForeground(new Color(02,28, 30) );

        panelCentral.add(instruccion, BorderLayout.CENTER);
        panelCentral.add (boton1, BorderLayout.CENTER);      
        panelCentral.add (boton2, BorderLayout.CENTER);

        panelCentral.setBorder(new EmptyBorder(0, 120, 0, 120));
        this.add(panelCentral, BorderLayout.CENTER);
        

        panelAbajo = new JPanel();
        panelAbajo.add(new JButton("Guardar"), BorderLayout.CENTER);
        panelAbajo.setBorder(new EmptyBorder(0, 0, 0, 0));
        panelAbajo.setBackground(new Color(02,28, 30) );
        panelAbajo.setForeground( new Color(111,185, 143) );
        this.add(panelAbajo, BorderLayout.SOUTH);

    }
}   
