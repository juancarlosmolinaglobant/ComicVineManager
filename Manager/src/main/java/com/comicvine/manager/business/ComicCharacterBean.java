package com.comicvine.manager.business;

import com.comicvine.manager.entity.ComicCharacter;
import com.comicvine.manager.repository.ComicCharacterRepository;

import javax.inject.Inject;

public class ComicCharacterBean {
    @Inject
    ComicCharacterRepository repository;

    public ComicCharacter getById(int id) {
        return repository.getById(id);
    }
}
