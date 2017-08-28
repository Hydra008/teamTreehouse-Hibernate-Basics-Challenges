import java.util.List;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Criteria;

public class LanguageRepository {
  // Assume sessionFactory has been initialized properly by its default constructor
  private static final SessionFactory sessionFactory = new SessionFactory();
  @SuppressWarnings("unchecked")
  public List<Language> findAll() {
    // Open session
    Session session = sessionFactory.openSession();
    
    // TODO: Create Criteria
    Criteria criteria = session.createCriteria(Language.class);
    
    // TODO: Get a list of all persisted Language entities
    List<Language> languages = criteria.list();
    
    // Close the session
    session.close();
    
    // Return the list
    return languages;
  }
}
