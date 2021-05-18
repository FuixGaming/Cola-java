
public class Puesto {

	private String identificador;
	private ColaUsuario usuario;
	
	public Puesto(String identificador) {
		this.identificador = identificador;
		this.usuario = null;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public ColaUsuario getUsuario() {
		return usuario;
	}

	public void atender(ColaUsuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Puesto= " + identificador + ", usuario=" + usuario.toString();
	}
	
	public boolean libre() {
		return this.usuario == null;
	}
	
	public void eliminar() {
		this.usuario= null;
	}
	
	public void tiempo(int segundos) {
		int tiempo = this.usuario.getEstimacionDemanda();
		tiempo = tiempo-segundos;
		this.usuario.setEstimacionDemanda(tiempo);
	}
	
	
}
