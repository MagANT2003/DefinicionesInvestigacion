/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.definicionesdeinvestigacion.main;

import jakarta.faces.bean.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
/**
 *
 * @author acer
 */
public class temas {

    public temas() {
        tema1 = "ARTE CLASICO";
        tema2 = "ARTE POR IA";
        Definicion1 = "El arte clásico se refiere al estilo artístico que se desarrolló principalmente en las antiguas civilizaciones de Grecia y Roma, aproximadamente desde el siglo V a.C. hasta el siglo IV d.C. Este estilo está caracterizado por su búsqueda de la armonía, el equilibrio, la proporción, y la belleza idealizada. En su época, se consideraba un reflejo de la perfección, tanto en la forma humana como en la naturaleza y la arquitectura.";
        Definicion2 = "El concepto de arte generado por IA (inteligencia artificial) se refiere al uso de algoritmos y sistemas de aprendizaje automático para crear obras artísticas, ya sea visuales, musicales, literarias, o de otro tipo. A diferencia del arte clásico, que busca la perfección y el ideal de la belleza, el arte por IA se caracteriza por su capacidad para explorar nuevos estilos, combinaciones y conceptos que pueden desafiar las tradiciones artísticas convencionales.";
    }
    
    
    
    private String tema1;
    private String tema2;
    private String Definicion1;
    private String Definicion2;

    public String getTema1() {
        return tema1;
    }

    public void setTema1(String tema1) {
        this.tema1 = tema1;
    }

    public String getTema2() {
        return tema2;
    }

    public void setTema2(String tema2) {
        this.tema2 = tema2;
    }

    public String getDefinicion1() {
        return Definicion1;
    }

    public void setDefinicion1(String Definicion1) {
        this.Definicion1 = Definicion1;
    }

    public String getDefinicion2() {
        return Definicion2;
    }

    public void setDefinicion2(String Definicion2) {
        this.Definicion2 = Definicion2;
    }
    
    
}
