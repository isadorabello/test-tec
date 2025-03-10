package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        /*
        1)
        int indice = 13;
        int soma = 0;
        int k = 0;

        while(k<indice){
            k++;
            soma = soma+k;
            System.out.println(soma);
        }
        System.out.print(soma);
        */

        /*
        2) part.1
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário um número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        scanner.close();

        // Verifica se o número pertence à sequência de Fibonacci
        if (pertenceFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência.");
        } else {
            System.out.println(numero + " não pertence à sequência.");
        }
         */

        
        /*
        3)
        try {
            // Lê o arquivo JSON
            Gson gson = new Gson();
            Reader reader = new FileReader("src/main/java/org/example/dados.json");
            List<Faturamento> faturamentos = gson.fromJson(reader, new TypeToken<List<Faturamento>>() {}.getType());
            reader.close();

            // Verifica se a lista contém dados
            if (faturamentos == null || faturamentos.isEmpty()) {
                System.out.println("Nenhum dado disponível.");
                return;
            }

            double menor = Double.MAX_VALUE;
            double maior = Double.MIN_VALUE;
            double soma = 0;
            int diasComFaturamento = 0;
            int diasAcimaDaMedia = 0;

            // Calcula menor, maior e soma total
            for (Faturamento f : faturamentos) {
                if (f.getValor() > 0) { // Ignora dias sem faturamento
                    if (f.getValor() < menor) {
                        menor = f.getValor();
                    }
                    if (f.getValor() > maior) {
                        maior = f.getValor();
                    }
                    soma += f.getValor();
                    diasComFaturamento++;
                }
            }

            // Calcula a média mensal (excluindo dias sem faturamento)
            double mediaMensal = soma / diasComFaturamento;

            // Conta dias acima da média
            for (Faturamento f : faturamentos) {
                if (f.getValor() > mediaMensal) {
                    diasAcimaDaMedia++;
                }
            }

            // Exibe os resultados
            System.out.println("Menor faturamento diário: " + menor);
            System.out.println("Maior faturamento diário: " + maior);
            System.out.println("Dias com faturamento acima da média: " + diasAcimaDaMedia);

        } catch (Exception e) {
            e.printStackTrace();
        }
        */

        /*
        4)
         // Definição dos faturamentos por estado
        Map<String, Double> faturamentoEstados = new LinkedHashMap<>();
        faturamentoEstados.put("SP", 67836.43);
        faturamentoEstados.put("RJ", 36678.66);
        faturamentoEstados.put("MG", 29229.88);
        faturamentoEstados.put("ES", 27165.48);
        faturamentoEstados.put("Outros", 19849.53);

        // Calcula o faturamento total
        double faturamentoTotal = faturamentoEstados.values().stream().mapToDouble(Double::doubleValue).sum();

        // Exibe os percentuais de representação
        System.out.println("Percentual de representação de cada estado no faturamento total:");
        for (Map.Entry<String, Double> entry : faturamentoEstados.entrySet()) {
            double percentual = (entry.getValue() / faturamentoTotal) * 100;
            System.out.printf("%s: %.2f%%\n", entry.getKey(), percentual);
        }
        */

        /*
        5) part.1
        String original = "Exemplo de String"; // A string a ser invertida
        String invertida = inverterString(original); // Chama o método para inverter
        System.out.println("Original: " + original);
        System.out.println("Invertida: " + invertida);
        */

    }
    
     /*
    2) part.2
    public static boolean pertenceFibonacci(int num) {
        int a = 0, b = 1, soma = 0;

        // Se for 0 ou 1, já pertence à sequência
        if (num == 0 || num == 1) {
            return true;
        }

        // Gera a sequência até encontrar o número ou ultrapassá-lo
        while (soma < num) {
            soma = a + b;
            a = b;
            b = soma;

            if (soma == num) {
                return true;
            }
        }
        return false;
    }
    */

    /*
    5) part.2
    public static String inverterString(String str) {
        char[] caracteres = new char[str.length()]; // Cria um array para armazenar os caracteres invertidos
        int j = 0; // Índice para percorrer o array de caracteres

        // Loop para percorrer a string de trás para frente
        for (int i = str.length() - 1; i >= 0; i--) {
            caracteres[j++] = str.charAt(i); // Adiciona os caracteres invertidos no array
        }

        // Converte o array de caracteres de volta para uma string
        return new String(caracteres);
    }
    */
}


