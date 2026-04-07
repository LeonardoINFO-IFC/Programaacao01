/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ibirama.ifc.sistemaacademico;

import javax.xml.crypto.Data;

/**
 *
 * @author aluno
 */
public abstract class Curso {
    private String codigo;
    private String nome;
    private int chTotal;
    private int duracao;
    private int tipoDuracao;
    private String modalidade;
    private boolean status; 
    
    public Curso(){
        nome = "nobody";    
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public void setCodigo(String _codigo){
        codigo = _codigo;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String _nome){
        nome = _nome;
    }
    
    public int getChTotal(){
        return chTotal;
    }
    
    public void setChTotal(int _chTotal){
        chTotal = _chTotal;
    }
    
    public int getDuracao(){
        return duracao;
    }
    
    public void setDuracao(int _duracao){
        duracao = _duracao;
    }
    
    public int getTipoDuracao(){
        return tipoDuracao;
    }
    
    public void setTipoDuracao(int _tipoDuracao){
        tipoDuracao = _tipoDuracao;
    }
    
    public String getModalidade(){
        return modalidade;
    }
    
    public void setModalidade(String _modalidade){
        modalidade = _modalidade;
    }
    
    public boolean getStatus(){
        return status;
    }
    
    public void setStatus(boolean _status){
        status = _status;
    }
    
    public void obterDicisplina(){
        
    }
    
    public void obterAlunosAtivos(){
        
    }
    
    public void ObterAlunosEnfressos(){
        
    }
    
    public abstract void realizarMaricula();
}
