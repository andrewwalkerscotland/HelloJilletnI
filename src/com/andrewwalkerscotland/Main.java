package com.andrewwalkerscotland;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hello ");
        System.out.println(StringUtils.reverse(args[0]));
    }
}
