class DebuggingExercise4
{
    public static void main(String[] args)
    {
        Account a = new Account("Shirlyn Shih");
        a.deposit(100);
        System.out.println(a.getOwner() + " has $" + a.getBalance());
        a.withdraw(200);
        System.out.println("After trying to withdraw $200, " + a.getOwner() + " has $" + a.getBalance());
    }
}
/*
* Where is the variable watch window on your screen?
*   It is at the bottom of the screen when in debug mode.
* What information does this present to you?
*   It shows what values the variables have at a certain moment when running the code
* Where is the method call stack on your screen?
*   It is in the bottom left window.
* What information does this describe?
*   It describes what methods have been called.
*
* Step over: F8 on the keyboard
* What does this do? It goes to the next line of code without going into the methods
*
* Step into: F7
* What does this do? It goes to the next line of code as well, but it goes into the
* methods unlike step over
*
* Step out: Shift + F8
* What does this do? it comes out of the method it currently is in and continues
* at the point after the method has run.
*
* Continue: F9
* What does this do? It continues until the program ends, or it hits an error
* It's different from stepping because it just keeps running
*
*
*
*
*
* */