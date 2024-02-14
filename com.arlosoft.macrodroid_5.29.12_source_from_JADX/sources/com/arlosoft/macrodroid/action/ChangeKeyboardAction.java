package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.ContentResolver;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p128m0.C7805o;
import p150q2.C8164a;

/* compiled from: ChangeKeyboardAction.kt */
public final class ChangeKeyboardAction extends Action {
    public static final Parcelable.Creator<ChangeKeyboardAction> CREATOR = new C2348a();

    /* renamed from: d */
    public static final C2349b f7160d = new C2349b((C13695i) null);
    private String keyboardId;
    private String keyboardName;

    /* renamed from: com.arlosoft.macrodroid.action.ChangeKeyboardAction$a */
    /* compiled from: ChangeKeyboardAction.kt */
    public static final class C2348a implements Parcelable.Creator<ChangeKeyboardAction> {
        C2348a() {
        }

        /* renamed from: a */
        public ChangeKeyboardAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new ChangeKeyboardAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public ChangeKeyboardAction[] newArray(int i) {
            return new ChangeKeyboardAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.ChangeKeyboardAction$b */
    /* compiled from: ChangeKeyboardAction.kt */
    public static final class C2349b {
        private C2349b() {
        }

        public /* synthetic */ C2349b(C13695i iVar) {
            this();
        }
    }

    public ChangeKeyboardAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ ChangeKeyboardAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: j3 */
    private final List<InputMethodInfo> m9941j3() {
        Object systemService = mo27827K0().getSystemService("input_method");
        C13706o.m87927d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        List<InputMethodInfo> enabledInputMethodList = ((InputMethodManager) systemService).getEnabledInputMethodList();
        C13706o.m87928e(enabledInputMethodList, "imeManager.enabledInputMethodList");
        return enabledInputMethodList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        List<InputMethodInfo> j3 = m9941j3();
        int size = j3.size();
        for (int i = 0; i < size; i++) {
            if (C13706o.m87924a(j3.get(i).getId(), this.keyboardId)) {
                return i;
            }
        }
        this.keyboardName = j3.get(0).loadLabel(mo27827K0().getPackageManager()).toString();
        String id = j3.get(0).getId();
        C13706o.m87928e(id, "keyboards[0].id");
        this.keyboardId = id;
        return 0;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.keyboardName;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7805o.f18827l.mo37763a();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + mo24672O0() + ')';
    }

    /* access modifiers changed from: protected */
    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        boolean z = true;
        boolean z2 = false;
        if (!C8164a.m33886a()) {
            try {
                String string = Settings.Secure.getString(mo27827K0().getContentResolver(), "enabled_input_methods");
                C13706o.m87928e(string, "currentSettings");
                if (!C15177w.m93663N(string, this.keyboardId, false, 2, (Object) null)) {
                    ContentResolver contentResolver = mo27827K0().getContentResolver();
                    z = true & Settings.Secure.putString(contentResolver, "enabled_input_methods", string + ':' + this.keyboardId);
                }
                z2 = z & Settings.Secure.putString(mo27827K0().getContentResolver(), "default_input_method", this.keyboardId);
            } catch (Exception unused) {
            }
            if (!z2) {
                Long Y0 = mo27840Y0();
                C13706o.m87928e(Y0, "macroGuid");
                C4878b.m18869h("Could not set default keyboard, you need to grant permission via adb with the command: adb shell pm grant com.arlosoft.macrodroid android.permission.WRITE_SECURE_SETTINGS", Y0.longValue());
                return;
            }
            return;
        }
        C4061t1.m15947B0(new String[]{"settings put secure enabled_input_methods " + this.keyboardId});
        C4061t1.m15947B0(new String[]{"settings put secure default_input_method " + this.keyboardId});
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        List<InputMethodInfo> j3 = m9941j3();
        ArrayList arrayList = new ArrayList();
        for (InputMethodInfo loadLabel : j3) {
            arrayList.add(loadLabel.loadLabel(mo27827K0().getPackageManager()).toString());
        }
        Object[] array = arrayList.toArray(new String[0]);
        C13706o.m87927d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.keyboardId);
        parcel.writeString(this.keyboardName);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        List<InputMethodInfo> j3 = m9941j3();
        String id = j3.get(i).getId();
        C13706o.m87928e(id, "keyboards[item].id");
        this.keyboardId = id;
        this.keyboardName = j3.get(i).loadLabel(mo27827K0().getPackageManager()).toString();
    }

    public ChangeKeyboardAction() {
        this.keyboardId = "";
        this.keyboardName = "";
    }

    private ChangeKeyboardAction(Parcel parcel) {
        super(parcel);
        this.keyboardId = "";
        this.keyboardName = "";
        String readString = parcel.readString();
        C13706o.m87926c(readString);
        this.keyboardId = readString;
        String readString2 = parcel.readString();
        C13706o.m87926c(readString2);
        this.keyboardName = readString2;
    }
}
