package cn.xuzhou;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Practice04 {
    public static void main(String[] args){
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
