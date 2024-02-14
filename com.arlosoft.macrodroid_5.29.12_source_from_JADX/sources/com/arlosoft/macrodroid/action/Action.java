package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import androidx.annotation.Nullable;
import com.arlosoft.macrodroid.C17530R$drawable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4031k;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.constraint.Constraint;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.editscreen.EditMacroActivity;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.IncomingSMSTrigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6416p0;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import org.apache.commons.p353io.IOUtils;
import p057a2.C2212a;
import p099h1.C7364d;
import p128m0.C7690a;
import p128m0.C7692a0;
import p128m0.C7694a1;
import p128m0.C7695a2;
import p128m0.C7696a3;
import p128m0.C7697a4;
import p128m0.C7698a5;
import p128m0.C7699b;
import p128m0.C7701b0;
import p128m0.C7703b1;
import p128m0.C7705b2;
import p128m0.C7707b3;
import p128m0.C7708b4;
import p128m0.C7709b5;
import p128m0.C7711c;
import p128m0.C7712c0;
import p128m0.C7714c1;
import p128m0.C7716c2;
import p128m0.C7717c3;
import p128m0.C7718c4;
import p128m0.C7719c5;
import p128m0.C7720d;
import p128m0.C7721d0;
import p128m0.C7722d1;
import p128m0.C7724d2;
import p128m0.C7725d3;
import p128m0.C7726d4;
import p128m0.C7727d5;
import p128m0.C7728e;
import p128m0.C7729e0;
import p128m0.C7731e1;
import p128m0.C7732e2;
import p128m0.C7733e3;
import p128m0.C7734e4;
import p128m0.C7735e5;
import p128m0.C7737f;
import p128m0.C7738f0;
import p128m0.C7739f1;
import p128m0.C7740f2;
import p128m0.C7741f3;
import p128m0.C7742f4;
import p128m0.C7743f5;
import p128m0.C7745g;
import p128m0.C7746g0;
import p128m0.C7747g1;
import p128m0.C7748g2;
import p128m0.C7750g3;
import p128m0.C7751g4;
import p128m0.C7752g5;
import p128m0.C7753h;
import p128m0.C7755h1;
import p128m0.C7756h2;
import p128m0.C7757h3;
import p128m0.C7758h4;
import p128m0.C7759i;
import p128m0.C7760i0;
import p128m0.C7762i1;
import p128m0.C7763i2;
import p128m0.C7764i3;
import p128m0.C7765i4;
import p128m0.C7767j;
import p128m0.C7769j0;
import p128m0.C7770j1;
import p128m0.C7772j2;
import p128m0.C7774j3;
import p128m0.C7775j4;
import p128m0.C7776k;
import p128m0.C7778k0;
import p128m0.C7779k1;
import p128m0.C7780k2;
import p128m0.C7781k3;
import p128m0.C7783k4;
import p128m0.C7784l;
import p128m0.C7785l0;
import p128m0.C7787l1;
import p128m0.C7789l2;
import p128m0.C7790l3;
import p128m0.C7791l4;
import p128m0.C7792m;
import p128m0.C7793m0;
import p128m0.C7794m1;
import p128m0.C7795m2;
import p128m0.C7796m3;
import p128m0.C7797m4;
import p128m0.C7798n;
import p128m0.C7799n0;
import p128m0.C7800n1;
import p128m0.C7801n2;
import p128m0.C7802n3;
import p128m0.C7803n4;
import p128m0.C7805o;
import p128m0.C7807o0;
import p128m0.C7809o1;
import p128m0.C7810o2;
import p128m0.C7811o3;
import p128m0.C7812o4;
import p128m0.C7813p;
import p128m0.C7815p1;
import p128m0.C7817p2;
import p128m0.C7818p3;
import p128m0.C7819p4;
import p128m0.C7820q;
import p128m0.C7822q1;
import p128m0.C7824q2;
import p128m0.C7825q3;
import p128m0.C7826q4;
import p128m0.C7827r;
import p128m0.C7831r1;
import p128m0.C7832r2;
import p128m0.C7834r3;
import p128m0.C7835r4;
import p128m0.C7836s;
import p128m0.C7837s0;
import p128m0.C7839s1;
import p128m0.C7840s2;
import p128m0.C7842s3;
import p128m0.C7843s4;
import p128m0.C7844t;
import p128m0.C7846t1;
import p128m0.C7847t2;
import p128m0.C7848t3;
import p128m0.C7849t4;
import p128m0.C7850u;
import p128m0.C7853u1;
import p128m0.C7854u2;
import p128m0.C7855u3;
import p128m0.C7856u4;
import p128m0.C7857v;
import p128m0.C7858v0;
import p128m0.C7860v1;
import p128m0.C7861v2;
import p128m0.C7862v3;
import p128m0.C7863v4;
import p128m0.C7865w;
import p128m0.C7866w0;
import p128m0.C7867w1;
import p128m0.C7868w2;
import p128m0.C7870w3;
import p128m0.C7871w4;
import p128m0.C7872x;
import p128m0.C7873x0;
import p128m0.C7875x1;
import p128m0.C7876x2;
import p128m0.C7877x3;
import p128m0.C7880y;
import p128m0.C7881y0;
import p128m0.C7882y1;
import p128m0.C7883y2;
import p128m0.C7884y3;
import p128m0.C7885y4;
import p128m0.C7887z;
import p128m0.C7888z0;
import p128m0.C7889z1;
import p128m0.C7890z2;
import p128m0.C7891z3;
import p128m0.C7892z4;
import p135n1.C7967d;
import p319lc.C15626c;

public abstract class Action extends SelectableItem {

    /* renamed from: c */
    public static final Object f7123c = new Object();

    /* renamed from: a */
    transient long f7124a;
    private transient boolean enabled;
    private transient long m_parentSIGUID;
    private transient long m_parentSIGUIDForInsert;

    public Action() {
    }

    /* renamed from: P2 */
    private static void m9591P2(C4001c1 c1Var, List<C4001c1> list) {
        if (c1Var.mo27887a()) {
            list.add(c1Var);
        }
    }

    /* renamed from: Q2 */
    private static void m9592Q2(C4001c1 c1Var, List<C4001c1> list) {
        if (c1Var.mo27887a()) {
            list.add(c1Var);
        }
    }

