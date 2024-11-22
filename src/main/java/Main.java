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
        Category category = new Category(2, "category1");

        User user1 = new User("me@emails.com", "pw123", "UN1232", "ADMIN", "11/23/2001");

        Recipe recipe = new Recipe("random title", "22mins", user1, "1/1/1", "desciptietopajta", 4, "step 1/....", "22/22/22", "whatevers", "apples....", "11:11...", 5, 4 );

        Comment comment = new Comment("nice", "22/11/2024", user1, "associatedRecipe1");
        Tag tag = new Tag("#ddd");

        session.persist(comment);

        // query
        var c = session.find(Comment.class, 1);
        System.out.println(c);


        // commit
        transaction.commit();

        // close session
        session.close();

    }

}
