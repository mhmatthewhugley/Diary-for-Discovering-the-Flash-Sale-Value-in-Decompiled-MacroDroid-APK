package p111j1;

import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.app.NotificationCompat;
import com.arlosoft.macrodroid.extensions.C4661h;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.text.C15159j;
import p370qa.C16265l;

/* renamed from: j1.a */
/* compiled from: Predicate.kt */
public final class C7435a {

    /* renamed from: a */
    private final String f18193a;

    /* renamed from: b */
    private final C4661h<C7436a> f18194b = new C4661h<>(2);

    /* renamed from: c */
    private final C4661h<Integer> f18195c = new C4661h<>(4);

    /* renamed from: d */
    private C7436a f18196d;

    public C7435a(String str) {
        C13706o.m87929f(str, "copyWord");
        this.f18193a = str;
    }

    /* renamed from: b */
    private final C7436a m30833b(C7436a aVar) {
        List<CharSequence> j = aVar.mo37564j();
        if (j == null) {
            j = C13614t.m87748j();
        }
        return C7436a.m30840c(aVar, (Integer) null, (Long) null, (CharSequence) null, (Integer) null, (Integer) null, (CharSequence) null, new ArrayList(j), (CharSequence) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (List) null, 32703, (Object) null);
    }

    /* renamed from: d */
    public static /* synthetic */ boolean m30834d(C7435a aVar, C7436a aVar2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return aVar.mo37553c(aVar2, z);
    }

    /* renamed from: f */
    public static /* synthetic */ boolean m30835f(C7435a aVar, AccessibilityEvent accessibilityEvent, C16265l lVar, int i, Object obj) {
        if ((i & 2) != 0) {
            lVar = null;
        }
        return aVar.mo37554e(accessibilityEvent, lVar);
    }

