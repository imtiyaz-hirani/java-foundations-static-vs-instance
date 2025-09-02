package com.pluralsight.pitfalls;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates why using mutable static variables can cause unexpected behavior.
 * Shows that changes in one object affect all other objects
 * sharing the same static list.
 */
public class StaticPitfalls {

    // BAD PRACTICE → Static mutable list shared across all objects
    private static List<String> sharedTags = new ArrayList<>();

    private String title;

    public StaticPitfalls(String title) {
        this.title = title;
    }

    // Adds a tag to the shared static list
    public void addTag(String tag) {
        sharedTags.add(tag);
    }

    // Displays all tags added so far
    public void showTags() {
        System.out.println("Tags for [" + title + "]: " + sharedTags);
    }
}