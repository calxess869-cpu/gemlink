package com.gemlink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "*") // Allows your frontend file to  communicate with this API
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    // Simple status message
    @GetMapping("/")
    public String home() {
        return "💎 GemLink API Server is running.";
    }

    // This endpoint sends the dynamic list of popular games to your UI
    @GetMapping("/api/games")
    public List<Game> getPopularGames() {
        return Arrays.asList(
                new Game("Mobile Legends: Bang Bang", "From S$ 0.50", "⚔️"),
                new Game("Free Fire", "From S$ 0.50", "🔥"),
                new Game("PUBG Mobile", "From S$ 0.80", "🪂"),
                new Game("Call of Duty: Mobile", "From S$ 1.20", "🔫"),
                new Game("Roblox", "From S$ 0.60", "🧱")
        );
    }
}