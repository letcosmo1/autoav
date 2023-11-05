package controller;

import java.util.ArrayList;
import model.Assunto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import util.MySqlConnection;

public class AssuntoController {
    public static void addAssunto(String Nome_Assunto, int ID_Disciplina) {
        String sql = "INSERT INTO tbl_Assuntos(Nome_Assunto, ID_Disciplina) VALUES (?, ?)";
        Connection connection = null;
        PreparedStatement p_statement = null;
        
        try {
            connection = MySqlConnection.getConnection();
            p_statement = connection.prepareStatement(sql);
            p_statement.setString(1, Nome_Assunto);
            p_statement.setInt(2, ID_Disciplina);
            p_statement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MySqlConnection.closePreparedStatement(p_statement);
            MySqlConnection.closeConnection(connection);
        }
    }
    
    public static void updateAssunto(int ID_Assunto, String Nome_Assunto) {
        String sql = "UPDATE tbl_Assuntos SET Nome_Assunto = ? WHERE ID_Assunto = ?";
        Connection connection = null;
        PreparedStatement p_statement = null;
        
        try {
            connection = MySqlConnection.getConnection();
            p_statement = connection.prepareStatement(sql);
            p_statement.setString(1, Nome_Assunto);
            p_statement.setInt(2, ID_Assunto);
            p_statement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MySqlConnection.closePreparedStatement(p_statement);
            MySqlConnection.closeConnection(connection);
        }
    }
    
    public static void deleteAssunto(int ID_Assunto) {
        ArrayList<Integer> questoes = QuestaoController.checkQuestoes(ID_Assunto);
        
        if(!questoes.isEmpty()) {
            QuestaoController.deleteQuestoes(questoes);
        }
        
        String sql = "DELETE FROM tbl_Assuntos WHERE ID_Assunto = " + ID_Assunto;
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
    
    public static ArrayList<Assunto> getAssuntosbyDisciplina(int ID_Disciplina) {
        ArrayList<Assunto> assuntos = new ArrayList<Assunto>();
        String sql = "SELECT * FROM tbl_Assuntos WHERE ID_Disciplina = " + ID_Disciplina;
        Connection connection = null;
        PreparedStatement p_statement = null;
        ResultSet result = null;
        Assunto assunto = null;
        
        try {
            connection = MySqlConnection.getConnection();
            p_statement = connection.prepareStatement(sql);
            result = p_statement.executeQuery();
            while(result.next()) {
                assunto = new Assunto();
                assunto.setID_Assunto(result.getInt("ID_Assunto"));
                assunto.setNome_Assunto(result.getString("Nome_Assunto"));
                assunto.setID_Disciplina(result.getInt("ID_Disciplina"));
                assuntos.add(assunto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MySqlConnection.closePreparedStatement(p_statement);
            MySqlConnection.closeConnection(connection);
        }
        
        return assuntos;
    }
    
    public static ArrayList<Assunto> getAllAssuntos() {
        ArrayList<Assunto> assuntos = new ArrayList<Assunto>();
        String sql = "SELECT * FROM tbl_Assuntos";
        Connection connection = null;
        PreparedStatement p_statement = null;
        ResultSet result = null;
        Assunto assunto = null;
        try {
            connection = MySqlConnection.getConnection();
            p_statement = connection.prepareStatement(sql);
            result = p_statement.executeQuery();
            while(result.next()) {
                assunto = new Assunto();
                assunto.setID_Assunto(result.getInt("ID_Assunto"));
                assunto.setNome_Assunto(result.getString("Nome_Assunto"));
                assunto.setID_Disciplina(result.getInt("ID_Disciplina"));
                assuntos.add(assunto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MySqlConnection.closePreparedStatement(p_statement);
            MySqlConnection.closeConnection(connection);
        }
        
        return assuntos;
    }
    
    public static ArrayList<Integer> checkAssuntos(int ID_Disciplina) {
        ArrayList<Integer> assuntos = new ArrayList<Integer>();
        String sql = "SELECT ID_Assunto FROM tbl_Assuntos WHERE ID_Disciplina = " + ID_Disciplina;
        Connection connection = null;
        PreparedStatement p_statement = null;
        ResultSet result = null;
        
        try {
            connection = MySqlConnection.getConnection();
            p_statement = connection.prepareStatement(sql);
            result = p_statement.executeQuery();
            
            while(result.next()) {
                assuntos.add(result.getInt("ID_Assunto"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MySqlConnection.closePreparedStatement(p_statement);
            MySqlConnection.closeConnection(connection);
        }
        
        return assuntos;
    }
    
    public static void deleteAssuntos(ArrayList<Integer> assuntos) {
        String sql = "DELETE FROM tbl_Assuntos WHERE ID_Assunto = ?";
        Connection connection = null;
        PreparedStatement p_statement = null;
        
        try {
            connection = MySqlConnection.getConnection();
            p_statement = connection.prepareStatement(sql);
            for (int i = 0; i < assuntos.size(); i++) {
                p_statement.setInt(1, assuntos.get(i));
                p_statement.execute();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MySqlConnection.closePreparedStatement(p_statement);
            MySqlConnection.closeConnection(connection);
        }
    }
}
