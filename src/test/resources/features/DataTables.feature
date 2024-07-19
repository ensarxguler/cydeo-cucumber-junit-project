Feature: Cucumber Data Tables implementation practices

  @dataTablePractice @fruitsAndVegetables
  Scenario: List of the fruits and vegetables I like
    Then user should see below list of fruits and vegetables
      | orange     |
      | apple      |
      | kiwi       |
      | strawberry |
      | tomato     |
      | pear       |
      | eggplant   |
    
    # To beautify the pipes above = ctrl + alt + l
  
    # Create a new scenario where we list the type of pets we love
    # Print out all the Strings in the List

  @dataTablePractice @petTypes
  Scenario: List of the pet types I love
    Then I will share my favorites
      | kangal           |
      | Husky            |
      | Golden Retriever |
      | Golden Doodle    |
      | Munchkin         |
      | Ragdoll cat      |
      | Siberian cat     |

  @dataTablePractice @driverInfo
  Scenario: Officer reads data about driver
    Then officer is able to see any data he wants
      | name    | Jane          |
      | surname | Doe           |
      | age     | 29            |
      | address | somewhere     |
      | state   | CA            |
      | zipcode | 99999         |
      | phone   | 111-1111-1111 |

  @dataTablePractice @months
  Scenario: User should be able to see all 12 months in months
  dropdown

    Given User is on the dropdowns page of practice tool
    Then User should see below info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |