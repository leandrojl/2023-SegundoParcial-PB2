package ar.com.unlam.clases;

import java.util.Objects;

public class Usuario {
	
	private String mailOrganizador;
	private String nombreOrganizador;
	private Integer edadOrganizador;
	
	public Usuario(String mailOrganizador, String nombreOrganizador, Integer edadOrganizador) {
		super();
		this.mailOrganizador = mailOrganizador;
		this.nombreOrganizador = nombreOrganizador;
		this.edadOrganizador = edadOrganizador;
	}

	public String getMailOrganizador() {
		return mailOrganizador;
	}

	public void setMailOrganizador(String mailOrganizador) {
		this.mailOrganizador = mailOrganizador;
	}

	public String getNombreOrganizador() {
		return nombreOrganizador;
	}

	public void setNombreOrganizador(String nombreOrganizador) {
		this.nombreOrganizador = nombreOrganizador;
	}

	public Integer getEdadOrganizador() {
		return edadOrganizador;
	}

	public void setEdadOrganizador(Integer edadOrganizador) {
		this.edadOrganizador = edadOrganizador;
	}

	@Override
	public int hashCode() {
		return Objects.hash(mailOrganizador);
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
		return Objects.equals(mailOrganizador, other.mailOrganizador);
	}

	

}
