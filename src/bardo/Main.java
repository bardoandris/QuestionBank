package bardo;

public class Main {

    public static void main(String[] args) {
    QuestionList QL = new QuestionList();
    Reader R = new Reader("Data/Ep02_questions.txt");
    QL.setQuestions(
            R.ReadQuestions(R.CountQuestions()));
    System.out.println("finished");
    }
}
