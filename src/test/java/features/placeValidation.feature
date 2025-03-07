Feature: Validating Place API's

  Scenario Outline: Verify if Place is being successfully added using AddPlaceAPI
    Given Add Place Payload with "<name>" "<language>" "<address>"
    When user calls "addPlaceAPI" with "Post" http request
    Then the API call got success with status code 200
    And "status" in response body is "OK"
    And "scope" in response body is "APP"
    And verify place_id created maps to "<name>" using "getPlaceAPI"

    Examples:
      | name                 | language             | address   |
      | Arun Kumar A S | Kannada, English | Blue Bell |
   #  | Ranjitha A S      | Kannada, English | World Cross Center |