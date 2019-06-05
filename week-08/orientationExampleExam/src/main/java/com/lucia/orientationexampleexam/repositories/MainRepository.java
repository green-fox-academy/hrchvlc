package com.lucia.orientationexampleexam.repositories;

import com.lucia.orientationexampleexam.models.UrlAlias;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MainRepository extends CrudRepository<UrlAlias, String> {

    @Query(value = "SELECT * from UrlAlias alias where alias.alias - ? 1", nativeQuery = true)
    UrlAlias findByAlias(String alias);
}
