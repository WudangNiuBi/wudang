package cn.xuzhou;

import java.io.PrintStream;
import java.sql.*;

import static com.mysql.cj.conf.PropertyKey.logger;

public class Practice_1 {
    public static void main(String[] args){
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test",Utils.user(),Utils.password());
            String sql = "select e.ename,t.* from emp e join (select deptno, " +
                    "max(sal) as maxsal from emp group by deptno) t on " +
                    "e.deptno = t.deptno and t.maxsal = e.sal";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.print("ename : " + rs.getString("ename") + " ");
                System.out.print("deptno : " + rs.getString("deptno")+" ");
                System.out.println("maxsal : "+rs.getString("maxsal"));
            }

        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            if(rs != null){
                try{
                    rs.close();
                }catch(SQLException e) {
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
