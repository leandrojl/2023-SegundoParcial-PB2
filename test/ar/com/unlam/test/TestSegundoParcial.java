package ar.com.unlam.test;

import org.junit.Assert;
import org.junit.Test;

import ar.com.unlam.clases.PlanificadorDeEventos;
import ar.com.unlam.clases.Usuario;
import ar.com.unlam.clases.UsuarioAgasajado;
import ar.com.unlam.clases.UsuarioOrganizador;
import ar.com.unlam.eventos.Casamiento;
import ar.com.unlam.eventos.Cumple;
import ar.com.unlam.excepciones.EventoNoEncontradoException;
import ar.com.unlam.excepciones.UsuarioNoInvitadoException;

public class TestSegundoParcial {
	
	//pb22023-TN-ApellidoNombre
	
	@Test
	public void queSePuedaCrearUnCumpleanios() {
		// Preparación
		final String mailOrganizador = "chiquitapia@afa.com";
		final String nombreOrganizador = "Chiqui Tapia";
		final Integer edadOrganizador = 55;
		
		final String mailAgasajado = "lio@Messi.com";
		final String nombreAgasajado = "Lionel Messi";
		final Integer edadAgasajado = 36;
		
		
		UsuarioOrganizador usuarioOrganizador = new UsuarioOrganizador(mailOrganizador, nombreOrganizador, edadOrganizador);
		
		UsuarioAgasajado usuarioAgasajado = new UsuarioAgasajado(nombreAgasajado, mailAgasajado, edadAgasajado);
		
		Cumple nuevoCumple = new Cumple("Cumpleañito Feli",usuarioAgasajado);
		
		// Ejecución
		PlanificadorDeEventos principal = new PlanificadorDeEventos();
		principal.setUsuarioOrganizador(usuarioOrganizador);
		principal.agregarUsuarioALaListaDeUsuarios(usuarioOrganizador);
		principal.agregarUsuarioALaListaDeUsuarios(usuarioAgasajado);
		principal.agregarEvento(nuevoCumple);
		
		// Validación
		
		Assert.assertTrue(principal.getUsuarios().size() == 2);
		Assert.assertTrue(principal.getEventos().contains(nuevoCumple));
		Assert.assertTrue(principal.getUsuarioOrganizador().equals(usuarioOrganizador));
		Assert.assertTrue(nuevoCumple.getCumplañero().equals(usuarioAgasajado));
		Assert.assertTrue(nuevoCumple.getNombre().equals("Cumpleañito Feli"));
	}
	
	@Test
	public void queSePuedaCrearUnCasamiento() {
		
		final String mailOrganizador = "chiquitapia@afa.com";
		final String nombreOrganizador = "Chiqui Tapia";
		final Integer edadOrganizador = 55;
		
		final String mailAgasajado = "lio@Messi.com";
		final String nombreAgasajado = "Lionel Messi";
		final Integer edadAgasajado = 36;
		
		
		UsuarioOrganizador usuarioOrganizador = new UsuarioOrganizador(mailOrganizador, nombreOrganizador, edadOrganizador);
		
		UsuarioAgasajado usuarioAgasajado1 = new UsuarioAgasajado(nombreAgasajado, mailAgasajado, edadAgasajado);
		UsuarioAgasajado usuarioAgasajado2 = new UsuarioAgasajado("Antonela Rocuzzo", "anto@rocuzzo.com", 27);
		
		Casamiento nuevoCasamiento = new Casamiento("Casamiento Feliz",usuarioAgasajado1, usuarioAgasajado2);
		
		// Ejecución
		PlanificadorDeEventos principal = new PlanificadorDeEventos();
		principal.setUsuarioOrganizador(usuarioOrganizador);
		principal.agregarUsuarioALaListaDeUsuarios(usuarioOrganizador);
		principal.agregarUsuarioALaListaDeUsuarios(usuarioAgasajado1);
		principal.agregarUsuarioALaListaDeUsuarios(usuarioAgasajado2);
		principal.agregarEvento(nuevoCasamiento);
		
		// Validación
		
		Assert.assertTrue(principal.getUsuarios().size() == 3);
		Assert.assertTrue(principal.getEventos().contains(nuevoCasamiento));
		Assert.assertTrue(principal.getUsuarioOrganizador().equals(usuarioOrganizador));
		Assert.assertTrue(nuevoCasamiento.getUsuarioAgasajado1().equals(usuarioAgasajado1));
		Assert.assertTrue(nuevoCasamiento.getUsuarioAgasajado2().equals(usuarioAgasajado2));
		
	}
	
