
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    double score = 0;
    public ArrayList<Object> quizQuestions = new ArrayList<>();
    public String quizName;

    public Quiz(String aQuizName) {
        this.quizName = aQuizName;
    }

    // add questions
    public void addQuestions(Object aQuestionClass) {
        this.quizQuestions.add(aQuestionClass);
    }

    // run test
    public void runQuiz() {

        Scanner input = new Scanner(System.in);
        String attempt;
        ArrayList<String> attempts = new ArrayList<>();
        Question questionSet = null;
        String toDisplay = "";

        System.out.println("\t\t\t\t\t\tWelcome to the " + this.quizName + "Quiz!!! " + "\n\n\t\t\t\t*** Enter the Corresponding Letter(s) to your Answer *** \n");
        // cast questions to appropriate type
        for (Object aClass : quizQuestions) {
            if (aClass.getClass().getName().equals("multipleChoice")) {
                questionSet = (multipleChoice) aClass;
            } else if (aClass.getClass().getName().equals("checkBox")) {
                questionSet = (checkBox) aClass;
            } else if (aClass.getClass().getName().equals("trueFalse")) {
                questionSet = (trueFalse) aClass;
            }

            // create string for hashmap
            for (String letter : questionSet.displayChoices().keySet()){
                toDisplay += letter +": "+ questionSet.displayChoices().get(letter) + "\t";
            }
            // print question
            System.out.println(questionSet.getQuestion()+"\n"+ toDisplay + " \n");
            // get user input
            attempt = input.nextLine();
            attempts.add(attempt.toUpperCase());
            // if it's a checkbox class, input again
            if (questionSet instanceof checkBox){
                System.out.println("enter another one!");
                attempt = input.nextLine();
                attempts.add(attempt.toUpperCase());
                if (questionSet.getAnswer().contains(questionSet.displayChoices().get(attempts.get(0)))
                        && questionSet.getAnswer().contains(questionSet.displayChoices().get(attempts.get(1)))) {
                    System.out.println("kanYAY! correct answer! \n\n");
                    score += 1;
                } else if (questionSet.getAnswer().contains(questionSet.displayChoices().get(attempts.get(0)))
                        || questionSet.getAnswer().contains(questionSet.displayChoices().get(attempts.get(1)))){
                    System.out.println("One of two correct! here's half a point \n\n");
                    score += .5;
                }
            } else {
                // if the attempt isn't the key that returns the answer, it's incorrect
                if (!questionSet.displayChoices().get(attempts.toString().replace("[", "").replace("]", "")).equals(questionSet.getAnswer().toString().replace("[", "").replace("]", ""))) {
                    System.out.println("Sorry! you dont love Kanye the way Kanye loves Kanye \n\n");
                } else {
                    System.out.println("kanYAY! correct answer! \n\n");
                    score += 1;
                }
            } // end instanceof elseIf
            // clear display string
            toDisplay="";
            //clear attempts array
            attempts.clear();
        }
    }

    // grade
    public String gradeQuiz(){
        String finalMessage = "";
        double finalScore = (this.score / quizQuestions.size()) * 100;
        finalMessage += "Your total score for the quiz is: " + Math.round(finalScore * 100.0)/100.0 + "%";
        if (finalScore >= 75.0){
            finalMessage+= ". \n\n Great job!";
        } else {
            finalMessage += ". \n\n better luck next time.";
        }
        return finalMessage;
    }
}
