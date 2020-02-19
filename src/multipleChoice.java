import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class multipleChoice extends Question {
    private ArrayList<String> wrongAnswers;

    public multipleChoice(ArrayList<String> aAnswer,
                          String aQuestion,
                          ArrayList<String> aWrongAnswers) {
        super(aAnswer, aQuestion);
        this.wrongAnswers = aWrongAnswers;
    }

    public ArrayList<String> getWrongAnswers() {
        return wrongAnswers;
    }

    public void setWrongAnswers(ArrayList<String> wrongAnswers) {
        this.wrongAnswers = wrongAnswers;
    }

    @Override
    public String displayChoices(){
        ArrayList<String> choices = new ArrayList<>();
        for (String answers : super.getAnswer()) {
            choices.add(answers);
        }
        for (String wrongAnswers : this.wrongAnswers){
            choices.add(wrongAnswers);
        }
        return "A: " + choices.get(0) + "\t B: " + choices.get(1)+
                "\nC: " + choices.get(2) + "\t D: " + choices.get(3);
    }
}
