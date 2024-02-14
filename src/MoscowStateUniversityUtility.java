public class MoscowStateUniversityUtility {

    public static void findBetter(MoscowStateUniversity one, MoscowStateUniversity two) {
        if (one != two && one != null && two != null) {
            if (sumCommonProperties(one) > sumCommonProperties(two)) {
                System.out.printf("%s имеет преимущества по способностям ходьбы и счёта перед со студентом %s.%n", one.getFullName(), two.getFullName());
            } else if (sumCommonProperties(one) == sumCommonProperties(two)){
                System.out.printf("%s и %s равносильны по способностям ходьбы и счёта.%n", one.getFullName(), two.getFullName());
            } else {
                System.out.printf("%s имеет преимущества по способностям ходьбы и счёта перед студентом %s.%n", two.getFullName(), one.getFullName());
            }
        } else {
            System.out.println("Введены некорректные данные");
        }
    }
    public static int sumCommonProperties(MoscowStateUniversity student) {
        return student.getNumeracy() + student.getWalking();
    }
}