    /* renamed from: S2 */
    public static int m9593S2(List<Action> list) {
        Stack stack = new Stack();
        HashMap hashMap = new HashMap();
        Stack stack2 = new Stack();
        int i = 0;
        while (i < list.size()) {
            try {
                Action action = list.get(i);
                if (action instanceof ParentAction) {
                    stack.push((ParentAction) action);
                    if (action instanceof IfConditionAction) {
                        hashMap.put((IfConditionAction) action, new ArrayList());
                        stack2.push((IfConditionAction) action);
                    }
                } else if (action instanceof EndLoopAction) {
                    if (!(stack.pop() instanceof LoopAction)) {
                        return i;
                    }
                } else if (action instanceof EndIfAction) {
                    if (!(stack.pop() instanceof IfConditionAction)) {
                        return i;
                    }
                    stack2.pop();
                } else if (!(action instanceof ElseParentAction)) {
                    continue;
                } else if (!(stack.peek() instanceof IfConditionAction)) {
                    return i;
                } else {
                    List list2 = (List) hashMap.get(stack2.peek());
                    list2.add((ElseParentAction) action);
                    for (int i2 = 0; i2 < list2.size() - 1; i2++) {
                        if (list2.get(i2) instanceof ElseAction) {
                            return i;
                        }
                    }
                    continue;
                }
                i++;
            } catch (EmptyStackException unused) {
                return i;
            }
        }
        if (stack.size() > 0) {
            return 0;
        }
        return -1;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(26:1|2|(1:4)|5|(2:7|(1:11))|12|(1:14)|15|(1:17)|18|19|20|21|22|(1:24)|25|(1:27)|28|(1:30)|31|(1:33)|34|(1:36)|37|(1:39)|40) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x03d2 */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x03d8 A[Catch:{ IllegalStateException -> 0x04a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x03eb A[Catch:{ IllegalStateException -> 0x04a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0400 A[Catch:{ IllegalStateException -> 0x04a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0428 A[Catch:{ IllegalStateException -> 0x04a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x045f A[Catch:{ IllegalStateException -> 0x04a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0487 A[Catch:{ IllegalStateException -> 0x04a2 }] */
    /* renamed from: Y2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.arlosoft.macrodroid.common.C4001c1> m9594Y2(android.content.Context r2, com.arlosoft.macrodroid.macro.Macro r3, boolean r4) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.arlosoft.macrodroid.common.c1 r1 = p128m0.C7734e4.m32261u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r1, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r1 = p128m0.C7698a5.m32102u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r1, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r1 = p128m0.C7742f4.m32301u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r1, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            android.bluetooth.BluetoothAdapter r1 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()     // Catch:{ IllegalStateException -> 0x04a2 }
            if (r1 == 0) goto L_0x0027
            com.arlosoft.macrodroid.common.c1 r1 = p128m0.C7757h3.m32373u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r1, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
        L_0x0027:
            java.lang.String r1 = "phone"
            java.lang.Object r1 = r2.getSystemService(r1)     // Catch:{ IllegalStateException -> 0x04a2 }
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch:{ IllegalStateException -> 0x04a2 }
            int r1 = r1.getPhoneType()     // Catch:{ IllegalStateException -> 0x04a2 }
            if (r1 == 0) goto L_0x0069
            com.arlosoft.macrodroid.common.c1 r1 = p128m0.C7717c3.m32176u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r1, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r1 = p128m0.C7724d2.m32208u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r1, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r1 = p128m0.C7783k4.m32497u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r1, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r1 = p128m0.C7820q.m32685u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r1, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r1 = p128m0.C7753h.m32352u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r1, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            if (r4 != 0) goto L_0x0062
            java.lang.Class<com.arlosoft.macrodroid.triggers.IncomingSMSTrigger> r4 = com.arlosoft.macrodroid.triggers.IncomingSMSTrigger.class
            boolean r4 = r3.hasOnlyTrigger(r4)     // Catch:{ IllegalStateException -> 0x04a2 }
            if (r4 == 0) goto L_0x0069
        L_0x0062:
            com.arlosoft.macrodroid.common.c1 r4 = p128m0.C7755h1.m32363u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r4, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
        L_0x0069:
            com.arlosoft.macrodroid.common.c1 r4 = p128m0.C7817p2.m32665u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r4, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r4 = p128m0.C7846t1.m32806u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r4, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r4 = p128m0.C7726d4.m32218u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r4, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r4 = p128m0.C7740f2.m32291u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r4, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r4 = p128m0.C7891z3.m33026u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r4, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r4 = p128m0.C7701b0.m32115v()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9592Q2(r4, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r4 = p128m0.C7743f5.m32307v()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9592Q2(r4, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r4 = p128m0.C7848t3.m32817u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r4, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r4 = p128m0.C7775j4.m32460u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r4, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r4 = p128m0.C7789l2.m32523u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r4, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r4 = p128m0.C7770j1.m32440v()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r4, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r4 = p128m0.C7697a4.m32097u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r4, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r4 = p128m0.C7835r4.m32754u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r4, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r4 = p128m0.C7751g4.m32342u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r4, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r4 = p128m0.C7811o3.m32637u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r4, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r4 = p128m0.C7854u2.m32846u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r4, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r4 = p128m0.C7721d0.m32196u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r4, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r4 = p128m0.C7892z4.m33031u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r4, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r4 = p128m0.C7772j2.m32447v()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9592Q2(r4, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r4 = p128m0.C7785l0.m32509v()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9592Q2(r4, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r4 = p128m0.C7750g3.m32337u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r4, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r4 = p128m0.C7888z0.m33008u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r4, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r4 = p128m0.C7801n2.m32592u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r4, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r4 = p128m0.C7807o0.m32621v()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r4, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r4 = p128m0.C7837s0.m32765v()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r4, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r4 = p128m0.C7703b1.m32122v()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r4, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r4 = p128m0.C7714c1.m32165v()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r4, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r4 = p128m0.C7873x0.m32940v()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r4, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            boolean r4 = r3 instanceof com.arlosoft.macrodroid.actionblock.data.ActionBlock     // Catch:{ IllegalStateException -> 0x04a2 }
            if (r4 != 0) goto L_0x0138
            com.arlosoft.macrodroid.common.c1 r4 = p128m0.C7735e5.m32267v()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9592Q2(r4, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
        L_0x0138:
            com.arlosoft.macrodroid.common.c1 r4 = p128m0.C7699b.m32108v()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r4, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            boolean r3 = r3 instanceof com.arlosoft.macrodroid.actionblock.data.ActionBlock     // Catch:{ IllegalStateException -> 0x04a2 }
            if (r3 == 0) goto L_0x014a
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7858v0.m32869v()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
        L_0x014a:
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7850u.m32828v()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9592Q2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7827r.m32724v()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9592Q2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7764i3.m32414u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7796m3.m32563u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7718c4.m32181u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7765i4.m32420v()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7876x2.m32951u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7741f3.m32296u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7857v.m32863u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7885y4.m32996v()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9592Q2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7883y2.m32983u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7860v1.m32875u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7719c5.m32186u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7709b5.m32146v()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7696a3.m32092u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7831r1.m32737u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7763i2.m32409u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7867w1.m32909u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7720d.m32191u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7732e2.m32251u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7839s1.m32771u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7802n3.m32598u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7805o.m32612v()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7739f1.m32286u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7731e1.m32246u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7834r3.m32749u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7890z2.m33021u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7708b4.m32140u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7711c.m32152u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7882y1.m32978u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7836s.m32759u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7793m0.m32545u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7727d5.m32223u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7747g1.m32324u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7840s2.m32777v()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9592Q2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7716c2.m32171u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7842s3.m32783u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7705b2.m32129v()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7887z.m33003u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7745g.m32314u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7756h2.m32368u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7780k2.m32483u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7881y0.m32973u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7792m.m32540u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7769j0.m32434u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7849t4.m32822u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7856u4.m32858u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7795m2.m32558u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7862v3.m32885u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9592Q2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7875x1.m32946u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7798n.m32574u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7733e3.m32256u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7870w3.m32922u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7762i1.m32401u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7748g2.m32330v()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7707b3.m32135u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7694a1.m32081u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7824q2.m32703u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7861v2.m32880u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7877x3.m32956u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7738f0.m32280u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7760i0.m32392v()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7844t.m32795u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7868w2.m32915v()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9592Q2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7866w0.m32903u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7746g0.m32319u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7737f.m32273u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7758h4.m32378u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7884y3.m32989u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7880y.m32968u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7752g5.m32347u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7832r2.m32743v()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7791l4.m32535u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7794m1.m32550u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7813p.m32647u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7778k0.m32472u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7695a2.m32087u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7818p3.m32670u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7797m4.m32569u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7826q4.m32718u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7815p1.m32659v()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7822q1.m32696v()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7692a0.m32075v()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            m0.v4$a r3 = p128m0.C7863v4.f18921j     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = r3.mo37774a()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7728e.m32228u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7803n4.m32604v()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7729e0.m32237v()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7722d1.m32202v()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7781k3.m32489v()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7767j.m32427v()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            android.content.ContentResolver r3 = r2.getContentResolver()     // Catch:{ SettingNotFoundException -> 0x03d2 }
            java.lang.String r4 = "accessibility_display_inversion_enabled"
            android.provider.Settings.Secure.getInt(r3, r4)     // Catch:{ SettingNotFoundException -> 0x03d2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7800n1.m32584u()     // Catch:{ SettingNotFoundException -> 0x03d2 }
            m9591P2(r3, r0)     // Catch:{ SettingNotFoundException -> 0x03d2 }
        L_0x03d2:
            boolean r3 = com.arlosoft.macrodroid.common.C4031k.m15911k()     // Catch:{ IllegalStateException -> 0x04a2 }
            if (r3 == 0) goto L_0x03df
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7810o2.m32632u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
        L_0x03df:
            android.content.pm.PackageManager r3 = r2.getPackageManager()     // Catch:{ IllegalStateException -> 0x04a2 }
            java.lang.String r4 = "android.hardware.camera.flash"
            boolean r3 = r3.hasSystemFeature(r4)     // Catch:{ IllegalStateException -> 0x04a2 }
            if (r3 == 0) goto L_0x03f2
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7784l.m32502u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
        L_0x03f2:
            com.arlosoft.macrodroid.macro.n r3 = com.arlosoft.macrodroid.macro.C4934n.m18998M()     // Catch:{ IllegalStateException -> 0x04a2 }
            java.util.List r3 = r3.mo29710z()     // Catch:{ IllegalStateException -> 0x04a2 }
            int r3 = r3.size()     // Catch:{ IllegalStateException -> 0x04a2 }
            if (r3 <= 0) goto L_0x0407
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7799n0.m32579u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
        L_0x0407:
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7690a.m32066v()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7759i.m32383u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7825q3.m32709u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            android.content.pm.PackageManager r3 = r2.getPackageManager()     // Catch:{ IllegalStateException -> 0x04a2 }
            java.lang.String r4 = "android.hardware.nfc"
            boolean r3 = r3.hasSystemFeature(r4)     // Catch:{ IllegalStateException -> 0x04a2 }
            if (r3 == 0) goto L_0x042f
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7855u3.m32851u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
        L_0x042f:
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7774j3.m32453u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7847t2.m32811u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7865w.m32897u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7790l3.m32529u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7872x.m32933u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7819p4.m32679u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            boolean r3 = com.arlosoft.macrodroid.settings.C5163j2.m20118b(r2)     // Catch:{ IllegalStateException -> 0x04a2 }
            if (r3 == 0) goto L_0x046d
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7853u1.m32839u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7843s4.m32788u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
        L_0x046d:
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7871w4.m32927u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7725d3.m32213u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
            android.content.pm.PackageManager r3 = r2.getPackageManager()     // Catch:{ IllegalStateException -> 0x04a2 }
            java.lang.String r4 = "android.hardware.camera"
            boolean r3 = r3.hasSystemFeature(r4)     // Catch:{ IllegalStateException -> 0x04a2 }
            if (r3 == 0) goto L_0x048e
            com.arlosoft.macrodroid.common.c1 r3 = p128m0.C7812o4.m32642u()     // Catch:{ IllegalStateException -> 0x04a2 }
            m9591P2(r3, r0)     // Catch:{ IllegalStateException -> 0x04a2 }
        L_0x048e:
            java.util.Locale r3 = com.arlosoft.macrodroid.settings.C5163j2.m19963F0(r2)     // Catch:{ IllegalStateException -> 0x04a2 }
            java.text.Collator r3 = java.text.Collator.getInstance(r3)     // Catch:{ IllegalStateException -> 0x04a2 }
            r4 = 0
            r3.setStrength(r4)     // Catch:{ IllegalStateException -> 0x04a2 }
            com.arlosoft.macrodroid.action.e r4 = new com.arlosoft.macrodroid.action.e     // Catch:{ IllegalStateException -> 0x04a2 }
            r4.<init>(r3, r2)     // Catch:{ IllegalStateException -> 0x04a2 }
            java.util.Collections.sort(r0, r4)     // Catch:{ IllegalStateException -> 0x04a2 }
        L_0x04a2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.Action.m9594Y2(android.content.Context, com.arlosoft.macrodroid.macro.Macro, boolean):java.util.List");
    }

    /* renamed from: Z2 */
    public static List<C7364d> m9595Z2(Context context, Macro macro, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList2 = new ArrayList();
        m9592Q2(C7725d3.m32213u(), arrayList2);
        m9592Q2(C7745g.m32314u(), arrayList2);
        m9592Q2(C7750g3.m32337u(), arrayList2);
        if (BluetoothAdapter.getDefaultAdapter() != null) {
            m9592Q2(C7757h3.m32373u(), arrayList2);
        }
        m9592Q2(C7796m3.m32563u(), arrayList2);
        m9592Q2(C7707b3.m32135u(), arrayList2);
        m9592Q2(C7774j3.m32453u(), arrayList2);
        if (context.getPackageManager().hasSystemFeature("android.hardware.nfc")) {
            m9592Q2(C7855u3.m32851u(), arrayList2);
        }
        m9592Q2(C7797m4.m32569u(), arrayList2);
        m9592Q2(C7871w4.m32927u(), arrayList2);
        m9592Q2(C7742f4.m32301u(), arrayList2);
        if (C4031k.m15911k()) {
            m9592Q2(C7810o2.m32632u(), arrayList2);
        }
        m9592Q2(C7692a0.m32075v(), arrayList2);
        m9592Q2(C7767j.m32427v(), arrayList2);
        arrayList.add(new C7364d(context.getString(C17541R$string.item_category_connectivity), C17530R$drawable.ic_router_wireless_white_24dp, arrayList2));
        ArrayList arrayList3 = new ArrayList();
        if (packageManager.hasSystemFeature("android.hardware.camera")) {
            m9592Q2(C7812o4.m32642u(), arrayList3);
        }
        m9592Q2(C7819p4.m32679u(), arrayList3);
        m9592Q2(C7892z4.m33031u(), arrayList3);
        m9592Q2(C7772j2.m32447v(), arrayList3);
        m9592Q2(C7785l0.m32509v(), arrayList3);
        arrayList.add(new C7364d(context.getString(C17541R$string.item_category_camera_photo), C17530R$drawable.ic_camera_white_24dp, arrayList3));
        if (((TelephonyManager) context.getSystemService("phone")).getPhoneType() != 0) {
            ArrayList arrayList4 = new ArrayList();
            m9592Q2(C7724d2.m32208u(), arrayList4);
            m9592Q2(C7753h.m32352u(), arrayList4);
            m9592Q2(C7861v2.m32880u(), arrayList4);
            m9592Q2(C7820q.m32685u(), arrayList4);
            if (z || macro.hasOnlyTrigger(IncomingSMSTrigger.class)) {
                m9592Q2(C7755h1.m32363u(), arrayList4);
            }
            m9592Q2(C7756h2.m32368u(), arrayList4);
            m9592Q2(C7891z3.m33026u(), arrayList4);
            m9592Q2(C7701b0.m32115v(), arrayList4);
            m9592Q2(C7743f5.m32307v(), arrayList4);
            arrayList.add(new C7364d(context.getString(C17541R$string.item_category_phone), C17530R$drawable.ic_phone_classic_white_24dp, arrayList4));
        }
        ArrayList arrayList5 = new ArrayList();
        m9592Q2(C7717c3.m32176u(), arrayList5);
        m9592Q2(C7696a3.m32092u(), arrayList5);
        m9592Q2(C7856u4.m32858u(), arrayList5);
        m9592Q2(C7849t4.m32822u(), arrayList5);
        arrayList.add(new C7364d(context.getString(C17541R$string.item_category_messaging), C17530R$drawable.ic_at_white_24dp, arrayList5));
        ArrayList arrayList6 = new ArrayList();
        m9592Q2(C7883y2.m32983u(), arrayList6);
        m9592Q2(C7769j0.m32434u(), arrayList6);
        m9592Q2(C7697a4.m32097u(), arrayList6);
        m9592Q2(C7764i3.m32414u(), arrayList6);
        m9592Q2(C7831r1.m32737u(), arrayList6);
        m9592Q2(C7747g1.m32324u(), arrayList6);
        m9592Q2(C7840s2.m32777v(), arrayList6);
        arrayList.add(new C7364d(context.getString(C17541R$string.item_category_screen), C17530R$drawable.ic_account_white_24dp, arrayList6));
        ArrayList arrayList7 = new ArrayList();
        m9592Q2(C7870w3.m32922u(), arrayList7);
        m9592Q2(C7720d.m32191u(), arrayList7);
        m9592Q2(C7740f2.m32291u(), arrayList7);
        m9592Q2(C7844t.m32795u(), arrayList7);
        m9592Q2(C7868w2.m32915v(), arrayList7);
        m9592Q2(C7872x.m32933u(), arrayList7);
        m9592Q2(C7835r4.m32754u(), arrayList7);
        m9592Q2(C7732e2.m32251u(), arrayList7);
        m9592Q2(C7762i1.m32401u(), arrayList7);
        m9592Q2(C7748g2.m32330v(), arrayList7);
        arrayList.add(new C7364d(context.getString(C17541R$string.item_category_notification), C17530R$drawable.ic_alert_box_white_24dp, arrayList7));
        ArrayList arrayList8 = new ArrayList();
        m9592Q2(C7726d4.m32218u(), arrayList8);
        m9592Q2(C7727d5.m32223u(), arrayList8);
        m9592Q2(C7783k4.m32497u(), arrayList8);
        m9592Q2(C7877x3.m32956u(), arrayList8);
        m9591P2(C7718c4.m32181u(), arrayList8);
        m9591P2(C7765i4.m32420v(), arrayList8);
        arrayList.add(new C7364d(context.getString(C17541R$string.item_category_volume), C17530R$drawable.ic_speaker_white_24dp, arrayList8));
        ArrayList arrayList9 = new ArrayList();
        m9592Q2(C7791l4.m32535u(), arrayList9);
        m9592Q2(C7733e3.m32256u(), arrayList9);
        m9592Q2(C7876x2.m32951u(), arrayList9);
        arrayList.add(new C7364d(context.getString(C17541R$string.item_category_date_time), C17530R$drawable.ic_calendar_clock_white_24dp, arrayList9));
        ArrayList arrayList10 = new ArrayList();
        m9592Q2(C7690a.m32066v(), arrayList10);
        m9592Q2(C7759i.m32383u(), arrayList10);
        m9592Q2(C7798n.m32574u(), arrayList10);
        m9592Q2(C7738f0.m32280u(), arrayList10);
        m9592Q2(C7760i0.m32392v(), arrayList10);
        m9592Q2(C7794m1.m32550u(), arrayList10);
        m9592Q2(C7734e4.m32261u(), arrayList10);
        m9592Q2(C7884y3.m32989u(), arrayList10);
        m9592Q2(C7818p3.m32670u(), arrayList10);
        m9592Q2(C7802n3.m32598u(), arrayList10);
        m9592Q2(C7805o.m32612v(), arrayList10);
        m9592Q2(C7811o3.m32637u(), arrayList10);
        m9592Q2(C7741f3.m32296u(), arrayList10);
        m9592Q2(C7890z2.m33021u(), arrayList10);
        m9592Q2(C7728e.m32228u(), arrayList10);
        m9591P2(C7803n4.m32604v(), arrayList10);
        m9591P2(C7729e0.m32237v(), arrayList10);
        m9591P2(C7722d1.m32202v(), arrayList10);
        m9591P2(C7781k3.m32489v(), arrayList10);
        try {
            Settings.Secure.getInt(context.getContentResolver(), "accessibility_display_inversion_enabled");
            m9592Q2(C7800n1.m32584u(), arrayList10);
        } catch (Settings.SettingNotFoundException unused) {
        }
        arrayList.add(new C7364d(context.getString(C17541R$string.item_category_device_settings), C17530R$drawable.ic_settings_applications_white_24dp, arrayList10));
        ArrayList arrayList11 = new ArrayList();
        m9592Q2(C7698a5.m32102u(), arrayList11);
        m9592Q2(C7824q2.m32703u(), arrayList11);
        m9592Q2(C7866w0.m32903u(), arrayList11);
        m9592Q2(C7860v1.m32875u(), arrayList11);
        m9592Q2(C7847t2.m32811u(), arrayList11);
        m9592Q2(C7737f.m32273u(), arrayList11);
        if (C5163j2.m20118b(context)) {
            m9592Q2(C7843s4.m32788u(), arrayList11);
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.camera.flash")) {
            m9592Q2(C7784l.m32502u(), arrayList11);
        }
        m9592Q2(C7719c5.m32186u(), arrayList11);
        m9592Q2(C7709b5.m32146v(), arrayList11);
        m9592Q2(C7857v.m32863u(), arrayList11);
        m9592Q2(C7885y4.m32996v(), arrayList11);
        m9592Q2(C7775j4.m32460u(), arrayList11);
        m9591P2(C7863v4.f18921j.mo37774a(), arrayList11);
        arrayList.add(new C7364d(context.getString(C17541R$string.item_category_device_actions), C17530R$drawable.ic_auto_fix_white_24dp, arrayList11));
        ArrayList arrayList12 = new ArrayList();
        m9592Q2(C7888z0.m33008u(), arrayList12);
        m9592Q2(C7694a1.m32081u(), arrayList12);
        m9592Q2(C7763i2.m32409u(), arrayList12);
        m9592Q2(C7752g5.m32347u(), arrayList12);
        m9592Q2(C7832r2.m32743v(), arrayList12);
        arrayList.add(new C7364d(context.getString(C17541R$string.item_category_files), C17530R$drawable.ic_file_white_24dp, arrayList12));
        ArrayList arrayList13 = new ArrayList();
        m9592Q2(C7711c.m32152u(), arrayList13);
        m9592Q2(C7836s.m32759u(), arrayList13);
        m9592Q2(C7780k2.m32483u(), arrayList13);
        m9592Q2(C7882y1.m32978u(), arrayList13);
        m9592Q2(C7873x0.m32940v(), arrayList13);
        arrayList.add(new C7364d(context.getString(C17541R$string.item_category_logging), C17530R$drawable.ic_format_list_bulleted_white_24dp, arrayList13));
        ArrayList arrayList14 = new ArrayList();
        m9592Q2(C7793m0.m32545u(), arrayList14);
        m9592Q2(C7799n0.m32579u(), arrayList14);
        m9592Q2(C7739f1.m32286u(), arrayList14);
        m9592Q2(C7881y0.m32973u(), arrayList14);
        m9592Q2(C7716c2.m32171u(), arrayList14);
        m9592Q2(C7695a2.m32087u(), arrayList14);
        m9592Q2(C7842s3.m32783u(), arrayList14);
        m9592Q2(C7705b2.m32129v(), arrayList14);
        m9592Q2(C7708b4.m32140u(), arrayList14);
        m9592Q2(C7746g0.m32319u(), arrayList14);
        m9592Q2(C7887z.m33003u(), arrayList14);
        m9592Q2(C7795m2.m32558u(), arrayList14);
        m9592Q2(C7862v3.m32885u(), arrayList14);
        m9592Q2(C7880y.m32968u(), arrayList14);
        m9592Q2(C7848t3.m32817u(), arrayList14);
        m9592Q2(C7792m.m32540u(), arrayList14);
        m9592Q2(C7826q4.m32718u(), arrayList14);
        m9592Q2(C7815p1.m32659v(), arrayList14);
        m9592Q2(C7822q1.m32696v(), arrayList14);
        m9592Q2(C7801n2.m32592u(), arrayList14);
        m9592Q2(C7807o0.m32621v(), arrayList14);
        m9592Q2(C7837s0.m32765v(), arrayList14);
        m9592Q2(C7703b1.m32122v(), arrayList14);
        m9592Q2(C7714c1.m32165v(), arrayList14);
        boolean z3 = macro instanceof ActionBlock;
        if (!z3) {
            m9592Q2(C7735e5.m32267v(), arrayList14);
        }
        m9592Q2(C7850u.m32828v(), arrayList14);
        m9592Q2(C7827r.m32724v(), arrayList14);
        m9592Q2(C7699b.m32108v(), arrayList14);
        if (z3) {
            m9592Q2(C7858v0.m32869v(), arrayList14);
        }
        arrayList.add(new C7364d(context.getString(C17541R$string.item_category_macrodroid_specific), C17530R$drawable.active_icon_new, arrayList14));
        if (!z2) {
            ArrayList arrayList15 = new ArrayList();
            m9592Q2(C7779k1.m32478u(), arrayList15);
            m9592Q2(C7787l1.m32517v(), arrayList15);
            m9592Q2(C7889z1.m33015u(), arrayList15);
            m9592Q2(C7809o1.m32627u(), arrayList15);
            m9592Q2(C7776k.m32466v(), arrayList15);
            m9592Q2(C7712c0.m32158v(), arrayList15);
            arrayList.add(new C7364d(context.getString(C17541R$string.item_category_macrodroid_condition_loop), C17530R$drawable.ic_repeat_white_24dp, arrayList15));
        }
        ArrayList arrayList16 = new ArrayList();
        m9592Q2(C7817p2.m32665u(), arrayList16);
        m9592Q2(C7721d0.m32196u(), arrayList16);
        m9592Q2(C7854u2.m32846u(), arrayList16);
        arrayList.add(new C7364d(context.getString(C17541R$string.item_category_media), C17530R$drawable.ic_play_circle_white_24dp, arrayList16));
        ArrayList arrayList17 = new ArrayList();
        m9592Q2(C7825q3.m32709u(), arrayList17);
        m9592Q2(C7751g4.m32342u(), arrayList17);
        m9592Q2(C7790l3.m32529u(), arrayList17);
        m9592Q2(C7731e1.m32246u(), arrayList17);
        m9592Q2(C7834r3.m32749u(), arrayList17);
        arrayList.add(new C7364d(context.getString(C17541R$string.item_category_location), C17530R$drawable.ic_google_maps_white_24dp, arrayList17));
        ArrayList arrayList18 = new ArrayList();
        m9592Q2(C7778k0.m32472u(), arrayList18);
        m9592Q2(C7839s1.m32771u(), arrayList18);
        m9592Q2(C7846t1.m32806u(), arrayList18);
        m9592Q2(C7867w1.m32909u(), arrayList18);
        m9592Q2(C7813p.m32647u(), arrayList18);
        m9592Q2(C7865w.m32897u(), arrayList18);
        if (C5163j2.m20118b(context)) {
            m9592Q2(C7853u1.m32839u(), arrayList18);
        }
        arrayList.add(new C7364d(context.getString(C17541R$string.item_category_applications), C17530R$drawable.ic_apps_white_24dp, arrayList18));
        new ArrayList();
        m9592Q2(C7875x1.m32946u(), arrayList18);
        m9592Q2(C7758h4.m32378u(), arrayList18);
        m9592Q2(C7789l2.m32523u(), arrayList18);
        m9592Q2(C7770j1.m32440v(), arrayList18);
        Collator instance = Collator.getInstance(C5163j2.m19963F0(context));
        instance.setStrength(0);
        Collections.sort(arrayList, new C2986d(instance));
        return arrayList;
    }

    /* renamed from: E1 */
    public C7967d mo24686E1() {
        int indexOf = mo27837X0().getActions().indexOf(this);
        if (indexOf < 0) {
            int i = 0;
            if (this.m_parentSIGUIDForInsert != 0) {
                while (true) {
                    if (i >= this.m_macro.getActions().size()) {
                        break;
                    } else if (this.m_macro.getActions().get(i).mo27847f1() == this.m_parentSIGUIDForInsert) {
                        indexOf = i + 1;
                        break;
                    } else {
                        i++;
                    }
                }
            } else {
                while (true) {
                    if (i >= this.m_macro.getActions().size()) {
                        break;
                    } else if (this.m_macro.getActions().get(i).mo27847f1() == this.m_parentSIGUID) {
                        indexOf = i + 1;
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        return C6416p0.m24713j(mo27837X0().getActions(), indexOf);
    }

    /* renamed from: G2 */
    public void mo24687G2(Macro macro) {
        super.mo24687G2(macro);
        if (macro != null) {
            this.f7124a = macro.getGUID();
        }
    }

    /* renamed from: L0 */
    public int mo24688L0() {
        return C17542R$style.Theme_App_Dialog_Action;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01fe  */
    /* renamed from: O1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24689O1() {
        /*
            r10 = this;
            super.mo24689O1()
            android.app.Activity r0 = r10.mo27850j0()
            boolean r1 = r0 instanceof com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity
            r2 = 0
            r3 = -1
            if (r1 == 0) goto L_0x001f
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r0.setResult(r3, r1)
            com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity r0 = (com.arlosoft.macrodroid.actionblock.edit.ActionBlockEditActivity) r0
            r0.mo27138H3()
            r0.mo27136B3(r2)
            goto L_0x021b
        L_0x001f:
            boolean r1 = r0 instanceof com.arlosoft.macrodroid.editscreen.EditMacroActivity
            if (r1 == 0) goto L_0x0035
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            r0.setResult(r3, r1)
            com.arlosoft.macrodroid.editscreen.EditMacroActivity r0 = (com.arlosoft.macrodroid.editscreen.EditMacroActivity) r0
            r0.mo28959U4()
            r0.mo28962z4(r2)
            goto L_0x021b
        L_0x0035:
            boolean r1 = r0 instanceof com.arlosoft.macrodroid.wizard.WizardActivity
            r4 = 1
            if (r1 == 0) goto L_0x00dd
            com.arlosoft.macrodroid.macro.Macro r1 = r10.m_macro
            java.util.ArrayList r1 = r1.getActions()
            boolean r1 = r1.contains(r10)
            if (r1 != 0) goto L_0x00ce
            r1 = 2131362395(0x7f0a025b, float:1.834457E38)
            android.view.View r0 = r0.findViewById(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r5 = 2131951672(0x7f130038, float:1.9539765E38)
            java.lang.String r5 = com.arlosoft.macrodroid.common.SelectableItem.m15535j1(r5)
            r1.append(r5)
            java.lang.String r5 = ": "
            r1.append(r5)
            java.lang.String r5 = r10.mo24738G0()
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.google.android.material.snackbar.SnackbarAnimate r0 = com.google.android.material.snackbar.SnackbarAnimate.m69574i(r0, r1, r3)
            android.view.View r1 = r0.mo58921e()
            r5 = 2131099690(0x7f06002a, float:1.781174E38)
            r1.setBackgroundResource(r5)
            android.view.View r1 = r0.mo58921e()
            r5 = 2131363815(0x7f0a07e7, float:1.834745E38)
            android.view.View r1 = r1.findViewById(r5)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1.setTextColor(r3)
            android.view.View r1 = r0.mo58921e()
            android.view.View r1 = r1.findViewById(r5)
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r5 = r10.mo25558S0()
            r1.setCompoundDrawablesWithIntrinsicBounds(r5, r2, r2, r2)
            android.content.Context r5 = r10.mo27827K0()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131165593(0x7f070199, float:1.7945407E38)
            int r5 = r5.getDimensionPixelOffset(r6)
            r1.setCompoundDrawablePadding(r5)
            r0.mo58932r()
            com.arlosoft.macrodroid.macro.Macro r0 = r10.m_macro
            r0.addAction(r10)
            x8.c r0 = p161s1.C10180a.m40075a()
            com.arlosoft.macrodroid.events.MacroUpdateEvent r1 = new com.arlosoft.macrodroid.events.MacroUpdateEvent
            com.arlosoft.macrodroid.macro.Macro r5 = r10.m_macro
            java.util.ArrayList r5 = r5.getActions()
            int r5 = r5.size()
            int r5 = r5 - r4
            r1.<init>(r2, r4, r5, r3)
            r0.mo80018i(r1)
            goto L_0x021b
        L_0x00ce:
            x8.c r0 = p161s1.C10180a.m40075a()
            com.arlosoft.macrodroid.events.MacroUpdateEvent r1 = new com.arlosoft.macrodroid.events.MacroUpdateEvent
            r2 = 3
            r1.<init>(r2, r4, r3, r3)
            r0.mo80018i(r1)
            goto L_0x021b
        L_0x00dd:
            boolean r1 = r0 instanceof com.arlosoft.macrodroid.selectableitemlist.AddActionActivity
            if (r1 == 0) goto L_0x021b
            long r5 = r10.m_parentSIGUID
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x00ef
            long r5 = r10.m_parentSIGUIDForInsert
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x00fb
        L_0x00ef:
            com.arlosoft.macrodroid.macro.Macro r1 = r10.m_macro
            java.util.ArrayList r1 = r1.getActions()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0103
        L_0x00fb:
            com.arlosoft.macrodroid.macro.Macro r1 = r10.m_macro
            r1.addAction(r10)
        L_0x0100:
            r2 = -1
            goto L_0x01e6
        L_0x0103:
            long r5 = r10.m_parentSIGUIDForInsert
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0135
        L_0x0109:
            com.arlosoft.macrodroid.macro.Macro r1 = r10.m_macro
            java.util.ArrayList r1 = r1.getActions()
            int r1 = r1.size()
            if (r2 >= r1) goto L_0x0100
            com.arlosoft.macrodroid.macro.Macro r1 = r10.m_macro
            java.util.ArrayList r1 = r1.getActions()
            java.lang.Object r1 = r1.get(r2)
            com.arlosoft.macrodroid.action.Action r1 = (com.arlosoft.macrodroid.action.Action) r1
            long r5 = r1.mo27847f1()
            long r7 = r10.m_parentSIGUIDForInsert
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x0132
            com.arlosoft.macrodroid.macro.Macro r1 = r10.m_macro
            r1.addActionAtIndex(r10, r2)
            goto L_0x01e6
        L_0x0132:
            int r2 = r2 + 1
            goto L_0x0109
        L_0x0135:
            r1 = 0
        L_0x0136:
            com.arlosoft.macrodroid.macro.Macro r5 = r10.m_macro
            java.util.ArrayList r5 = r5.getActions()
            int r5 = r5.size()
            if (r1 >= r5) goto L_0x015d
            com.arlosoft.macrodroid.macro.Macro r5 = r10.m_macro
            java.util.ArrayList r5 = r5.getActions()
            java.lang.Object r5 = r5.get(r1)
            com.arlosoft.macrodroid.action.Action r5 = (com.arlosoft.macrodroid.action.Action) r5
            long r5 = r5.mo27847f1()
            long r7 = r10.m_parentSIGUID
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x015a
            r2 = r1
            goto L_0x015d
        L_0x015a:
            int r1 = r1 + 1
            goto L_0x0136
        L_0x015d:
            com.arlosoft.macrodroid.macro.Macro r1 = r10.m_macro
            java.util.ArrayList r1 = r1.getActions()
            java.lang.Object r1 = r1.get(r2)
            com.arlosoft.macrodroid.action.Action r1 = (com.arlosoft.macrodroid.action.Action) r1
            boolean r5 = r1 instanceof com.arlosoft.macrodroid.action.LoopAction
            if (r5 == 0) goto L_0x017a
            com.arlosoft.macrodroid.macro.Macro r1 = r10.m_macro
            java.util.ArrayList r1 = r1.getActions()
            int r1 = com.arlosoft.macrodroid.utils.C6416p0.m24706c(r1, r2)
        L_0x0177:
            r2 = r1
            goto L_0x01e1
        L_0x017a:
            boolean r5 = r1 instanceof com.arlosoft.macrodroid.action.IfConditionAction
            if (r5 == 0) goto L_0x01a9
            com.arlosoft.macrodroid.macro.Macro r1 = r10.m_macro
            java.util.ArrayList r1 = r1.getActions()
            int r1 = com.arlosoft.macrodroid.utils.C6416p0.m24707d(r1, r2)
            com.arlosoft.macrodroid.macro.Macro r5 = r10.m_macro
            java.util.ArrayList r5 = r5.getActions()
            int r5 = com.arlosoft.macrodroid.utils.C6416p0.m24704a(r5, r2)
            com.arlosoft.macrodroid.macro.Macro r6 = r10.m_macro
            java.util.ArrayList r6 = r6.getActions()
            int r2 = com.arlosoft.macrodroid.utils.C6416p0.m24705b(r6, r2)
            if (r1 < 0) goto L_0x01a1
            if (r1 >= r2) goto L_0x01a1
            goto L_0x0177
        L_0x01a1:
            if (r5 < 0) goto L_0x01a7
            if (r5 >= r2) goto L_0x01a7
            r1 = r5
            goto L_0x0177
        L_0x01a7:
            r1 = r2
            goto L_0x0177
        L_0x01a9:
            boolean r5 = r1 instanceof com.arlosoft.macrodroid.action.ElseParentAction
            if (r5 == 0) goto L_0x01e0
            com.arlosoft.macrodroid.macro.Macro r5 = r10.m_macro
            java.util.ArrayList r5 = r5.getActions()
            int r5 = com.arlosoft.macrodroid.utils.C6416p0.m24705b(r5, r2)
            com.arlosoft.macrodroid.macro.Macro r6 = r10.m_macro
            java.util.ArrayList r6 = r6.getActions()
            int r6 = com.arlosoft.macrodroid.utils.C6416p0.m24707d(r6, r2)
            if (r6 < 0) goto L_0x01c7
            if (r6 >= r5) goto L_0x01c7
            r2 = r6
            goto L_0x01e1
        L_0x01c7:
            boolean r6 = r1 instanceof com.arlosoft.macrodroid.action.ElseIfConditionAction
            if (r6 != 0) goto L_0x01cf
            boolean r1 = r1 instanceof com.arlosoft.macrodroid.action.ElseIfConfirmedThenAction
            if (r1 == 0) goto L_0x01de
        L_0x01cf:
            com.arlosoft.macrodroid.macro.Macro r1 = r10.m_macro
            java.util.ArrayList r1 = r1.getActions()
            int r1 = com.arlosoft.macrodroid.utils.C6416p0.m24704a(r1, r2)
            if (r1 < 0) goto L_0x01de
            if (r1 >= r5) goto L_0x01de
            goto L_0x0177
        L_0x01de:
            r2 = r5
            goto L_0x01e1
        L_0x01e0:
            r2 = -1
        L_0x01e1:
            com.arlosoft.macrodroid.macro.Macro r1 = r10.m_macro
            r1.addActionAtIndex(r10, r2)
        L_0x01e6:
            boolean r1 = r10 instanceof com.arlosoft.macrodroid.action.LoopAction
            if (r1 == 0) goto L_0x01fe
            com.arlosoft.macrodroid.action.EndLoopAction r1 = new com.arlosoft.macrodroid.action.EndLoopAction
            r1.<init>()
            if (r2 < 0) goto L_0x01f8
            com.arlosoft.macrodroid.macro.Macro r5 = r10.m_macro
            int r2 = r2 + r4
            r5.addActionAtIndex(r1, r2)
            goto L_0x0215
        L_0x01f8:
            com.arlosoft.macrodroid.macro.Macro r2 = r10.m_macro
            r2.addAction(r1)
            goto L_0x0215
        L_0x01fe:
            boolean r1 = r10 instanceof com.arlosoft.macrodroid.action.IfConditionAction
            if (r1 == 0) goto L_0x0215
            com.arlosoft.macrodroid.action.EndIfAction r1 = new com.arlosoft.macrodroid.action.EndIfAction
            r1.<init>()
            if (r2 < 0) goto L_0x0210
            com.arlosoft.macrodroid.macro.Macro r5 = r10.m_macro
            int r2 = r2 + r4
            r5.addActionAtIndex(r1, r2)
            goto L_0x0215
        L_0x0210:
            com.arlosoft.macrodroid.macro.Macro r2 = r10.m_macro
            r2.addAction(r1)
        L_0x0215:
            r0.setResult(r3)
            r0.finish()
        L_0x021b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.Action.mo24689O1():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: R2 */
    public String mo24690R2(String str, TriggerContextInfo triggerContextInfo) {
        return C4023j0.m15760t0(mo27827K0(), str, triggerContextInfo, mo27837X0()).replace("\\n", IOUtils.LINE_SEPARATOR_UNIX);
    }

    /* renamed from: T2 */
    public final synchronized void mo24691T2() {
        synchronized (f7123c) {
            if (this.enabled) {
                mo24692U2();
                this.enabled = false;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: U2 */
    public void mo24692U2() {
    }

    /* renamed from: V1 */
    public void mo24693V1(boolean z) {
        ArrayList<Action> actions = mo27837X0().getActions();
        if (actions.size() != 0) {
            int i = 0;
            while (true) {
                if (i >= actions.size()) {
                    i = 0;
                    break;
                } else if (actions.get(i) == this) {
                    break;
                } else {
                    i++;
                }
            }
            actions.remove(i);
            actions.add(Math.max(Math.min(Math.max(z ? i - 1 : i + 1, 0), actions.size()), 0), this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: V2 */
    public void mo24694V2() {
    }

    /* renamed from: W0 */
    public String mo24695W0() {
        return "A: ";
    }

    /* renamed from: W2 */
    public final synchronized void mo24696W2() {
        synchronized (f7123c) {
            if (!this.enabled) {
                mo24694V2();
                this.enabled = true;
            }
        }
    }

    /* renamed from: X2 */
    public void mo24697X2() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a3 */
    public void mo24675a3(@Nullable TriggerContextInfo triggerContextInfo) {
    }

    /* renamed from: b3 */
    public void mo24698b3(@Nullable TriggerContextInfo triggerContextInfo) {
        if (mo27839Y()) {
            mo24675a3(triggerContextInfo);
        }
    }

    /* renamed from: c3 */
    public void mo24699c3() {
    }

    /* renamed from: e1 */
    public String[] mo24700e1() {
        if (mo27826J0().size() == 0) {
            return mo24727c1();
        }
        ArrayList arrayList = new ArrayList();
        String[] c1 = mo24727c1();
        if (c1.length > 0) {
            Collections.addAll(arrayList, c1);
        }
        for (Constraint e1 : mo27826J0()) {
            String[] e12 = e1.mo24700e1();
            if (e12.length > 0) {
                Collections.addAll(arrayList, e12);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: f3 */
    public void mo24701f3(long j, long j2) {
        this.m_parentSIGUID = j;
        this.m_parentSIGUIDForInsert = j2;
        mo25540W1();
    }

    /* renamed from: g3 */
    public void mo24702g3(Macro macro, @Nullable Macro macro2) {
        mo24687G2(macro);
    }

    /* renamed from: h3 */
    public void mo24703h3(@Nullable TriggerContextInfo triggerContextInfo) {
        C4878b.m18876o(mo25559a1(), mo27840Y0().longValue());
        if (!(this instanceof C2212a)) {
            mo24698b3(triggerContextInfo);
        } else if (mo27839Y()) {
            ((C2212a) this).mo24421h(triggerContextInfo, 0, true, new Stack(), (ResumeMacroInfo) null, true);
        }
    }

    /* renamed from: i3 */
    public void mo24704i3(@Nullable TriggerContextInfo triggerContextInfo) {
        if (mo27845e0(triggerContextInfo)) {
            mo24703h3(triggerContextInfo);
        } else {
            C15626c.makeText(mo27827K0().getApplicationContext(), C17541R$string.constraint_check_false_not_running, 1).show();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l0 */
    public int mo24705l0() {
        return C17542R$style.Theme_App_Dialog_Action;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        mo24689O1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w1 */
    public void mo24706w1() {
        Activity j0 = mo27850j0();
        if (j0 instanceof EditMacroActivity) {
            ((EditMacroActivity) j0).mo28956M3();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.f7124a);
    }

    protected Action(Parcel parcel) {
        super(parcel);
        this.f7124a = parcel.readLong();
    }
}
