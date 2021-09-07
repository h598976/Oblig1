import static javax.swing.JOptionPane.showInputDialog;
public class O1{
    public static void main(String[] args) throws Exception {
        int lønn = Integer.parseInt(showInputDialog("Lønn?"));

        double [][] sats = {
        {0.0, 0, 164100}, 
        {0.93, 164101, 230950}, 
        {0.241, 230951, 580650}, 
        {0.1152, 580651, 934050}, 
        {0.1452, 934501
        }};

        for (int i = 0; i < sats.length; i++) {
            if(lønn >= sats [i][1] && lønn <= sats [i][2]) {
            System.out.println((lønn - ((1 - sats[i][0]) * lønn) + " i skatt"));
            }
        }

    }
}
