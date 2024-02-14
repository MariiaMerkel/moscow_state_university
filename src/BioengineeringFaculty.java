import java.util.Objects;

public class BioengineeringFaculty extends MoscowStateUniversity {
    private final int nobility;
    private final int honor;
    private final int bravery;

    public BioengineeringFaculty(String name, String surName, int numeracy, int walking, int nobility, int honor, int bravery) {
        super(name, surName, numeracy, walking);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void findBetter(BioengineeringFaculty student) {
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
        return this.getNobility() + this.getHonor() + this.getBravery();
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return String.format("%s: благородство: %d, честь: %d, храбрость - %d", super.toString(), nobility, honor, bravery);
    }
}