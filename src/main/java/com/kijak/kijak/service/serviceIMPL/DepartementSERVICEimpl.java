package com.kijak.kijak.service.serviceIMPL;

import com.kijak.kijak.DAO.DepartementDAO;
import com.kijak.kijak.entity.Departement;
import com.kijak.kijak.service.serviceINTER.DepartementSERVICE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartementSERVICEimpl implements DepartementSERVICE {
    @Autowired
    private DepartementDAO departementDAO;
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
