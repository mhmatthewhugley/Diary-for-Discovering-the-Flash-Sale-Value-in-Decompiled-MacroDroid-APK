package com.arlosoft.macrodroid.common;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.preference.PreferenceManager;
import android.util.Pair;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ListView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import com.arlosoft.macrodroid.C17529R$dimen;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.C17542R$style;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.app.base.MacroDroidBaseActivity;
import com.arlosoft.macrodroid.constraint.Constraint;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.variables.VariableValue;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import p057a2.C2219h;
import p057a2.C2220i;
import p057a2.C2222k;
import p112j2.C7439d0;
import p135n1.C7967d;
import p148q0.C8151a;
import p172u1.C10283c;
import p215b8.C11102b;
import p319lc.C15626c;
import p440y9.C16971a;

public abstract class SelectableItem implements Parcelable {
    private static final int MIN_CLICK_DIFF_MS = 1000;
    private transient boolean hasCommentEdited;
    private transient boolean hasEdited;
    private transient boolean isCollapsed;
    private long m_SIGUID;
    private transient WeakReference<Activity> m_activityRef;
    /* access modifiers changed from: protected */
    public String m_classType;
    private String m_comment;
    private List<Constraint> m_constraintList;
    private boolean m_isDisabled;
    private boolean m_isOrCondition;
    private transient long m_lastClickTime;
    /* access modifiers changed from: protected */
    public transient Macro m_macro;
    protected transient boolean m_returnOnComplete;
    private transient String serializedFormBeforeEdit;

    public SelectableItem() {
        this.m_classType = getClass().getSimpleName();
        this.m_lastClickTime = 0;
        this.hasEdited = false;
        this.hasCommentEdited = false;
        mo25154D1();
        if (this.m_SIGUID == 0) {
            this.m_SIGUID = UUID.randomUUID().getLeastSignificantBits();
        }
    }

