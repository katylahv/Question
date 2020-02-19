import java.util.ArrayList;
import java.util.HashMap;

public class trueFalse extends Question{
    private String wrongAnswer;

    public trueFalse (ArrayList<String> aAnswer,
                      String aQuestion,
                      String aWrongAnswer){
        super(aAnswer,aQuestion);
        this.wrongAnswer = aWrongAnswer;
    }

    public String getWrongAnswer() {
        return wrongAnswer;
    }

    public void setWrongAnswer(String wrongAnswer) {
        this.wrongAnswer = wrongAnswer;
    }

    @Override
    public HashMap<String, String> displayChoices() {
        ArrayList<String> choices = new ArrayList<>();
        HashMap<String, String> choicesHashMap = new HashMap<>();
        String alphabet = "AB";
            choices.add(super.getAnswer().get(0));
            choices.add(this.wrongAnswer);

        for (String choice : choices) {
            choicesHashMap.put((alphabet.split(""))[choices.indexOf(choice)], choice);
        }

        return choicesHashMap;
    }
}
