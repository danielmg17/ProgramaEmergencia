
package Modelos;

import java.util.PriorityQueue;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author danie
 */
public class PacientesModel {
    PriorityQueue <Pacientes> ListaPacientes = new PriorityQueue<Pacientes>();
    DefaultTableModel ModeloTabla = new DefaultTableModel();
    
    public void IngresarPaciente(String ape, String nom, String tel, int gra)
    {
        Pacientes nuevoPaciente = new Pacientes(ape, nom, tel, gra);
        ListaPacientes.add(nuevoPaciente);        
    }
    
    public DefaultTableModel des()
    {
        this.ModeloTabla.setRowCount(0);
        return ModeloTabla;
    }
    
    public DefaultTableModel ListarPacientes()
    {             
        for(Pacientes MiListaDePacientes: ListaPacientes)
        {
            //System.out.println(MiListaDePacientes.getApellidos());
            ModeloTabla.addRow(new Object[]{MiListaDePacientes.getApellidos(), MiListaDePacientes.getNombre(),
            MiListaDePacientes.getTelefono(), MiListaDePacientes.getGravedad()});
        }
        
        return ModeloTabla;            
    }
    
    public DefaultTableModel nomColumna()
    {         
        ModeloTabla.addColumn("APELLIDOS");
        ModeloTabla.addColumn("NOMBRE");
        ModeloTabla.addColumn("TELEFONO");
        ModeloTabla.addColumn("GRAVEDAD");
       
        return ModeloTabla;
    }
    
    public void Descolar()
    {
        this.ListaPacientes.poll();
    }
}
