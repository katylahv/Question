import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    public int scores;
    public ArrayList<Object> quizQuestions = new ArrayList<>();
    public String quizName;
    public int finalScore;

    public Quiz(String aQuizName) {
        this.quizName = aQuizName;
    }

    // add questions
    public void addQuestions(Object aQuestionClass) {
        this.quizQuestions.add(aQuestionClass);
    }

    // run test
    public void runQuiz() {
        // iterate through quizQuestions
        Scanner input = new Scanner(System.in);
        String attempt;

        Question questionSet = null;
        for (Object aClass : quizQuestions) {
            if (aClass.getClass().getName().equals("multipleChoice")) {
                questionSet = (multipleChoice) aClass;
            } else if (aClass.getClass().getName().equals("checkBox")) {
                questionSet = (checkBox) aClass;
            } else if (aClass.getClass().getName().equals("trueFalse")) {
                questionSet = (trueFalse) aClass;
            }

            System.out.println(questionSet.getQuestion() + "\n \t*** Enter the Corresponding Letter(s) to your Answer *** \n" + questionSet.displayChoices() +" \n");
            attempt = input.nextLine();
            if (!attempt.toUpperCase().equals("A")){
                System.out.println("Sorry! you dont love Kanye the way Kanye loves Kanye \n\n");

            } else {
                System.out.println("kanYAY! correct answer! \n\n");
                this.scores++;
            }

        }

    }
    // grade
    public void gradeQuiz(){
        int finalScore = (this.scores / this.quizQuestions.size());
        System.out.println("Your total score for the quiz is: " + (finalScore * 100) + "%");
        if (finalScore >= 75){
            System.out.println("great job!");
        } else {
            System.out.println("better luck next time.");
        }
    }
}
