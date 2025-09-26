package com.wecp.progressive.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.config.DatabaseConnectionManager;
import com.wecp.progressive.entity.Teacher;

public class TeacherDAOImpl implements TeacherDAO {

    Connection connection;

    public TeacherDAOImpl() {
        try
        {
            connection= DatabaseConnectionManager.getConnection();
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public int addTeacher(Teacher teacher) throws SQLException {
        // TODO Auto-generated method stub
        String query="insert into teacher(full_name, subject, contact_number, email, years_of_experience) values(?,?,?,?,?)";
        try(PreparedStatement ps=connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);)
        {
            ps.setString(1, teacher.getFullName());
            ps.setString(2, teacher.getSubject());
            ps.setString(3, teacher.getContactNumber());
            ps.setString(4, teacher.getEmail());
            ps.setInt(5, teacher.getYearsOfExperience());
            
            int affectedRows= ps.executeUpdate();

            if(affectedRows>0)
            {
                try(ResultSet rs=ps.getGeneratedKeys();)
                {
                    if(rs.next())
                    {
                        teacher.setTeacherId(rs.getInt(1));
                        return teacher.getTeacherId();
                    }
                }
            }
        }
<<<<<<< HEAD
        
=======
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
>>>>>>> ba25ff8100aa2a5913fb692d3e9597ccc1926409
        return -1;
    }

    @Override
    public void deleteTeacher(int teacherId) throws SQLException {
<<<<<<< HEAD
        
        String query="delete from teacher where teacher_id=?";
        try(PreparedStatement ps=connection.prepareStatement(query))
        {
            ps.setInt(1, teacherId);
            ps.executeUpdate();
           
        }
       
=======
        // TODO Auto-generated method stub
        String query="delete from teacher where teacher_id=?";
        try(PreparedStatement ps=connection.prepareStatement(query);)
        {
            ps.setInt(1, teacherId);
            ps.executeUpdate();
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
>>>>>>> ba25ff8100aa2a5913fb692d3e9597ccc1926409
        
    }

    @Override
    public List<Teacher> getAllTeachers() throws SQLException {
<<<<<<< HEAD
        
=======
        // TODO Auto-generated method stub
>>>>>>> ba25ff8100aa2a5913fb692d3e9597ccc1926409
        List<Teacher> li= new ArrayList<>();
        String query="select * from teacher";
        try(Statement ps=connection.createStatement();)
        {
            try(ResultSet rs=ps.executeQuery(query);)
            {
                while(rs.next())
                {
                    li.add(new Teacher(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6)));
                }
            }
        }
<<<<<<< HEAD
        
=======
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
>>>>>>> ba25ff8100aa2a5913fb692d3e9597ccc1926409
        return li;
    }

    @Override
    public Teacher getTeacherById(int teacherId) throws SQLException {
        // TODO Auto-generated method stub
        String query="select * from teacher where teacher_id=?";
        try(PreparedStatement ps=connection.prepareStatement(query);)
        {
            ps.setInt(1, teacherId);

            try(ResultSet rs=ps.executeQuery();)
            {
                if(rs.next())
                {
                    return new Teacher(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
                }
            }
        }
<<<<<<< HEAD
        
=======
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
>>>>>>> ba25ff8100aa2a5913fb692d3e9597ccc1926409
        return null;
    }

    @Override
    public void updateTeacher(Teacher teacher) throws SQLException {
        // TODO Auto-generated method stub
        String query="update teacher set full_name=?, subject=?, contact_number=?, email=?, years_of_experience=? where teacher_id=?";
        try(PreparedStatement ps=connection.prepareStatement(query);)
        {
            ps.setString(1, teacher.getFullName());
            ps.setString(2, teacher.getSubject());
            ps.setString(3, teacher.getContactNumber());
            ps.setString(4, teacher.getEmail());
            ps.setInt(5, teacher.getYearsOfExperience());
            ps.setInt(6, teacher.getTeacherId());
            ps.executeUpdate();
        }
<<<<<<< HEAD
       
=======
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
>>>>>>> ba25ff8100aa2a5913fb692d3e9597ccc1926409
        
    }
    
}
