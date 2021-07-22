package cn.suzhou;
import java.sql.*;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 解决sql注入
 *    用户提供的信息(即使有sql语句的关键字)不参与sql语句的执行过程
 *    java.sql.PreparedStatement接口继承自 java.sql.Statement ，是属于预编译的数据库操作对象
 *    原理：先对sql语句框架进行编译，然后给sql语句传值
 */


public class Demo02 {

   public static void main(String[] args){
       HashMap<String,String> userLogin = initUI();
       boolean loginResult = login(userLogin);
       System.out.println(loginResult == true? "登录成功" : "登录失败");
   }
   private static boolean login(HashMap<String,String> userLogin){
       boolean loginResult = false;

       Connection con = null;
       PreparedStatement ps = null;
       ResultSet rs = null;

       try{
           //注册驱动
          Class.forName("com.mysql.jdbc.Driver");
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","421510");
          String sql = "select * from t_user where userName = ? and passWd = ?" ;   //?表示一个占位符
          //发送sql框架给 DBMS，DBMS对sql框架进行预编译
          ps = con.prepareStatement(sql); //注意prepare
           // 给占位符传值(第一个问号下标为一，第二个问号下标为二)
           ps.setString(1,userLogin.get("userName"));
           int pass = Integer.parseInt(userLogin.get("passWd"));
           ps.setInt(2,pass);
          rs = ps.executeQuery(); //不用传入sql，如果传入会再次编译
          if(rs.next()){
              loginResult = true;
          }
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }catch(SQLException e){
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
               if(ps != null){
                   ps.close();
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
   private static HashMap<String, String> initUI(){
       Scanner sc = new Scanner(System.in);
       System.out.println("用户名: ");
       String userName = sc.nextLine();
       System.out.println("密 码: ");
       String passWd = sc.nextLine();
       HashMap<String, String> userLogin = new HashMap<>();
       userLogin.put("userName",userName);
       userLogin.put("passWd",passWd);

       return userLogin;
}
}