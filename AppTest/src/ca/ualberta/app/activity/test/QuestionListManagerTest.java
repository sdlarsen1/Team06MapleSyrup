package ca.ualberta.app.activity.test;

import android.graphics.Bitmap;
import ca.ualberta.app.models.Question;
import ca.ualberta.app.models.QuestionListManager;
import junit.framework.TestCase;

public class QuestionListManagerTest extends TestCase {
	public void testAddQuestion(){
		String questionString = "A Question";
		String userName = "userName";
		String titleString = "title";
		Bitmap image = null;
		Question question = new Question(questionString, userName, titleString,
				image);
		QuestionListManager questionListManager = new QuestionListManager();
		questionListManager.addQuestion(question);
		Question result = questionListManager.getQuestion(question.getID());
		
		assertEquals(question.getContent(), result.getContent());
		assertEquals(question.getAuthor(), result.getAuthor());
		assertEquals(question.getTitle(), result.getTitle());
		assertEquals(question.getID(), result.getID());
		
		questionListManager.deleteQuestion(question.getID());
	}
	
	public void testGetQuestion(){
		String questionString = "A Question";
		String userName = "userName";
		String titleString = "title";
		Bitmap image = null;
		Question question = new Question(questionString, userName, titleString,
				image);
		QuestionListManager questionListManager = new QuestionListManager();
		questionListManager.addQuestion(question);
		Question result = questionListManager.getQuestion(question.getID());
		
		assertEquals(question.getContent(), result.getContent());
		assertEquals(question.getAuthor(), result.getAuthor());
		assertEquals(question.getTitle(), result.getTitle());
		assertEquals(question.getID(), result.getID());
		
		questionListManager.deleteQuestion(question.getID());
	}
	
}