package br.com.itau.cobranca.dao;

import br.com.itau.cobranca.dto.TituloDTO;
import br.com.itau.cobranca.dto.TitulosProcDTO;

public interface ITituloDAO {

	/**
	 * lista Título
	 * 
	 * @param titulo
	 * @return
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	TitulosProcDTO listarTitulo(TituloDTO titulo)
			throws IllegalArgumentException, IllegalAccessException;
}