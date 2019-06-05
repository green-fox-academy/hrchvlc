package com.lucia.orientationexampleexam.services;

import com.lucia.orientationexampleexam.models.UrlAlias;
import com.lucia.orientationexampleexam.repositories.MainRepository;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    private MainRepository repository;

    public MainService(MainRepository repository) {
        this.repository = repository;
    }

    public boolean isAlreadyStored(String alias) {
        UrlAlias itemWithTheSameAlias = repository.findByAlias(alias);
        // Optional<UrlAlias> itemWithTheSameAlias = repository.getItemByAlias(alias);
        return itemWithTheSameAlias != null; //alebo .isPresent();
    }
    public void save (UrlAlias itemToSave) {
        repository.save(itemToSave);
    }
}
