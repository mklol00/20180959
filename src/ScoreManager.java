import java.util.Random;

public class ScoreManager {
    public static void main(String[] args) {
        String[] names = {"이재우","곽재우","김재우","박재우"};

        String[] subjects = {"국어","영어","수학"};
        int[][]score = new int[names.length][subjects.length];
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                score[i][j] = (int) (Math.random() * 101);

            }
        }
        int[] nameSum = new int[score.length];
        double[] nameAvg = new double[score.length];
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                nameSum[i] += score[i][j];
            }
            nameAvg[i] = Math.round((double) nameSum[i] / subjects.length * 100) / 100.0;

        }

        int[] subSum = new int[subjects.length];
        double[] subAvg = new double[subjects.length];
        for (int i = 0; i < subjects.length; i++) {
            for (int j = 0; j < score.length; j++) {
                subSum[i] += score[j][i];
            }
            subAvg[i] = Math.round((double) subSum[i] / score.length * 100) / 100.0;
        }

        int[] rank = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            rank[i] = 1;
            for (int j = 0; j < score.length; j++) {
                if (nameSum[i] < nameSum[j]) {

                    rank[i]++;
                }
            }
        }

        System.out.print("이름");
        for (int i = 0; i < subjects.length; i++) {
            System.out.print("\t" + subjects[i]);
        }
        System.out.println("\t합계\t평균\t석차");
        for (int i = 0; i < score.length; i++) {
            System.out.print(names[i]);

            for (int j = 0; j < score[i].length; j++) {
                System.out.print("\t" + score[i][j]);
            }
            System.out.println("\t" + nameSum[i] + "\t" + nameAvg[i] + "\t" + rank[i]);
        }

        System.out.print("과목합계");
        for (int i = 0; i < subSum.length; i++) {
            System.out.print("\t" + subSum[i]);
        }

        System.out.print("\n과목평균");
        for (int i = 0; i < subAvg.length; i++) {
            System.out.print("\t" + subAvg[i]);
        }

    }
}
