package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.ContentResolver;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p128m0.C7750g3;
import p148q0.C8151a;

public class SetAutoSyncAction extends Action {
    public static final Parcelable.Creator<SetAutoSyncAction> CREATOR = new C2626a();
    private boolean m_selectAccounts;
    private int m_state;

    /* renamed from: com.arlosoft.macrodroid.action.SetAutoSyncAction$a */
    class C2626a implements Parcelable.Creator<SetAutoSyncAction> {
        C2626a() {
        }

        /* renamed from: a */
        public SetAutoSyncAction createFromParcel(Parcel parcel) {
            return new SetAutoSyncAction(parcel, (C2626a) null);
        }

        /* renamed from: b */
        public SetAutoSyncAction[] newArray(int i) {
            return new SetAutoSyncAction[i];
        }
    }

    /* synthetic */ SetAutoSyncAction(Parcel parcel, C2626a aVar) {
        this(parcel);
    }

    /* renamed from: j3 */
    private String[] m12306j3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_set_autosync_on), SelectableItem.m15535j1(C17541R$string.action_set_autosync_off), SelectableItem.m15535j1(C17541R$string.action_set_autosync_toggle)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_state;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return m12306j3()[this.m_state];
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7750g3.m32337u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        try {
            int i = this.m_state;
            boolean z = true;
            if (i != 0) {
                if (i == 1) {
                    z = false;
                } else if (i == 2) {
                    z = true ^ ContentResolver.getMasterSyncAutomatically();
                }
            }
            ContentResolver.setMasterSyncAutomatically(z);
        } catch (Exception e) {
            C8151a.m33873n(new RuntimeException("Failed to update background sync: " + e.getMessage()));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m12306j3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_state);
        parcel.writeInt(this.m_selectAccounts ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_state = i;
    }

    public SetAutoSyncAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private SetAutoSyncAction() {
        this.m_state = 0;
    }

    private SetAutoSyncAction(Parcel parcel) {
        super(parcel);
        this.m_state = parcel.readInt();
        this.m_selectAccounts = parcel.readInt() != 0;
    }
}
