package org.acme.example.watsonx;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import dev.langchain4j.model.chat.ChatLanguageModel;
import io.quarkiverse.langchain4j.watsonx.WatsonxChatModel;

@Path("chat")
public class ChatLanguageModelResource {

    private final ChatLanguageModel chatLanguageModel;

    public ChatLanguageModelResource() {
        this.chatLanguageModel = WatsonxChatModel.builder()
                .accessToken("TODO")
                .modelId("meta-llama/llama-2-70b-chat")
                .version("2024-01-10")
                .logRequests(true)
                .logResponses(true)
                .build();
    }

    @GET
    @Path("basic")
    public String basic() {
        return chatLanguageModel.generate("When was the nobel prize for economics first awarded?");
    }
}
