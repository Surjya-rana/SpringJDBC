package com.cognizant;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.cognizant.entity.student;
import com.cognizant.studentDao.studentDao;
/**
 * Hello world!
 *
 */
@SuppressWarnings("unused")
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//        JdbcTemplate temp=context.getBean("JdbcTemplate",JdbcTemplate.class);
//        
//        String query="INSERT INTO records(id,fname,lname) values(?,?,?)";
//        int result=temp.update(query,2,"Rajib","Roy");
//        System.out.println( "Insert successfuly "+ result );
        studentDao studentDao=context.getBean("studentDao",studentDao.class);
//        student stu=new student();
//        stu.setId(5);
//        stu.setFname("Ajay");
//        stu.setLname("pal");
//        
//        int result= studentDao.insert(stu);
//        System.out.println("student added"+result);
        
//        student stu=new student();
//	    stu.setId(5);
//	    stu.setFname("Adhi");
//	    stu.setLname("Roy");
//	      
//	    int result= studentDao.update(stu);
//	    System.out.println("student updated"+result);
        
//        int result= studentDao.delete(5);
//	    System.out.println("student deleted"+result);
	    
//	    student result= studentDao.getStudent(2);
//	    System.out.println(result);
        
        
        List<student> students=studentDao.getAllStudent();
        for(student stu:students) {
        	System.out.println(stu);
        }
    }
}
