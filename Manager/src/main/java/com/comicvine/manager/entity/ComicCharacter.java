package com.comicvine.manager.entity;

import java.util.List;

public class ComicCharacter {
    private String aliases;
    private String apiDetailUrl;
    private String birth;
    private List<ResourceLocator> characterEnemies;
    private List<ResourceLocator> characterFriends;
    private Integer countOfIssueAppearances;
    private List<ResourceLocator> creators;
    private String dateAdded;
    private String dateLastUpdated;
    private String deck;
    private String description;
    private ResourceLocator firstAppearedInIssue;
    private Integer gender;
    private Integer id;
    private Image image;
    private List<ResourceLocator> issueCredits;
    private List<ResourceLocator> issuesDiedIn;
    private List<ResourceLocator> movies;
    private String name;
    private ResourceLocator origin;
    private List<ResourceLocator> powers;
    private ResourceLocator publisher;
    private String realName;
    private String siteDetailUrl;
    private List<ResourceLocator> storyArcCredits;
    private List<ResourceLocator> teamEnemies;
    private List<ResourceLocator> teamFriends;
    private List<ResourceLocator> teams;
    private List<ResourceLocator> volumeCredits;

    public String getAliases() {
        return aliases;
    }

    public void setAliases(String aliases) {
        this.aliases = aliases;
    }

    public String getApiDetailUrl() {
        return apiDetailUrl;
    }

    public void setApiDetailUrl(String apiDetailUrl) {
        this.apiDetailUrl = apiDetailUrl;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public List<ResourceLocator> getCharacterEnemies() {
        return characterEnemies;
    }

    public void setCharacterEnemies(List<ResourceLocator> characterEnemies) {
        this.characterEnemies = characterEnemies;
    }

    public List<ResourceLocator> getCharacterFriends() {
        return characterFriends;
    }

    public void setCharacterFriends(List<ResourceLocator> characterFriends) {
        this.characterFriends = characterFriends;
    }

    public Integer getCountOfIssueAppearances() {
        return countOfIssueAppearances;
    }

    public void setCountOfIssueAppearances(Integer countOfIssueAppearances) {
        this.countOfIssueAppearances = countOfIssueAppearances;
    }

    public List<ResourceLocator> getCreators() {
        return creators;
    }

    public void setCreators(List<ResourceLocator> creators) {
        this.creators = creators;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getDateLastUpdated() {
        return dateLastUpdated;
    }

    public void setDateLastUpdated(String dateLastUpdated) {
        this.dateLastUpdated = dateLastUpdated;
    }

    public String getDeck() {
        return deck;
    }

    public void setDeck(String deck) {
        this.deck = deck;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ResourceLocator getFirstAppearedInIssue() {
        return firstAppearedInIssue;
    }

    public void setFirstAppearedInIssue(ResourceLocator firstAppearedInIssue) {
        this.firstAppearedInIssue = firstAppearedInIssue;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public List<ResourceLocator> getIssueCredits() {
        return issueCredits;
    }

    public void setIssueCredits(List<ResourceLocator> issueCredits) {
        this.issueCredits = issueCredits;
    }

    public List<ResourceLocator> getIssuesDiedIn() {
        return issuesDiedIn;
    }

    public void setIssuesDiedIn(List<ResourceLocator> issuesDiedIn) {
        this.issuesDiedIn = issuesDiedIn;
    }

    public List<ResourceLocator> getMovies() {
        return movies;
    }

    public void setMovies(List<ResourceLocator> movies) {
        this.movies = movies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ResourceLocator getOrigin() {
        return origin;
    }

    public void setOrigin(ResourceLocator origin) {
        this.origin = origin;
    }

    public List<ResourceLocator> getPowers() {
        return powers;
    }

    public void setPowers(List<ResourceLocator> powers) {
        this.powers = powers;
    }

    public ResourceLocator getPublisher() {
        return publisher;
    }

    public void setPublisher(ResourceLocator publisher) {
        this.publisher = publisher;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getSiteDetailUrl() {
        return siteDetailUrl;
    }

    public void setSiteDetailUrl(String siteDetailUrl) {
        this.siteDetailUrl = siteDetailUrl;
    }

    public List<ResourceLocator> getStoryArcCredits() {
        return storyArcCredits;
    }

    public void setStoryArcCredits(List<ResourceLocator> storyArcCredits) {
        this.storyArcCredits = storyArcCredits;
    }

    public List<ResourceLocator> getTeamEnemies() {
        return teamEnemies;
    }

    public void setTeamEnemies(List<ResourceLocator> teamEnemies) {
        this.teamEnemies = teamEnemies;
    }

    public List<ResourceLocator> getTeamFriends() {
        return teamFriends;
    }

    public void setTeamFriends(List<ResourceLocator> teamFriends) {
        this.teamFriends = teamFriends;
    }

    public List<ResourceLocator> getTeams() {
        return teams;
    }

    public void setTeams(List<ResourceLocator> teams) {
        this.teams = teams;
    }

    public List<ResourceLocator> getVolumeCredits() {
        return volumeCredits;
    }

    public void setVolumeCredits(List<ResourceLocator> volumeCredits) {
        this.volumeCredits = volumeCredits;
    }

    @Override
    public String toString() {
        return "ComicCharacter{" +
                "aliases='" + aliases + '\'' +
                ", apiDetailUrl='" + apiDetailUrl + '\'' +
                ", birth='" + birth + '\'' +
                ", characterEnemies=" + characterEnemies +
                ", characterFriends=" + characterFriends +
                ", countOfIssueAppearances=" + countOfIssueAppearances +
                ", creators=" + creators +
                ", dateAdded='" + dateAdded + '\'' +
                ", dateLastUpdated='" + dateLastUpdated + '\'' +
                ", deck='" + deck + '\'' +
                ", description='" + description + '\'' +
                ", firstAppearedInIssue=" + firstAppearedInIssue +
                ", gender=" + gender +
                ", id=" + id +
                ", image=" + image +
                ", issueCredits=" + issueCredits +
                ", issuesDiedIn=" + issuesDiedIn +
                ", movies=" + movies +
                ", name='" + name + '\'' +
                ", origin=" + origin +
                ", powers=" + powers +
                ", publisher=" + publisher +
                ", realName='" + realName + '\'' +
                ", siteDetailUrl='" + siteDetailUrl + '\'' +
                ", storyArcCredits=" + storyArcCredits +
                ", teamEnemies=" + teamEnemies +
                ", teamFriends=" + teamFriends +
                ", teams=" + teams +
                ", volumeCredits=" + volumeCredits +
                '}';
    }
}