    /* renamed from: C1 */
    private void m15516C1() {
        Activity j0 = mo27850j0();
        if (j0 != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) j0.getSystemService("input_method");
            View currentFocus = j0.getCurrentFocus();
            if (currentFocus == null) {
                currentFocus = new View(j0);
            }
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    /* renamed from: D1 */
    private void mo25154D1() {
        this.m_constraintList = new ArrayList();
    }

    /* renamed from: F2 */
    private void m15518F2(boolean z) {
        this.hasEdited = z;
    }

    /* renamed from: I1 */
    private boolean m15519I1() {
        Macro macro = this.m_macro;
        if (macro != null) {
            return macro.isExcludedFromLog();
        }
        return false;
    }

    /* renamed from: I2 */
    public static void m15520I2(Context context, String str, boolean z) {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    /* access modifiers changed from: private */
    /* renamed from: P1 */
    public /* synthetic */ void m15525P1(String[] strArr, Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            mo27871v1();
        } else {
            C7439d0.m30909o0(mo27827K0(), strArr[0], mo24738G0(), true, true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R1 */
    public /* synthetic */ void m15527R1(DialogInterface dialogInterface, int i) {
        mo24679x2(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: S1 */
    public /* synthetic */ void m15528S1(DialogInterface dialogInterface, int i) {
        mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: T1 */
    public /* synthetic */ void m15529T1(DialogInterface dialogInterface, int i) {
        mo27873w2();
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public /* synthetic */ void m15530U1(DialogInterface dialogInterface) {
        mo24706w1();
    }

    /* renamed from: Z */
    private void m15531Z(Activity activity) {
        if (Build.VERSION.SDK_INT < 23) {
            mo27871v1();
            return;
        }
        C11102b bVar = new C11102b((FragmentActivity) activity);
        String[] c1 = mo24727c1();
        if (c1.length == 0) {
            mo27871v1();
        } else {
            bVar.mo62231o(c1).mo79679I(C16971a.m100210a()).mo79685P(new C3998b1(this, c1));
        }
    }

    /* renamed from: b0 */
    private void m15532b0() {
        if (mo27836X()) {
            Activity j0 = mo27850j0();
            if (C7439d0.m30854A(j0, this, true, false)) {
                m15531Z(j0);
            }
        }
    }

    @StringRes
    /* renamed from: b1 */
    public static int m15533b1(int i) {
        return i != 0 ? i != 1 ? C17541R$string.no_constraints : C17541R$string.no_actions : C17541R$string.no_triggers;
    }

    /* renamed from: i1 */
    protected static boolean m15534i1(Context context, String str) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(str, false);
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: j1 */
    public static String m15535j1(int i) {
        return MacroDroidApplication.m14845u().getString(i);
    }

    /* renamed from: A0 */
    public ArrayList<MacroDroidVariable> mo27814A0() {
        ArrayList<MacroDroidVariable> arrayList = new ArrayList<>();
        Macro macro = this.m_macro;
        if (macro != null) {
            arrayList.addAll(macro.getLocalVariablesSorted());
        }
        arrayList.addAll(C4064u.m16048t().mo27993r(true));
        return arrayList;
    }

    /* renamed from: A2 */
    public void mo27815A2(String str) {
        this.m_comment = str;
    }

    /* renamed from: B1 */
    public boolean mo24788B1() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B2 */
    public void mo27816B2(boolean z) {
        this.m_isOrCondition = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C2 */
    public void mo27817C2(List<Constraint> list) {
        this.m_constraintList = list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return 0;
    }

    /* renamed from: D2 */
    public void mo27818D2(boolean z) {
        this.m_isDisabled = !z;
    }

    /* renamed from: E0 */
    public String mo25226E0() {
        return mo24738G0();
    }

    /* renamed from: E1 */
    public C7967d mo24686E1() {
        return C7967d.NONE;
    }

    /* renamed from: E2 */
    public void mo27819E2(boolean z) {
        this.hasCommentEdited = z;
    }

    /* renamed from: F0 */
    public String mo27820F0() {
        return this.m_comment;
    }

    /* renamed from: F1 */
    public boolean mo27821F1() {
        return this.isCollapsed;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return mo25559a1();
    }

    /* renamed from: G1 */
    public boolean mo27822G1() {
        return !this.m_isDisabled;
    }

    /* renamed from: G2 */
    public void mo24687G2(Macro macro) {
        this.m_macro = macro;
        List<Constraint> list = this.m_constraintList;
        if (list != null) {
            for (Constraint G2 : list) {
                G2.mo24687G2(this.m_macro);
            }
        }
    }

    /* renamed from: H0 */
    public String mo27823H0() {
        return mo24674U0();
    }

    /* renamed from: H2 */
    public void mo27824H2() {
        this.m_SIGUID = UUID.randomUUID().getLeastSignificantBits();
    }

    /* access modifiers changed from: protected */
    /* renamed from: I0 */
    public boolean mo27825I0() {
        return this.m_isOrCondition;
    }

    /* renamed from: J0 */
    public List<Constraint> mo27826J0() {
        if (this.m_constraintList == null) {
            this.m_constraintList = new ArrayList();
        }
        return this.m_constraintList;
    }

    /* renamed from: J1 */
    public boolean mo24712J1() {
        return false;
    }

    /* renamed from: J2 */
    public void mo24888J2() {
    }

    /* renamed from: K0 */
    public Context mo27827K0() {
        return MacroDroidApplication.m14845u();
    }

    /* renamed from: K1 */
    public boolean mo25764K1() {
        return mo24673T0().mo27899q();
    }

    /* renamed from: K2 */
    public void mo27828K2(MacroDroidVariable macroDroidVariable) {
        mo27832M2(macroDroidVariable, VariableValue.createForType(macroDroidVariable.mo27743S()));
    }

    /* renamed from: L0 */
    public int mo24688L0() {
        return C17542R$style.Theme_App_Dialog;
    }

    /* renamed from: L1 */
    public boolean mo27829L1() {
        return mo24673T0().mo27899q() && !mo24673T0().mo27902t();
    }

    /* renamed from: L2 */
    public void mo27830L2(MacroDroidVariable macroDroidVariable, List<String> list) {
        VariableValue.DictionaryEntry R = macroDroidVariable.mo27742R(list, false);
        if (R != null) {
            mo27832M2(macroDroidVariable, VariableValue.createForType(R.getVariable().getVariableType(), list));
        }
    }

    /* renamed from: M0 */
    public String mo27831M0() {
        return mo24738G0();
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        return true;
    }

    /* renamed from: M2 */
    public void mo27832M2(MacroDroidVariable macroDroidVariable, VariableValue variableValue) {
        Macro macro = this.m_macro;
        if (macro != null) {
            macro.variableUpdate(macroDroidVariable, variableValue);
        } else {
            C4064u.m16048t().mo27980P(macroDroidVariable, variableValue, !m15519I1(), mo27837X0());
        }
    }

    /* renamed from: N0 */
    public String mo24938N0() {
        return null;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo24689O1() {
        if (!this.hasEdited) {
            m15518F2(!C10283c.m40414d(false, false).mo64004c().mo63984s(this).equals(this.serializedFormBeforeEdit));
        }
    }

    /* renamed from: P0 */
    public boolean mo27833P0() {
        return this.hasCommentEdited;
    }

    /* renamed from: Q0 */
    public String mo25557Q0() {
        return m15535j1(mo24673T0().mo27891f());
    }

    /* renamed from: R */
    public void mo27834R(Constraint constraint) {
        this.m_constraintList.add(constraint);
    }

    /* renamed from: S */
    public void mo27835S(MacroDroidVariable macroDroidVariable) {
        if (this.m_macro == null || !macroDroidVariable.mo27754c0()) {
            C4064u.m16048t().mo27983f(macroDroidVariable);
        } else {
            this.m_macro.getLocalVariables().add(macroDroidVariable);
        }
    }

    /* renamed from: S0 */
    public int mo25558S0() {
        return mo24673T0().mo27892g();
    }

    /* renamed from: T */
    public boolean mo25765T() {
        return false;
    }

    /* renamed from: T0 */
    public abstract C4001c1 mo24673T0();

    @CallSuper
    /* renamed from: U */
    public void mo25131U() {
        for (Constraint U : mo27826J0()) {
            U.mo25131U();
        }
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0();
    }

    /* renamed from: V */
    public void mo25810V() {
        List<MacroDroidVariable> j;
        if (this instanceof C2219h) {
            MacroDroidVariable s = ((C2219h) this).mo24432s();
            if (s != null && C4064u.m16048t().mo27996w(s.getName()) == null && this.m_macro.findLocalVariableByName(s.getName()) == null) {
                C4064u.m16048t().mo27983f(s);
            }
        } else if (this instanceof C2220i) {
            String m = ((C2220i) this).mo24434m();
            if (m != null && C4064u.m16048t().mo27996w(m) == null && this.m_macro.findLocalVariableByName(m) == null) {
                C4064u.m16048t().mo27983f(new MacroDroidVariable(2, m));
            }
        } else if ((this instanceof C2222k) && (j = ((C2222k) this).mo24437j()) != null) {
            for (MacroDroidVariable next : j) {
                if (next != null && C4064u.m16048t().mo27996w(next.getName()) == null) {
                    Macro macro = this.m_macro;
                    if (macro == null || macro.findLocalVariableByName(next.getName()) == null) {
                        C4064u.m16048t().mo27983f(next);
                    }
                }
            }
        }
    }

    /* renamed from: V0 */
    public CharSequence mo24875V0() {
        return mo24674U0();
    }

    /* renamed from: V1 */
    public void mo24693V1(boolean z) {
    }

    /* renamed from: W */
    public boolean mo25030W() {
        return false;
    }

    /* renamed from: W0 */
    public String mo24695W0() {
        return "";
    }

    /* renamed from: W1 */
    public void mo25540W1() {
        FirebaseCrashlytics a = FirebaseCrashlytics.m6487a();
        a.mo22935c("onItemSelected - " + getClass().getSimpleName());
        try {
            this.serializedFormBeforeEdit = C10283c.m40414d(false, false).mo64004c().mo63984s(this);
        } catch (Throwable th) {
            C8151a.m33860a("Error in " + getClass().getSimpleName());
            C8151a.m33873n(th);
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis > this.m_lastClickTime + 1000) {
            this.m_lastClickTime = currentTimeMillis;
            m15532b0();
        }
    }

    /* renamed from: X */
    public boolean mo27836X() {
        Activity activity;
        WeakReference<Activity> weakReference = this.m_activityRef;
        if (weakReference == null || (activity = (Activity) weakReference.get()) == null) {
            return false;
        }
        if (activity instanceof MacroDroidBaseActivity) {
            return !((MacroDroidBaseActivity) activity).mo27315N1();
        }
        return true;
    }

    /* renamed from: X0 */
    public Macro mo27837X0() {
        return this.m_macro;
    }

    /* renamed from: X1 */
    public void mo27838X1(String[] strArr, int[] iArr) {
        int i = 0;
        while (true) {
            if (i >= iArr.length) {
                i = 0;
                break;
            } else if (iArr[i] == -1) {
                break;
            } else {
                i++;
            }
        }
        String B = C7439d0.m30855B(strArr[i]);
        Context applicationContext = mo27827K0().getApplicationContext();
        C15626c.m94876a(applicationContext, B + " " + mo27827K0().getString(C17541R$string.permission_denied), 0).show();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ac  */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo27839Y() {
        /*
            r7 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 0
            r3 = 23
            if (r0 < r3) goto L_0x0075
            boolean r0 = r7.mo25103u2()
            if (r0 == 0) goto L_0x0029
            android.content.Context r0 = r7.mo27827K0()
            boolean r0 = android.provider.Settings.System.canWrite(r0)
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = "Missing write settings permission"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
            android.content.Context r0 = r7.mo27827K0()
            java.lang.String r3 = r7.mo25559a1()
            p112j2.C7439d0.m30911p0(r0, r3, r1)
            return r2
        L_0x0029:
            boolean r0 = r7.mo24893h2()
            if (r0 == 0) goto L_0x004b
            android.content.Context r0 = r7.mo27827K0()
            boolean r0 = android.provider.Settings.canDrawOverlays(r0)
            if (r0 != 0) goto L_0x004b
            java.lang.String r0 = "Missing draw overlays permission"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
            android.content.Context r0 = r7.mo27827K0()
            java.lang.String r1 = r7.mo25559a1()
            r3 = 2
            p112j2.C7439d0.m30911p0(r0, r1, r3)
            return r2
        L_0x004b:
            boolean r0 = r7.mo25733n2()
            if (r0 == 0) goto L_0x0075
            android.content.Context r0 = r7.mo27827K0()     // Catch:{ SettingNotFoundException -> 0x0064 }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ SettingNotFoundException -> 0x0064 }
            java.lang.String r3 = "location_mode"
            int r0 = android.provider.Settings.Secure.getInt(r0, r3)     // Catch:{ SettingNotFoundException -> 0x0064 }
            if (r0 == 0) goto L_0x0062
            goto L_0x0064
        L_0x0062:
            r0 = 0
            goto L_0x0065
        L_0x0064:
            r0 = 1
        L_0x0065:
            if (r0 != 0) goto L_0x0075
            android.content.Context r0 = r7.mo27827K0()
            java.lang.String r1 = r7.mo25559a1()
            r3 = 11
            p112j2.C7439d0.m30911p0(r0, r1, r3)
            return r2
        L_0x0075:
            boolean r0 = r7.mo27866s2()
            if (r0 == 0) goto L_0x00b9
            android.content.Context r0 = r7.mo27827K0()     // Catch:{ NameNotFoundException -> 0x00a9 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00a9 }
            android.content.Context r3 = r7.mo27827K0()     // Catch:{ NameNotFoundException -> 0x00a9 }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ NameNotFoundException -> 0x00a9 }
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r3, r2)     // Catch:{ NameNotFoundException -> 0x00a9 }
            android.content.Context r3 = r7.mo27827K0()     // Catch:{ NameNotFoundException -> 0x00a9 }
            java.lang.String r4 = "appops"
            java.lang.Object r3 = r3.getSystemService(r4)     // Catch:{ NameNotFoundException -> 0x00a9 }
            android.app.AppOpsManager r3 = (android.app.AppOpsManager) r3     // Catch:{ NameNotFoundException -> 0x00a9 }
            java.lang.String r4 = "android:get_usage_stats"
            int r5 = r0.uid     // Catch:{ NameNotFoundException -> 0x00a9 }
            java.lang.String r0 = r0.packageName     // Catch:{ NameNotFoundException -> 0x00a9 }
            int r0 = r3.checkOpNoThrow(r4, r5, r0)     // Catch:{ NameNotFoundException -> 0x00a9 }
            if (r0 != 0) goto L_0x00a9
            r0 = 1
            goto L_0x00aa
        L_0x00a9:
            r0 = 0
        L_0x00aa:
            if (r0 != 0) goto L_0x00b9
            android.content.Context r0 = r7.mo27827K0()
            java.lang.String r1 = r7.mo25559a1()
            r3 = 3
            p112j2.C7439d0.m30911p0(r0, r1, r3)
            return r2
        L_0x00b9:
            boolean r0 = r7.mo24749f2()
            if (r0 == 0) goto L_0x00db
            android.content.Context r0 = r7.mo27827K0()
            boolean r0 = com.arlosoft.macrodroid.common.C4061t1.m15992f0(r0)
            if (r0 != 0) goto L_0x00db
            java.lang.String r0 = "Accessibility service is not enabled"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
            android.content.Context r0 = r7.mo27827K0()
            java.lang.String r1 = r7.mo25559a1()
            r3 = 4
            p112j2.C7439d0.m30911p0(r0, r1, r3)
            return r2
        L_0x00db:
            boolean r0 = r7.mo27868t2()
            if (r0 == 0) goto L_0x00fe
            android.content.Context r0 = r7.mo27827K0()
            boolean r0 = com.arlosoft.macrodroid.common.C4061t1.m15994g0(r0)
            if (r0 != 0) goto L_0x00fe
            java.lang.String r0 = "Volume accessibility service is not enabled"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
            android.content.Context r0 = r7.mo27827K0()
            java.lang.String r1 = r7.mo25559a1()
            r3 = 8
            p112j2.C7439d0.m30911p0(r0, r1, r3)
            return r2
        L_0x00fe:
            boolean r0 = r7.mo27852l2()
            if (r0 == 0) goto L_0x0121
            android.content.Context r0 = r7.mo27827K0()
            boolean r0 = com.arlosoft.macrodroid.common.C4061t1.m15990e0(r0)
            if (r0 != 0) goto L_0x0121
            java.lang.String r0 = "Fingerprint accessibility service is not enabled"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
            android.content.Context r0 = r7.mo27827K0()
            java.lang.String r1 = r7.mo25559a1()
            r3 = 9
            p112j2.C7439d0.m30911p0(r0, r1, r3)
            return r2
        L_0x0121:
            boolean r0 = r7.mo25499r2()
            if (r0 == 0) goto L_0x0144
            android.content.Context r0 = r7.mo27827K0()
            boolean r0 = com.arlosoft.macrodroid.common.C4061t1.m15996h0(r0)
            if (r0 != 0) goto L_0x0144
            java.lang.String r0 = "UI interaction accessibility service is not enabled"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
            android.content.Context r0 = r7.mo27827K0()
            java.lang.String r1 = r7.mo25559a1()
            r3 = 10
            p112j2.C7439d0.m30911p0(r0, r1, r3)
            return r2
        L_0x0144:
            boolean r0 = r7.mo24958j2()
            if (r0 == 0) goto L_0x0179
            android.content.ComponentName r0 = new android.content.ComponentName
            android.content.Context r3 = r7.mo27827K0()
            java.lang.Class<com.arlosoft.macrodroid.triggers.receivers.MacroDroidDeviceAdminReceiver> r4 = com.arlosoft.macrodroid.triggers.receivers.MacroDroidDeviceAdminReceiver.class
            r0.<init>(r3, r4)
            android.content.Context r3 = r7.mo27827K0()
            java.lang.String r4 = "device_policy"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.app.admin.DevicePolicyManager r3 = (android.app.admin.DevicePolicyManager) r3
            boolean r0 = r3.isAdminActive(r0)
            if (r0 != 0) goto L_0x0179
            java.lang.String r0 = "Device admin access for MacroDroid is not enabled"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
            android.content.Context r0 = r7.mo27827K0()
            java.lang.String r1 = r7.mo25559a1()
            r3 = 5
            p112j2.C7439d0.m30911p0(r0, r1, r3)
            return r2
        L_0x0179:
            boolean r0 = r7.mo24773q2()
            if (r0 == 0) goto L_0x01c1
            android.content.Context r0 = r7.mo27827K0()
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.lang.String r3 = "enabled_notification_listeners"
            java.lang.String r0 = android.provider.Settings.Secure.getString(r0, r3)
            if (r0 == 0) goto L_0x01af
            com.arlosoft.macrodroid.app.MacroDroidApplication r3 = com.arlosoft.macrodroid.app.MacroDroidApplication.m14845u()
            java.lang.String r3 = r3.getPackageName()
            boolean r3 = r0.contains(r3)
            if (r3 == 0) goto L_0x01af
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r3 < r4) goto L_0x01c1
            java.lang.Class<com.arlosoft.macrodroid.triggers.services.NotificationServiceOreo> r3 = com.arlosoft.macrodroid.triggers.services.NotificationServiceOreo.class
            java.lang.String r3 = r3.getName()
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L_0x01c1
        L_0x01af:
            java.lang.String r0 = "Notification access for MacroDroid is not enabled"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
            android.content.Context r0 = r7.mo27827K0()
            java.lang.String r1 = r7.mo25559a1()
            r3 = 6
            p112j2.C7439d0.m30911p0(r0, r1, r3)
            return r2
        L_0x01c1:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r0 < r3) goto L_0x01f1
            boolean r0 = r7.mo25672e2()
            if (r0 == 0) goto L_0x01f1
            android.content.Context r0 = r7.mo27827K0()
            java.lang.String r3 = "notification"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            boolean r0 = r0.isNotificationPolicyAccessGranted()
            if (r0 != 0) goto L_0x01f1
            java.lang.String r0 = "Notification policy access for MacroDroid is not enabled"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
            android.content.Context r0 = r7.mo27827K0()
            java.lang.String r1 = r7.mo25559a1()
            r3 = 7
            p112j2.C7439d0.m30911p0(r0, r1, r3)
            return r2
        L_0x01f1:
            boolean r0 = r7.mo25569i2()
            if (r0 == 0) goto L_0x0214
            android.content.Context r0 = r7.mo27827K0()
            boolean r0 = com.arlosoft.macrodroid.common.C4031k.m15908h(r0)
            if (r0 != 0) goto L_0x0214
            java.lang.String r0 = "Default app permission for MacroDroid is not enabled"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
            android.content.Context r0 = r7.mo27827K0()
            java.lang.String r1 = r7.mo25559a1()
            r3 = 12
            p112j2.C7439d0.m30911p0(r0, r1, r3)
            return r2
        L_0x0214:
            android.util.Pair r0 = r7.mo24959p2()
            if (r0 == 0) goto L_0x0256
            java.lang.Object r3 = r0.first
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r4 = com.arlosoft.macrodroid.common.C4031k.m15904d()
            if (r3 <= r4) goto L_0x0256
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "MacroDroid Helper APK (v"
            r3.append(r4)
            java.lang.Object r4 = r0.second
            java.lang.String r4 = (java.lang.String) r4
            r3.append(r4)
            java.lang.String r4 = ") must be installed to use this feature."
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r3)
            android.content.Context r3 = r7.mo27827K0()
            java.lang.String r4 = r7.mo25559a1()
            r5 = 13
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            p112j2.C7439d0.m30913q0(r3, r4, r5, r0)
        L_0x0256:
            java.lang.String[] r0 = r7.mo24727c1()
            if (r0 == 0) goto L_0x0294
            int r3 = r0.length
            r4 = 0
        L_0x025e:
            if (r4 >= r3) goto L_0x0294
            r5 = r0[r4]
            android.content.Context r6 = r7.mo27827K0()
            int r6 = androidx.core.content.ContextCompat.checkSelfPermission(r6, r5)
            if (r6 == 0) goto L_0x0291
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Permission "
            r0.append(r3)
            r0.append(r5)
            java.lang.String r3 = " for MacroDroid is not enabled"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
            android.content.Context r0 = r7.mo27827K0()
            java.lang.String r3 = r7.mo25559a1()
            p112j2.C7439d0.m30909o0(r0, r5, r3, r1, r2)
            return r2
        L_0x0291:
            int r4 = r4 + 1
            goto L_0x025e
        L_0x0294:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.common.SelectableItem.mo27839Y():boolean");
    }

    /* renamed from: Y0 */
    public Long mo27840Y0() {
        Macro macro = this.m_macro;
        if (macro != null) {
            return Long.valueOf(macro.getGUID());
        }
        return 0L;
    }

    @NonNull
    /* renamed from: Z0 */
    public String mo24798Z0() {
        Macro macro = this.m_macro;
        if (macro != null) {
            return macro.getName();
        }
        C4878b.m18882u("No macro set for " + mo24738G0() + " cannot get macro name");
        return "";
    }

    /* renamed from: a0 */
    public boolean mo24825a0() {
        return true;
    }

    /* renamed from: a1 */
    public String mo25559a1() {
        return m15535j1(mo24673T0().mo27893k());
    }

    /* renamed from: a2 */
    public void mo27841a2() {
        mo27871v1();
    }

    /* renamed from: c0 */
    public void mo27842c0() {
        this.hasEdited = false;
        this.hasCommentEdited = false;
        for (SelectableItem next : mo27826J0()) {
            if (next != null) {
                next.mo27842c0();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c1 */
    public String[] mo24727c1() {
        return new String[0];
    }

    /* renamed from: c2 */
    public void mo26119c2() {
    }

    /* renamed from: d0 */
    public void mo25118d0() {
    }

    /* renamed from: d1 */
    public String[] mo24826d1() {
        return new String[0];
    }

    /* renamed from: d2 */
    public void mo27843d2(Constraint constraint) {
        this.m_constraintList.remove(constraint);
        constraint.mo28113U2();
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e0 */
    public boolean mo27845e0(TriggerContextInfo triggerContextInfo) {
        return mo27846f0(triggerContextInfo, false);
    }

    /* renamed from: e1 */
    public String[] mo24700e1() {
        return mo24727c1();
    }

    /* renamed from: e2 */
    public boolean mo25672e2() {
        return false;
    }

    /* renamed from: f0 */
    public boolean mo27846f0(TriggerContextInfo triggerContextInfo, boolean z) {
        if (this.m_isDisabled) {
            return false;
        }
        if (mo27826J0().size() == 0) {
            return true;
        }
        if (!this.m_isOrCondition) {
            for (Constraint next : mo27826J0()) {
                if (next.mo27822G1() && !next.mo28033Q2(triggerContextInfo)) {
                    if (!mo27837X0().isExcludedFromLog()) {
                        if (z) {
                            C4878b.m18863b(mo24695W0() + mo24728k1(triggerContextInfo) + " If condition failed: " + next.mo24738G0() + " (" + this.m_macro.getName() + ")", mo27840Y0().longValue());
                        } else {
                            C4878b.m18863b(mo24695W0() + mo24728k1(triggerContextInfo) + " did not invoke because constraint failed: " + next.mo24728k1(triggerContextInfo), mo27840Y0().longValue());
                        }
                    }
                    return false;
                }
            }
            return true;
        }
        int i = 0;
        for (Constraint next2 : mo27826J0()) {
            if (next2.mo27822G1()) {
                i++;
                if (next2.mo28033Q2(triggerContextInfo)) {
                    return true;
                }
            }
        }
        if (i > 0 && !mo27837X0().isExcludedFromLog()) {
            C4878b.m18863b(mo24695W0() + mo24728k1(triggerContextInfo) + " did not invoke because no constraints were true (" + mo25559a1() + ")", mo27840Y0().longValue());
        }
        if (i <= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f1 */
    public long mo27847f1() {
        if (this.m_SIGUID == 0) {
            this.m_SIGUID = UUID.randomUUID().getLeastSignificantBits();
        }
        return this.m_SIGUID;
    }

    /* renamed from: f2 */
    public boolean mo24749f2() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g0 */
    public void mo27848g0() {
        if (mo27836X()) {
            mo24883h0();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h0 */
    public AlertDialog mo24883h0() {
        String[] g1 = mo24676g1();
        if (g1 == null || g1.length == 0) {
            return null;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((CharSequence) mo24772h1());
        builder.setSingleChoiceItems((CharSequence[]) g1, mo24671D0(), (DialogInterface.OnClickListener) new C4077y0(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C4079z0(this));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3995a1(this));
        AlertDialog create = builder.create();
        create.show();
        create.setOnCancelListener(new C4075x0(this));
        if (g1.length > 50) {
            ListView listView = create.getListView();
            listView.setFastScrollEnabled(true);
            listView.setPadding(0, 0, mo27827K0().getResources().getDimensionPixelSize(C17529R$dimen.fast_scroll_padding), 0);
            listView.setScrollBarStyle(33554432);
        }
        return create;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        return mo27827K0().getString(C17541R$string.select_option);
    }

    /* renamed from: h2 */
    public boolean mo24893h2() {
        return false;
    }

    /* renamed from: i0 */
    public void mo27849i0(Constraint constraint) {
        this.m_constraintList.remove(constraint);
    }

    /* renamed from: i2 */
    public boolean mo25569i2() {
        return false;
    }

    /* renamed from: j0 */
    public Activity mo27850j0() {
        WeakReference<Activity> weakReference = this.m_activityRef;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    /* renamed from: j2 */
    public boolean mo24958j2() {
        return false;
    }

    /* renamed from: k0 */
    public List<String> mo25570k0() {
        return mo24673T0().mo27889c();
    }

    /* renamed from: k1 */
    public String mo24728k1(TriggerContextInfo triggerContextInfo) {
        return mo24674U0();
    }

    /* renamed from: k2 */
    public boolean mo27851k2() {
        for (String equals : mo24727c1()) {
            if (equals.equals("android.permission.ACCESS_FINE_LOCATION")) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l0 */
    public int mo24705l0() {
        return C17542R$style.Theme_App_Dialog;
    }

    /* renamed from: l2 */
    public boolean mo27852l2() {
        return false;
    }

    /* renamed from: m0 */
    public ArrayList<MacroDroidVariable> mo27853m0() {
        ArrayList<MacroDroidVariable> arrayList = new ArrayList<>();
        Macro macro = this.m_macro;
        if (macro != null) {
            for (MacroDroidVariable next : macro.getLocalVariablesSortedForDirection(false)) {
                if (next.mo27748X()) {
                    arrayList.add(next);
                }
            }
        }
        arrayList.addAll(C4064u.m16048t().mo27988m());
        return arrayList;
    }

    /* renamed from: m1 */
    public String mo27854m1() {
        return mo24674U0();
    }

    /* renamed from: m2 */
    public boolean mo24739m2() {
        return false;
    }

    /* renamed from: n0 */
    public ArrayList<MacroDroidVariable> mo27855n0() {
        ArrayList<MacroDroidVariable> arrayList = new ArrayList<>();
        Macro macro = this.m_macro;
        if (macro != null) {
            for (MacroDroidVariable next : macro.getLocalVariablesSorted()) {
                if (next.mo27749Y()) {
                    arrayList.add(next);
                }
            }
        }
        arrayList.addAll(C4064u.m16048t().mo27985j());
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n1 */
    public List<Trigger> mo27856n1() {
        if (mo27837X0() != null) {
            return mo27837X0().getTriggerList();
        }
        return new ArrayList();
    }

    /* renamed from: n2 */
    public boolean mo25733n2() {
        return false;
    }

    /* renamed from: o0 */
    public ArrayList<MacroDroidVariable> mo27857o0() {
        ArrayList<MacroDroidVariable> arrayList = new ArrayList<>();
        Macro macro = this.m_macro;
        if (macro != null) {
            for (MacroDroidVariable next : macro.getLocalVariablesSorted()) {
                if (next.mo27750Z()) {
                    arrayList.add(next);
                }
            }
        }
        arrayList.addAll(C4064u.m16048t().mo27986k());
        return arrayList;
    }

    /* renamed from: o2 */
    public boolean mo27858o2(int i) {
        Pair<Integer, String> p2 = mo24959p2();
        if (p2 != null && ((Integer) p2.first).intValue() > i) {
            return true;
        }
        return false;
    }

    /* renamed from: p0 */
    public ArrayList<MacroDroidVariable> mo27859p0() {
        ArrayList<MacroDroidVariable> arrayList = new ArrayList<>();
        Macro macro = this.m_macro;
        if (macro != null) {
            for (MacroDroidVariable next : macro.getLocalVariablesSorted()) {
                if (next.mo27748X() || next.mo27751a0()) {
                    arrayList.add(next);
                }
            }
        }
        arrayList.addAll(C4064u.m16048t().mo27987l());
        return arrayList;
    }

    /* renamed from: p1 */
    public List<MacroDroidVariable> mo27860p1(int i) {
        if (i == 0) {
            return mo27855n0();
        }
        if (i == 1) {
            return mo27865s0();
        }
        if (i == 2) {
            return mo27875y0();
        }
        if (i == 3) {
            return mo27857o0();
        }
        if (i == 4) {
            return mo27862q0();
        }
        if (i != 5) {
            return new ArrayList();
        }
        return mo27853m0();
    }

    @Nullable
    /* renamed from: p2 */
    public Pair<Integer, String> mo24959p2() {
        return null;
    }

    /* renamed from: q */
    public MacroDroidVariable mo27861q(String str) {
        Macro macro = this.m_macro;
        if (macro != null) {
            for (MacroDroidVariable next : macro.getLocalVariables()) {
                if (next.getName().equals(str)) {
                    return next;
                }
            }
        }
        return C4064u.m16048t().mo27996w(str);
    }

    /* renamed from: q0 */
    public ArrayList<MacroDroidVariable> mo27862q0() {
        ArrayList<MacroDroidVariable> arrayList = new ArrayList<>();
        Macro macro = this.m_macro;
        if (macro != null) {
            for (MacroDroidVariable next : macro.getLocalVariablesSortedForDirection(false)) {
                if (next.mo27751a0() && !next.mo27748X()) {
                    arrayList.add(next);
                }
            }
        }
        arrayList.addAll(C4064u.m16048t().mo27988m());
        return arrayList;
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, @Nullable Intent intent) {
    }

    /* renamed from: q2 */
    public boolean mo24773q2() {
        return false;
    }

    /* renamed from: r0 */
    public ArrayList<MacroDroidVariable> mo27863r0() {
        ArrayList<MacroDroidVariable> arrayList = new ArrayList<>();
        Macro macro = this.m_macro;
        if (macro != null) {
            for (MacroDroidVariable next : macro.getLocalVariablesSortedForDirection(true)) {
                if (next.mo27756d0()) {
                    arrayList.add(next);
                }
            }
        }
        arrayList.addAll(C4064u.m16048t().mo27991p());
        return arrayList;
    }

    /* renamed from: r1 */
    public void mo27864r1() {
    }

    /* renamed from: r2 */
    public boolean mo25499r2() {
        return false;
    }

    /* renamed from: s0 */
    public ArrayList<MacroDroidVariable> mo27865s0() {
        ArrayList<MacroDroidVariable> arrayList = new ArrayList<>();
        Macro macro = this.m_macro;
        if (macro != null) {
            for (MacroDroidVariable next : macro.getLocalVariablesSorted()) {
                if (next.mo27753b0()) {
                    arrayList.add(next);
                }
            }
        }
        arrayList.addAll(C4064u.m16048t().mo27989n());
        return arrayList;
    }

    /* renamed from: s1 */
    public void mo25307s1(Object obj) {
    }

    /* renamed from: s2 */
    public boolean mo27866s2() {
        return false;
    }

    /* renamed from: t0 */
    public ArrayList<MacroDroidVariable> mo27867t0() {
        ArrayList<MacroDroidVariable> arrayList = new ArrayList<>();
        Macro macro = this.m_macro;
        if (macro != null) {
            for (MacroDroidVariable next : macro.getLocalVariablesSorted()) {
                if (next.mo27753b0() || next.mo27750Z()) {
                    arrayList.add(next);
                }
            }
        }
        arrayList.addAll(C4064u.m16048t().mo27990o());
        return arrayList;
    }

    /* renamed from: t2 */
    public boolean mo27868t2() {
        return false;
    }

    /* renamed from: u0 */
    public ArrayList<MacroDroidVariable> mo27869u0() {
        ArrayList<MacroDroidVariable> arrayList = new ArrayList<>();
        Macro macro = this.m_macro;
        if (macro != null) {
            for (MacroDroidVariable next : macro.getLocalVariablesSortedForDirection(false)) {
                if (next.mo27749Y()) {
                    arrayList.add(next);
                }
            }
        }
        arrayList.addAll(C4064u.m16048t().mo27985j());
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        String[] g1 = mo24676g1();
        if (g1 == null || g1.length <= 0) {
            mo24689O1();
        } else {
            mo27848g0();
        }
    }

    /* renamed from: u2 */
    public boolean mo25103u2() {
        return false;
    }

    /* renamed from: v0 */
    public ArrayList<MacroDroidVariable> mo27870v0() {
        ArrayList<MacroDroidVariable> arrayList = new ArrayList<>();
        Macro macro = this.m_macro;
        if (macro != null) {
            for (MacroDroidVariable next : macro.getLocalVariablesSortedForDirection(false)) {
                if (next.mo27756d0()) {
                    arrayList.add(next);
                }
            }
        }
        arrayList.addAll(C4064u.m16048t().mo27991p());
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v1 */
    public void mo27871v1() {
        if (mo27836X()) {
            m15516C1();
            mo24714u1();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
    }

    /* renamed from: w0 */
    public ArrayList<MacroDroidVariable> mo27872w0() {
        ArrayList<MacroDroidVariable> arrayList = new ArrayList<>();
        Macro macro = this.m_macro;
        if (macro != null) {
            arrayList.addAll(macro.getLocalVariablesForDirection(false));
        }
        arrayList.addAll(C4064u.m16048t().mo27993r(true));
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w1 */
    public void mo24706w1() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: w2 */
    public void mo27873w2() {
        if (mo27836X()) {
            mo24677v2();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.m_SIGUID);
        parcel.writeList(this.m_constraintList);
        parcel.writeInt(this.m_isOrCondition ? 1 : 0);
        parcel.writeInt(this.m_isDisabled ? 1 : 0);
        parcel.writeString(this.m_comment);
        parcel.writeInt(this.isCollapsed ? 1 : 0);
    }

    /* renamed from: x0 */
    public ArrayList<MacroDroidVariable> mo27874x0() {
        ArrayList arrayList = new ArrayList();
        Macro macro = this.m_macro;
        if (macro != null) {
            arrayList.addAll(macro.getLocalVariablesForDirection(false));
        }
        arrayList.addAll(C4064u.m16048t().mo27993r(true));
        ArrayList<MacroDroidVariable> arrayList2 = new ArrayList<>();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MacroDroidVariable macroDroidVariable = (MacroDroidVariable) it.next();
            if (macroDroidVariable.mo27756d0() || macroDroidVariable.mo27751a0() || macroDroidVariable.mo27748X()) {
                arrayList2.add(macroDroidVariable);
            }
        }
        return arrayList2;
    }

    /* renamed from: x1 */
    public void mo25283x1() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
    }

    /* renamed from: y0 */
    public ArrayList<MacroDroidVariable> mo27875y0() {
        ArrayList<MacroDroidVariable> arrayList = new ArrayList<>();
        Macro macro = this.m_macro;
        if (macro != null) {
            for (MacroDroidVariable next : macro.getLocalVariablesSorted()) {
                if (next.mo27756d0()) {
                    arrayList.add(next);
                }
            }
        }
        arrayList.addAll(C4064u.m16048t().mo27991p());
        return arrayList;
    }

    /* renamed from: y1 */
    public boolean mo27876y1(Activity activity) {
        return C7439d0.m30854A(activity, this, true, false);
    }

    /* renamed from: y2 */
    public void mo27877y2(Activity activity) {
        this.m_activityRef = new WeakReference<>(activity);
    }

    /* renamed from: z1 */
    public boolean mo27878z1() {
        return this.hasEdited;
    }

    /* renamed from: z2 */
    public void mo27879z2(boolean z) {
        this.isCollapsed = z;
    }

    protected SelectableItem(Parcel parcel) {
        this();
        mo25154D1();
        this.m_SIGUID = parcel.readLong();
        this.m_constraintList = parcel.readArrayList(Constraint.class.getClassLoader());
        boolean z = true;
        this.m_isOrCondition = parcel.readInt() != 0;
        this.m_isDisabled = parcel.readInt() != 0;
        this.m_comment = parcel.readString();
        this.isCollapsed = parcel.readInt() == 0 ? false : z;
    }
}
