package com.MASB.agenciapublicidad.repository;


import com.MASB.agenciapublicidad.model.Campana;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampanaRepository extends JpaRepository<Campana, Long> {

}