package br.com.zup.vacinacao.services.impl;

import br.com.zup.vacinacao.dtos.UsuarioCadastrarDto;
import br.com.zup.vacinacao.entities.Usuario;
import br.com.zup.vacinacao.repositories.UsuarioRepository;
import br.com.zup.vacinacao.services.UsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UsuarioServiceImpl implements UsuarioService {

  @Autowired
  private UsuarioRepository repository;

  @Autowired
  private ModelMapper modelMapper;

  @Override
  public Usuario cadastrarUsuario(UsuarioCadastrarDto usuarioCadastrarDto) {

    Usuario usuario;

    try{
      usuario = modelMapper.map(usuarioCadastrarDto, Usuario.class);
      repository.save(usuario);
    }catch (Exception e){
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
    }

    return usuario;
  }

  @Override
  public Usuario buscarPorId(long id) {
    return repository.findById(id)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
            "Usuario não encontrado! ID: " + id));
  }

}
