package com.MASB.agenciapublicidad.repository;

import com.MASB.agenciapublicidad.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> { //el primer parametro es la entidad, el segundo es el tipo del id

}