package io.github.rluu.api;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FlashCardList extends DatabaseObject {
    @JsonProperty
    private String name;
    @JsonProperty
    private String description;
    @JsonProperty
    private List<FlashCard> flashCards;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public List<FlashCard> getFlashCards() {
        return flashCards;
    }
    public void setFlashCards(List<FlashCard> flashCards) {
        this.flashCards = flashCards;
    }
}