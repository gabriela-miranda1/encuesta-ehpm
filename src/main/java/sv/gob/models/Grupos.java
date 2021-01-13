package sv.gob.models;

public class Grupos {
	
	private String codigo;
	private String nombre;
	private String zonaDeOperacion;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getZonaDeOperacion() {
		return zonaDeOperacion;
	}
	public void setZonaDeOperacion(String zonaDeOperacion) {
		this.zonaDeOperacion = zonaDeOperacion;
	}
	@Override
	public String toString() {
		return "Grupos [codigo=" + codigo + ", nombre=" + nombre + ", zonaDeOperacion=" + zonaDeOperacion + "]";
	}
	
}
