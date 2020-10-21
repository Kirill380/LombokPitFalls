package org.examples;

import lombok.experimental.UtilityClass;

@UtilityClass
public class BarClass {

    public void bar() {
        System.out.println("bar called");
    }


    public void foo() {
        System.out.println("foo called");
    }
}
