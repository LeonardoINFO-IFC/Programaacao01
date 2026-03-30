/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ibirama.ifc.progamacao01;

/**
 *
 * @author aluno
 */
public class Programacao01 {
    public static void main(String[] args) {
        
        Disciplina progamacao01 = new Disciplina();
        Professor camada = new Professor();
        Estudante leonardo = new Estudante();
        
        leonardo.setNome("Leonaerdo");
        camada.setNome("Camada");
        progamacao01.setNome("progamacao01");
        
        System.out.println("o aluno " + leonardo.getNome() + " tem a diciplina " + progamacao01.getNome() + " com o professor " + camada.getNome());
        
    }
}
