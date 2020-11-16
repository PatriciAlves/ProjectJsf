package br.com.jpautil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static EntityManagerFactory factory = null;
	static {
		init();
	}

	public static void init() {
		try {

			if (factory == null) {
				factory = Persistence.createEntityManagerFactory("firstprojectjsf");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static EntityManager getEntityManager() {
		return factory.createEntityManager();

	}
	public static Object getPrimaryKey(Object entity) {
		return factory.getPersistenceUnitUtil().getIdentifier(entity);
	}
	public static Object getPrimaryKeyObject(Object entity) {
		return factory.getPersistenceUnitUtil().getIdentifier(entity);
	}
}

		
	