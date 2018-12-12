package guillaume.chineseapp;

public class Word {
    private String symbol;
    private String english;
    private String pinyin;

    public Word(String sym, String eng, String pin) {
        this.symbol = sym;
        this.english = eng;
        this.pinyin = pin;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getEnglish() {
        return english;
    }

    public String getPinyin() {
        return pinyin;
    }
}
