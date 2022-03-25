package br.gov.mt.simcar.service;

import br.gov.mt.simcar.model.Requerimento;
import br.gov.mt.simcar.repository.RequerimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.xml.ws.Response;
import java.util.List;

@Service
public class RequerimentoService {

    @Autowired
    private RequerimentoRepository requerimentoRepository;

    public List<Requerimento> getRequerimentos() {
        return this.requerimentoRepository.findAll();
    }

    public ResponseEntity<Requerimento> getRequerimentoById(Integer id) {
        return this.requerimentoRepository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

}
