package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import p128m0.C7728e;
import p150q2.C8164a;

public class AmbientDisplayAction extends Action {
    public static final Parcelable.Creator<AmbientDisplayAction> CREATOR = new C2331a();
    private int m_option;
    private int m_settingOption;

    /* renamed from: com.arlosoft.macrodroid.action.AmbientDisplayAction$a */
    class C2331a implements Parcelable.Creator<AmbientDisplayAction> {
        C2331a() {
        }

        /* renamed from: a */
        public AmbientDisplayAction createFromParcel(Parcel parcel) {
            return new AmbientDisplayAction(parcel, (C2331a) null);
        }

        /* renamed from: b */
        public AmbientDisplayAction[] newArray(int i) {
            return new AmbientDisplayAction[i];
        }
    }

    /* synthetic */ AmbientDisplayAction(Parcel parcel, C2331a aVar) {
        this(parcel);
    }

    /* renamed from: o3 */
    private String[] m9723o3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.f7056on), SelectableItem.m15535j1(C17541R$string.off), SelectableItem.m15535j1(C17541R$string.toggle)};
    }

    /* renamed from: p3 */
    private String[] m9724p3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.action_ambient_display_wake_for_notifications), SelectableItem.m15535j1(C17541R$string.action_ambient_display_always_on)};
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public /* synthetic */ void m9725q3(DialogInterface dialogInterface, int i) {
        this.m_option = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public /* synthetic */ void m9726r3(DialogInterface dialogInterface, int i) {
        mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public /* synthetic */ void m9727s3(DialogInterface dialogInterface, int i) {
        mo24689O1();
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public /* synthetic */ void m9728t3(DialogInterface dialogInterface) {
        mo24706w1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.m_settingOption;
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return SelectableItem.m15535j1(C17541R$string.action_ambient_display) + " " + m9723o3()[this.m_option];
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return m9724p3()[this.m_settingOption];
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7728e.m32228u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        boolean z;
        boolean z2;
        String str = this.m_settingOption == 0 ? "doze_enabled" : "doze_always_on";
        int i = this.m_option;
        boolean z3 = false;
        int i2 = 1;
        if (i == 1) {
            z = false;
        } else if (i != 2) {
            z = true;
        } else {
            try {
                if (Settings.Secure.getInt(mo27827K0().getContentResolver(), str) != 0) {
                    z2 = true;
                    z = !z2;
                }
            } catch (Settings.SettingNotFoundException unused) {
            }
            z2 = false;
            z = !z2;
        }
        if (!C8164a.m33886a()) {
            try {
                ContentResolver contentResolver = mo27827K0().getContentResolver();
                if (!z) {
                    i2 = 0;
                }
                z3 = Settings.Secure.putInt(contentResolver, str, i2);
            } catch (Exception unused2) {
            }
            if (!z3) {
                C4878b.m18869h("Could not set ambient display mode, you need to grant permission via adb with the command: adb shell pm grant com.arlosoft.macrodroid android.permission.WRITE_SECURE_SETTINGS", mo27840Y0().longValue());
            }
        } else if (z) {
            C4061t1.m15947B0(new String[]{"settings put secure " + str + " 1"});
        } else {
            C4061t1.m15947B0(new String[]{"settings put secure " + str + " 0"});
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m9724p3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n3 */
    public AlertDialog mo24744n3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((CharSequence) mo24772h1());
        builder.setSingleChoiceItems((CharSequence[]) m9723o3(), this.m_option, (DialogInterface.OnClickListener) new C3465t(this));
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C3501u(this));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3411s(this));
        AlertDialog create = builder.create();
        create.show();
        create.setOnCancelListener(new C3382r(this));
        return create;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        mo24744n3();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_option);
        parcel.writeInt(this.m_settingOption);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_settingOption = i;
    }

    public AmbientDisplayAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private AmbientDisplayAction() {
        this.m_option = 0;
    }

    private AmbientDisplayAction(Parcel parcel) {
        super(parcel);
        this.m_option = parcel.readInt();
        this.m_settingOption = parcel.readInt();
    }
}
