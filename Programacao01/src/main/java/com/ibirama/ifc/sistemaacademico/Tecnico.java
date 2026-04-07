/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ibirama.ifc.sistemaacademico;

/**
 *
 * @author aluno
 */
public class Tecnico extends Curso{
    private String tecnologico;
    private int chEstagio;
    
    public String getTecnologico(){
        return tecnologico;
    }
    
    public void setTecnologico(String _tecnologico){
        tecnologico = _tecnologico;
    }
    
    public int getChEstagio(){
        return chEstagio;
    }
    
    public void setChEstagio(int _chEstagio){
        chEstagio = _chEstagio;
    }
    
    public boolean verifcEstagio() {
        return chEstagio > 0;
    }

    @Override
    public void realizarMaricula() {
        
    }
}
