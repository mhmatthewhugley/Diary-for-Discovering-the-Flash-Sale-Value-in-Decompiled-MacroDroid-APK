package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.WindowManager;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatDialog;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4008f;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.utils.C6367b0;
import p119k3.C7483c;

public class AndroidWearTrigger extends Trigger {
    public static final Parcelable.Creator<AndroidWearTrigger> CREATOR = new C5594b();

    /* renamed from: d */
    public static boolean f13569d = false;
    private static int s_triggerCounter;
    private int m_option;
    /* access modifiers changed from: private */
    public String m_resourceName;

    /* renamed from: com.arlosoft.macrodroid.triggers.AndroidWearTrigger$a */
    class C5593a implements C4008f.C4009a {

        /* renamed from: a */
        final /* synthetic */ AppCompatDialog f13570a;

        C5593a(AppCompatDialog appCompatDialog) {
            this.f13570a = appCompatDialog;
        }

        /* renamed from: a */
        public void mo27911a(String str) {
            String unused = AndroidWearTrigger.this.m_resourceName = str;
            this.f13570a.dismiss();
            AndroidWearTrigger.this.mo24689O1();
        }

        /* renamed from: b */
        public void mo27912b(String str) {
        }
    }

    /* renamed from: com.arlosoft.macrodroid.triggers.AndroidWearTrigger$b */
    class C5594b implements Parcelable.Creator<AndroidWearTrigger> {
        C5594b() {
        }

        /* renamed from: a */
        public AndroidWearTrigger createFromParcel(Parcel parcel) {
            return new AndroidWearTrigger(parcel, (C5593a) null);
        }

        /* renamed from: b */
        public AndroidWearTrigger[] newArray(int i) {
            return new AndroidWearTrigger[i];
        }
    }

    /* synthetic */ AndroidWearTrigger(Parcel parcel, C5593a aVar) {
        this(parcel);
    }

    /* renamed from: h3 */
    private void m21450h3() {
        AppCompatDialog appCompatDialog = new AppCompatDialog(mo27850j0(), mo24688L0());
        appCompatDialog.setContentView((int) C17535R$layout.select_icon_android_wear);
        appCompatDialog.setTitle((int) C17541R$string.select_icon);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(appCompatDialog.getWindow().getAttributes());
        layoutParams.width = -1;
        appCompatDialog.getWindow().setAttributes(layoutParams);
        ((ListView) appCompatDialog.findViewById(C17532R$id.select_icon_list)).setAdapter(new C4008f(mo27827K0(), C6367b0.f14957a, new C5593a(appCompatDialog)));
        appCompatDialog.show();
    }

    /* renamed from: j3 */
    private String[] m21451j3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.trigger_android_wear_app), SelectableItem.m15535j1(C17541R$string.trigger_android_wear_connect), SelectableItem.m15535j1(C17541R$string.trigger_android_wear_disconnect)};
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_option;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return m21451j3()[this.m_option];
    }

    /* renamed from: S2 */
    public void mo30885S2() {
        s_triggerCounter--;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7483c.m31102u();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
        s_triggerCounter++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m21451j3();
    }

    /* renamed from: i3 */
    public int mo30904i3() {
        return this.m_option;
    }

    /* renamed from: k3 */
    public String mo30905k3() {
        return this.m_resourceName;
    }

    /* renamed from: l3 */
    public void mo30906l3() {
        this.m_option = 0;
        m21450h3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        if (this.m_option == 0) {
            m21450h3();
        } else {
            mo24689O1();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_option);
        parcel.writeString(this.m_resourceName);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_option = i;
    }

    public AndroidWearTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public AndroidWearTrigger() {
        f13569d = true;
    }

    private AndroidWearTrigger(Parcel parcel) {
        super(parcel);
        this.m_option = parcel.readInt();
        this.m_resourceName = parcel.readString();
    }
}
