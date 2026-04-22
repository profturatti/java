# Manuseio de arquivos com Java

## Introdução

Um arquivo de texto (geralmente com extensão .txt) é um tipo de arquivo computacional que armazena dados em formato de texto simples, composto por uma sequência de caracteres legíveis (letras, números e símbolos). Ele não possui formatação complexa, como negrito, itálico ou imagens, sendo ideal para notas rápidas, código fonte e dados estruturados. 

### Características Principais:

- Conteúdo Plano: Contém apenas texto puro, sem formatação.
- Compatibilidade: Pode ser aberto em quase qualquer sistema operacional ou dispositivo.
- Legibilidade: É facilmente lido por humanos e máquinas.
- Tamanho: Geralmente ocupa muito pouco espaço de armazenamento.
- Estrutura: Organizado em linhas, muitas vezes finalizado com um caractere especial de fim de arquivo.

A seguir, temos o exemplo de um programa em Java que aceita o nome de um arquivo informado como argumento de linha de comando e exibe o conteúdo desse arquivo no console.

```
// leArquivo.java

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class leArquivo {
    public static void main(String[] args) {
        // Verifica se o nome do arquivo foi passado como argumento
        if (args.length < 1) {
            System.out.println("Uso: java leArquivo <nome_do_arquivo>");
            return;
        }

        String nomeArquivo = args[0];

        // Bloco try-with-resources para garantir o fechamento do arquivo
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
```

## Como Compilar e Executar

0. **Abra um terminal no VSCode**;

1. **Crie o arquivo de exemplo**:

Linux (bash)
```
echo "Olá, este é um teste de leitura." > exemplo.txt
```

Windows (CMD)
```
echo Olá, este é um teste de leitura. > exemplo.txt
```

Windows (PowerShell)
```
"Olá, este é um teste de leitura." > exemplo.txt
```
**ou** Windows (PowerShell)
```
Set-Content -Path exemplo.txt -Value "Olá, este é um teste de leitura."
```

2. **Compile o programa**:

```
javac leArquivo.java
```

3. **Execute o programa passando um arquivo como parâmetro**:

```
java leArquivo exemplo.txt
```

## Pontos Importantes deste Código:

- **args[0]**: Captura o primeiro parâmetro enviado após o nome da classe na execução.

- **Try-with-resources**: Observe o uso de `try` (BufferedReader ... ). Essa sintaxe do Java 7+ garante que o arquivo seja fechado automaticamente, mesmo se ocorrer um erro durante a leitura, o que é uma boa prática de arquitetura de sistemas para evitar vazamento de memória (memory leaks).

- **Tratamento de Exceções**: O bloco catch lida com situações comuns, como o arquivo não existir ou o usuário não ter permissão de leitura.

