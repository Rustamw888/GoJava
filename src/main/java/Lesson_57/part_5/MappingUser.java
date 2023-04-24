package Lesson_57.part_5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class MappingUser {

  public static void main(String[] args) {
    Human human = new Human("Alisa", 32);
    User user = new User("Nastya", 25, "N25");
    Client client = new Client("Bob", 40, 1000);

    Configuration con = new Configuration().configure();
    con.addAnnotatedClass(Human.class);
    con.addAnnotatedClass(User.class);
    con.addAnnotatedClass(Client.class);

    StandardServiceRegistryBuilder sBuilder = new StandardServiceRegistryBuilder()
        .applySettings(con.getProperties());
    SessionFactory sf = con.buildSessionFactory(sBuilder.build());

    //Create
    Session sessionCreate = sf.openSession();
    Transaction trCreate = sessionCreate.beginTransaction();
    sessionCreate.save(human);
    sessionCreate.save(user);
    sessionCreate.save(client);
    trCreate.commit();
    sessionCreate.close();
  }

}
