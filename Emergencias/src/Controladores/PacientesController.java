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
        this.VistaPrincipal.btnAtender.addActionListener(this);
        
        
        //Levantar la vista principal
        this.VistaPrincipal.setExtendedState(frmVistaPrincipal.MAXIMIZED_VERT);
        this.VistaPrincipal.setVisible(true);
        
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== this.VistaPrincipal.btnIngresar){
            if(this.VistaPrincipal.jtTablaPacientes.getColumnCount()==0)
            {
                this.VistaPrincipal.jtTablaPacientes.setModel(this.ModeloPacientes.nomColumna());
            }
            
            this.ModeloPacientes.des();

            this.ModeloPacientes.IngresarPaciente(this.VistaPrincipal.txtApellidos.getText(), this.VistaPrincipal.txtNombre.getText(),
                    this.VistaPrincipal.txtTelefono.getText(), Integer.parseInt(this.VistaPrincipal.txtPrioridad.getText()));           
           
            this.VistaPrincipal.jtTablaPacientes.setModel(this.ModeloPacientes.ListarPacientes());
            this.VistaPrincipal.txtApellidos.setText("");
            this.VistaPrincipal.txtNombre.setText("");
            this.VistaPrincipal.txtTelefono.setText("");
            this.VistaPrincipal.txtPrioridad.setText("");
        }  
               
        if(e.getSource()== this.VistaPrincipal.btnAtender)
        {
            this.ModeloPacientes.Descolar();
            this.ModeloPacientes.des();
            this.VistaPrincipal.jtTablaPacientes.setModel(this.ModeloPacientes.ListarPacientes());
            
        }
       }    
    }


