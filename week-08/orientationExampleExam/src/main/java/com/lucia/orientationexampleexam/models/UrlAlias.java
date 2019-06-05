package com.lucia.orientationexampleexam.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UrlAlias {

    @Id
    @Column(length = 50)
    private String url;
    private String alias;
    private Integer secretCode;

    public UrlAlias() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Integer getSecretCode() {
        return secretCode;
    }

    public void setSecretCode(Integer secretCode) {
        this.secretCode = secretCode;
    }

    public void generateSecretCode() {
        secretCode = (int)Math.random() + 1000 * 10000;
    }
}
