/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ibirama.ifc.atividadepratica;

/**
 *
 * @author aluno
 */
public class No {
    private String nome;
    private int codigo;
    private No proximo;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String _nome){
        nome = _nome;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public void setCodigo(int _codigo){
        codigo = _codigo;
    }
    
    public No getProximo(){
        return proximo;
    }
    
    public void setProximo(No _proximo){
        proximo = _proximo;
    }
    
    public boolean equals(Object obj){
        No noaux = (No)obj;
        
        if (this.codigo == noaux.getCodigo()) {
            return true;
        }else{
            return false;
        }
    }
}
