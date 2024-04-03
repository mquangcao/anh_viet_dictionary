package model;

import java.util.Objects;

public class Word {
    private String word;
    private String meaning;

    /**
     * 
     */
    public Word() {
    }

    public Word(String _word, String _meaning) {
        word = _word;
        meaning = _meaning;
    }

    public String getWord() {
        return this.word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return this.meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    @Override
    public String toString() {
        return "Word [Word= " + word + ", Meaning= " + meaning + "]\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Word word1 = (Word) o;
        return Objects.equals(word, word1.word) &&
                Objects.equals(meaning, word1.meaning);
    }

    @Override
    public int hashCode() {
        System.out.println(Objects.hash(word, meaning));
        return Objects.hash(word, meaning);
    }
}
