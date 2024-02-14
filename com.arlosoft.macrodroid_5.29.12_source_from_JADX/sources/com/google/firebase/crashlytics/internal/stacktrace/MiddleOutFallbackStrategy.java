package com.google.firebase.crashlytics.internal.stacktrace;

public class MiddleOutFallbackStrategy implements StackTraceTrimmingStrategy {

    /* renamed from: a */
    private final int f5516a;

    /* renamed from: b */
    private final StackTraceTrimmingStrategy[] f5517b;

    /* renamed from: c */
    private final MiddleOutStrategy f5518c;

    public MiddleOutFallbackStrategy(int i, StackTraceTrimmingStrategy... stackTraceTrimmingStrategyArr) {
        this.f5516a = i;
        this.f5517b = stackTraceTrimmingStrategyArr;
        this.f5518c = new MiddleOutStrategy(i);
    }

    /* renamed from: a */
    public StackTraceElement[] mo23532a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f5516a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (StackTraceTrimmingStrategy stackTraceTrimmingStrategy : this.f5517b) {
            if (stackTraceElementArr2.length <= this.f5516a) {
                break;
            }
            stackTraceElementArr2 = stackTraceTrimmingStrategy.mo23532a(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > this.f5516a ? this.f5518c.mo23532a(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
