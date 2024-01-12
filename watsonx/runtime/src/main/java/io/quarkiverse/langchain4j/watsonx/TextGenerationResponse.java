package io.quarkiverse.langchain4j.watsonx;

import java.util.List;

public record TextGenerationResponse(List<Results> results) {

    public record Results(String generatedText) {

    }
}
