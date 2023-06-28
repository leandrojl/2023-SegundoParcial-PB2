package ar.com.unlam.eventos;

import java.util.Objects;
import java.util.TreeSet;


import ar.com.unlam.clases.Usuario;

public class Evento {
	
	private String nombre;
	private TreeSet<Usuario> listaInvitados;

	public Evento(String nombre) {
		super();
		this.setNombre(nombre);
		this.listaInvitados = new TreeSet<Usuario>();
	}
	
	public Evento() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
		Evento other = (Evento) obj;
		return Objects.equals(nombre, other.nombre);
	}

	public TreeSet<Usuario> getListaInvitados() {
		return listaInvitados;
	}

	public void setListaInvitados(TreeSet<Usuario> listaInvitados) {
		this.listaInvitados = listaInvitados;
	}

	

	
	
	

}
