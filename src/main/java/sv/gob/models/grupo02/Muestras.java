package sv.gob.models.grupo02;

public class Muestras {
	private String identificacion;
	private String zona;
	private String departamento;
	private String municipio;
	private String domicilio;
	private String mes;
	
	public Muestras() {}
	
	public Muestras(String identificacion, String zona, String departamento, String municipio, String domicilio,
			String mes) {
		setIdentificacion(identificacion);
		setZona(zona);
		setDepartamento(departamento);
		setMunicipio(municipio);
		setDomicilio(domicilio);
		setMes(mes);
	}
	
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
}
