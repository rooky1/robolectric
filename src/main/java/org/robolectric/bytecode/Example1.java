package org.robolectric.bytecode;

public class Example1 {
    private Object __robo_data__;

    public String someMethod(String arg1, int arg2) throws Exception {
        if ((__robo_data__ instanceof Example1) || RobolectricInternals.shouldCallDirectly(this)) {
            return ((Example1) __robo_data__).$$robo$$Example$2345$someMethod(arg1, arg2);
        } else {
            try {
                return (String) RobolectricInternals.methodInvoked(Example1.class, "<methodName>", this,
                        new String[]{"java.lang.String", "int"},
                        new Object[]{arg1, arg2});
            } catch (Throwable throwable) {
                throw new RuntimeException(throwable);
            }
        }
    }

    public void println() {
        System.out.println(RobolectricInternals.class);
    }

    private String $$robo$$Example$2345$someMethod(String arg1, int arg2) {
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

class Example7 extends Example1 {
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}