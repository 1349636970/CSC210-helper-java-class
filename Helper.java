

import java.util.Scanner;

/**
 * This helper class provide the Scanner input with validation and get array index.
 * The validation process I will use while try catch
 * The most of the code contain duplicate content, if you see this line, I will very grateful for you can make this class more beautiful
 */

public class Helper {
    private Scanner input = new Scanner(System.in);





    /**
     * This method will ask user for a String and catch all the error message.
     * If there is a error message, the program will print it out your customize error message and ask the user enter again
     * The try catch syntax will run the code that you want to try to test if there is error, if there is, the catch syntax will catch it and handle it.
     * @param errorMessage
     * @return String the User input
     */

    public char inputChar(String errorMessage,char correctChar,char wrongChar) {
        boolean validation = false;
        String userInputString = null;
        char result = '\u0000';
        while (!validation) {
            try {
                userInputString = input.next();
                result = userInputString.length() == 1 ? Character.toUpperCase(userInputString.charAt(0)) : '0';
                if (result == '0' || (result != correctChar && result != wrongChar)) {
                    System.out.println("Plz only enter "+correctChar+" or "+ wrongChar);
                    continue;
                }
                validation = true;
            } catch (Exception e) {
                System.out.println(errorMessage);
                input.next();//Clean the input, or it will goes to infinity loop
            }
        }
        return result;
    }


    public String inputString(String errorMessage) {
        boolean validation = false;
        String result = null;
        while (!validation) {
            try {
                result = input.next();
                validation = true;
            } catch (Exception e) {
                System.out.println(errorMessage);
                input.next();//Clean the input, or it will goes to infinity loop
            }
        }
        return result;
    }

    /**
     * 
     * @param errorMessage
     * @param smallerNumber
     * @param greaterNumber
     * @return
     */
    public int inputInt(String errorMessage,int smallerNumber,int greaterNumber) {
        boolean validation = false;
        int result = 0;
        while (!validation) {
            try {
                result = input.nextInt();
                if (result > greaterNumber || result < smallerNumber) {
                    System.out.println("Plz enter the number between "+smallerNumber+" and "+greaterNumber);
                    continue;
                }
                validation = true;
            } catch (Exception e) {
                System.out.println(errorMessage);
                input.next();
            }
        }
        return result;
    }

    /**
     * 
     * @param errorMessage
     * @param smallerNumber
     * @return
     */
    public int inputInt(String errorMessage,int smallerNumber) {
        boolean validation = false;
        int result = 0;
        while (!validation) {
            try {
                result = input.nextInt();
                if (result < smallerNumber) {
                    System.out.println("Plz enter the number greater than "+smallerNumber);
                    continue;
                }
                validation = true;
            } catch (Exception e) {
                System.out.println(errorMessage);
                input.next();
            }
        }
        return result;
    }

    /**
     * 
     * @param errorMessage
     * @param smallerNumber
     * @param greaterNumber
     * @return
     */
    public double inputDouble(String errorMessage,double smallerNumber,double greaterNumber) {
        boolean validation = false;
        double result = 0.0;
        while (!validation) {
            try {
                result = input.nextDouble();
                if (result > greaterNumber || result < smallerNumber) {
                    System.out.println("Plz enter the number between "+smallerNumber+" and "+greaterNumber);
                    continue;
                }
                validation = true;
            } catch (Exception e) {
                System.out.println(errorMessage);
                input.next();
            }
        }
        return result;
    }

    public double inputDouble(String errorMessage,double smallerNumber) {
        boolean validation = false;
        double result = 0.0;
        while (!validation) {
            try {
                result = input.nextDouble();
                if (result < smallerNumber) {
                    System.out.println("Plz enter the number greater than "+smallerNumber);
                    continue;
                }
                validation = true;
            } catch (Exception e) {
                System.out.println(errorMessage);
                input.next();
            }
        }
        return result;
    }

    /**
     * The alternatives way to do this method is for loop. Such like this
     * for (int i = 0;i < array.length; i++) {
     *  if (array[i] == element) {
     *      break
     *      }
     *  
     * }
     * I think the for loop + if statement is the while loop because while loop has condition and it is a loop. 
     * 
     * @param array
     * @param element
     * @param startIndex
     * @return
     */

    public int getArrayIndex(int[] array, int element,int startIndex) {
        int result; 
        int counter = startIndex;
        while (array[counter] != element) {
            counter++;
            if (counter > array.length-1) {
                break;
            }
        }
        result = counter;
        if (result == array.length) {
            result = -1;
        }
        return result;
    }


    /**
     * I used MMath.abs(array[counter]-element) < 0.001 to compare the double number because sometimes they will not equal even they are actually equal. For example, there is a number 79.800000000001. If you try to compare this number to 79.8 the computer will tell you they are not equal. But they are actually equal. The way that the computer storage decimals number is not 100% accurate. I will do. Math.abs(79.8-79.80000000001) < 0.001 to check if they are equal
     * @param array
     * @param element
     * @param startIndex
     * @return
     */
    public int getArrayIndex(double[] array, double element,int startIndex) {
        int result; 
        int counter = startIndex;
        while (Math.abs(array[counter]-element) < 0.001) {
            counter++;
            if (counter > array.length-1) {
                break;
            }
        }
        result = counter;
        if (result == array.length) {
            result = -1;
        }
        return result;
    }

    public int getArrayIndex(String[] array, String element,int startIndex) {
        int result; 
        int counter = startIndex;
        while (array[counter] != element) {
            counter++;
            if (counter > array.length-1) {
                break;
            }
        }
        result = counter;
        if (result == array.length) {
            result = -1;
        }
        return result;
    }



    public void inputClose() {
        input.close();
    }
}
