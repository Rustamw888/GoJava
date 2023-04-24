package Lesson_57.part_2.oneToOne;

import Lesson_57.part_2.oneToOne.pojo.Address;
import Lesson_57.part_2.oneToOne.pojo.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class MappingHBN {

    public static void main(String[] args) {

        Address address1 = new Address();
        address1.setCity("Paris");
        address1.setStreet("Place Colette");
        address1.setZipCode("00100");

        Employee Charley = new Employee();
        Charley.setFirstName("Charley");
        Charley.setLastName("Menson");
        Charley.setAge(40);
        Charley.setAddress(address1);

        Configuration con = new Configuration().configure()
                .addAnnotatedClass(Address.class)
                .addAnnotatedClass(Employee.class);
        StandardServiceRegistryBuilder sBuilder = new StandardServiceRegistryBuilder()
                .applySettings(con.getProperties());
        SessionFactory sf = con.buildSessionFactory(sBuilder.build());
        Session session1 = sf.openSession();
        session1.beginTransaction();

        session1.save(address1);
        session1.save(Charley);

        session1.getTransaction().commit();
    }
}
