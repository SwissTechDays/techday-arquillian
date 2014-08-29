package ch.sopra.techday.arquillian.user;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ch.sopra.techday.arquillian.domain.User;

/**
 * Phase 4 : création EJB.
 * 
 * @author pescobar
 *
 */
@Stateless
public class UserService {

	/**
	 * Phase 4 : injection entity manager
	 */
	@PersistenceContext(unitName = "arquillian-pu")
	private EntityManager entityManager;

	public Long persist(User user) {
		entityManager.persist(user);
		return user.getId();
	}

}
