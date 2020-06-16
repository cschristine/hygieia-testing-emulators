package com.capitalone.dashboard.service;

import com.capitalone.dashboard.rest.GithubUtil;
import com.google.gson.JsonObject;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class GithubHookServiceImpl implements GithubHookService {

    @Override
    public JsonObject getPullRequest() throws IOException {
        return GithubUtil.getPullRequest();
    }
}
