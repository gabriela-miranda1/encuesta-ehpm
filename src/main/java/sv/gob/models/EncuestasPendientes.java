package sv.gob.models;

public class EncuestasPendientes {
	
	private String identificacion;
	private String direccion;
	private String encuestador;
	private String ultimaVisita;
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEncuestador() {
		return encuestador;
	}
	public void setEncuestador(String encuestador) {
		this.encuestador = encuestador;
	}
	public String getUltimaVisita() {
		return ultimaVisita;
	}
	public void setUltimaVisita(String ultimaVisita) {
		this.ultimaVisita = ultimaVisita;
	}
	@Override
	public String toString() {
		return "EncuestasPendientes [identificacion=" + identificacion + ", direccion=" + direccion + ", encuestador="
				+ encuestador + ", ultimaVisita=" + ultimaVisita + "]";
	}

	
	

}