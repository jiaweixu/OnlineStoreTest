$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LogInTest.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    }
  ],
  "line": 19,
  "name": "Login Action",
  "description": "\r\nAs a user\r\nI want to log into my account \r\nso that I can browse the website as a member",
  "id": "login-action",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 26,
  "name": "Successful login with valid credentials",
  "description": "",
  "id": "login-action;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 27,
  "name": "User is on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "User navigate to LogIn page",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "User enters \"username\" and \"password\"",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User successfully login",
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
formatter.scenario({
  "line": 32,
  "name": "Failed login with invalid credentials",
  "description": "",
  "id": "login-action;failed-login-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 33,
  "name": "User is on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "User navigate to LogIn page",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "User enters \"username\" and \"password\"",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "User failed to login",
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
formatter.uri("PageTest.feature");
formatter.feature({
  "line": 2,
  "name": "Page availability",
  "description": "\r\nAs a user\r\nI want to navigate to a specific page \r\nso that I can browse the content on that page",
  "id": "page-availability",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 9,
  "name": "Home Page Test",
  "description": "",
  "id": "page-availability;home-page-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User open a Firefox browser",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User input the URL address \"http://www.store.demoqa.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User can go into the \"ONLINE STORE\" page",
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
formatter.scenario({
  "line": 14,
  "name": "Home Page Link Test",
  "description": "",
  "id": "page-availability;home-page-link-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "User is on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "User click the Home button",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User can go into the \"ONLINE STORE\" page",
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
formatter.scenario({
  "line": 19,
  "name": "Product Category Page Link Test",
  "description": "",
  "id": "page-availability;product-category-page-link-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "User is on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "User click the Product Category button",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "User can go into the \"Product Category\" page",
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
formatter.scenario({
  "line": 24,
  "name": "All Product Page Link Test",
  "description": "",
  "id": "page-availability;all-product-page-link-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "User is on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "User click the All Product button",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "User can go into the \"Product Category\" page",
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
});