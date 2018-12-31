Feature: Postman echo
  As a tester for Postman echo sample service
  I want to do get operation
  so that the service response is validated

  Scenario: get operation for postman echo service
    Given I have a postman echo service available
    When I call get service for postman echo service
    Then I should be seeing success for the service call