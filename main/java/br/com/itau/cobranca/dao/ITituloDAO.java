package br.com.itau.cobranca.dao;

import br.com.itau.cobranca.dto.TituloDTO;
import br.com.itau.cobranca.dto.TitulosProcDTO;
import java.util.List;

public interface ITituloDAO {

	/**
	 * lista Título
	 * 
	 * @param titulo
	 * @return
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	List<TitulosProcDTO> listarTitulo(TituloDTO titulo)
			throws IllegalArgumentException, IllegalAccessException;
}
