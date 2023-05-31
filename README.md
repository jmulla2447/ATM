## Introduction
Write test cases for the verification of Automated Teller Machine (ATM) software. In order to ensure that funds are dispersed correctly, and customers are satisfied with the service of the machine, please write a series of JUnit tests using the requirements described below.

## Requirements
The ATM should cover the following specification:

- When the amount requested by the customer is less than zero return “Amount should be greater than zero”.
- The smallest denomination available in the ATM is 10 USD. When the client requests an amount which is not an increment of 10 USD, “Amount should be the multiple of the 10 USD" is displayed.
- When the client request an amount greater than the balance available on the account return “Insufficient funds”
- For the successful withdraw the notification "Success! Amount left: 200 USD" is returned, where the `200` is a account balance after the transaction

## Instructions
- There is a test class that you can extend in the `src/test/java/com/devskiller/tests/AtmServiceTest.java`
- The object under test (`AtmService`) is already instantiated in the `setup()` method
- You can take a look at the ATM service implementation in file `src/main/java/com/devskiller/tests/AtmService.java`