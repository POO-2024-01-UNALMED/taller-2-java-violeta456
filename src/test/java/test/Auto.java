package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int CantidadCreados;
	
	int cantidadAsientos() {
		int cantidad;
		Asiento[] lista= this.asientos;
		cantidad=lista.length;
		return cantidad;
	}
	
	
	String verificarIntegridad() {
		int x=this.registro;
		String mensaje;
		if (registro !=x) {
			mensaje="Las piezas no son originales";
		}else {
			mensaje="Auto original";
		}
		return mensaje;
	}
	

}
