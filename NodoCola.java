
public class NodoCola {

	private String idUsuario;
	private int estimacionDemanda;
	private NodoCola siguiente;
	
	public NodoCola(String idUsuario, int estimacionDemanda, NodoCola siguiente) {
		super();
		this.idUsuario = idUsuario;
		this.estimacionDemanda = estimacionDemanda;
		this.siguiente = siguiente;
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getEstimacionDemanda() {
		return estimacionDemanda;
	}

	public void setEstimacionDemanda(int estimacionDemanda) {
		this.estimacionDemanda = estimacionDemanda;
	}

	public NodoCola getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoCola siguiente) {
		this.siguiente = siguiente;
	}

	@Override
	public String toString() {
		return "idUsuario=" + idUsuario + ", estimacionDemanda=" + estimacionDemanda;
	}
	
	
	
	
}
