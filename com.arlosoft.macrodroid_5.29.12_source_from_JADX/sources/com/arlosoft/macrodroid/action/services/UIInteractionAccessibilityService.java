package com.arlosoft.macrodroid.action.services;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.GestureDescription;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.accessibility.AccessibilityNodeInfo;
import com.arlosoft.macrodroid.action.UiInteractionConfiguration;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.ScreenContentTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6460y1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.text.C15159j;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15503p1;
import kotlinx.coroutines.C15552u0;
import kotlinx.coroutines.C15561w1;
import p105i1.C7394a;
import p111j1.C7435a;
import p111j1.C7438b;
import p148q0.C8151a;
import p162s2.C10182a;
import p292io.reactivex.subjects.C13244c;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

/* compiled from: UIInteractionAccessibilityService.kt */
public final class UIInteractionAccessibilityService extends AccessibilityService {

    /* renamed from: g */
    public static final C3437a f9127g = new C3437a((C13695i) null);
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static boolean f9128o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static boolean f9129p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static final C13244c<UiInteractionConfiguration.Click> f9130s;

    /* renamed from: a */
    private C7435a f9131a;

    /* renamed from: c */
    public C10182a f9132c;

    /* renamed from: d */
    private int f9133d;

    /* renamed from: f */
    private int f9134f;

    /* renamed from: com.arlosoft.macrodroid.action.services.UIInteractionAccessibilityService$a */
    /* compiled from: UIInteractionAccessibilityService.kt */
    public static final class C3437a {

        /* renamed from: com.arlosoft.macrodroid.action.services.UIInteractionAccessibilityService$a$a */
        /* compiled from: UIInteractionAccessibilityService.kt */
        static final class C3438a extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
            int label;

            C3438a(C13635d<? super C3438a> dVar) {
                super(2, dVar);
            }

            public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
                return new C3438a(dVar);
            }

            public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
                return ((C3438a) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
            }

            public final Object invokeSuspend(Object obj) {
                Object c = C13652d.m87832c();
                int i = this.label;
                if (i == 0) {
                    C13332o.m85685b(obj);
                    this.label = 1;
                    if (C15552u0.m94699a(500, this) == c) {
                        return c;
                    }
                } else if (i == 1) {
                    C13332o.m85685b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C3437a aVar = UIInteractionAccessibilityService.f9127g;
                UIInteractionAccessibilityService.f9129p = true;
                return C13339u.f61331a;
            }
        }

        private C3437a() {
        }

        public /* synthetic */ C3437a(C13695i iVar) {
            this();
        }

        /* renamed from: a */
        public final void mo26809a() {
            C15561w1 unused = C15473j.m94492d(C15503p1.f64723a, (C13640g) null, (C15486m0) null, new C3438a((C13635d<? super C3438a>) null), 3, (Object) null);
        }

        /* renamed from: b */
        public final void mo26810b(Context context) {
            C13706o.m87929f(context, "context");
            Intent intent = new Intent(context, UIInteractionAccessibilityService.class);
            intent.putExtra("uiQuery", true);
            context.startService(intent);
        }

        /* renamed from: c */
        public final C13244c<UiInteractionConfiguration.Click> mo26811c() {
            return UIInteractionAccessibilityService.f9130s;
        }

        /* renamed from: d */
        public final void mo26812d(Context context) {
            C13706o.m87929f(context, "context");
            Intent intent = new Intent(context, UIInteractionAccessibilityService.class);
            intent.putExtra("captureScreen", true);
            context.startService(intent);
        }

