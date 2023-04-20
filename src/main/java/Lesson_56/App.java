package Lesson_56;

import Lesson_56.pojo.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class App {

  public static void main(String[] args) {

    Student Bob = new Student();
    Bob.setName("Bob");
    Bob.setAge(10);

    Configuration con = new Configuration().configure();
    con.addAnnotatedClass(Student.class);

    StandardServiceRegistryBuilder sBuilder = new StandardServiceRegistryBuilder()
        .applySettings(con.getProperties());
    SessionFactory sf = con.buildSessionFactory(sBuilder.build());

    //Create
    Session sessionCreate = sf.openSession();
    Transaction trCreate = sessionCreate.beginTransaction();
    sessionCreate.save(Bob);
    trCreate.commit();
    sessionCreate.close();

    //Read
    Session sessionRead = sf.openSession();
    Transaction trRead = sessionRead.beginTransaction();
    Student student1 = sessionRead.find(Student.class, 1);
    System.out.println(student1.toString());
    trRead.commit();
    sessionRead.close();

    //Update
    Session sessionUpdate = sf.openSession();
    Transaction trUpdate = sessionUpdate.beginTransaction();
    Student student2 = sessionUpdate.find(Student.class, 1);
    student2.setAge(20);
    student2.setName("Ben");
    sessionUpdate.update(student2);
    trUpdate.commit();
    sessionUpdate.close();

    //Delete
    Session sessionDelete = sf.openSession();
    Transaction txDelete = sessionDelete.beginTransaction();
    sessionDelete.delete(student2);
    txDelete.commit();
    sessionDelete.close();
  }
}
