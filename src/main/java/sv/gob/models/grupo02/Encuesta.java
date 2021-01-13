package sv.gob.models.grupo02;

public class Encuesta {
	private String id;
	private String ubicacion;
	private String domicilio;
	private String mes;
	private String fecha;
	private String hora;
	private String nombre;
	private String grupo;
	private String estado;
	
	public Encuesta() {}
	
	public Encuesta(String id,String fecha,String nombre)
	{
		setId(id);
		setFecha(fecha);
		setNombre(nombre);
	}
	
	public Encuesta(String id,String ubicacion,String grupo,String mes,String estado)
	{
		setId(id);
		setUbicacion(ubicacion);
		setGrupo(grupo);
		setMes(mes);
		setEstado(estado);
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
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
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
