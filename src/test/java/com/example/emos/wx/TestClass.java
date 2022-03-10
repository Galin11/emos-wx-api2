package com.example.emos.wx;

import org.junit.jupiter.api.Test;

import java.util.concurrent.locks.LockSupport;

/**
 *
 * @description:
 * @author: wanghefei$
 * @date: 2022-03-09 14:13
 * @version: 1.0
 */

public class TestClass {

    static Thread t1 = null,t2 = null;

    public static void main(String[] args) {
        char[] a1 = "12345678".toCharArray();
        char[] a2 = "ABCDEFGH".toCharArray();

        t1 = new Thread(() -> {
            for (char c : a1) {
                System.out.println(c);
                LockSupport.unpark(t2);
                LockSupport.park();
            }
        },"t1");

        t2 = new Thread(() -> {
            for (char c : a2) {
                LockSupport.park();
                System.out.println(c);
                LockSupport.unpark(t1);
            }
        },"t2");

        t1.start();
        t2.start();
    }
}
