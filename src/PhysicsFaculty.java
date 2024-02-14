public class PhysicsFaculty extends MoscowStateUniversity{
    private final int ingenuity;
    private final int determination;
    private final int leadership;

    public PhysicsFaculty(String name, String surName, int numeracy, int walking, int ingenuity, int determination, int leadership) {
        super(name, surName, numeracy, walking);
        this.ingenuity = ingenuity;
        this.determination = determination;
        this.leadership = leadership;
    }

    public void findBetter(PhysicsFaculty student) {
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
        return this.getIngenuity() + this.getDetermination()+ this.getLeadership();
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
        return String.format("%s: смекалка - %d, решительность - %d, лидерство - %d", super.toString(), ingenuity, determination, leadership);
    }
}