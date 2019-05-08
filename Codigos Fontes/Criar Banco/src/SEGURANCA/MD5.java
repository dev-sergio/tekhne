

package SEGURANCA;

import java.math.BigInteger;  
import java.security.MessageDigest;  
import java.security.NoSuchAlgorithmException;  

/**
 *
 * @author Sergio
 */
public class MD5 {
 //Função para criar hash da senha informada  
    public static String md5(String senha) throws NoSuchAlgorithmException  {  
          
        MessageDigest md = MessageDigest.getInstance("MD5");  
  
        BigInteger hash = new BigInteger(1, md.digest(senha.getBytes()));  
        return  hash.toString(16);  
    }  
    
}
