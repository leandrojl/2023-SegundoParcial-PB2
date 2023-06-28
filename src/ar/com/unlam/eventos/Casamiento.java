package ar.com.unlam.eventos;

import ar.com.unlam.clases.UsuarioAgasajado;

public class Casamiento extends Evento{
	
	private UsuarioAgasajado usuarioAgasajado1;
	private UsuarioAgasajado usuarioAgasajado2;

	public Casamiento(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}
	
	public Casamiento() {
		
	}

	public Casamiento(String nombreEvento, UsuarioAgasajado usuarioAgasajado1, UsuarioAgasajado usuarioAgasajado2) {
		super(nombreEvento);
		this.usuarioAgasajado1 = usuarioAgasajado1;
		this.usuarioAgasajado2 = usuarioAgasajado2;
	}

	public UsuarioAgasajado getUsuarioAgasajado1() {
		return usuarioAgasajado1;
	}

	public void setUsuarioAgasajado1(UsuarioAgasajado usuarioAgasajado) {
		this.usuarioAgasajado1 = usuarioAgasajado;
	}

	public UsuarioAgasajado getUsuarioAgasajado2() {
		return usuarioAgasajado2;
	}

	public void setUsuarioAgasajado2(UsuarioAgasajado usuarioAgasajado) {
		this.usuarioAgasajado2 = usuarioAgasajado;
	}
	
	

}
