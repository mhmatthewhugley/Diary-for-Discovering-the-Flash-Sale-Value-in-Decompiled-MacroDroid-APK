package com.google.type;

import com.google.protobuf.Internal;

public enum DayOfWeek implements Internal.EnumLite {
    DAY_OF_WEEK_UNSPECIFIED(0),
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7),
    UNRECOGNIZED(-1);
    

    /* renamed from: A */
    private static final Internal.EnumLiteMap<DayOfWeek> f57269A = null;
    private final int value;

    private static final class DayOfWeekVerifier implements Internal.EnumVerifier {

        /* renamed from: a */
        static final Internal.EnumVerifier f57280a = null;

        static {
            f57280a = new DayOfWeekVerifier();
        }

        private DayOfWeekVerifier() {
        }

        /* renamed from: a */
        public boolean mo60055a(int i) {
            return DayOfWeek.m81664b(i) != null;
        }
    }

    static {
        f57269A = new Internal.EnumLiteMap<DayOfWeek>() {
            /* renamed from: b */
            public DayOfWeek mo60053a(int i) {
                return DayOfWeek.m81664b(i);
            }
        };
    }

    private DayOfWeek(int i) {
        this.value = i;
    }

    /* renamed from: b */
    public static DayOfWeek m81664b(int i) {
        switch (i) {
            case 0:
                return DAY_OF_WEEK_UNSPECIFIED;
            case 1:
                return MONDAY;
            case 2:
                return TUESDAY;
            case 3:
                return WEDNESDAY;
            case 4:
                return THURSDAY;
            case 5:
                return FRIDAY;
            case 6:
                return SATURDAY;
            case 7:
                return SUNDAY;
            default:
                return null;
        }
    }

    /* renamed from: c */
    public final int mo60052c() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
