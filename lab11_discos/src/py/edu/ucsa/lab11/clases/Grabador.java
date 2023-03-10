package py.edu.ucsa.lab11.clases;

import java.util.List;

import py.edu.ucsa.lab11.interfaces.Borrable;
import py.edu.ucsa.lab11.interfaces.Grabable;




public class Grabador {
	public void grabarDiscosYAgregar(List<Grabable> discos, PortaDiscos pd) {
		if (discos != null && pd != null && !discos.isEmpty()) {
			System.out.println("Iniciando proceso de grabación de " + discos.size() + " discos");
			for (Grabable g : discos) {
				g.grabar();
				pd.getListaDiscosGrabados().add(g);
			}
			System.out.println("Finalizando proceso de grabación");
		}
	}
	
	public void borrarDiscosYAgregar(List<Borrable> discos, PortaDiscos pd) {
		if (discos != null && pd != null && !discos.isEmpty()) {
			System.out.println("Iniciando proceso de borrado de " + discos.size() + " discos");
			discos.forEach(disco -> {
				disco.borrar();
				pd.getListaDiscosBorrados().add(disco);
			});
			System.out.println("Finalizando proceso de borrado");
		}
	}
	
	public void mostrarInfoDiscosGrabables(PortaDiscos pd) {
		if (pd != null) {
			System.out.println("Mostrando info de discos grabables: ");
			pd.getListaDiscosGrabados().forEach(disco -> disco.mostrarInfo());

			System.out.println("************************************");
		}
	}
	
	public void mostrarInfoDiscosBorrables(PortaDiscos pd) {
		if (pd != null) {
			System.out.println("Mostrando info de discos borrables: ");

			for (Borrable m : pd.getListaDiscosBorrados()) {
				m.mostrarInfo();
			}
			System.out.println("************************************");
		}
	}

}
