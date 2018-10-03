
import java.io.Serializable;
import java.util.*;

public class Usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7017874928471195089L;

	//Constructor
    public Usuario(String nombre, String apellido, String nombreCuenta, String password, String correo, Foto fotoperfil) {
    	this.nombre = nombre;
    	this.apellido=apellido;
    	this.nombreCuenta = nombreCuenta;
    	this.password = password;
    	this.correo = correo;
    	this.fotoperfil = fotoperfil;
    }

    //Atributos
    protected String nombre;
    protected String apellido;
    protected String nombreCuenta;
    protected String password;
    protected String correo;
    protected String mensajes;
    protected Foto fotoperfil;
    
    //Getters y Setters
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}

	public String getNombreCuenta() {
		return nombreCuenta;
	}

	public void setNombreCuenta(String nombreCuenta) {
		this.nombreCuenta = nombreCuenta;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getMensajes() {
		return mensajes;
	}

	public void setMensajes(String mensajes) {
		this.mensajes = mensajes;
	}

	public Foto getFotoperfil() {
		return fotoperfil;
	}

	public void setFotoperfil(Foto fotoperfil) {
		this.fotoperfil = fotoperfil;
	}
    

    //Metodos
    public void cambiarFotoPerfil() {
        // TODO implement here
    }

  
    public void modificarPerfil() {
        // TODO implement here
    }

}