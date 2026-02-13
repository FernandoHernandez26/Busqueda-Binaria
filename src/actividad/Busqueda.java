package actividad;

public class Busqueda {

	public int buscar(int[]cajaNum, int numero ) {
		
		for (int i=0;i< cajaNum.length;i++) {
			if (cajaNum[i] == numero ) {
				return i;
			}
			 
		}
	return -1;
	}

	
}
