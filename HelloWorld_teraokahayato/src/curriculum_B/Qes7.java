package curriculum_B;

import java.util.Scanner;

public class Qes7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 生徒の人数が2人以上の場合のみループ処理を行う
        int studentCount;
        do {
            System.out.print("生徒の人数を入力してください（2以上）: ");
            studentCount = scanner.nextInt();
        } while (studentCount < 2);

        String[] subjects = {"英語", "数学", "理科", "社会"};
        int[][] scores = new int[studentCount][subjects.length];

        // 科目の点数の入力をすると次の科目が出るように処理
        for (int i = 0; i < studentCount; i++) {
            for (int j = 0; j < subjects.length; j++) {
            	System.out.print(String.format((i + 1) + "人目の『" + (subjects[j]) + "』点数を入力してください："));
                scores[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        // 各生徒の平均点を出力
        System.out.println();
        for (int i = 0; i < studentCount; i++) {
            int sum = 0;
            for (int j = 0; j < subjects.length; j++) {
                sum += scores[i][j];
            }
            double average = (double) sum / subjects.length;
            System.out.printf("%d人目の平均点は%.2f点です。\n" , (i + 1), average);
        }

        // 科目ごとの平均点と全体の平均点を出力
        System.out.println();
        double totalSum = 0;
        int totalSubjects = studentCount * subjects.length;

        for (int j = 0; j < subjects.length; j++) {
            int subjectSum = 0;
            for (int i = 0; i < studentCount; i++) {
                subjectSum += scores[i][j];
            }
            double subjectAvg = (double) subjectSum / studentCount;
            totalSum += subjectSum;
            System.out.printf( "%sの平均点は%.2f点です。\n" ,subjects[j], subjectAvg);
            System.out.println();
        }

        System.out.printf("全体の平均点は%.2f点です。\n" , (totalSum / totalSubjects) );

        scanner.close();
    }
}

