package py.edu.ucsa.lab08.clases;

public class Music {

	public static void tune(Instrument i) {

		i.play(Note.MIDDLE_C);

		}

		public static void main(String[] args) {

		Wind flute = new Wind();

		Music.tune(flute); 
		
		Stringed guitarra = new Stringed();
		
		Music.tune(guitarra);

		}
}
