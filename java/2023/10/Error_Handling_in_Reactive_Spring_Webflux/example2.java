import org.springframework.context.annotation.Configuration;
import org.springframework.web.server.WebExceptionHandler;
import org.springframework.web.server.adapter.WebHttpHandlerBuilder;

@Configuration
public class WebConfiguration {

    public WebHttpHandlerBuilder webHttpHandlerBuilder(WebExceptionHandler globalErrorHandler) {
        return WebHttpHandlerBuilder.webHandlerBuilder()
                .filter((exchange, chain) -> globalErrorHandler.handle(exchange, chain.next())
                        .onErrorResume(throwable -> Mono.error(throwable)));
    }
}
