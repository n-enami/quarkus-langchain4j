package io.quarkiverse.langchain4j.watsonx;

public class Parameters {

    private final String decodingMethod;
    private final Integer minNewTokens;
    private final Integer maxNewTokens;

    public Parameters(String decodingMethod, Integer minNewTokens, Integer maxNewTokens) {
        this.decodingMethod = decodingMethod;
        this.minNewTokens = minNewTokens;
        this.maxNewTokens = maxNewTokens;
    }

    public String getDecodingMethod() {
        return decodingMethod;
    }

    public Integer getMinNewTokens() {
        return minNewTokens;
    }

    public Integer getMaxNewTokens() {
        return maxNewTokens;
    }
}
