package sv.gob.models.Cuestionario;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "seccion")
public class Seccion {
	
	@Id
	private String id;
	@Pattern(regexp = "^[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ0-9 ]+$")
	private String codigoSeccion;
	@Pattern(regexp = "^[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ0-9 ]+$")
	private String nombreSeccion;
	@Pattern(regexp = "^[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ0-9 ]+$")
	private String descripcionSeccion;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCodigoSeccion() {
		return codigoSeccion;
	}
	public void setCodigoSeccion(String codigoSeccion) {
		this.codigoSeccion = codigoSeccion;
	}
	public String getNombreSeccion() {
		return nombreSeccion;
	}
	public void setNombreSeccion(String nombreSeccion) {
		this.nombreSeccion = nombreSeccion;
	}
	public String getDescripcionSeccion() {
		return descripcionSeccion;
	}
	public void setDescripcionSeccion(String descripcionSeccion) {
		this.descripcionSeccion = descripcionSeccion;
	}
	@Override
	public String toString() {
		return "Seccion [id=" + id + ", codigoSeccion=" + codigoSeccion + ", nombreSeccion="
				+ nombreSeccion + ", descripcionSeccion=" + descripcionSeccion + "]";
	}

	
	

}
