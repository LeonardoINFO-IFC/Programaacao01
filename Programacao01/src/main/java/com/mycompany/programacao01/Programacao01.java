/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programacao01;

/**
 *
 * @author aluno
 */
public class Programacao01 {
    public static void main(String[] args) {
        Estudante leonardo = new Estudante();
        Estudante camada = new Estudante();
        Estudante jeffersondorme = new Estudante();
        
        camada.setNome("Marco");
        
        System.out.println(camada.getNome());
        System.out.println(leonardo.getNome());
        System.out.println(jeffersondorme.getNome());
        System.out.println("");
        
        leonardo.setNome("Leonardo");
        System.out.println(camada.getNome());
        System.out.println(leonardo.getNome());
        System.out.println(jeffersondorme.getNome());
        System.out.println("");
        
        jeffersondorme.setNome("Jefferon");
        
        System.out.println(camada.getNome());
        System.out.println(leonardo.getNome());
        System.out.println(jeffersondorme.getNome());
        
    }
}
