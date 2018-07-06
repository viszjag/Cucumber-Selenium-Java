$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login into account",
  "description": "",
  "id": "login-into-account",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6216705660,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Login into account with valid crednetials",
  "description": "   Existing stckoverflow user should be able to login successfully",
  "id": "login-into-account;login-into-account-with-valid-crednetials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User navigates to stackoverflow login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User clicks on login option",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enters username",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user enters password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks on login button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User should be navbigated to successful login page",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_navigates_to_stackoverflow_login_page()"
});
formatter.result({
  "duration": 4769658389,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_clicks_on_login_option()"
});
formatter.result({
  "duration": 1460770927,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_enters_username()"
});
formatter.result({
  "duration": 347984745,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_enters_password()"
});
formatter.result({
  "duration": 209874856,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 3107902170,
  "status": "passed"
});
formatter.match({
  "location": "Login.user_should_be_navbigated_to_successful_login_page()"
});
formatter.result({
  "duration": 5140482150,
  "status": "passed"
});
formatter.after({
  "duration": 6677199473,
  "status": "passed"
});
});