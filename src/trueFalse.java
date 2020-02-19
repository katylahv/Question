import java.util.ArrayList;

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
    public String displayChoices(){
        ArrayList<String> choices = new ArrayList<>();
            choices.add(super.getAnswer().get(0));
            choices.add(this.wrongAnswer);
        return "A: " + choices.get(0) + "\t B: " + choices.get(1);
    }
}
