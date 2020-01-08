package com.demo;

import java.util.Random;

import com.demo.context.Context;
import com.demo.state.EP821State;

/**
 * 客户端应用
 *
 * @author
 */
public class Client {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Context context = new Context();
        context.changeState(new EP821State());
        context.doWork();
    }
}