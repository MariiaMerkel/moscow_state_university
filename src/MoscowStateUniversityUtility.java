public class MoscowStateUniversityUtility {
    private final MoscowStateUniversity[] students;

    public MoscowStateUniversityUtility(int amount) {
        this.students = new MoscowStateUniversity[amount];
    }
    public void add(MoscowStateUniversity student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                System.out.printf("%nСтудент %s добавлен.%n", student.getFullName());
                return;
            }
        }
        System.out.printf("%nДанные о студенте %s не добавлены, так как массив переполнен%n", student.getFullName());
    }
    public void printAll() {
        System.out.println("\nПолная информация о всех студентах: ");
        for (MoscowStateUniversity s : students) {
            if (s != null) {
                System.out.println("    " + s);
            }
        }
        System.out.println();
    }
}
