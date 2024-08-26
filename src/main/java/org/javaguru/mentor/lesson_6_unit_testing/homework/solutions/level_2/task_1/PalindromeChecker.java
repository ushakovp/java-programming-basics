package org.javaguru.mentor.lesson_6_unit_testing.homework.solutions.level_2.task_1;

class PalindromeChecker {

    public boolean isPalindrome(String text) {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }

}
