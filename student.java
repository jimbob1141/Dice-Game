    import java.util.Random;
    import java.util.Scanner;
    public class student {
        public static void main(String[] args) {
            Random die = new Random();
            Scanner sc = new Scanner(System.in);
            student test = new student();
            int a;
            int score = 0;
            while (score < 100) {
                System.out.println("Please enter a number between 1-6");
                a = sc.nextInt();
                int i = 1 + die.nextInt(6);
                if (a <= 0 || a > 6) {
                    System.out.println("Please enter a number within the specified range");
                } else if (a == i) {
                    System.out.println("You chose: " + a);
                    System.out.println("Die result: " + i);
                    System.out.println("It's a match +100 points");
                    score += 100;
                    System.out.println("Your score is: " + score);
                } else if (a != i) {
                    System.out.println("You chose: " + a);
                    System.out.println("Die result: " + i);
                    System.out.println("No match -15 points");
                    score -= 15;
                    System.out.println("Your score is: " + score);
                }
                  if (score >= 100) {
                    System.out.println("Congratulations, you win");
                    System.out.println("Final score: " + score);
                    test.playAgain();

                }

            }
        }
            public void playAgain(){
            System.out.println("Play again? y/n");
            Scanner sc = new Scanner(System.in);
            student james = new student();
            String f = sc.next();
            if (f.equals("y")){
                student.main(null);
                }
                else if(f.equals("n")){
                }
                    else{
                    System.out.println("Please enter a valid character y or n");
                    james.playAgain();
                    }
            }
        }








