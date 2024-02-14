package p473rx.internal.util;

import java.io.PrintStream;
import java.util.Queue;
import p459ef.C17163i;
import p473rx.internal.operators.C17318b;
import p473rx.internal.util.unsafe.C17402k;
import p473rx.internal.util.unsafe.C17410s;

/* renamed from: rx.internal.util.d */
/* compiled from: RxRingBuffer */
public class C17380d implements C17163i {

    /* renamed from: a */
    private static final C17318b<Object> f69133a = C17318b.m101039e();

    /* renamed from: c */
    public static final int f69134c;

    /* renamed from: d */
    public static final C17376b<Queue<Object>> f69135d = new C17381a();

    /* renamed from: f */
    public static final C17376b<Queue<Object>> f69136f = new C17382b();

    /* renamed from: rx.internal.util.d$a */
    /* compiled from: RxRingBuffer */
    static class C17381a extends C17376b<Queue<Object>> {
        C17381a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public C17410s<Object> mo80695a() {
            return new C17410s<>(C17380d.f69134c);
        }
    }

    /* renamed from: rx.internal.util.d$b */
    /* compiled from: RxRingBuffer */
    static class C17382b extends C17376b<Queue<Object>> {
        C17382b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public C17402k<Object> mo80695a() {
            return new C17402k<>(C17380d.f69134c);
        }
    }

    static {
        int i = C17378c.m101134c() ? 16 : 128;
        String property = System.getProperty("rx.ring-buffer.size");
        if (property != null) {
            try {
                i = Integer.parseInt(property);
            } catch (NumberFormatException e) {
                PrintStream printStream = System.err;
                printStream.println("Failed to set 'rx.buffer.size' with value " + property + " => " + e.getMessage());
            }
        }
        f69134c = i;
    }
}
