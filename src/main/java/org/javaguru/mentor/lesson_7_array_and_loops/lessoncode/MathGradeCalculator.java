package org.javaguru.mentor.lesson_7_array_and_loops.lessoncode;

class MathGradeCalculator {

    int findMaxGrade(int[] grades) {
        int maxGrade = grades[0];
        for (int i = 0; i < grades.length; i++) {
            if (maxGrade < grades[i]) {
                maxGrade = grades[i];
            }
        }
        return maxGrade;
    }

    int findMinGrade(int[] grades) {
        int minGrade = grades[0];
        for (int i = 0; i < grades.length; i++) {
            if (minGrade > grades[i]) {
                minGrade = grades[i];
            }
        }
        return minGrade;
    }


}
