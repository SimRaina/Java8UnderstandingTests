package org.mytest;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String args[]){

        Consumer<String> textConsumer = i-> System.out.println(i + " "+ i.length());
        textConsumer.accept("SimRainaQA");

        List<String> names = Arrays.asList("Tom","John","Test","Ron","Jim");
        names.forEach(textConsumer);
    }
}
