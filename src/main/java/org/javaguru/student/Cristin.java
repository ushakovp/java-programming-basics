package org.javaguru.student;

public class Cristin {

    // Функция перевода числа из 25-ричной системы в 10-ричную.
    public static long base25ToBase10(String number) {
        long result = 0;
        // Приводим строку к верхнему регистру для удобства.
        number = number.toUpperCase();

        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            int digit;
            // Если символ — цифра от '0' до '9'
            if (c >= '0' && c <= '9') {
                digit = c - '0';
            }
            // Если символ — буква от 'A' до 'O' (A=10, B=11, …, O=24)
            else if (c >= 'A' && c <= 'O') {
                digit = c - 'A' + 10;
            }
            else {
                throw new IllegalArgumentException("Недопустимый символ: " + c);
            }
            // Проверяем, что цифра входит в диапазон для 25-ричной системы (0..24)
            if (digit >= 25) {
                throw new IllegalArgumentException("Цифра выходит за пределы 25-ричной системы: " + c);
            }
            result = result * 25 + digit;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(base25ToBase10("oo"));
        String allowedChars = "0123456789ABCDEFGHIJKLMNO";
        for (char c : allowedChars.toCharArray()) {
            String s1 = "1%2%3%4%5".replace('%', c);
            String s2 = "2%024".replace('%', c);
            String s3 = "1%099".replace('%', c);
            long result = base25ToBase10(s1) + base25ToBase10(s2) + base25ToBase10(s3);
            System.out.println(c + " " +result + " " + result % 24);
        }
    }
}
