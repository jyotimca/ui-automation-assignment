$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/jmishra/Desktop/automation-framework/uiautomationframework/src/main/java/com/testautomation/features/createNewRepoUsingFork.feature");
formatter.feature({
  "line": 1,
  "name": "Fork a Repo to Create a new Project",
  "description": "As a logged in user, I want to search Project in Particular Language and fork to create a new one",
  "id": "fork-a-repo-to-create-a-new-project",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "",
  "description": "",
  "id": "fork-a-repo-to-create-a-new-project;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am logged in to GitHub",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I search for project written in \"Golang\" Language",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I sort the search in \"Most star\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I click on first result",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I fork the project",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I mark the new project as star",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStepDefinations.i_am_logged_in_to_GitHub()"
});
formatter.result({
  "duration": 5419709505,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Golang",
      "offset": 33
    }
  ],
  "location": "SearchPageStepDefinations.i_search_for_project_written_in_Language(String)"
});
formatter.result({
  "duration": 1175879013,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Most star",
      "offset": 22
    }
  ],
  "location": "SearchPageStepDefinations.i_sort_the_search_in(String)"
});
formatter.result({
  "duration": 202043191,
  "status": "passed"
});
formatter.match({
  "location": "SearchPageStepDefinations.i_click_on_first_result()"
});
formatter.result({
  "duration": 1582333398,
  "status": "passed"
});
formatter.match({
  "location": "RepoPageStepDefinations.i_fork_the_project()"
});
formatter.result({
  "duration": 1533923517,
  "status": "passed"
});
formatter.match({
  "location": "RepoPageStepDefinations.i_mark_the_new_project_as_star()"
});
formatter.result({
  "duration": 134959227,
  "status": "passed"
});
formatter.match({
  "location": "TearDownStepDefinations.iCloseTheBrowser()"
});
formatter.result({
  "duration": 100424714,
  "status": "passed"
});
});