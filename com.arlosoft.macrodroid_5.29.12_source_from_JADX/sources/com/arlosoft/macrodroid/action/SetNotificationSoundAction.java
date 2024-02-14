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
import p128m0.C7870w3;

public class SetNotificationSoundAction extends Action {
    public static final Parcelable.Creator<SetNotificationSoundAction> CREATOR = new C2653a();
    private static final int REQUEST_CODE_RINGTONE_PICKER = 378852;
    private String m_ringtoneName;
    private String m_ringtoneUri;

    /* renamed from: com.arlosoft.macrodroid.action.SetNotificationSoundAction$a */
    class C2653a implements Parcelable.Creator<SetNotificationSoundAction> {
        C2653a() {
        }

        /* renamed from: a */
        public SetNotificationSoundAction createFromParcel(Parcel parcel) {
            return new SetNotificationSoundAction(parcel, (C2653a) null);
        }

        /* renamed from: b */
        public SetNotificationSoundAction[] newArray(int i) {
            return new SetNotificationSoundAction[i];
        }
    }

    /* synthetic */ SetNotificationSoundAction(Parcel parcel, C2653a aVar) {
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
        return C7870w3.m32922u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        RingtoneManager ringtoneManager = new RingtoneManager(mo27827K0());
        if (this.m_ringtoneUri != null) {
            try {
                RingtoneManager.setActualDefaultRingtoneUri(mo27827K0(), 2, Uri.parse(this.m_ringtoneUri));
            } catch (Exception e) {
                C4878b.m18869h("Failed to set ringtone: " + e.toString(), mo27840Y0().longValue());
            }
        } else if (this.m_ringtoneName.equals("None")) {
            RingtoneManager.setActualDefaultRingtoneUri(mo27827K0(), 2, (Uri) null);
        } else {
            List<String> X = C4061t1.m15978X(mo27827K0(), 2, false);
            for (int i = 0; i < X.size(); i++) {
                if (X.get(i).equals(this.m_ringtoneName)) {
                    ringtoneManager.setType(2);
                    Cursor cursor = ringtoneManager.getCursor();
                    Uri ringtoneUri = ringtoneManager.getRingtoneUri(i);
                    if (ringtoneUri != null) {
                        try {
                            RingtoneManager.setActualDefaultRingtoneUri(mo27827K0(), 2, ringtoneUri);
                        } catch (Exception e2) {
                            C4878b.m18869h("Cannot set ringtone: " + e2.toString(), mo27840Y0().longValue());
                        }
                    } else {
                        C4878b.m18869h("Cannot set ringtone, Uri is null", mo27840Y0().longValue());
                    }
                    cursor.close();
                    return;
                }
            }
        }
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        if (i == REQUEST_CODE_RINGTONE_PICKER && i2 == -1) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri != null) {
                this.m_ringtoneUri = uri.toString();
                this.m_ringtoneName = null;
            } else {
                this.m_ringtoneName = "None";
                this.m_ringtoneUri = null;
            }
            mo24689O1();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
        intent.putExtra("android.intent.extra.ringtone.TYPE", 2);
        intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", false);
        intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", true);
        String str = this.m_ringtoneUri;
        if (str != null) {
            intent.putExtra("android.intent.extra.ringtone.DEFAULT_URI", Uri.parse(str));
            intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", Uri.parse(this.m_ringtoneUri));
        }
        mo27850j0().startActivityForResult(intent, REQUEST_CODE_RINGTONE_PICKER);
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

    public SetNotificationSoundAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private SetNotificationSoundAction() {
    }

    private SetNotificationSoundAction(Parcel parcel) {
        super(parcel);
        this.m_ringtoneName = parcel.readString();
        this.m_ringtoneUri = parcel.readString();
    }
}
