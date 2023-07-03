package com.shanghai.james.dp.behaviro.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
    public List<Element> elements = new ArrayList<>();

    public void addElement(Element element) {
        elements.add(element);
    }

    public void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
