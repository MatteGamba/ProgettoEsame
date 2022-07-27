package com.gamba.biglietteriaOnline.presentation;

import com.gamba.biglietteriaOnline.repository.SpettacoloRepo;
import com.gamba.biglietteriaOnline.repository.TeatroRepo;
import com.gamba.biglietteriaOnline.service.BiglietteriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BiglietteriaPresentation {

    @Autowired
    private BiglietteriaService service;

    @GetMapping("/spettacoli")
    public String getSpettacoli(Model model){
        model.addAttribute("spettacoli", service.getAllSpettacoli());
        model.addAttribute("teatri", service.getAllTeatri());
        return "spettacoli";
    }

    @GetMapping("/home")
    public String getHome(Model model){
        return "home";
    }


    @GetMapping("/acquista")
    public String getAcquista(Model model){
        model.addAttribute("clienti", service.getAllClienti());
//        model.addAttribute("repliche", service.getAllRepliche());
        return "acquista";
    }

    @GetMapping("/prenotazioni")
    public String getPrenotazioni(Model model){
        model.addAttribute("biglietti", service.getAllBiglietti());
        return "prenotazioni";
    }

}
