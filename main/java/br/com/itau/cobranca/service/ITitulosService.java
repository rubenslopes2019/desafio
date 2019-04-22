package br.com.bradesco.bcpa.service;

import br.com.bradesco.bcpa.dto.TituloDTO;
import br.com.bradesco.bcpa.dto.TitulosProcDTO;

public interface ITitulosService {

 
	 	/**
	 *  Lista Titulos
	 * 
	 * @param titulos
	 * @return
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	
	TitulosProcDTO listarTitulos(TituloDTO titulo) throws IllegalArgumentException, IllegalAccessException ;

	
}
