package ar.com.unlam.test;

import org.junit.Assert;
import org.junit.Test;

import ar.com.unlam.clases.PlanificadorDeEventos;
import ar.com.unlam.clases.Usuario;
import ar.com.unlam.clases.UsuarioAgasajado;
import ar.com.unlam.clases.UsuarioOrganizador;
import ar.com.unlam.eventos.Casamiento;
import ar.com.unlam.eventos.Cumple;

public class TestSegundoParcial {
	@Test
	public void queSePuedaTestear() {
		
	}
	
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
	
//	@Test
//	public void queSePuedaInvitarGenteAUnCumpleanios() {
//		// Preparación
//		final String mailOrganizador = "chiquitapia@afa.com", nombreOrganizador = "Chiqui Tapia", mailAgasajado = "lio@Messi.com", nombreAgasajado = "Lionel Messi";
//		final Integer edadOrganizador = 55, edadAgasajado = 36;
//		final Integer cantidadDeUsuariosEsperados = 4, cantidadDeInvitadosEsperados = 2;
//		
//		// Ejecución
//		PlanificadorDeEventos principal = new PlanificadorDeEventos();
//		principal.add(new Usuario(mailOrganizador, nombreOrganizador, edadOrganizador));
//		principal.add(new Usuario("kunaguero@kunisports.com", "Sergio Aguero", 36));
//		principal.add(new Usuario("kmbappe@second.com", "Kylian Mbapee", 24));
//		Usuario organizadorDelEvento = principal.getUsuario(mailOrganizador);
//		Cumple elCumpleDeLeo = new Cumple((Agasajado)new Usuario(mailAgasajado, nombreAgasajado, edadAgasajado));
//		principal.crear(organizadorDelEvento, elCumpleDeLeo);
//		principal.invitar(elCumpleDeLeo, new Usuario("kunaguero@kunisports.com", "Sergio Aguero", 36));
//		principal.invitar(elCumpleDeLeo, new Usuario("kmbappe@second.com", "Kylian Mbapee", 24));
//		
//		// Validación
//		assertEquals(cantidadDeUsuariosEsperados, principal.getCantidadDeUsuarios());
//		assertEquals(cantidadDeInvitadosEsperados, principal.getCantidadDeInvitados());
//	}
//	
//	@Test
//	public void queUnInvitadoPuedaConfirarSuAsistencia () {
//		// Preparación
//		final String mailOrganizador = "chiquitapia@afa.com", nombreOrganizador = "Chiqui Tapia", mailAgasajado = "lio@Messi.com", nombreAgasajado = "Lionel Messi";
//		final Integer edadOrganizador = 55, edadAgasajado = 36;
//		final Integer cantidadDeUsuariosEsperados = 4, cantidadDeInvitadosEsperados = 2, cantidadDeInvitadosConfirmados = 1;
//		Usuario elKun = new Usuario("kunaguero@kunisports.com", "Sergio Aguero", 36);
//		Usuario elSegundo = new Usuario("kmbappe@second.com", "Kylian Mbapee", 24);
//		
//		// Ejecución
//		PlanificadorDeEventos principal = new PlanificadorDeEventos();
//		principal.add(new Usuario(mailOrganizador, nombreOrganizador, edadOrganizador));
//		principal.add(elKun);
//		principal.add(elSegundo);
//		Usuario organizadorDelEvento = principal.getUsuario(mailOrganizador);
//		
//		Usuario agasajado = new Agasajado(mailAgasajado, nombreAgasajado, edadAgasajado));
//		principal.crear(organizadorDelEvento, new Cumple(agasajado);
//		principal.invitar(elCumpleDeLeo, elKun);
//		principal.invitar(elCumpleDeLeo, elSegundo);
//		principal.confirmar(elCumpleDeLeo, elKun);
//		
//		// Validación
//		assertEquals(cantidadDeUsuariosEsperados, principal.getCantidadDeUsuarios());
//		assertEquals(cantidadDeInvitadosEsperados, principal.getCantidadDeInvitados());
//		assertEquals(cantidadDeInvitadosConfirmados, principal.getCantidadDeInvitadosConfirmados());
//	}

}


