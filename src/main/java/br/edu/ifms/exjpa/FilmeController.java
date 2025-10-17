/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.exjpa;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author maico
 */
@Controller
public class FilmeController {

    @Autowired
    FilmeResource filmeResource;
    
    @GetMapping("/")
    public ModelAndView listar(){
        List<Filme> filmes = filmeResource.findAll();
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("filmes", filmes);
        mv.addObject("filme", new Filme());
        return mv;
    }
    
    @PostMapping("/salvar")
    public String salvar(Filme filme){
        filmeResource.save(filme);
        return "redirect:/";
    }
    
    @GetMapping("/remover/{id}")
    public String remover(@PathVariable Integer id){
        filmeResource.deleteById(id);
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("filme", new Filme());
        mv.addObject("filmes", filmeResource.findAll());
        return "redirect:/";
    }
    
    @GetMapping("/editar/{id}")
    public ModelAndView editar(@PathVariable Integer id){
        Filme filme = filmeResource.findById(id).orElse(null);
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("filme",filme);
        mv.addObject("filmes", filmeResource.findAll());
        return mv;
    }
}
