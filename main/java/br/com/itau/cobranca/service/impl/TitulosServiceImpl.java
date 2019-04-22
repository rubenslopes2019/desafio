package br.com.itau.cobranca.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.itau.cobranca.dao.ITituloDAO;
import br.com.itau.cobranca.dto.TituloDTO;
import br.com.itau.cobranca.dto.TitulosProcDTO;

import br.com.itau.cobranca.log.AuditLog;
import br.com.itau.cobranca.log.AuditLog.Type;
import br.com.itau.cobranca.service.ITitulosService;


@Service
@AuditLog(type = Type.CLASSE)
public abstract class TitulosServiceImpl implements ITitulosService {

	private static final String SISTEMA_INDISPONIVEL = "SISTEMA INDISPONIVEL";
	
	@Autowired
	private ITituloDAO titulosDAO;

	@Override
	@AuditLog(type = Type.CONSULTA)
	public TitulosProcDTO listarTitulos(TituloDTO titulo) throws IllegalArgumentException, IllegalAccessException {
		return titulosDAO.listarTitulo(titulo);
	}
	
}
