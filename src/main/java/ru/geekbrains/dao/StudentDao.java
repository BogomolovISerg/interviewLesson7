package ru.geekbrains.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import ru.geekbrains.entities.Student;

public class StudentDao {
    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public int save(Student p){
        String sql="insert into Student(id,name,mark) values('"+p.getId()+"',"+p.getName()+",'"+p.getMark()+"')";
        return template.update(sql);
    }

    public int update(Student p){
        String sql="update Student set name='"+p.getName()+"', mark="+p.getMark()+"' where id="+p.getId()+"";
        return template.update(sql);
    }
    public int delete(int id){
        String sql="delete from Student where id="+id+"";
        return template.update(sql);
    }
    public Student getStudentById(int id){
        String sql="select * from Student where id=?";
        return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Student>(Student.class));
    }
    public List<Student> getEmployees(){
        return template.query("select * from Student",new RowMapper<Student>(){
            public Student mapRow(ResultSet rs, int row) throws SQLException {
                Student e=new Student();
                e.setId(rs.getLong(1));
                e.setName(rs.getString(2));
                e.setMark(rs.getInt(3));
                return e;
            }
        });
    }
}