        /* renamed from: e */
        public final boolean mo26813e() {
            return UIInteractionAccessibilityService.f9128o;
        }
    }

    static {
        C13244c<UiInteractionConfiguration.Click> i0 = C13244c.m85607i0();
        C13706o.m87928e(i0, "create()");
        f9130s = i0;
    }

    public UIInteractionAccessibilityService() {
        MacroDroidApplication.f9883I.mo27302a().mo38312q(this);
    }

    /* renamed from: A */
    private final void m14345A(long j, long j2, long j3, long j4, long j5) {
        Path path = new Path();
        path.moveTo((float) j, (float) j2);
        path.lineTo((float) j3, (float) j4);
        if (Build.VERSION.SDK_INT >= 24) {
            GestureDescription.Builder builder = new GestureDescription.Builder();
            if (j5 > 60000) {
                C4878b.m18868g("Gesture duration exceeds maximum (60 seconds). Forcing to 60 seconds");
                j5 = 60000;
            }
            builder.addStroke(new GestureDescription.StrokeDescription(path, 0, Math.max(1, j5)));
            if (!dispatchGesture(builder.build(), (AccessibilityService.GestureResultCallback) null, (Handler) null)) {
                C4878b.m18868g("Failed to dispatch gesture");
                return;
            }
            return;
        }
        C4878b.m18868g("Gestures are only supported on Android 7+");
    }

    /* renamed from: B */
    private final void m14346B(long j, long j2, long j3, long[] jArr, long[] jArr2, long j4) {
        long j5;
        if (Build.VERSION.SDK_INT < 24) {
            C4878b.m18868g("Gestures are only supported on Android 7+");
            return;
        }
        Path path = new Path();
        path.moveTo((float) j, (float) j2);
        GestureDescription.Builder builder = new GestureDescription.Builder();
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            path.lineTo((float) jArr[i], (float) jArr2[i]);
        }
        if (j3 > 20000) {
            C4878b.m18869h("Gesture sequence element duration exceeds maximum (20 seconds). Forcing to 20 seconds", j4);
            j5 = 20000;
        } else {
            j5 = j3 < 1 ? 1 : j3;
        }
        builder.addStroke(new GestureDescription.StrokeDescription(path, 0, j5));
        try {
            if (!dispatchGesture(builder.build(), (AccessibilityService.GestureResultCallback) null, (Handler) null)) {
                C4878b.m18868g("Failed to dispatch gesture");
            }
        } catch (Exception e) {
            C4878b.m18868g("Gesture sequence failed: " + e);
        }
    }

    /* renamed from: C */
    private final void m14347C(UiInteractionConfiguration.Paste paste, TriggerContextInfo triggerContextInfo, long j) {
        String str;
        if (paste.getUseClipboard()) {
            Object systemService = getSystemService("clipboard");
            C13706o.m87927d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ClipData primaryClip = ((ClipboardManager) systemService).getPrimaryClip();
            ClipData.Item itemAt = primaryClip != null ? primaryClip.getItemAt(0) : null;
            if (itemAt == null || itemAt.getText() == null) {
                str = C7394a.m30554a();
                if (str == null) {
                    str = "";
                }
            } else {
                str = itemAt.getText().toString();
            }
            m14351G(str, paste.getForceClear(), triggerContextInfo, j);
            return;
        }
        m14351G(paste.getText(), paste.getForceClear(), triggerContextInfo, j);
    }

    /* renamed from: D */
    private final void m14348D() {
        AccessibilityNodeInfo w = m14376w();
        if (w != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            m14358e(this, w, arrayList, 0, 4, (Object) null);
            ArrayList<Macro> arrayList2 = new ArrayList<>();
            for (Macro next : C4934n.m18998M().mo29679I()) {
                Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Trigger next2 = it.next();
                    if (next2 instanceof ScreenContentTrigger) {
                        Object obj = null;
                        if (next2.mo27845e0((TriggerContextInfo) null)) {
                            ScreenContentTrigger screenContentTrigger = (ScreenContentTrigger) next2;
                            if (screenContentTrigger.mo31459w3().isEmpty() || C13566b0.m87414O(screenContentTrigger.mo31459w3(), w.getPackageName())) {
                                String x3 = screenContentTrigger.mo31460x3();
                                if (!(x3 == null || x3.length() == 0)) {
                                    String b = C6460y1.m24790b(x3, screenContentTrigger.mo31455D3());
                                    ArrayList arrayList3 = new ArrayList(C13616u.m87774u(arrayList, 10));
                                    for (String str : arrayList) {
                                        if (screenContentTrigger.mo31454C3()) {
                                            str = str.toLowerCase(Locale.ROOT);
                                            C13706o.m87928e(str, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                        }
                                        arrayList3.add(str);
                                    }
                                    Iterator it2 = arrayList3.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        Object next3 = it2.next();
                                        if (C6460y1.m24792d((String) next3, b, screenContentTrigger.mo31455D3())) {
                                            obj = next3;
                                            break;
                                        }
                                    }
                                    if (obj == null) {
                                        screenContentTrigger.mo31456F3(true);
                                    } else if (screenContentTrigger.mo31458v3()) {
                                        next.setTriggerThatInvoked(next2);
                                        if (next.canInvoke(next.getTriggerContextInfo())) {
                                            C13706o.m87928e(next, "macro");
                                            arrayList2.add(next);
                                            screenContentTrigger.mo31456F3(false);
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                screenContentTrigger.mo31456F3(true);
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            for (Macro macro : arrayList2) {
                macro.invokeActions(macro.getTriggerContextInfo());
            }
        }
    }

    /* renamed from: E */
    public static final boolean m14349E() {
        return f9127g.mo26813e();
    }

    /* renamed from: F */
    private final AccessibilityNodeInfo m14350F(List<? extends AccessibilityNodeInfo> list) {
        int i = Integer.MAX_VALUE;
        AccessibilityNodeInfo accessibilityNodeInfo = null;
        for (AccessibilityNodeInfo accessibilityNodeInfo2 : list) {
            Rect rect = new Rect();
            accessibilityNodeInfo2.getBoundsInScreen(rect);
            int width = rect.width() * rect.height();
            if (width < i) {
                accessibilityNodeInfo = accessibilityNodeInfo2;
                i = width;
            }
        }
        return accessibilityNodeInfo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0036, code lost:
        if (r11 == null) goto L_0x0038;
     */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m14351G(java.lang.String r9, boolean r10, com.arlosoft.macrodroid.triggers.TriggerContextInfo r11, long r12) {
        /*
            r8 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1 = 1
            android.view.accessibility.AccessibilityNodeInfo r1 = r8.findFocus(r1)
            com.arlosoft.macrodroid.macro.n r2 = com.arlosoft.macrodroid.macro.C4934n.m18998M()
            com.arlosoft.macrodroid.macro.Macro r12 = r2.mo29682Q(r12)
            java.lang.String r2 = com.arlosoft.macrodroid.common.C4023j0.m15760t0(r8, r9, r11, r12)
            java.lang.String r9 = "outputText"
            kotlin.jvm.internal.C13706o.m87928e(r2, r9)
            java.lang.String r3 = "\\n"
            java.lang.String r4 = "\n"
            r5 = 0
            r6 = 4
            r7 = 0
            java.lang.String r9 = kotlin.text.C15176v.m93630E(r2, r3, r4, r5, r6, r7)
            int r11 = android.os.Build.VERSION.SDK_INT
            java.lang.String r12 = ""
            r13 = 26
            if (r11 < r13) goto L_0x0038
            if (r1 == 0) goto L_0x0035
            java.lang.CharSequence r11 = r1.getHintText()
            goto L_0x0036
        L_0x0035:
            r11 = 0
        L_0x0036:
            if (r11 != 0) goto L_0x0039
        L_0x0038:
            r11 = r12
        L_0x0039:
            if (r1 == 0) goto L_0x0047
            java.lang.CharSequence r13 = r1.getText()
            if (r13 == 0) goto L_0x0047
            java.lang.String r13 = r13.toString()
            if (r13 != 0) goto L_0x0048
        L_0x0047:
            r13 = r12
        L_0x0048:
            boolean r11 = kotlin.jvm.internal.C13706o.m87924a(r11, r13)
            if (r11 != 0) goto L_0x0052
            if (r10 == 0) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r12 = r13
        L_0x0052:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r12)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            java.lang.String r10 = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"
            r0.putCharSequence(r10, r9)
            if (r1 == 0) goto L_0x0089
            r9 = 2097152(0x200000, float:2.938736E-39)
            boolean r9 = r1.performAction(r9, r0)
            if (r9 != 0) goto L_0x008e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Failed to paste text. Typically only EditText fields can pasted into. This field type = "
            r9.append(r10)
            java.lang.CharSequence r10 = r1.getClassName()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r9)
            goto L_0x008e
        L_0x0089:
            java.lang.String r9 = "Paste failed (could not detect current UI focus)"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r9)
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.services.UIInteractionAccessibilityService.m14351G(java.lang.String, boolean, com.arlosoft.macrodroid.triggers.TriggerContextInfo, long):void");
    }

    /* renamed from: H */
    private final boolean m14352H(Point point, boolean z) {
        Path path = new Path();
        int i = point.x;
        float f = 0.0f;
        float f2 = i >= 0 ? (float) i : 0.0f;
        int i2 = point.y;
        if (i2 >= 0) {
            f = (float) i2;
        }
        path.moveTo(f2, f);
        path.lineTo(f2 + 1.0f, f + 1.0f);
        GestureDescription.Builder builder = new GestureDescription.Builder();
        builder.addStroke(new GestureDescription.StrokeDescription(path, 0, z ? 1000 : 30));
        return dispatchGesture(builder.build(), (AccessibilityService.GestureResultCallback) null, (Handler) null);
    }

    /* renamed from: I */
    private final void m14353I(Point point, boolean z) {
        AccessibilityNodeInfo w = m14376w();
        if (w == null) {
            C4878b.m18868g("Cannot perform click as x,y location (could not detect current UI root node). Please try rebooting your device.");
            return;
        }
        AccessibilityNodeInfo v = m14375v(this, w, point, 0, 4, (Object) null);
        if (v != null) {
            m14370q(this, v, z, 0, 4, (Object) null);
        }
    }

    /* renamed from: d */
    private final void m14357d(AccessibilityNodeInfo accessibilityNodeInfo, List<String> list, int i) {
        if (i <= 75) {
            if (accessibilityNodeInfo.getText() != null) {
                list.add(accessibilityNodeInfo.getText().toString());
            }
            int childCount = accessibilityNodeInfo.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i2);
                if (child != null) {
                    m14357d(child, list, i + 1);
                }
            }
        }
    }

    /* renamed from: e */
    static /* synthetic */ void m14358e(UIInteractionAccessibilityService uIInteractionAccessibilityService, AccessibilityNodeInfo accessibilityNodeInfo, List list, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        uIInteractionAccessibilityService.m14357d(accessibilityNodeInfo, list, i);
    }

    /* renamed from: f */
    private final void m14359f(AccessibilityNodeInfo accessibilityNodeInfo, HashMap<String, String> hashMap, List<String> list) {
        String str;
        String viewIdResourceName = accessibilityNodeInfo.getViewIdResourceName();
        if (viewIdResourceName == null) {
            viewIdResourceName = "index:" + this.f9134f;
        }
        if (list.contains(viewIdResourceName)) {
            int i = 2;
            while (true) {
                if (!list.contains(viewIdResourceName + '$' + i)) {
                    break;
                }
                i++;
            }
            viewIdResourceName = viewIdResourceName + '$' + i;
        }
        CharSequence text = accessibilityNodeInfo.getText();
        if (text == null || (str = text.toString()) == null) {
            CharSequence contentDescription = accessibilityNodeInfo.getContentDescription();
            str = contentDescription != null ? contentDescription.toString() : null;
        }
        if (str != null) {
            hashMap.put(viewIdResourceName, str);
            list.add(viewIdResourceName);
        }
        this.f9134f++;
        int childCount = accessibilityNodeInfo.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i2);
            if (child != null) {
                m14359f(child, hashMap, list);
            }
        }
    }

    /* renamed from: g */
    private final void m14360g() {
        AccessibilityNodeInfo x = m14377x();
        if (x != null) {
            x.performAction(8);
        } else {
            C4878b.m18868g("Clear selection failed (could not detect current UI focus)");
        }
    }

    /* renamed from: h */
    private final void m14361h(boolean z) {
        if (m14377x() != null) {
            m14370q(this, m14377x(), z, 0, 4, (Object) null);
            return;
        }
        C4878b.m18868g("Click current focus item failed (could not detect current UI focus)");
    }

    /* renamed from: i */
    private final void m14362i(Point point, boolean z) {
        if (point == null) {
            C4878b.m18868g("Tried to click item at location, but no location configured");
        } else if (Build.VERSION.SDK_INT < 24) {
            m14353I(point, z);
        } else if (!m14352H(point, z)) {
            m14353I(point, z);
        }
    }

    /* renamed from: j */
    private final boolean m14363j(AccessibilityNodeInfo accessibilityNodeInfo, String str, boolean z, long j, int i) {
        AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfo;
        int i2 = i;
        if (i2 > 75) {
            return false;
        }
        if (str == null) {
            C4878b.m18868g("Click item with content description failed (No text content specified)");
            return false;
        } else if (accessibilityNodeInfo2 == null) {
            C4878b.m18868g("Click item with content description failed (node was null).");
            return false;
        } else {
            if (accessibilityNodeInfo.getContentDescription() != null) {
                if (m14371r(str, 1, accessibilityNodeInfo.getContentDescription().toString(), false, j)) {
                    m14370q(this, accessibilityNodeInfo, z, 0, 4, (Object) null);
                    return true;
                }
            }
            int childCount = accessibilityNodeInfo.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                if (m14363j(accessibilityNodeInfo.getChild(i3), str, z, j, i2 + 1)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: k */
    static /* synthetic */ boolean m14364k(UIInteractionAccessibilityService uIInteractionAccessibilityService, AccessibilityNodeInfo accessibilityNodeInfo, String str, boolean z, long j, int i, int i2, Object obj) {
        return uIInteractionAccessibilityService.m14363j(accessibilityNodeInfo, str, z, j, (i2 & 16) != 0 ? 0 : i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004f A[Catch:{ Exception -> 0x00e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007c A[Catch:{ Exception -> 0x00e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007f A[Catch:{ Exception -> 0x00e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ab A[Catch:{ Exception -> 0x00e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b6 A[Catch:{ Exception -> 0x00e0 }] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m14365l(java.lang.String r19, java.lang.String r20, java.lang.String r21, android.graphics.Point r22, boolean r23, long r24) {
        /*
            r18 = this;
            r10 = r18
            r9 = r19
            r11 = r20
            r12 = r21
            r13 = r22
            r14 = r23
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Attempting to click item, viewId="
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = ", textContent="
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = ", xyPoint="
            r0.append(r1)
            r0.append(r13)
            java.lang.String r1 = ", longClick="
            r0.append(r1)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18879r(r0)
            android.view.accessibility.AccessibilityNodeInfo r15 = r18.m14376w()
            if (r15 == 0) goto L_0x00e6
            r16 = 1
            r8 = 0
            if (r11 == 0) goto L_0x004c
            int r0 = r20.length()     // Catch:{ Exception -> 0x00e0 }
            if (r0 != 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            r0 = 0
            goto L_0x004d
        L_0x004c:
            r0 = 1
        L_0x004d:
            if (r0 != 0) goto L_0x007c
            r6 = 0
            r7 = 16
            r17 = 0
            r0 = r18
            r1 = r15
            r2 = r20
            r3 = r23
            r4 = r24
            r14 = 0
            r8 = r17
            boolean r0 = m14364k(r0, r1, r2, r3, r4, r6, r7, r8)     // Catch:{ Exception -> 0x00e0 }
            if (r0 == 0) goto L_0x0067
            return
        L_0x0067:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e0 }
            r0.<init>()     // Catch:{ Exception -> 0x00e0 }
            java.lang.String r1 = "Failed to click content description: "
            r0.append(r1)     // Catch:{ Exception -> 0x00e0 }
            r0.append(r11)     // Catch:{ Exception -> 0x00e0 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00e0 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18879r(r0)     // Catch:{ Exception -> 0x00e0 }
            goto L_0x007d
        L_0x007c:
            r14 = 0
        L_0x007d:
            if (r9 == 0) goto L_0x00a9
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x00e0 }
            r5.<init>()     // Catch:{ Exception -> 0x00e0 }
            r10.f9133d = r14     // Catch:{ Exception -> 0x00e0 }
            r4 = 0
            r0 = r18
            r1 = r15
            r2 = r19
            r3 = r23
            boolean r0 = r0.m14368o(r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x00e0 }
            if (r0 == 0) goto L_0x0095
            return
        L_0x0095:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e0 }
            r0.<init>()     // Catch:{ Exception -> 0x00e0 }
            java.lang.String r1 = "Failed to click viewId: "
            r0.append(r1)     // Catch:{ Exception -> 0x00e0 }
            r0.append(r9)     // Catch:{ Exception -> 0x00e0 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00e0 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18879r(r0)     // Catch:{ Exception -> 0x00e0 }
        L_0x00a9:
            if (r12 == 0) goto L_0x00b4
            int r0 = r21.length()     // Catch:{ Exception -> 0x00e0 }
            if (r0 != 0) goto L_0x00b2
            goto L_0x00b4
        L_0x00b2:
            r16 = 0
        L_0x00b4:
            if (r16 != 0) goto L_0x00eb
            r3 = 0
            r7 = 0
            r8 = 32
            r9 = 0
            r0 = r18
            r1 = r15
            r2 = r21
            r4 = r23
            r5 = r24
            boolean r0 = m14367n(r0, r1, r2, r3, r4, r5, r7, r8, r9)     // Catch:{ Exception -> 0x00e0 }
            if (r0 == 0) goto L_0x00cb
            return
        L_0x00cb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e0 }
            r0.<init>()     // Catch:{ Exception -> 0x00e0 }
            java.lang.String r1 = "Failed to click textContent: "
            r0.append(r1)     // Catch:{ Exception -> 0x00e0 }
            r0.append(r12)     // Catch:{ Exception -> 0x00e0 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00e0 }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18879r(r0)     // Catch:{ Exception -> 0x00e0 }
            goto L_0x00eb
        L_0x00e0:
            java.lang.String r0 = "Cannot perform click by id or text content (rootInActiveWindow is null). Please try rebooting your device."
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
            goto L_0x00eb
        L_0x00e6:
            java.lang.String r0 = "Cannot perform click by id or text content (could not detect current UI root node). Please try rebooting your device."
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
        L_0x00eb:
            if (r13 == 0) goto L_0x0112
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Attempting to click item, x="
            r0.append(r1)
            int r1 = r13.x
            r0.append(r1)
            java.lang.String r1 = ", y="
            r0.append(r1)
            int r1 = r13.y
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18879r(r0)
            r0 = r23
            r10.m14362i(r13, r0)
        L_0x0112:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.services.UIInteractionAccessibilityService.m14365l(java.lang.String, java.lang.String, java.lang.String, android.graphics.Point, boolean, long):void");
    }

    /* renamed from: m */
    private final boolean m14366m(AccessibilityNodeInfo accessibilityNodeInfo, String str, int i, boolean z, long j, int i2) {
        AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfo;
        int i3 = i2;
        if (i3 > 75) {
            return false;
        }
        if (str == null) {
            C4878b.m18868g("Click item with text failed (No text content specified)");
            return false;
        } else if (accessibilityNodeInfo2 == null) {
            C4878b.m18868g("Click item with text failed (node was null).");
            return false;
        } else {
            if (accessibilityNodeInfo.getText() != null) {
                if (m14371r(str, i, accessibilityNodeInfo.getText().toString(), false, j)) {
                    m14370q(this, accessibilityNodeInfo, z, 0, 4, (Object) null);
                    return true;
                }
            }
            int childCount = accessibilityNodeInfo.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                if (m14366m(accessibilityNodeInfo.getChild(i4), str, i, z, j, i3 + 1)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: n */
    static /* synthetic */ boolean m14367n(UIInteractionAccessibilityService uIInteractionAccessibilityService, AccessibilityNodeInfo accessibilityNodeInfo, String str, int i, boolean z, long j, int i2, int i3, Object obj) {
        return uIInteractionAccessibilityService.m14366m(accessibilityNodeInfo, str, i, z, j, (i3 & 32) != 0 ? 0 : i2);
    }

    /* renamed from: o */
    private final boolean m14368o(AccessibilityNodeInfo accessibilityNodeInfo, String str, boolean z, int i, List<String> list) {
        if (i > 75) {
            return false;
        }
        String viewIdResourceName = accessibilityNodeInfo.getViewIdResourceName();
        if (viewIdResourceName == null) {
            viewIdResourceName = "index:" + this.f9133d;
        }
        if (list.contains(viewIdResourceName)) {
            int i2 = 2;
            while (true) {
                if (!list.contains(viewIdResourceName + '$' + i2)) {
                    break;
                }
                i2++;
            }
            viewIdResourceName = viewIdResourceName + '$' + i2;
        }
        if (C13706o.m87924a(viewIdResourceName, str)) {
            m14370q(this, accessibilityNodeInfo, z, 0, 4, (Object) null);
            return true;
        }
        list.add(viewIdResourceName);
        this.f9133d++;
        int childCount = accessibilityNodeInfo.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i3);
            if (child != null) {
                if (m14368o(child, str, z, i + 1, list)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: p */
    private final void m14369p(AccessibilityNodeInfo accessibilityNodeInfo, boolean z, int i) {
        if (i <= 75 && accessibilityNodeInfo != null) {
            if (z) {
                if (accessibilityNodeInfo.isLongClickable()) {
                    accessibilityNodeInfo.performAction(32);
                    return;
                }
            } else if (accessibilityNodeInfo.isClickable() && accessibilityNodeInfo.getActionList().contains(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK)) {
                accessibilityNodeInfo.performAction(16);
                return;
            }
            m14369p(accessibilityNodeInfo.getParent(), z, i + 1);
        }
    }

    /* renamed from: q */
    static /* synthetic */ void m14370q(UIInteractionAccessibilityService uIInteractionAccessibilityService, AccessibilityNodeInfo accessibilityNodeInfo, boolean z, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        uIInteractionAccessibilityService.m14369p(accessibilityNodeInfo, z, i);
    }

    /* renamed from: r */
    private final boolean m14371r(String str, int i, String str2, boolean z, long j) {
        String str3;
        String t0 = C4023j0.m15760t0(this, str, (TriggerContextInfo) null, (Macro) null);
        if (i == 0) {
            str3 = C6460y1.m24790b(t0, z);
        } else {
            str3 = C6460y1.m24791c(t0, z);
        }
        C13706o.m87928e(str3, "regex");
        return new C15159j(str3).mo74468c(str2);
    }

    /* renamed from: s */
    private final void m14372s() {
        AccessibilityNodeInfo x = m14377x();
        if (x != null) {
            x.performAction(16384);
        } else {
            C4878b.m18868g("Copy failed (could not detect current UI focus)");
        }
    }

    /* renamed from: t */
    private final void m14373t() {
        AccessibilityNodeInfo x = m14377x();
        if (x != null) {
            x.performAction(65536);
        } else {
            C4878b.m18868g("Cut failed (could not detect current UI focus)");
        }
    }

    /* renamed from: u */
    private final AccessibilityNodeInfo m14374u(AccessibilityNodeInfo accessibilityNodeInfo, Point point, int i) {
        AccessibilityNodeInfo u;
        if (i > 75) {
            return null;
        }
        ArrayList f = C13614t.m87744f(accessibilityNodeInfo);
        int childCount = accessibilityNodeInfo.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i2);
            if (child != null) {
                Rect rect = new Rect();
                child.getBoundsInScreen(rect);
                if (rect.contains(point.x, point.y) && (u = m14374u(child, point, i + 1)) != null) {
                    f.add(u);
                }
            }
        }
        return m14350F(f);
    }

    /* renamed from: v */
    static /* synthetic */ AccessibilityNodeInfo m14375v(UIInteractionAccessibilityService uIInteractionAccessibilityService, AccessibilityNodeInfo accessibilityNodeInfo, Point point, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return uIInteractionAccessibilityService.m14374u(accessibilityNodeInfo, point, i);
    }

    /* renamed from: w */
    private final AccessibilityNodeInfo m14376w() {
        long currentTimeMillis = System.currentTimeMillis();
        int i = 0;
        AccessibilityNodeInfo accessibilityNodeInfo = null;
        while (accessibilityNodeInfo == null && i < 20) {
            try {
                accessibilityNodeInfo = getRootInActiveWindow();
            } catch (Exception unused) {
                accessibilityNodeInfo = null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("rootInActiveWindow attempt: ");
            i++;
            sb.append(i);
            sb.append(", time since start: ");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            C8151a.m33860a(sb.toString());
        }
        return accessibilityNodeInfo;
    }

    /* renamed from: x */
    private final AccessibilityNodeInfo m14377x() {
        return findFocus(1);
    }

    /* renamed from: z */
    private final void m14378z(UiInteractionConfiguration.Click click, int i, int i2, long j) {
        Point point;
        int i3;
        if (click.getXyPoint() != null) {
            int i4 = i;
            if (i4 == -1) {
                i4 = click.getXyPoint().x;
            }
            int i5 = i2;
            if (i5 != -1) {
                i3 = i5;
            } else {
                i3 = click.getXyPoint().y;
            }
            point = new Point(i4, i3);
        } else {
            point = null;
        }
        int clickOption = click.getClickOption();
        if (clickOption == 0) {
            m14361h(click.getLongClick());
        } else if (clickOption == 1) {
            m14367n(this, m14376w(), click.getTextContent(), click.getTextMatchOption(), click.getLongClick(), j, 0, 32, (Object) null);
        } else if (clickOption == 2) {
            m14362i(point, click.getLongClick());
        } else if (clickOption == 3) {
            m14365l(click.getViewId(), click.getContentDescription(), click.getTextContent(), point, click.getLongClick(), j);
        } else if (clickOption == 4) {
            m14365l(click.getViewId(), click.getContentDescription(), click.getTextContent(), point, click.getLongClick(), j);
        }
    }

    /* renamed from: J */
    public final void mo26801J() {
        AccessibilityNodeInfo w = m14376w();
        this.f9134f = 0;
        if (w == null) {
            C4878b.m18868g("readScreenContents failed (could not detect current UI root node). Please try rebooting your device.");
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        m14359f(w, hashMap, arrayList);
        mo26808y().mo40783b(hashMap);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:10|(2:12|13)|14|15|(9:19|(1:21)|22|(1:24)(1:25)|26|(1:30)|31|(3:33|(1:35)(1:36)|37)(1:38)|39)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002e */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0042 A[Catch:{ Exception -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0058 A[Catch:{ Exception -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005f A[Catch:{ Exception -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0078 A[Catch:{ Exception -> 0x00d5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008b A[Catch:{ Exception -> 0x00d5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAccessibilityEvent(android.view.accessibility.AccessibilityEvent r25) {
        /*
            r24 = this;
            r8 = r24
            r9 = r25
            java.lang.String r0 = "event"
            kotlin.jvm.internal.C13706o.m87929f(r9, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r10 = "clipboardDetector"
            r11 = 29
            if (r0 < r11) goto L_0x0020
            j1.a r0 = r8.f9131a
            if (r0 != 0) goto L_0x0019
            kotlin.jvm.internal.C13706o.m87945v(r10)
            r0 = 0
        L_0x0019:
            int r1 = r25.getEventType()
            r0.mo37552a(r1)
        L_0x0020:
            r13 = 2
            boolean r0 = f9129p     // Catch:{ Exception -> 0x00d5 }
            if (r0 == 0) goto L_0x00d6
            android.view.accessibility.AccessibilityNodeInfo r0 = r25.getSource()     // Catch:{ Exception -> 0x00d5 }
            if (r0 == 0) goto L_0x002e
            r0.refresh()     // Catch:{ Exception -> 0x002e }
        L_0x002e:
            int r1 = r25.getEventType()     // Catch:{ Exception -> 0x00d5 }
            r2 = 1
            if (r1 == r2) goto L_0x003b
            int r1 = r25.getEventType()     // Catch:{ Exception -> 0x00d5 }
            if (r1 != r13) goto L_0x00d6
        L_0x003b:
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch:{ Exception -> 0x00d5 }
            r1.<init>()     // Catch:{ Exception -> 0x00d5 }
            if (r0 == 0) goto L_0x0045
            r0.getBoundsInScreen(r1)     // Catch:{ Exception -> 0x00d5 }
        L_0x0045:
            android.graphics.Point r0 = new android.graphics.Point     // Catch:{ Exception -> 0x00d5 }
            int r2 = r1.centerX()     // Catch:{ Exception -> 0x00d5 }
            int r1 = r1.centerY()     // Catch:{ Exception -> 0x00d5 }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x00d5 }
            android.view.accessibility.AccessibilityNodeInfo r1 = r25.getSource()     // Catch:{ Exception -> 0x00d5 }
            if (r1 == 0) goto L_0x005f
            java.lang.String r1 = r1.getViewIdResourceName()     // Catch:{ Exception -> 0x00d5 }
            r23 = r1
            goto L_0x0061
        L_0x005f:
            r23 = 0
        L_0x0061:
            java.lang.CharSequence r1 = r25.getContentDescription()     // Catch:{ Exception -> 0x00d5 }
            if (r1 == 0) goto L_0x006d
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00d5 }
            if (r1 != 0) goto L_0x006f
        L_0x006d:
            java.lang.String r1 = ""
        L_0x006f:
            r22 = r1
            java.util.List r1 = r25.getText()     // Catch:{ Exception -> 0x00d5 }
            r7 = 0
            if (r1 == 0) goto L_0x008b
            int r2 = r1.size()     // Catch:{ Exception -> 0x00d5 }
            if (r2 <= 0) goto L_0x0087
            java.lang.Object r1 = r1.get(r7)     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00d5 }
            goto L_0x0088
        L_0x0087:
            r1 = 0
        L_0x0088:
            r20 = r1
            goto L_0x008d
        L_0x008b:
            r20 = 0
        L_0x008d:
            com.arlosoft.macrodroid.action.UiInteractionConfiguration$Click r6 = new com.arlosoft.macrodroid.action.UiInteractionConfiguration$Click     // Catch:{ Exception -> 0x00d5 }
            r15 = 3
            r16 = 0
            r18 = 0
            r19 = 0
            r21 = 1
            r14 = r6
            r17 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x00d5 }
            com.arlosoft.macrodroid.utils.C6457x1.m24786b(r8, r7)     // Catch:{ Exception -> 0x00d5 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d5 }
            r0.<init>()     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r1 = "id: "
            r0.append(r1)     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r1 = r6.describe()     // Catch:{ Exception -> 0x00d5 }
            r0.append(r1)     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x00d5 }
            r2 = -1
            r3 = 2131231510(0x7f080316, float:1.8079103E38)
            r0 = 2131099690(0x7f06002a, float:1.781174E38)
            int r4 = androidx.core.content.ContextCompat.getColor(r8, r0)     // Catch:{ Exception -> 0x00d5 }
            r5 = 1
            r14 = 1
            r15 = 0
            r0 = r24
            r12 = r6
            r6 = r14
            r14 = 0
            r7 = r15
            p101h3.C7375a.m30478a(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00d5 }
            io.reactivex.subjects.c<com.arlosoft.macrodroid.action.UiInteractionConfiguration$Click> r0 = f9130s     // Catch:{ Exception -> 0x00d5 }
            r0.onNext(r12)     // Catch:{ Exception -> 0x00d5 }
            f9129p = r14     // Catch:{ Exception -> 0x00d5 }
            goto L_0x00d6
        L_0x00d5:
        L_0x00d6:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r11) goto L_0x00ee
            j1.a r0 = r8.f9131a
            if (r0 != 0) goto L_0x00e2
            kotlin.jvm.internal.C13706o.m87945v(r10)
            r0 = 0
        L_0x00e2:
            r1 = 0
            boolean r0 = p111j1.C7435a.m30835f(r0, r9, r1, r13, r1)
            if (r0 == 0) goto L_0x00ee
            com.arlosoft.macrodroid.clipboard.ClipboardReadActivity$a r0 = com.arlosoft.macrodroid.clipboard.ClipboardReadActivity.f10267p
            r0.mo27654c(r8)
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.services.UIInteractionAccessibilityService.onAccessibilityEvent(android.view.accessibility.AccessibilityEvent):void");
    }

    public void onCreate() {
        super.onCreate();
        C7438b bVar = C7438b.f18214a;
        Context applicationContext = getApplicationContext();
        C13706o.m87928e(applicationContext, "applicationContext");
        this.f9131a = new C7435a(bVar.mo37570b(applicationContext));
    }

    public void onDestroy() {
        super.onDestroy();
        f9128o = false;
    }

    public void onInterrupt() {
    }

    /* access modifiers changed from: protected */
    public void onServiceConnected() {
        super.onServiceConnected();
        C4878b.m18873l("UI Interaction accessibility service connected");
        f9128o = true;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        Bundle extras;
        if (intent == null || (extras = intent.getExtras()) == null) {
            return 2;
        }
        boolean z = extras.getBoolean("captureScreen");
        boolean z2 = extras.getBoolean("uiQuery");
        if (z) {
            mo26801J();
            return 2;
        } else if (z2) {
            m14348D();
            return 2;
        } else {
            UiInteractionConfiguration uiInteractionConfiguration = (UiInteractionConfiguration) extras.getParcelable("uiInteractionConfig");
            TriggerContextInfo triggerContextInfo = (TriggerContextInfo) extras.getParcelable("triggerContextInfo");
            long j = extras.getLong("xVariableValue", -1);
            long j2 = extras.getLong("yVariableValue", -1);
            long j3 = extras.getLong("macroGuid", -1);
            long j4 = extras.getLong("xStartVariableValue", -1);
            long j5 = extras.getLong("yStartVariableValue", -1);
            long j6 = extras.getLong("xEndVariableValue", -1);
            long j7 = extras.getLong("yEndVariableValue", -1);
            long[] longArray = extras.getLongArray("sequenceXValues");
            if (longArray == null) {
                longArray = new long[0];
            }
            C13706o.m87928e(longArray, "it.getLongArray(EXTRA_GE…_VALUES) ?: longArrayOf()");
            long[] longArray2 = extras.getLongArray("sequenceYValues");
            if (longArray2 == null) {
                longArray2 = new long[0];
            }
            long[] jArr = longArray2;
            C13706o.m87928e(jArr, "it.getLongArray(EXTRA_GE…_VALUES) ?: longArrayOf()");
            long j8 = j4;
            long j9 = extras.getLong("durationVariableValue", -1);
            if (uiInteractionConfiguration instanceof UiInteractionConfiguration.Click) {
                m14378z((UiInteractionConfiguration.Click) uiInteractionConfiguration, (int) j, (int) j2, j3);
                return 2;
            } else if (uiInteractionConfiguration instanceof UiInteractionConfiguration.Copy) {
                m14372s();
                return 2;
            } else if (uiInteractionConfiguration instanceof UiInteractionConfiguration.Cut) {
                m14373t();
                return 2;
            } else if (uiInteractionConfiguration instanceof UiInteractionConfiguration.ClearSelection) {
                m14360g();
                return 2;
            } else if (uiInteractionConfiguration instanceof UiInteractionConfiguration.Paste) {
                m14347C((UiInteractionConfiguration.Paste) uiInteractionConfiguration, triggerContextInfo, j3);
                return 2;
            } else if (uiInteractionConfiguration instanceof UiInteractionConfiguration.Gesture) {
                m14345A(j8, j5, j6, j7, j9);
                return 2;
            } else if (uiInteractionConfiguration instanceof UiInteractionConfiguration.GestureSequence) {
                m14346B(j8, j5, j9, longArray, jArr, j3);
                return 2;
            } else if (!(uiInteractionConfiguration instanceof UiInteractionConfiguration.PressBack)) {
                return 2;
            } else {
                performGlobalAction(1);
                return 2;
            }
        }
    }

    /* renamed from: y */
    public final C10182a mo26808y() {
        C10182a aVar = this.f9132c;
        if (aVar != null) {
            return aVar;
        }
        C13706o.m87945v("screenContentsCache");
        return null;
    }
}
