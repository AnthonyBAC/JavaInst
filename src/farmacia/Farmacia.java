
package farmacia;
import java.util.Date;

/**
 *
 * @author anthony
 */
public class Farmacia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Medicamento m1 = new Medicamento (11, " Aspirina", "", 100, new Date());
                System.out.println(m1.toString());
        
        Cliente c1 = new Cliente ("569 8888 9999 ,", "Andre ,","Paracetamol. " );
                System.out.println(c1.toString());
        
        Proveedor_Farmacia p1 = new Proveedor_Farmacia ("001 ," , "Simi ,","Paracetamol.");
                System.out.println(p1.toString());
                
        Sistema_Gestion_Inventario s1 = new Sistema_Gestion_Inventario ("Paracetamol ,", "Andre ,", "Simi.");
                System.out.println(s1.toString());
        
       
       
    }
   
    
}
