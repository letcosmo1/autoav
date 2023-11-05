/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Letícia
 */
public class Disciplina {
    private int ID_Disciplina;
    private String Nome_Disciplina;
    
    public Disciplina() {
        
    }
    
    public Disciplina(int ID_Disciplina, String Nome_Disciplina) {
        this.ID_Disciplina = ID_Disciplina;
        this.Nome_Disciplina = Nome_Disciplina;
    }
    
    public int getID_Disciplina() {
        return ID_Disciplina;
    }

    public void setID_Disciplina(int ID_Disciplina) {
        this.ID_Disciplina = ID_Disciplina;
    }

    public String getNome_Disciplina() {
        return Nome_Disciplina;
    }

    public void setNome_Disciplina(String Nome_Disciplina) {
        this.Nome_Disciplina = Nome_Disciplina;
    }
}
