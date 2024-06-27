package class1;

import java.sql.SQLOutput;

public class ClassStart2 {

    public static void main(String[] args) {// psvm 입력 후 엔터 치면 다 입력하지 않아도 됨.

        String[] studentNames = {"학생1", "학생2", "학생3", "학생4"};
        int[] studentAges = {15, 16, 17, 20};
        int[] studentGrades = {90, 80, 70, 60};


        for (int i = 0; i < studentNames.length; i++){
            System.out.println("이름:" + studentNames[i] + " 나이:" + studentAges[i] + " 성적:" + studentGrades[i]);
        }


    }
}
