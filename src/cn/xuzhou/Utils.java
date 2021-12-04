package cn.xuzhou;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Utils {
    public static String user(){
        Properties pro = new Properties();
        try{
        FileReader reader = new FileReader("jdbc-code/jdbc.proporties");
        pro.load(reader);
        }catch(IOException e){
            e.printStackTrace();
        }
        return pro.getProperty("username");
    }
    public static String password(){
        Properties pro = new Properties();
        try{
            FileReader reader = new FileReader("jdbc-code/jdbc.proporties");
            pro.load(reader);
        }catch(IOException e){
            e.printStackTrace();
        }
        return pro.getProperty("password");
    }

}
