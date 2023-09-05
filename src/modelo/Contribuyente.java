package modelo;

public class Contribuyente {
private int  idContribuyente;
private String apellido;
private String nombre;
private long dni;
private char sexo;
private String cuil;
public int getIdContribuyente() {
	return idContribuyente;
}
public void setIdContribuyente(int idContribuyente) {
	this.idContribuyente = idContribuyente;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public long getDni() {
	return dni;
}
public void setDni(long dni) {
	this.dni = dni;
}
public char getSexo() {
	return sexo;
}
public void setSexo(char sexo) {
	this.sexo = sexo;
}
public String getCuil() {
	return cuil;
}
public void setCuil(String cuil) {
	this.cuil = cuil;
}
public Contribuyente(int idContribuyente, String apellido, String nombre, long dni, char sexo, String cuil) {
	super();
	this.idContribuyente = idContribuyente;
	this.apellido = apellido;
	this.nombre = nombre;
	this.dni = dni;
	this.sexo = sexo;
	this.cuil = cuil;
}

public boolean validarSexo (char sexo) throws Exception {
	if( sexo=='m'|| sexo=='f'||sexo=='F'||sexo=='M') {
		return true;

	}
	else {
		throw new Exception("Error:al ingresar el sexo");
		
	}
}



}
