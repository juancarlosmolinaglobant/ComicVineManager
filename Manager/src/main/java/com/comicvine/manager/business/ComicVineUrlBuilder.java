package com.comicvine.manager.business;

import com.comicvine.manager.utils.ResourceType;

public class ComicVineUrlBuilder {

    public static final String API_KEY = "?api_key=5e4ee2f6e4bdab13511e2cda3f72cae8c80f75cc";
    private static final String BASE_URL = "https://comicvine.gamespot.com/api";
    private static final String SINGLE_RESOURCE_COMPONENT = "/%s/%s-%s/";
    private static final String JSON_FORMAT = "&format=json";
    private ComicVineUrlBuilder() {
    }

    public static String getCharacterUrlById(int id) {
        return new StringBuilder().append(BASE_URL).append(String.format(SINGLE_RESOURCE_COMPONENT,
                ResourceType.CHARACTER.detailResourceName,
                ResourceType.CHARACTER.id, id)).append(API_KEY).append(JSON_FORMAT).toString();
    }
}
