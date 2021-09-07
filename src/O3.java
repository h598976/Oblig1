import static javax.swing.JOptionPane.showInputDialog;

public class O3 {
    public static void main(String[] args) throws Exception {
        long heltall = Integer.parseInt(showInputDialog("Velg et tall"));
        
        long fakultet = 1; 

        for (int i = 1; i <= heltall; i++) {
            fakultet = fakultet * i;
        }
        
        System.out.println(fakultet);
    }
}
