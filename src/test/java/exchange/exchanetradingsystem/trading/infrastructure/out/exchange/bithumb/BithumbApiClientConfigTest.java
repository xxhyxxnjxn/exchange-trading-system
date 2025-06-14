package exchange.exchanetradingsystem.trading.infrastructure.out.exchange.bithumb;


import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

import java.io.IOException;

@SpringBootTest
public class BithumbApiClientConfigTest {

    @Test
    public void okHttpClient() {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://api.bithumb.com/v1/ticker?markets=KRW-BTC")
                .get()
                .addHeader("accept", "application/json")
                .build();


        try(Response response = client.newCall(request).execute()){
            System.out.println(response.body().string());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}