public class Main {
    public static void main(String[] args) {

        // ДЗ 1.
        System.out.println("   ДЗ 1.");

        // Задание 1.
        System.out.println("   Задание 1.");
        String lastName = "Ivanov";
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String fullName = "Ivanov " + "Ivan " + "Ivanovich ";
        System.out.println("ФИО сотрудника — " + fullName);


        // Задание 2.
        System.out.println("   Задание 2.");
        String fullName2 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName2 );


        // Задание 3.
        System.out.println("   Задание 3.");
        String fullName3 = "Иванов Семён Семёнович";
        String fullName4 = fullName3.replace('ё' , 'е');
        System.out.println(fullName4);

    }
}