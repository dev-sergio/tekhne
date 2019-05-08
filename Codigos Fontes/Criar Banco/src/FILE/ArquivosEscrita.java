

package FILE;

import java.io.*;
import java.io.File;

/**
 *
 * @author Sergio Junior
 */
public class ArquivosEscrita {

    FileWriter fileWriter;
    BufferedWriter bufferedWriter;

   

    
    public void setArquivoDeConf(File arquivo, String server, String door, String dataBase, String user, String password) throws IOException, Exception {
        String caminho = System.getProperty("user.dir")+"\\conf.ini";
        File f = new File(caminho);
        f.delete();
        String key = "92AE31A79FEEB2A3"; //llave
        String iv = "0123456789ABCDEF"; // vector de inicialización
        fileWriter = new FileWriter(arquivo);
        bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(SEGURANCA.EncDec.encrypt(key, iv, server));
        bufferedWriter.newLine();
        bufferedWriter.write(SEGURANCA.EncDec.encrypt(key, iv, door));
        bufferedWriter.newLine();
        bufferedWriter.write(SEGURANCA.EncDec.encrypt(key, iv, dataBase));
        bufferedWriter.newLine();
        bufferedWriter.write(SEGURANCA.EncDec.encrypt(key, iv, user));
        bufferedWriter.newLine();
        bufferedWriter.write(SEGURANCA.EncDec.encrypt(key, iv, password));
        bufferedWriter.close();
        String comando = "C:\\WINDOWS\\System32\\ATTRIB.EXE +H conf.ini";  
        Runtime.getRuntime().exec(comando);  
    }
        
}

