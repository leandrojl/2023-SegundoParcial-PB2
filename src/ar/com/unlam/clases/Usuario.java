package ar.com.unlam.clases;

import java.util.Objects;

public class Usuario implements Comparable<Usuario>{
	
	private String mail;
	private String nombre;
	private Integer edad;
	
	public Usuario(String mail, String nombre, Integer edad) {
		super();
		this.mail = mail;
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getMail() {
		return mail;
	}



	public void setMail(String mail) {
		this.mail = mail;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Integer getEdad() {
		return edad;
	}



	public void setEdad(Integer edad) {
		this.edad = edad;
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

	

	@Override
	public int compareTo(Usuario otroUsuario) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(otroUsuario.nombre);
	}

	

}
