package cn.suzhou;

import java.sql.*;

public class Demo00 {



    public static void main(String[] args) throws ClassNotFoundException {
    /*    Connection conn = null;
        Statement stmt = null;
        try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());

            String url = "jdbc:mysql://localhost:3306/test1";
            String user = "root";
            String passWd = "421510";
            conn = DriverManager.getConnection(url,user,passWd);

            stmt = conn.createStatement();
            String sql = "insert into t_tab (name,id) values ('王献之','8')";
            int count = stmt.executeUpdate(sql);
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
                if(stmt != null){
                    stmt.close();
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
            try{
                if(conn != null){
                    conn.close();
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }*/
     /*   Connection conn = null;
        Statement stmt = null;
        try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            String url = "jdbc:mysql://localhost:3306/test1";
            String user = "root";
            String passWd = "421510";
            conn = DriverManager.getConnection(url,user,passWd);

            stmt = conn.createStatement();
            String sql = "insert into t_tab values('simon', '12',30000)";
            int count = stmt.executeUpdate(sql);
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
                if(stmt != null){
                    stmt.close();
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
            try{
                if(conn != null){
                    conn.close();
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }*/

       /* Connection con = null;
        Statement sta = null;
        try{
            //注册驱动
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            //获取连接
            String url = "jdbc:mysql:localhost:3306/test1";
            String user = "root";
            String passWd = "421510";
            con = DriverManager.getConnection(url,user,passWd);
            //获取数据库操作对象
            sta = con.createStatement();
            //执行sql 语句
            String sql = "insert into t_tab('simon','12',12343)";
            int count = sta.executeUpdate(sql);
            System.out.println(count == 1? "成功": "失败");
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            //释放资源
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
*/
       /* Connection con = null;
        Statement sta = null;
        ResultSet rs = null;
        try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());

            String url="jdbc:mysql://localhost:3306/test1";
            String usr = "root";
            String passWd = "421510";
            con = DriverManager.getConnection(url,usr,passWd);

            sta = con.createStatement();
            String sql = "select name,id,sal from t_tab";

            rs = sta.executeQuery(sql);
            while(rs.next()){
                String name = rs.getString(1);
                String id = rs.getString(2);
                String salary = rs.getString(3);
                System.out.println(name +" "+ id +" "+ salary);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
                if(con != null){
                    con.close();
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
        }*/
 /*       Connection con = null;
        Statement sta = null;
        try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","421510");
            sta = con.createStatement();
            String sql = "insert into t_tab (name,id,sal) values ('zhaosi','9',20000)";
            int count = sta.executeUpdate(sql);
            System.out.println(count ==1? "成功":"失败");
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
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
            }catch(SQLException e ){
                e.printStackTrace();
            }
        }*/
        /*Connection con = null;
        Statement sta = null;
        try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1");
            sta = con.createStatement();
            String sql = "insert into t_tab (name,id,sal) values('zhaosi','1',12000)";
            int count = sta.executeUpdate(sql);
            System.out.println(count == 1? "成功" : " 失败");
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
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
        }*/
  /*      Connection con = null;
        Statement sat = null;
        try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","41510");
            sat = con.createStatement();
            String sql = "insert into t_tab values ('name','1',12000)";
            int count = sat.executeUpdate(sql);
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            try{
                if(sat != null){
                    sat.close();
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
        }*/
 /*       Connection con = null;
        Statement sta = null;
        try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","421510");
            sta = con.createStatement();
            String sql = "insert into t_tab(name,id,sal) values ('tom','1',12200)";
            int count = sta.executeUpdate(sql);
            System.out.println(count == 1? "成功" : "失败");
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
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
        }*/
  /*      Connection con = null;
        Statement sta = null;
        try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test1","root","421510");
            sta = con.createStatement();
            String sql = " insert into t_tab(name,sal) values ('Jerry',20000)";
            int count = sta.executeUpdate(sql);
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
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
        }*/
 /*       Connection con = null;
        Statement sta = mull;
        try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","421510");
            sta = con.createStatement();
            String sql = "insert into t_tab(name,sal) values ('zhaoyu',20000)";
            int count = sta.executeUpdate(sql);
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
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
        }*/
  /*      Connection con = null;
        Statement sta = null;
        try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","421510");
            sta = con.createStatement();
            String sql = "insert into t_tab(name,sal) values ('Judy',20000)";
            int count = sta.executeUpdate(sql);
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
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
        }*/
 /*       Connection con = null;
        Statement sta = null;
        ResultSet rs = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test1","root","421510");
            sta = con.createStatement();
            String sql = "select * from t_tab";
            rs = sta.executeQuery(sql);
            while(rs.next()){
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(rs != null){
                try{
                    rs.close();
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }
            if(sta != null){
                try{
                    sta.close();
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

    }*/
 /*       Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","421510");
            String sql = "select * from emp";
            ps = con.prepareStatement(sql);
             rs =  ps.executeQuery();
            while(rs.next()){
                System.out.print(rs.getString("ename")+" ");
                System.out.print(rs.getString("job")+" ");
                System.out.println(rs.getString("sal"));

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
        }*/
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","421510");
            String sql = "select * from allstu";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.print("name :" + rs.getString("name"));
                System.out.print("id :" +rs.getString("sid"));
                System.out.println("coll" + rs.getString("coll"));
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
    }}
