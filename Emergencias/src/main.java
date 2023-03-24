
import Controladores.PacientesController;
import Modelos.PacientesModel;
import Vistas.frmVistaPrincipal;


public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        frmVistaPrincipal Vista = new frmVistaPrincipal();
        PacientesModel VistaModelo = new PacientesModel();
        PacientesController ControladorLista = new PacientesController(Vista, VistaModelo);
        
    }
    
}
