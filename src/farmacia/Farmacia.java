
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
    }
   
    
}
