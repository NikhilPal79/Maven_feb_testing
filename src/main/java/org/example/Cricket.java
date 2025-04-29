package org.example;

public class Cricket implements ICalculator{

    @Override
    public void calculator() {

    }

    @Override
    public void play() {
        ICalculator.super.play();
    }

    @Override
    public void work() {
        ICalculator.super.work();
    }
}
