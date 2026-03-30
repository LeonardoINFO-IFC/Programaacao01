/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ibirama.ifc.progamacao01;

/**
 *
 * @author aluno
 */
public class Disciplina {

    private String codigoDisci;
    private String nome;
    private int cargaHora;
    private String ementa;
    private String objetivo;
    private String referencia;
    private String infoAdici;
    
    public Disciplina(){
        nome = "Noobod";
    }
    
    public String getCodeDisci() {
        return codigoDisci;
    }

    public void setCodeDisci(String _code) {
        codigoDisci = _code;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String _nome) {
        nome = _nome;
    }
    
    public int getCarga() {
        return cargaHora;
    }

    public void setCarga(int _carga) {
        cargaHora = _carga;
    }
    
    public String geEmenta() {
        return ementa;
    }

    public void setEmenta(String _ementa) {
        ementa = _ementa;
    }
    
    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String _objetv) {
        objetivo = _objetv;
    }
    
    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String _ref) {
        referencia = _ref;
    }
    
    public String getInfoAdici() {
        return infoAdici;
    }

    public void setInfoAdici(String _InfoAdici) {
        infoAdici = _InfoAdici;
    }
    
}
