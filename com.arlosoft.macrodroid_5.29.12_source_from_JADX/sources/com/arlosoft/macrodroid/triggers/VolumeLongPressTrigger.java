package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.events.ListenForVolumeLongPressEvent;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p119k3.C7494e2;
import p150q2.C8164a;
import p161s1.C10180a;

/* compiled from: VolumeLongPressedTrigger.kt */
public final class VolumeLongPressTrigger extends Trigger {
    public static final Parcelable.Creator<VolumeLongPressTrigger> CREATOR = new C5768a();

    /* renamed from: d */
    public static final C5769b f13729d = new C5769b((C13695i) null);
    private boolean isNew;
    private int option;

    /* renamed from: com.arlosoft.macrodroid.triggers.VolumeLongPressTrigger$a */
    /* compiled from: VolumeLongPressedTrigger.kt */
    public static final class C5768a implements Parcelable.Creator<VolumeLongPressTrigger> {
        C5768a() {
        }

        /* renamed from: a */
        public VolumeLongPressTrigger createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new VolumeLongPressTrigger(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public VolumeLongPressTrigger[] newArray(int i) {
            return new VolumeLongPressTrigger[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.VolumeLongPressTrigger$b */
    /* compiled from: VolumeLongPressedTrigger.kt */
    public static final class C5769b {
        private C5769b() {
        }

        public /* synthetic */ C5769b(C13695i iVar) {
            this();
        }
    }

    public VolumeLongPressTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ VolumeLongPressTrigger(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: i3 */
    private final String[] m23539i3() {
        String j1 = SelectableItem.m15535j1(C17541R$string.trigger_volume_button_up);
        C13706o.m87928e(j1, "getString(R.string.trigger_volume_button_up)");
        String j12 = SelectableItem.m15535j1(C17541R$string.trigger_volume_button_down);
        C13706o.m87928e(j12, "getString(R.string.trigger_volume_button_down)");
        return new String[]{j1, j12};
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public static final void m23540j3(VolumeLongPressTrigger volumeLongPressTrigger, DialogInterface dialogInterface, int i) {
        C13706o.m87929f(volumeLongPressTrigger, "this$0");
        super.mo25540W1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.option;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return m23539i3()[this.option];
    }

    /* renamed from: S2 */
    public void mo30885S2() {
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7494e2.f18352l.mo37639a();
    }

    /* renamed from: U0 */
    public String mo24674U0() {
        return mo24738G0() + " (" + mo24672O0() + ')';
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        if (ContextCompat.checkSelfPermission(mo27827K0(), "android.permission.SET_VOLUME_KEY_LONG_PRESS_LISTENER") != 0 && C8164a.m33886a()) {
            C4061t1.m15947B0(new String[]{"pm grant com.arlosoft.macrodroid android.permission.SET_VOLUME_KEY_LONG_PRESS_LISTENER"});
        }
        C10180a.m40075a().mo80018i(new ListenForVolumeLongPressEvent());
    }

    /* renamed from: W1 */
    public void mo25540W1() {
        if (this.isNew) {
            AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
            builder.setMessage((int) C17541R$string.trigger_volume_long_press_warning);
            builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C6202y8(this));
            builder.show();
            return;
        }
        super.mo25540W1();
    }

    /* renamed from: c3 */
    public void mo31545c3() {
        if (mo27822G1() && mo27837X0().isEnabled() && ContextCompat.checkSelfPermission(mo27827K0(), "android.permission.SET_VOLUME_KEY_LONG_PRESS_LISTENER") == 0) {
            C10180a.m40075a().mo80018i(new ListenForVolumeLongPressEvent());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m23539i3();
    }

    /* renamed from: h3 */
    public final int mo31600h3() {
        return this.option;
    }

    /* renamed from: q2 */
    public boolean mo24773q2() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        this.isNew = false;
        super.mo24677v2();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.option);
        parcel.writeInt(this.isNew ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.option = i;
    }

    public VolumeLongPressTrigger() {
        this.isNew = true;
    }

    private VolumeLongPressTrigger(Parcel parcel) {
        super(parcel);
        boolean z = true;
        this.isNew = true;
        this.option = parcel.readInt();
        this.isNew = parcel.readInt() == 0 ? false : z;
    }
}
