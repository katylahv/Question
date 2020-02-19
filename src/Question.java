import java.util.ArrayList;
import java.util.HashMap;


public class Question {
    private ArrayList<String> answer;
    private String question;

    public Question(ArrayList<String> aAnswer, String aQuestion){
        this.answer = aAnswer;
        this.question = aQuestion;
    }

    public ArrayList<String> getAnswer() {
        return this.answer;
    }
    public void setAnswer(ArrayList<String> answer) {
        this.answer = answer;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public String getQuestion(){
        return this.question;
    }


    public HashMap<String, String> displayChoices() {
        HashMap<String, String> choicesHashMap = new HashMap<>();
        String alphabet = "ABCD";
        for (String choice : this.answer) {
            choicesHashMap.put((alphabet.split(""))[this.answer.indexOf(choice)], choice);
        }
        return choicesHashMap;
    }

}
