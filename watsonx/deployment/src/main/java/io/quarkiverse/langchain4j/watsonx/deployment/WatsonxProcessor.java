package io.quarkiverse.langchain4j.watsonx.deployment;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

public class WatsonxProcessor {

    private static final String FEATURE = "langchain4j-watsonx";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }
}
