package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4031k;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p112j2.C7439d0;
import p119k3.C7527l0;

/* compiled from: HomeButtonLongPressTrigger.kt */
public final class HomeButtonLongPressTrigger extends Trigger {
    public static final Parcelable.Creator<HomeButtonLongPressTrigger> CREATOR = new C5658a();

    /* renamed from: d */
    public static final C5659b f13625d = new C5659b((C13695i) null);
    private static int triggerCount;
    private int option;

    /* renamed from: com.arlosoft.macrodroid.triggers.HomeButtonLongPressTrigger$a */
    /* compiled from: HomeButtonLongPressTrigger.kt */
    public static final class C5658a implements Parcelable.Creator<HomeButtonLongPressTrigger> {
        C5658a() {
        }

        /* renamed from: a */
        public HomeButtonLongPressTrigger createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new HomeButtonLongPressTrigger(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public HomeButtonLongPressTrigger[] newArray(int i) {
            return new HomeButtonLongPressTrigger[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.HomeButtonLongPressTrigger$b */
    /* compiled from: HomeButtonLongPressTrigger.kt */
    public static final class C5659b {
        private C5659b() {
        }

        public /* synthetic */ C5659b(C13695i iVar) {
            this();
        }
    }

    public HomeButtonLongPressTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ HomeButtonLongPressTrigger(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: B1 */
    public boolean mo24788B1() {
        return false;
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        return C4031k.m15908h(mo27827K0());
    }

    /* renamed from: N0 */
    public String mo24938N0() {
        if (!mo24824M1()) {
            return SelectableItem.m15535j1(C17541R$string.requires_assist_and_voice_input);
        }
        return null;
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        triggerCount--;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7527l0.f18406j.mo37646a();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        triggerCount++;
    }

    /* renamed from: i2 */
    public boolean mo25569i2() {
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
    }

    /* renamed from: x1 */
    public void mo25283x1() {
        if (Build.VERSION.SDK_INT >= 24) {
            C7439d0.m30891f0(mo27850j0(), false, false);
        }
    }

    public HomeButtonLongPressTrigger() {
    }

    private HomeButtonLongPressTrigger(Parcel parcel) {
        super(parcel);
    }
}
