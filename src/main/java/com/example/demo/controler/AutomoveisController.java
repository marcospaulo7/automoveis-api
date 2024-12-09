package com.example.demo.controler;


import com.example.demo.dto.AutomovelDTO;
import com.example.demo.dto.AutomovelResponseDTO;
import com.example.demo.service.AutomoveisService;
import com.example.demo.service.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/automoveis")
public class AutomoveisController {


    @Autowired
    private AutomoveisService service;

    @PostMapping()
    public ResponseEntity<Void> create(@RequestBody AutomovelDTO request) {
        service.create(request);

        return ResponseEntity.status(201).build();
    }

    @GetMapping()
    public ResponseEntity<List<AutomovelResponseDTO>> getAll() {
        var response = service.getAll();

        return ResponseEntity.status(200).body(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AutomovelResponseDTO> getById(@PathVariable int id) {
        AutomovelResponseDTO response;
        try {
            response = service.getById(id);

        } catch (NotFoundException exception) {
            return ResponseEntity.status(404).build();
        }
        return ResponseEntity.status(200).body(response);

    }

}
