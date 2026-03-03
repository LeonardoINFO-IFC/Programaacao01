/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacao01;

import java.lang.management.GarbageCollectorMXBean;
import javax.xml.crypto.Data;

/**
 *
 * @author aluno
 */
public class Estudante {
    private String nome;
    private Data dataNacimento;
    private String cpf;
    private char genero;
    private String matricula;
    private String email;
    
    public Estudante(){
        nome = "Nobody";
    }
    
    public int obterIdade(Data hoje){
        int idade = 0;
        //Logica de calculo de idade
        return idade;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String _nome){
        nome = _nome;
    }
    
    public Data getDataNacimento(){
        return dataNacimento;
    }
    
    public void setDataNacimento(Data _dataNascimento){
        dataNacimento = _dataNascimento;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public void setCpf(String _cpf){
        cpf = _cpf;
    }
    
    public char getGenero(){
        return genero;
    }
    
    public void setGenero(char _genero){
        genero = _genero;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public void setMatricula(String _matricula){
        matricula = _matricula;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String _email){
        email = _email;
    }
    
}
