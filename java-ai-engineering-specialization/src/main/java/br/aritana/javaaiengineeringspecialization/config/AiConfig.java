package br.aritana.javaaiengineeringspecialization.config;

import br.aritana.javaaiengineeringspecialization.assistant.TravelAgentAssistant;
import dev.langchain4j.model.ollama.OllamaChatModel;
import dev.langchain4j.service.AiServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

@Configuration
public class AiConfig {
    @Bean
    public OllamaChatModel ollamaChatModel() {
        return OllamaChatModel.builder()
                .baseUrl("http://localhost:11434")
                .modelName("gemma3:4b")
                .temperature(0.2)
                .timeout(Duration.ofSeconds(60))
                .build();
    }

    @Bean
    public TravelAgentAssistant travelAgentAssistant(
            OllamaChatModel model) {

        return AiServices.create(
                TravelAgentAssistant.class,
                model
        );
    }
}
