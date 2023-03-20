package py.edu.ucsa.tte.clases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import py.edu.ucsa.tte.interfaces.Validable;

public class Validador {
	/*
	 * private ArrayList<Empleado> empleadosConFaltas;
	 * 
	 * public ArrayList<Empleado> getEmpleadosConFaltas() { if
	 * (Objects.isNull(empleadosConFaltas)) { empleadosConFaltas = new
	 * ArrayList<>(); } return empleadosConFaltas; }
	 */

	public void procesarMarcaciones(List<Marcacion> empleados) {

		ArrayList<Empleado> empleadosConFaltas = new ArrayList<>();
		for (Marcacion marcacion : empleados) {
			Empleado empleado = marcacion.getEmpleado();
			if (empleado instanceof Director) {
				if (((Director) empleado).validar(marcacion.getHoraMinutoMarcacion())) {
					((Director) empleado)
							.setCantidadLLegadasTardias(((Director) empleado).getCantidadLLegadasTardias() + 1);
					Director director = (Director) empleado;
					// if (!empleadosConFaltas.contains((Director) empleado)) {
					if (!empleadosConFaltas.contains(director)) {
						empleadosConFaltas.add(director);
					}else {
						int pos = empleadosConFaltas.indexOf(director);
						Director aux = (Director) empleadosConFaltas.get(pos);
						aux.setCantidadLLegadasTardias(aux.getCantidadLLegadasTardias() + 1);
						empleadosConFaltas.set(pos, aux);
					}
				}
			}
			
			if (empleado instanceof PersonalDeServicio) {
				if (((PersonalDeServicio) empleado).validar(marcacion.getHoraMinutoMarcacion())) {
					((PersonalDeServicio) empleado)
							.setCantidadLLegadasTardias(((PersonalDeServicio) empleado).getCantidadLLegadasTardias() + 1);
					PersonalDeServicio PersonalDeServicio = (PersonalDeServicio) empleado;
					// if (!empleadosConFaltas.contains((PersonalDeServicio) empleado)) {
					if (!empleadosConFaltas.contains(PersonalDeServicio)) {
						empleadosConFaltas.add(PersonalDeServicio);
					}else {
						int pos = empleadosConFaltas.indexOf(PersonalDeServicio);
						PersonalDeServicio aux = (PersonalDeServicio) empleadosConFaltas.get(pos);
						aux.setCantidadLLegadasTardias(aux.getCantidadLLegadasTardias() + 1);
						empleadosConFaltas.set(pos, aux);
					}
				}
			}


			/*
			 * if (marcacion.getEmpleado() instanceof Director) {
			 * //System.out.println(marcacion); // Director d = (Director)
			 * marcacion.getEmpleado(); if (((Director)
			 * marcacion.getEmpleado()).validar(marcacion.getHoraMinutoMarcacion())) {
			 * //System.out.println("paso su hora de tolerancia");
			 * System.out.println(marcacion);
			 * 
			 * if (empleadosConFaltas.isEmpty()) {
			 * System.out.println("agregado primera vez"); Director daux = (Director)
			 * marcacion.getEmpleado();
			 * daux.setCantidadLLegadasTardias(daux.getCantidadLLegadasTardias() + 1);
			 * empleadosConFaltas.add(daux); //System.out.println((Director)
			 * marcacion.getEmpleado()); } if
			 * (empleadosConFaltas.contains(marcacion.getEmpleado())) {
			 * System.out.println("ya existe"); int indice =
			 * empleadosConFaltas.indexOf((Director) marcacion.getEmpleado()); Director daux
			 * = (Director) empleadosConFaltas.get(indice);
			 * daux.setCantidadLLegadasTardias(daux.getCantidadLLegadasTardias() + 1);
			 * //System.out.println(daux); empleadosConFaltas.set(indice, daux); }
			 * 
			 * } }
			 */
		}
		empleadosConFaltas.forEach((x) -> System.out.println(x.toString()));
		try (FileWriter output = new FileWriter("C:\\clase_java\\llegadas.txt");
				BufferedWriter bufOutput = new BufferedWriter(output);) {

			for (Empleado empleado2 : empleadosConFaltas) {
				if(empleado2 instanceof Director) {
					Director e = (Director)empleado2;
					bufOutput.write(
							e.getLegajo() + "," + e.getNombre() + "," + e.getApellido() + "," +e.getCantidadLLegadasTardias() );
					bufOutput.newLine();
				}
				if(empleado2 instanceof PersonalDeServicio) {
					PersonalDeServicio e = (PersonalDeServicio)empleado2;
					bufOutput.write(
							e.getLegajo() + "," + e.getNombre() + "," + e.getApellido() + "," +e.getCantidadLLegadasTardias() );
					bufOutput.newLine();
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
