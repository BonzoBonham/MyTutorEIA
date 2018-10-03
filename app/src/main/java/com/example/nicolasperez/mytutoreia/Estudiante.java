
import java.io.Serializable;
import java.util.*;
public class Estudiante extends Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -430667040319669325L;

	//Constructor
	public Estudiante(String nombre, String apellido, String nombreCuenta, String password, String correo,
			Foto fotoperfil) {
		super(nombre, apellido, nombreCuenta, password, correo, fotoperfil);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Estudiante";
	}
    
    
}