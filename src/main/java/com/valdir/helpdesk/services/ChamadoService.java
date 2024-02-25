package com.valdir.helpdesk.services;

import com.valdir.helpdesk.domain.Chamado;
import com.valdir.helpdesk.repositories.ChamadoRepository;
import com.valdir.helpdesk.services.exceptions.ObjectnotFoundException;
import javassist.tools.rmi.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ChamadoService {

    @Autowired
    private ChamadoRepository repository;

    public Chamado findById(Integer id) {
        Optional<Chamado> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectnotFoundException("Objecto não encontrado Id: " + id));
    }
}
