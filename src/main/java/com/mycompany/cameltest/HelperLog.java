/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cameltest;

/**
 *
 * @author bruno
 */
public class HelperLog {

    public HelperLog() {
    }
    public String log(String msg){
        System.out.println("metodoInvocto "+msg);
        return "string convertita";
    }
}
