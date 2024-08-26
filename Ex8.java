/*Faça uma calculadora de troco, baseado nas cédulas da nossa moeda. */

import javax.swing.JOptionPane;

public class Ex8 {

    public static void main (String[] args)
    {
        float pago;
        float valor;
        float troco;
        int cont;
        int[] cedulas = {200,100,50,20,10,5,2,1};

        String v = JOptionPane.showInputDialog("Digide o valor a ser pago:\n");
        valor = Float.parseFloat(v);
        String p = JOptionPane.showInputDialog("Digite o valor pago:\n");
        pago = Float.parseFloat(p);
        valor-=pago;
        valor*=(-1);
        troco=valor;
        System.out.println(valor);
        
        for (int cedula: cedulas)
        {
            cont = (int)troco/cedula;
            if (cont>0){
                JOptionPane.showMessageDialog(null, ("O troco tem:\n"+cont+" nota(s) de "+cedula+";\n"));
            }
            troco = troco%cedula;
        }
    }
}