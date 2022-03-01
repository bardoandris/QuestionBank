package bardo;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {
    private Scanner scr;
    private File file;

    public Reader(String FileName) {
        file = new File(FileName);
        RedeclareScanner();
    }
    private void RedeclareScanner(){
        try {
            scr = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public int CountQuestions(){
        int count = 0;
        for (;scr.hasNextLine();scr.nextLine()){
            count++;
        }
        RedeclareScanner();
        if (count % 6 == 0) { //If not divisible, then invalid file
            return count;
        }
        else{
            return 0;
        }
    }
    public Question[] ReadQuestions(int count) {
        int index;
        String[] AnswerOptions = new String[4];
        String QuestionText;
        Question[] questions= new Question[count/6];
        for (int i = 0; i< count / 6; i++){
            QuestionText = scr.nextLine();
            for (int j = 0; j < 4; j++){
                AnswerOptions[j] = scr.nextLine();
            }
            String indexString = scr.nextLine();
            index = Question.getAnswerIndex(indexString.toCharArray()[indexString.length()-1]);
            questions[i] = new Question(AnswerOptions.clone(), index, QuestionText);
        }

        return questions;
    }
}
