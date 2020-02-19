import java.util.ArrayList;

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


    public String displayChoices(){
        ArrayList<String> choices = new ArrayList<>();
        for (String answers : answer) {
            choices.add(answers);
        }
        return choices.get(0);
    }

}
