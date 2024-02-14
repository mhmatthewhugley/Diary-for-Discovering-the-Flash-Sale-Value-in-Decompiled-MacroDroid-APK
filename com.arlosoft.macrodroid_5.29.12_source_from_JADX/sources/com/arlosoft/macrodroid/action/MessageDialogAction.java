package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.activities.MessageDialogActivity;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import java.util.List;
import java.util.Stack;
import org.apache.commons.p353io.IOUtils;
import p057a2.C2212a;
import p128m0.C7732e2;
import p148q0.C8151a;

public class MessageDialogAction extends NotificationAction implements C2212a {
    public static final Parcelable.Creator<MessageDialogAction> CREATOR = new C2540a();
    protected String m_secondaryClassType;

    /* renamed from: com.arlosoft.macrodroid.action.MessageDialogAction$a */
    class C2540a implements Parcelable.Creator<MessageDialogAction> {
        C2540a() {
        }

        /* renamed from: a */
        public MessageDialogAction createFromParcel(Parcel parcel) {
            return new MessageDialogAction(parcel, (C2540a) null);
        }

        /* renamed from: b */
        public MessageDialogAction[] newArray(int i) {
            return new MessageDialogAction[i];
        }
    }

    /* synthetic */ MessageDialogAction(Parcel parcel, C2540a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E3 */
    public boolean mo25362E3() {
        return false;
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.m_notificationSubject, this.m_notificationText};
    }

    /* access modifiers changed from: protected */
    /* renamed from: F3 */
    public boolean mo25363F3() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G3 */
    public boolean mo25364G3() {
        return true;
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        if (strArr.length == 2) {
            this.m_notificationSubject = strArr[0];
            this.m_notificationText = strArr[1];
            return;
        }
        C8151a.m33873n(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ")"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: J3 */
    public boolean mo25365J3() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K3 */
    public boolean mo25366K3() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: L3 */
    public boolean mo25367L3() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: N3 */
    public String mo25368N3() {
        return SelectableItem.m15535j1(C17541R$string.enter_dialog_text);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O3 */
    public String mo25369O3() {
        return SelectableItem.m15535j1(C17541R$string.enter_dialog_subject);
    }

    /* access modifiers changed from: protected */
    /* renamed from: P3 */
    public boolean mo25370P3() {
        return false;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7732e2.m32251u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
    }

    /* renamed from: h */
    public void mo24421h(TriggerContextInfo triggerContextInfo, int i, boolean z, Stack<Integer> stack, ResumeMacroInfo resumeMacroInfo, boolean z2) {
        String str;
        String R2 = mo24690R2(this.m_notificationSubject, triggerContextInfo);
        String str2 = this.m_notificationText;
        if (str2 != null) {
            str = mo24690R2(str2, triggerContextInfo).replace(IOUtils.LINE_SEPARATOR_UNIX, "<br/>");
            if (this.maintainSpaces) {
                str = str.replaceAll(" ", "&nbsp;");
            }
        } else {
            str = "";
        }
        Intent intent = new Intent(mo27827K0(), MessageDialogActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("Subject", R2);
        intent.putExtra("Message", str);
        intent.putExtra("ResourceName", this.m_imageResourceName);
        intent.putExtra("ResourceId", this.m_imageResourceId);
        intent.putExtra("PreventBackButton", this.preventBackButtonClosing);
        intent.putExtra("guid", this.m_macro.getGUID());
        intent.putExtra("TriggerThatInvoked", this.m_macro.getTriggerThatInvoked());
        intent.putExtra("TriggerContextInfo", triggerContextInfo);
        intent.putExtra("NextActionIndex", i);
        intent.putExtra("SkipEndifIndex", stack);
        intent.putExtra("force_not_enabled", z);
        intent.putExtra("IsTest", z2);
        intent.putExtra("resume_macro_info", resumeMacroInfo);
        intent.putExtra("block_next_action", this.blockNextAction);
        mo27827K0().startActivity(intent);
        int i2 = this.m_ringtoneIndex;
        Uri uri = null;
        if (i2 >= 2) {
            RingtoneManager ringtoneManager = new RingtoneManager(mo27827K0());
            int i3 = 0;
            List<String> X = C4061t1.m15978X(mo27827K0(), 2, false);
            while (true) {
                if (i3 >= X.size()) {
                    break;
                } else if (X.get(i3).equals(this.m_ringtoneName)) {
                    ringtoneManager.setType(2);
                    Cursor cursor = ringtoneManager.getCursor();
                    Uri ringtoneUri = ringtoneManager.getRingtoneUri(i3);
                    cursor.close();
                    uri = ringtoneUri;
                    break;
                } else {
                    i3++;
                }
            }
        } else if (i2 != 1) {
            uri = RingtoneManager.getDefaultUri(2);
        }
        if (uri != null) {
            Ringtone ringtone = RingtoneManager.getRingtone(mo27827K0(), uri);
            if (ringtone != null) {
                try {
                    ringtone.stop();
                    ringtone.setStreamType(5);
                    ringtone.play();
                } catch (Exception e) {
                    C4878b.m18869h("Failed to play sound: " + e.toString(), mo27840Y0().longValue());
                }
            } else {
                C4878b.m18869h("Ringtone not found - cannot play sound", mo27840Y0().longValue());
            }
        }
    }

    /* renamed from: h2 */
    public boolean mo24893h2() {
        return Build.VERSION.SDK_INT >= 29;
    }

    /* renamed from: h4 */
    public boolean mo25371h4() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i4 */
    public boolean mo25372i4() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j4 */
    public boolean mo25373j4() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k4 */
    public boolean mo25374k4() {
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_notificationText);
        parcel.writeInt(this.m_overwriteExisting ? 1 : 0);
        parcel.writeString(this.m_notificationSubject);
        parcel.writeString(this.m_imageResourceName);
        parcel.writeInt(this.blockNextAction ? 1 : 0);
        parcel.writeInt(this.preventBackButtonClosing ? 1 : 0);
        parcel.writeInt(this.maintainSpaces ? 1 : 0);
    }

    public MessageDialogAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    private MessageDialogAction() {
        this.m_secondaryClassType = "MessageDialogAction";
    }

    private MessageDialogAction(Parcel parcel) {
        super(parcel);
        this.m_secondaryClassType = "MessageDialogAction";
        this.m_notificationText = parcel.readString();
        boolean z = true;
        this.m_overwriteExisting = parcel.readInt() != 0;
        this.m_notificationSubject = parcel.readString();
        this.m_imageResourceName = parcel.readString();
        this.blockNextAction = parcel.readInt() != 0;
        this.preventBackButtonClosing = parcel.readInt() != 0;
        this.maintainSpaces = parcel.readInt() == 0 ? false : z;
    }
}
