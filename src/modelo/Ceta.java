package modelo;
import java.util.GregorianCalendar;

public class Ceta {
private int idCeta;
private GregorianCalendar fecha;
private Contribuyente vendedor;
private Contribuyente comprador;
private double valorDetransferencia;
private boolean firmaComprador;

public Ceta(int idCeta, GregorianCalendar fecha, Contribuyente vendedor, Contribuyente comprador,
		double valorDetransferencia, boolean firmaComprador) {
	super();
	this.idCeta = idCeta;
	this.fecha = fecha;
	this.vendedor = vendedor;
	this.comprador = comprador;
	this.valorDetransferencia = valorDetransferencia;
	this.firmaComprador = firmaComprador;
}
public Ceta() {
	super();
}
public int getIdCeta() {
	return idCeta;
}
public void setIdCeta(int idCeta) {
	this.idCeta = idCeta;
}
public GregorianCalendar getFecha() {
	return fecha;
}
public void setFecha(GregorianCalendar fecha) {
	this.fecha = fecha;
}
public Contribuyente getVendedor() {
	return vendedor;
}
public void setVendedor(Contribuyente vendedor) {
	this.vendedor = vendedor;
}
public Contribuyente getComprador() {
	return comprador;
}
public void setComprador(Contribuyente comprador) {
	this.comprador = comprador;
}
public double getValorDetransferencia() {
	return valorDetransferencia;
}
public void setValorDetransferencia(double valorDetransferencia) {
	this.valorDetransferencia = valorDetransferencia;
}
public boolean isFirmaComprador() {
	return firmaComprador;
}
public void setFirmaComprador(boolean firmaComprador) {
	this.firmaComprador = firmaComprador;
}

//+ validarSexo (char sexo) : boolean




}
