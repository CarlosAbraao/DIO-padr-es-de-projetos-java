package dio.devcarlos.padroes.facade.subsistema2.crm;

import dio.devcarlos.padroes.singleton.SingletonEager;

public class CepApi {
	

	private static CepApi instancia = new CepApi();
	
	private CepApi() {
		super();
		
	}
	
	
	public static CepApi getInstancia() {
		
		return instancia;
		
	}

	
	public String recuperarCidade(String cep) {
		return "São Luis";
		
	}
	
	public String recuperarEstado(String cep) {
		return "Maranhão";
		
	}
}
