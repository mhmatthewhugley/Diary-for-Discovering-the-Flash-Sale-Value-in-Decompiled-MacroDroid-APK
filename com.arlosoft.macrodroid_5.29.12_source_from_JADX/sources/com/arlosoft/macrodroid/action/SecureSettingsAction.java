package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4031k;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.macro.Macro;
import java.util.ArrayList;
import p128m0.C7890z2;
import p319lc.C15626c;

public class SecureSettingsAction extends LaunchShortcutAction {
    public static final Parcelable.Creator<SecureSettingsAction> CREATOR = new C2611a();
    private static final int PICK_SHORTCUT_REQUEST_CODE = 124;
    protected String m_secondaryClassType;

    /* renamed from: com.arlosoft.macrodroid.action.SecureSettingsAction$a */
    class C2611a implements Parcelable.Creator<SecureSettingsAction> {
        C2611a() {
        }

        /* renamed from: a */
        public SecureSettingsAction createFromParcel(Parcel parcel) {
            return new SecureSettingsAction(parcel, (C2611a) null);
        }

        /* renamed from: b */
        public SecureSettingsAction[] newArray(int i) {
            return new SecureSettingsAction[i];
        }
    }

    /* synthetic */ SecureSettingsAction(Parcel parcel, C2611a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public static /* synthetic */ void m12119w3(Activity activity, DialogInterface dialogInterface, int i) {
        try {
            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.intangibleobject.securesettings.plugin")));
        } catch (ActivityNotFoundException unused) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.intangibleobject.securesettings.plugin"));
            activity.startActivity(intent);
        }
    }

    /* renamed from: G0 */
    public String mo24738G0() {
        return mo25559a1();
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        return this.m_name;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7890z2.m33021u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h1 */
    public String mo24772h1() {
        return SelectableItem.m15535j1(C17541R$string.select_application);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        Activity j0 = mo27850j0();
        if (!C4031k.m15914n()) {
            String j1 = SelectableItem.m15535j1(C17541R$string.action_secure_settings_description);
            AlertDialog.Builder builder = new AlertDialog.Builder(j0, mo24705l0());
            builder.setTitle((CharSequence) SelectableItem.m15535j1(C17541R$string.action_secure_settings));
            builder.setMessage((CharSequence) j1);
            builder.setPositiveButton((int) C17541R$string.download_app, (DialogInterface.OnClickListener) new C2918af(j0));
            builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) null);
            builder.show();
            return;
        }
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.add(SelectableItem.m15535j1(C17541R$string.applications));
        bundle.putStringArrayList("android.intent.extra.shortcut.NAME", arrayList);
        bundle.putParcelableArrayList("android.intent.extra.shortcut.ICON_RESOURCE", new ArrayList());
        try {
            Intent intent = new Intent();
            intent.setClassName("com.intangibleobject.securesettings.plugin", "com.intangibleobject.securesettings.plugin.Activities.ShortcutActivity");
            j0.startActivityForResult(intent, 124);
        } catch (ActivityNotFoundException unused) {
            C15626c.makeText(mo27827K0().getApplicationContext(), C17541R$string.action_secure_settings_not_found, 0).show();
        }
    }

    public SecureSettingsAction(Activity activity, Macro macro) {
        super(activity, macro);
        this.m_secondaryClassType = "SecureSettingsAction";
    }

    public SecureSettingsAction() {
        this.m_secondaryClassType = "SecureSettingsAction";
    }

    private SecureSettingsAction(Parcel parcel) {
        super(parcel);
        this.m_secondaryClassType = "SecureSettingsAction";
    }
}
