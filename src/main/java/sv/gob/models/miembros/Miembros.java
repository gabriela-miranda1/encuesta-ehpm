package sv.gob.models.miembros;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "miembros")
public class Miembros {
	
	@Id
	private String id;
	private String codigoMiembros;
	private String nombreMiembros;
	private String apellidoMiembros;
	private String correoMiembros;
	private String duiMiembros;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCodigoMiembros() {
		return codigoMiembros;
	}
	public void setCodigoMiembros(String codigoMiembros) {
		this.codigoMiembros = codigoMiembros;
	}
	public String getNombreMiembros() {
		return nombreMiembros;
	}
	public void setNombreMiembros(String nombreMiembros) {
		this.nombreMiembros = nombreMiembros;
	}
	public String getApellidoMiembros() {
		return apellidoMiembros;
	}
	public void setApellidoMiembros(String apellidoMiembros) {
		this.apellidoMiembros = apellidoMiembros;
	}
	public String getCorreoMiembros() {
		return correoMiembros;
	}
	public void setCorreoMiembros(String correoMiembros) {
		this.correoMiembros = correoMiembros;
	}
	public String getDuiMiembros() {
		return duiMiembros;
	}
	public void setDuiMiembros(String duiMiembros) {
		this.duiMiembros = duiMiembros;
	}
	@Override
	public String toString() {
		return "Miembros [id=" + id + ", codigoMiembros=" + codigoMiembros + ", nombreMiembros=" + nombreMiembros
				+ ", apellidoMiembros=" + apellidoMiembros + ", correoMiembros=" + correoMiembros + ", duiMiembros="
				+ duiMiembros + "]";
	}
	
	

}
