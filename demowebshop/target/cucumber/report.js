$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("demoshop.feature");
formatter.feature({
  "line": 2,
  "name": "Login for demoWebShop",
  "description": "I want to use this template for my feature files",
  "id": "login-for-demowebshop",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Login To DemoWeb with valid credentials",
  "description": "",
  "id": "login-for-demowebshop;login-to-demoweb-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User Is On My LoginPage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User Fillup uid \u003cusername\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User Fillup pwd \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User click LoginButton",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "login-for-demowebshop;login-to-demoweb-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12,
      "id": "login-for-demowebshop;login-to-demoweb-with-valid-credentials;;1"
    },
    {
      "cells": [
        "user1",
        "userpass"
      ],
      "line": 13,
      "id": "login-for-demowebshop;login-to-demoweb-with-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Login To DemoWeb with valid credentials",
  "description": "",
  "id": "login-for-demowebshop;login-to-demoweb-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    },
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User Is On My LoginPage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User Fillup uid user1",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User Fillup pwd userpass",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User click LoginButton",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});