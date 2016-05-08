/*
 * Outputs the odd and even numbers from the number range limit entered
 */
package oddeven;

/**
 *
 * @author user
 */
import javax.swing.JOptionPane;
public class oddeven {
public static void main (String[] args){
    String a, odd = " ", even = " ";
    int x, y, classif;
            
a = JOptionPane.showInputDialog("Enter the number limit: ");
x = Integer.parseInt(a);

for (y=1; y<=x; y++){
    classif = (y%2);
    
    if (classif == 0){
        even += Integer.toString(y) + " ";
    }
    else
        odd += Integer.toString(y) + " ";
}

JOptionPane.showMessageDialog(null, "Odd number(s): " + odd + "\nEven number(s): " + even);
}    
}
