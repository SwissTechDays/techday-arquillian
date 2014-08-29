package ch.sopra.techday.arquillian;

import javax.ejb.EJB;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import ch.sopra.techday.arquillian.domain.User;
import ch.sopra.techday.arquillian.user.UserService;

/**
 * Phase 2.1 : création de la classe.
 * 
 * @author pescobar
 */
@RunWith(Arquillian.class)
public class ArquillianTest {

	/**
	 * Phase 4 : création de l'archive.
	 * 
	 * @return
	 */
	@Deployment
	public static JavaArchive createTestArchive() {
		return ShrinkWrap
				.create(JavaArchive.class, "arquillian.jar")
				.addPackage("ch.sopra.techday.arquillian.domain")
				.addClass(UserService.class)
				.addAsManifestResource("META-INF/persistence.xml",
						"persistence.xml");
	}

	/**
	 * Phase 2.2 : dummy test.
	 */
	@Test
	public void dummyTest() {
		Assert.assertTrue(true);
	}

	/**
	 * Phase 4 : injection EJB testé.
	 */
	@EJB
	private UserService userSerivce;

	/**
	 * Phase 4 : Test persistance.
	 */
	@Test
	public void persistenceTest() {
		User user = new User("lastname", "firstname");
		Long id = userSerivce.persist(user);
		Assert.assertNotNull(id);
	}
}
