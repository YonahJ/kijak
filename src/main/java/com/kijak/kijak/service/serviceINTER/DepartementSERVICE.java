package com.kijak.kijak.service.serviceINTER;

import com.kijak.kijak.entity.Choice;
import com.kijak.kijak.entity.Departement;

import java.util.List;
import java.util.Optional;

public interface DepartementSERVICE {
    public Departement save(Departement departement);
    public Optional<Departement> findbyid(Long id);
    public List<Departement> findall();
    public int delete(Departement departement);
}
