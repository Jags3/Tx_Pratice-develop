@Android @AGLogin
Feature: Login functionality

  Background:
    Given User launches the application
    When User taps on Sign In button in splash screen
    Then Verify user lands on the login Page

  @Test-907
  Scenario: User login into the application with correct credentials
    When User enters the Email and Password
    And User taps on Sign In button
    And 2FA code is sent the to registered mobile
    Then Verify user is redirected to Enter your code page
    When User enters two-factor Authentication code 2FA Code
    And User taps on the Continue button
    Then Verify user is Logged in and redirected to the Homepage

  @TC_36
  Scenario: Verify that user is unable to login to the app with invalid credentials
    When User enters the Email and Incorrect_Password
    And User taps on Sign In button
    Then Verify user is able to see Invalid Credential message

  @Test-909
  Scenario:  Verify Remember me option functionality on Login Page
    When User enter the Email and Password
    And User taps on Remember Me button
    And User taps on Sign In button
    And 2FA code is sent the to registered mobile
    Then Verify user is redirected to Enter your code page
    When User enters two-factor Authentication code
    And User taps on the Continue button
    Then Verify user is Logged in and redirected to the Homepage
    When User taps on the More button in the bottom nav
    And User taps on Logout Option
    Then Verify Email is already populated

  @Test-1001
    #TODO

#    Scenario: Verify that user is able to toggle biometric/face Id on/off and able to view and hide the password
#       Given User launches the application
#      When User taps on Sign In Button in
#      Then Verify user lands on the login Page
#      When User enters the Email
#      And User enters Password
#      Then tap on the eye button beside Password field to view entered password
#      And tap again on the eye button to hide the password
#      When user taps on biometric check box to enable it
#      And then tap on Sign In button
#      Then user is asked to provide the biometric/face ID button

  @Test-1002
  Scenario: Verify that the user is able to Reset password via Forgot Password flow when account is in locked state after 3 invalid login attempts
    When User enters the Email
    And User enters incorrect Password for the first time
    And User taps on Sign In button
    Then Verify user is able to see Invalid Credential message
    When User enters incorrect Password for the second time
    And User taps on Sign In button
    Then Verify user is able to see Invalid Credential message
    When User enters incorrect Password for the third time
    And User taps on Sign In button
    Then Verify user is able to see Account lock message
    When Tap on Forgot password
    Then Enter the email address
    And Enter the verification code
    Then answer the security question
    And Enter the new password and confirm password fields
    Then Click on Save New Password

  @Test-910
  Scenario: Verify that account is password locked upon 3 wrong attempts of password
    When User enters the Email
    And User enters incorrect Password for the first time
    And User taps on Sign In button
    Then Verify user is able to see Invalid Credential message
    When User enters incorrect Password for the second time
    And User taps on Sign In button
    Then Verify user is able to see Invalid Credential message
    When User enters incorrect Password for the third time
    And User taps on Sign In button
    Then Verify user is able to see Account lock message