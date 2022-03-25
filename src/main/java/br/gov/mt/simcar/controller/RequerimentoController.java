package br.gov.mt.simcar.controller;

import br.gov.mt.simcar.model.Requerimento;
import br.gov.mt.simcar.service.RequerimentoService;
import oracle.ucp.proxy.annotation.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/requerimentos")
public class RequerimentoController {

    @Autowired
    private RequerimentoService requerimentoService;
    
    @GetMapping
    public List<Requerimento> obterRequerimentos() {
        return this.requerimentoService.getRequerimentos();
    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity<Requerimento> obterRequerimento(@PathVariable Integer id) {
        return this.requerimentoService.getRequerimentoById(id);
    }
}
