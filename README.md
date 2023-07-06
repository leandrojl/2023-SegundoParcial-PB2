# Segundo Parcial Programacion Basica 2-2023

## Descripcion del Parcial:

Happy Birthday
Vamos a llevar a cabo un emprendimiento a partir del cual se puedan organizar eventos de distinto tipo, de forma tal que se simplifique toda la organización automatizando la misma en su máxima expresión.
Nuestra intención es generar una red de personas, los cuales pueden tomar distintos roles según si es organizador, agasajado o invitado.
1.	Los usuarios se van incorporando a la plataforma de planificación de eventos, siendo su eMail la manera de identifica unívocamente a cada uno.
2.	En cualquier momento un Usuario puede convertirse en un Organizador de un Evento. El nombre del evento es la manera que disponemos para identificar unívocamente a cada uno.
3.	Al tiempo en que se genera el Evento, se debe identificar al Usuario Agasajado, quien en ese caso dispondrá de determinadas características dentro del Evento. 
4.	Inicialmente se pueden crear dos tipos de eventos, cumpleaños y casamientos. Los cumpleaños tienen un único agasajado, mientras que los casamientos tienen dos (marido y mujer).
5.	A los eventos se puede agregar una lista de Invitados.
6.	Las invitaciones tienen un código que expira en 24 hs, motivo por el cual, dentro de la lista de invitados un mismo usuario puede estar presente en más de una oportunidad.
7.	Los invitados pueden Confirmar o declinar su participación al evento.
8.	En el momento en el que el evento se produce, los invitados marcan su asistencia.
9.	Cuando un invitado asiste a un evento al que no fue invitado se debe lanzar la excepción UsuarioNoInvitadoException.
10.	Se debe poder obtener la lista de invitados ordenada por nombre.

### Tecnologias utilizadas:

Para resolver el siguiente ejercicio se utilizo el lenguaje Java enfocado en el paradigma de Programacion Orientada a Objetos, donde se utilizo TDD, Herencia y Polimorfismo para la reutilizacion y resolucion del codigo.

## Como utilizar este archivo:
1) En el caso de clonar el repositorio : `https://github.com/leandrojl/2023-SegundoParcial-PB2.git`

## MIT License

Copyright (c) 2023 Leandro J. Loureiro
