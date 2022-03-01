package bardo;

public class Question {
    private String[] Options;
    private int AnswerIndex;
    private String Question;

    public Question(String[] options, int answerIndex, String question) {
        Options = options;
        AnswerIndex = answerIndex;
        Question = question;
    }
    public static int getAnswerIndex(char letter){
        switch (letter){
            case 'A':
                return 0;
            case 'B':
                return 1;
            case 'C':
                return 2;
            case 'D':
                return 3;
            default:
                return -1;
        }
    }
}
