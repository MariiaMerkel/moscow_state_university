import java.util.Objects;

public class MoscowStateUniversity {
    private String name;
    private String surName;
    private int nobility;
    private int honor;
    private int bravery;
    private int industriousness;
    private int fidelity;
    private int honesty;
    private int wisdom;
    private int mind;
    private int creativity;
    private int ingenuity;
    private int determination;
    private int leadership;
    private int numeracy;
    private int walking;

    public MoscowStateUniversity(String name,
                                 String surName,
                                 int nobility,
                                 int honor,
                                 int bravery,
                                 int industriousness,
                                 int fidelity,
                                 int honesty,
                                 int wisdom,
                                 int mind,
                                 int creativity,
                                 int ingenuity,
                                 int determination,
                                 int leadership,
                                 int numeracy,
                                 int walking) {
        this.name = name;
        this.surName = surName;
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
        this.industriousness = industriousness;
        this.fidelity = fidelity;
        this.honesty = honesty;
        this.wisdom = wisdom;
        this.mind = mind;
        this.creativity = creativity;
        this.ingenuity = ingenuity;
        this.determination = determination;
        this.leadership = leadership;
        this.numeracy = numeracy;
        this.walking = walking;
    }
    public void print() {
        System.out.println(this);
    }

    public void findBetter(MoscowStateUniversity student) {
        if (this != student && student != null) {
            if (this.sumCommonProperties() > student.sumCommonProperties()) {
                System.out.printf("%n%s имеет преимущества по способностям ходьбы и счёта перед со студентом %s.%n", this.getFullName(), student.getFullName());
            } else if (this.sumCommonProperties() == student.sumCommonProperties()){
                System.out.printf("%n%s и %s равносильны по способностям ходьбы и счёта.%n", student.getFullName(), this.getFullName());
            } else {
                System.out.printf("%n%s имеет преимущества по способностям ходьбы и счёта перед студентом %s.%n", student.getFullName(), this.getFullName());
            }
        } else {
            System.out.println("Введены некорректные данные");
        }
    }
    public int sumCommonProperties() {
        return numeracy + walking;
    }

    public String getFullName(){
        return name + ' ' + surName;
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

    public int getIndustriousness() {
        return industriousness;
    }

    public int getFidelity() {
        return fidelity;
    }

    public int getHonesty() {
        return honesty;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getMind() {
        return mind;
    }

    public int getCreativity() {
        return creativity;
    }

    public int getIngenuity() {
        return ingenuity;
    }

    public int getDetermination() {
        return determination;
    }

    public int getLeadership() {
        return leadership;
    }
    @Override
    public String toString() {
        return String.format("%s %s: благородство - %d, честь - %d, храбрость - %d, трудолюбие - %d, верность - %d, честность - %d, мудрость - %d, ум - %d, творчество - %d, смекалка - %d, решительность - %d, лидерство - %d, счёт - %d, ходьба - %d."
                , name, surName, nobility, honor, bravery, industriousness, fidelity, honesty, wisdom, mind, creativity, ingenuity, determination, leadership, numeracy, walking);
    }

}
