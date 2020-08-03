#Bank ATM App

This program was created to demonstrate multi-threading. 
To visualize concurrency, I created 2 threads named Leo and Tameka,
and print each task in the terminal. The AccountHolder Class implements the Runnable Interface. 
The AccountHolder Class' implementation of the run method will iterate 5 times.
Each iteration will perform the private class methods makeWithdrawl and makeDeposit. 
I added conditional statements to check the balance before making a withdrawl. When the account balance is below 0, 
the program will not allow a thread to make a withdrawl and instead print a message stating the account has been overdrawn. 