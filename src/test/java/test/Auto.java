package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int CantidadCreados;
	
	int cantidadAsientos(Asiento[] asientos) {
		int cantidad;
		cantidad= this.asientos.length;	
		return cantidad;
	}
	
	
	String verificarIntegridad() {
		int x=registro;
		String mensaje;
		if (this.registro !=x) {
			mensaje="Las piezas no son originales";
		}else {
			mensaje="Auto original";
		}
		return mensaje;
	}
	

}