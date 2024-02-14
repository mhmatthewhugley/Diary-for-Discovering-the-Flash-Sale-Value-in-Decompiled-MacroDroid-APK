package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p128m0.C7719c5;
import p319lc.C15626c;

public class VoiceSearchAction extends Action {
    public static final Parcelable.Creator<VoiceSearchAction> CREATOR = new C2787a();

    /* renamed from: com.arlosoft.macrodroid.action.VoiceSearchAction$a */
    class C2787a implements Parcelable.Creator<VoiceSearchAction> {
        C2787a() {
        }

        /* renamed from: a */
        public VoiceSearchAction createFromParcel(Parcel parcel) {
            return new VoiceSearchAction(parcel, (C2787a) null);
        }

        /* renamed from: b */
        public VoiceSearchAction[] newArray(int i) {
            return new VoiceSearchAction[i];
        }
    }

    /* synthetic */ VoiceSearchAction(Parcel parcel, C2787a aVar) {
        this(parcel);
    }

    /* renamed from: B1 */
    public boolean mo24788B1() {
        return false;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7719c5.m32186u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        intent.addFlags(268435456);
        try {
            mo27827K0().startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            C15626c.m94876a(mo27827K0().getApplicationContext(), SelectableItem.m15535j1(C17541R$string.voice_search_not_available), 0).show();
        }
    }

    public VoiceSearchAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private VoiceSearchAction() {
    }

    private VoiceSearchAction(Parcel parcel) {
        super(parcel);
    }
}
