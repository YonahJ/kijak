package com.kijak.kijak.service.impl;

import com.kijak.kijak.bean.Departement;
import com.kijak.kijak.dao.DepartementDao;
import com.kijak.kijak.service.facade.DepartementService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartementServiceImpl implements DepartementService {
    @Autowired
    private DepartementDao departementDAO;
    @Override
    public Departement save(Departement departement) {
        return departementDAO.save(departement);
    }

    @Override
    public Optional<Departement> findbyid(Long id) {
        return departementDAO.findById(id);
    }

    @Override
    public List<Departement> findall() {
        return departementDAO.findAll();
    }

    @Override
    public int delete(Departement departement) {
        departementDAO.delete(departement);
        return 0;
    }
}
