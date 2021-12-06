package lab4.ch5;

public class WordOccurence {
    private int occ;
    private String word;

    public WordOccurence(int occ, String word) {
        this.occ = 1;
        this.word = word;
    }

    public int getOcc() {
        return occ;
    }

    public void setOcc(int occ) {
        this.occ = occ;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void plusOcc(){
        occ++;
    }
}
