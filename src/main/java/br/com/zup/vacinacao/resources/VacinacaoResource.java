package br.com.zup.vacinacao.resources;

import br.com.zup.vacinacao.dtos.VacinacaoCadastrarDto;
import br.com.zup.vacinacao.entities.Vacinacao;
import br.com.zup.vacinacao.services.VacinacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/api/v1/vacinacao")
public class VacinacaoResource {

  @Autowired
  private VacinacaoService service;

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Vacinacao cadastrarVacinacao(@RequestBody @Valid VacinacaoCadastrarDto vacinacaoCadastrarDto){
    return service.cadastrarVacinacao(vacinacaoCadastrarDto);
  }

}
