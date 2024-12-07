package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import ai.peoplecode.OpenAIConversation;


@RestController
@RequestMapping("/{bookId}/chapters/{chapId}")
public class OpenAIController {

    private final OpenAIConversation conversation;

    @Value("${openai.api.key}")
    private String apiKey;

    @Value("${openai.assistant.id}")
    private String assistantId;

    public OpenAIController() {
        this.conversation = new OpenAIConversation(apiKey, "gpt-4o-mini");
    }

    @PostMapping("/ask")
    public String askQuestion(@PathVariable String bookId, @PathVariable String chapId, @RequestParam String context, @RequestParam String question) {
        return conversation.askQuestion(apiKey, context, question, assistantId);
    }


    @PostMapping("/generate-questions")
    public List<String> generateSampleQuestions(@PathVariable String bookId, @PathVariable String chapId) {
        String bookTitle = "";
        if (bookId == "TOTM") {
            bookTitle = "Tyranny of the Minority";
            } else {
                bookTitle = "How Democracies Die";
            }
        String context = "You are a teaching assistant generating questions about chapter" + chapId + "in the book" + bookTitle;
        int count = 1;
        int maxWords = 50;
        return conversation.generateSampleQuestions(apiKey, context, assistantId, count, maxWords);
    }

    @PostMapping("/get-question-answer")
    public String getQuestionAnswer(@PathVariable String bookId, @PathVariable String chapId, @RequestParam String question) {
        String bookTitle = "";
        if (bookId == "TOTM") {
            bookTitle = "Tyranny of the Minority";
        } else {
            bookTitle = "How Democracies Die";
        }
        String context = "You are a teaching assistant answering the following question about chapter" + chapId + "in the book" + bookTitle;
        return conversation.askQuestion(apiKey, context, question, assistantId);
    }
}
