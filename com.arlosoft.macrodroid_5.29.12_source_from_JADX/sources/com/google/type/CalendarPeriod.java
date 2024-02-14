package com.google.type;

import com.google.protobuf.Internal;

public enum CalendarPeriod implements Internal.EnumLite {
    CALENDAR_PERIOD_UNSPECIFIED(0),
    DAY(1),
    WEEK(2),
    FORTNIGHT(3),
    MONTH(4),
    QUARTER(5),
    HALF(6),
    YEAR(7),
    UNRECOGNIZED(-1);
    

    /* renamed from: A */
    private static final Internal.EnumLiteMap<CalendarPeriod> f57250A = null;
    private final int value;

    private static final class CalendarPeriodVerifier implements Internal.EnumVerifier {

        /* renamed from: a */
        static final Internal.EnumVerifier f57261a = null;

        static {
            f57261a = new CalendarPeriodVerifier();
        }

        private CalendarPeriodVerifier() {
        }

        /* renamed from: a */
        public boolean mo60055a(int i) {
            return CalendarPeriod.m81653b(i) != null;
        }
    }

    static {
        f57250A = new Internal.EnumLiteMap<CalendarPeriod>() {
            /* renamed from: b */
            public CalendarPeriod mo60053a(int i) {
                return CalendarPeriod.m81653b(i);
            }
        };
    }

    private CalendarPeriod(int i) {
        this.value = i;
    }

    /* renamed from: b */
    public static CalendarPeriod m81653b(int i) {
        switch (i) {
            case 0:
                return CALENDAR_PERIOD_UNSPECIFIED;
            case 1:
                return DAY;
            case 2:
                return WEEK;
            case 3:
                return FORTNIGHT;
            case 4:
                return MONTH;
            case 5:
                return QUARTER;
            case 6:
                return HALF;
            case 7:
                return YEAR;
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
