package com.google.firebase.messaging;

import android.os.Bundle;
import androidx.collection.ArrayMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.concurrent.TimeUnit;

public final class Constants {

    /* renamed from: a */
    public static final long f54960a = TimeUnit.MINUTES.toMillis(3);

    public static final class AnalyticsKeys {
        private AnalyticsKeys() {
        }
    }

    public static final class FirelogAnalytics {
        private FirelogAnalytics() {
        }
    }

    public static final class MessageNotificationKeys {
        private MessageNotificationKeys() {
        }
    }

    public static final class MessagePayloadKeys {
        private MessagePayloadKeys() {
        }

        /* renamed from: a */
        public static ArrayMap<String, String> m76808a(Bundle bundle) {
            ArrayMap<String, String> arrayMap = new ArrayMap<>();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals(TypedValues.Transition.S_FROM) && !str.equals("message_type") && !str.equals("collapse_key")) {
                        arrayMap.put(str, str2);
                    }
                }
            }
            return arrayMap;
        }
    }

    public static final class MessageTypes {
        private MessageTypes() {
        }
    }

    public static final class ScionAnalytics {

        public @interface MessageType {
        }

        private ScionAnalytics() {
        }
    }

    private Constants() {
    }
}
