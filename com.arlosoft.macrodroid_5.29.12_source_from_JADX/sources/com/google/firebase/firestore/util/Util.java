package com.google.firebase.firestore.util;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.cloud.datastore.core.number.NumberComparisonHelper;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.protobuf.ByteString;
import java.security.SecureRandom;
import java.util.Comparator;
import java.util.Random;
import p292io.grpc.C12537b1;
import p292io.grpc.StatusException;
import p292io.grpc.StatusRuntimeException;

public class Util {

    /* renamed from: a */
    private static final Random f54794a = new SecureRandom();

    /* renamed from: b */
    private static final Comparator f54795b = new Comparator<Comparable<?>>() {
        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };

    /* renamed from: c */
    private static final Continuation<Void, Void> f54796c = Util$$Lambda$2.m76533b();

    /* renamed from: a */
    public static <T extends Comparable<T>> Comparator<T> m76518a() {
        return f54795b;
    }

    /* renamed from: b */
    public static int m76519b(boolean z, boolean z2) {
        if (z == z2) {
            return 0;
        }
        return z ? 1 : -1;
    }

    /* renamed from: c */
    public static int m76520c(ByteString byteString, ByteString byteString2) {
        int min = Math.min(byteString.size(), byteString2.size());
        for (int i = 0; i < min; i++) {
            byte h = byteString.mo64922h(i) & 255;
            byte h2 = byteString2.mo64922h(i) & 255;
            if (h < h2) {
                return -1;
            }
            if (h > h2) {
                return 1;
            }
        }
        return m76522e(byteString.size(), byteString2.size());
    }

    /* renamed from: d */
    public static int m76521d(double d, double d2) {
        return NumberComparisonHelper.m73353c(d, d2);
    }

    /* renamed from: e */
    public static int m76522e(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    /* renamed from: f */
    public static int m76523f(long j, long j2) {
        return NumberComparisonHelper.m73351a(j, j2);
    }

    /* renamed from: g */
    public static int m76524g(double d, long j) {
        return NumberComparisonHelper.m73352b(d, j);
    }

    /* renamed from: h */
    private static Exception m76525h(Exception exc) {
        if (exc instanceof StatusException) {
            return m76527j(((StatusException) exc).mo69022a());
        }
        return exc instanceof StatusRuntimeException ? m76527j(((StatusRuntimeException) exc).mo69024a()) : exc;
    }

    /* renamed from: i */
    public static void m76526i(RuntimeException runtimeException) {
        new Handler(Looper.getMainLooper()).post(Util$$Lambda$1.m76532a(runtimeException));
    }

    /* renamed from: j */
    public static FirebaseFirestoreException m76527j(C12537b1 b1Var) {
        StatusException c = b1Var.mo69056c();
        return new FirebaseFirestoreException(c.getMessage(), FirebaseFirestoreException.Code.m7865d(b1Var.mo69062m().mo69069e()), c);
    }

    /* renamed from: k */
    static /* synthetic */ void m76528k(RuntimeException runtimeException) {
        throw runtimeException;
    }

    /* renamed from: l */
    static /* synthetic */ Void m76529l(Task task) throws Exception {
        if (task.mo23719t()) {
            return (Void) task.mo23715p();
        }
        Exception h = m76525h(task.mo23714o());
        if (h instanceof FirebaseFirestoreException) {
            throw h;
        }
        throw new FirebaseFirestoreException(h.getMessage(), FirebaseFirestoreException.Code.UNKNOWN, h);
    }

    /* renamed from: m */
    public static String m76530m(ByteString byteString) {
        int size = byteString.size();
        StringBuilder sb = new StringBuilder(size * 2);
        for (int i = 0; i < size; i++) {
            byte h = byteString.mo64922h(i) & 255;
            sb.append(Character.forDigit(h >>> 4, 16));
            sb.append(Character.forDigit(h & 15, 16));
        }
        return sb.toString();
    }
}
