package com.doxbit.dataTransfer;
//package main;
//        я
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class APIClient {
    private URL url;
    //    private HTTPRequestTypes requestType;
    private Map<String, String> parameters;

    private HttpURLConnection connection;
    private InputStream inputStream;


    public APIClient(String url) throws IOException {
        this.url = new URL(url);
//        this.requestType = requestType;

        this.inputStream = null;
        this.parameters = new HashMap<>();
        this.connection = (HttpURLConnection) this.url.openConnection();

        this.connection.setRequestMethod("POST");
    }

    public APIClient addParameter(String key, String val) {
        this.parameters.put(key, val);
        this.connection.setDoOutput(true);
        return this;
    }


    public String run() throws IOException {
        if (this.parameters.size() > 0) {
            DataOutputStream out = new DataOutputStream(this.connection.getOutputStream());
            out.writeBytes(getParamsString());
            out.flush();
            out.close();
        }

        return getFullResponse();
    }

    private String getFullResponse() throws IOException {
        int responseCode = this.connection.getResponseCode();

        String message = "~ " + "POST" + " ~ " + this.url.toString() + " | RESPONSE:\n";
        StringBuilder fullResponse = new StringBuilder().append(message);

        fullResponse.append(responseCode).append(" ").append(this.connection.getResponseMessage()).append("\n");

        this.connection.getHeaderFields().entrySet().stream().filter(entry -> entry.getKey() != null)
                .forEach(entry -> {
                    fullResponse.append(entry.getKey()).append(": ");
                    List<String> headerValues = entry.getValue();

                    for (int i = 0; i < headerValues.size(); i++) {
                        fullResponse.append(headerValues.get(i));
                        fullResponse.append(i < headerValues.size() - 1 ? ", " : "\n");
                    }
                });

        setInputStream(responseCode > 299 ? this.connection.getErrorStream() : this.connection.getInputStream());
        return fullResponse.toString();
    }

    private void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public String getRequestBody() {
        StringBuilder response = new StringBuilder();

        if (this.inputStream != null) {
            BufferedReader in = new BufferedReader(new InputStreamReader(this.inputStream));
            String inputLine;

            try {
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine).append("\n");
                }
                in.close();
            } catch (IOException ignored) {
            }
        }
        return response.toString();
    }

    private String getParamsString() throws UnsupportedEncodingException {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, String> entry : this.parameters.entrySet()) {
            result.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
            result.append("=");
            result.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            result.append("&");
        }

        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }

//    public void setRequestProperty(String property, String value) {
//        this.connection.setRequestProperty(property, value);
//    }
//
//    public String getRequestProperty(String property){
//        return this.connection.getRequestProperty(property);
//    }
//
//    public void setRequestTimeout(int ms) {
//        this.connection.setConnectTimeout(ms);
//        this.connection.setReadTimeout(ms);
//    }

    public void disconnect() {
        this.connection.disconnect();
    }


    public static void main(String[] args) {

        try {
        APIClient TestClient = new APIClient("http://localhost:8080/dataTransferWeb/Doc");


        String httpResponse = TestClient.run();
        String responseBody = TestClient.getRequestBody();

        System.out.println(httpResponse + "\n" + responseBody);

        } catch (IOException e) {
            e.printStackTrace();
        }



   }

}

