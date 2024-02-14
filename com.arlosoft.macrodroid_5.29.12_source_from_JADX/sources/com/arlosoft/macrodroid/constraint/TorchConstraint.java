package com.arlosoft.macrodroid.constraint;

import android.app.Activity;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p123l1.C7600c1;

/* compiled from: TorchConstraint.kt */
public final class TorchConstraint extends Constraint {
    public static final Parcelable.Creator<TorchConstraint> CREATOR = new C4204a();

    /* renamed from: f */
    public static final C4205b f10771f = new C4205b((C13695i) null);
    private int option;
    private final C4206c torchCallback;
    /* access modifiers changed from: private */
    public transient boolean torchOn;

    /* renamed from: com.arlosoft.macrodroid.constraint.TorchConstraint$a */
    /* compiled from: TorchConstraint.kt */
    public static final class C4204a implements Parcelable.Creator<TorchConstraint> {
        C4204a() {
        }

        /* renamed from: a */
        public TorchConstraint createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new TorchConstraint(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public TorchConstraint[] newArray(int i) {
            return new TorchConstraint[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.TorchConstraint$b */
    /* compiled from: TorchConstraint.kt */
    public static final class C4205b {
        private C4205b() {
        }

        public /* synthetic */ C4205b(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.constraint.TorchConstraint$c */
    /* compiled from: TorchConstraint.kt */
    public static final class C4206c extends CameraManager.TorchCallback {

        /* renamed from: a */
        final /* synthetic */ TorchConstraint f10772a;

        C4206c(TorchConstraint torchConstraint) {
            this.f10772a = torchConstraint;
        }

        public void onTorchModeChanged(String str, boolean z) {
            C13706o.m87929f(str, "cameraId");
            super.onTorchModeChanged(str, z);
            this.f10772a.torchOn = z;
        }
    }

    public TorchConstraint(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ TorchConstraint(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: h3 */
    private final String[] m17127h3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.f7056on), SelectableItem.m15535j1(C17541R$string.off)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.option;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        String str = m17127h3()[this.option];
        C13706o.m87928e(str, "getOptions()[option]");
        return str;
    }

    /* renamed from: Q2 */
    public boolean mo28033Q2(TriggerContextInfo triggerContextInfo) {
        if (this.option == 0) {
            return this.torchOn;
        }
        return !this.torchOn;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7600c1.f18507g.mo37664a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: T2 */
    public void mo28052T2() {
        super.mo28052T2();
        Object systemService = mo27827K0().getSystemService("camera");
        C13706o.m87927d(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        ((CameraManager) systemService).unregisterTorchCallback(this.torchCallback);
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo25559a1() + " (" + mo24672O0() + ')';
    }

    /* access modifiers changed from: protected */
    /* renamed from: V2 */
    public void mo28053V2() {
        super.mo28053V2();
        Object systemService = mo27827K0().getSystemService("camera");
        C13706o.m87927d(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        ((CameraManager) systemService).registerTorchCallback(this.torchCallback, (Handler) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m17127h3();
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

    public TorchConstraint() {
        this.torchCallback = new C4206c(this);
    }

    private TorchConstraint(Parcel parcel) {
        super(parcel);
        this.torchCallback = new C4206c(this);
        this.option = parcel.readInt();
    }
}
