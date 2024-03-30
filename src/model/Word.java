package model;

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

    public String toString() {
        return "Word [Word= " + word + ", Meaning= " + meaning + "]\n";
    }
}
