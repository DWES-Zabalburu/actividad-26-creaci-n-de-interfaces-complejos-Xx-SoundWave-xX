/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.actividad26.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author DAW1
 */
public class Ventana extends JFrame{
    
    private Dimension dmVentana = new Dimension(700,500);
    
    private JLabel lblTitulo = new JLabel("Actualiza tu Perfil");
    private JTextField txtNombre = new JTextField();
    private JTextField txtCorreo = new JTextField();
    private JTextField txtTelefono = new JTextField();
    private JTextField txtDireccion = new JTextField();
    private JTextField txtSitioWeb = new JTextField();
    
    
    
    private JPanel pnlDatos = new JPanel(new GridLayout(5,1,0,10));
    
    public Ventana(){
        this.setSize(dmVentana);
        this.setTitle("Mi Perfil");
        this.add(lblTitulo , BorderLayout.NORTH);
        lblTitulo.setBackground(new Color(48,132,188));
        lblTitulo.setOpaque(true);
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 10));
        lblTitulo.setFont(new Font("Calibri",Font.BOLD,22));
        lblTitulo.setForeground(Color.white);
        
        
        pnlDatos.add(txtNombre);
        txtNombre.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(48,132,188)));
        pnlDatos.add(txtCorreo);
        txtCorreo.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(48,132,188)));
        pnlDatos.add(txtTelefono);
        txtTelefono.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(48,132,188)));
        pnlDatos.add(txtDireccion);
        txtDireccion.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(48,132,188)));
        pnlDatos.add(txtSitioWeb);
        txtSitioWeb.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(48,132,188)));
        pnlDatos.setBorder(BorderFactory.createEmptyBorder(0,20,10,20));
        this.add(pnlDatos, BorderLayout.CENTER);
        
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(true);
    }
    
    public static void main(String[] args) {
        Ventana v = new Ventana();
        v.setVisible(true);
        
        
    }
}
