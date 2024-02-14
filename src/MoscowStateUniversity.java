public class MoscowStateUniversity {
    private final String name;
    private final String surName;
    private final int numeracy;
    private final int walking;

    public MoscowStateUniversity(String name, String surName, int numeracy, int walking) {
        this.name = name;
        this.surName = surName;
        this.numeracy = numeracy;
        this.walking = walking;
    }
    public void print() {
        System.out.println(this);
    }

    public String getFullName(){
        return name + ' ' + surName;
    }
    @Override
    public String toString() {
        return String.format("%s: счёт - %d, ходьба - %d.", getFullName(), numeracy, walking);
    }

    public int getNumeracy() {
        return numeracy;
    }

    public int getWalking() {
        return walking;
    }
}
