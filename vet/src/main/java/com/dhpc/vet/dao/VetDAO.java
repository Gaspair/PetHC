package com.dhpc.vet.dao;

import com.dhpc.vet.service.VetStore;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

@Component
@Transactional
public class VetDAO implements VetStore {
}
