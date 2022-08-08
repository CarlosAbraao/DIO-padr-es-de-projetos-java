package dio.devcarlos.padroes.facade;

import dio.devcarlos.padroes.facade.subsistema1.crm.CrmService;
import dio.devcarlos.padroes.facade.subsistema2.crm.CepApi;

public class Facade {
	
	public void migrarCliente(String nome, String cep) {
		
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		
		CrmService.gravarCliente(nome, cep, estado, cidade);
		
	}

}
