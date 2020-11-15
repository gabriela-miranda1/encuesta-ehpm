package sv.gob.models;

public class Asignacion02 {
	
	private String nombre;
	private String estado;
	private int correlativo;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCorrelativo() {
		return correlativo;
	}
	public void setCorrelativo(int correlativo) {
		this.correlativo = correlativo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Descripcion [nombre=" + nombre + ", estado=" + estado + ", correlativo=" + correlativo + "]";
	}

}
