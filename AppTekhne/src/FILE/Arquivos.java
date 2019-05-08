package FILE;

import java.io.File;

public class Arquivos {

    String caminho1 = System.getProperty("user.dir") + "\\conf.ini";
    public File arquivoDeConf = new File(caminho1);

    public File getArquivoDeConf() {
        return arquivoDeConf;
    }

}
