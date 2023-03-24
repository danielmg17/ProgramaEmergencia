/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.PacientesModel;
import Vistas.frmVistaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author danie
 */
public class PacientesController implements ActionListener{
    frmVistaPrincipal VistaPrincipal;
    PacientesModel ModeloPacientes;
    

    public PacientesController(frmVistaPrincipal VistaPrincipal, PacientesModel ModeloPacientes) {
        this.VistaPrincipal = VistaPrincipal;
        this.ModeloPacientes = ModeloPacientes;
        
        //A poner a la escucha los botones
        this.VistaPrincipal.btnIngresar.addActionListener(this);
        this.VistaPrincipal.btnIngresar.addActionListener(this);    
        
        //Levantar la vista principal
        this.VistaPrincipal.setExtendedState(frmVistaPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
        
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== this.VistaPrincipal.btnIngresar)
        {
            this.ModeloPacientes.IngresarPaciente(this.VistaPrincipal.txtApellidos.getText(), this.VistaPrincipal.txtNombre.getText(),
                    this.VistaPrincipal.txtTelefono.getText(), Integer.parseInt(this.VistaPrincipal.txtPrioridad.getText()));
            this.VistaPrincipal.jtTablaPacientes.setModel(this.ModeloPacientes.ListarPacientes());
        }
    }
    
}
