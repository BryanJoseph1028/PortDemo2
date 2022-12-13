/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bryan1010p
 */
@RestController
public class inserccion {
    @GetMapping("/inserccion")
    public String insercion(@RequestParam String elementos, @RequestParam String ciudad, @RequestParam String orden){
        return String.format(" %s, %s",elementos,ciudad);
    }
}
