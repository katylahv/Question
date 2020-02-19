import java.util.ArrayList;

public class QuizRunner {
    public static void main(String[] args) {

         String multipleChoiceQuestion = "Kanye West's boastfully titled song, 'I am a God,' " +
                "includes the much-ridiculed lyric, 'Hurry up with my damn' what?";
         ArrayList<String> multipleChoiceAnswer = new ArrayList<>();
         multipleChoiceAnswer.add("Croissants");
         ArrayList<String> mcPossibleAnswers = new ArrayList<>();
         mcPossibleAnswers.add("Corn Dog");
         mcPossibleAnswers.add("Calzone");
         mcPossibleAnswers.add("Fish Tacos");

        String checkBoxQuestion = "Kanye West believes he is what of the following?";
        ArrayList<String> checkBoxAnswer = new ArrayList<>();
        checkBoxAnswer.add("Genius");
        checkBoxAnswer.add("A God");
        ArrayList<String> cbPossibleAnswers = new ArrayList<>();
        cbPossibleAnswers.add("Average");

        String trueFalseQuestion = "Kanye West considered changing his name to 'Christian Genius Billionaire Kanye West' in 2019";
        ArrayList<String> trueFalseAnswer = new ArrayList<>();
        trueFalseAnswer.add("True");
        String tfWrongAnswer = "False";

        multipleChoice mc = new multipleChoice(multipleChoiceAnswer,multipleChoiceQuestion,mcPossibleAnswers);
        checkBox cb = new checkBox(checkBoxAnswer,checkBoxQuestion,cbPossibleAnswers);
        trueFalse tf = new trueFalse(trueFalseAnswer,trueFalseQuestion,tfWrongAnswer);

        // create quiz class and add questions to quiz
        Quiz kanyeWest = new Quiz("Kanye West");
        kanyeWest.addQuestions(mc);
        kanyeWest.addQuestions(cb);
        kanyeWest.addQuestions(tf);
        kanyeWest.runQuiz();
        kanyeWest.gradeQuiz();
    }
}

