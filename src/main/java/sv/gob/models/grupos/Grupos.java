package sv.gob.models.grupos;

import javax.validation.constraints.Pattern;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "grupos")
public class Grupos {
	
	@Id
	private String id;
	@Pattern(regexp = "^[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ0-9 ]+$")
	private String codigoGrupos;
	@Pattern(regexp = "^[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ0-9 ]+$")
	private String nombreGrupos;
	@Pattern(regexp = "^[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ0-9 ]+$")
	private String zonaDeOperacionGrupos;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCodigoGrupos() {
		return codigoGrupos;
	}
	public void setCodigoGrupos(String codigoGrupos) {
		this.codigoGrupos = codigoGrupos;
	}
	public String getNombreGrupos() {
		return nombreGrupos;
	}
	public void setNombreGrupos(String nombreGrupos) {
		this.nombreGrupos = nombreGrupos;
	}

	public String getZonaDeOperacionGrupos() {
		return zonaDeOperacionGrupos;
	}
	public void setZonaDeOperacionGrupos(String zonaDeOperacionGrupos) {
		this.zonaDeOperacionGrupos = zonaDeOperacionGrupos;
	}
	@Override
	public String toString() {
		return "Grupos [id=" + id + ", codigoGrupos=" + codigoGrupos + ", nombreGrupos=" + nombreGrupos
				+ ", zonaDeOperacionGrupos=" + zonaDeOperacionGrupos + "]";
	}
	
}
