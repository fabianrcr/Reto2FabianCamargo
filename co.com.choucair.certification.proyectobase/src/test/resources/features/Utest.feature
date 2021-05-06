# Autor: Fabian Camargo
@stories
Feature: Utest website join new user
  As a User, I want to register a new user at the Utest platform to increase the testers available in the world
  @scenario1
  Scenario: Join a new user or tester in the platform
    Given than fabian wants to join at the Utest platform
    When he fill the form telling about yourself on the Utest platform
    | firstName | lastName | email | birth |
    | Fabian | Camargo | prueba12345@gmail.com  | March,12,1991 |
    And after fill the address form
      | city  | zip | country |
      | Bogotá | 123456  | Colombia |
    And write a password with a lowercase, an uppercase and a number
      | password | confirmpassword |
      | Pruebas.132 | Pruebas.132 |

    Then he should to read the welcome to the community
    | message |
    | ¡Bienvenido a la comunidad de probadores de software autónomos más grande del mundo! |