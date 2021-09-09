package com.dio.sistemaponto.service;

import com.dio.sistemaponto.model.JornadaTrabalho;
import com.dio.sistemaponto.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {

    JornadaRepository jornadaRepository;

    @Autowired
    public JornadaService(JornadaRepository jornadaRepository){
        this.jornadaRepository = jornadaRepository;
    }

    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }

    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }

    public Optional<JornadaTrabalho> getById(Long idJornada) {
        return jornadaRepository.findById(idJornada);
    }

    public void deleteJornada(Long idJornada) {
        jornadaRepository.deleteById(idJornada);
    }

    public List<JornadaTrabalho> findAll() {
        return jornadaRepository.findAll();
    }
}
