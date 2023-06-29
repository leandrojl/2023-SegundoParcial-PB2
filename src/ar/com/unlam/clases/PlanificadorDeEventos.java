package ar.com.unlam.clases;
import java.util.HashSet;

import ar.com.unlam.eventos.Cumple;
import ar.com.unlam.eventos.Evento;
import ar.com.unlam.excepciones.EventoNoEncontradoException;
import ar.com.unlam.excepciones.UsuarioNoInvitadoException;

public class PlanificadorDeEventos {
	
	private String nombre;
	private Usuario usuarioOrganizador;
	private HashSet<Evento> eventos;
	private HashSet<Usuario> usuarios;
	private HashSet<Usuario> invitadosConfirmados;

	public PlanificadorDeEventos(String nombre) {
		super();
		this.nombre = nombre;
		this.eventos = new HashSet<Evento>();
		this.usuarios = new HashSet<Usuario>();
		this.invitadosConfirmados = new HashSet<Usuario>();
	}
	
	public PlanificadorDeEventos() {
		this.eventos = new HashSet<Evento>();
		this.usuarios = new HashSet<Usuario>();
		this.usuarios = new HashSet<Usuario>();
		this.invitadosConfirmados = new HashSet<Usuario>();
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

	public void agregarUsuarioALaListaDeUsuarios(Usuario usuario){
		
		this.usuarios.add(usuario);
		
	}

	

	public void invitarUsuario(Evento nuevoCumple, Usuario usuarioInvitado) throws EventoNoEncontradoException {
		Evento evento = buscarEvento(nuevoCumple);
		
		evento.getListaInvitados().add(usuarioInvitado);
		
	}

	private Evento buscarEvento(Evento nuevoCumple) throws EventoNoEncontradoException {
		for(Evento evento: eventos) {
			if(evento.getNombre().equals(nuevoCumple.getNombre())) {
				return evento;
			}
		}
		throw new EventoNoEncontradoException("Evento no encontrado");
	}

	public void confirmarInvitacion(Cumple nuevoCumple, Usuario usuarioInvitado) throws EventoNoEncontradoException, UsuarioNoInvitadoException {
		Evento evento = buscarEvento(nuevoCumple);
		Usuario usuario = buscarUsuario(usuarioInvitado);
		this.invitadosConfirmados.add(usuario);
	}

	private Usuario buscarUsuario(Usuario usuarioInvitado) throws UsuarioNoInvitadoException {
		for(Usuario usuario: usuarios) {
			if(usuario.getNombre().equals(usuarioInvitado.getNombre())) {
				return usuario;
			}
		}
		throw new UsuarioNoInvitadoException("Usuario no invitado");
	}

	public HashSet<Usuario> getInvitadosConfirmados() {
		return invitadosConfirmados;
	}

	public void setInvitadosConfirmados(HashSet<Usuario> invitadosConfirmados) {
		this.invitadosConfirmados = invitadosConfirmados;
	}
	
	

}
