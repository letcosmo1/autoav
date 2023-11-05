package model;

public class Historico {
    private int ID_Historico, ID_Disciplina, ID_Assunto;
    private String Data_Salvo, Hora_Salvo, Nome_Instituicao, Nome_Professor;
    
    public Historico() {
        
    }

    public Historico(int ID_Historico, int ID_Disciplina, int ID_Assunto, String Data_Salvo, String Hora_Salvo, String Nome_Instituicao, String Nome_Professor) {
        this.ID_Historico = ID_Historico;
        this.ID_Disciplina = ID_Disciplina;
        this.ID_Assunto = ID_Assunto;
        this.Data_Salvo = Data_Salvo;
        this.Hora_Salvo = Hora_Salvo;
        this.Nome_Instituicao = Nome_Instituicao;
        this.Nome_Professor = Nome_Professor;
    }

    public int getID_Historico() {
        return ID_Historico;
    }

    public void setID_Historico(int ID_Historico) {
        this.ID_Historico = ID_Historico;
    }

    public int getID_Disciplina() {
        return ID_Disciplina;
    }

    public void setID_Disciplina(int ID_Disciplina) {
        this.ID_Disciplina = ID_Disciplina;
    }

    public int getID_Assunto() {
        return ID_Assunto;
    }

    public void setID_Assunto(int ID_Assunto) {
        this.ID_Assunto = ID_Assunto;
    }

    public String getData_Salvo() {
        return Data_Salvo;
    }

    public void setData_Salvo(String Data_Salvo) {
        this.Data_Salvo = Data_Salvo;
    }

    public String getHora_Salvo() {
        return Hora_Salvo;
    }

    public void setHora_Salvo(String Hora_Salvo) {
        this.Hora_Salvo = Hora_Salvo;
    }

    public String getNome_Instituicao() {
        return Nome_Instituicao;
    }

    public void setNome_Instituicao(String Nome_Instituicao) {
        this.Nome_Instituicao = Nome_Instituicao;
    }

    public String getNome_Professor() {
        return Nome_Professor;
    }

    public void setNome_Professor(String Nome_Professor) {
        this.Nome_Professor = Nome_Professor;
    }
    
    
}
