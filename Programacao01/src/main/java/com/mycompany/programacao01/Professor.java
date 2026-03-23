/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacao01;

import javax.xml.crypto.Data;

/**
 *
 * @author aluno
 */
public class Professor {

    private static String nome;
    private String siape;
    private Data dataNacimento;
    private String email;
    private int telefoneContato;
    private String tituloAcademica;
    private String areaAtuação;
    private String regimeTrabalho;
    private int dataIngrssado;
    private String formacao;

    public Professor() {
        nome = "Nobody";
    }
    
    public static String getNome() {
        return nome;
    }

    public static void setNome(String _nome) {
        nome = _nome;
    }
    
    public String getSiape() {
        return siape;
    }

    public void setSiape(String _siape) {
        siape = _siape;
    }
    
    public Data getDataNasci() {
        return dataNacimento;
    }

    public void setDataNasci(Data _dataNasci) {
        dataNacimento = _dataNasci;
    }
    
    public String getEmial() {
        return email;
    }

    public void setEmail(String _email) {
        email = _email;
    }
    
    public int getTelefone() {
        return telefoneContato;
    }

    public void setTelefone(int _teleone) {
        telefoneContato = _teleone;
    }
    
    public String getTituloAcad() {
        return tituloAcademica;
    }

    public void setTituloAcad(String _tituacad) {
        tituloAcademica = _tituacad;
    }
    
    public String getAreAtu() {
        return areaAtuação;
    }

    public void setAreAreAtu(String _areAtu) {
        areaAtuação = _areAtu;
    }
    public String getRegTrab() {
        return regimeTrabalho;
    }

    public void setRegTrab(String _regTrab) {
        regimeTrabalho = _regTrab;
    }
    
    public int getDataIngr() {
        return dataIngrssado;
    }

    public void setDataIngr(int _data) {
        dataIngrssado = _data;
    }
    
    public String getForma() {
        return formacao;
    }

    public void setForm(String _formacao) {
        formacao = _formacao;
    }
    
}
