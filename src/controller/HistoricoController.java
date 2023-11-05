package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import util.MySqlConnection;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Historico;
import model.Questao;

public class HistoricoController {
    public static void addHistorico(String Nome_Instituicao, String Nome_Professor, int ID_Disciplina, int ID_Assunto, ArrayList<Questao> questoes_selecionadas) {
        SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat time_format = new SimpleDateFormat("HH:mm:ss");
        String Data_Salvo = date_format.format(new Date());
        String Hora_Salvo = time_format.format(new Date());
        
        String sql = "INSERT INTO tbl_Historicos VALUES (NULL, ?, ?, ?, ?, ?, ?)";
        Connection connection = null;
        PreparedStatement p_statement = null;
        
        try {
            connection = MySqlConnection.getConnection();
            p_statement = connection.prepareStatement(sql);
            p_statement.setString(1, Data_Salvo);
            p_statement.setString(2, Hora_Salvo);
            p_statement.setString(3, Nome_Instituicao);
            p_statement.setString(4, Nome_Professor);
            p_statement.setInt(5, ID_Disciplina);
            p_statement.setInt(6, ID_Assunto);
            p_statement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MySqlConnection.closePreparedStatement(p_statement);
            MySqlConnection.closeConnection(connection);
        }
        
        int ID_Historico = getID_Historico(Data_Salvo, Hora_Salvo);
        addQuestoesHistorico(ID_Historico, questoes_selecionadas);
    }
    
    private static int getID_Historico(String Data_Salvo, String Hora_Salvo) {
        int ID_Historico = -1;
        String sql = "SELECT ID_Historico FROM tbl_Historicos WHERE Data_Salvo = ? AND Hora_Salvo = ?";
        Connection connection = null;
        PreparedStatement p_statement = null;
        ResultSet result = null;
        
        try {
            connection = MySqlConnection.getConnection();
            p_statement = connection.prepareStatement(sql);
            p_statement.setString(1, Data_Salvo);
            p_statement.setString(2, Hora_Salvo);
            result = p_statement.executeQuery();
            while(result.next()) {
                ID_Historico = result.getInt("ID_Historico");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MySqlConnection.closePreparedStatement(p_statement);
            MySqlConnection.closeConnection(connection);
        }
        return ID_Historico;
    }
    
    private static void addQuestoesHistorico(int ID_Historico, ArrayList<Questao> questoes_selecionadas) {
        String sql = "INSERT INTO tbl_Historico_Questoes(ID_Historico, ID_Questao) VALUES (?, ?)";
        Connection connection = null;
        PreparedStatement p_statement = null;
        
        try {
            connection = MySqlConnection.getConnection();
            p_statement = connection.prepareStatement(sql);
            for (Questao questao : questoes_selecionadas) {
                p_statement.setInt(1, ID_Historico);
                p_statement.setInt(2, questao.getID_Questao());
                p_statement.execute();
            } 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MySqlConnection.closePreparedStatement(p_statement);
            MySqlConnection.closeConnection(connection);
        }
    }
    
    public static ArrayList<Questao> getQuestoesHistorico(int ID_Historico) {
        ArrayList<Integer> id_questoes = getID_Questoes(ID_Historico);
        ArrayList<Questao> questoes = new ArrayList<Questao>();
        String sql = "SELECT * FROM tbl_Questoes WHERE ID_Questao = ?";
        Connection connection = null;
        PreparedStatement p_statement = null;
        ResultSet result = null;
        Questao questao = null;
        
        try {
            connection = MySqlConnection.getConnection();
            p_statement = connection.prepareStatement(sql);
            for (int i = 0; i < id_questoes.size(); i++) {
                p_statement.setInt(1, id_questoes.get(i));
                result = p_statement.executeQuery();
                while(result.next()) {
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
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MySqlConnection.closePreparedStatement(p_statement);
            MySqlConnection.closeConnection(connection);
        }
        
        return questoes;
    }
    
    private static ArrayList<Integer> getID_Questoes(int ID_Historico) {
        ArrayList<Integer> id_questoes = new ArrayList<Integer>();
        String sql = "SELECT ID_Questao FROM tbl_Historico_Questoes WHERE ID_Historico = " + ID_Historico;
        Connection connection = null;
        PreparedStatement p_statement = null;
        ResultSet result = null;
        int ID_Questao;
        
        try {
            connection = MySqlConnection.getConnection();
            p_statement = connection.prepareStatement(sql);
            result = p_statement.executeQuery();
            while(result.next()) {
                ID_Questao = result.getInt("ID_Questao");
                id_questoes.add(ID_Questao);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MySqlConnection.closePreparedStatement(p_statement);
            MySqlConnection.closeConnection(connection);
        }
        
        return id_questoes;
    }
    
    public static ArrayList<Historico> getAllHistoricos() {
        ArrayList<Historico> historicos = new ArrayList<Historico>();
        String sql = "SELECT * FROM tbl_Historicos";
        Connection connection = null;
        PreparedStatement p_statement = null;
        ResultSet result = null;
        Historico historico = null;
        SimpleDateFormat date_format = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat time_format = new SimpleDateFormat("HH:mm:ss");
        
        try {
            connection = MySqlConnection.getConnection();
            p_statement = connection.prepareStatement(sql);
            result = p_statement.executeQuery();
            while(result.next()) {
                historico = new Historico();
                historico.setID_Historico(result.getInt("ID_Historico"));
                historico.setData_Salvo(date_format.format(result.getDate("Data_Salvo")));
                historico.setHora_Salvo(time_format.format(result.getTime("Hora_Salvo")));
                historico.setNome_Instituicao(result.getString("Nome_Instituicao"));
                historico.setNome_Professor(result.getString("Nome_Professor"));
                historico.setID_Disciplina(result.getInt("ID_Disciplina"));
                historico.setID_Assunto(result.getInt("ID_Assunto"));
                historicos.add(historico);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MySqlConnection.closePreparedStatement(p_statement);
            MySqlConnection.closeConnection(connection);
        }
        
        return historicos;
    }
}
