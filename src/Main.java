public class Main {
    public static void main(String[] args) {
        // задание 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        // задание 2
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

        //задание 3
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println(fullName);

        // задание 4
        /*
        Условие задачи на сайте отсутствует
         */

        // задание 5
        String[] array = fullName.split(" ");
        firstName = array[1];
        lastName = array[0];
        middleName = array[2];
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(middleName);

        // задание 6
        fullName = "ivanov ivan ivanovich";
        char[] chars = fullName.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        chars[fullName.indexOf(" ") + 1] = Character.toUpperCase(chars[fullName.indexOf(" ") + 1]);
        chars[fullName.lastIndexOf(" ") + 1] = Character.toUpperCase(chars[fullName.lastIndexOf(" ") + 1]);
        StringBuilder fullNameCorrect = new StringBuilder();
        for (char c : chars) {
            fullNameCorrect.append(c);
        }
        System.out.println(fullNameCorrect);

        // задание 7
        String firstString = "135";
        String secondString = "246";
        StringBuilder sumString = new StringBuilder();
        for (int i = 0; i < firstString.length(); i++) {
            sumString.append(firstString.charAt(i));
            sumString.append(secondString.charAt(i));
        }
        System.out.println(sumString);

        //задание 8
        String someString = "aabccddefgghiijjkk";
        StringBuilder correctString = new StringBuilder();
        for (int i = 0; i < someString.length() - 1; i++) {
            if (someString.charAt(i) == someString.charAt(i + 1)) {
                correctString.append(someString.charAt(i));
            }
        }
        System.out.println(correctString);
    }
}