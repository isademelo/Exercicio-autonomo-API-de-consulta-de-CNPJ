package EstudoAutonomo;
import com.google.gson.*;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
public class ConsultaDeCNPJ {
    static Scanner entradaDeDados = new Scanner(System.in);
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("""
                ===============================================
                       FERRAMENTA DE CONSULTA DE CNPJ
                ===============================================""");
        digiteCnpj();
    }

    public static void digiteCnpj() throws IOException, InterruptedException {
        System.out.println("\nDigite o CNPJ da empresa que você quer pesquisar");
        String cnpjDaEmpresa = entradaDeDados.nextLine();
        verificarNumeroDeCaracteresCnpj(cnpjDaEmpresa);
    }

    public static void consultaCnpj(String cnpjDaEmpresa) throws IOException, InterruptedException {
        HttpClient cliente = HttpClient.newHttpClient();
        String busca = "http://ws.hubdodesenvolvedor.com.br/v2/cnpj/?cnpj=" + cnpjDaEmpresa + "&token=223659745UgtoxIcyWQ403810888";
        HttpRequest requisicao = HttpRequest.newBuilder().uri(URI.create(busca)).GET().build();
        HttpResponse<String> resposta = cliente.send(requisicao, HttpResponse.BodyHandlers.ofString());
        String json = resposta.body();
        printarInformacoesDoCnpjFormatadas(json);
    }

    public static void printarInformacoesDoCnpjFormatadas(String json) throws IOException, InterruptedException {
        System.out.println("""
                Você prefere olhar o JSON completo ou as informações formatadas?
                1- JSON completo
                2- Informações formatadas
                """);
        int escolha = verificarEscolhaDaFormatacao();
        retornarOprint(escolha, json);
    }

    public static void verificarNumeroDeCaracteresCnpj(String cnpjDaEmpresa) throws IOException, InterruptedException {
        String cnpjApenasComNumeros = cnpjDaEmpresa.replaceAll("\\D", "");
        while (cnpjApenasComNumeros.length() != 14) {
            System.out.println("O CNPJ é inválido... Tente novamente: ");
            String cnpjDigitadoNovamente = entradaDeDados.nextLine();
            verificarNumeroDeCaracteresCnpj(cnpjDigitadoNovamente);
        }
        System.out.println("CNPJ VÁLIDO PARA PESQUISA!!!");
        consultaCnpj(cnpjApenasComNumeros);
    }

    public static int verificarEscolhaDaFormatacao() {
        while (true) {
            try {
                System.out.print("Digite uma opção: ");
                int escolhaDaFormatacao = Integer.parseInt(entradaDeDados.nextLine());
                if (escolhaDaFormatacao == 1 || escolhaDaFormatacao == 2) {
                    System.out.println(String.format("Entrada válida, você escolheu a opção %d", escolhaDaFormatacao));
                    return escolhaDaFormatacao;
                } else {
                    System.out.println("Escolha inválida, digite 1 para receber os dados em JSON ou 2 para receber os dados formatados");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: O valor digitado não é um número válido!");
                System.out.println("Tente novamente.\n");

            }
        }
    }

    public static void retornarOprint(int escolha, String json) throws IOException, InterruptedException {
        if (escolha == 1) {
            System.out.println(json);
        } else {
            Gson gson = new Gson();
            JsonObject objetoJson = JsonParser.parseString(json).getAsJsonObject();
            JsonObject resultado = objetoJson.getAsJsonObject("result");
            InformacoesDoCNPJ informacoesDoCNPJ = gson.fromJson(resultado, InformacoesDoCNPJ.class);
            System.out.println(informacoesDoCNPJ);
        }

        System.out.println("""
                Deseja fazer outra consulta?
                1- Sim
                2- Não
                """);

        int outraConsulta = verificarOutraConsulta();
        if (outraConsulta == 1){
            digiteCnpj();
        } else {
            System.exit(0);
        }
    }

    public static int verificarOutraConsulta() {
        while (true) {
            try {
                System.out.print("Digite uma opção: ");
                int escolhaDaConsulta = Integer.parseInt(entradaDeDados.nextLine());
                if (escolhaDaConsulta == 1 || escolhaDaConsulta == 2) {
                    System.out.println(String.format("Entrada válida, você escolheu a opção %d", escolhaDaConsulta));
                    return escolhaDaConsulta;
                } else {
                    System.out.println("Escolha inválida, digite 1 para realizar outra consulta ou 2 para sair do programa");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: O valor digitado não é um número válido!");
                System.out.println("Tente novamente.\n");
            }
        }
    }
}