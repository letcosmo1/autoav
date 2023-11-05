package model;

public class Questao {
    private int ID_Questao;
    private String Enunciado;
    private String Alt_A, Alt_B, Alt_C, Alt_D, Alt_E;
    private char Resposta, Dificuldade;
    private int ID_Assunto;
    
    public Questao() {
        
    }

    public Questao(int ID_Questao, String Enunciado, String Alt_A, String Alt_B, String Alt_C, String Alt_D, String Alt_E, char Resposta, char Dificuldade, int ID_Assunto) {
        this.ID_Questao = ID_Questao;
        this.Enunciado = Enunciado;
        this.Alt_A = Alt_A;
        this.Alt_B = Alt_B;
        this.Alt_C = Alt_C;
        this.Alt_D = Alt_D;
        this.Alt_E = Alt_E;
        this.Resposta = Resposta;
        this.Dificuldade = Dificuldade;
        this.ID_Assunto = ID_Assunto;
    }

    public int getID_Questao() {
        return ID_Questao;
    }

    public void setID_Questao(int ID_Questao) {
        this.ID_Questao = ID_Questao;
    }

    public String getEnunciado() {
        return Enunciado;
    }

    public void setEnunciado(String Enunciado) {
        this.Enunciado = Enunciado;
    }

    public String getAlt_A() {
        return Alt_A;
    }

    public void setAlt_A(String Alt_A) {
        this.Alt_A = Alt_A;
    }

    public String getAlt_B() {
        return Alt_B;
    }

    public void setAlt_B(String Alt_B) {
        this.Alt_B = Alt_B;
    }

    public String getAlt_C() {
        return Alt_C;
    }

    public void setAlt_C(String Alt_C) {
        this.Alt_C = Alt_C;
    }

    public String getAlt_D() {
        return Alt_D;
    }

    public void setAlt_D(String Alt_D) {
        this.Alt_D = Alt_D;
    }

    public String getAlt_E() {
        return Alt_E;
    }

    public void setAlt_E(String Alt_E) {
        this.Alt_E = Alt_E;
    }

    public char getResposta() {
        return Resposta;
    }

    public void setResposta(char Resposta) {
        this.Resposta = Resposta;
    }

    public char getDificuldade() {
        return Dificuldade;
    }

    public void setDificuldade(char Dificuldade) {
        this.Dificuldade = Dificuldade;
    }

    public int getID_Assunto() {
        return ID_Assunto;
    }

    public void setID_Assunto(int ID_Assunto) {
        this.ID_Assunto = ID_Assunto;
    }

    @Override
    public String toString() {
        return "Questao{" + "ID_Questao=" + ID_Questao + ", Enunciado=" + Enunciado + ", Alt_A=" + Alt_A + ", Alt_B=" + Alt_B + ", Alt_C=" + Alt_C + ", Alt_D=" + Alt_D + ", Alt_E=" + Alt_E + ", Resposta=" + Resposta + ", Dificuldade=" + Dificuldade + ", ID_Assunto=" + ID_Assunto + '}';
    }
}