    /* renamed from: a */
    public final void mo37552a(int i) {
        this.f18195c.add(Integer.valueOf(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0173, code lost:
        if ((r0 != null && kotlin.text.C15177w.m93659L(r0, r6.f18193a, true)) != false) goto L_0x0175;
     */
    @androidx.annotation.VisibleForTesting(otherwise = 2)
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo37553c(p111j1.C7435a.C7436a r7, boolean r8) {
        /*
            r6 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.C13706o.m87929f(r7, r0)
            java.lang.Integer r0 = r7.mo37560g()
            if (r0 != 0) goto L_0x000c
            goto L_0x0019
        L_0x000c:
            int r0 = r0.intValue()
            r1 = 8192(0x2000, float:1.14794E-41)
            if (r0 != r1) goto L_0x0019
            com.arlosoft.macrodroid.extensions.h<j1.a$a> r0 = r6.f18194b
            r0.add(r7)
        L_0x0019:
            java.lang.Integer r0 = r7.mo37560g()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0022
            goto L_0x0079
        L_0x0022:
            int r0 = r0.intValue()
            if (r0 != r2) goto L_0x0079
            java.util.List r0 = r7.mo37564j()
            if (r0 == 0) goto L_0x0079
            java.lang.CharSequence r0 = r7.mo37559f()
            if (r0 == 0) goto L_0x003e
            java.lang.String r3 = r6.f18193a
            boolean r0 = kotlin.text.C15177w.m93659L(r0, r3, r2)
            if (r0 != r2) goto L_0x003e
            r0 = 1
            goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            if (r0 != 0) goto L_0x0069
            java.util.List r0 = r7.mo37564j()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = r6.f18193a
            boolean r0 = kotlin.text.C15177w.m93659L(r0, r3, r2)
            if (r0 != 0) goto L_0x0069
            java.lang.CharSequence r0 = r7.mo37559f()
            java.lang.String r3 = "Cut"
            boolean r0 = kotlin.jvm.internal.C13706o.m87924a(r0, r3)
            if (r0 != 0) goto L_0x0069
            java.lang.CharSequence r0 = r7.mo37559f()
            java.lang.String r3 = r6.f18193a
            boolean r0 = kotlin.jvm.internal.C13706o.m87924a(r0, r3)
            if (r0 == 0) goto L_0x0079
        L_0x0069:
            java.lang.String r7 = "Copy captured - 2"
            if (r8 == 0) goto L_0x0073
            java.lang.Object[] r8 = new java.lang.Object[r1]
            p455ag.C17105a.m100579a(r7, r8)
            goto L_0x0078
        L_0x0073:
            java.io.PrintStream r8 = java.lang.System.out
            r8.println(r7)
        L_0x0078:
            return r2
        L_0x0079:
            com.arlosoft.macrodroid.extensions.h<j1.a$a> r0 = r6.f18194b
            int r0 = r0.size()
            r3 = 2
            if (r0 != r3) goto L_0x0104
            com.arlosoft.macrodroid.extensions.h<j1.a$a> r0 = r6.f18194b
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r3 = "typeViewSelectionChangeEvent[0]"
            kotlin.jvm.internal.C13706o.m87928e(r0, r3)
            j1.a$a r0 = (p111j1.C7435a.C7436a) r0
            com.arlosoft.macrodroid.extensions.h<j1.a$a> r3 = r6.f18194b
            java.lang.Object r3 = r3.get(r2)
            java.lang.String r4 = "typeViewSelectionChangeEvent[1]"
            kotlin.jvm.internal.C13706o.m87928e(r3, r4)
            j1.a$a r3 = (p111j1.C7435a.C7436a) r3
            java.lang.Integer r4 = r3.mo37561h()
            java.lang.Integer r5 = r3.mo37565k()
            boolean r4 = kotlin.jvm.internal.C13706o.m87924a(r4, r5)
            if (r4 == 0) goto L_0x0104
            java.lang.CharSequence r4 = r0.mo37563i()
            java.lang.CharSequence r5 = r3.mo37563i()
            boolean r4 = kotlin.jvm.internal.C13706o.m87924a(r4, r5)
            if (r4 == 0) goto L_0x00ec
            java.lang.Integer r4 = r0.mo37561h()
            java.lang.Integer r5 = r0.mo37565k()
            boolean r4 = kotlin.jvm.internal.C13706o.m87924a(r4, r5)
            if (r4 != 0) goto L_0x00ec
            java.lang.CharSequence r4 = r3.mo37556d()
            java.lang.CharSequence r5 = r0.mo37556d()
            boolean r4 = kotlin.jvm.internal.C13706o.m87924a(r4, r5)
            if (r4 == 0) goto L_0x00ec
            java.util.List r3 = r3.mo37564j()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.util.List r0 = r0.mo37564j()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = kotlin.jvm.internal.C13706o.m87924a(r3, r0)
            if (r0 == 0) goto L_0x00ec
            r0 = 1
            goto L_0x00ed
        L_0x00ec:
            r0 = 0
        L_0x00ed:
            com.arlosoft.macrodroid.extensions.h<j1.a$a> r3 = r6.f18194b
            r3.clear()
            if (r0 == 0) goto L_0x0104
            java.lang.String r7 = "Copy captured - 3"
            if (r8 == 0) goto L_0x00fe
            java.lang.Object[] r8 = new java.lang.Object[r1]
            p455ag.C17105a.m100579a(r7, r8)
            goto L_0x0103
        L_0x00fe:
            java.io.PrintStream r8 = java.lang.System.out
            r8.println(r7)
        L_0x0103:
            return r2
        L_0x0104:
            java.lang.Integer r0 = r7.mo37557e()
            if (r0 == 0) goto L_0x010f
            int r0 = r0.intValue()
            goto L_0x0110
        L_0x010f:
            r0 = 0
        L_0x0110:
            if (r0 != r2) goto L_0x0185
            java.lang.Integer r0 = r7.mo37560g()
            r3 = 2048(0x800, float:2.87E-42)
            if (r0 != 0) goto L_0x011c
            goto L_0x0185
        L_0x011c:
            int r0 = r0.intValue()
            if (r0 != r3) goto L_0x0185
            j1.a$a r0 = r6.f18196d
            if (r0 == 0) goto L_0x0185
            kotlin.jvm.internal.C13706o.m87926c(r0)
            java.lang.Integer r3 = r0.mo37560g()
            r4 = 32
            if (r3 != 0) goto L_0x0132
            goto L_0x0185
        L_0x0132:
            int r3 = r3.intValue()
            if (r3 != r4) goto L_0x0185
            java.util.List r3 = r0.mo37564j()
            if (r3 == 0) goto L_0x0146
            int r3 = r3.size()
            if (r3 != r2) goto L_0x0146
            r3 = 1
            goto L_0x0147
        L_0x0146:
            r3 = 0
        L_0x0147:
            if (r3 == 0) goto L_0x0185
            java.util.List r3 = r0.mo37564j()
            if (r3 == 0) goto L_0x015f
            java.lang.String r3 = r3.toString()
            if (r3 == 0) goto L_0x015f
            java.lang.String r4 = r6.f18193a
            boolean r3 = kotlin.text.C15177w.m93659L(r3, r4, r2)
            if (r3 != r2) goto L_0x015f
            r3 = 1
            goto L_0x0160
        L_0x015f:
            r3 = 0
        L_0x0160:
            if (r3 != 0) goto L_0x0175
            java.lang.CharSequence r0 = r0.mo37559f()
            if (r0 == 0) goto L_0x0172
            java.lang.String r3 = r6.f18193a
            boolean r0 = kotlin.text.C15177w.m93659L(r0, r3, r2)
            if (r0 != r2) goto L_0x0172
            r0 = 1
            goto L_0x0173
        L_0x0172:
            r0 = 0
        L_0x0173:
            if (r0 == 0) goto L_0x0185
        L_0x0175:
            java.lang.String r7 = "Copy captured - 1.1"
            if (r8 == 0) goto L_0x017f
            java.lang.Object[] r8 = new java.lang.Object[r1]
            p455ag.C17105a.m100579a(r7, r8)
            goto L_0x0184
        L_0x017f:
            java.io.PrintStream r8 = java.lang.System.out
            r8.println(r7)
        L_0x0184:
            return r2
        L_0x0185:
            java.lang.Integer r8 = r7.mo37560g()
            r0 = 64
            if (r8 != 0) goto L_0x018e
            goto L_0x01e4
        L_0x018e:
            int r8 = r8.intValue()
            if (r8 != r0) goto L_0x01e4
            java.lang.CharSequence r8 = r7.mo37556d()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<android.widget.Toast> r3 = android.widget.Toast.class
            xa.d r3 = kotlin.jvm.internal.C13687e0.m87868b(r3)
            java.lang.String r3 = r3.mo71942g()
            r0.append(r3)
            java.lang.String r3 = "$TN"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            boolean r8 = kotlin.jvm.internal.C13706o.m87924a(r8, r0)
            if (r8 == 0) goto L_0x01e4
            java.util.List r8 = r7.mo37564j()
            if (r8 == 0) goto L_0x01e4
            java.util.List r8 = r7.mo37564j()
            if (r8 == 0) goto L_0x01d9
            java.lang.String r8 = r8.toString()
            if (r8 == 0) goto L_0x01d9
            j1.a$a$a r0 = p111j1.C7435a.C7436a.f18197p
            kotlin.text.j r0 = r0.mo37568b()
            boolean r8 = r0.mo74466a(r8)
            if (r8 != r2) goto L_0x01d9
            r8 = 1
            goto L_0x01da
        L_0x01d9:
            r8 = 0
        L_0x01da:
            if (r8 == 0) goto L_0x01e4
            java.lang.Object[] r7 = new java.lang.Object[r1]
            java.lang.String r8 = "Copy captured - 1.2"
            p455ag.C17105a.m100579a(r8, r7)
            return r2
        L_0x01e4:
            j1.a$a r7 = r6.m30833b(r7)
            r6.f18196d = r7
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p111j1.C7435a.mo37553c(j1.a$a, boolean):boolean");
    }

    /* renamed from: e */
    public final boolean mo37554e(AccessibilityEvent accessibilityEvent, C16265l<? super C7436a, Boolean> lVar) {
        if (accessibilityEvent == null) {
            return false;
        }
        C7436a a = C7436a.f18197p.mo37567a(accessibilityEvent);
        boolean z = true;
        if (lVar == null || !lVar.invoke(a).booleanValue()) {
            z = false;
        }
        if (z) {
            return false;
        }
        return m30834d(this, a, false, 2, (Object) null);
    }

    /* renamed from: j1.a$a */
    /* compiled from: Predicate.kt */
    public static final class C7436a {

        /* renamed from: p */
        public static final C7437a f18197p = new C7437a((C13695i) null);
        /* access modifiers changed from: private */

        /* renamed from: q */
        public static final C15159j f18198q = new C15159j("(copied)|(Copied)|(clipboard)");

        /* renamed from: a */
        private Integer f18199a;

        /* renamed from: b */
        private Long f18200b;

        /* renamed from: c */
        private CharSequence f18201c;

        /* renamed from: d */
        private Integer f18202d;

        /* renamed from: e */
        private Integer f18203e;

        /* renamed from: f */
        private CharSequence f18204f;

        /* renamed from: g */
        private List<? extends CharSequence> f18205g;

        /* renamed from: h */
        private CharSequence f18206h;

        /* renamed from: i */
        private Integer f18207i;

        /* renamed from: j */
        private Integer f18208j;

        /* renamed from: k */
        private Integer f18209k;

        /* renamed from: l */
        private Integer f18210l;

        /* renamed from: m */
        private Integer f18211m;

        /* renamed from: n */
        private Integer f18212n;

        /* renamed from: o */
        private List<AccessibilityNodeInfo.AccessibilityAction> f18213o;

        /* renamed from: j1.a$a$a */
        /* compiled from: Predicate.kt */
        public static final class C7437a {
            private C7437a() {
            }

            public /* synthetic */ C7437a(C13695i iVar) {
                this();
            }

            /* renamed from: a */
            public final C7436a mo37567a(AccessibilityEvent accessibilityEvent) {
                C13706o.m87929f(accessibilityEvent, NotificationCompat.CATEGORY_EVENT);
                int eventType = accessibilityEvent.getEventType();
                long eventTime = accessibilityEvent.getEventTime();
                CharSequence packageName = accessibilityEvent.getPackageName();
                int movementGranularity = accessibilityEvent.getMovementGranularity();
                int action = accessibilityEvent.getAction();
                CharSequence className = accessibilityEvent.getClassName();
                List text = accessibilityEvent.getText();
                int contentChangeTypes = accessibilityEvent.getContentChangeTypes();
                CharSequence contentDescription = accessibilityEvent.getContentDescription();
                int currentItemIndex = accessibilityEvent.getCurrentItemIndex();
                int fromIndex = accessibilityEvent.getFromIndex();
                int toIndex = accessibilityEvent.getToIndex();
                int scrollX = accessibilityEvent.getScrollX();
                int scrollY = accessibilityEvent.getScrollY();
                List j = C13614t.m87748j();
                return new C7436a(Integer.valueOf(eventType), Long.valueOf(eventTime), packageName, Integer.valueOf(movementGranularity), Integer.valueOf(action), className, text, contentDescription, Integer.valueOf(contentChangeTypes), Integer.valueOf(currentItemIndex), Integer.valueOf(fromIndex), Integer.valueOf(toIndex), Integer.valueOf(scrollX), Integer.valueOf(scrollY), j);
            }

            /* renamed from: b */
            public final C15159j mo37568b() {
                return C7436a.f18198q;
            }
        }

        public C7436a() {
            this((Integer) null, (Long) null, (CharSequence) null, (Integer) null, (Integer) null, (CharSequence) null, (List) null, (CharSequence) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (List) null, 32767, (C13695i) null);
        }

        public C7436a(Integer num, Long l, CharSequence charSequence, Integer num2, Integer num3, CharSequence charSequence2, List<? extends CharSequence> list, CharSequence charSequence3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, List<AccessibilityNodeInfo.AccessibilityAction> list2) {
            List<AccessibilityNodeInfo.AccessibilityAction> list3 = list2;
            C13706o.m87929f(list3, "SourceActions");
            this.f18199a = num;
            this.f18200b = l;
            this.f18201c = charSequence;
            this.f18202d = num2;
            this.f18203e = num3;
            this.f18204f = charSequence2;
            this.f18205g = list;
            this.f18206h = charSequence3;
            this.f18207i = num4;
            this.f18208j = num5;
            this.f18209k = num6;
            this.f18210l = num7;
            this.f18211m = num8;
            this.f18212n = num9;
            this.f18213o = list3;
        }

        /* renamed from: c */
        public static /* synthetic */ C7436a m30840c(C7436a aVar, Integer num, Long l, CharSequence charSequence, Integer num2, Integer num3, CharSequence charSequence2, List list, CharSequence charSequence3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, List list2, int i, Object obj) {
            C7436a aVar2 = aVar;
            int i2 = i;
            return aVar.mo37555b((i2 & 1) != 0 ? aVar2.f18199a : num, (i2 & 2) != 0 ? aVar2.f18200b : l, (i2 & 4) != 0 ? aVar2.f18201c : charSequence, (i2 & 8) != 0 ? aVar2.f18202d : num2, (i2 & 16) != 0 ? aVar2.f18203e : num3, (i2 & 32) != 0 ? aVar2.f18204f : charSequence2, (i2 & 64) != 0 ? aVar2.f18205g : list, (i2 & 128) != 0 ? aVar2.f18206h : charSequence3, (i2 & 256) != 0 ? aVar2.f18207i : num4, (i2 & 512) != 0 ? aVar2.f18208j : num5, (i2 & 1024) != 0 ? aVar2.f18209k : num6, (i2 & 2048) != 0 ? aVar2.f18210l : num7, (i2 & 4096) != 0 ? aVar2.f18211m : num8, (i2 & 8192) != 0 ? aVar2.f18212n : num9, (i2 & 16384) != 0 ? aVar2.f18213o : list2);
        }

        /* renamed from: b */
        public final C7436a mo37555b(Integer num, Long l, CharSequence charSequence, Integer num2, Integer num3, CharSequence charSequence2, List<? extends CharSequence> list, CharSequence charSequence3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, List<AccessibilityNodeInfo.AccessibilityAction> list2) {
            C13706o.m87929f(list2, "SourceActions");
            return new C7436a(num, l, charSequence, num2, num3, charSequence2, list, charSequence3, num4, num5, num6, num7, num8, num9, list2);
        }

        /* renamed from: d */
        public final CharSequence mo37556d() {
            return this.f18204f;
        }

        /* renamed from: e */
        public final Integer mo37557e() {
            return this.f18207i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7436a)) {
                return false;
            }
            C7436a aVar = (C7436a) obj;
            return C13706o.m87924a(this.f18199a, aVar.f18199a) && C13706o.m87924a(this.f18200b, aVar.f18200b) && C13706o.m87924a(this.f18201c, aVar.f18201c) && C13706o.m87924a(this.f18202d, aVar.f18202d) && C13706o.m87924a(this.f18203e, aVar.f18203e) && C13706o.m87924a(this.f18204f, aVar.f18204f) && C13706o.m87924a(this.f18205g, aVar.f18205g) && C13706o.m87924a(this.f18206h, aVar.f18206h) && C13706o.m87924a(this.f18207i, aVar.f18207i) && C13706o.m87924a(this.f18208j, aVar.f18208j) && C13706o.m87924a(this.f18209k, aVar.f18209k) && C13706o.m87924a(this.f18210l, aVar.f18210l) && C13706o.m87924a(this.f18211m, aVar.f18211m) && C13706o.m87924a(this.f18212n, aVar.f18212n) && C13706o.m87924a(this.f18213o, aVar.f18213o);
        }

        /* renamed from: f */
        public final CharSequence mo37559f() {
            return this.f18206h;
        }

        /* renamed from: g */
        public final Integer mo37560g() {
            return this.f18199a;
        }

        /* renamed from: h */
        public final Integer mo37561h() {
            return this.f18209k;
        }

        public int hashCode() {
            Integer num = this.f18199a;
            int i = 0;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Long l = this.f18200b;
            int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
            CharSequence charSequence = this.f18201c;
            int hashCode3 = (hashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
            Integer num2 = this.f18202d;
            int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.f18203e;
            int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
            CharSequence charSequence2 = this.f18204f;
            int hashCode6 = (hashCode5 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
            List<? extends CharSequence> list = this.f18205g;
            int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
            CharSequence charSequence3 = this.f18206h;
            int hashCode8 = (hashCode7 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
            Integer num4 = this.f18207i;
            int hashCode9 = (hashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.f18208j;
            int hashCode10 = (hashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31;
            Integer num6 = this.f18209k;
            int hashCode11 = (hashCode10 + (num6 == null ? 0 : num6.hashCode())) * 31;
            Integer num7 = this.f18210l;
            int hashCode12 = (hashCode11 + (num7 == null ? 0 : num7.hashCode())) * 31;
            Integer num8 = this.f18211m;
            int hashCode13 = (hashCode12 + (num8 == null ? 0 : num8.hashCode())) * 31;
            Integer num9 = this.f18212n;
            if (num9 != null) {
                i = num9.hashCode();
            }
            return ((hashCode13 + i) * 31) + this.f18213o.hashCode();
        }

        /* renamed from: i */
        public final CharSequence mo37563i() {
            return this.f18201c;
        }

        /* renamed from: j */
        public final List<CharSequence> mo37564j() {
            return this.f18205g;
        }

        /* renamed from: k */
        public final Integer mo37565k() {
            return this.f18210l;
        }

        public String toString() {
            return "AEvent(EventType=" + this.f18199a + ", EventTime=" + this.f18200b + ", PackageName=" + this.f18201c + ", MovementGranularity=" + this.f18202d + ", Action=" + this.f18203e + ", ClassName=" + this.f18204f + ", Text=" + this.f18205g + ", ContentDescription=" + this.f18206h + ", ContentChangeTypes=" + this.f18207i + ", CurrentItemIndex=" + this.f18208j + ", FromIndex=" + this.f18209k + ", ToIndex=" + this.f18210l + ", ScrollX=" + this.f18211m + ", ScrollY=" + this.f18212n + ", SourceActions=" + this.f18213o + ')';
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C7436a(java.lang.Integer r17, java.lang.Long r18, java.lang.CharSequence r19, java.lang.Integer r20, java.lang.Integer r21, java.lang.CharSequence r22, java.util.List r23, java.lang.CharSequence r24, java.lang.Integer r25, java.lang.Integer r26, java.lang.Integer r27, java.lang.Integer r28, java.lang.Integer r29, java.lang.Integer r30, java.util.List r31, int r32, kotlin.jvm.internal.C13695i r33) {
            /*
                r16 = this;
                r0 = r32
                r1 = r0 & 1
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r1 = r2
                goto L_0x000b
            L_0x0009:
                r1 = r17
            L_0x000b:
                r3 = r0 & 2
                if (r3 == 0) goto L_0x0011
                r3 = r2
                goto L_0x0013
            L_0x0011:
                r3 = r18
            L_0x0013:
                r4 = r0 & 4
                if (r4 == 0) goto L_0x0019
                r4 = r2
                goto L_0x001b
            L_0x0019:
                r4 = r19
            L_0x001b:
                r5 = r0 & 8
                if (r5 == 0) goto L_0x0021
                r5 = r2
                goto L_0x0023
            L_0x0021:
                r5 = r20
            L_0x0023:
                r6 = r0 & 16
                if (r6 == 0) goto L_0x0029
                r6 = r2
                goto L_0x002b
            L_0x0029:
                r6 = r21
            L_0x002b:
                r7 = r0 & 32
                if (r7 == 0) goto L_0x0031
                r7 = r2
                goto L_0x0033
            L_0x0031:
                r7 = r22
            L_0x0033:
                r8 = r0 & 64
                if (r8 == 0) goto L_0x0039
                r8 = r2
                goto L_0x003b
            L_0x0039:
                r8 = r23
            L_0x003b:
                r9 = r0 & 128(0x80, float:1.794E-43)
                if (r9 == 0) goto L_0x0041
                r9 = r2
                goto L_0x0043
            L_0x0041:
                r9 = r24
            L_0x0043:
                r10 = r0 & 256(0x100, float:3.59E-43)
                if (r10 == 0) goto L_0x0049
                r10 = r2
                goto L_0x004b
            L_0x0049:
                r10 = r25
            L_0x004b:
                r11 = r0 & 512(0x200, float:7.175E-43)
                if (r11 == 0) goto L_0x0051
                r11 = r2
                goto L_0x0053
            L_0x0051:
                r11 = r26
            L_0x0053:
                r12 = r0 & 1024(0x400, float:1.435E-42)
                if (r12 == 0) goto L_0x0059
                r12 = r2
                goto L_0x005b
            L_0x0059:
                r12 = r27
            L_0x005b:
                r13 = r0 & 2048(0x800, float:2.87E-42)
                if (r13 == 0) goto L_0x0061
                r13 = r2
                goto L_0x0063
            L_0x0061:
                r13 = r28
            L_0x0063:
                r14 = r0 & 4096(0x1000, float:5.74E-42)
                if (r14 == 0) goto L_0x0069
                r14 = r2
                goto L_0x006b
            L_0x0069:
                r14 = r29
            L_0x006b:
                r15 = r0 & 8192(0x2000, float:1.14794E-41)
                if (r15 == 0) goto L_0x0070
                goto L_0x0072
            L_0x0070:
                r2 = r30
            L_0x0072:
                r0 = r0 & 16384(0x4000, float:2.2959E-41)
                if (r0 == 0) goto L_0x007b
                java.util.List r0 = kotlin.collections.C13614t.m87748j()
                goto L_0x007d
            L_0x007b:
                r0 = r31
            L_0x007d:
                r17 = r16
                r18 = r1
                r19 = r3
                r20 = r4
                r21 = r5
                r22 = r6
                r23 = r7
                r24 = r8
                r25 = r9
                r26 = r10
                r27 = r11
                r28 = r12
                r29 = r13
                r30 = r14
                r31 = r2
                r32 = r0
                r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p111j1.C7435a.C7436a.<init>(java.lang.Integer, java.lang.Long, java.lang.CharSequence, java.lang.Integer, java.lang.Integer, java.lang.CharSequence, java.util.List, java.lang.CharSequence, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.util.List, int, kotlin.jvm.internal.i):void");
        }
    }
}
