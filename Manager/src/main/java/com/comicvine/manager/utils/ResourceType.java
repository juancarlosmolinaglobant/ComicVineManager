package com.comicvine.manager.utils;

public enum ResourceType {
    CHARACTER(4005, "character", "characters"),
    CHAT(2450, "chat", "chats"),
    CONCEPT(4015, "concept", "concepts"),
    EPISODE(4070, "episode", "episodes"),
    ISSUE(4000, "issue", "issues"),
    LOCATION(4020, "location", "locations"),
    MOVIE(4025, "movie", "movies"),
    OBJECT(4055, "object", "objects"),
    ORIGIN(4030, "origin", "origins"),
    PERSON(4040, "person", "people"),
    POWER(4035, "power", "powers"),
    PROMO(1700, "promo", "promos"),
    PUBLISHER(4010, "publisher", "publishers"),
    SERIES(4075, "series", "series"),
    STORY_ARC(4045, "story_arc", "story_arcs"),
    TEAM(4060, "team", "teams"),
    VIDEO(2300, "video", "videos"),
    VIDEO_TYPE(2320, "video_type", "video_types"),
    VIDEO_CATEGORY(2320, "video_category", "video_categories"),
    VOLUME(4050, "volume", "volumes");

    public final int id;
    public final String detailResourceName;
    public final String listResourceName;

    ResourceType(int id, String detailResourceName, String listResourceName) {
        this.id = id;
        this.detailResourceName = detailResourceName;
        this.listResourceName = listResourceName;
    }
}
