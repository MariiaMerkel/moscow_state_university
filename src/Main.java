public class Main {
    public static void main(String[] args) {

        BioengineeringFaculty grigoryan = new BioengineeringFaculty("Максим", "Григорян",90,91,92,90,91);
        BioengineeringFaculty guseva = new BioengineeringFaculty("Екатерина", "Гусева",93,94,95,98,90);
        BioengineeringFaculty bobrovskiy = new BioengineeringFaculty("Даниил", "Бобровский",94,90,98,92,100);

        BiologicalFaculty aranovsky = new BiologicalFaculty("Алексей", "Аграновский",90,91,92,97,98);
        BiologicalFaculty adrianov = new BiologicalFaculty("Андрей", "Андрианов",93,94,95,98,92);
        BiologicalFaculty akimova = new BiologicalFaculty("Мария", "Акимова",91,90,98,100,90);

        ChemicalFaculty balashov = new ChemicalFaculty("Николай", "Балашов",90,91,92,93,93);
        ChemicalFaculty barannik = new ChemicalFaculty("Валерий", "Баранник",93,94,95,95,96);
        ChemicalFaculty baranovskaya = new ChemicalFaculty("Наталья", "Барановская",96,97,98,100,94);

        PhysicsFaculty gulkarov = new PhysicsFaculty("Илья", "Гулкаров",93,94,95,97,90);
        PhysicsFaculty gulyaev = new PhysicsFaculty("Сергей", "Гуляев",96,97,98,98,94);
        PhysicsFaculty gunger = new PhysicsFaculty("Игорь", "Гунгер",99,91,92,90,100);

        grigoryan.print();
        guseva.print();
        aranovsky.print();
        adrianov.print();
        akimova.print();
        balashov.print();
        barannik.print();
        baranovskaya.print();
        gulkarov.print();
        gulyaev.print();
        gunger.print();

        System.out.println();

        grigoryan.findBetter(guseva);
        guseva.findBetter(bobrovskiy);
        adrianov.findBetter(akimova);
        aranovsky.findBetter(akimova);
        baranovskaya.findBetter(balashov);
        barannik.findBetter(balashov);
        gulyaev.findBetter(gunger);
        gulkarov.findBetter(gulyaev);
        MoscowStateUniversityUtility.findBetter(adrianov, gulkarov);
        MoscowStateUniversityUtility.findBetter(barannik, gunger);
        MoscowStateUniversityUtility.findBetter(gulyaev,aranovsky);
        MoscowStateUniversityUtility.findBetter(gunger, akimova);
        MoscowStateUniversityUtility.findBetter(balashov, akimova);
        PhysicsFaculty pf = null;
        gulkarov.findBetter(pf);
    }
}