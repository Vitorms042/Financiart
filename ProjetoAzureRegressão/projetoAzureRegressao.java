import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeoutException;

import org.apache.hc.core5.ssl.SSLContextBuilder;
import org.apache.hc.core5.ssl.SSLContexts;
import org.apache.hc.core5.ssl.TrustStrategy;

import org.apache.hc.client5.http.HttpResponseException;

public class Main {
    public static void main(String[] args) {
        invokeRequestResponseService().join();
    }

    // Método assíncrono para invocar o serviço de requisição e resposta
    static CompletableFuture<Void> invokeRequestResponseService() {
        var executor = Executors.newSingleThreadExecutor();
        return CompletableFuture.runAsync(() -> {
            // Configuração do manipulador HTTP
            var handler = new HttpClientHandler();
            handler.setClientCertificateOptions(ClientCertificateOption.Manual);
            handler.setServerCertificateCustomValidationCallback((httpRequestMessage, cert, certChain, policyErrors) -> true);

            // Criação do cliente HTTP
            var client = HttpClient.newBuilder()
                .executor(executor)
                .build();

            // Corpo da solicitação JSON
            var requestBody = "{\n" +
                "  \"Inputs\": {\n" +
                "    \"data\": [\n" +
                "      {\n" +
                "        \"day\": 0,\n" +
                "        \"mnth\": 0,\n" +
                "        \"year\": 0,\n" +
                "        \"season\": 0,\n" +
                "        \"holiday\": 0,\n" +
                "        \"weekday\": 0,\n" +
                "        \"workingday\": 0,\n" +
                "        \"weathersit\": 0,\n" +
                "        \"temp\": 0.0,\n" +
                "        \"atemp\": 0.0,\n" +
                "        \"hum\": 0.0,\n" +
                "        \"windspeed\": 0.0\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  \"GlobalParameters\": 0.0\n" +
                "}";

            // Chave de autenticação para o serviço
            var apiKey = "";

            if (apiKey.isEmpty()) {
                throw new RuntimeException("A key should be provided to invoke the endpoint");
            }

            // URI do serviço
            var uri = URI.create("http://d81b09f9-e3c6-4cfe-bd78-20f928986812.southcentralus.azurecontainer.io/score");

            // Construção da solicitação HTTP POST
            var request = HttpRequest.newBuilder()
                .uri(uri)
                .header("Authorization", "Bearer " + apiKey)
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .build();

            try {
                // Envio da solicitação e tratamento da resposta
                var response = client.send(request, HttpResponse.BodyHandlers.ofString());

                if (response.statusCode() == 200) {
                    var result = response.body();
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("The request failed with status code: " + response.statusCode());
                    System.out.println(response.headers());

                    var responseContent = response.body();
                    System.out.println(responseContent);
                }
            } catch (IOException | InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }, executor);
    }
}
