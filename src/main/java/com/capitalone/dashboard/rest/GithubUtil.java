package com.capitalone.dashboard.rest;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GithubUtil {
    public static JsonObject getPullRequest() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("src/test/data/github-request.json"));
        JsonParser parser = new JsonParser();
        return parser.parse(br).getAsJsonObject();
    }
}
