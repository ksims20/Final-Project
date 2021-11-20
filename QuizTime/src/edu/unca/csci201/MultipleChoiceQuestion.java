package edu.unca.csci201;

public class MultipleChoiceQuestion implements Question {

	
	private String Answer;
	private String Question;
	
	private Answer CorrectAnswer;
	
	public MultipleChoiceQuestion(String Answer, String Question) {
		this.Answer = Answer;
		this.Question = Question;
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
		
		return null;
	}

}
