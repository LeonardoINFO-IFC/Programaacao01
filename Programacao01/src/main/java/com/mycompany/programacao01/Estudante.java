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

    private String cpf;
    private static String nome;
    private Data dataNacimento;
    private char genero;
    private String email;
    private int telefoneContato;
    private int anoIngrssado;
    private int semestreIngresado;
    private String situacaoAcademica;
    private String matricula;
    private String nivelEnsino;
    private String numero;

    public Estudante() {
        nome = "Nobody";
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String _cpf) {
        cpf = _cpf;
    }

    public int obterIdade(Data hoje) {
        int idade = 0;
        //Logica de calculo de idade
        return idade;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String _nome) {
        nome = _nome;
    }

    public Data getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(Data _dataNascimento) {
        dataNacimento = _dataNascimento;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char _genero) {
        genero = _genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String _email) {
        email = _email;
    }

    public int getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(int _telefone) {
        telefoneContato = _telefone;
    }

    public int getAnoIngressado() {
        return anoIngrssado;
    }

    public void setAnoIngressado(int _anoIngreado) {
        anoIngrssado = _anoIngreado;
    }

    public int getSemstreIngrssado() {
        return semestreIngresado;
    }

    public void setSemestreIngressado(int _semestre) {
        semestreIngresado = _semestre;
    }

    public String getSituacaoAcademica() {
        return situacaoAcademica;
    }

    public void setSituacaoacademica(String _situacao) {
        situacaoAcademica = _situacao;
    }

    public String getMatricula() {
        return String.valueOf(anoIngrssado) + String.valueOf(semestreIngresado) + numero;
    }

    public void setMatricula(String _numero) {
        numero = _numero;
    }

    public String getNivelEnsino() {
        return nivelEnsino;
    }

    public void setNivelEnsino(String _nivelEnsino) {
        nivelEnsino = _nivelEnsino;
    }
}
