package edu.escuelaing.arep.app;

import java.io.IOException;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class Cliente {

    private final CloseableHttpClient httpClient = HttpClients.createDefault();
    public static void main(String[] args) throws Exception {

        Cliente obj = new Cliente();

        try {
            System.out.println("Testing 3 - Send Http GET request");
            obj.sendGet("datos","9,8,7,6,3,2,5,8,1");
        } finally {
            obj.close();
        }
    }

    private void close() throws IOException {
        httpClient.close();
    }

    private void sendGet(String param, String value) throws Exception {
        String url = "https://arep-parcial-01.herokuapp.com/results";
        url += "?"+param+"=" +value.replace(",", "%2C");
        //String uri = "https://arep-parcial-01.herokuapp.com/results?datos=9%2C8%2C7%2C6%2C3%2C2%2C5%2C8";
        //System.out.println(url);
        //System.out.println(uri);
        HttpGet request = new HttpGet(url);
        try (CloseableHttpResponse response = httpClient.execute(request)) {

            // Get HttpResponse Status
            System.out.println(response.getStatusLine().toString());

            HttpEntity entity = response.getEntity();
            Header headers = entity.getContentType();
            System.out.println(headers);

            if (entity != null) {
                // return it as a String
                String result = EntityUtils.toString(entity);
                System.out.println(result);
            }
        }
    }

}