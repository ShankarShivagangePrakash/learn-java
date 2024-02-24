package httpclient;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

public class HttpClientDemo {

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

        // Creating HTTP Client object.
        HttpClient httpClient = HttpClient.newHttpClient();

        // Creating request object, if it is POST then you had to set request body also.
        HttpRequest request = HttpRequest.newBuilder(new URI("https://fakerestapi.azurewebsites.net/api/v1/Activities"))
                .GET().build();

        // making HTTP call by passing request and specifying the response type.
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        // parsing the response object.
        System.out.println("Get API response:\n\n");
        System.out.println("Response code: " + response.statusCode());
        System.out.println("Response body:\n" + response.body());

        // POST method using HTTP client.
        /*
            While creating request body, you need to specify the end point.
            request body
            headers
                content type: what kind of data you can recieve so server can send response in that format. Options application/json text/json etc..
            then finally build the request.
         */
        HttpRequest postRequest = HttpRequest.newBuilder(new URI("https://fakerestapi.azurewebsites.net/api/v1/Activities"))
                .POST(HttpRequest.BodyPublishers.ofString("{\n" +
                        "  \"id\": 0,\n" +
                        "  \"title\": \"string\",\n" +
                        "  \"dueDate\": \"2024-02-24T05:17:54.296Z\",\n" +
                        "  \"completed\": true\n" +
                        "}"))
                .setHeader("Content-Type", "application/json")
                .build();

        // making HTTP call by passing request and specifying the response type.
        HttpResponse<String> postApiResponse = httpClient.send(postRequest, HttpResponse.BodyHandlers.ofString());

        // we can also get the response header
        // headers will come as a map
        Map<String, List<String>> responseHeaderMap = postApiResponse.headers().map();

        // parsing the response object.
        System.out.println("\n\n POST API response\n\n");
        System.out.println("Response code: " + postApiResponse.statusCode());
        System.out.println("Response body:\n" + postApiResponse.body());

        System.out.println("\nResponse headers");
        for (var  entry : responseHeaderMap.entrySet()) {
            System.out.println(entry.getKey() + " ----> " + entry.getValue());
        }
    }
}
