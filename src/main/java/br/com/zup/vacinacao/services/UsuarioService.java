package br.com.zup.vacinacao.services;

import br.com.zup.vacinacao.dtos.UsuarioCadastrarDto;
import br.com.zup.vacinacao.entities.Usuario;

public interface UsuarioService {

  Usuario cadastrarUsuario(UsuarioCadastrarDto usuarioCadastrarDto);

  Usuario buscarPorId(long id);

}
