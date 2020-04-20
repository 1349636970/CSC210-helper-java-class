package app;

public class test {
    public static void main(String[] args) {
        Helper myHelper = new Helper();
        // Ask user for input int
        // If you want the user enter the number only greater than 0
        System.out.print("Ask user for input int: ");
        int inputInt = myHelper.inputInt("errorMessage", 0);
        System.out.println(inputInt);
        /**
         * Output: Ask user for input int: a 
         * errorMessage 
         * -1 
         * Plz enter the number
         * greater than 0 
         * 1 
         * 1
         */


         //If you want the user enter the number between 1 and 10
        System.out.print("Ask user for input int: ");
        int inputIntRange = myHelper.inputInt("errorMessage", 1,10);
        System.out.println(inputIntRange);
        /* 
        Output: Ask user for input int: a
        errorMessage
        -1
        Plz enter the number between 1 and 10                                                                                                                                                 a
        11                                                                                                                                                                                    \
        Plz enter the number between 1 and 10
        10
        10 
        */


        //Same usage for ask user double.

        //If you want to get the index of an array
        String[] myArray = {"a","b","c","d"};
        int index = myHelper.getArrayIndex(myArray, "b", 0);
        System.out.println(index);
        //Output:1
        int notExistIndex = myHelper.getArrayIndex(myArray, "3", 0);
        System.out.println(notExistIndex);
        //Output:-1
    }
}
