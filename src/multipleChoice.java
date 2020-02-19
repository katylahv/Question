
import java.util.ArrayList;
import java.util.HashMap;


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
    public HashMap<String, String> displayChoices() {
        ArrayList<String> choices = new ArrayList<>();
        HashMap<String, String> choicesHashMap = new HashMap<String, String>();
        String toDisplay ="";
        String alphabet = "ABCD";

        for (String answers : super.getAnswer()) {
            choices.add(answers);
        }
        for (String wrongAnswers : this.wrongAnswers) {
            choices.add(wrongAnswers);
        }

        for (String choice : choices) {
            choicesHashMap.put((alphabet.split(""))[choices.indexOf(choice)] , choice);
        }

        return choicesHashMap;
    }
}
