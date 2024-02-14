public class ChemicalFaculty extends MoscowStateUniversity{
    private final int wisdom;
    private final int mind;
    private final int creativity;

    public ChemicalFaculty(String name, String surName, int numeracy, int walking, int wisdom, int mind, int creativity) {
        super(name, surName, numeracy, walking);
        this.wisdom = wisdom;
        this.mind = mind;
        this.creativity = creativity;
    }
    public void findBetter(ChemicalFaculty student) {
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
        return this.getWisdom() + this.getMind() + this.getCreativity();
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
    @Override
    public String toString() {
        return String.format("%s: мудрость - %d, ум - %d, творчество - %d", super.toString(), wisdom, mind, creativity);
    }
}
