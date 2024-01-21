package com.dhpc.vet.repository;

import com.dhpc.vet.model.Vet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VetRepository extends JpaRepository<Vet, UUID> {
}
