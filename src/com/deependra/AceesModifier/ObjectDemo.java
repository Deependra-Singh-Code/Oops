package com.deependra.access;

public class ObjectDemo {

    int num;

    public ObjectDemo(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return num;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public ObjectDemo() {
        super();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();


    }

    public static void main(String[] args) {

        ObjectDemo obj= new ObjectDemo(34);

        System.out.println(obj.hashCode());

    }
}
