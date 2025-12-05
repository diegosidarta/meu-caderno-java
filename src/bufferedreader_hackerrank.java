import java.io.IOException;
import java.io.BufferedReader; //o BufferedReader mora no pacote 'io'
import java.io.InputStreamReader; //assim como o InputStreamReader

public class bufferedreader_hackerrank {
    public static void main(String[] args) throws IOException {
        // o BufferedReader é muito rápido (otimizado para leitura de máquina).
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());//O computador lê a linha inteira como texto String.
        //se for impar (Weird)
        if (N % 2 != 0){
            System.out.println("Weird");
        }
        // senao, se for PAR e estiver no intervalo de erro (6, 20)
        else if (N >= 6 && N <= 20){
            System.out.println("Weird");
        }
        // senao sobrou TUDO que é Not Weird: (2-5) e (>20)
        else{
            System.out.println("Not Weird");
        }
        bufferedReader.close();
    }
}

/*
Lógica:
primeiro resolvendo o problema das adversidades(Weird) e depois finalizando as exceções com ELSE(Not Weird).

OBS:
O que acontece na nova linha bufferedReader.readLine(): O computador lê a linha inteira como texto(String).

.trim(): Remove espaços em branco desnecessários (limpa o texto).

Integer.parseInt(...): O Java é forçado a transformar esse texto limpo em um número inteiro (int).

Diferença do Scanner para o BufferedReader:

O Scanner: é a ferramenta mais conveniente para aprender.
Ele le o dado por tokens (pedacinhos, como palavras ou números)
e faz a conversão do texto para número de forma automática (nextInt(), nextDouble()).
No entanto, ele é mais lento e gasta mais tempo processando a entrada.

O BufferedReader: é a ferramenta de alta velocidade.
Ele le a entrada por linhas inteiras (em grandes blocos de memória).
Ele é muito rapido, mas não é "inteligente": ele SEMPRE devolve uma String(texto).
Por isso tem que fazer a conversão manualmente usando Integer.parseInt() ou Double.parseDouble().

*/