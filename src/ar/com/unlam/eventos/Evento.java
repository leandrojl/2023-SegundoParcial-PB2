package ar.com.unlam.eventos;

import java.util.Objects;
import java.util.TreeSet;

import ar.com.unlam.clases.Persona;

public class Evento implements Comparable<Persona>{
	
	private String nombre;
	private TreeSet<Persona> listaInvitados;

	public Evento(String nombre) {
		super();
		this.setNombre(nombre);
		this.listaInvitados = new TreeSet<Persona>();
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

	public TreeSet<Persona> getListaInvitados() {
		return listaInvitados;
	}

	public void setListaInvitados(TreeSet<Persona> listaInvitados) {
		this.listaInvitados = listaInvitados;
	}

	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	

}
