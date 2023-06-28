package ar.com.unlam.eventos;

import ar.com.unlam.clases.UsuarioAgasajado;

public class Cumple extends Evento{
	
	private UsuarioAgasajado cumplañero;
	
	public Cumple(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}
	
	public Cumple(UsuarioAgasajado usuarioAgasajado) {
		this.setCumplañero(usuarioAgasajado);
	}

	public Cumple(String nombreEvento, UsuarioAgasajado usuarioAgasajado) {
		super(nombreEvento);
		this.setCumplañero(usuarioAgasajado);
	}
	
	public Cumple() {
			
	}

	public UsuarioAgasajado getCumplañero() {
		return cumplañero;
	}

	public void setCumplañero(UsuarioAgasajado cumplañero) {
		this.cumplañero = cumplañero;
	}

	

	
}