	@Test
	public void queSePuedaInvitarGenteAUnCumpleanios() throws EventoNoEncontradoException {
		
		final String mailOrganizador = "chiquitapia@afa.com";
		final String nombreOrganizador = "Chiqui Tapia";
		final Integer edadOrganizador = 55;
		
		final String mailAgasajado = "lio@Messi.com";
		final String nombreAgasajado = "Lionel Messi";
		final Integer edadAgasajado = 36;
		
		
		UsuarioOrganizador usuarioOrganizador = new UsuarioOrganizador(mailOrganizador, nombreOrganizador, edadOrganizador);
		
		UsuarioAgasajado usuarioAgasajado = new UsuarioAgasajado(nombreAgasajado, mailAgasajado, edadAgasajado);
		Usuario usuarioInvitado1 = new Usuario("Tench", "tench@tench.com", 22);
		Usuario usuarioInvitado2 = new Usuario("Julio", "Julio@tench.com", 18);
		Usuario usuarioInvitado3 = new Usuario("Pedro", "pedro@tench.com", 25);
		
		Cumple nuevoCumple = new Cumple("Cumpleañito Feli",usuarioAgasajado);
		
		PlanificadorDeEventos principal = new PlanificadorDeEventos();
		
		// Ejecución
		
		principal.setUsuarioOrganizador(usuarioOrganizador);
		principal.agregarUsuarioALaListaDeUsuarios(usuarioOrganizador);
		principal.agregarUsuarioALaListaDeUsuarios(usuarioAgasajado);
		principal.agregarEvento(nuevoCumple);
		
		principal.invitarUsuario(nuevoCumple, usuarioInvitado1);
		principal.invitarUsuario(nuevoCumple, usuarioInvitado2);
		principal.invitarUsuario(nuevoCumple, usuarioInvitado3);
//		nuevoCumple.invitarUsuario(usuarioInvitado1);
//		nuevoCumple.invitarUsuario(usuarioInvitado2);
//		nuevoCumple.invitarUsuario(usuarioInvitado3);
		
		Assert.assertTrue(nuevoCumple.getListaInvitados().size() == 3);
		Assert.assertTrue(nuevoCumple.getListaInvitados().contains(usuarioInvitado1));
		Assert.assertTrue(nuevoCumple.getListaInvitados().contains(usuarioInvitado2));
		Assert.assertTrue(nuevoCumple.getListaInvitados().contains(usuarioInvitado3));
		
	}
	
	@Test
	public void queUnInvitadoPuedaConfirmarSuAsistencia () throws EventoNoEncontradoException, UsuarioNoInvitadoException {
		// Preparación
		final String mailOrganizador = "chiquitapia@afa.com";
		final String nombreOrganizador = "Chiqui Tapia";
		final Integer edadOrganizador = 55;
		
		final String mailAgasajado = "lio@Messi.com";
		final String nombreAgasajado = "Lionel Messi";
		final Integer edadAgasajado = 36;
		
		
		UsuarioOrganizador usuarioOrganizador = new UsuarioOrganizador(mailOrganizador, nombreOrganizador, edadOrganizador);
		
		UsuarioAgasajado usuarioAgasajado = new UsuarioAgasajado(nombreAgasajado, mailAgasajado, edadAgasajado);
		Usuario usuarioInvitado1 = new Usuario("Tench", "tench@tench.com", 22);
		Usuario usuarioInvitado2 = new Usuario("Julio", "Julio@tench.com", 18);
		Usuario usuarioInvitado3 = new Usuario("Pedro", "pedro@tench.com", 25);
		
		Cumple nuevoCumple = new Cumple("Cumpleañito Feli",usuarioAgasajado);
		
		PlanificadorDeEventos principal = new PlanificadorDeEventos();
		
		// Ejecución
		principal.agregarEvento(nuevoCumple);
		
		principal.agregarUsuarioALaListaDeUsuarios(usuarioOrganizador);
		principal.agregarUsuarioALaListaDeUsuarios(usuarioAgasajado);
		principal.agregarUsuarioALaListaDeUsuarios(usuarioInvitado1);
		principal.agregarUsuarioALaListaDeUsuarios(usuarioInvitado2);
		principal.agregarUsuarioALaListaDeUsuarios(usuarioInvitado3);
		
		
		principal.invitarUsuario(nuevoCumple, usuarioInvitado1);
		principal.invitarUsuario(nuevoCumple, usuarioInvitado2);
		principal.invitarUsuario(nuevoCumple, usuarioInvitado3);
		principal.confirmarInvitacion(nuevoCumple, usuarioInvitado1);
		
		Assert.assertTrue(principal.getInvitadosConfirmados().contains(usuarioInvitado1));
		
	
	}
	
