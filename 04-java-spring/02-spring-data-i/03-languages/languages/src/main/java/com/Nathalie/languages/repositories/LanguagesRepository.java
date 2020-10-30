package com.Nathalie.languages.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.Nathalie.languages.models.Language;

public interface LanguagesRepository extends CrudRepository<Language, Long>{
	List<Language> findAll();
}
