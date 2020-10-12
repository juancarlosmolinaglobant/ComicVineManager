package com.comicvine.manager.entity;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Image {
    private String iconUrl;
    private String mediumUrl;
    private String screenUrl;
    private String screenLargeUrl;
    private String smallUrl;
    private String superUrl;
    private String thumbUrl;
    private String tinyUrl;
    private String originalUrl;
    private String imageTags;

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getMediumUrl() {
        return mediumUrl;
    }

    public void setMediumUrl(String mediumUrl) {
        this.mediumUrl = mediumUrl;
    }

    public String getScreenUrl() {
        return screenUrl;
    }

    public void setScreenUrl(String screenUrl) {
        this.screenUrl = screenUrl;
    }

    public String getScreenLargeUrl() {
        return screenLargeUrl;
    }

    public void setScreenLargeUrl(String screenLargeUrl) {
        this.screenLargeUrl = screenLargeUrl;
    }

    public String getSmallUrl() {
        return smallUrl;
    }

    public void setSmallUrl(String smallUrl) {
        this.smallUrl = smallUrl;
    }

    public String getSuperUrl() {
        return superUrl;
    }

    public void setSuperUrl(String superUrl) {
        this.superUrl = superUrl;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    public String getTinyUrl() {
        return tinyUrl;
    }

    public void setTinyUrl(String tinyUrl) {
        this.tinyUrl = tinyUrl;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public String getImageTags() {
        return imageTags;
    }

    public void setImageTags(String imageTags) {
        this.imageTags = imageTags;
    }

    @Override
    public String toString() {
        return "Image{" +
                "iconUrl='" + iconUrl + '\'' +
                ", mediumUrl='" + mediumUrl + '\'' +
                ", screenUrl='" + screenUrl + '\'' +
                ", screenLargeUrl='" + screenLargeUrl + '\'' +
                ", smallUrl='" + smallUrl + '\'' +
                ", superUrl='" + superUrl + '\'' +
                ", thumbUrl='" + thumbUrl + '\'' +
                ", tinyUrl='" + tinyUrl + '\'' +
                ", originalUrl='" + originalUrl + '\'' +
                ", imageTags='" + imageTags + '\'' +
                '}';
    }
}
