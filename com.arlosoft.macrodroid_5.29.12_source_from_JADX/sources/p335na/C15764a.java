package p335na;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p326ma.C15708a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\r"}, mo71668d2 = {"Lna/a;", "Lma/a;", "", "version", "", "c", "", "cause", "exception", "Lja/u;", "a", "<init>", "()V", "kotlin-stdlib-jdk7"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: na.a */
/* compiled from: JDK7PlatformImplementations.kt */
public class C15764a extends C15708a {

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo71668d2 = {"Lna/a$a;", "", "<init>", "()V", "kotlin-stdlib-jdk7"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: na.a$a */
    /* compiled from: JDK7PlatformImplementations.kt */
    private static final class C15765a {

        /* renamed from: a */
        public static final C15765a f65109a = new C15765a();

        /* renamed from: b */
        public static final Integer f65110b;

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
        static {
            /*
                na.a$a r0 = new na.a$a
                r0.<init>()
                f65109a = r0
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x001f }
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch:{ all -> 0x001f }
                java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x001f }
                boolean r2 = r1 instanceof java.lang.Integer     // Catch:{ all -> 0x001f }
                if (r2 == 0) goto L_0x001f
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x001f }
                goto L_0x0020
            L_0x001f:
                r1 = r0
            L_0x0020:
                if (r1 == 0) goto L_0x002e
                int r2 = r1.intValue()
                if (r2 <= 0) goto L_0x002a
                r2 = 1
                goto L_0x002b
            L_0x002a:
                r2 = 0
            L_0x002b:
                if (r2 == 0) goto L_0x002e
                r0 = r1
            L_0x002e:
                f65110b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p335na.C15764a.C15765a.<clinit>():void");
        }

        private C15765a() {
        }
    }

    /* renamed from: c */
    private final boolean m95090c(int i) {
        Integer num = C15765a.f65110b;
        return num == null || num.intValue() >= i;
    }

    /* renamed from: a */
    public void mo75145a(Throwable th, Throwable th2) {
        C13706o.m87929f(th, "cause");
        C13706o.m87929f(th2, "exception");
        if (m95090c(19)) {
            th.addSuppressed(th2);
        } else {
            super.mo75145a(th, th2);
        }
    }
}
