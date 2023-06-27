package com.shanghai.james.dp.structural.facade;


public class FacadeService {

    ServiceModuleA serviceModuleA = new ServiceModuleA();
    ServiceModuleB serviceModuleB = new ServiceModuleB();
    ServiceModuleC serviceModuleC = new ServiceModuleC();


    public void serviceA() {
        serviceModuleA.serviceA();
    }

    public void serviceB() {
        serviceModuleB.serviceB();
    }

    public void serviceC() {
        serviceModuleC.serviceC();
    }
}
