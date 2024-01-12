package io.quarkiverse.langchain4j.watsonx.runtime.config;

import static io.quarkus.runtime.annotations.ConfigPhase.RUN_TIME;

import java.net.URL;
import java.time.Duration;
import java.util.Optional;

import io.quarkus.runtime.annotations.ConfigDocDefault;
import io.quarkus.runtime.annotations.ConfigRoot;
import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithDefault;

@ConfigRoot(phase = RUN_TIME)
@ConfigMapping(prefix = "quarkus.langchain4j.watsonx")
public interface Langchain4jWatsonxConfig {

    /**
     * Base URL where the Ollama serving is running
     */
    @ConfigDocDefault("https://bam-api.res.ibm.com")
    Optional<URL> baseUrl();

    /**
     * Watsonx API key
     */
    String apiKey();

    /**
     * Timeout for Watsonx calls
     */
    @WithDefault("10s")
    Duration timeout();

    /**
     * Whether the Watsonx client should log requests
     */
    @WithDefault("false")
    Boolean logRequests();

    /**
     * Whether the Watsonx client should log responses
     */
    @WithDefault("false")
    Boolean logResponses();

    /**
     * Chat model related settings
     */
    ChatModelConfig chatModel();
}
