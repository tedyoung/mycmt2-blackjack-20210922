package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CardDisplayTest {

    @Test
    public void displayTenAsString() throws Exception {
        Card card = new Card(Suit.CLUBS, Rank.TEN);

        assertThat(card.display())
                .isEqualTo("[30m┌─────────┐[1B[11D│10       │[1B[11D│         │[1B[11D│    ♣    │[1B[11D│         │[1B[11D│       10│[1B[11D└─────────┘");
    }

    @Test
    public void displayNonTenAsString() throws Exception {
        Card card = new Card(Suit.HEARTS, Rank.FIVE);

        assertThat(card.display())
                .isEqualTo("[31m┌─────────┐[1B[11D│5        │[1B[11D│         │[1B[11D│    ♥    │[1B[11D│         │[1B[11D│        5│[1B[11D└─────────┘");
    }
}
