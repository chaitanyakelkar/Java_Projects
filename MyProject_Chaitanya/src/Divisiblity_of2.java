
/*
 * Class: maths
 *
 * Created on 29-May-2018
 *
 */
import javax.swing.JOptionPane;

public class Divisiblity_of2
{

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        String temp;
        JOptionPane.showMessageDialog(null, "This program Check Divisiblity of a Number with 2");
        temp = JOptionPane.showInputDialog(null, "Enter the number");
        int num = Integer.parseInt(temp);
        if ((num % 2) == 0)
        {
            JOptionPane.showMessageDialog(null, num + " is Divisible to 2");
        }
        else
        {
            JOptionPane.showMessageDialog(null, num + " is not Divisible to 2");
        }
    }

}