	@Test(expected=EventoNoEncontradoException.class)
	public void queLanceExcepcionCuandoNoEncuentreElEvento() throws EventoNoEncontradoException {
		
		final String mailOrganizador = "chiquitapia@afa.com";
		final String nombreOrganizador = "Chiqui Tapia";
		final Integer edadOrganizador = 55;
		
		final String mailAgasajado = "lio@Messi.com";
		final String nombreAgasajado = "Lionel Messi";
		final Integer edadAgasajado = 36;
		
		
		UsuarioOrganizador usuarioOrganizador = new UsuarioOrganizador(mailOrganizador, nombreOrganizador, edadOrganizador);
		
		UsuarioAgasajado usuarioAgasajado = new UsuarioAgasajado(nombreAgasajado, mailAgasajado, edadAgasajado);
		Usuario usuarioInvitado1 = new Usuario("Tench", "tench@tench.com", 22);
		Usuario usuarioInvitado2 = new Usuario("Julio", "Julio@tench.com", 18);
		Usuario usuarioInvitado3 = new Usuario("Pedro", "pedro@tench.com", 25);
		
		Cumple nuevoCumple = new Cumple("Cumpleañito Feli",usuarioAgasajado);
		Cumple nuevoCumple1 = new Cumple("Cumpleañito Felix",usuarioAgasajado);
		
		PlanificadorDeEventos principal = new PlanificadorDeEventos();
		
		// Ejecución
		
		principal.setUsuarioOrganizador(usuarioOrganizador);
		principal.agregarUsuarioALaListaDeUsuarios(usuarioOrganizador);
		principal.agregarUsuarioALaListaDeUsuarios(usuarioAgasajado);
		principal.agregarUsuarioALaListaDeUsuarios(usuarioInvitado1);
		principal.agregarUsuarioALaListaDeUsuarios(usuarioInvitado2);
		principal.agregarUsuarioALaListaDeUsuarios(usuarioInvitado3);
		principal.agregarEvento(nuevoCumple);
		
		principal.invitarUsuario(nuevoCumple1, usuarioInvitado1);
		principal.invitarUsuario(nuevoCumple1, usuarioInvitado2);
		principal.invitarUsuario(nuevoCumple1, usuarioInvitado3);
		
	}
	
	@Test(expected=UsuarioNoInvitadoException.class)
	public void queSiUnInvitadoAsisteAUnEventoAlQueNoFueInvitadoLanceLaExcepcionUsuarioNoInvitado() throws EventoNoEncontradoException, UsuarioNoInvitadoException {
		
		final String mailOrganizador = "chiquitapia@afa.com";
		final String nombreOrganizador = "Chiqui Tapia";
		final Integer edadOrganizador = 55;
		
		final String mailAgasajado = "lio@Messi.com";
		final String nombreAgasajado = "Lionel Messi";
		final Integer edadAgasajado = 36;
		
		
		UsuarioOrganizador usuarioOrganizador = new UsuarioOrganizador(mailOrganizador, nombreOrganizador, edadOrganizador);
		
		UsuarioAgasajado usuarioAgasajado = new UsuarioAgasajado(nombreAgasajado, mailAgasajado, edadAgasajado);
		Usuario usuarioInvitado1 = new Usuario("Tench", "tench@tench.com", 22);
		Usuario usuarioInvitado2 = new Usuario("Julio", "Julio@tench.com", 18);
		Usuario usuarioInvitado3 = new Usuario("Pedro", "pedro@tench.com", 25);
		Usuario usuarioNoInvitado = new Usuario("Tirri", "tirri@tench.com", 49);
		
		Cumple nuevoCumple = new Cumple("Cumpleañito Feli",usuarioAgasajado);
		
		PlanificadorDeEventos principal = new PlanificadorDeEventos();
		
		// Ejecución
		principal.agregarEvento(nuevoCumple);
		
		principal.agregarUsuarioALaListaDeUsuarios(usuarioOrganizador);
		principal.agregarUsuarioALaListaDeUsuarios(usuarioAgasajado);
		principal.agregarUsuarioALaListaDeUsuarios(usuarioInvitado1);
		principal.agregarUsuarioALaListaDeUsuarios(usuarioInvitado2);
		principal.agregarUsuarioALaListaDeUsuarios(usuarioInvitado3);
		
		
		principal.invitarUsuario(nuevoCumple, usuarioInvitado1);
		principal.invitarUsuario(nuevoCumple, usuarioInvitado2);
		principal.invitarUsuario(nuevoCumple, usuarioInvitado3);
		principal.confirmarInvitacion(nuevoCumple, usuarioNoInvitado);
		
	}
	
