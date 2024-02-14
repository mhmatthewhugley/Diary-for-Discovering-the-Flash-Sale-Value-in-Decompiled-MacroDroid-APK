package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.media.AudioManager;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6401l0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p128m0.C7765i4;

/* compiled from: SilentModeVibrateOffAction.kt */
public final class SilentModeVibrateOffAction extends Action {
    public static final Parcelable.Creator<SilentModeVibrateOffAction> CREATOR = new C2693a();

    /* renamed from: d */
    public static final C2694b f7592d = new C2694b((C13695i) null);
    private int option;

    /* renamed from: com.arlosoft.macrodroid.action.SilentModeVibrateOffAction$a */
    /* compiled from: SilentModeVibrateOffAction.kt */
    public static final class C2693a implements Parcelable.Creator<SilentModeVibrateOffAction> {
        C2693a() {
        }

        /* renamed from: a */
        public SilentModeVibrateOffAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new SilentModeVibrateOffAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public SilentModeVibrateOffAction[] newArray(int i) {
            return new SilentModeVibrateOffAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SilentModeVibrateOffAction$b */
    /* compiled from: SilentModeVibrateOffAction.kt */
    public static final class C2694b {
        private C2694b() {
        }

        public /* synthetic */ C2694b(C13695i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final String[] m13069b() {
            return new String[]{SelectableItem.m15535j1(C17541R$string.enable), SelectableItem.m15535j1(C17541R$string.disable)};
        }
    }

    public SilentModeVibrateOffAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ SilentModeVibrateOffAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.option;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        String str = f7592d.m13069b()[this.option];
        C13706o.m87928e(str, "getOptions()[option]");
        return str;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7765i4.f18758j.mo37754a();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + mo24672O0() + ')';
    }

    /* access modifiers changed from: protected */
    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        Object systemService = mo27827K0().getSystemService("audio");
        C13706o.m87927d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        AudioManager audioManager = (AudioManager) systemService;
        if (this.option == 0) {
            audioManager.setRingerMode(0);
        } else {
            audioManager.setRingerMode(2);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            C6401l0.m24656b(mo27827K0(), "vibrate_when_ringing", this.option, mo27837X0().getName());
        } else {
            Settings.System.putInt(mo27827K0().getContentResolver(), "vibrate_when_ringing", this.option);
        }
    }

    /* renamed from: e2 */
    public boolean mo25672e2() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return f7592d.m13069b();
    }

    /* renamed from: m2 */
    public boolean mo24739m2() {
        return Build.VERSION.SDK_INT >= 23;
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

    public SilentModeVibrateOffAction() {
    }

    private SilentModeVibrateOffAction(Parcel parcel) {
        super(parcel);
        this.option = parcel.readInt();
    }
}
