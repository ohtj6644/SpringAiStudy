package com.example.demoSpringAi;

import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class GPT_Controller {
    private  final OpenAiChatModel openAiChatModel;
   // private  final VertexAiGeminiChatModel vertexAiGeminiChatModel;

    public GPT_Controller(OpenAiChatModel openAiChatModel) {
        this.openAiChatModel = openAiChatModel;
        //this.vertexAiGeminiChatModel = vertexAiGeminiChatModel;
    }

    @PostMapping("/chat")
    //public Map<String, String> chat(@RequestBody String message) {
        public String chat(@RequestBody String question) {
        //Map<String, String> responses = new HashMap<>();

        String openAiResponse = openAiChatModel.call(question);

//        String vertexAiGeminiResponse = vertexAiGeminiChatModel.call(message);
//        responses.put("vertexai(gemini) 응답", vertexAiGeminiResponse);
        return openAiResponse;
    }


}
