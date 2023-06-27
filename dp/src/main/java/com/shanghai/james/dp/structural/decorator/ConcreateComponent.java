package com.shanghai.james.dp.structural.decorator;

public class ConcreateComponent extends Component {

    @Override
    public void operation() {
        super.operation();
        System.out.println("ConcreateComponent operation");
    }
}
