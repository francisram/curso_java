package py.edu.ucsa.clases;

public class TestClases {

	public static void main(String[] args) {
		Batalla batalla = new Batalla();

		Thor thor = new Thor();

		Loki loki = new Loki();

		batalla.hacerVolar(thor, loki);

		batalla.hacerPelear(thor, loki);

		batalla.hacerMentir(loki, loki);

	}

}
