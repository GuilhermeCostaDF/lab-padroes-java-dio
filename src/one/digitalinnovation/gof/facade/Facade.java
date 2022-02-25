package one.digitalinnovation.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {
	
	public void migrarCliente(String nome, String cep) {
		
		String recuperarCidade = CepApi.getInstancia().recuperarCidade(cep);
		String recuperarEstado = CepApi.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, recuperarCidade, recuperarEstado);
		
	}
	
}
