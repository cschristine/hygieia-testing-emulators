package com.capitalone.dashboard.rest;

import com.capitalone.dashboard.service.GithubHookService;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/webhook")
public class GithubHookController {

    public final GithubHookService githubHookService;

    @Autowired
    GithubHookController(GithubHookService githubHookService) {
        this.githubHookService = githubHookService;
    }

    @RequestMapping(value = "/github/pr", method = RequestMethod.GET)
    public ResponseEntity<String> getGithubPullRequest () throws IOException {
        return ResponseEntity.status(HttpStatus.CREATED).body(githubHookService.getPullRequest().toString());
    }

    @RequestMapping(value = "/github/v3", method = POST,
            consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<String> createGitHubv3(@RequestBody JsonObject request) {
        String response = "Success";
        // process request
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }
}
