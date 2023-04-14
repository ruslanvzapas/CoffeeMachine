class Army {

    public static void createArmy() {
        // Create all objects here
        Unit a1 = new Unit("Alex");
        Unit a2 = new Unit("Alex");
        Unit a3 = new Unit("Alex");
        Unit a4 = new Unit("Alex");
        Unit a5 = new Unit("Alex");

        Knight b1 = new Knight("Max");
        Knight b2 = new Knight("Max");
        Knight b3 = new Knight("Max");

        General c =  new General("Andrey");

        Doctor d = new Doctor("Kiril");

    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}
