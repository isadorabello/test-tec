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
        // 1)
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
        // 2) part.1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (pertenceFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência.");
        } else {
            System.out.println(numero + " não pertence à sequência.");
        }
         */

        /*
        // 3)
        try {
            Gson gson = new Gson();
            Reader reader = new FileReader("src/main/java/org/example/dados.json");
            List<Faturamento> faturamentos = gson.fromJson(reader, new TypeToken<List<Faturamento>>() {}.getType());
            reader.close();

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
                if (f.getValor() > 0) {
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

            double mediaMensal = soma / diasComFaturamento;
            for (Faturamento f : faturamentos) {
                if (f.getValor() > mediaMensal) {
                    diasAcimaDaMedia++;
                }
            }
            System.out.println("Menor faturamento diário: " + menor);
            System.out.println("Maior faturamento diário: " + maior);
            System.out.println("Dias com faturamento acima da média: " + diasAcimaDaMedia);

        } catch (Exception e) {
            e.printStackTrace();
        }
        */

        /*
        // 4)
        Map<String, Double> faturamentoEstados = new LinkedHashMap<>();
        faturamentoEstados.put("SP", 67836.43);
        faturamentoEstados.put("RJ", 36678.66);
        faturamentoEstados.put("MG", 29229.88);
        faturamentoEstados.put("ES", 27165.48);
        faturamentoEstados.put("Outros", 19849.53);
        double faturamentoTotal = faturamentoEstados.values().stream().mapToDouble(Double::doubleValue).sum();

        System.out.println("Percentual de representação total:");
        for (Map.Entry<String, Double> entry : faturamentoEstados.entrySet()) {
            double percentual = (entry.getValue() / faturamentoTotal) * 100;
            System.out.printf("%s: %.2f%%\n", entry.getKey(), percentual);
        }
        */

        /*
        // 5) part.1
        String original = "Isadora";
        String invertida = inverterString(original); // Chama o metodo para inverter
        System.out.println("Original: " + original);
        System.out.println("Invertida: " + invertida);
        */

    }
    
     /*
    //2) part.2
    public static boolean pertenceFibonacci(int num) {
        int a = 0, b = 1, soma = 0;

        if (num == 0 || num == 1) {
            return true;
        }

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
    //5) part.2
    public static String inverterString(String str) {
        char[] caracteres = new char[str.length()];
        int j = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            caracteres[j++] = str.charAt(i);
        }

        return new String(caracteres);
    }
    */
}


