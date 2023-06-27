package com.shanghai.james.dp.behaviro.intepreter;

public class Client {
    public static void main(String[] args) {

        Expression apple = new TerminalExpression("apple");
        Expression banana = new TerminalExpression("banana");
        Expression appleAndBanana = new AndExpression(apple, banana);
        Expression appleOrBanana = new OrExpression(apple, banana);

        System.out.println("Apple and Banana? " + appleAndBanana.interpret("apple"));
        System.out.println("Apple or Banana? " + appleOrBanana.interpret("banana"));


    }
}
