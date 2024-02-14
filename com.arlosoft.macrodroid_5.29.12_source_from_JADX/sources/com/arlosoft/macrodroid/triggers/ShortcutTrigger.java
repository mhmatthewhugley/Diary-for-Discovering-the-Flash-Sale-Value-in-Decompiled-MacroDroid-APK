package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.macro.Macro;
import p119k3.C7553s1;

public class ShortcutTrigger extends Trigger {
    public static final Parcelable.Creator<ShortcutTrigger> CREATOR = new C5740a();

    /* renamed from: com.arlosoft.macrodroid.triggers.ShortcutTrigger$a */
    class C5740a implements Parcelable.Creator<ShortcutTrigger> {
        C5740a() {
        }

        /* renamed from: a */
        public ShortcutTrigger createFromParcel(Parcel parcel) {
            return new ShortcutTrigger(parcel, (C5740a) null);
        }

        /* renamed from: b */
        public ShortcutTrigger[] newArray(int i) {
            return new ShortcutTrigger[i];
        }
    }

    /* synthetic */ ShortcutTrigger(Parcel parcel, C5740a aVar) {
        this(parcel);
    }

    /* renamed from: B1 */
    public boolean mo24788B1() {
        return false;
    }

    /* renamed from: S2 */
    public void mo30885S2() {
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7553s1.m31438u();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
    }

    public ShortcutTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public ShortcutTrigger() {
    }

    private ShortcutTrigger(Parcel parcel) {
        super(parcel);
    }
}
