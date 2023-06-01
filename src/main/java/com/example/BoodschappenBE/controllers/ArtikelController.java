package com.example.BoodschappenBE.controllers;

import com.example.BoodschappenBE.model.Artikel;
import com.example.BoodschappenBE.services.ArtikelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class ArtikelController {
    @Autowired
    ArtikelService artikelService;
    @PostMapping("/artikel")
    Artikel save(@RequestBody Artikel artikel) {
        return artikelService.save(artikel);
    }
    @GetMapping("/artikel")
    Iterable<Artikel> findAll() {
        return artikelService.findAll();
    }

    @DeleteMapping("/artikel/{id}")
    void delete(@PathVariable int id) {
        artikelService.deleteById(id);
    }


}

