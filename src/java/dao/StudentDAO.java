package dao;

import connection.MyCon;
import model.Student;
import java.sql.*;
import java.util.*;
public class StudentDAO 
{
        public boolean insertStudent(Student S) throws SQLException
        {
               Connection con=null;
               PreparedStatement ps=null;
               con=MyCon.getConnection();
               String sql;
               sql="insert into Student values(?,?,?,?,?)";
               ps=con.prepareStatement(sql);
               ps.setInt(1, S.getRno());
               ps.setString(2, S.getName());
               ps.setInt(3, S.getPhy());
               ps.setInt(4, S.getChem());
               ps.setInt(5, S.getMath());
               
               if(ps.executeUpdate()>0)
                   return true;
               else
               return false;
        }
        
        public boolean updateStudent(Student S) throws SQLException
        {
            
               Connection con=null;
               PreparedStatement ps=null;
               con=MyCon.getConnection();
               String sql;
              sql="update student set name=?,phy=?,chem=?,math=? where rno=?";
              ps=con.prepareStatement(sql);
              ps.setString(1, S.getName());
              ps.setInt(2, S.getPhy());
              ps.setInt(3, S.getChem());
              ps.setInt(4, S.getMath());
              ps.setInt(5, S.getRno());
              if(ps.executeUpdate()>0)
                  return true;
              else
                  return false;
              
        }
        
        
        public boolean deleteByRno(int rno) throws Exception
        {
               Connection con=null;
               PreparedStatement ps=null;
               con=MyCon.getConnection();
               String sql;
               sql="delete from student where rno=?";
               ps=con.prepareStatement(sql);
               ps.setInt(1, rno);
               if(ps.executeUpdate()>0)
                   return true;
               else
                   return false;
            
            
        }
        
        public Student searchByRno(int rno) throws Exception
        {
               Connection con=null;
               PreparedStatement ps=null;
               ResultSet rs=null; 
               con=MyCon.getConnection();
               String sql;
               sql="select * from student where rno=?";
               ps=con.prepareStatement(sql);
               ps.setInt(1, rno);
               rs=ps.executeQuery();
               Student S=new Student();
               if(rs.next())
               {
                  S.setRno(rs.getInt(1));
                  S.setName(rs.getString(2));
                  S.setPhy(rs.getInt(3));
                  S.setChem(rs.getInt(4));
                  S.setMath(rs.getInt(5));
               } 
               else
                   S=null;
               
               return S;
        
        
        }
        public List<Student> searchAll() throws Exception
        {
           
               Connection con=null;
               PreparedStatement ps=null;
               ResultSet rs=null; 
               con=MyCon.getConnection();
               String sql;
               sql="select * from student";
               ps=con.prepareStatement(sql);
               rs=ps.executeQuery();
              List<Student>mylist=new ArrayList<Student>();
              while(rs.next())
              {
                 Student S=new Student();
                  S.setRno(rs.getInt(1));
                  S.setName(rs.getString(2));
                  S.setPhy(rs.getInt(3));
                  S.setChem(rs.getInt(4));
                  S.setMath(rs.getInt(5));
                  mylist.add(S);
              }   
               
              return mylist;
        }
                
}
