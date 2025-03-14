package br.com.example.api.repositorio;

import br.com.example.api.models.Pessoa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repositorio extends CrudRepository<Pessoa, Integer> {

    
}
