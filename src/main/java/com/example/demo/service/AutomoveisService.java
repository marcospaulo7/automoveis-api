package com.example.demo.service;


import com.example.demo.dto.AutomovelDTO;
import com.example.demo.dto.AutomovelResponseDTO;
import com.example.demo.repository.AutomovelEntity;
import com.example.demo.repository.AutomovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AutomoveisService {


    @Autowired
    private AutomovelRepository repository;

    public void create(AutomovelDTO automovel) {

        AutomovelEntity automovelEntity = new AutomovelEntity();
        automovelEntity.setMarca(automovel.getMarca());
        automovelEntity.setModelo(automovel.getModelo());
        automovelEntity.setValor(automovel.getValor());
        automovelEntity.setDataCadastro(LocalDate.now());

        repository.save(automovelEntity);
    }

    public List<AutomovelResponseDTO> getAll() {

        var response = repository.findAll();

        return response.stream()
                .map(automovel ->
                        {
                            AutomovelResponseDTO automovelResponseDTO = new AutomovelResponseDTO();
                            automovelResponseDTO.setId(automovel.getId());
                            automovelResponseDTO.setMarca(automovel.getMarca());
                            automovelResponseDTO.setModelo(automovel.getModelo());
                            automovelResponseDTO.setValor(automovel.getValor());
                            automovelResponseDTO.setDataCadastro(automovel.getDataCadastro());
                            return automovelResponseDTO;
                        }
                ).collect(Collectors.toList());
    }

    public AutomovelResponseDTO getById(int id) {

        var response = repository.findById(id).orElseThrow(NotFoundException::new);

        AutomovelResponseDTO automovelResponseDTO = new AutomovelResponseDTO();
        automovelResponseDTO.setId(response.getId());
        automovelResponseDTO.setMarca(response.getMarca());
        automovelResponseDTO.setModelo(response.getModelo());
        automovelResponseDTO.setValor(response.getValor());
        automovelResponseDTO.setDataCadastro(response.getDataCadastro());
        return automovelResponseDTO;
    }
}
