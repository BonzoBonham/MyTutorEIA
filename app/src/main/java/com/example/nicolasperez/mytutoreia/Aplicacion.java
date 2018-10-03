
import java.io.Serializable;
import java.util.*;

public class Aplicacion implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1355447043047125769L;

	public static void main(String[] args) {
		Aplicacion a=new Aplicacion();
		Foto f=new Foto();
		a.crearEstudiante("Jeisson Harvey","Barrera","jbarrera", "jbarrera094", "jbarrera@gmail.com", f);
		System.out.println(a.buscarUserG("Jeisson"));
	}
	
	//Constructor
	public Aplicacion() {
    	usuarios=new ArrayList<Usuario>();
    	materias = new ArrayList<Materia>();
    }
	
	//Atributos  
	private ArrayList<Usuario> usuarios;
	private ArrayList<Materia> materias;
	
	//Metodos
	//este metodo de buscar es solo general es mas para saber si existe el usuario
	public Usuario buscarUserG(String user) {
    	 if(user!=null) {
    		 Usuario u=null;
         	for(int i=0;i<usuarios.size();i++) {
         		String nom = usuarios.get(i).getNombre();
         		String[] nombre = nom.split(" ");
         		if(nombre.length==2) {
         			if(nombre[0].compareTo(user)==0 || nombre[1].compareTo(user)==0) {
         				u=usuarios.get(i);
         				break;
         			}
         		}else {
         			if(nombre[0].compareTo(user)==0) {
         				u=usuarios.get(i);
         				break;
         			}
         		}
         	}    	
         	return u;
         }else {
         	return null;
         }
    }
	//este se usa cuando el estudiante va buscar un tutor en especial
	public Tutor buscarTutor(String user) {
		if(user!=null) {
   		 Tutor u=null;
   		 ArrayList<Tutor> t=listTutores();
        	for(int i=0;i<t.size();i++) {
        		String nom = t.get(i).getNombre();
        		String[] nombre = nom.split(" ");
        		if(nombre.length==2) {
        			if(nombre[0].compareTo(user)==0 || nombre[1].compareTo(user)==0) {
        				u=t.get(i);
        				break;
        			}
        		}else {
        			if(nombre[0].compareTo(user)==0) {
        				u=t.get(i);
        				break;
        			}
        		}
        	}    	
        	return u;
        }else {
        	return null;
        }
	}
	
	public ArrayList<Tutor> listTutor(Materia m){
		if(m!=null) {
			ArrayList<Tutor> l=new ArrayList<Tutor>();
			ArrayList<Tutor> aux=listTutores();
			for(int i=0;i<aux.size();i++) {
				if(aux.get(i).buscarMateria(m)!=null) {
					l.add(aux.get(i));
				}
			}
			return l;
		}else {
			return null;
		}
	}
	
	
	public boolean crearTutor(String nombre, String apellido,String nombreCuenta,String password,String correo,Foto fotoperfil,String telefono,LinkedList<Materia> materias,String nivel,Horario horario) {
		if(buscarUserG(nombre)!=null) {
			return false;
		}else {
			Tutor t=new Tutor(nombre, apellido, nombreCuenta, password, correo, fotoperfil, telefono, materias, nivel, horario);
			usuarios.add(t);
			return true;
		}		
	}
	
	public boolean crearEstudiante(String nombre, String apellido, String nombreCuenta, String password, String correo,
			Foto fotoperfil) {
		if(buscarUserG(nombre)!=null) {
			return false;
		}else {
			Estudiante e=new Estudiante(nombre, apellido, nombreCuenta, password, correo, fotoperfil);
			usuarios.add(e);
			return true;
		}		
	}
	
	public ArrayList<Tutor> listTutores(){
		ArrayList<Tutor> l=new ArrayList<Tutor>();
		for(int i=0;i<usuarios.size();i++) {
			if(usuarios.get(i).toString().compareTo("Tutor")==0) {
				l.add((Tutor) usuarios.get(i));
			}
		}
		return l;
	}
	public ArrayList<Estudiante> listEstudiante(){
		ArrayList<Estudiante> l=new ArrayList<Estudiante>();
		for(int i=0;i<usuarios.size();i++) {
			if(usuarios.get(i).toString().compareTo("Estudiante")==0) {
				l.add((Estudiante) usuarios.get(i));
			}
		}
		return l;
	}
   
    public void enviarMensaje() {

    }
    
    //ESTE LOGIN SE SUPONE QUE DEBE ESTAR EN EL FORM
    public boolean login(String user,String pass) {
        if(user!=null) {
        	int i=0;
        	while(i<usuarios.size() && usuarios.get(i).getNombreCuenta().compareTo(user)!=0) {
        		i++;}
        	return (i<usuarios.size() && usuarios.get(i).getPassword().compareTo(pass)==0)?true:false;
        }else {
        	return false;
        }
    }


	public void subirFoto() {
        
    }

   
    public void subirPregunta() {
        
    }

  
    public void modificarPerfil(Usuario usuario) {
        
    }

}