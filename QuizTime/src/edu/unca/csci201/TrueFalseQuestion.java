package edu.unca.csci201;

import java.util.Scanner;

public class TrueFalseQuestion implements Question {

	
	private Answer Answer;
	private String Question;
	private Answer CorrectAnswer;
	private Answer[] PossibleAnswers;
	Scanner scan = new Scanner(System.in);
	
	
	public TrueFalseQuestion(String Question, Answer[] PossibleAnswers, Answer Answer) {
		this.Question = Question;
		this.PossibleAnswers = PossibleAnswers;
		this.Answer = Answer;
	}

	@Override
	public String getTextPrompt() {
		
		return Question;
	}


	@Override
	public Answer[] getPossibleAnswers() throws NoAnswersException {
		
		
		
		return null;
	}

	@Override
	public Answer getCorrectAnswer() throws NoCorrectAnswerException {
		
		return CorrectAnswer;
	}

	@Override
	public Answer convertResponseToAnswer(String userResponse) throws InvalidResponseException {

		if (userResponse == "True") {
			return Answer;
		}
		else if (userResponse == "False") {
			return Answer;
		}
		else {
			throw new InvalidResponseException();
		}
		
	}

}
