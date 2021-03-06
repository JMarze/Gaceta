package bo.gaceta.rcb.dao;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

  private static SessionFactory sessionFactory;

  public static SessionFactory getSessionFactory() {
    if (sessionFactory == null) {
      Configuration cfg = new Configuration()
              .configure("hibernate.cfg.xml");
      StandardServiceRegistryBuilder sb = new StandardServiceRegistryBuilder();
      sb.applySettings(cfg.getProperties());
      StandardServiceRegistry standardServiceRegistry = sb.build();
      sessionFactory = cfg.buildSessionFactory(standardServiceRegistry);
    }
    return sessionFactory;
  }

  public static void shutdown() {
    getSessionFactory().close();
  }
}
