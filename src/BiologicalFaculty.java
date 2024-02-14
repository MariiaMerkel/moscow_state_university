public class BiologicalFaculty extends MoscowStateUniversity{
    private final int industriousness;
    private final int fidelity;
    private final int honesty;

    public BiologicalFaculty(String name, String surName, int numeracy, int walking, int industriousness, int fidelity, int honesty) {
        super(name, surName, numeracy, walking);
        this.industriousness = industriousness;
        this.fidelity = fidelity;
        this.honesty = honesty;
    }

    public void findBetter(BiologicalFaculty student) {
        if (this != student && student != null) {
            if (this.sumProperties() > student.sumProperties()) {
                System.out.printf("%s имеет преимущества по способностям перед одногруппником %s.%n", this.getFullName(), student.getFullName());
            } else if (this.sumProperties() == student.sumProperties()){
                System.out.printf("%s и %s равносильны по способностям.%n", student.getFullName(), this.getFullName());
            } else {
                System.out.printf("%s имеет преимущества по способностям перед одногруппником %s.%n", student.getFullName(), this.getFullName());
            }
        } else {
            System.out.println("Введены некорректные данные");
        }
    }

    public int sumProperties() {
        return this.getIndustriousness() + this.getFidelity() + this.getHonesty();
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getFidelity() {
        return fidelity;
    }

    public int getHonesty() {
        return honesty;
    }
    @Override
    public String toString() {
        return String.format("%s: трудолюбие - %d, верность - %d, честность - %d", super.toString(), industriousness, fidelity, honesty);
    }
}
