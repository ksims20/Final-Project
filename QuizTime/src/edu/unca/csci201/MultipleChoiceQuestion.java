package edu.unca.csci201;

import java.util.Scanner;

public class MultipleChoiceQuestion implements Question {

	
	private Answer Answer;
	private String Question;
	private Answer CorrectAnswer;
	private Answer[] PossibleAnswers;
	Scanner scan = new Scanner(System.in);
	
	public MultipleChoiceQuestion(String Question, Answer[] PossibleAnswers, Answer Answer) {
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
		
	
		
		if(PossibleAnswers == null) {
			throw new NoAnswersException();
		}
	
		
		return PossibleAnswers[Answer];
	}

	@Override
	public Answer getCorrectAnswer() throws NoCorrectAnswerException {
		
		if (CorrectAnswer == null) {
			throw new NoCorrectAnswerException();
		}
		
		
		
		return CorrectAnswer;
	}

	@Override
	public Answer convertResponseToAnswer(String userResponse) throws InvalidResponseException {
		
		if (userResponse == "1") {
			return Answer;
		}
		else if (userResponse == "2") {
			return Answer;
		}
		else if (userResponse == "3") {
			return Answer;
		}
		else if(userResponse == "4") {
			return Answer;
		}
		else {
			throw new InvalidResponseException();
		}
	}

}
