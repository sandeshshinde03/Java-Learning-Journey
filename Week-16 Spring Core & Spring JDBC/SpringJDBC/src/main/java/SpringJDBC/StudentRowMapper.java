package SpringJDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

        Student st = new Student();

        st.setSid(rs.getInt("sid"));
        st.setSname(rs.getString("sname"));
        st.setMarks(rs.getInt("marks"));

        return st;
    }
}