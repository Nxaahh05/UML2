package Ferreteria;

public class Trabajador {

	private String DNI;
	private int Tlfno;
	private double sueldo;
	private String Direccion;
	public Trabajador(String dNI, int tlfno, double sueldo, String direccion) {
		super();
		DNI = dNI;
		Tlfno = tlfno;
		this.sueldo = sueldo;
		Direccion = direccion;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public int getTlfno() {
		return Tlfno;
	}
	public void setTlfno(int tlfno) {
		Tlfno = tlfno;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	@Override
	public String toString() {
		return "Trabajador [DNI=" + DNI + ", Tlfno=" + Tlfno + ", sueldo=" + sueldo + ", Direccion=" + Direccion + "]";
	}
	
	

}
