
package br.com.itau.cobranca.dao.impl;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import br.com.itau.cobranca.dao.ITituloDAO ;
import br.com.itau.cobranca.dto.TituloDTO;
import br.com.itau.cobranca.dto.TitulosProcDTO;
import br.com.itau.cobranca.log.AuditLog;
import br.com.itau.cobranca.log.AuditLog.Type;


@Repository
@AuditLog(type = Type.CLASSE)
public class TitulosDAOImpl implements ITituloDAO {

	protected final Logger log = LoggerFactory.getLogger(this.getClass());

	@PersistenceContext
	private EntityManager em;

	@Override
	@AuditLog(type = Type.CONSULTA)
		public List<TitulosProcDTO> listarTitulo(TituloDTO titulo)
			throws IllegalArgumentException, IllegalAccessException {

		List<TitulosProcDTO> titulosProcDTO = new ArrayList<TitulosProcDTO>();
		StoredProcedureQuery storedProcedure;
		storedProcedure = this.em.createStoredProcedureQuery("DBAPRD1.SP_CONSULTAR_TITULOS");

		storedProcedure.registerStoredProcedureParameter(1, Long.class, ParameterMode.IN);
		storedProcedure.registerStoredProcedureParameter(2, Long.class, ParameterMode.IN);
		storedProcedure.registerStoredProcedureParameter(3, Long.class, ParameterMode.IN);
		storedProcedure.registerStoredProcedureParameter(4, Long.class, ParameterMode.IN);

		int posicao = 5;

		for (Field field : titulosProcDTO.getClass().getDeclaredFields()) {
			field.setAccessible(true);
			storedProcedure.registerStoredProcedureParameter(posicao, field.getType(), ParameterMode.OUT);
			posicao += 1;

		}

		storedProcedure.registerStoredProcedureParameter(posicao, Long.class, ParameterMode.OUT);
		storedProcedure.registerStoredProcedureParameter(posicao++, String.class, ParameterMode.OUT);

		storedProcedure.setParameter(1, titulo.getCpfCnpjCedente());
		storedProcedure.setParameter(2, titulo.getSituacao());
		storedProcedure.setParameter(3, titulo.getCarteira());
		storedProcedure.setParameter(4, titulo.getCpfCnpjSacado());

		storedProcedure.execute();

		posicao = 5;
		for (Field field : titulosProcDTO.getClass().getDeclaredFields()) {
			field.setAccessible(true);

			if (field.getType().equals(String.class) && storedProcedure.getOutputParameterValue(posicao) != null) {
				field.set(titulosProcDTO, storedProcedure.getOutputParameterValue(posicao).toString().toUpperCase());
			} else {
				field.set(titulosProcDTO, storedProcedure.getOutputParameterValue(posicao));
			}
			log.debug("campo: " + field.getName() + " valor: " + storedProcedure.getOutputParameterValue(posicao));
			posicao += 1;

		}
		return titulosProcDTO;
	}
}
	
