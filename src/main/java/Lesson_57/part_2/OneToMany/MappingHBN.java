package Lesson_57.part_2.OneToMany;

import Lesson_57.part_2.OneToMany.pojo.Address;
import Lesson_57.part_2.OneToMany.pojo.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class MappingHBN {

    public static void main(String[] args) {

        Address address1 = new Address("Paris", "Place Colette", "00100");
        Address address2 = new Address("London", "Queens", "00200");

        List<Address> addresses = new ArrayList<>();
        addresses.add(address1);
        addresses.add(address2);

        Employee Charley = new Employee();
        Charley.setFirstName("Charley");
        Charley.setLastName("Menson");
        Charley.setAge(40);
//        Charley.getAddress().add(address1);
//        Charley.getAddress().add(address2);
        Charley.setAddress(addresses);

        Configuration con = new Configuration().configure()
                .addAnnotatedClass(Address.class)
                .addAnnotatedClass(Employee.class);
        StandardServiceRegistryBuilder sBuilder = new StandardServiceRegistryBuilder()
                .applySettings(con.getProperties());
        SessionFactory sf = con.buildSessionFactory(sBuilder.build());
        Session session1 = sf.openSession();
        session1.beginTransaction();

        session1.save(address1);
        session1.save(address2);
        session1.save(Charley);

        session1.getTransaction().commit();
    }
}
