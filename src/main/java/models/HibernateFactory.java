package models;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.tool.schema.spi.CommandAcceptanceException;

public class HibernateFactory {
	private SessionFactory sessionFactory;

	public void setup() {
		StandardServiceRegistryBuilder configure = new StandardServiceRegistryBuilder().configure();
		StandardServiceRegistry registry = configure.build();

		MetadataSources metadataSources = new MetadataSources(registry);
		metadataSources.addAnnotatedClass(TestEntity.class);
		try {
			sessionFactory = metadataSources.buildMetadata().buildSessionFactory();
			metadataSources.buildMetadata();
		} catch (Throwable ex) {
			System.out.println("wut"+ ex);
		}
	}

	public Session getSession() {
		return sessionFactory.openSession();
	}
}
