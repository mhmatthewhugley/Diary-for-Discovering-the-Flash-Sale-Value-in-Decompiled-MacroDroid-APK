package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.MacroDroidService;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.triggers.activities.selecticon.IconSelectActivity;
import p128m0.C7842s3;

public class SetMacroDroidIconAction extends Action {
    public static final Parcelable.Creator<SetMacroDroidIconAction> CREATOR = new C2642a();
    private static final int REQUEST_CODE_SELECT_ICON = 9874583;
    private String m_imageResourceName;

    /* renamed from: com.arlosoft.macrodroid.action.SetMacroDroidIconAction$a */
    class C2642a implements Parcelable.Creator<SetMacroDroidIconAction> {
        C2642a() {
        }

        /* renamed from: a */
        public SetMacroDroidIconAction createFromParcel(Parcel parcel) {
            return new SetMacroDroidIconAction(parcel, (C2642a) null);
        }

        /* renamed from: b */
        public SetMacroDroidIconAction[] newArray(int i) {
            return new SetMacroDroidIconAction[i];
        }
    }

    /* synthetic */ SetMacroDroidIconAction(Parcel parcel, C2642a aVar) {
        this(parcel);
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7842s3.m32783u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        C5163j2.m19943C4(mo27827K0(), C4061t1.m15976V(mo27827K0(), this.m_imageResourceName));
        C5163j2.m19951D4(mo27827K0(), this.m_imageResourceName);
        MacroDroidService.m9502g(mo27827K0(), true);
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        mo27877y2(activity);
        if (i == REQUEST_CODE_SELECT_ICON && i2 != 0) {
            this.m_imageResourceName = intent.getStringExtra("drawableName");
            mo24689O1();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        Activity j0 = mo27850j0();
        Intent intent = new Intent(j0, IconSelectActivity.class);
        intent.putExtra("DisplayAppIcons", false);
        j0.startActivityForResult(intent, REQUEST_CODE_SELECT_ICON);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_imageResourceName);
    }

    public SetMacroDroidIconAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private SetMacroDroidIconAction() {
    }

    private SetMacroDroidIconAction(Parcel parcel) {
        super(parcel);
        this.m_imageResourceName = parcel.readString();
    }
}
