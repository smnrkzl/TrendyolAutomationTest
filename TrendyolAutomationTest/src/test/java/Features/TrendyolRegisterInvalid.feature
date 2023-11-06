@TrendyolRegisterInvalid
  Feature: Trendyol Register Test Cases(Invalid)

    @Invalid1
    Scenario Outline: Sign Up With An Invalid Mail Adress
      Given User at register page
      When Enter a invalid "<email>" email field
      When Enter a valid "<password>" password field
      When Click on the accept button
      When Click on the checkboxMarketing
      When Click on the checkboxPersonal
      When Click on the captcha
      When Click on the sign up
      Then Check "<error>" message about mail
      Examples:
      |email                    |password    |
      |examplegmail.com        |validpassword123      |

    @Invalid2
    Scenario Outline: Sign Up With An Invalid Password(Less than 7 characters)
      Given User at register page
      When Enter a valid "<email>" email field
      When Enter a invalid "<password>" password field(Less than 7 characters)
      When Click on the accept button
      When Click on the checkboxMarketing
      When Click on the checkboxPersonal
      When Click on the captcha
      When Click on the sign up
      Then Check "<error>" message about password
      Examples:
        |email                    |password    |
        |example2@gmail.com        |123456      |

      @Invalid3
      Scenario Outline: Register Again With The Registered Mail
        Given User at register page
        When Enter a valid "<email>" email field(Enter the registered mail)
        When Enter a valid "<password>" password field
        When Click on the accept button
        When Click on the checkboxMarketing
        When Click on the checkboxPersonal
        When Click on the captcha
        When Click on the sign up
        Then Check "<error>" message about mail
        Examples:
          |email                    |password    |
          |example@gmail.com        |123456      |


      @Invalid4
      Scenario Outline: Register Without Checking The Checkboxes
        Given User at register page
        When Enter a valid "<email>" email field
        When Enter a valid "<password>" password field
        When Click on the accept button
        When Click on the captcha
        When Click on the sign up
        Examples:
          |email                    |password    |
          |example@gmail.com        |123456      |

      @Invalid5
      Scenario Outline: Not Marking The Captcha
        Given User at register page
        When Enter a valid "<email>" email field
        When Enter a valid "<password>" password field
        When Click on the accept button
        When Click on the checkboxMarketing
        When Click on the checkboxPersonal
        When Click on the sign up
        Then Check "<error>" message about captcha

        Examples:
          |email                    |password    |
          |example@gmail.com        |validpassword123      |


    @Invalid6
    Scenario Outline: Sign Up With An Invalid Password(More than 64 characters)
      Given User at register page
      When Enter a valid "<email>" email field
      When Enter a invalid "<password>" password field(More than 64 characters)
      When Click on the accept button
      When Click on the checkboxMarketing
      When Click on the checkboxPersonal
      When Click on the captcha
      When Click on the sign up
      Then Check "<error>" message about password
      Examples:
        |email                    |password    |
        |example@gmail.com        |123456      |



    @Invalid7
    Scenario Outline: Sign Up With An Invalid Password(There are no numbers)
      Given User at register page
      When Enter a valid "<email>" email field
      When Enter a invalid "<password>" password field(There are no numbers)
      When Click on the accept button
      When Click on the checkboxMarketing
      When Click on the checkboxPersonal
      When Click on the captcha
      When Click on the sign up
      Then Check "<error>" message about password
      Examples:
        |email                    |password    |
        |example@gmail.com        |123456      |


    @Invalid8
    Scenario Outline: Sign Up With An Invalid Password(There are no letters)
      Given User at register page
      When Enter a valid "<email>" email field
      When Enter a invalid "<password>" password field(There are no letters)
      When Click on the accept button
      When Click on the checkboxMarketing
      When Click on the checkboxPersonal
      When Click on the captcha
      When Click on the sign up
      Then Check "<error>" message about password
      Examples:
        |email                    |password    |
        |example@gmail.com        |123456      |


    @Invalid9
    Scenario Outline: Registering With An Empty Mail
      Given User at register page
      When Enter a invalid "<password>" password field(There are no letters)
      When Click on the accept button
      When Click on the checkboxMarketing
      When Click on the checkboxPersonal
      When Click on the captcha
      When Click on the sign up
      Then Check "<error>" message about mail
      Examples:
        |email                    |password    |
        |example@gmail.com        |123456      |


    @Invalid10
    Scenario Outline: Registering With An Empty Password
      Given User at register page
      When Enter a valid "<email>" email field
      When Click on the accept button
      When Click on the checkboxMarketing
      When Click on the checkboxPersonal
      When Click on the captcha
      When Click on the sign up
      Then Check "<error>" message about password
      Examples:
        |email                    |password    |
        |example@gmail.com        |123456      |


    @Invalid11
    Scenario Outline: Registering With An Empty Mail And Empty Password
      Given User at register page
      When Click on the accept button
      When Click on the checkboxMarketing
      When Click on the checkboxPersonal
      When Click on the captcha
      When Click on the sign up
      Then Check "<error>" message about password
      Examples:
        |email                    |password    |
        |example@gmail.com        |123456      |





