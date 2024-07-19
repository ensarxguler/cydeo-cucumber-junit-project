@webTableOrder
Feature: Some of the general functionality verifications
  Agile Story: Verify required options under the product dropdown

  Background: User should be able to login with correct credentials
    Given User is on the login page of Web Table app
    When User enters below credentials
      | username | Test   |
      | password | Tester |
    When User is on the Order page

  Scenario: Dropdown options verifications
    Then User sees below options under product dropdown
      | MoneyCog   |
      | Familybea  |
      | Screenable |

  Scenario: Payment options verifications
    When User sees below radio buttons enabled for Visa, MasterCard and American Express
    Then User sees below radio button texts
      | Visa             |
      | MasterCard       |
      | American Express |

  Scenario: Order placement scenario
    When User selects "Familybea" product
    And User enters 64 quantity
    And User enters "Muhammed Ensar Guler" customer name
    And User enters "Fevzi Cakmak" street
    And User enters "Usak" city
    And User enters "Bursa" state
    And User enters 64300 zip code
    When User choose "Visa" payment option
    And User enters 1111222233334444 card number
    And User enters "12/30" expiry date
    When User clicks to Process Order
    Then User should see new order in the table with "Muhammed Ensar Guler" on View all orders page

  @orderPlacement
  Scenario Outline: Order placement scenario
    When User selects "<productName>" product
    And User enters "<quantity>" quantity
    And User enters "<name>" customer name
    And User enters "<street>" street
    And User enters "<city>" city
    And User enters "<state>" state
    And User enters "<zipCode>" zip code
    When User choose "<paymentType>" payment option
    And User enters "<cardNumber>" card number
    And User enters "<expiryDate>" expiry date
    When User clicks to Process Order
    Then User should see new order in the table with "<expectedName>" on View all orders page


    Examples:
      | productName | quantity | name             | street         | city       | state | zipCode | paymentType      | cardNumber       | expiryDate | expectedName     |
      | MoneyCog    | 34       | Lucas Torreira   | LucasStreet    | Montevideo | URY   | 1       | Visa             | 1111111111111111 | 07/26      | Lucas Torreira   |
      | Familybea   | 6        | Davinson Sanches | DavinsonStreet | Bogota     | COL   | 2       | MasterCard       | 2222222222222222 | 07/27      | Davinson Sanches |
      | Screenable  | 30       | Dries Mertens    | DriesStreet    | Brussels   | BEL   | 3       | American Express | 3333333333333333 | 07/25      | Dries Mertens    |
    