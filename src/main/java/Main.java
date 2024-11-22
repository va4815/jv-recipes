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

        User user1 = new User(1, "me@emails.com", "pw123", "UN1232", "ADMIN", "11/23/2001");

        Recipe recipe = new Recipe(1, "random title", "22mins", user1, "1/1/1", "desciptietopajta", 4, "step 1/....", "22/22/22", "whatevers", "apples....", "11:11...", 5, 4 );
        session.persist(recipe);

        // query
        var c = session.find(Recipe.class, 1);
        System.out.println(c.getDescription());


        // commit
        transaction.commit();

        // close session
        session.close();

    }

}
