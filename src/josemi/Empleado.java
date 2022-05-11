package josemi;

/**
 * <p>Clase Artículo que representa a los trabajadores de una empresa.</p>
 * 
 * <p>Su estado será nombre, apellido, edad y salario</p>
 * 
 * <p>Como comportamiento: Consideramos que los datos se generan en el constructor, que la edad no puede
 * ser menor de 1, ni mayor de 100; nos lo notificará el programa.Podremos mostrar al empleado con 
 * una representación en cadena(toString()), además podremos comparar las edades entre empleados.</p>
 * 
 * 
 * @author José Miguel Escribano Ruiz
 *
 */
public class Empleado implements Comparable<Empleado> {
	
	/**
	 * Constante edad = 40 años.
	 */
	private static final int CUARENTA_AÑOS = 40;
	
	/**
	 * Nombre del empleado.
	 */
	private String nombre;
	/**
	 * Apellido del empleado.
	 */
	private String apellido;
	/**
	 * Edad del empleado.
	 */
	private int edad;
	/**
	 * Salario del empleado.
	 */
	private double salario;

	
	/**
	 * Crea un objeto empleado que recibe todos los parámetros indicados.
	 * 
	 * @param nombre		Nombre del empleado.
	 * @param apellido		Apellido del empleado.
	 * @param edad			Edad del empleado.
	 * @param salario		Salario del empleado.
	 * 
	 * @throws EdadIncorrectaException		Lanzada para indicar si la edad es menor a 1 o mayor a 100.
	 */
	public Empleado(String nombre, String apellido, int edad, double salario) throws EdadIncorrectaException {
		setNombre(nombre);
		setApellido(apellido);
		setEdad(edad);
		setSalario(salario);
	}

	/**
	 * Asigna una nueva edad. 
	 * 
	 * @param edad		Nueva edad.
	 * @throws EdadIncorrectaException Si es menor o igual a 1 o mayor o igual a 100.
	 */
	private void setEdad(int edad) throws EdadIncorrectaException {
		if (edad <= 1 || edad >= 100) {
			throw new EdadIncorrectaException("La edad debe ser un valor entre 1 y 100");
		}
		this.edad = edad;
	}

	/**
	 * Asigna un nuevo nombre.
	 * 
	 * @param nombre	nombre a asignar.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Asigna un nuevo apellido.
	 * 
	 * @param apellido	apellido a asignar.
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * Asigna un nuevo salario.
	 * 
	 * @param salario	salario a asignar.
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

	/**
	 * Obtiene nombre
	 * 
	 * @return nombre.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Obtiene apellido.
	 * 
	 * @return apellido.
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Obtiene edad
	 * 
	 * @return edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Obtiene salario
	 * 
	 * @return salario
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * Verifica si el empleado puede obtener un plus dependiendo de si tiene la edad.
	 * 
	 * @param sueldoPlus	plus del sueldo.
	 * 
	 * @return	Devuelve verdadero si la edad es mayor de 40 y falso si es menor.
	 */
	public boolean plus(double sueldoPlus) {
		if (edad < CUARENTA_AÑOS)
			return false;

		salario += sueldoPlus;
		return true;
	}

	/**
	 * Representación en cadena del objeto empleado.
	 */
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", salario=" + salario
				+ "]";
	}

	/**
	 * Compara las edades entre 2 empleados, para indicar quien es más joven, mayor o igual edades.
	 */
	@Override
	public int compareTo(Empleado other) {
		if (this.edad == other.getEdad())
			return 0;
		if (this.edad > other.getEdad())
			return 1;
		return -1; // if(this.edad < other.getEdad()) return 1;
	}
}