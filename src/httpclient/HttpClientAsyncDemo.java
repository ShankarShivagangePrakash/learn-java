package httpclient;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;

public class HttpClientAsyncDemo {

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException, ExecutionException {

        // Creating HTTP Client object.
        HttpClient httpClient = HttpClient.newHttpClient();

        // Creating request object, if it is POST then you had to set request body also.
        HttpRequest request = HttpRequest.newBuilder(new URI("https://fakerestapi.azurewebsites.net/api/v1/Activities"))
                .GET().build();

        // making HTTP call by passing request and specifying the response type.
        // since it is async call return type will be completable future.
        // It indicates that at some point in time the response will come back.
        CompletableFuture<HttpResponse<String>> response = httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString());

        //When we get the response the do this
        // When we get the response, then apply this function
        CompletableFuture<Void> result = response.thenApply(httpResponse -> {
            // Log response status
            System.out.println("Response Status: " + httpResponse.statusCode());

            // Log response body
            System.out.println("Response Body: " + httpResponse.body());
            return null;
        });

        // Wait for the result to complete
        result.get();
    }
}