	@Test
	public void queSePuedaInvitarGenteAUnCasamiento() throws EventoNoEncontradoException {
		
		final String mailOrganizador = "chiquitapia@afa.com";
		final String nombreOrganizador = "Chiqui Tapia";
		final Integer edadOrganizador = 55;
		
		final String mailAgasajado = "lio@Messi.com";
		final String nombreAgasajado = "Lionel Messi";
		final Integer edadAgasajado = 36;
		
		
		UsuarioOrganizador usuarioOrganizador = new UsuarioOrganizador(mailOrganizador, nombreOrganizador, edadOrganizador);
		
		UsuarioAgasajado usuarioAgasajado1 = new UsuarioAgasajado(nombreAgasajado, mailAgasajado, edadAgasajado);
		UsuarioAgasajado usuarioAgasajado2 = new UsuarioAgasajado("Antonela Rocuzzo", "anto@rocuzzo.com", 27);
		
		Usuario usuarioInvitado1 = new Usuario("Tench", "tench@tench.com", 22);
		Usuario usuarioInvitado2 = new Usuario("Julio", "Julio@tench.com", 18);
		Usuario usuarioInvitado3 = new Usuario("Pedro", "pedro@tench.com", 25);
		
		Casamiento nuevoCasamiento = new Casamiento("Casamiento Feliz",usuarioAgasajado1, usuarioAgasajado2);
		
		PlanificadorDeEventos principal = new PlanificadorDeEventos();
		
		// Ejecución
		
		principal.setUsuarioOrganizador(usuarioOrganizador);
		principal.agregarUsuarioALaListaDeUsuarios(usuarioOrganizador);
		principal.agregarUsuarioALaListaDeUsuarios(usuarioAgasajado1);
		principal.agregarUsuarioALaListaDeUsuarios(usuarioAgasajado2);
		principal.agregarUsuarioALaListaDeUsuarios(usuarioInvitado1);
		principal.agregarUsuarioALaListaDeUsuarios(usuarioInvitado2);
		principal.agregarUsuarioALaListaDeUsuarios(usuarioInvitado3);
		principal.agregarEvento(nuevoCasamiento);
		
		principal.invitarUsuario(nuevoCasamiento, usuarioInvitado1);
		principal.invitarUsuario(nuevoCasamiento, usuarioInvitado2);
		principal.invitarUsuario(nuevoCasamiento, usuarioInvitado3);

		
		Assert.assertTrue(nuevoCasamiento.getListaInvitados().size() == 3);
		Assert.assertTrue(nuevoCasamiento.getListaInvitados().contains(usuarioInvitado1));
		Assert.assertTrue(nuevoCasamiento.getListaInvitados().contains(usuarioInvitado2));
		Assert.assertTrue(nuevoCasamiento.getListaInvitados().contains(usuarioInvitado3));
		
	}
	
	@Test
	public void obtenerListaDeInvitadosOrdenadaPorNombre() throws EventoNoEncontradoException {
		
		final String mailOrganizador = "chiquitapia@afa.com";
		final String nombreOrganizador = "Chiqui Tapia";
		final Integer edadOrganizador = 55;
		
		final String mailAgasajado = "lio@Messi.com";
		final String nombreAgasajado = "Lionel Messi";
		final Integer edadAgasajado = 36;
		
		
		UsuarioOrganizador usuarioOrganizador = new UsuarioOrganizador(mailOrganizador, nombreOrganizador, edadOrganizador);
		
		UsuarioAgasajado usuarioAgasajado1 = new UsuarioAgasajado(nombreAgasajado, mailAgasajado, edadAgasajado);
		UsuarioAgasajado usuarioAgasajado2 = new UsuarioAgasajado("Antonela Rocuzzo", "anto@rocuzzo.com", 27);
		
		Usuario usuarioInvitado1 = new Usuario("Aench", "aench@tench.com", 22);
		Usuario usuarioInvitado2 = new Usuario("Bulio", "julio@tench.com", 18);
		Usuario usuarioInvitado3 = new Usuario("Cedro", "cedro@tench.com", 25);
		
		Casamiento nuevoCasamiento = new Casamiento("Casamiento Feliz",usuarioAgasajado1, usuarioAgasajado2);
		
		PlanificadorDeEventos principal = new PlanificadorDeEventos();
		
		// Ejecución
		
		principal.setUsuarioOrganizador(usuarioOrganizador);
		principal.agregarUsuarioALaListaDeUsuarios(usuarioOrganizador);
		principal.agregarUsuarioALaListaDeUsuarios(usuarioAgasajado1);
		principal.agregarUsuarioALaListaDeUsuarios(usuarioAgasajado2);
		principal.agregarUsuarioALaListaDeUsuarios(usuarioInvitado1);
		principal.agregarUsuarioALaListaDeUsuarios(usuarioInvitado2);
		principal.agregarUsuarioALaListaDeUsuarios(usuarioInvitado3);
		principal.agregarEvento(nuevoCasamiento);
		
		principal.invitarUsuario(nuevoCasamiento, usuarioInvitado1);
		principal.invitarUsuario(nuevoCasamiento, usuarioInvitado2);
		principal.invitarUsuario(nuevoCasamiento, usuarioInvitado3);
		
		
		Assert.assertTrue(nuevoCasamiento.getListaInvitados().first().equals(usuarioInvitado1));
	}
	
	
	
}


