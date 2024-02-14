package com.google.firebase.crashlytics.internal.stacktrace;

public class MiddleOutStrategy implements StackTraceTrimmingStrategy {

    /* renamed from: a */
    private final int f5519a;

    public MiddleOutStrategy(int i) {
        this.f5519a = i;
    }

    /* renamed from: a */
    public StackTraceElement[] mo23532a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i = this.f5519a;
        if (length <= i) {
            return stackTraceElementArr;
        }
        int i2 = i / 2;
        int i3 = i - i2;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i3);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i2, stackTraceElementArr2, i3, i2);
        return stackTraceElementArr2;
    }
}
