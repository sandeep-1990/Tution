package co.in.springcrud.factory;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateConnectionFactory {
	public final static Logger LOG = Logger.getLogger(HibernateConnectionFactory.class);
	 private static StandardServiceRegistry standardServiceRegistry;

	    private static SessionFactory sessionFactory;

	    static {
	        try {
	            if (sessionFactory == null) {
	               
	                standardServiceRegistry = new StandardServiceRegistryBuilder().configure().build();
	                Metadata metaData = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
	                sessionFactory = metaData.getSessionFactoryBuilder().build();
	                LOG.info("Session Factory is Null");
	            }
	        } catch (HibernateException e) {
	            LOG.error("Exception is raised from HibernateConnection Factory",e);
	            e.printStackTrace();
	            if (standardServiceRegistry != null) {
	                StandardServiceRegistryBuilder.destroy(standardServiceRegistry);
	            }
	        }
	    }

	    public static SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }
	    
	   public static void main(String[] args) {
		System.out.println(getSessionFactory());
	}
}
