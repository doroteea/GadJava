package Project01.observer;

import java.util.ArrayList;
import java.util.List;

public class Article {
    private String title;
    private List<String> authors = new ArrayList<>();
    private int wordCount;
    private Category category;
    private String body;

    public Article(String title, List<String> authors, int wordCount, Category category, String body) {
        this.title = title;
        this.authors = authors;
        this.wordCount = wordCount;
        this.category = category;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public void setAuthors(ArrayList authors) {
        this.authors = authors;
    }

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
