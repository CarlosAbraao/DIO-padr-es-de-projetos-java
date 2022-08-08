package dio.devcarlos.padroes.singleton;

public class SingletonTeste {

	public static void main(String[] args) {
		// TESTE RELACIONADOS AO DESIGN PATTERN SINGLETON:
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		
		System.out.println(lazy);
		
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		
SingletonEager eager = SingletonEager.getInstancia();
		
		System.out.println(eager);
		
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		
SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		
		System.out.println(lazyHolder);
		
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);

	}

}
