package com.google.logging.type;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.protobuf.Internal;

public enum LogSeverity implements Internal.EnumLite {
    DEFAULT(0),
    DEBUG(100),
    INFO(200),
    NOTICE(300),
    WARNING(400),
    ERROR(500),
    CRITICAL(600),
    ALERT(TypedValues.Transition.TYPE_DURATION),
    EMERGENCY(800),
    UNRECOGNIZED(-1);
    

    /* renamed from: B */
    private static final Internal.EnumLiteMap<LogSeverity> f56212B = null;
    private final int value;

    private static final class LogSeverityVerifier implements Internal.EnumVerifier {

        /* renamed from: a */
        static final Internal.EnumVerifier f56223a = null;

        static {
            f56223a = new LogSeverityVerifier();
        }

        private LogSeverityVerifier() {
        }

        /* renamed from: a */
        public boolean mo60055a(int i) {
            return LogSeverity.m78954b(i) != null;
        }
    }

    static {
        f56212B = new Internal.EnumLiteMap<LogSeverity>() {
            /* renamed from: b */
            public LogSeverity mo60053a(int i) {
                return LogSeverity.m78954b(i);
            }
        };
    }

    private LogSeverity(int i) {
        this.value = i;
    }

    /* renamed from: b */
    public static LogSeverity m78954b(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 100) {
            return DEBUG;
        }
        if (i == 200) {
            return INFO;
        }
        if (i == 300) {
            return NOTICE;
        }
        if (i == 400) {
            return WARNING;
        }
        if (i == 500) {
            return ERROR;
        }
        if (i == 600) {
            return CRITICAL;
        }
        if (i == 700) {
            return ALERT;
        }
        if (i != 800) {
            return null;
        }
        return EMERGENCY;
    }

    /* renamed from: c */
    public final int mo60052c() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
