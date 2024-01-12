package io.quarkiverse.langchain4j.watsonx;

import java.util.List;

public record TextGenerationRequest(String modelId, List<Message> messages, Parameters parameters) {

}
