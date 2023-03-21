package py.edu.ucsa.test4.clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import py.edu.ucsa.test4.interfaces.Calculable;

public class Lectura {
	private int suministro;
	private LocalDate lecturaAnterior;
	private LocalDate LecturaActual;
	private int consumoKWH;
	private String categoria;
	public static final List<Cliente> clientes = new ArrayList<>();

	public static void tomarDatosLecturas() {
		try (FileReader reader = new FileReader("C:\\clase_java\\LECTURA.txt");
				BufferedReader bufReader = new BufferedReader(reader);) {
			String line = null;
			line = bufReader.readLine();
			while (line != null) {
				if (!"".equals(line)) {

					String[] datos = line.split("\t");
					Lectura l = new Lectura(Integer.parseInt(datos[2]),
							LocalDate.parse(datos[1], DateTimeFormatter.ofPattern("dd/MM/yyyy")),
							LocalDate.parse(datos[0], DateTimeFormatter.ofPattern("dd/MM/yyyy")),
							Integer.parseInt(datos[3]), datos[4]);

					if (!yaExisteEnLaLista(l, clientes)) {
						switch (datos[4]) {
						case "S":
							TarifaSocial tf = new TarifaSocial(12);
							tf.setSuministro(l.getSuministro());
							tf.getLecturas().add(l);
							clientes.add(tf);
							break;

						case "C":
							Comercio co = new Comercio(18);
							co.setSuministro(0);
							co.getLecturas().add(l);
							clientes.add(co);
							break;

						case "I":
							Industrial i = new Industrial(25);
							i.setSuministro(l.getSuministro());
							i.getLecturas().add(l);
							clientes.add(i);
							break;

						case "R":
							Residencial r = new Residencial();
							r.setSuministro(l.getSuministro());
							r.getLecturas().add(l);
							clientes.add(r);
							break;
						default:
							// asdasdsa
						}
					} else {

						for (Cliente c : clientes) {
							if (c.equals(l)) {
								c.getLecturas().add(l);
							}
						}
						// System.out.println("asdasd");

					}

				}
				line = bufReader.readLine();
			}

			List<Calculable> calculables = new ArrayList<>();
			for (Cliente cliente : clientes) {
				calculables.add((Calculable) cliente);
			}

			Facturador f = new Facturador();
			f.procesarConsumos(calculables);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static boolean yaExisteEnLaLista(Lectura l, List<Cliente> clientes2) {
		for (Cliente c : clientes2) {
			if (l.equals(c)) {
				return true;
			}
		}
		return false;
	}

	public Lectura(int suministro, LocalDate lecturaAnterior, LocalDate lecturaActual, int consumoKWH,
			String categoria) {
		super();
		this.suministro = suministro;
		this.lecturaAnterior = lecturaAnterior;
		LecturaActual = lecturaActual;
		this.consumoKWH = consumoKWH;
		this.categoria = categoria;
	}

	public Lectura() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Lectura [suministro=" + suministro + ", lecturaAnterior=" + lecturaAnterior + ", LecturaActual="
				+ LecturaActual + ", consumoKWH=" + consumoKWH + ", categoria=" + categoria + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(LecturaActual, categoria);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lectura other = (Lectura) obj;
		return Objects.equals(LecturaActual, other.LecturaActual) && Objects.equals(categoria, other.categoria);
	}

	public static List<Cliente> getClientes() {
		return clientes;
	}

	public int getSuministro() {
		return suministro;
	}

	public void setSuministro(int suministro) {
		this.suministro = suministro;
	}

	public LocalDate getLecturaAnterior() {
		return lecturaAnterior;
	}

	public void setLecturaAnterior(LocalDate lecturaAnterior) {
		this.lecturaAnterior = lecturaAnterior;
	}

	public LocalDate getLecturaActual() {
		return LecturaActual;
	}

	public void setLecturaActual(LocalDate lecturaActual) {
		LecturaActual = lecturaActual;
	}

	public int getConsumoKWH() {
		return consumoKWH;
	}

	public void setConsumoKWH(int consumoKWH) {
		this.consumoKWH = consumoKWH;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
