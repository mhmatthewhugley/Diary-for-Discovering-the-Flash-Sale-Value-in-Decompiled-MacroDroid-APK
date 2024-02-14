package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.macro.Macro;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p119k3.C7516j0;

/* compiled from: GoogleAssistantTrigger.kt */
public final class GoogleAssistantTrigger extends Trigger {
    public static final Parcelable.Creator<GoogleAssistantTrigger> CREATOR = new C5655a();

    /* renamed from: d */
    public static final C5656b f13623d = new C5656b((C13695i) null);

    /* renamed from: com.arlosoft.macrodroid.triggers.GoogleAssistantTrigger$a */
    /* compiled from: GoogleAssistantTrigger.kt */
    public static final class C5655a implements Parcelable.Creator<GoogleAssistantTrigger> {
        C5655a() {
        }

        /* renamed from: a */
        public GoogleAssistantTrigger createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new GoogleAssistantTrigger(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public GoogleAssistantTrigger[] newArray(int i) {
            return new GoogleAssistantTrigger[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.GoogleAssistantTrigger$b */
    /* compiled from: GoogleAssistantTrigger.kt */
    public static final class C5656b {
        private C5656b() {
        }

        public /* synthetic */ C5656b(C13695i iVar) {
            this();
        }
    }

    public GoogleAssistantTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ GoogleAssistantTrigger(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: B1 */
    public boolean mo24788B1() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S2 */
    public void mo30885S2() {
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7516j0.f18385j.mo37643a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: U2 */
    public void mo30886U2() {
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
    }

    public GoogleAssistantTrigger() {
    }

    private GoogleAssistantTrigger(Parcel parcel) {
        super(parcel);
    }
}
