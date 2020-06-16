package com.capitalone.dashboard.service;


import com.google.gson.JsonObject;

import java.io.IOException;

public interface GithubHookService {
    JsonObject getPullRequest() throws IOException;
}
