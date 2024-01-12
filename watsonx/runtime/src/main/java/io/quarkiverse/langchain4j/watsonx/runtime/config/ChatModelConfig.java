package io.quarkiverse.langchain4j.watsonx.runtime.config;

import io.quarkus.runtime.annotations.ConfigGroup;
import io.smallrye.config.WithDefault;

@ConfigGroup
public interface ChatModelConfig {

    /**
     * Model to use
     */
    @WithDefault("meta-llama/llama-2-70b-chat")
    String modelId();

    /**
     * Version to use
     */
    @WithDefault("2024-01-10")
    String version();
}
