
import java.io.Serializable;
import java.util.*;

public class Materia implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6885849471468006420L;

	//Constructor
    public Materia() {
    }

    //Atributos
    private String nombre;
    private Tutor[] tutores;
    
    //Getters y Setters
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Tutor[] getTutores() {
		return tutores;
	}

	public void setTutores(Tutor[] tutores) {
		this.tutores = tutores;
	}

    
    //Metodos
    public void subirFoto() {
      
    }
	public void subirPregunta() {
        
    }

}