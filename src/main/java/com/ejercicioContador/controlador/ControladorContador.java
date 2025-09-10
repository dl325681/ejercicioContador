package com.ejercicioContador.controlador;
import com.ejercicioContador.modelo.Respuesta;
import com.ejercicioContador.modelo.Contador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/contador")

public class ControladorContador {


    private Contador contador = new Contador();


    @PostMapping("/vistaConectada")
    public List<Respuesta> vistaConectada() {
        return valorContador();
    }     

    

   @PostMapping("/sumar")
public List<Respuesta> sumar() {
    contador.sumar();
    return valorContador();

     }            

   @PostMapping("/restar")
public List<Respuesta> restar() {
    contador.restar();
    return valorContador();

     }           


     private List<Respuesta> valorContador() {

        return Respuesta.lista(new Respuesta ("Valor", contador.getValor()),
                            new Respuesta("historico", null));
//FALTA IMPLEMENTAR. FALTA CREAR EN CONTADOR LA FUNCION MOSTRAR HISTORICO
// QUE TIENE QUE IR ALMACENANDO LA HORA DE CADA CLICK ANTERIOR

     }






} 

