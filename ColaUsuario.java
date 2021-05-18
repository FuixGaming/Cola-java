
public class ColaUsuario {

	private NodoCola entrada;
	private NodoCola salida;
	
	public ColaUsuario(String idUsuario, int estimacionDemanda) {
		NodoCola aux = new NodoCola(idUsuario, estimacionDemanda, null);
		entrada = aux;
		salida = aux;
	}
	
	public String getIdUsuario() {
		return this.salida.getIdUsuario();
	}
	
	public int getEstimacionDemanda() {
		return this.salida.getEstimacionDemanda();
	}
	
	public void setIdUsuario(String idUsuario) {
		this.salida.setIdUsuario(idUsuario);
	}
	
	public void setEstimacionDemanda(int estimacionDemanda) {
		this.salida.setEstimacionDemanda(estimacionDemanda);
	}
	
	public void inicializar() {
		entrada = null;
		salida = null;
	}
	
	public boolean colaVacia() {
		if(entrada == null && salida == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public ColaUsuario leer() {
		return this;
	}
	
	public ColaUsuario sacar() {
		ColaUsuario aux = new ColaUsuario(salida.getIdUsuario(), 
										salida.getEstimacionDemanda());
		this.eliminar();
		return aux;
	}
	
	public void eliminar() {
		NodoCola auxNodo = this.entrada;
		while(auxNodo.getSiguiente() != this.salida) {
			auxNodo = auxNodo.getSiguiente();
		}
		this.salida = auxNodo;
		this.salida.setSiguiente(null);
	}
	
	public void encolar(ColaUsuario nuevoUsuario) {
		NodoCola aux = new NodoCola(nuevoUsuario.getIdUsuario(),nuevoUsuario.getEstimacionDemanda(), this.entrada);
		this.entrada = aux;
	}
	
	public int longitud() {
		int contador = 0;
		NodoCola aux = this.entrada;
		while(aux != null) {
			contador++;
			aux.getSiguiente();
		}
		return contador;
	}
	
	public int tiempoAcumulado() {
		int contador = 0;
		NodoCola aux = this.entrada;
		while(aux != null) {
			contador += aux.getEstimacionDemanda();
			aux.getSiguiente();
		}
		return contador;
	}
	
	public String toString() {
		return this.salida.toString();
	}
	
	public String imprimir() {
		String cadenaSalida = "";
		NodoCola aux = this.entrada;
		while(aux != null) {
			cadenaSalida += aux.toString()+"\n";
			aux.getSiguiente();
		}
		return cadenaSalida;
	}
}
