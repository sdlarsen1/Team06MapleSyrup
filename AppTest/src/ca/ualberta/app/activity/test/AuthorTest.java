package ca.ualberta.app.activity.test;

import junit.framework.TestCase;
import ca.ualberta.app.models.Author;

public class AuthorTest extends TestCase {
	public void testAuthor() {
		String username = "username";
		Author author = new Author(username);

		assertTrue("Author Login Name is not equal",
				username.equals(author.getUsername()));
	}
}
