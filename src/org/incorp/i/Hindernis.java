package org.incorp.i;

public interface Hindernis extends Wall, Treadmill{
    @Override
    void speed(int sp);

    @Override
    void Up(int oop);
}
