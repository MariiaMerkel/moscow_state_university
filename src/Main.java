import java.sql.Array;

public class Main {
    public static void main(String[] args) {

        BioengineeringFaculty grigoryan = new BioengineeringFaculty("Максим", "Григорян",90,91,92,10,11,12,20,21,22,13,14,15,91,90);
        BioengineeringFaculty guseva = new BioengineeringFaculty("Екатерина", "Гусева",93,94,95,10,11,12,20,21,22,13,14,15,98,99);
        BioengineeringFaculty bobrovskiy = new BioengineeringFaculty("Даниил", "Бобровский",94,90,98,10,11,12,20,21,22,13,14,15,92,91);

        BiologicalFaculty aranovsky = new BiologicalFaculty("Алексей", "Аграновский",10,11,12,90,91,92,20,21,22,13,14,15,97,98);
        BiologicalFaculty adrianov = new BiologicalFaculty("Андрей", "Андрианов",10,11,12,93,94,95,20,21,22,13,14,15,98,92);
        BiologicalFaculty akimova = new BiologicalFaculty("Мария", "Акимова",10,11,12,96,97,98,20,21,22,13,14,15,100,90);

        ChemicalFaculty balashov = new ChemicalFaculty("Николай", "Балашов",11,11,12,25,26,27,90,91,92,13,14,15,93,93);
        ChemicalFaculty barannik = new ChemicalFaculty("Валерий", "Баранник",10,11,12,25,26,27,93,94,95,13,14,15,95,96);
        ChemicalFaculty baranovskaya = new ChemicalFaculty("Наталья", "Барановская",10,11,12,25,26,27,96,97,98,13,14,100,94,95);

        PhysicsFaculty gulkarov = new PhysicsFaculty("Илья", "Гулкаров",10,11,12,25,26,27,13,14,15,93,94,95,97,90);
        PhysicsFaculty gulyaev = new PhysicsFaculty("Сергей", "Гуляев",10,11,12,25,26,27,13,14,15,96,97,98,98,94);
        PhysicsFaculty gunger = new PhysicsFaculty("Игорь", "Гунгер",10,11,12,25,26,27,13,14,15,99,91,92,90,100);

        MoscowStateUniversityUtility students = new MoscowStateUniversityUtility(12);

        students.add(grigoryan);
        students.add(guseva);
        students.add(bobrovskiy);
        students.add(aranovsky);
        students.add(adrianov);
        students.add(akimova);
        students.add(balashov);
        students.add(barannik);
        students.add(baranovskaya);
        students.add(gulkarov);
        students.add(gulyaev);
        students.add(gunger);

        students.printAll();

        grigoryan.print();
        grigoryan.findBetter(guseva);
        guseva.findBetter(bobrovskiy);
        baranovskaya.findBetter(balashov);
        gulkarov.findBetter(adrianov);
        gunger.findBetter(barannik);
        aranovsky.findBetter(gulyaev);
        akimova.findBetter(gunger);
        PhysicsFaculty pf = null;
        gulkarov.findBetter(pf);
        adrianov.findBetter(akimova);

    }


}