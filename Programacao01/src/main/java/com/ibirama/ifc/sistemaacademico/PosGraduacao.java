/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ibirama.ifc.sistemaacademico;

/**
 *
 * @author aluno
 */
public class PosGraduacao extends Curso{
    private String tipo;
    private String areaPesquisa;
    
    public String getTipo(){
        return tipo;
  }
    
    public void setTipo(String _tipo){
        tipo = _tipo;
    }
    
    public String getAreaPesquisa(){
        return areaPesquisa;
    }
    
    public void setAreaPesquisa(String _areaPesquisa){
        areaPesquisa = _areaPesquisa;
    }
    
    public void validarDissertacaoOuTese(){
            
    }
    
    
    @Override
    public void realizarMaricula() {
        
    }
}
