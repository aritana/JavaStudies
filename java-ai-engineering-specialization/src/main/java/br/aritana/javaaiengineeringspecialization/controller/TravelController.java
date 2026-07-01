package br.aritana.javaaiengineeringspecialization.controller;

import br.aritana.javaaiengineeringspecialization.assistant.TravelAgentAssistant;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/travel")
public class TravelController {
    private final TravelAgentAssistant assistant;

    public TravelController(TravelAgentAssistant assistant) {
        this.assistant = assistant;
    }

    @PostMapping(
            consumes = MediaType.TEXT_PLAIN_VALUE,
            produces = MediaType.TEXT_PLAIN_VALUE
    )
    public String ask(@RequestBody  String question) {
        System.out.println(question);
        return assistant.chat(question);
    }
}
