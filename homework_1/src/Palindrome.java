public class Palindrome {

    /**
     * Метод проверяет, является ли введенная строка палиндромом,
     * игнорируя регистр и знаки препинания.
     * 
     * @param input Строка, которую нужно проверить на палиндром.
     * @return true, если строка является палиндромом, false в противном случае.
     * 
     * @author VovaSergeev
     */

    public static boolean isPalindrome(String input) {
        // Приводим строку к нижнему регистру и инициализируем указатели следования по
        // строке
        input = input.toLowerCase();
        int left = 0; // указатель на левый символ
        int right = input.length() - 1; // указатель на правый символ

        // Проверка палиндромности с обоих концов строки движением указателей
        while (left < right) {
            char leftChar = input.charAt(left);
            char rightChar = input.charAt(right);

            // Пропускаем символы, которые не являются буквами или цифрами, двигая указатели
            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
            } 
            else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            }
            // Если символы не совпадают, строка не является палиндромом
            else if (leftChar != rightChar) {
                return false;
            }
            // Если символы совпадают, двигаем указатели к центру строки
            else {
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Примеры строк для проверки на палиндром
        String[] testStrings = {
                "А роза упала на лапу Азора",
                "Иди, Сеня, не сиди",
                "Быть иль не быть - вот в этом Вопрос",
                "1234321"
        };

        for (String testString : testStrings) {
            String result = isPalindrome(testString) ? "" : "не ";
            System.out.println("Предложение \"" + testString + "\" " + result + "является палиндромом.");
        }
    }
}
