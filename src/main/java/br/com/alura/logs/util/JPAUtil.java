package br.com.alura.logs.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	//chamando o banco de dados
		private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("logs");

		public static EntityManager getEntityManager() {
			return FACTORY.createEntityManager();
		}
}
