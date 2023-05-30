package com.example.BoodschappenBE.services;

import com.example.BoodschappenBE.model.Artikel;
import org.springframework.data.repository.CrudRepository;

public interface ArtikelService extends
        CrudRepository<Artikel, Integer>
{
// save(Artikel artikel)
// Iterable<Artikel> findAll()
// deleteById(int id)
}