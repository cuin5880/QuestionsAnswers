import java.util.HashMap;
import java.util.Random;

/*	Author: Noemi Cuin
 * 	Class: CST 438
 * 	Description: Assignment 1
 * 	Date: 9*6*15
 */




/**
* A half-secretive map of questions to answers (at most one answer per question). * Gives out random questions (keys) from the map, and
* can be queried to test if a given question maps to a given answer.
*/
public class QuestionsAnswers 
{ 
	/**
	* Maps question to answer.
	*/
	
	public static HashMap<String, String> QandA = new HashMap<String, String>();
	
	
	void put(String question, String answer) 
	{ 
		QandA.put(question, answer);
		
	}
	
	/**
	* Queries if question maps to answer. 
	* */
	static boolean testAnswer(String question, String answer) 
	{
		
		if(QandA.containsKey(question))
		{
			if(QandA.get(question).equals(answer))
			{
				return true;
			}
		}
		
		
		return false;
	
	}
	/**
	* Gives out a random question from the key set. 
	* */
	String getRandomQuestion() 
	{ 
		
		Random random = new Random();
		String randomQues = QandA.get(random.nextInt(QandA.size()) );
		//String value= QandA.get(randomQues);
		
		
		return randomQues;
	
	} 





}
