
package METODOS;

import java.text.DecimalFormat;

/**
 *
 * @author Sergio Junior
 */
public class Converter {
    
     public static String converter(double valor) {  
    
    DecimalFormat fmt = new DecimalFormat("0.00");
    String string = fmt.format(valor);  
    String[] part = string.split("[,]");  
    String preco = part[0]+"."+part[1];  
    return preco;  
}  
     
    public boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
    
}
