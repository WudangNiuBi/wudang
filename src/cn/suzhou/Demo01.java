package cn.suzhou;

import java.io.FileNotFoundException;
import java.sql.*;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 可sql输入的登录
 */
public class Demo01 {
    public static void main(String[] args){
        HashMap<String,String> loginInfo = initUI();
        boolean loginResult = login(loginInfo);
        System.out.println(loginResult == true? "登陆成功" :"登陆失败");
    }

    private static boolean login(HashMap<String, String> loginInfo) {
        boolean loginResult = false;
        Connection con = null;
        Statement sta = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root", "421510");
            sta = con.createStatement();
            String sql = "select * from t_user where userName ='" + loginInfo.get("userName") + "' and passWd =" + loginInfo.get("passWd") ;
            rs = sta.executeQuery(sql);
            if (rs.next()) {
                loginResult = true;
            }
        } catch(SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally{
            try{
                if(rs != null){
                    rs.close();
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
            try{
                if(sta != null){
                    sta.close();
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
            try{
                if(con != null){
                    con.close();
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        return loginResult;
    }

    private static HashMap<String,String> initUI(){
        Scanner sc = new Scanner(System.in);
        System.out.println("用户名：");
        String userName = sc.nextLine();
        System.out.println("密 码: ");
        String passWd = sc.nextLine();
        HashMap<String,String> loginInfo = new HashMap<>();
        loginInfo.put("userName",userName);
        loginInfo.put("passWd",passWd);
        return loginInfo;
    }
}
