package exchange.exchanetradingsystem.trading.infrastructure.out.exchange.bithumb;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class BithumbApiClientConfig {
    private static final String BASE_URL = "https://api.bithumb.com/v1/";

    @Bean
    public Response okHttpClient() {
        OkHttpClient client = new OkHttpClient();
        Call response = null;
        try {

        Request request = new Request.Builder()
                .url("https://api.bithumb.com/v1/ticker?markets=KRW-BTC")
                .get()
                .addHeader("accept", "application/json")
                .build();


            response = client.newCall(request);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return response;
    }


}
