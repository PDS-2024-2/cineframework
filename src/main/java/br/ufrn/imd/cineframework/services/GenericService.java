package br.ufrn.imd.cineframework.services;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Service;

import br.ufrn.imd.cineframework.models.AbstractEntity;
import br.ufrn.imd.cineframework.repositories.GenericRepository;
import jakarta.transaction.Transactional;

@Service
public abstract class GenericService<T extends AbstractEntity> implements Serializable {
	private static final long serialVersionUID = 1L;

	public abstract GenericRepository<T> getRepository();

	@Transactional
	public T insert(T obj) {
		obj.onCreate();
		return getRepository().save(obj);
	}

	public T findById(Long id) {
		return getRepository().findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Entity with id=" + id + " not found."));
	}

	public List<T> findAll() {
		return getRepository().findAll();
	}

	@Transactional
	public T update(T obj) {
		obj.onUpdate();
		return getRepository().save(obj);
	}

	@Transactional
	public void delete(Long id) {
		findById(id);
		getRepository().deleteById(id);
	}
}
