package cn.xuzhou;

import java.sql.*;

public class Practice03 {
    public static void main(String[] args){
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test",
                    Utils.user(),Utils.password());
            String sql = "select e.deptno,avg(s.grade) as avgrade from emp e " +
                    "join salgrade s on e.sal between s.losal and s.hisal group by " +
                    "e.deptno order by e.deptno";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.print("deptno : "+rs.getString("deptno")+" ");
                System.out.println("avgrade : "+rs.getString("avgrade"));
            }
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            if(rs != null){
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
