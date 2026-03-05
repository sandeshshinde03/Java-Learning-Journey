package SpringJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con=new ClassPathXmlApplicationContext("SpringJDBC/config.xml");
  
        JdbcTemplate jdbc=(JdbcTemplate) con.getBean("jdbc-temp");
        
        String query="insert into student (sid,sname,marks) values(?,?,?)";
       int rs= jdbc.update(query,102,"shinde",70);
       System.out.println("Number of record inserted: "+rs);
       
        
    }
}
