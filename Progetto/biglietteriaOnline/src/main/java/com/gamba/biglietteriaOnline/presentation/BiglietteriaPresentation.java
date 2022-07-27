package com.gamba.biglietteriaOnline.presentation;

import com.gamba.biglietteriaOnline.repository.SpettacoloRepo;
import com.gamba.biglietteriaOnline.repository.TeatroRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BiglietteriaPresentation {

    @Autowired
    private SpettacoloRepo spettacoloRepo;
    @Autowired
    private TeatroRepo teatroRepo;

    @GetMapping("/spettacoli")
    public String getClientsInt(Model model){
        model.addAttribute("spettacoli", spettacoloRepo.findAll());
        model.addAttribute("teatri", teatroRepo.findAll());
        return "spettacoli";
    }
}
