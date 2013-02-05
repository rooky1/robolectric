package org.robolectric.shadows;

import org.robolectric.Robolectric;
import org.robolectric.internal.Implementation;
import org.robolectric.internal.Implements;

@Implements(Robolectric.Anything.class)
public class ShadowSystemProperties {
    @Implementation
    public static String get(String key) {
        return null;
    }

    @Implementation
    public static String get(String key, String def) {
        return def;
    }

    @Implementation
    public static int getInt(String key, int def) {
        return def;
    }

    @Implementation
    public static long getLong(String key, long def) {
        return def;
    }

    @Implementation
    public static boolean getBoolean(String key, boolean def) {
        return def;
    }

}
