/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Letícia
 */
public class Assunto {
    private int ID_Assunto;
    private String Nome_Assunto;
    private int ID_Disciplina;
    
    public Assunto() {
        
    }
    
    public Assunto(int ID_Assunto, String Nome_Assunto, int ID_Disciplina) {
        this.ID_Assunto = ID_Assunto;
        this.Nome_Assunto = Nome_Assunto;
        this.ID_Disciplina = ID_Disciplina;
    }

    public int getID_Assunto() {
        return ID_Assunto;
    }

    public void setID_Assunto(int ID_Assunto) {
        this.ID_Assunto = ID_Assunto;
    }

    public String getNome_Assunto() {
        return Nome_Assunto;
    }

    public void setNome_Assunto(String Nome_Assunto) {
        this.Nome_Assunto = Nome_Assunto;
    }

    public int getID_Disciplina() {
        return ID_Disciplina;
    }

    public void setID_Disciplina(int ID_Disciplina) {
        this.ID_Disciplina = ID_Disciplina;
    }
}
