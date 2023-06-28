package ar.com.unlam.clases;

import java.util.Objects;

public class Usuario {
	
	private String mail;
	private String nombre;
	private Integer edad;
	
	public Usuario(String mailOrganizador, String nombreOrganizador, Integer edadOrganizador) {
		super();
		this.setMail(mailOrganizador);
		this.nombre = nombreOrganizador;
		this.edad = edadOrganizador;
	}

	public String getMailOrganizador() {
		return nombre;
	}

	public void setMailOrganizador(String mailOrganizador) {
		this.nombre = mailOrganizador;
	}

	public String getNombreOrganizador() {
		return nombre;
	}

	public void setNombreOrganizador(String nombreOrganizador) {
		this.nombre = nombreOrganizador;
	}

	public Integer getEdadOrganizador() {
		return edad;
	}

	public void setEdadOrganizador(Integer edadOrganizador) {
		this.edad = edadOrganizador;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nombre, other.nombre);
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	

}
