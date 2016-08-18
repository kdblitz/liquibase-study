package models;

import liquibase.ext.hibernate.customfactory.CustomClassicConfigurationFactory;
import liquibase.ext.hibernate.database.HibernateDatabase;
import liquibase.ext.hibernate.database.connection.HibernateConnection;
import org.hibernate.cfg.Configuration;

public class LiquibaseConfig implements CustomClassicConfigurationFactory {
	@Override
	public Configuration getConfiguration(HibernateDatabase hibernateDatabase, HibernateConnection connection) {
		Configuration configuration = new Configuration();
		configuration.addAnnotatedClass(TestEntity.class);

		return configuration;
	}
}
