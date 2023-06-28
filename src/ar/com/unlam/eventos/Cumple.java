package ar.com.unlam.eventos;

import ar.com.unlam.clases.UsuarioAgasajado;

public class Cumple extends Evento{
	
	private UsuarioAgasajado cumpla�ero;
	
	public Cumple(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}
	
	public Cumple(UsuarioAgasajado usuarioAgasajado) {
		this.setCumpla�ero(usuarioAgasajado);
	}

	public Cumple(String nombreEvento, UsuarioAgasajado usuarioAgasajado) {
		super(nombreEvento);
		this.setCumpla�ero(usuarioAgasajado);
	}
	
	public Cumple() {
			
	}

	public UsuarioAgasajado getCumpla�ero() {
		return cumpla�ero;
	}

	public void setCumpla�ero(UsuarioAgasajado cumpla�ero) {
		this.cumpla�ero = cumpla�ero;
	}

	

	
}
