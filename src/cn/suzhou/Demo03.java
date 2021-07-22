package cn.suzhou;

import java.sql.*;

public class Demo03 {
    public static void main(String[] args){
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","421510");
            String sql = "select * from allstu";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.print("name :"+ rs.getString("name") + " ");
                System.out.print("id" + rs.getString("sid") + " ");
                System.out.println("coll" +rs.getString("coll") + " ");
            }
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            if( rs != null){
                try{
                    rs.close();
                }catch(SQLException e){
                    e.printStackTrace();
                }

            }
            if(ps != null){
                try{
                    ps.close();
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }
            if(con != null){
                try{
                    con.close();
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }
        }

    }
}
