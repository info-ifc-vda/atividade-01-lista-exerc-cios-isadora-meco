/*Faça um programa que receba
• O código do produto comprado;
• A quantidade comprada do produto
Calcule e mostre:
• O preço unitário do produto comprado, seguindo a Tabela I;
• O preço total da nota;
• O valor do desconto, seguindo a Tabela II e aplicado sobre o preço total da nota;
• O preço final da nota depois do desconto. */
import javax.swing.JOptionPane;
public class Ex4Lst1 {
    public static void main (String[] args)
    {
        int cod;
        int quant;

        String c = JOptionPane.showInputDialog("Digite o código do produto:");
        cod = Integer.parseInt(c);
        String q = JOptionPane.showInputDialog("Digite a quantidade comprada do produto:");
        quant = Integer.parseInt(q);

        if ((cod>0)&(cod<11))
        {
            JOptionPane.showMessageDialog(null, ("O preço unitário do produto é:\nR$ 10,00"));
            JOptionPane.showMessageDialog(null, ("O preço total da nota é:\nR$ "+(quant*10)));
            if ((quant*10)<250)
            {
                JOptionPane.showMessageDialog(null, ("O desconto é de:\nR$ "+((quant*10)*0.05f)+" - 5%"));
                JOptionPane.showMessageDialog(null, ("O preço final da nota é:\nR$ "+((quant*10)*0.95f)));
            }
            else if ((quant*10)<500)
            {
                JOptionPane.showMessageDialog(null, ("O desconto é de:\nR$ "+((quant*10)*0.10f)+" - 10%"));
                JOptionPane.showMessageDialog(null, ("O preço final da nota é:\nR$ "+((quant*10)*0.9f)));
            }
            else if ((quant*10)>499)
            {
                JOptionPane.showMessageDialog(null, ("O desconto é de:\nR$ "+((quant*10)*0.15f)+" - 15%"));
                JOptionPane.showMessageDialog(null, ("O preço final da nota é:\nR$ "+((quant*10)*0.85f)));
            }
        }
        else if (cod<21)
        {
            JOptionPane.showMessageDialog(null, ("O preço unitário do produto é:\nR$ 15,00"));
            JOptionPane.showMessageDialog(null, ("O preço total da nota é: \nR$ "+(quant*15)));
            if ((quant*15)<250)
            {
                JOptionPane.showMessageDialog(null, ("O desconto é de:\nR$ "+((quant*15)*0.05f)+" - 5%"));
                JOptionPane.showMessageDialog(null, ("O preço final da nota é:\nR$ "+((quant*15)*0.95f)));
            }
            else if ((quant*15)<500)
            {
                JOptionPane.showMessageDialog(null, ("O desconto é de:\nR$ "+((quant*15)*0.10f)+" - 10%"));
                JOptionPane.showMessageDialog(null, ("O preço final da nota é:\nR$ "+((quant*15)*0.9f)));
            }
            else if ((quant*15)>499)
            {
                JOptionPane.showMessageDialog(null, ("O desconto é de:\nR$ "+((quant*15)*0.15f)+" - 15%"));
                JOptionPane.showMessageDialog(null, ("O preço final da nota é:\nR$ "+((quant*15)*0.85f)));
            }
        }
        else if (cod<31)
        {
            JOptionPane.showMessageDialog(null, ("O preço unitário do produto é:\nR$ 20,00"));
            JOptionPane.showMessageDialog(null, ("O preço total da nota é: \nR$ "+(quant*20)));
            if ((quant*20)<250)
            {
                JOptionPane.showMessageDialog(null, ("O desconto é de:\nR$ "+((quant*20)*0.05f)+" - 5%"));
                JOptionPane.showMessageDialog(null, ("O preço final da nota é:\nR$ "+((quant*20)*0.95f)));
            }
            else if ((quant*20)<500)
            {
                JOptionPane.showMessageDialog(null, ("O desconto é de:\nR$ "+((quant*20)*0.10f)+" - 10%"));
                JOptionPane.showMessageDialog(null, ("O preço final da nota é:\nR$ "+((quant*20)*0.9f)));
            }
            else if ((quant*20)>499)
            {
                JOptionPane.showMessageDialog(null, ("O desconto é de:\nR$ "+((quant*20)*0.15f)+" - 15%"));
                JOptionPane.showMessageDialog(null, ("O preço final da nota é:\nR$ "+((quant*20)*0.85f)));
            }
        }
        else if (cod<41)
        {
            JOptionPane.showMessageDialog(null, ("O preço unitário do produto é:\nR$ 40,00"));
            JOptionPane.showMessageDialog(null, ("O preço total da nota é: \nR$ "+(quant*40)));
            if ((quant*40)<250)
            {
                JOptionPane.showMessageDialog(null, ("O desconto é de:\nR$ "+((quant*40)*0.05f)+" - 5%"));
                JOptionPane.showMessageDialog(null, ("O preço final da nota é:\nR$ "+((quant*40)*0.95f)));
            }
            else if ((quant*40)<500)
            {
                JOptionPane.showMessageDialog(null, ("O desconto é de:\nR$ "+((quant*40)*0.10f)+" - 10%"));
                JOptionPane.showMessageDialog(null, ("O preço final da nota é:\nR$ "+((quant*40)*0.9f)));
            }
            else if ((quant*40)>499)
            {
                JOptionPane.showMessageDialog(null, ("O desconto é de:\nR$ "+((quant*40)*0.15f)+" - 15%"));
                JOptionPane.showMessageDialog(null, ("O preço final da nota é:\nR$ "+((quant*40)*0.85f)));
            }
        }
    }
    
}