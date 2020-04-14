import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bookstoreproject.entity.Users;

public class UsersTest {

	public static void main(String[] args) {
		Users user1 = new Users();
		user1.setEmail("tlarke@tpg.com.au");
		user1.setFullName("Troy Larke");
		user1.setPassword("wiggle");
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BookStoreProject");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		 
		entityManager.persist(user1);
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		
		System.out.println("User Persisted");
	}

}
