import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Task number 1");

        String firsName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firsName + " " + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);

        System.out.println();
        System.out.println("Task number 2");

        System.out.println(fullName.toUpperCase());

        System.out.println();
        System.out.println("Task number 3");

        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println(fullName);
    }
}