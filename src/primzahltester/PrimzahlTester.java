package primzahltester;

public class PrimzahlTester {

    private long n;

    /**
     * prueft ob die uebergebene nichtnegative Zahl eine Primzahl ist wenn die uebergebene Zahl eine Primzahl ist, wir JA ausgegeben ansonsten NEIN
     *
     *
     * @param n die zu testende nichtnegative Zahl
     */
    public void istPrimzahl(long n) {

        this.n = n; //hier wird der Wert des Übergabeparameters n dem Attribut n zugewiesen
        int a = (int) n; //caste long auf int und weise a zu

        boolean p = false;

        switch (a) {
            case 1:
                // wenn a gleich eins , dann keine Primzahl
                System.out.println(" 1 ist keine Primzahl ");
                System.exit(0);
            case 2:
                // wenn a gleich zwei, dann Primzahl
                System.out.println(" 2 ist eine Primzahl ");
                System.exit(0);

            default:
                double n0 = (int) Math.sqrt(a);  //n0 ist die Wurzel aus a
                int n1 = (int) n0; // n1 sei die auf die nächste Ganzzahl abgerundete Wurzel von a ohne Nachkommastellen
                for (int i = 1; i < a; i++) {

                    if ((a % n1) == 0) {
                        p = true; // p ist wahr wenn n Teiler von a ist
                        break; // brich ab, wenn erster Teiler gefunden wurde

                    } else {
                        p = false; // p ist unwahr, wenn n keine Teiler von a ist

                    }
                    if (n1 > 2) {
                        n1--; //dekrementiere n um 1
                    }
                }

                if (p) {
                    System.out.println("Nein, "+a + " ist keine Primzahl");
                } else {
                    System.out.println("Ja, "+a + " ist eine Primzahl");

                }

        }
    }

    public static void main(String[] args) {
        // Diese Variable kaennen sie veraendern, um Ihre
        // Implementierung zu testen
        int x = 2;
        // Der nachfolgende Quelltext erzeugt nur die Ausgabe
        System.out.print("Ist ");
        System.out.print(x);
        System.out.println(" eine Primzahl?");
        new PrimzahlTester().istPrimzahl(x);
    }

}
