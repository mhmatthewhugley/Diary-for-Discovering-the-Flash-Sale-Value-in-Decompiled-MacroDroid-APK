package com.arlosoft.macrodroid.triggers;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.NotificationButton;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.activities.SelectNotificationButtonActivity;
import java.util.List;
import p112j2.C7439d0;
import p119k3.C7489d1;

public class NotificationButtonTrigger extends Trigger {
    public static final Parcelable.Creator<NotificationButtonTrigger> CREATOR = new C5706a();
    private int REQUEST_CODE_SELECT_BUTTON;
    private boolean m_collapseNotification;
    private int m_id;

    /* renamed from: com.arlosoft.macrodroid.triggers.NotificationButtonTrigger$a */
    class C5706a implements Parcelable.Creator<NotificationButtonTrigger> {
        C5706a() {
        }

        /* renamed from: a */
        public NotificationButtonTrigger createFromParcel(Parcel parcel) {
            return new NotificationButtonTrigger(parcel, (C5706a) null);
        }

        /* renamed from: b */
        public NotificationButtonTrigger[] newArray(int i) {
            return new NotificationButtonTrigger[i];
        }
    }

    /* synthetic */ NotificationButtonTrigger(Parcel parcel, C5706a aVar) {
        this(parcel);
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        for (NotificationButton a : C5163j2.m20120b1(mo27827K0())) {
            if (a.mo27791a() == this.m_id) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: S2 */
    public void mo30885S2() {
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7489d1.m31132u();
    }

    /* renamed from: U2 */
    public void mo30886U2() {
    }

    /* renamed from: h3 */
    public boolean mo31360h3() {
        return this.m_collapseNotification;
    }

    /* renamed from: i3 */
    public int mo31361i3() {
        return this.m_id;
    }

    /* renamed from: k3 */
    public void mo31362k3(int i) {
        this.m_id = i;
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        mo27877y2(activity);
        if (i == this.REQUEST_CODE_SELECT_BUTTON && i2 == -1) {
            boolean booleanExtra = intent.getBooleanExtra("collapse_on_press", true);
            if (!booleanExtra || Build.VERSION.SDK_INT < 31 || C4061t1.m15992f0(mo27827K0())) {
                this.m_id = intent.getIntExtra("notificationButton", 0);
                this.m_collapseNotification = booleanExtra;
                mo24689O1();
                return;
            }
            C7439d0.m30883b0(activity, false, false, false, false, false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u1 */
    public void mo24714u1() {
        List<NotificationButton> b1 = C5163j2.m20120b1(mo27827K0());
        Activity j0 = mo27850j0();
        if (b1.size() > 0) {
            Intent intent = new Intent(j0, SelectNotificationButtonActivity.class);
            intent.putExtra("collapse_on_press", this.m_collapseNotification);
            j0.startActivityForResult(intent, this.REQUEST_CODE_SELECT_BUTTON);
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(j0, mo24705l0());
        builder.setIcon(17301543);
        builder.setMessage((int) C17541R$string.trigger_notification_button_select_ok).setCancelable(true).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).setPositiveButton(17039370, (DialogInterface.OnClickListener) new C6018n5(j0));
        builder.create().show();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.m_id);
        parcel.writeInt(this.m_collapseNotification ? 1 : 0);
    }

    public NotificationButtonTrigger(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public NotificationButtonTrigger() {
        this.REQUEST_CODE_SELECT_BUTTON = 427824;
        this.m_collapseNotification = true;
    }

    private NotificationButtonTrigger(Parcel parcel) {
        super(parcel);
        this.REQUEST_CODE_SELECT_BUTTON = 427824;
        this.m_id = parcel.readInt();
        this.m_collapseNotification = parcel.readInt() != 0;
    }
}
