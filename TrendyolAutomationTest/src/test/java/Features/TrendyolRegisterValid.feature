@TrendyolRegisterValid
Feature: Trendyol Register Test Cases

  @Valid2
  Scenario Outline: Register Using Valid Credentials(Gender is female)
    Given User at register page
    When Enter a valid "<email>" email field
    When Enter a valid "<password>" password field
    When Click on the accept button
    When Click on the female gender
    When Click on the checkboxMarketing
    When Click on the checkboxPersonal
    When Click on the captcha
    Then Click on the sign up
    Examples:
      |email                    |password    |
      |hiyot86187@lukaat.com        |valid1deneme      |

  @Valid2
  Scenario Outline: Register Using Valid Credentials(Gender is male)
    Given User at register page
    When Enter a valid "<email>" email field
    When Enter a valid "<password>" password field
    When Click on the accept button
    When Click on the male gender
    When Click on the checkboxMarketing
    When Click on the checkboxPersonal
    When Click on the captcha
    Then Click on the sign up
    Examples:
      |email                    |password    |
      |hiyot86187@lukaat.com        |123456      |

  @Valid3
  Scenario Outline: Register Using Valid Credentials(Gender is not selected)
    Given User at register page
    When Enter a valid "<email>" email field
    When Enter a valid "<password>" password field
    When Click on the accept button
    When Click on the checkboxMarketing
    When Click on the checkboxPersonal
    When Click on the captcha
    Then Click on the sign up
    Examples:
      |email                    |password    |
      |example@gmail.com        |123456      |


  @Valid4
  Scenario: Register With Google
    Given User at register page
    When Click on the accept button
    When Click on the sign up with google button
    Then Select an email address


  @Valid5
  Scenario Outline: Register With Facebook
    Given User at register page
    When Click on the accept button
    When Click on the sign up with facebook button
    When Enter a valid "<email>" facebook email field
    When Enter a valid "<password>" facebook password field
    Then Click on the sign up facebook
    Examples:
      |email                    |password    |
      |example@gmail.com        |123456      |



  @Valid6
  Scenario Outline: Register Without Checking The Marketing Checkbox
    Given User at register page
    When Enter a valid "<email>" email field
    When Enter a valid "<password>" password field
    When Click on the accept button
    When Click on the checkboxPersonal
    When Click on the captcha
    Then Click on the sign up
    Examples:
      |email                    |password    |
      |example@gmail.com        |123456      |





