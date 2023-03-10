package py.edu.ucsa.lab07.clases;

public class JuegoDeMesa extends Juego{
	private int piezas;

	public JuegoDeMesa(int cantJugadores) {

	super(cantJugadores);

	}

	public JuegoDeMesa(int cantJugadores, int piezas) {

	super(cantJugadores);

	this.piezas = piezas;

	}
}
