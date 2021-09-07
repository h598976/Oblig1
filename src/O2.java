import static javax.swing.JOptionPane.*;

public class O2 {
    public static void main(String[] args) throws Exception {
        

        for (int i = 0; i < 10; i++) {
            int poeng = Integer.parseInt(showInputDialog("Hvor mange poeng fikk du?"));

            if (poeng <= 100 && poeng >= 90) {
            System.out.println("Du har fått karakteren A");
            }
             if (poeng < 90 && poeng >= 80) {
            System.out.println("Du har fått karakteren B");
            }
             if (poeng <80 && poeng >= 60) {
            System.out.println("Du har fått karakteren C");
            }
            if (poeng <60 && poeng >= 50) {
            System.out.println("Du har fått karakteren D");
            }
            if (poeng <50 && poeng >= 40) {
            System.out.println("Du har fått karakteren E");
            }
            if (poeng <40 && poeng >= 0) {
            System.out.println("Du har fått karakteren F");
            }
            else {
            System.out.println("Du skrev inn en ugylidg verdi, maks er 100, og min er 0, prøv igjen");
            i--;
            }
        }
    }
}
