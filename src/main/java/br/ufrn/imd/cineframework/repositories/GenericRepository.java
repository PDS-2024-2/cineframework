package br.ufrn.imd.cineframework.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ufrn.imd.cineframework.models.AbstractEntity;

@Repository
public interface GenericRepository<T extends AbstractEntity> extends JpaRepository<T, Long> {

}
