/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FILE;

import java.io.File;

/**
 *
 * @author Sergio Junior
 */
public class Arquivos {
    
    
    
    String caminho = System.getProperty("user.dir")+"\\conf.ini";
    public File arquivoDeConf = new File(caminho);

    public File getArquivoDeConf() {
        return arquivoDeConf;
    }
    
}
