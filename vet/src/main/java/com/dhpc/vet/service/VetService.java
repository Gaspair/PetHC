package com.dhpc.vet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VetService {


    @Autowired
    private VetStore vetStore;
}
