package com.lucia.reddit.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Post {

    @Id
    @GeneratedValue
    private long id;
    private String title;
    private String url;
    private int totalVotes;

    public Post() {
    }
    public Post(String title, String url) {
        this.title = title;
        this.url = url;
    }

    public Post(String title, String url, int totalVotes) {
        this.title = title;
        this.url = url;
        this.totalVotes = totalVotes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getTotalVotes() {
        return totalVotes;
    }

    public void setTotalVotes(int totalVotes) {
        this.totalVotes = totalVotes;
    }
    public void upvote() {
        this.totalVotes++;
    }
    public void downvote() {
        this.totalVotes--;
    }
}