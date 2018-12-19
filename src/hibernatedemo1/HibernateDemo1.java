

package hibernatedemo1;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import Package1.Student;

public class HibernateDemo1 {

    
    public static void main(String[] args) {
        // TODO code application logic here
         Configuration cfg=new Configuration().configure("hibernate1.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session s=factory.openSession();
        List<Student> lst=s.createQuery("from Student").list();
        for(Student st:lst){
            System.out.println(st.getRollNo());
            System.out.println(st.getName());
             System.out.println(st.getEnglish());
              System.out.println(st.getMaths());
               System.out.println(st.getScience());
            System.out.println("--------------");
        }
        s.close();
    }
    
}
