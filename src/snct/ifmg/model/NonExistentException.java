/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snct.ifmg.model;

/**
 *
 * @author Manoe
 */
public class NonExistentException extends Exception {

    /**
     * Creates a new instance of <code>NonExistentException</code> without
     * detail message.
     */
    public NonExistentException() {
    }

    /**
     * Constructs an instance of <code>NonExistentException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NonExistentException(String msg) {
        super(msg);
    }
}
