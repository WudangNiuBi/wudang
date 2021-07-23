package cn.xuzhou;

import java.sql.*;

public class Practice_2 {
    public static void main(String[] args){
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test",Utils.user(),Utils.password());
            String sql = "select d.deptno,d.avgsal,e.ename,e.sal from (select " +
                    "deptno ,avg(sal) as avgsal from emp group by deptno) d " +
                    "join emp e on e.deptno = d.deptno and e.sal > d.avgsal";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.print("deptno : "+ rs.getString("deptno")+" ");
                System.out.print("avgsal : "+rs.getString("avgsal")+" ");
                System.out.print("ename : "+rs.getString("ename")+" ");
                System.out.println("sal : "+rs.getString("sal"));
            }
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            if(rs != null){
                try {
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
