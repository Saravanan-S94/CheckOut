package com.gpt;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCount {
    public static void main(String[] args) {
        // Example stream
        List<String> stream = Arrays.asList("A", "B", "A", "C", "A", "B");

        // Frequency map
        Map<String, Integer> frequencyMap = new HashMap<>();

        // Count frequencies
        for (String item : stream) {
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }

        // Print results
        System.out.println("Frequency Count: " + frequencyMap);
    }
}