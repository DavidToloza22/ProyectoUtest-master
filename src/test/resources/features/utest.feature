#Autor: David Toloza
@stories
Feature: uTest
  As an user, I want to sing up to uTest

  @scenario1
  Scenario Outline: Sing up to www.utest.com
    Given that David wants to sign up to uTest
    When he clicks on the Join Today button
    And he introduces his personal data
      | strFirstName   | strLastName   | strEmailAddress   | strBirthMonth   | strBirthDay   | strBirthYear   | strUserLanguage   | strCity   | strZipPostalCode   | strCountry   | strComputerOs   | strOsVersion   | strComputerLanguage   | strMobileDevice   | strModel   | strMobileOs   | strPassword   |
      | <strFirstName> | <strLastName> | <strEmailAddress> | <strBirthMonth> | <strBirthDay> | <strBirthYear> | <strUserLanguage> | <strCity> | <strZipPostalCode> | <strCountry> | <strComputerOs> | <strOsVersion> | <strComputerLanguage> | <strMobileDevice> | <strModel> | <strMobileOs> | <strPassword> |
    Then the register is complete
      | strSuccessSignUpMessage                                                 |
      | Welcome to the world's largest community of freelance software testers! |
    Examples:
      | strFirstName | strLastName | strEmailAddress            | strBirthMonth | strBirthDay | strBirthYear | strUserLanguage | strCity         |  strZipPostalCode | strCountry | strComputerOs | strOsVersion | strComputerLanguage | strMobileDevice | strModel        | strMobileOs | strPassword   |
      | David        | Toloza      | davidtolozag22@gmail.com   | November      | 22          | 1996         | Spanish         | Villavicencio   |  501021           | Colombia   | Windows       | 10           | Spanish             | Samsung         | Galaxy M31      | Android 11  | Holamundo9878@|
