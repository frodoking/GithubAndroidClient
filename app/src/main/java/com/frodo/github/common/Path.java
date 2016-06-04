package com.frodo.github.common;

/**
 * Created by frodo on 2016/4/30.
 */
public final class Path {
    public static final String HOST_GITHUB = "https://api.github.com";
    public static final String HOST_GITHUB_WEB = "http://github.com";
    public static final String HOST_CODEHUB = "http://trending.codehub-app.com";

    public final static class Explore {
        public static final String SHOWCASES = "/v2/showcases";
        public static final String TRENDING = "/v2/trending";
    }

    public final static class Authentication {
        public static final String OAUTH_ACCESS_TOKEN = "/login/oauth/access_token";
        public static final String AUTHORIZATIONS = "/authorizations";
    }

    public final static class Activity {

    }

    public final static class Gists {

    }

    public final static class GitData {

    }

    public final static class Issues {

    }

    public final static class Organizations {

    }

    public static class PullRequests {
        public static final String REPOS_OWNER_NAME_PULLS = "/repos/{owner}/{name}/pulls";
        public static final String REPOS_OWNER_NAME_PULLS_NUMBER = "/repos/{owner}/{name}/pulls/{number}";
    }

    public final static class Repositories {
        public static final String REPOS_FULLNAME = "/repos/%s";
    }

    public final static class Search {

    }

    public final static class Users {
        /**
         * "/users/{username}"
         */
        public static final String USER = "/users/%s";
        /**
         * Followers
         */
        public static final String USER_FOLLOWERS = USER + "/followers";
        /**
         * Repositories
         */
        public static final String USER_REPOS = USER + "/repos";
    }
}
