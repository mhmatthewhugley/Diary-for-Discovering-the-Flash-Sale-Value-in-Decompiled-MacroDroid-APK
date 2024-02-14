package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p128m0.C7760i0;

/* compiled from: DemoModeAction.kt */
public final class DemoModeAction extends Action {
    public static final Parcelable.Creator<DemoModeAction> CREATOR = new C2397a();

    /* renamed from: d */
    public static final C2398b f7209d = new C2398b((C13695i) null);
    private int state;

    /* renamed from: com.arlosoft.macrodroid.action.DemoModeAction$a */
    /* compiled from: DemoModeAction.kt */
    public static final class C2397a implements Parcelable.Creator<DemoModeAction> {
        C2397a() {
        }

        /* renamed from: a */
        public DemoModeAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new DemoModeAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public DemoModeAction[] newArray(int i) {
            return new DemoModeAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.DemoModeAction$b */
    /* compiled from: DemoModeAction.kt */
    public static final class C2398b {
        private C2398b() {
        }

        public /* synthetic */ C2398b(C13695i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final String[] m10387b() {
            return new String[]{SelectableItem.m15535j1(C17541R$string.f7056on), SelectableItem.m15535j1(C17541R$string.off), SelectableItem.m15535j1(C17541R$string.toggle)};
        }
    }

    public DemoModeAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ DemoModeAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00ab A[SYNTHETIC, Splitter:B:17:0x00ab] */
    /* renamed from: l3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m10374l3() {
        /*
            r8 = this;
            java.lang.String r0 = "sysui_tuner_demo_on"
            r1 = 0
            r2 = 1
            int r3 = r8.state     // Catch:{ Exception -> 0x001b }
            if (r3 != 0) goto L_0x0009
            goto L_0x001b
        L_0x0009:
            if (r3 != r2) goto L_0x000d
        L_0x000b:
            r3 = 0
            goto L_0x001c
        L_0x000d:
            android.content.Context r3 = r8.mo27827K0()     // Catch:{ Exception -> 0x001b }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ Exception -> 0x001b }
            int r3 = android.provider.Settings.Global.getInt(r3, r0)     // Catch:{ Exception -> 0x001b }
            if (r3 != 0) goto L_0x000b
        L_0x001b:
            r3 = 1
        L_0x001c:
            boolean r4 = p150q2.C8164a.m33886a()
            if (r4 == 0) goto L_0x00ab
            android.content.Context r0 = r8.mo27827K0()
            java.lang.String r4 = "android.permission.DUMP"
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r0, r4)
            java.lang.String r4 = "settings put global sysui_tuner_demo_on "
            java.lang.String r5 = "settings put global sysui_demo_allowed "
            if (r0 == 0) goto L_0x007b
            java.lang.String r0 = "pm grant com.arlosoft.macrodroid android.permission.DUMP"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            com.arlosoft.macrodroid.common.C4061t1.m15947B0(r0)
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r6 = android.os.Looper.getMainLooper()
            r0.<init>(r6)
            java.lang.String[] r6 = new java.lang.String[r2]
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r5)
            r7.append(r3)
            java.lang.String r5 = r7.toString()
            r6[r1] = r5
            com.arlosoft.macrodroid.common.C4061t1.m15947B0(r6)
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r3)
            java.lang.String r4 = r5.toString()
            r2[r1] = r4
            com.arlosoft.macrodroid.common.C4061t1.m15947B0(r2)
            com.arlosoft.macrodroid.action.x3 r1 = new com.arlosoft.macrodroid.action.x3
            r1.<init>(r8, r3)
            r2 = 1000(0x3e8, double:4.94E-321)
            r0.postDelayed(r1, r2)
            goto L_0x00d9
        L_0x007b:
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            r6.append(r3)
            java.lang.String r5 = r6.toString()
            r0[r1] = r5
            com.arlosoft.macrodroid.common.C4061t1.m15947B0(r0)
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0[r1] = r2
            com.arlosoft.macrodroid.common.C4061t1.m15947B0(r0)
            r8.m10376n3(r3)
            goto L_0x00d9
        L_0x00ab:
            android.content.Context r1 = r8.mo27827K0()     // Catch:{ Exception -> 0x00c4 }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ Exception -> 0x00c4 }
            java.lang.String r2 = "sysui_demo_allowed"
            android.provider.Settings.Global.putInt(r1, r2, r3)     // Catch:{ Exception -> 0x00c4 }
            android.content.Context r1 = r8.mo27827K0()     // Catch:{ Exception -> 0x00c4 }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ Exception -> 0x00c4 }
            android.provider.Settings.Global.putInt(r1, r0, r3)     // Catch:{ Exception -> 0x00c4 }
            goto L_0x00d6
        L_0x00c4:
            java.lang.Long r0 = r8.mo27840Y0()
            java.lang.String r1 = "macroGuid"
            kotlin.jvm.internal.C13706o.m87928e(r0, r1)
            long r0 = r0.longValue()
            java.lang.String r2 = "Could not set demo mode, you need to grant permission via adb with the command: adb shell pm grant com.arlosoft.macrodroid android.permission.WRITE_SECURE_SETTINGS"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r2, r0)
        L_0x00d6:
            r8.m10376n3(r3)
        L_0x00d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.DemoModeAction.m10374l3():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public static final void m10375m3(DemoModeAction demoModeAction, int i) {
        C13706o.m87929f(demoModeAction, "this$0");
        demoModeAction.m10376n3(i);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r15 = r9.format(r8.getTime());
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0075 */
    /* renamed from: n3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m10376n3(int r15) {
        /*
            r14 = this;
            java.lang.String r0 = "4"
            java.lang.String r1 = "show"
            java.lang.String r2 = "false"
            java.lang.String r3 = "level"
            java.lang.String r4 = "network"
            java.lang.String r5 = "hide"
            java.lang.String r6 = "command"
            java.lang.String r7 = "com.android.systemui.demo"
            if (r15 != 0) goto L_0x0025
            android.content.Intent r15 = new android.content.Intent     // Catch:{ Exception -> 0x014c }
            r15.<init>(r7)     // Catch:{ Exception -> 0x014c }
            java.lang.String r0 = "exit"
            r15.putExtra(r6, r0)     // Catch:{ Exception -> 0x014c }
            android.content.Context r0 = r14.mo27827K0()     // Catch:{ Exception -> 0x014c }
            r0.sendBroadcast(r15)     // Catch:{ Exception -> 0x014c }
            goto L_0x016e
        L_0x0025:
            java.lang.String r15 = android.os.Build.VERSION.RELEASE     // Catch:{ Exception -> 0x014c }
            java.util.Calendar r8 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x014c }
            java.text.SimpleDateFormat r9 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x014c }
            java.lang.String r10 = "HHmm"
            r9.<init>(r10)     // Catch:{ Exception -> 0x014c }
            r10 = 1
            java.lang.String r11 = "version"
            kotlin.jvm.internal.C13706o.m87928e(r15, r11)     // Catch:{ Exception -> 0x0075 }
            int r11 = java.lang.Integer.parseInt(r15)     // Catch:{ Exception -> 0x0075 }
            r12 = 24
            if (r11 >= r12) goto L_0x006c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0075 }
            r11.<init>()     // Catch:{ Exception -> 0x0075 }
            int r12 = r15.length()     // Catch:{ Exception -> 0x0075 }
            if (r12 != r10) goto L_0x004e
            java.lang.String r15 = "0"
            goto L_0x005f
        L_0x004e:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0075 }
            r12.<init>()     // Catch:{ Exception -> 0x0075 }
            java.lang.String r13 = ""
            r12.append(r13)     // Catch:{ Exception -> 0x0075 }
            r12.append(r15)     // Catch:{ Exception -> 0x0075 }
            java.lang.String r15 = r12.toString()     // Catch:{ Exception -> 0x0075 }
        L_0x005f:
            r11.append(r15)     // Catch:{ Exception -> 0x0075 }
            java.lang.String r15 = "00"
            r11.append(r15)     // Catch:{ Exception -> 0x0075 }
            java.lang.String r15 = r11.toString()     // Catch:{ Exception -> 0x0075 }
            goto L_0x007d
        L_0x006c:
            java.util.Date r15 = r8.getTime()     // Catch:{ Exception -> 0x0075 }
            java.lang.String r15 = r9.format(r15)     // Catch:{ Exception -> 0x0075 }
            goto L_0x007d
        L_0x0075:
            java.util.Date r15 = r8.getTime()     // Catch:{ Exception -> 0x014c }
            java.lang.String r15 = r9.format(r15)     // Catch:{ Exception -> 0x014c }
        L_0x007d:
            android.content.Intent r8 = new android.content.Intent     // Catch:{ Exception -> 0x014c }
            r8.<init>(r7)     // Catch:{ Exception -> 0x014c }
            java.lang.String r9 = "clock"
            r8.putExtra(r6, r9)     // Catch:{ Exception -> 0x014c }
            java.lang.String r9 = "hhmm"
            r8.putExtra(r9, r15)     // Catch:{ Exception -> 0x014c }
            android.content.Context r15 = r14.mo27827K0()     // Catch:{ Exception -> 0x014c }
            r15.sendBroadcast(r8)     // Catch:{ Exception -> 0x014c }
            android.content.Intent r15 = new android.content.Intent     // Catch:{ Exception -> 0x014c }
            r15.<init>(r7)     // Catch:{ Exception -> 0x014c }
            java.lang.String r8 = "battery"
            r15.putExtra(r6, r8)     // Catch:{ Exception -> 0x014c }
            java.lang.String r8 = "100"
            r15.putExtra(r3, r8)     // Catch:{ Exception -> 0x014c }
            java.lang.String r8 = "plugged"
            r15.putExtra(r8, r2)     // Catch:{ Exception -> 0x014c }
            android.content.Context r8 = r14.mo27827K0()     // Catch:{ Exception -> 0x014c }
            r8.sendBroadcast(r15)     // Catch:{ Exception -> 0x014c }
            android.content.Intent r15 = new android.content.Intent     // Catch:{ Exception -> 0x014c }
            r15.<init>(r7)     // Catch:{ Exception -> 0x014c }
            r15.putExtra(r6, r4)     // Catch:{ Exception -> 0x014c }
            java.lang.String r8 = "mobile"
            r15.putExtra(r8, r1)     // Catch:{ Exception -> 0x014c }
            java.lang.String r8 = "datatype"
            r15.putExtra(r8, r5)     // Catch:{ Exception -> 0x014c }
            r15.putExtra(r3, r0)     // Catch:{ Exception -> 0x014c }
            android.content.Context r8 = r14.mo27827K0()     // Catch:{ Exception -> 0x014c }
            r8.sendBroadcast(r15)     // Catch:{ Exception -> 0x014c }
            android.content.Intent r15 = new android.content.Intent     // Catch:{ Exception -> 0x014c }
            r15.<init>(r7)     // Catch:{ Exception -> 0x014c }
            r15.putExtra(r6, r4)     // Catch:{ Exception -> 0x014c }
            java.lang.String r8 = "fully"
            java.lang.String r9 = "true"
            r15.putExtra(r8, r9)     // Catch:{ Exception -> 0x014c }
            android.content.Context r8 = r14.mo27827K0()     // Catch:{ Exception -> 0x014c }
            r8.sendBroadcast(r15)     // Catch:{ Exception -> 0x014c }
            android.content.Intent r15 = new android.content.Intent     // Catch:{ Exception -> 0x014c }
            r15.<init>(r7)     // Catch:{ Exception -> 0x014c }
            r15.putExtra(r6, r4)     // Catch:{ Exception -> 0x014c }
            java.lang.String r8 = "wifi"
            r15.putExtra(r8, r1)     // Catch:{ Exception -> 0x014c }
            r15.putExtra(r3, r0)     // Catch:{ Exception -> 0x014c }
            android.content.Context r0 = r14.mo27827K0()     // Catch:{ Exception -> 0x014c }
            r0.sendBroadcast(r15)     // Catch:{ Exception -> 0x014c }
            android.content.Intent r15 = new android.content.Intent     // Catch:{ Exception -> 0x014c }
            r15.<init>(r7)     // Catch:{ Exception -> 0x014c }
            r15.putExtra(r6, r4)     // Catch:{ Exception -> 0x014c }
            java.lang.String r0 = "airplane"
            r15.putExtra(r0, r5)     // Catch:{ Exception -> 0x014c }
            java.lang.String r0 = "nosim"
            r15.putExtra(r0, r5)     // Catch:{ Exception -> 0x014c }
            java.lang.String r0 = "sims"
            r15.putExtra(r0, r10)     // Catch:{ Exception -> 0x014c }
            android.content.Context r0 = r14.mo27827K0()     // Catch:{ Exception -> 0x014c }
            r0.sendBroadcast(r15)     // Catch:{ Exception -> 0x014c }
            android.content.Intent r15 = new android.content.Intent     // Catch:{ Exception -> 0x014c }
            r15.<init>(r7)     // Catch:{ Exception -> 0x014c }
            java.lang.String r0 = "notifications"
            r15.putExtra(r6, r0)     // Catch:{ Exception -> 0x014c }
            java.lang.String r0 = "visible"
            r15.putExtra(r0, r2)     // Catch:{ Exception -> 0x014c }
            android.content.Context r0 = r14.mo27827K0()     // Catch:{ Exception -> 0x014c }
            r0.sendBroadcast(r15)     // Catch:{ Exception -> 0x014c }
            android.content.Intent r15 = new android.content.Intent     // Catch:{ Exception -> 0x014c }
            r15.<init>(r7)     // Catch:{ Exception -> 0x014c }
            java.lang.String r0 = "status"
            r15.putExtra(r6, r0)     // Catch:{ Exception -> 0x014c }
            java.lang.String r0 = "bluetooth"
            r15.putExtra(r0, r5)     // Catch:{ Exception -> 0x014c }
            java.lang.String r0 = "volume"
            r15.putExtra(r0, r5)     // Catch:{ Exception -> 0x014c }
            java.lang.String r0 = "mute"
            r15.putExtra(r0, r5)     // Catch:{ Exception -> 0x014c }
            android.content.Context r0 = r14.mo27827K0()     // Catch:{ Exception -> 0x014c }
            r0.sendBroadcast(r15)     // Catch:{ Exception -> 0x014c }
            goto L_0x016e
        L_0x014c:
            r15 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to enable demo mode: "
            r0.append(r1)
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            java.lang.Long r0 = r14.mo27840Y0()
            java.lang.String r1 = "macroGuid"
            kotlin.jvm.internal.C13706o.m87928e(r0, r1)
            long r0 = r0.longValue()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18869h(r15, r0)
        L_0x016e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.action.DemoModeAction.m10376n3(int):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.state;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        String str = f7209d.m10387b()[this.state];
        C13706o.m87928e(str, "getOptions()[state]");
        return str;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7760i0.f18748l.mo37753a();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + mo24672O0() + ')';
    }

    /* access modifiers changed from: protected */
    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        m10374l3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return f7209d.m10387b();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.state);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.state = i;
    }

    public DemoModeAction() {
    }

    private DemoModeAction(Parcel parcel) {
        super(parcel);
        this.state = parcel.readInt();
    }
}
