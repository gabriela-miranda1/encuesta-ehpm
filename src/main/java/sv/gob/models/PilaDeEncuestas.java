package sv.gob.models;

public class PilaDeEncuestas {
	
	private String identificacion;
	private String ubicacionGeografica;
	private String domicilio;
	private String mes;
	/**
	 * @return the identificacion
	 */
	public String getIdentificacion() {
		return identificacion;
	}
	/**
	 * @param identificacion the identificacion to set
	 */
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	/**
	 * @return the ubicacionGeografica
	 */
	public String getUbicacionGeografica() {
		return ubicacionGeografica;
	}
	/**
	 * @param ubicacionGeografica the ubicacionGeografica to set
	 */
	public void setUbicacionGeografica(String ubicacionGeografica) {
		this.ubicacionGeografica = ubicacionGeografica;
	}
	/**
	 * @return the domicilio
	 */
	public String getDomicilio() {
		return domicilio;
	}
	/**
	 * @param domicilio the domicilio to set
	 */
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	/**
	 * @return the mes
	 */
	public String getMes() {
		return mes;
	}
	/**
	 * @param mes the mes to set
	 */
	public void setMes(String mes) {
		this.mes = mes;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PilaDeEncuestas [identificacion=" + identificacion + ", ubicacionGeografica=" + ubicacionGeografica
				+ ", domicilio=" + domicilio + ", mes=" + mes + "]";
	}
	
	

}
