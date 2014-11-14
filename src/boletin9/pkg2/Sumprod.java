
package boletin9.pkg2;

import javax.swing.JOptionPane;

public class Sumprod {
    public Sumprod(){
        }
 public void calcular() {
int acS=0;
double acP=1;
for (int i = 10; i < 90; i++) {
acS = i + acS;
acP = i * acP;
}
JOptionPane.showMessageDialog(null,"Suma= "+acS+"Producto= "+acP);
}
}


    


