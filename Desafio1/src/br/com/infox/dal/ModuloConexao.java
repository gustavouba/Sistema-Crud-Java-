/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.dal;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Nine
 */
public class ModuloConexao {
    //metodo responsavel por estabelecer a conexão com o banco
    
    public static Connection conector(){
      java.sql.Connection conexao = null;
        // a linha abaixo chama o driver
        String driver = "com.mysql.jdbc.Driver";
                //Armazenando informações referente ao banco
            String url = "jdbc:mysql://localhost:3306/dbinfox";
                    String user = "root";
                     String password = "";
                    //Estabelecendo conexao com BD
                     try {
                    Class.forName(driver);
                    conexao = DriverManager.getConnection(url,user,password);
                    return conexao;
        } catch (Exception e) {
            return null;
        }
                        
    }
}
