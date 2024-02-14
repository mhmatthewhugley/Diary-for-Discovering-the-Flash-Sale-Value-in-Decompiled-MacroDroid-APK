package com.arlosoft.macrodroid.common;

import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C13695i;

/* compiled from: NonAppActivityWithPreventClash.kt */
public class NonAppActivityWithPreventClash extends NonAppActivity {

    /* renamed from: p */
    public static final C3988a f10334p = new C3988a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static long f10335s;

    /* renamed from: o */
    public Map<Integer, View> f10336o = new LinkedHashMap();

    /* renamed from: com.arlosoft.macrodroid.common.NonAppActivityWithPreventClash$a */
    /* compiled from: NonAppActivityWithPreventClash.kt */
    public static final class C3988a {
        private C3988a() {
        }

        public /* synthetic */ C3988a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final long mo27790a() {
            long max = Math.max(500 - (System.currentTimeMillis() - NonAppActivityWithPreventClash.f10335s), 0);
            NonAppActivityWithPreventClash.f10335s = System.currentTimeMillis() + max;
            return max;
        }
    }

    /* renamed from: N1 */
    public static final long m15476N1() {
        return f10334p.mo27790a();
    }
}
