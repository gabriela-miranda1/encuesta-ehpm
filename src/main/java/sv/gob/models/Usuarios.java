package sv.gob.models;

public class Usuarios {
	
	private String codigo;
	private String apellidos;
	private String nombres;
	private String correo;
	private String dui;
	private String rol;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getDui() {
		return dui;
	}
	public void setDui(String dui) {
		this.dui = dui;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	@Override
	public String toString() {
		return "Usuarios [codigo=" + codigo + ", apellidos=" + apellidos + ", nombres=" + nombres + ", correo=" + correo
				+ ", dui=" + dui + ", rol=" + rol + "]";
	}
	
	

}
