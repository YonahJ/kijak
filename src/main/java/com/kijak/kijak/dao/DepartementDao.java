package com.kijak.kijak.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kijak.kijak.bean.Departement;

@Repository
public interface DepartementDao extends JpaRepository<Departement, Long> {
}
