
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
    
    public DefaultTableModel ListarPacientes()
    {
        this.ModeloTabla.addColumn("APELLIDOS");
        this.ModeloTabla.addColumn("NOMBRE");
        this.ModeloTabla.addColumn("TELEFONO");
        this.ModeloTabla.addColumn("GRAVEDAD");
        
        
        for(Pacientes MiListaDePacientes: ListaPacientes)
        {
            //System.out.println(MiListaDePacientes.getApellidos());
            this.ModeloTabla.addRow(new Object[]{MiListaDePacientes.getApellidos(), MiListaDePacientes.getNombre(),
            MiListaDePacientes.getTelefono(), MiListaDePacientes.getGravedad()});
        }
        
        return ModeloTabla;            
    }
}
