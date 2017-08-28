import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateMachine {
  // Assume sessionFactory has been initialized properly by its default constructor
  private static final SessionFactory sessionFactory = new SessionFactory();
  
  public void save(Language language) {
    // TODO: Open a session
    Session session = SessionFactory.openSession();
    // TODO: Begin a transaction
    session.beginTransaction();
    
    // TODO: Use the session to save the language
    session.save(language);
    
    // TODO: Commit the transaction
    session.getTransaction().commit();
    
    // TODO: Close the session
    session.close();
  } 
}
