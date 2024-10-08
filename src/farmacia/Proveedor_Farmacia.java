/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmacia;

/**
 *
 * @author anthony
 */
public class Proveedor_Farmacia {
    
    private String codigoProveedor;
    private String nombreProveedor;
    private String medicamentoSuministrado;

    public Proveedor_Farmacia(String codigoProveedor, String nombreProveedor, String medicamentoSuministrado) {
        this.codigoProveedor = codigoProveedor;
        this.nombreProveedor = nombreProveedor;
        this.medicamentoSuministrado = medicamentoSuministrado;
    }

    public String getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(String codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getMedicamentoSuministrado() {
        return medicamentoSuministrado;
    }

    public void setMedicamentoSuministrado(String medicamentoSuministrado) {
        this.medicamentoSuministrado = medicamentoSuministrado;
    }
    
    @Override
    public String toString() {
        return "Datos Proveedor : " + "Nombre Proveedor = " + nombreProveedor + "Codigo Proveedor = " + codigoProveedor + "Medicamento Suministrado = " + medicamentoSuministrado; 
    }
}
