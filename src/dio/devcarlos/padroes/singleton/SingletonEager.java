package dio.devcarlos.padroes.singleton;

/**
 * Singleton "apressado "
 * @author DevCarlos
 *
 */

public class SingletonEager {
	
	
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
		
	}
	
	
	public static SingletonEager getInstancia() {
		
		return instancia;
		
	}
	
	
	

}
