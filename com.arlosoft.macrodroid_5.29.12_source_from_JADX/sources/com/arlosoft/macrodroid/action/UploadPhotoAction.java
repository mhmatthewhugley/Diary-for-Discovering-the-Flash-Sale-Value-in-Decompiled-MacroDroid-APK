package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.AlertDialog;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.email.EmailActivity;
import com.arlosoft.macrodroid.action.services.UploadPhotoService;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.data.SmtpServerConfig;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6383g0;
import com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential;
import org.apache.commons.p353io.IOUtils;
import p036l.C1994b;
import p036l.C1998c;
import p036l.C1999d;
import p057a2.C2224m;
import p128m0.C7892z4;
import p134n0.C7960a;
import p148q0.C8151a;
import p149q1.C8157f;

public class UploadPhotoAction extends Action implements C7960a.C7961a, C2224m {
    public static final Parcelable.Creator<UploadPhotoAction> CREATOR = new C2778b();
    private static final int EMAIL_ACTIVITY_REQUEST = 18434;
    private static final String VIA_INTENT = SelectableItem.m15535j1(C17541R$string.action_upload_photo_via_intent);
    private String emailBody;
    private String emailFrom;
    private String emailSubject;
    private String m_email;
    private final transient C6383g0 m_gmailHelper;
    private String m_option;
    private boolean useSmtpEmail;

    /* renamed from: com.arlosoft.macrodroid.action.UploadPhotoAction$a */
    class C2777a implements C1998c {

        /* renamed from: a */
        final /* synthetic */ String f7688a;

        C2777a(String str) {
            this.f7688a = str;
        }

        /* renamed from: a */
        public long mo24040a() {
            return 15000;
        }

        /* renamed from: b */
        public void mo24041b(String str) {
            C4878b.m18869h("Failed to send photo to: " + this.f7688a + ": " + str.replace(IOUtils.LINE_SEPARATOR_UNIX, ". "), UploadPhotoAction.this.mo27840Y0().longValue());
            if (C5163j2.m20047R(UploadPhotoAction.this.mo27827K0())) {
                C4061t1.m16023v(UploadPhotoAction.this.mo27827K0(), SelectableItem.m15535j1(C17541R$string.action_upload_photo), String.format(SelectableItem.m15535j1(C17541R$string.email_failed_to_x), new Object[]{this.f7688a}), false);
            }
        }

        public void onSuccess() {
            C4878b.m18873l("Photo sent to: " + this.f7688a);
            if (C5163j2.m20054S(UploadPhotoAction.this.mo27827K0())) {
                C4061t1.m16023v(UploadPhotoAction.this.mo27827K0(), SelectableItem.m15535j1(C17541R$string.action_upload_photo), String.format(SelectableItem.m15535j1(C17541R$string.email_sent_to_x), new Object[]{this.f7688a}), false);
            }
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.UploadPhotoAction$b */
    class C2778b implements Parcelable.Creator<UploadPhotoAction> {
        C2778b() {
        }

        /* renamed from: a */
        public UploadPhotoAction createFromParcel(Parcel parcel) {
            return new UploadPhotoAction(parcel, (C2777a) null);
        }

        /* renamed from: b */
        public UploadPhotoAction[] newArray(int i) {
            return new UploadPhotoAction[i];
        }
    }

    /* synthetic */ UploadPhotoAction(Parcel parcel, C2777a aVar) {
        this(parcel);
    }

    /* renamed from: A3 */
    private void m13683A3(String str, String str2, String str3, String str4) {
        SmtpServerConfig b2 = C5163j2.m20121b2(mo27827K0());
        if (!b2.isValid()) {
            C4878b.m18869h("Failed to share photo via email to: " + this.m_email + ". SMTP Configuration is invalid", mo27840Y0().longValue());
            return;
        }
        String L = C4061t1.m15966L(mo27827K0());
        if (L == null) {
            C4878b.m18869h("Failed to share photo via email to: " + this.m_email + ". No photo found.", mo27840Y0().longValue());
            return;
        }
        C1994b N = new C1994b().mo24010I(b2.getServerAddress()).mo24012K(b2.getUsername()).mo24011J(b2.getPassword()).mo24008G(b2.getServerPort()).mo24004C(b2.getStartTlsEnabled()).mo24016O(C1999d.PLAIN).mo24015N(str2);
        if (str == null) {
            str = "";
        }
        N.mo24019i(str).mo24014M(str3).mo24018g(str4).mo24017f(L).mo24007F(new C2777a(str2)).mo24006E();
    }

    /* renamed from: B3 */
    private void m13684B3() {
        Uri K = C4061t1.m15964K(mo27827K0());
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("image/jpg");
        intent.putExtra("android.intent.extra.STREAM", K);
        mo27827K0().startActivity(Intent.createChooser(intent, SelectableItem.m15535j1(C17541R$string.action_upload_photo_share_last)).addFlags(268435456));
    }

    /* renamed from: C3 */
    private void m13685C3() {
        Activity j0 = mo27850j0();
        Intent intent = new Intent(j0, EmailActivity.class);
        intent.putParcelableArrayListExtra("Trigger", this.m_macro.getTriggerList());
        intent.putExtra("From", this.emailFrom);
        intent.putExtra("Address", this.m_email);
        intent.putExtra("Subject", m13697t3());
        intent.putExtra("Body", this.emailBody);
        intent.putExtra("SmtpMode", this.useSmtpEmail);
        intent.putExtra(C8157f.ITEM_TYPE, mo27837X0());
        intent.putExtra("SendingAttachment", true);
        j0.startActivityForResult(intent, EMAIL_ACTIVITY_REQUEST);
    }

    /* renamed from: D3 */
    private void m13686D3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(mo27850j0(), mo24705l0());
        builder.setTitle((CharSequence) mo24772h1());
        builder.setSingleChoiceItems((CharSequence[]) m13696s3(), this.useSmtpEmail ? 1 : 0, (DialogInterface.OnClickListener) null);
        builder.setNegativeButton(17039360, (DialogInterface.OnClickListener) new C3636yp(this));
        builder.setPositiveButton(17039370, (DialogInterface.OnClickListener) new C3609xp(this));
        AlertDialog create = builder.create();
        create.show();
        create.setOnCancelListener(new C3582wp(this));
    }

