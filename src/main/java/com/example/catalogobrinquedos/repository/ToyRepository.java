package com.example.catalogobrinquedos.repository;

import com.example.catalogobrinquedos.model.Toy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToyRepository extends JpaRepository<Toy, Long> {
}
