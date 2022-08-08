package dio.devcarlos.padroes.singleton;

/**
 * Singleton "pregui�oso"
 * @author DevCarlos
 *
 */

public class SingletonLazy {
	
	
	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
		
	}
	
	
	public static SingletonLazy getInstancia() {
		
		if(instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
		
	}
	
	
	

}
