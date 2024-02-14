package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p128m0.C7878x4;
import p319lc.C15626c;

/* compiled from: UninstallAppAction.kt */
public final class UninstallAppAction extends Action {
    public static final Parcelable.Creator<UninstallAppAction> CREATOR = new C2772a();

    /* renamed from: d */
    public static final C2773b f7686d = new C2773b((C13695i) null);
    private int option;

    /* renamed from: com.arlosoft.macrodroid.action.UninstallAppAction$a */
    /* compiled from: UninstallAppAction.kt */
    public static final class C2772a implements Parcelable.Creator<UninstallAppAction> {
        C2772a() {
        }

        /* renamed from: a */
        public UninstallAppAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new UninstallAppAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public UninstallAppAction[] newArray(int i) {
            return new UninstallAppAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.UninstallAppAction$b */
    /* compiled from: UninstallAppAction.kt */
    public static final class C2773b {
        private C2773b() {
        }

        public /* synthetic */ C2773b(C13695i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final String[] m13673b() {
            return new String[]{SelectableItem.m15535j1(C17541R$string.enable), SelectableItem.m15535j1(C17541R$string.disable)};
        }
    }

    public UninstallAppAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ UninstallAppAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: B1 */
    public boolean mo24788B1() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.option;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        String str = f7686d.m13673b()[this.option];
        C13706o.m87928e(str, "getOptions()[option]");
        return str;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7878x4.f18945j.mo37777a();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + mo24672O0() + ')';
    }

    /* access modifiers changed from: protected */
    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        try {
            Intent intent = new Intent("android.intent.action.UNINSTALL_PACKAGE");
            intent.setData(Uri.parse("package:uk.co.clayinteractive.fnb.app"));
            intent.putExtra("android.intent.extra.RETURN_RESULT", true);
            intent.addFlags(268435456);
            mo27827K0().startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            C15626c.m94876a(mo27850j0().getApplicationContext(), "Device does not support ACTION_UNINSTALL_PACKAGE intent", 1).show();
        }
    }

    /* renamed from: e2 */
    public boolean mo25672e2() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return f7686d.m13673b();
    }

    /* renamed from: m2 */
    public boolean mo24739m2() {
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.option);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.option = i;
    }

    public UninstallAppAction() {
    }

    private UninstallAppAction(Parcel parcel) {
        super(parcel);
        this.option = parcel.readInt();
    }
}
