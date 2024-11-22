import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main {

    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        logger.info("Starting");

        SessionFactory sessionFactory = Database.getSessionFactory();
        sessionFactory.getSchemaManager().exportMappedObjects(true);

        // open a session
        Session session = sessionFactory.openSession();

        // begin transaciton
        Transaction transaction = session.beginTransaction();

        // insertion
        Category category = new Category(1, "category1");
        session.persist(category);

        // query
        var c = session.find(Category.class, 1);
        System.out.println(c.getName());

        // commit
        transaction.commit();

        // close session
        session.close();

    }

}
