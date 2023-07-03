package com.shanghai.james.dp.behaviro.strategy;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private Map<String, Strategy> strategyMap = new HashMap<>();

    public Context() {
        strategyMap.put(ConcreteStrategyA.class.getName(), new ConcreteStrategyA());
        strategyMap.put(ConcreteStrategyB.class.getName(), new ConcreteStrategyB());
        strategyMap.put(ConcreteStrategyC.class.getName(), new ConcreteStrategyC());
    }

    void algorithm(String input) {
        if ("A".equals(input)) {
            strategyMap.get(ConcreteStrategyA.class.getName()).algorithm();
        } else if ("B".equals(input)) {
            strategyMap.get(ConcreteStrategyB.class.getName()).algorithm();
        } else {
            strategyMap.get(ConcreteStrategyC.class.getName()).algorithm();
        }
    }
}
