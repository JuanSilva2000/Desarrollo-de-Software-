Feature: BellyFeature

  Scenario: eaten many cukes and growl
    Given I have eaten 20 cukes
    When I wait 4 hour
    Then My belly should growl

  Scenario: eaten many cukes and growl
    Given I have eaten 11 cukes
    When I wait 2 hour
    Then My belly should growl


  Scenario: eaten many cukes and not growl
    Given I have eaten 25 cukes
    When I wait 0 hour
    Then My belly should not growl

  Scenario: eaten many cukes and not growl
    Given I have eaten 11 cukes
    When I wait 1 hour
    Then My belly should not growl

  Scenario: eaten few cukes and not growl
    Given I have eaten 5 cukes
    When I wait 3 hour
    Then My belly should not growl

  Scenario: eaten few cukes and not growl
    Given I have eaten 10 cukes
    When I wait 2 hour
    Then My belly should not growl

  Scenario: eaten few cukes and not growl
    Given I have eaten 6 cukes
    When I wait 1 hour
    Then My belly should not growl

  Scenario: eaten few cukes and not growl
    Given I have eaten 10 cukes
    When I wait 1 hour
    Then My belly should not growl