    /* renamed from: q3 */
    private void m13694q3() {
        GoogleAccountCredential c = this.m_gmailHelper.mo32426c();
        Activity j0 = mo27850j0();
        if (c.mo60271b() == null) {
            this.m_gmailHelper.mo32425b(c, j0);
        } else {
            m13685C3();
        }
    }

    /* renamed from: r3 */
    private void m13695r3() {
        m13685C3();
    }

    /* renamed from: s3 */
    private String[] m13696s3() {
        return new String[]{SelectableItem.m15535j1(C17541R$string.gmail_account), SelectableItem.m15535j1(C17541R$string.smtp_server)};
    }

    /* renamed from: t3 */
    private String m13697t3() {
        String str = this.emailSubject;
        if (str != null) {
            return str;
        }
        return SelectableItem.m15535j1(C17541R$string.sharing_photo_default_email_subject);
    }

    /* renamed from: u3 */
    private String[] m13698u3() {
        return new String[]{"Facebook", "Twitter", "Email", VIA_INTENT};
    }

    /* renamed from: v3 */
    private String[] m13699v3() {
        return new String[]{"Twitter", "Email", VIA_INTENT};
    }

    /* renamed from: w3 */
    private String[] m13700w3() {
        return new String[]{"Twitter", SelectableItem.m15535j1(C17541R$string.send_via_email), VIA_INTENT};
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public /* synthetic */ void m13701x3(DialogInterface dialogInterface, int i) {
        mo24706w1();
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public /* synthetic */ void m13702y3(DialogInterface dialogInterface, int i) {
        if (((AlertDialog) dialogInterface).getListView().getCheckedItemPosition() == 0) {
            this.useSmtpEmail = false;
            m13694q3();
            return;
        }
        this.useSmtpEmail = true;
        m13695r3();
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public /* synthetic */ void m13703z3(DialogInterface dialogInterface) {
        mo24706w1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        String[] u3 = m13698u3();
        if (this.m_option != null) {
            for (int i = 1; i < u3.length; i++) {
                if (this.m_option.equals(u3[i])) {
                    return i - 1;
                }
            }
        } else {
            this.m_option = "Email";
        }
        return 1;
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.m_email, this.emailSubject, this.emailBody};
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        if (strArr.length == 3) {
            this.m_email = strArr[0];
            this.emailSubject = strArr[1];
            this.emailBody = strArr[2];
            return;
        }
        C8151a.m33873n(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ")"));
    }

    /* renamed from: L */
    public void mo25739L() {
        mo24689O1();
    }

    /* renamed from: M1 */
    public boolean mo24824M1() {
        if ((!this.m_option.equals("Email") || this.useSmtpEmail || (this.m_gmailHelper.mo32426c() != null && this.m_gmailHelper.mo32426c().mo60271b() != null)) && this.m_option != null) {
            return true;
        }
        return false;
    }

    /* renamed from: N0 */
    public String mo24938N0() {
        if (!mo24824M1()) {
            return SelectableItem.m15535j1(C17541R$string.action_set_bluetooth_invalid);
        }
        return null;
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        String str = this.m_option;
        if (str == null) {
            return SelectableItem.m15535j1(C17541R$string.action_upload_photo_select_site);
        }
        if (!str.equals("Email")) {
            return this.m_option;
        }
        return SelectableItem.m15535j1(C17541R$string.send_via_email) + ": " + this.m_email;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        return C7892z4.m33031u();
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        if (this.m_option.equals(VIA_INTENT)) {
            m13684B3();
            return;
        }
        String t0 = C4023j0.m15760t0(mo27827K0(), this.m_email, triggerContextInfo, mo27837X0());
        String t02 = C4023j0.m15760t0(mo27827K0(), m13697t3(), triggerContextInfo, mo27837X0());
        Context K0 = mo27827K0();
        String str = this.emailBody;
        if (str == null) {
            str = "";
        }
        String t03 = C4023j0.m15760t0(K0, str, triggerContextInfo, mo27837X0());
        if (!this.m_option.equals("Email") || !this.useSmtpEmail) {
            Intent intent = new Intent(mo27827K0(), UploadPhotoService.class);
            intent.putExtra("UploadSite", this.m_option);
            if (this.m_option.equals("Email")) {
                intent.putExtra("EmailAddress", C4023j0.m15760t0(mo27827K0().getApplicationContext(), t0, triggerContextInfo, mo27837X0()));
                intent.putExtra("Subject", t02);
                intent.putExtra("Body", t03);
            }
            mo27827K0().startService(intent);
            return;
        }
        C4023j0.m15760t0(mo27827K0(), this.emailFrom, triggerContextInfo, mo27837X0());
        m13683A3(this.emailFrom, t0, t02, t03);
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        return new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.GET_ACCOUNTS"};
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m13700w3();
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        mo27877y2(activity);
        if (i2 == -1 && intent != null) {
            if (i == 1000) {
                if (this.m_gmailHelper.mo32427e(i, i2, intent)) {
                    m13685C3();
                }
            } else if (i == EMAIL_ACTIVITY_REQUEST) {
                this.emailFrom = intent.getExtras().getString("From");
                this.m_email = intent.getExtras().getString("Address");
                this.emailBody = intent.getExtras().getString("Body");
                this.emailSubject = intent.getExtras().getString("Subject");
                mo24689O1();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        Activity j0 = mo27850j0();
        String str = this.m_option;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 67066748:
                if (str.equals("Email")) {
                    c = 0;
                    break;
                }
                break;
            case 561774310:
                if (str.equals("Facebook")) {
                    c = 1;
                    break;
                }
                break;
            case 748307027:
                if (str.equals("Twitter")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                m13686D3();
                return;
            case 1:
                if (C5163j2.m20075V(mo27827K0()) != null) {
                    mo24689O1();
                    return;
                }
                return;
            case 2:
                if (!C7960a.m33245h(j0)) {
                    C7960a.m33246i(j0, this);
                    return;
                } else {
                    mo24689O1();
                    return;
                }
            default:
                mo24689O1();
                return;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_option);
        parcel.writeString(this.m_email);
        parcel.writeString(this.emailSubject);
        parcel.writeString(this.emailBody);
        parcel.writeString(this.emailFrom);
        parcel.writeInt(this.useSmtpEmail ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.m_option = m13699v3()[i];
    }

    public UploadPhotoAction(Activity activity, Macro macro) {
        this();
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public UploadPhotoAction() {
        this.m_option = "Email";
        this.m_gmailHelper = C6383g0.m24633d(mo27827K0().getApplicationContext());
    }

    private UploadPhotoAction(Parcel parcel) {
        super(parcel);
        this.m_option = "Email";
        this.m_gmailHelper = C6383g0.m24633d(mo27827K0().getApplicationContext());
        this.m_option = parcel.readString();
        this.m_email = parcel.readString();
        this.emailSubject = parcel.readString();
        this.emailBody = parcel.readString();
        this.emailFrom = parcel.readString();
        this.useSmtpEmail = parcel.readInt() != 0;
    }
}
