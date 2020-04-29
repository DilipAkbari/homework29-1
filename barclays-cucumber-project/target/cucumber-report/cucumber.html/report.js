$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/barclays/resources/featurefile/home.feature");
formatter.feature({
  "line": 1,
  "name": "Customer Feature",
  "description": "As a customer i can see switch to an account successfully",
  "id": "customer-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 22635882200,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should navigate to Switch an account successfully",
  "description": "",
  "id": "customer-feature;user-should-navigate-to-switch-an-account-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on Bank Tab",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on Switch to bank Account tab",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iAmOnHomePage()"
});
formatter.result({
  "duration": 347628900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnBankTab()"
});
formatter.result({
  "duration": 711676200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnSwitchToBankAccountTab()"
});
formatter.result({
  "duration": 14810405900,
  "status": "passed"
});
formatter.after({
  "duration": 1159702600,
  "status": "passed"
});
});