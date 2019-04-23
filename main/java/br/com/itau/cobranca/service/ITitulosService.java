package br.com.itau.cobranca.service;

import java.util.List;
import br.com.itau.cobranca.dto.TituloDTO;
import br.com.itau.cobranca.dto.TitulosProcDTO;

public interface ITitulosService {

 
	 	/**
	 *  Lista Titulos
	 * 
	 * @param titulos
	 * @return
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	
	List<TitulosProcDTO> listarTitulos(TituloDTO titulo) throws IllegalArgumentException, IllegalAccessException ;

	
}
