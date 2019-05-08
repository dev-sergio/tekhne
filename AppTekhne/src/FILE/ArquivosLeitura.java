package FILE;

import java.io.*;

public class ArquivosLeitura {

    Arquivos manageFiles = new Arquivos();
    public int tamanhoDoArray;
    public String[] arrayDoArquivo;

    public ArquivosLeitura() {
    }

    public ArquivosLeitura(int tamanhoDoArray, File arquivo) throws FileNotFoundException, IOException, Exception {
                   

        FileReader fileReader = new FileReader(arquivo);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(arquivo));
        lineNumberReader.skip(arquivo.length());
        int qtdLinhas = lineNumberReader.getLineNumber() + 1;

        arrayDoArquivo = new String[qtdLinhas];

        for (int i = 0; i < qtdLinhas; i++) {
                String key = "92AE31A79FEEB2A3"; //llave
        String iv = "0123456789ABCDEF"; // vector de inicialización
            arrayDoArquivo[i] = SEGURANCA.EncDec.decrypt(key, iv, bufferedReader.readLine());
        }

        bufferedReader.close();
    }

    public String[] getArrayDoArquivo() {
 
        return arrayDoArquivo;
    }

    public void setArrayDoArquivo(String[] arrayDoArquivo) {
        
        this.arrayDoArquivo = arrayDoArquivo;
    }

    public int getTamanhoDoArray() {
        return tamanhoDoArray;
    }

    public void setTamanhoDoArray(int tamanhoDoArray) {
        this.tamanhoDoArray = tamanhoDoArray;
    }
}
