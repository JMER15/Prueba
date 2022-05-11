package josemi;

/**
 * Lanzada para indicar si la edad de un empleado es correcta.
 * 
 * @author José Miguel Escribano Ruiz
 *
 */
public class EdadIncorrectaException extends Exception {
	
	/**
	 * Serial para la excepción.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Construye una excepción EdadIncorrectaException con el mensaje detallado.
	 * 
	 * @param string	mensaje detallado
	 */
	public EdadIncorrectaException(String string) {
		super(string);
	}

}