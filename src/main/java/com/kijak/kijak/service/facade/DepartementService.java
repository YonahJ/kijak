package com.kijak.kijak.service.facade;

import java.util.List;
import java.util.Optional;

import com.kijak.kijak.bean.Choice;
import com.kijak.kijak.bean.Departement;

public interface DepartementService {
    public Departement save(Departement departement);
    public Optional<Departement> findbyid(Long id);
    public List<Departement> findall();
    public int delete(Departement departement);
}
