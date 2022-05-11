package josemi;

public class Empleado implements Comparable<Empleado> {
	public String nombre;
	public String apellido;
	public int edad;
	public double salario;

	public Empleado(String nombre, String apellido, int edad, double salario) throws EdadIncorrectaException {
		this.nombre = nombre;
		this.apellido = apellido;
		setEdad(edad);
		this.salario = salario;
	}

	private void setEdad(int edad) throws EdadIncorrectaException {
		if (edad <= 1 || edad >= 100) {
			throw new EdadIncorrectaException("La edad debe ser un valor entre 1 y 100");
		}
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}

	public double getSalario() {
		return salario;
	}

	public boolean plus(double sueldoPlus) {
		if (edad < 40)
			return false;

		salario += sueldoPlus;
		return true;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", salario=" + salario
				+ "]";
	}

	@Override
	public int compareTo(Empleado other) {
		if (this.edad == other.getEdad())
			return 0;
		if (this.edad > other.getEdad())
			return 1;
		return -1; // if(this.edad < other.getEdad()) return 1;
	}

}