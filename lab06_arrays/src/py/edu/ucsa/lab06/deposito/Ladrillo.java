package py.edu.ucsa.lab06.deposito;

public class Ladrillo extends Material {
 public Ladrillo() {
		super();
	}
private boolean visto;
 private String material;
 @Override
public String toString() {
	return "Ladrillo [visto=" + visto + ", material=" + material + ", marca=" + marca + "]";
}
public Ladrillo(boolean visto, String material, String marca) {
	super(marca);
	this.visto = visto;
	this.material = material;

}
public boolean isVisto() {
	return visto;
}
public void setVisto(boolean visto) {
	this.visto = visto;
}
public String getMaterial() {
	return material;
}
public void setMaterial(String material) {
	this.material = material;
}
}
