/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author L117student
 */
public class IllegalNameFormatException extends IllegalArgumentException {
    private static String errMsg = "You did not provide a legal format for the Name";

    public IllegalNameFormatException() {
        super(errMsg);
    }

    public IllegalNameFormatException(String string) {
        super(errMsg);
    }

    public IllegalNameFormatException(String string, Throwable cause) {
        super(errMsg, cause);
    }

    public IllegalNameFormatException(Throwable cause) {
        super(errMsg, cause);
    }
    
    
}
