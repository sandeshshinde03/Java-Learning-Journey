package SpringJDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {

    public static void main(String[] args) {

        ApplicationContext con =
                new ClassPathXmlApplicationContext("SpringJDBC/config.xml");

        JdbcTemplate jdbc = (JdbcTemplate) con.getBean("jdbc-temp");

        // -------- INSERT --------
        String insertQuery =
                "insert into student (sid, sname, marks) values (?,?,?)";

        int insertResult = jdbc.update(insertQuery, 103, "Rahul", 80);
        System.out.println("Inserted records: " + insertResult);


        // -------- UPDATE --------
        String updateQuery =
                "update student set marks=? where sid=?";

        int updateResult = jdbc.update(updateQuery, 90, 103);
        System.out.println("Updated records: " + updateResult);


        // -------- DELETE --------
        String deleteQuery =
                "delete from student where sid=?";

        int deleteResult = jdbc.update(deleteQuery, 101);
        System.out.println("Deleted records: " + deleteResult);


        // -------- SELECT SINGLE --------
        String selectOne =
                "select * from student where sid=?";

        Student st = jdbc.queryForObject(selectOne,
                new StudentRowMapper(), 102);

        System.out.println(st);


        // -------- SELECT ALL --------
        String selectAll =
                "select * from student";

        List<Student> students =
                jdbc.query(selectAll, new StudentRowMapper());

        for (Student s : students) {
            System.out.println(s);
        }
    }
}