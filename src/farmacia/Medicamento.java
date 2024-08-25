
package farmacia;

import java.util.Date;

/**
 *
 * @author anthony
 */
public class Medicamento {
    private int codigo;
    private String nombre;
    private String  tipo;
    private int stock;
    private Date caducidad;
    
    //constructores 
    public Medicamento(){}
    
    public Medicamento(int codigo, String nombre, String tipo, int stock, Date caducidad){
    this.codigo = codigo;
    this.nombre = nombre;
    this.tipo = tipo;
    this.stock = stock;
    this.caducidad = caducidad;
    
    }
    
    //Accesadores

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Date getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(Date caducidad) {
        this.caducidad = caducidad;
    }

    @Override
    public String toString() {
        return "Medicamento" + "codigo =" + codigo + ", nombre =" + nombre + ", tipo =" + tipo + ", stock =" + stock + ", caducidad =" + caducidad ;
    }
    
    
    
}
    
