package Ferreteria;

public class Cliente {

private boolean socio;
private int telefono;
private String Direccion;
public Cliente(boolean socio, int telefono, String direccion) {
	super();
	this.socio = socio;
	this.telefono = telefono;
	Direccion = direccion;
}
public boolean isSocio() {
	return socio;
}
public void setSocio(boolean socio) {
	this.socio = socio;
}
public int getTelefono() {
	return telefono;
}
public void setTelefono(int telefono) {
	this.telefono = telefono;
}
public String getDireccion() {
	return Direccion;
}
public void setDireccion(String direccion) {
	Direccion = direccion;
}
@Override
public String toString() {
	return "Cliente [socio=" + socio + ", telefono=" + telefono + ", Direccion=" + Direccion + "]";
}



}
