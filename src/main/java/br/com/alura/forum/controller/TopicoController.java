package br.com.alura.forum.controller;

import br.com.alura.forum.dto.TopicoDTO;
import br.com.alura.forum.model.Curso;
import br.com.alura.forum.model.Topico;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicoController {

    @RequestMapping("/topicos")
    public List<TopicoDTO> lista(){
        Topico topico = new Topico("Dúvida", "Duvida com spring", new Curso("Srping", "Programação"));
        return TopicoDTO.converter(Arrays.asList(topico,topico,topico));
    }

}
