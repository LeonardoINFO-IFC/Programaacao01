/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ibirama.ifc.sistemaacademico;

/**
 *
 * @author aluno
 */
public class Graduacao extends Curso{
    private String tipo;
    private boolean tcc;
    
    public String getTipo(){
        return tipo;
    }
    
    public void setTipo(String _tipo){
        tipo = _tipo;
    }
    
    public boolean getTcc(){
        return tcc;
    }
    
    public void setTcc(boolean _tcc){
        tcc = _tcc;
    }
    
    public void validarTcc(){
        
    }

    @Override
    public void realizarMaricula() {
        
    }
    
    
}
