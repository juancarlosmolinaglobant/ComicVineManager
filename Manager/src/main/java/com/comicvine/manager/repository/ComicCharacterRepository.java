package com.comicvine.manager.repository;

import com.comicvine.manager.business.ComicVineUrlBuilder;
import com.comicvine.manager.entity.ComicCharacter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.MediaType;
import java.util.Objects;

public class ComicCharacterRepository {
    private final Client client;
    private final ObjectMapper objectMapper;

    public ComicCharacterRepository() {
        this.client = ClientBuilder.newClient();
        this.objectMapper = new ObjectMapper();
        this.objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
    }

    public ComicCharacter getById(int id) {
        String url = ComicVineUrlBuilder.getCharacterUrlById(id);
        return getByUrl(url);
    }

    public ComicCharacter getByUrl(String url) {
        try {
            Invocation.Builder invocationBuilder = client.target(url).request(MediaType.APPLICATION_JSON);
            String jsonResult = invocationBuilder.get().readEntity(String.class);
            JsonNode jsonNode = objectMapper.readTree(jsonResult);
            if (Objects.isNull(jsonNode.get("results"))) {
                return new ComicCharacter();
            }
            String characterAsString = jsonNode.get("results").toString();
            if (characterAsString.equals("[]")) {
                return new ComicCharacter();
            }
            return objectMapper.readValue(characterAsString, ComicCharacter.class);
        } catch (JsonProcessingException exception) {
            return new ComicCharacter();
        }
    }
}
