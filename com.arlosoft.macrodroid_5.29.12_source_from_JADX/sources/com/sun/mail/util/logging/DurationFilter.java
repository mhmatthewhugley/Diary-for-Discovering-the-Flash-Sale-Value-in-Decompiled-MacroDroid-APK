package com.sun.mail.util.logging;

import androidx.work.PeriodicWorkRequest;
import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class DurationFilter implements Filter {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private long count;
    private final long duration;
    private long peak;
    private final long records;
    private long start;

    static {
        Class<DurationFilter> cls = DurationFilter.class;
    }

    public DurationFilter() {
        this.records = checkRecords(initLong(".records"));
        this.duration = checkDuration(initLong(".duration"));
    }

    private synchronized boolean accept(long j) {
        boolean z;
        long j2 = this.count;
        z = false;
        if (j2 > 0) {
            if (j - this.peak > 0) {
                this.peak = j;
            }
            if (j2 != this.records) {
                this.count = j2 + 1;
            } else {
                long j3 = this.peak;
                long j4 = this.duration;
                if (j3 - this.start >= j4) {
                    this.count = 1;
                    this.start = j3;
                } else {
                    this.count = -1;
                    this.start = j3 + j4;
                }
            }
        } else if (j - this.start >= 0 || j2 == 0) {
            this.count = 1;
            this.start = j;
            this.peak = j;
        }
        z = true;
        return z;
    }

    private static long checkDuration(long j) {
        return j > 0 ? j : PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS;
    }

    private static long checkRecords(long j) {
        if (j > 0) {
            return j;
        }
        return 1000;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long initLong(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.Class r0 = r9.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = r0.concat(r10)
            java.lang.String r0 = com.sun.mail.util.logging.LogManagerProperties.fromLogManager(r0)
            r1 = -9223372036854775808
            if (r0 == 0) goto L_0x0065
            int r3 = r0.length()
            if (r3 == 0) goto L_0x0065
            java.lang.String r0 = r0.trim()
            boolean r10 = r9.isTimeEntry(r10, r0)
            r3 = 0
            if (r10 == 0) goto L_0x002b
            long r5 = com.sun.mail.util.logging.LogManagerProperties.parseDurationToMillis(r0)     // Catch:{ Exception | LinkageError | RuntimeException -> 0x002b }
            goto L_0x002c
        L_0x002b:
            r5 = r3
        L_0x002c:
            int r10 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r10 != 0) goto L_0x0064
            r3 = 1
            java.lang.String[] r10 = tokenizeLongs(r0)     // Catch:{ RuntimeException -> 0x0065 }
            int r0 = r10.length     // Catch:{ RuntimeException -> 0x0065 }
            r5 = 0
            r6 = 0
        L_0x0039:
            if (r6 >= r0) goto L_0x0062
            r7 = r10[r6]     // Catch:{ RuntimeException -> 0x0065 }
            java.lang.String r8 = "L"
            boolean r8 = r7.endsWith(r8)     // Catch:{ RuntimeException -> 0x0065 }
            if (r8 != 0) goto L_0x004d
            java.lang.String r8 = "l"
            boolean r8 = r7.endsWith(r8)     // Catch:{ RuntimeException -> 0x0065 }
            if (r8 == 0) goto L_0x0057
        L_0x004d:
            int r8 = r7.length()     // Catch:{ RuntimeException -> 0x0065 }
            int r8 = r8 + -1
            java.lang.String r7 = r7.substring(r5, r8)     // Catch:{ RuntimeException -> 0x0065 }
        L_0x0057:
            long r7 = java.lang.Long.parseLong(r7)     // Catch:{ RuntimeException -> 0x0065 }
            long r3 = multiplyExact(r3, r7)     // Catch:{ RuntimeException -> 0x0065 }
            int r6 = r6 + 1
            goto L_0x0039
        L_0x0062:
            r1 = r3
            goto L_0x0065
        L_0x0064:
            r1 = r5
        L_0x0065:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.util.logging.DurationFilter.initLong(java.lang.String):long");
    }

    private boolean isTimeEntry(String str, String str2) {
        if ((str2.charAt(0) == 'P' || str2.charAt(0) == 'p') && str.equals(".duration")) {
            return true;
        }
        return false;
    }

    private static long multiplyExact(long j, long j2) {
        long j3 = j * j2;
        if (((Math.abs(j) | Math.abs(j2)) >>> 31) == 0 || ((j2 == 0 || j3 / j2 == j) && (j != Long.MIN_VALUE || j2 != -1))) {
            return j3;
        }
        throw new ArithmeticException();
    }

    private boolean test(long j, long j2) {
        long j3;
        long j4;
        synchronized (this) {
            j3 = this.count;
            j4 = this.start;
        }
        int i = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
        if (i > 0) {
            if (j2 - j4 >= this.duration || j3 < j) {
                return true;
            }
            return false;
        } else if (j2 - j4 >= 0 || i == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static String[] tokenizeLongs(String str) {
        int indexOf = str.indexOf(42);
        if (indexOf > -1) {
            String[] split = str.split("\\s*\\*\\s*");
            if (split.length != 0) {
                if (indexOf == 0 || str.charAt(str.length() - 1) == '*') {
                    throw new NumberFormatException(str);
                } else if (split.length != 1) {
                    return split;
                } else {
                    throw new NumberFormatException(split[0]);
                }
            }
        }
        return new String[]{str};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0045, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 1
            if (r11 != r12) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
            if (r12 == 0) goto L_0x004c
            java.lang.Class r2 = r11.getClass()
            java.lang.Class r3 = r12.getClass()
            if (r2 == r3) goto L_0x0012
            goto L_0x004c
        L_0x0012:
            com.sun.mail.util.logging.DurationFilter r12 = (com.sun.mail.util.logging.DurationFilter) r12
            long r2 = r11.records
            long r4 = r12.records
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x001d
            return r1
        L_0x001d:
            long r2 = r11.duration
            long r4 = r12.duration
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0026
            return r1
        L_0x0026:
            monitor-enter(r11)
            long r2 = r11.count     // Catch:{ all -> 0x0049 }
            long r4 = r11.peak     // Catch:{ all -> 0x0049 }
            long r6 = r11.start     // Catch:{ all -> 0x0049 }
            monitor-exit(r11)     // Catch:{ all -> 0x0049 }
            monitor-enter(r12)
            long r8 = r12.count     // Catch:{ all -> 0x0046 }
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x0044
            long r2 = r12.peak     // Catch:{ all -> 0x0046 }
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x0044
            long r2 = r12.start     // Catch:{ all -> 0x0046 }
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            monitor-exit(r12)     // Catch:{ all -> 0x0046 }
            return r0
        L_0x0044:
            monitor-exit(r12)     // Catch:{ all -> 0x0046 }
            return r1
        L_0x0046:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0046 }
            throw r0
        L_0x0049:
            r12 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0049 }
            throw r12
        L_0x004c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.mail.util.logging.DurationFilter.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        long j = this.records;
        long j2 = this.duration;
        return ((267 + ((int) (j ^ (j >>> 32)))) * 89) + ((int) ((j2 >>> 32) ^ j2));
    }

    public boolean isIdle() {
        return test(0, System.currentTimeMillis());
    }

    public boolean isLoggable(LogRecord logRecord) {
        return accept(logRecord.getMillis());
    }

    public String toString() {
        boolean test;
        boolean test2;
        synchronized (this) {
            long currentTimeMillis = System.currentTimeMillis();
            test = test(0, currentTimeMillis);
            test2 = test(this.records, currentTimeMillis);
        }
        return getClass().getName() + "{records=" + this.records + ", duration=" + this.duration + ", idle=" + test + ", loggable=" + test2 + '}';
    }

    /* access modifiers changed from: protected */
    public DurationFilter clone() throws CloneNotSupportedException {
        DurationFilter durationFilter = (DurationFilter) super.clone();
        durationFilter.count = 0;
        durationFilter.peak = 0;
        durationFilter.start = 0;
        return durationFilter;
    }

    public boolean isLoggable() {
        return test(this.records, System.currentTimeMillis());
    }

    public DurationFilter(long j, long j2) {
        this.records = checkRecords(j);
        this.duration = checkDuration(j2);
    }
}
