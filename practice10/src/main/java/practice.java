import java.util.Scanner;

public class practice {

    public static void main(String[] args) {
        String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] cardNumbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "king"};

                int randomShapeIndex = (int)(Math.random() * (shapes.length) );
                int randomCardNumberIndex = (int)(Math.random() * cardNumbers.length);

                System.out.println("당신이 뽑은 카드는? " + shapes[randomShapeIndex] + " " + cardNumbers[randomCardNumberIndex] + "카드 입니다.");

                int[] scores =new int[5];

                Scanner sc = new Scanner(System.in);

                for(int i = 0; i < scores.length; i++) {
                    System.out.println( (i+1) + "번 째 학생의 자바 점수를 입력해주세요 : ");
                    scores[i] = sc.nextInt();
                }

                double sum = 0.0;
                double avg = 0.0;

            for(int i = 0; i < scores.length; i++) {
                sum += scores[i];
            }

            avg = sum / scores.length;

        System.out.println("sum : " + sum);
        System.out.println("avg : " + avg);


        }
    }

