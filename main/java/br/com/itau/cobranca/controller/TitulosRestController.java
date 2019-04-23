package br.com.itau.cobranca.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import br.com.itau.cobranca.dto.TituloDTO;
import br.com.itau.cobranca.dto.TitulosProcDTO;
import br.com.itau.cobranca.log.AuditLog;
import br.com.itau.cobranca.log.AuditLog.Type;
import br.com.itau.cobranca.service.ITitulosService;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.List;

@RestController
@RequestMapping("/cobranca")
@AuditLog(type = Type.CLASSE)
public class TitulosRestController extends AbstractRestHandler {

	@Autowired
	private ITitulosService titulosService;

	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = TituloDTO.class),
			@ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
			@ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Failure") })
	@RequestMapping(value = "/getListaTitulos", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.OK)
	@AuditLog(type = Type.CONSULTA)
	@ResponseBody
	public List<TitulosProcDTO> listarTitulos(@RequestBody TituloDTO titulos)
			throws IllegalArgumentException, IllegalAccessException {
		return titulosService.listarTitulos(titulos);
	}
	
	
}
