public class ChemicalFaculty extends MoscowStateUniversity{
    public ChemicalFaculty(String name, String surName, int nobility, int honor, int bravery, int industriousness, int fidelity, int honesty, int wisdom, int mind, int creativity, int ingenuity, int determination, int leadership, int numeracy, int walking) {
        super(name, surName, nobility, honor, bravery, industriousness, fidelity, honesty, wisdom, mind, creativity, ingenuity, determination, leadership, numeracy, walking);
    }
    public void findBetter(ChemicalFaculty student) {
        if (this != student && student != null) {
            if (this.sumProperties() > student.sumProperties()) {
                System.out.printf("%n%s имеет преимущества по способностям перед одногруппником %s.%n", this.getFullName(), student.getFullName());
            } else if (this.sumProperties() == student.sumProperties()){
                System.out.printf("%n%s и %s равносильны по способностям.%n", student.getFullName(), this.getFullName());
            } else {
                System.out.printf("%n%s имеет преимущества по способностям перед одногруппником %s.%n", student.getFullName(), this.getFullName());
            }
        } else {
            System.out.println("Введены некорректные данные");
        }
    }

    public int sumProperties() {
        return this.getWisdom() + this.getMind() + this.getCreativity();
    }
}
