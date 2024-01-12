package io.quarkiverse.langchain4j.watsonx.runtime;

import java.util.function.Supplier;

import io.quarkiverse.langchain4j.watsonx.WatsonxChatModel;
import io.quarkiverse.langchain4j.watsonx.runtime.config.ChatModelConfig;
import io.quarkiverse.langchain4j.watsonx.runtime.config.Langchain4jWatsonxConfig;
import io.quarkus.runtime.annotations.Recorder;

@Recorder
public class WatsoxRecorder {

    public Supplier<?> chatModel(Langchain4jWatsonxConfig runtimeConfig) {
        ChatModelConfig chatModelConfig = runtimeConfig.chatModel();

        var builder = WatsonxChatModel.builder()
                .accessToken(runtimeConfig.apiKey())
                .timeout(runtimeConfig.timeout())
                .modelId(chatModelConfig.modelId())
                .version(chatModelConfig.version());

        if (runtimeConfig.baseUrl().isPresent()) {
            builder.url(runtimeConfig.baseUrl().get());
        }

        return new Supplier<>() {
            @Override
            public Object get() {
                return builder.build();
            }
        };
    }
}
