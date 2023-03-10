package py.edu.ucsa.lab09.clases;

public enum MateriaPrima{
	C("CEBADA"), 
    M("MALTA"), 
    T("TRIGO");
 
    private String materiaprima;
 
    MateriaPrima(String materiaprima) {
        this.materiaprima = materiaprima;
    }
 
    public String getDescripcionMateriaPrima() {
        return materiaprima.toString();
    }
    
    public static String getMateriaPrima(MateriaPrima mp) {
    	return MateriaPrima.getMateriaPrima(mp);
    }
}

