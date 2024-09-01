/*Leia os 03 ângulos e os 03 lados de um triângulo, e classifique-o como: retângulo,
obtusângulo ou acutângulo; e equilátero, escaleno ou isósceles.*/
import javax.swing.JOptionPane;
public class Ex3Lst1 {
    public static void main(String[] args)
    {
        int l1;
        int a1;
        int l2;
        int a2;
        int l3;
        int a3;

        String lad1  = JOptionPane.showInputDialog("Digite o valor do primeiro lado do triângulo:");
        l1 = Integer.parseInt(lad1);
        String lad2 = JOptionPane.showInputDialog("Digite o valor do segundo lado do triângulo:");
        l2 = Integer.parseInt(lad2);
        String lad3 = JOptionPane.showInputDialog("Digite o valor do terceiro lado do triângulo:");
        l3 = Integer.parseInt(lad3);
        String ang1 = JOptionPane.showInputDialog("Digite o valor do primeiro ângulo do triângulo:");
        a1 = Integer.parseInt(ang1);
        String ang2 = JOptionPane.showInputDialog("Digite o valor do segundo ângulo do triângulo:");
        a2 = Integer.parseInt(ang2);
        String ang3 = JOptionPane.showInputDialog("Digite o valor do terceiro ângulo do triângulo:");
        a3 = Integer.parseInt(ang3);
        
        if ((l1 == l2) & (l2 == l3))
        {
            JOptionPane.showMessageDialog(null, ("O triângulo é equilátero!"));
        }
        else if ((l1==l2)|(l2==l3)|(l3==l1))
        {
            JOptionPane.showMessageDialog(null, ("O triângulo é isósceles!"));
        }
        else 
        {
            JOptionPane.showMessageDialog(null, ("O triângulo é escaleno!"));
        }

        if ((a1==90)|(a2==90)|(a3==90))
        {
            JOptionPane.showMessageDialog(null, ("O triângulo é retângulo!"));
        }
        else if ((a1>90)|(a2>90)|(a3>90))
        {
            JOptionPane.showMessageDialog(null, ("O triângulo é obtusângulo!"));
        }
        else 
        {
            JOptionPane.showMessageDialog(null, ("O triângulo é ocutângulo!"));
        }

    }
    
}