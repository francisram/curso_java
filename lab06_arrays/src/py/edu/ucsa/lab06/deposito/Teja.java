package py.edu.ucsa.lab06.deposito;

public class Teja extends Material {
 private String tipo;
 private String marca;
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public String getMarca() {
	return marca;
}
@Override
public String toString() {
	return "Teja [tipo=" + tipo + ", marca=" + marca + "]";
}
public Teja(String tipo, String marca) {
	super(marca);
	this.tipo = tipo;

}
public void setMarca(String marca) {
	this.marca = marca;
}
 
 
}
