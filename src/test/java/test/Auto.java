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
		int cantidad = 0;
		for(int i=0; i<asientos.length;i++) {
			if (asientos[i] !=null) {
				cantidad++;
			}
		}
		return cantidad;
	}
	
	
	String verificarIntegridad() {
		String mensaje;
		int a=registro;
		int b=this.motor.registro;
		
		if(a==b) {
			for(int i=0; i<asientos.length;i++) {
				if (asientos[i] !=null) {
					int c=asientos[i].registro;
					if(c!=b || c!=a) {
						return mensaje="Las piezas no son originales"; }//fin if
				} 
		} 
			return mensaje="Auto original";		
		}
		return mensaje="Las piezas no son originales";

	}
	

}
