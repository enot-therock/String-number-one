import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Task number 1");

//        String phone = "+960-415 75-37";
//        phone = phone.replace("-", "");
//        phone = phone.replace(" ", "");
//        phone = phone.replace("+", "");
//        if (phone.length() == 10) {
//            phone = "7" + phone;
//        } else if (phone.length() > 11) {
//            throw new RuntimeException("Телефон слишком длинный");
//        } else if (phone.length() < 10) {
//            throw new RuntimeException("Телефон слишком короткий");
//        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
//            throw new RuntimeException("Телефон не преднадлежит региону РФ");
//        }
//        System.out.println("phone = " + phone);
//        String expectedPhone = "79604157537";
//        if (phone.equals(expectedPhone)) {
//            System.out.println("Успех");
//        } else {
//            System.out.println("Неудача");
//        }

        String firsName = "Ivan ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName + firsName + middleName;
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