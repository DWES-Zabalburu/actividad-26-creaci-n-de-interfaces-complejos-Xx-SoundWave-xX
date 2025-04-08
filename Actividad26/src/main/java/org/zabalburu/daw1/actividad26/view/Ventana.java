/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.actividad26.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
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
    
    private JLabel lblNombre = new JLabel("Nombre Completo");
    private JTextField txtNombre = new JTextField();
    private JLabel lblCorreo = new JLabel("Correo Electronico");
    private JTextField txtCorreo = new JTextField();
    private JLabel lblTelefono = new JLabel("Telefono");
    private JTextField txtTelefono = new JTextField();
    private JLabel lblDireccion = new JLabel("Direccion");
    private JTextField txtDireccion = new JTextField();
    private JLabel lblSitioWeb = new JLabel("Sitio Web");
    private JTextField txtSitioWeb = new JTextField();
    
    private JButton btnGuardarCambios = new JButton("Guardar Cambios");
    private JButton btnCancelar = new JButton("Cancelar");
    
    
    
    private JPanel pnlDatos = new JPanel(new GridLayout(10,1,5,10));
    private JPanel pnlBotones = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    
    public Ventana(){
        this.setSize(dmVentana);
        this.setTitle("Mi Perfil");
        this.add(lblTitulo , BorderLayout.NORTH);
        lblTitulo.setBackground(new Color(48,132,188));
        lblTitulo.setOpaque(true);
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));
        lblTitulo.setFont(new Font("Calibri",Font.BOLD,22));
        lblTitulo.setForeground(Color.white);
        
        pnlDatos.add(lblNombre);
        pnlDatos.add(txtNombre);
        txtNombre.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(48,132,188)));
        pnlDatos.add(lblCorreo);
        pnlDatos.add(txtCorreo);
        txtCorreo.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(48,132,188)));
        pnlDatos.add(lblTelefono);
        pnlDatos.add(txtTelefono);
        txtTelefono.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(48,132,188)));
        pnlDatos.add(lblDireccion);
        pnlDatos.add(txtDireccion);
        txtDireccion.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(48,132,188)));
        pnlDatos.add(lblSitioWeb);
        pnlDatos.add(txtSitioWeb);
        txtSitioWeb.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(48,132,188)));
        pnlDatos.setBorder(BorderFactory.createEmptyBorder(0,20,10,20));
        this.add(pnlDatos, BorderLayout.CENTER);
        
        
        btnCancelar.setFont(new Font("Calibri",Font.BOLD,14));
        btnCancelar.setBackground(new Color(192,196,196));
        btnCancelar.setForeground(Color.white);
        btnCancelar.setBorder(BorderFactory.createEmptyBorder(10,20,5,20));
        btnGuardarCambios.setFont(new Font("Calibri",Font.BOLD,14));
        btnGuardarCambios.setBackground(new Color(48,132,188));
        btnGuardarCambios.setForeground(Color.white);
        btnGuardarCambios.setBorder(BorderFactory.createEmptyBorder(10,20,5,20));
        pnlBotones.add(btnCancelar);
        pnlBotones.add(btnGuardarCambios);
        pnlBotones.setBorder(BorderFactory.createEmptyBorder(0,0,0,20));
        this.add(pnlBotones, BorderLayout.SOUTH);
        
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(true);
    }
    
    public static void main(String[] args) {
        Ventana v = new Ventana();
        v.setVisible(true);
        
        
    }
}
