package controller;

import java.util.ArrayList;
import model.Questao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import util.MySqlConnection;

public class QuestaoController {

    public static void addQuestao(String Enunciado, String Alt_A, String Alt_B, String Alt_C, String Alt_D, String Alt_E, char Resposta, char Dificuldade, int ID_Assunto) {
        String sql = "INSERT INTO tbl_Questoes VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Connection connection = null;
        PreparedStatement p_statement = null;

        try {
            connection = MySqlConnection.getConnection();
            p_statement = connection.prepareStatement(sql);
            p_statement.setString(1, Enunciado);
            p_statement.setString(2, Alt_A);
            p_statement.setString(3, Alt_B);
            p_statement.setString(4, Alt_C);
            p_statement.setString(5, Alt_D);
            p_statement.setString(6, Alt_E);
            p_statement.setString(7, String.valueOf(Resposta));
            p_statement.setString(8, String.valueOf(Dificuldade));
            p_statement.setInt(9, ID_Assunto);
            p_statement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MySqlConnection.closePreparedStatement(p_statement);
            MySqlConnection.closeConnection(connection);
        }
    }
    
    public static void deleteQuestao(int ID_Questao) {
        deleteQuestaoFromHistory(ID_Questao);
        String sql = "DELETE FROM tbl_Questoes WHERE ID_Questao = " + ID_Questao;
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
    
    private static void deleteQuestaoFromHistory(int ID_Questao) {
        String sql = "DELETE FROM tbl_Historico_Questoes WHERE ID_Questao = " + ID_Questao;
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

    public static ArrayList<Questao> getQuestoesByAssunto(int ID_Assunto, char Dificuldade) {
        ArrayList<Questao> questoes = new ArrayList<Questao>();
        String sql = "SELECT * FROM tbl_Questoes WHERE ID_Assunto = ? AND Dificuldade =?";
        Connection connection = null;
        PreparedStatement p_statement = null;
        ResultSet result = null;
        Questao questao = null;

        try {
            connection = MySqlConnection.getConnection();
            p_statement = connection.prepareStatement(sql);
            p_statement.setInt(1, ID_Assunto);
            p_statement.setString(2, String.valueOf(Dificuldade));
            result = p_statement.executeQuery();

            while (result.next()) {
                questao = new Questao();
                questao.setID_Questao(result.getInt("ID_Questao"));
                questao.setEnunciado(result.getString("Enunciado"));
                questao.setAlt_A(result.getString("Alt_A"));
                questao.setAlt_B(result.getString("Alt_B"));
                questao.setAlt_C(result.getString("Alt_C"));
                questao.setAlt_D(result.getString("Alt_D"));
                questao.setAlt_E(result.getString("Alt_E"));
                questao.setResposta(result.getString("Resposta").charAt(0));
                questao.setDificuldade(result.getString("Dificuldade").charAt(0));
                questao.setID_Assunto(result.getInt("ID_Assunto"));
                questoes.add(questao);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MySqlConnection.closePreparedStatement(p_statement);
            MySqlConnection.closeConnection(connection);
        }

        return questoes;
    }

    public static ArrayList<Questao> getAllQuestoes() {
        ArrayList<Questao> questoes = new ArrayList<Questao>();
        String sql = "SELECT * FROM tbl_Questoes";
        Connection connection = null;
        PreparedStatement p_statement = null;
        ResultSet result = null;
        Questao questao = null;
        try {
            connection = MySqlConnection.getConnection();
            p_statement = connection.prepareStatement(sql);
            result = p_statement.executeQuery();
            while (result.next()) {
                questao = new Questao();
                questao.setID_Questao(result.getInt("ID_Questao"));
                questao.setEnunciado(result.getString("Enunciado"));
                questao.setAlt_A(result.getString("Alt_A"));
                questao.setAlt_B(result.getString("Alt_B"));
                questao.setAlt_C(result.getString("Alt_C"));
                questao.setAlt_D(result.getString("Alt_D"));
                questao.setAlt_E(result.getString("Alt_E"));
                questao.setResposta(result.getString("Resposta").charAt(0));
                questao.setDificuldade(result.getString("Dificuldade").charAt(0));
                questao.setID_Assunto(result.getInt("ID_Assunto"));
                questoes.add(questao);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MySqlConnection.closePreparedStatement(p_statement);
            MySqlConnection.closeConnection(connection);
        }

        return questoes;
    }
    
    public static ArrayList<Integer> checkQuestoes(ArrayList<Integer> assuntos) {
        ArrayList<Integer> questoes = new ArrayList<Integer>();
        String sql = "SELECT ID_Questao FROM tbl_Questoes WHERE ID_Assunto = (?)";
        Connection connection = null;
        PreparedStatement p_statement = null;
        ResultSet result = null;
        
        try {
            connection = MySqlConnection.getConnection();
            p_statement = connection.prepareStatement(sql);
                for (int i = 0; i < assuntos.size(); i++) {
                    p_statement.setInt(1, assuntos.get(i));
                    result = p_statement.executeQuery();

                    while(result.next()) {
                        questoes.add(result.getInt("ID_Questao"));
                    }
                }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MySqlConnection.closePreparedStatement(p_statement);
            MySqlConnection.closeConnection(connection);
        }
        
        return questoes;
    }
    
    public static ArrayList<Integer> checkQuestoes(int ID_Assunto) {
        ArrayList<Integer> questoes = new ArrayList<Integer>();
        String sql = "SELECT ID_Questao FROM tbl_Questoes WHERE ID_Assunto = " + ID_Assunto;
        Connection connection = null;
        PreparedStatement p_statement = null;
        ResultSet result = null;
        
        try {
            connection = MySqlConnection.getConnection();
            p_statement = connection.prepareStatement(sql);
            result = p_statement.executeQuery();
            while(result.next()) {
                questoes.add(result.getInt("ID_Questao"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MySqlConnection.closePreparedStatement(p_statement);
            MySqlConnection.closeConnection(connection);
        }
        return questoes;
    }
    
    public static void deleteQuestoes(ArrayList<Integer> questoes) {
        deleteQuestoesFromHistory(questoes);
        String sql = "DELETE FROM tbl_Questoes WHERE ID_Questao = ?";
        Connection connection = null;
        PreparedStatement p_statement = null;
        
        try {
            connection = MySqlConnection.getConnection();
            p_statement = connection.prepareStatement(sql);
            for (int i = 0; i < questoes.size(); i++) {
                p_statement.setInt(1, questoes.get(i));
                p_statement.execute();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MySqlConnection.closePreparedStatement(p_statement);
            MySqlConnection.closeConnection(connection);
        }
    }
    
    private static void deleteQuestoesFromHistory(ArrayList<Integer> questoes) {
        String sql = "DELETE FROM tbl_Historico_Questoes WHERE ID_Questao = ?";
        Connection connection = null;
        PreparedStatement p_statement = null;
        
        try {
            connection = MySqlConnection.getConnection();
            p_statement = connection.prepareStatement(sql);
            for (int i = 0; i < questoes.size(); i++) {
                p_statement.setInt(1, questoes.get(i));
                p_statement.execute();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MySqlConnection.closePreparedStatement(p_statement);
            MySqlConnection.closeConnection(connection);
        }
    }
    
    public static int getQuestoesCount(int ID_Assunto, char Dificuldade) {
        int questoes_count = -1;
        String sql = "SELECT COUNT(ID_Questao) FROM tbl_Questoes WHERE ID_Assunto = ? AND Dificuldade = ?";
        Connection connection = null;
        PreparedStatement p_statement = null;
        ResultSet result = null;
        
        try {
            connection = MySqlConnection.getConnection();
            p_statement = connection.prepareStatement(sql);
            p_statement.setInt(1, ID_Assunto);
            p_statement.setString(2, String.valueOf(Dificuldade));
            result = p_statement.executeQuery();
            while(result.next()) {
                questoes_count = result.getInt("COUNT(ID_Questao)");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MySqlConnection.closePreparedStatement(p_statement);
            MySqlConnection.closeConnection(connection);
        }
        
        return questoes_count;
    }
    
}
