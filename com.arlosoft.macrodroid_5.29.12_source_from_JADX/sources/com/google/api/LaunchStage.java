package com.google.api;

import com.google.protobuf.Internal;

public enum LaunchStage implements Internal.EnumLite {
    LAUNCH_STAGE_UNSPECIFIED(0),
    EARLY_ACCESS(1),
    ALPHA(2),
    BETA(3),
    GA(4),
    DEPRECATED(5),
    UNRECOGNIZED(-1);
    

    /* renamed from: s */
    private static final Internal.EnumLiteMap<LaunchStage> f52087s = null;
    private final int value;

    private static final class LaunchStageVerifier implements Internal.EnumVerifier {

        /* renamed from: a */
        static final Internal.EnumVerifier f52089a = null;

        static {
            f52089a = new LaunchStageVerifier();
        }

        private LaunchStageVerifier() {
        }

        /* renamed from: a */
        public boolean mo60055a(int i) {
            return LaunchStage.m71385b(i) != null;
        }
    }

    static {
        f52087s = new Internal.EnumLiteMap<LaunchStage>() {
            /* renamed from: b */
            public LaunchStage mo60053a(int i) {
                return LaunchStage.m71385b(i);
            }
        };
    }

    private LaunchStage(int i) {
        this.value = i;
    }

    /* renamed from: b */
    public static LaunchStage m71385b(int i) {
        if (i == 0) {
            return LAUNCH_STAGE_UNSPECIFIED;
        }
        if (i == 1) {
            return EARLY_ACCESS;
        }
        if (i == 2) {
            return ALPHA;
        }
        if (i == 3) {
            return BETA;
        }
        if (i == 4) {
            return GA;
        }
        if (i != 5) {
            return null;
        }
        return DEPRECATED;
    }

    /* renamed from: c */
    public final int mo60052c() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
