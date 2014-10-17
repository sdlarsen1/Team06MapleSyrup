package ca.ualberta.app.activity.test;

import java.util.ArrayList;
import java.util.List;

import android.graphics.Bitmap;

import ca.ualberta.app.models.Question;
import ca.ualberta.app.models.InputsListModel;
import junit.framework.TestCase;

public class InputsListTest extends TestCase {
	public void testQuestionList() {
		InputsListModel questionList = new InputsListModel();
		List<Question> quesList = questionList.getList();
		ArrayList<Question> quesArrayList = questionList.getArrayList();
		assertTrue("Empty Question List", quesList.size() == 0);
		assertTrue("Empty Question Array List", quesArrayList.size() == 0);
	}

	public void testaddQuestion() {
		String questionString = "A Question";
		int userID = 123;
		String titleString = "A title";
		Bitmap image = null;
		Question question = new Question(questionString, userID, titleString,
				image);
		InputsListModel questionList = new InputsListModel();
		questionList.addQuestion(question);
		ArrayList<Question> quesArrayList = questionList.getArrayList();
		assertTrue("Question List Size", quesArrayList.size() == 1);
		assertTrue("Question List contains question",
				quesArrayList.contains(question));
	}

	public void testremoveQuestion() {
		String questionString = "A question";
		int userID = 123;
		String titleString = "A title";
		Bitmap image = null;

		Question question = new Question(questionString, userID, titleString,
				image);
		InputsListModel questionList = new InputsListModel();
		questionList.addQuestion(question);
		questionList.removeQuestion(0);
		ArrayList<Question> quesArrayList = questionList.getArrayList();
		assertTrue("Question List Size", quesArrayList.size() == 0);
	}
}
