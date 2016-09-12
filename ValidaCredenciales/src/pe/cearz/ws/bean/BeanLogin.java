package pe.cearz.ws.bean;

import java.io.Serializable;

public class BeanLogin implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 3548971205560745324L;
	private String usuario;
	private String password;
	private String mensaje;
	private boolean status;
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	

}
