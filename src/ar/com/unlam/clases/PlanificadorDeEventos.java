package ar.com.unlam.clases;
import java.util.HashSet;

import ar.com.unlam.eventos.Cumple;
import ar.com.unlam.eventos.Evento;

public class PlanificadorDeEventos {
	
	private String nombre;
	private Usuario usuarioOrganizador;
	private HashSet<Evento> eventos;
	private HashSet<Usuario> usuarios;

	public PlanificadorDeEventos(String nombre) {
		super();
		this.nombre = nombre;
		this.eventos = new HashSet<Evento>();
		this.usuarios = new HashSet<Usuario>();
	}
	
	public PlanificadorDeEventos() {
		this.eventos = new HashSet<Evento>();
		this.usuarios = new HashSet<Usuario>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public HashSet<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(HashSet<Evento> eventos) {
		this.eventos = eventos;
	}

	public Usuario getUsuarioOrganizador() {
		return usuarioOrganizador;
	}

	public void setUsuarioOrganizador(Usuario usuarioOrganizador) {
		this.usuarioOrganizador = usuarioOrganizador;
	}


	public void agregarEvento(Evento nuevoCumple) {
		this.eventos.add(nuevoCumple);
		
	}

	public HashSet<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(HashSet<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public void agregarUsuarioALaListaDeUsuarios(Usuario usuario) {
		this.usuarios.add(usuario);
		
	}
	
	

}
