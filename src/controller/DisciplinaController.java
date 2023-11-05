package controller;

import java.util.ArrayList;
import model.Disciplina;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import util.MySqlConnection;

public class DisciplinaController {
    public static void addDisciplina(String Nome_Disciplina) {
        String sql = "INSERT INTO tbl_Disciplinas(Nome_Disciplina) VALUES (?)";
        Connection connection = null;
        PreparedStatement p_statement = null;
        
        try {
            connection = MySqlConnection.getConnection();
            p_statement = connection.prepareStatement(sql);
            p_statement.setString(1, Nome_Disciplina);
            p_statement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MySqlConnection.closePreparedStatement(p_statement);
            MySqlConnection.closeConnection(connection);
        }
    }
    
    public static void updateDisciplina(int ID_Disciplina, String Nome_Disciplina) {
        String sql = "UPDATE tbl_Disciplinas SET Nome_Disciplina = ? WHERE ID_Disciplina = ?";
        Connection connection = null;
        PreparedStatement p_statement = null;
        
        try {
            connection = MySqlConnection.getConnection();
            p_statement = connection.prepareStatement(sql);
            p_statement.setString(1, Nome_Disciplina);
            p_statement.setInt(2, ID_Disciplina);
            p_statement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MySqlConnection.closePreparedStatement(p_statement);
            MySqlConnection.closeConnection(connection);
        }
    }
    
    public static void deleteDisciplina(int ID_Disciplina) {
        ArrayList<Integer> assuntos = AssuntoController.checkAssuntos(ID_Disciplina);
        ArrayList<Integer> questoes = new ArrayList<Integer>();
        
        if(!assuntos.isEmpty()) {
            questoes = QuestaoController.checkQuestoes(assuntos);
            if(!questoes.isEmpty()) {
                QuestaoController.deleteQuestoes(questoes);
                AssuntoController.deleteAssuntos(assuntos);
            } else {
                AssuntoController.deleteAssuntos(assuntos);
            }
        }

        String sql = "DELETE FROM tbl_Disciplinas WHERE ID_Disciplina = " + ID_Disciplina;
        Connection connection = null;
        PreparedStatement p_statement = null;
        
        try {
            connection = MySqlConnection.getConnection();
            p_statement = connection.prepareStatement(sql);
            p_statement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MySqlConnection.closePreparedStatement(p_statement);
            MySqlConnection.closeConnection(connection);
        }
    }
    
    public static ArrayList<Disciplina> getAllDisciplinas() {
        ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
        String sql = "SELECT * FROM tbl_Disciplinas";
        Connection connection = null;
        PreparedStatement p_statement = null;
        ResultSet result = null;
        Disciplina disciplina = null;
        try {
            connection = MySqlConnection.getConnection();
            p_statement = connection.prepareStatement(sql);
            result = p_statement.executeQuery();
            while(result.next()) {
                disciplina = new Disciplina();
                disciplina.setID_Disciplina(result.getInt("ID_Disciplina"));
                disciplina.setNome_Disciplina(result.getString("Nome_Disciplina"));
                disciplinas.add(disciplina);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MySqlConnection.closePreparedStatement(p_statement);
            MySqlConnection.closeConnection(connection);
        }
        
        return disciplinas;
    }
}