package com.okaberintarou.toyjvm.classpath;

public interface Entry {
    byte[] readClass(String className);
}