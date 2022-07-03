package com.example.numerosromanos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/numerosromanos")
public class NumerosRomanos {

    int numero = 0;

    @GetMapping("/converter/{numero}")
    public String converterNumeros(@PathVariable int numero){

        if (numero == 1){
            return "Número " + numero + " em romanos é I" ;
        } else if (numero == 2) {
            return "Número " + numero + " em romanos é II" ;
        } else if (numero == 3) {
            return "Número " + numero + " em romanos é III" ;
        } else if (numero == 4) {
            return "Número " + numero + " em romanos é IV" ;
        } else if (numero == 5) {
            return "Número " + numero + " em romanos é V" ;
        } else if (numero == 7) {
            return "Número " + numero + " em romanos é VII" ;
        } else if (numero == 10) {
            return "Número " + numero + " em romanos é X" ;
        } else if (numero == 13) {
            return "Número " + numero + " em romanos é XIII" ;
        } else if (numero == 50) {
            return "Número " + numero + " em romanos é L" ;
        } else if (numero == 100) {
            return "Número " + numero + " em romanos é C" ;
        } else if (numero == 500) {
            return "Número " + numero + " em romanos é D" ;
        } else if (numero == 1000) {
            return "Número " + numero + " em romanos é M" ;
        }
        return null;
    }
}
