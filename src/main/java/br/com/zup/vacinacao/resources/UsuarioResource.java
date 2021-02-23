package br.com.zup.vacinacao.resources;

import br.com.zup.vacinacao.dtos.UsuarioCadastrarDto;
import br.com.zup.vacinacao.entities.Usuario;
import br.com.zup.vacinacao.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/api/v1/usuario")
public class UsuarioResource {

  @Autowired
  private UsuarioService service;

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Usuario cadastrarUsuario(@RequestBody @Valid UsuarioCadastrarDto usuarioCadastrarDto){
    return service.cadastrarUsuario(usuarioCadastrarDto);
  }

}
