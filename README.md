Assignment: Code an ATM
You are to create a new folder and Git repository for an ATM. Then code an ATM with following design and functionality using Git commits for each working function. This should be programmed in Java using Visual Studio Code. You are allowed to Google for help with individual behavior such as 'how to throw an exception java' or 'how to write a string to file java'. Please do not copy code from classmates, or use AI, although feel free to ask each other for help with any navigation of GitKraken or Git or Operating System questions.

Design:
The ATM should handle the following behaviors of an ATM:

Open an account
Creates a unique account ID for the email provided
Close an account
Deposit money into an account
Withdraw money from an account
Check balance of an account
Transfer money from one account to another
Print accounts to a file

Technical Specification:
The code must behave in the following way to solve the design criteria:

Variables
Map of Accounts: String to double
A method 'openAccount'
Input:
String: userId - of an email of the new user ID
double: amount - initial deposit amount
Behavior:
If the user does not exist
Create a new account for the user
Store their deposit amount
If the user does exist, throws an error stating that the user already exists
A method 'closeAccount'
Input:
String: userId - of the account email / ID
Behavior:
If there is no balance
Closes the account, deleting the account entry
If there is a balance, throws an error mentioning the need to withdraw $$$ before closing
A method 'checkBalance'
Input:
String: userId - of the account email / ID
Output:
the exact account value
throws exception if no account is found
A method called 'depositMoney'
Input:
String: userId - of an email of the new user ID
double: amount - deposit amount
Output:
double of the deposited amount or throws exception
Behavior:
if account exists, increase the amount of the users account value
if not, throws exception mentioning they're broke AF
A method 'withdrawMoney'
Input:
String: userId - of an email of the new user ID
double: amount - withdrawal amount
Output:
double: of the returned amount or throws exception
Behavior:
checks for withdrawal amount within the account
if amount exists, reduce the withdrawn amount and return that value
if not, throws exception mentioning they're broke AF
A method 'transferMoney'
Input:
String: fromAccount - user email / ID where the transfer is coming from
String: toAccount - of the email to transfer is going to
double: amount - transfer amount
Output:  
boolean: success - whether the transfer was successful or not
Behavior:
withdraws money from the 'from' account
deposits money to the 'to' account
A method 'audit'
Behavior:
if the file already exists, deletes the current file and writes a new one
writes to a file named 'AccountAudit.txt'
writes out each account email and account value on subsequent new lines
closes the file after writing

Submission:
You will submit a link to your code on github.com (also know a a link to your public code repository) : (I.e. https://github.com/Harvard-Westlake/AuctionDesign/commits/mainLinks to an external site.)

\*\* Recall this is NOT a link to just your account (https://github.com/Harvard-Westlake/Links to an external site.)

\*\* Also please open your submission link in an incognito browser to check it's not set to private!

Grading:

S : All tests pass and you have written your own tests to prove audit works correctly

A : All tests pass (using ATMTester.java) and each function has its own commit

B : Stretch tests don't pass, only 3 meaningful commits (commits with a feature added)

C : Basic tests don't pass, only 2 meaningful commits

WTF - Does not compile

Penalties:

      -10% - If your entire submission is in a single commit

      -10% - If your GitHub link is set to private at the time of grading
