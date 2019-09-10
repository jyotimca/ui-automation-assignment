Feature: Fork a Repo to Create a new Project
  As a logged in user, I want to search Project in Particular Language and fork to create a new one

  Scenario:
    Given I am logged in to GitHub
    And I search for project written in "Golang" Language
    Then I sort the search in "Most star"
    And I click on first result
    Then I fork the project
    And I mark the new project as star
    And I close the browser