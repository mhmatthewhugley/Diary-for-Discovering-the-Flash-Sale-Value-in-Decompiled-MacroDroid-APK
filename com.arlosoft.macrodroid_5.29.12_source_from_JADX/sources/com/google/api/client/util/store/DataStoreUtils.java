package com.google.api.client.util.store;

import java.io.IOException;

public final class DataStoreUtils {
    private DataStoreUtils() {
    }

    /* renamed from: a */
    public static String m72766a(DataStore<?> dataStore) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append('{');
            boolean z = true;
            for (String next : dataStore.keySet()) {
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                sb.append(next);
                sb.append('=');
                sb.append(dataStore.get(next));
            }
            sb.append('}');
            return sb.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
