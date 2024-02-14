package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.List;
import p112j2.C7439d0;
import p128m0.C7891z3;
import p319lc.C15626c;

public class SetRingtoneAction extends Action {
    public static final Parcelable.Creator<SetRingtoneAction> CREATOR = new C2656a();
    private static final int REQUEST_CODE_RINGTONE_PICKER = 3898423;
    private String m_ringtoneName;
    private String m_ringtoneUri;

    /* renamed from: com.arlosoft.macrodroid.action.SetRingtoneAction$a */
    class C2656a implements Parcelable.Creator<SetRingtoneAction> {
        C2656a() {
        }

        /* renamed from: a */
        public SetRingtoneAction createFromParcel(Parcel parcel) {
            return new SetRingtoneAction(parcel, (C2656a) null);
        }

        /* renamed from: b */
        public SetRingtoneAction[] newArray(int i) {
            return new SetRingtoneAction[i];
        }
    }

    /* synthetic */ SetRingtoneAction(Parcel parcel, C2656a aVar) {
        this(parcel);
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        String str = this.m_ringtoneName;
        if (str != null) {
            return str;
        }
        if (this.m_ringtoneUri != null) {
            try {
                return RingtoneManager.getRingtone(mo27827K0(), Uri.parse(this.m_ringtoneUri)).getTitle(mo27827K0());
            } catch (Exception unused) {
            }
        }
        return "";
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7891z3.m33026u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        RingtoneManager ringtoneManager = new RingtoneManager(mo27827K0());
        if (this.m_ringtoneUri != null) {
            try {
                RingtoneManager.setActualDefaultRingtoneUri(mo27827K0(), 1, Uri.parse(this.m_ringtoneUri));
            } catch (SecurityException unused) {
                C7439d0.m30909o0(mo27827K0(), "android.permission.READ_EXTERNAL_STORAGE", mo25559a1(), true, false);
            } catch (Exception e) {
                C4878b.m18869h("Failed to set ringtone: " + e.toString(), mo27840Y0().longValue());
            }
        } else if (this.m_ringtoneName.equals("None")) {
            RingtoneManager.setActualDefaultRingtoneUri(mo27827K0(), 1, (Uri) null);
        } else {
            List<String> X = C4061t1.m15978X(mo27827K0(), 1, false);
            for (int i = 0; i < X.size(); i++) {
                if (X.get(i).equals(this.m_ringtoneName)) {
                    Cursor cursor = ringtoneManager.getCursor();
                    RingtoneManager.setActualDefaultRingtoneUri(mo27827K0(), 1, ringtoneManager.getRingtoneUri(i));
                    cursor.close();
                    return;
                }
            }
        }
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        return new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
    }

    /* renamed from: k1 */
    public String mo24728k1(TriggerContextInfo triggerContextInfo) {
        return mo25559a1() + " (" + mo24672O0() + ")";
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        if (i != REQUEST_CODE_RINGTONE_PICKER) {
            return;
        }
        if (i2 == -1) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri != null) {
                this.m_ringtoneUri = uri.toString();
                this.m_ringtoneName = null;
            } else {
                this.m_ringtoneName = "None";
                this.m_ringtoneUri = null;
            }
            mo24689O1();
            return;
        }
        mo27864r1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        try {
            Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
            intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
            intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", false);
            intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
            String str = this.m_ringtoneUri;
            if (str != null) {
                intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", Uri.parse(str));
                intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", Uri.parse(this.m_ringtoneUri));
            }
            mo27850j0().startActivityForResult(intent, REQUEST_CODE_RINGTONE_PICKER);
        } catch (SecurityException e) {
            C4878b.m18868g("This device does not allow the ringtone picker to be called from a third party app: " + e.toString());
            C15626c.m94876a(mo27827K0(), "This device does not allow the ringtone picker to be called from a third party app", 1).show();
        }
    }

    /* renamed from: u2 */
    public boolean mo25103u2() {
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_ringtoneName);
        parcel.writeString(this.m_ringtoneUri);
    }

    public SetRingtoneAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private SetRingtoneAction() {
    }

    private SetRingtoneAction(Parcel parcel) {
        super(parcel);
        this.m_ringtoneName = parcel.readString();
        this.m_ringtoneUri = parcel.readString();
    }
}
