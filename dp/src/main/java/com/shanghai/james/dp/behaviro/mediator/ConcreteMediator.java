package com.shanghai.james.dp.behaviro.mediator;

import java.util.*;

public class ConcreteMediator implements Mediator {
    private List<Colleague> colleagueList = new ArrayList<>();

    Map<Colleague, Boolean> statusMap = new HashMap<>();

    @Override
    public void workAll() {
        colleagueList.forEach(Colleague::work);
        if (statusMap.values().stream().reduce((b1, b2) -> b1 && b2).orElse(false)) {
            System.out.println("All colleagues work done");
        } else {
            System.out.println("Some colleagues work not done");
            colleagueList.forEach(Colleague::rollback);
        }

    }

    @Override
    public void createMediator(Colleague... colleagues) {
        final List<Colleague> colleagueList = Arrays.asList(colleagues);
        colleagueList.forEach(c -> c.setMediator(this));
        this.colleagueList = colleagueList;
    }


    @Override
    public void finish(Colleague colleague, Boolean status) {
        statusMap.put(colleague, status);
    }
}
