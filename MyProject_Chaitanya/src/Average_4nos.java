import java.io.IOException;

import javax.swing.JOptionPane;
/*
 * Class: MyClass
 *
 * Created on 17-May-2018
 *
 */

public class Average_4nos
{

    public static void main(String[] args) throws IOException
    {
        // TODO Auto-generated method stub
        String temp;
        JOptionPane.showMessageDialog(null, "The program calculates average of 4 numbers");
        temp = JOptionPane.showInputDialog(null, "Enter num 1");
        double a = Integer.parseInt(temp);
        temp = JOptionPane.showInputDialog(null, "Enter num 2");
        double b = Integer.parseInt(temp);
        temp = JOptionPane.showInputDialog(null, "Enter num 3");
        double c = Integer.parseInt(temp);
        temp = JOptionPane.showInputDialog(null, "Enter num 4");
        double d = Integer.parseInt(temp);
        JOptionPane.showMessageDialog(null, "the average is " + (a + b + c + d) / 4);
    }
}
