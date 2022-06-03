package com.homeproject.firstproject.javacore.lesson1;

public abstract class Animal {
    protected String name;
    protected int runLimit;
    protected boolean passing;

    public abstract String voice();

    public boolean run(int length) {
        return runLimit >= length;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + name;
    }

    public void setPassing(boolean passing) {
        this.passing = passing;
    }
}
