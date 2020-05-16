package dao;
import connection.MyCon;
import java.sql.*;
public class LoginDAO
{
    public static boolean checkLogin(String uname,String upass) throws Exception    
    {
          Connection con=null;
          PreparedStatement ps=null;
          ResultSet rs=null;
          String sql;
          con=MyCon.getConnection();
          sql="select * from login where username=? and password=?";
          ps=con.prepareStatement(sql);
          ps.setString(1, uname);
          ps.setString(2, upass);
          rs=ps.executeQuery();
          if(rs.next())
              return true;
          else
              return false;
    }
}
