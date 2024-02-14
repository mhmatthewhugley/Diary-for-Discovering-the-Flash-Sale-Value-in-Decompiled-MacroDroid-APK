package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.action.email.EmailActivity;
import com.arlosoft.macrodroid.action.services.SendEmailService;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.common.C4001c1;
import com.arlosoft.macrodroid.common.C4023j0;
import com.arlosoft.macrodroid.common.C4061t1;
import com.arlosoft.macrodroid.common.SelectableItem;
import com.arlosoft.macrodroid.data.SmtpServerConfig;
import com.arlosoft.macrodroid.database.room.C4403i;
import com.arlosoft.macrodroid.logging.LogActivity;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.logging.systemlog.C4900q;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.settings.C5163j2;
import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import com.arlosoft.macrodroid.utils.C6383g0;
import com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential;
import java.util.Arrays;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13665l;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13696i0;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15478k0;
import kotlinx.coroutines.C15486m0;
import kotlinx.coroutines.C15503p1;
import kotlinx.coroutines.C15561w1;
import org.apache.commons.p353io.IOUtils;
import p036l.C1994b;
import p036l.C1998c;
import p036l.C1999d;
import p057a2.C2224m;
import p104i0.C7392a;
import p128m0.C7696a3;
import p148q0.C8151a;
import p149q1.C8157f;
import p297ja.C13332o;
import p297ja.C13339u;
import p370qa.C16269p;

/* compiled from: SendEmailAction.kt */
public final class SendEmailAction extends Action implements C2224m {
    private static final int CONFIGURE_ACCOUNT_REQUEST = 18433;
    public static final Parcelable.Creator<SendEmailAction> CREATOR = new C2612a();
    private static final int EMAIL_ACTIVITY_REQUEST = 18434;
    private static final int SEND_OPTION_GMAIL = 0;
    private static final int SEND_OPTION_SMTP = 1;

    /* renamed from: g */
    public static final C2613b f7490g = new C2613b((C13695i) null);

    /* renamed from: d */
    public transient C7392a f7491d;

    /* renamed from: f */
    public transient C4900q f7492f;
    /* access modifiers changed from: private */
    public boolean m_attachLog;
    /* access modifiers changed from: private */
    public boolean m_attachUserLog;
    private String m_body;
    private String m_emailAddress;
    private String m_fromEmailAddress;
    private transient C6383g0 m_gmailHelper;
    private String m_subject;
    private int sendOption;
    private boolean useHtml;

    /* renamed from: com.arlosoft.macrodroid.action.SendEmailAction$a */
    /* compiled from: SendEmailAction.kt */
    public static final class C2612a implements Parcelable.Creator<SendEmailAction> {
        C2612a() {
        }

        /* renamed from: a */
        public SendEmailAction createFromParcel(Parcel parcel) {
            C13706o.m87929f(parcel, "parcel");
            return new SendEmailAction(parcel, (C13695i) null);
        }

        /* renamed from: b */
        public SendEmailAction[] newArray(int i) {
            return new SendEmailAction[i];
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SendEmailAction$b */
    /* compiled from: SendEmailAction.kt */
    public static final class C2613b {
        private C2613b() {
        }

        public /* synthetic */ C2613b(C13695i iVar) {
            this();
        }
    }

    /* renamed from: com.arlosoft.macrodroid.action.SendEmailAction$c */
    /* compiled from: SendEmailAction.kt */
    static final class C2614c extends C13665l implements C16269p<C15478k0, C13635d<? super C13339u>, Object> {
        final /* synthetic */ String $body;
        final /* synthetic */ String $fromEmailAddress;
        final /* synthetic */ SmtpServerConfig $serverConfig;
        final /* synthetic */ String $subject;
        final /* synthetic */ String $toEmailAddress;
        final /* synthetic */ boolean $useHtml;
        Object L$0;
        int label;
        final /* synthetic */ SendEmailAction this$0;

        /* renamed from: com.arlosoft.macrodroid.action.SendEmailAction$c$a */
        /* compiled from: SendEmailAction.kt */
        public static final class C2615a implements C1998c {

            /* renamed from: a */
            final /* synthetic */ String f7493a;

            /* renamed from: b */
            final /* synthetic */ SendEmailAction f7494b;

            C2615a(String str, SendEmailAction sendEmailAction) {
                this.f7493a = str;
                this.f7494b = sendEmailAction;
            }

            /* renamed from: a */
            public long mo24040a() {
                return 15000;
            }

            /* renamed from: b */
            public void mo24041b(String str) {
                C13706o.m87929f(str, "errorString");
                Long Y0 = this.f7494b.mo27840Y0();
                C13706o.m87928e(Y0, "macroGuid");
                C4878b.m18869h("Failed to send email to: " + this.f7493a + ": " + C15176v.m93630E(str, IOUtils.LINE_SEPARATOR_UNIX, ". ", false, 4, (Object) null), Y0.longValue());
                if (C5163j2.m20047R(this.f7494b.mo27827K0())) {
                    C13696i0 i0Var = C13696i0.f61931a;
                    String l3 = SelectableItem.m15535j1(C17541R$string.email_failed_to_x);
                    C13706o.m87928e(l3, "getString(R.string.email_failed_to_x)");
                    String format = String.format(l3, Arrays.copyOf(new Object[]{this.f7493a}, 1));
                    C13706o.m87928e(format, "format(format, *args)");
                    C4061t1.m16023v(this.f7494b.mo27827K0(), SelectableItem.m15535j1(C17541R$string.send_email), format, false);
                }
            }

            public void onSuccess() {
                Long Y0 = this.f7494b.mo27840Y0();
                C13706o.m87928e(Y0, "macroGuid");
                C4878b.m18874m("Email sent to: " + this.f7493a, Y0.longValue());
                if (C5163j2.m20054S(this.f7494b.mo27827K0())) {
                    C13696i0 i0Var = C13696i0.f61931a;
                    String l3 = SelectableItem.m15535j1(C17541R$string.email_sent_to_x);
                    C13706o.m87928e(l3, "getString(R.string.email_sent_to_x)");
                    String format = String.format(l3, Arrays.copyOf(new Object[]{this.f7493a}, 1));
                    C13706o.m87928e(format, "format(format, *args)");
                    C4061t1.m16023v(this.f7494b.mo27827K0(), SelectableItem.m15535j1(C17541R$string.send_email), format, false);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2614c(SmtpServerConfig smtpServerConfig, boolean z, String str, String str2, String str3, String str4, SendEmailAction sendEmailAction, C13635d<? super C2614c> dVar) {
            super(2, dVar);
            this.$serverConfig = smtpServerConfig;
            this.$useHtml = z;
            this.$toEmailAddress = str;
            this.$fromEmailAddress = str2;
            this.$subject = str3;
            this.$body = str4;
            this.this$0 = sendEmailAction;
        }

        public final C13635d<C13339u> create(Object obj, C13635d<?> dVar) {
            return new C2614c(this.$serverConfig, this.$useHtml, this.$toEmailAddress, this.$fromEmailAddress, this.$subject, this.$body, this.this$0, dVar);
        }

        public final Object invoke(C15478k0 k0Var, C13635d<? super C13339u> dVar) {
            return ((C2614c) create(k0Var, dVar)).invokeSuspend(C13339u.f61331a);
        }

        public final Object invokeSuspend(Object obj) {
            C1994b bVar;
            C1994b bVar2;
            Object c = C13652d.m87832c();
            int i = this.label;
            if (i == 0) {
                C13332o.m85685b(obj);
                bVar = new C1994b().mo24010I(this.$serverConfig.getServerAddress()).mo24012K(this.$serverConfig.getUsername()).mo24011J(this.$serverConfig.getPassword()).mo24008G(this.$serverConfig.getServerPort()).mo24004C(this.$serverConfig.getStartTlsEnabled()).mo24016O(this.$useHtml ? C1999d.HTML : C1999d.PLAIN).mo24015N(this.$toEmailAddress).mo24019i(this.$fromEmailAddress).mo24014M(this.$subject).mo24018g(this.$body).mo24007F(new C2615a(this.$toEmailAddress, this.this$0));
                if (this.this$0.m_attachLog) {
                    C4900q p3 = this.this$0.mo25551p3();
                    C4403i iVar = C4403i.VERBOSE;
                    this.L$0 = bVar;
                    this.label = 1;
                    Object b = p3.mo29496b(iVar, this);
                    if (b == c) {
                        return c;
                    }
                    bVar2 = bVar;
                    obj = b;
                } else {
                    if (this.this$0.m_attachUserLog) {
                        String X1 = LogActivity.m18753X1(this.this$0.mo27827K0());
                        if (X1 != null) {
                            bVar.mo24017f(X1);
                        } else {
                            Long Y0 = this.this$0.mo27840Y0();
                            C13706o.m87928e(Y0, "macroGuid");
                            C4878b.m18869h("Could not attach user log, as user log is empty", Y0.longValue());
                        }
                    }
                    bVar.mo24006E();
                    return C13339u.f61331a;
                }
            } else if (i == 1) {
                bVar2 = (C1994b) this.L$0;
                try {
                    C13332o.m85685b(obj);
                } catch (Throwable th) {
                    C4878b.m18868g("Failed to send email via SMTP: " + th);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = (String) obj;
            if (str != null) {
                bVar2.mo24017f(str);
            }
            bVar = bVar2;
            bVar.mo24006E();
            return C13339u.f61331a;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SendEmailAction(Activity activity, Macro macro) {
        this();
        C13706o.m87929f(macro, "macro");
        mo27877y2(activity);
        this.m_macro = macro;
    }

    public /* synthetic */ SendEmailAction(Parcel parcel, C13695i iVar) {
        this(parcel);
    }

    /* renamed from: D1 */
    private final void m12127D1() {
        MacroDroidApplication.f9883I.mo27302a().mo38296a(this);
        this.m_gmailHelper = C6383g0.m24633d(mo27827K0().getApplicationContext());
    }

    /* renamed from: m3 */
    private final void m12131m3() {
        C6383g0 g0Var = this.m_gmailHelper;
        C13706o.m87926c(g0Var);
        GoogleAccountCredential c = g0Var.mo32426c();
        if (c.mo60271b() == null) {
            C6383g0 g0Var2 = this.m_gmailHelper;
            C13706o.m87926c(g0Var2);
            g0Var2.mo32425b(c, mo27850j0());
            return;
        }
        m12136s3(false);
    }

    /* renamed from: n3 */
    private final void m12132n3() {
        m12136s3(true);
    }

    /* renamed from: o3 */
    private final String[] m12133o3() {
        String j1 = SelectableItem.m15535j1(C17541R$string.gmail_account);
        C13706o.m87928e(j1, "getString(R.string.gmail_account)");
        String j12 = SelectableItem.m15535j1(C17541R$string.smtp_server);
        C13706o.m87928e(j12, "getString(R.string.smtp_server)");
        return new String[]{j1, j12};
    }

    /* renamed from: q3 */
    private final void m12134q3(String str, String str2, String str3) {
        Intent intent = new Intent(mo27827K0(), SendEmailService.class);
        intent.putExtra("Subject", str3);
        intent.putExtra("Body", str2);
        intent.putExtra("EmailAddress", str);
        intent.putExtra("AttachLog", this.m_attachLog);
        intent.putExtra("AttachUserLog", this.m_attachUserLog);
        mo27827K0().startService(intent);
    }

    /* renamed from: r3 */
    private final void m12135r3(String str, String str2, String str3, String str4, boolean z) {
        SmtpServerConfig b2 = C5163j2.m20121b2(mo27827K0());
        if (!b2.isValid()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to send email to: ");
            String str5 = str2;
            sb.append(str2);
            sb.append(". SMTP Configuration is invalid");
            String sb2 = sb.toString();
            Long Y0 = mo27840Y0();
            C13706o.m87928e(Y0, "macroGuid");
            C4878b.m18869h(sb2, Y0.longValue());
            return;
        }
        C15561w1 unused = C15473j.m94492d(C15503p1.f64723a, (C13640g) null, (C15486m0) null, new C2614c(b2, z, str2, str, str4, str3, this, (C13635d<? super C2614c>) null), 3, (Object) null);
    }

    /* renamed from: s3 */
    private final void m12136s3(boolean z) {
        Activity j0 = mo27850j0();
        Intent intent = new Intent(j0, EmailActivity.class);
        intent.putParcelableArrayListExtra("Trigger", this.m_macro.getTriggerList());
        intent.putExtra("From", this.m_fromEmailAddress);
        intent.putExtra("Address", this.m_emailAddress);
        intent.putExtra("Subject", this.m_subject);
        intent.putExtra("Body", this.m_body);
        intent.putExtra("AttachSystemLog", this.m_attachLog);
        intent.putExtra("AttachUserLog", this.m_attachUserLog);
        intent.putExtra("SmtpMode", z);
        intent.putExtra("HtmlMode", this.useHtml);
        intent.putExtra(C8157f.ITEM_TYPE, mo27837X0());
        j0.startActivityForResult(intent, EMAIL_ACTIVITY_REQUEST);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public int mo24671D0() {
        return this.sendOption;
    }

    /* renamed from: F */
    public String[] mo24440F() {
        return new String[]{this.m_emailAddress, this.m_body, this.m_subject};
    }

    /* renamed from: I */
    public void mo24441I(String[] strArr) {
        C13706o.m87929f(strArr, "magicText");
        if (strArr.length == 3) {
            this.m_emailAddress = strArr[0];
            this.m_body = strArr[1];
            this.m_subject = strArr[2];
            return;
        }
        C8151a.m33873n(new RuntimeException("SetPossibleMagicText incorrect array length (" + this.m_classType + ')'));
    }

    /* renamed from: O0 */
    public String mo24672O0() {
        if (this.m_emailAddress == null) {
            return "";
        }
        return SelectableItem.m15535j1(C17541R$string.action_send_email_to) + ' ' + this.m_emailAddress;
    }

    /* renamed from: T0 */
    public C4001c1 mo24673T0() {
        C4001c1 u = C7696a3.m32092u();
        C13706o.m87928e(u, "getInstance()");
        return u;
    }

    /* renamed from: U */
    public void mo25131U() {
        super.mo25131U();
        if (!C15176v.m93634I(this.m_emailAddress, "[v=", false, 2, (Object) null) && !C15176v.m93634I(this.m_emailAddress, "[lv=", false, 2, (Object) null) && !C15176v.m93634I(this.m_emailAddress, "{v=", false, 2, (Object) null) && !C15176v.m93634I(this.m_emailAddress, "{lv=", false, 2, (Object) null)) {
            this.m_emailAddress = "example@email.com";
        }
    }

    /* renamed from: a3 */
    public void mo24675a3(TriggerContextInfo triggerContextInfo) {
        String t0 = C4023j0.m15760t0(mo27827K0(), this.m_fromEmailAddress, triggerContextInfo, mo27837X0());
        String t02 = C4023j0.m15760t0(mo27827K0(), this.m_emailAddress, triggerContextInfo, mo27837X0());
        String R2 = mo24690R2(this.m_body, triggerContextInfo);
        String R22 = mo24690R2(this.m_subject, triggerContextInfo);
        int i = this.sendOption;
        if (i == 0) {
            C13706o.m87928e(t02, "emailAddress");
            C13706o.m87928e(R2, "bodyWithCorrectNeWLines");
            C13706o.m87928e(R22, "subject");
            m12134q3(t02, R2, R22);
        } else if (i == 1) {
            C13706o.m87928e(t0, "fromEmailAddress");
            C13706o.m87928e(t02, "emailAddress");
            C13706o.m87928e(R2, "bodyWithCorrectNeWLines");
            C13706o.m87928e(R22, "subject");
            m12135r3(t0, t02, R2, R22, this.useHtml);
        }
    }

    /* renamed from: c1 */
    public String[] mo24727c1() {
        return new String[]{"android.permission.GET_ACCOUNTS"};
    }

    /* access modifiers changed from: protected */
    /* renamed from: g1 */
    public String[] mo24676g1() {
        return m12133o3();
    }

    /* renamed from: k1 */
    public String mo24728k1(TriggerContextInfo triggerContextInfo) {
        C13706o.m87929f(triggerContextInfo, "triggerContextInfo");
        return mo25559a1() + ": " + mo24690R2(this.m_subject, triggerContextInfo) + " / " + mo24690R2(this.m_body, triggerContextInfo);
    }

    /* renamed from: p3 */
    public final C4900q mo25551p3() {
        C4900q qVar = this.f7492f;
        if (qVar != null) {
            return qVar;
        }
        C13706o.m87945v("systemLogHelper");
        return null;
    }

    /* renamed from: q1 */
    public void mo24713q1(Activity activity, int i, int i2, Intent intent) {
        C13706o.m87929f(activity, "activity");
        mo27877y2(activity);
        if (i2 == -1 && intent != null) {
            boolean z = false;
            if (i == 1000) {
                C6383g0 g0Var = this.m_gmailHelper;
                C13706o.m87926c(g0Var);
                if (g0Var.mo32427e(i, i2, intent)) {
                    m12136s3(false);
                }
            } else if (i == EMAIL_ACTIVITY_REQUEST) {
                Bundle extras = intent.getExtras();
                String str = null;
                String string = extras != null ? extras.getString("From") : null;
                String str2 = "";
                if (string == null) {
                    string = str2;
                }
                this.m_fromEmailAddress = string;
                Bundle extras2 = intent.getExtras();
                String string2 = extras2 != null ? extras2.getString("Address") : null;
                if (string2 == null) {
                    string2 = str2;
                }
                this.m_emailAddress = string2;
                Bundle extras3 = intent.getExtras();
                String string3 = extras3 != null ? extras3.getString("Body") : null;
                if (string3 == null) {
                    string3 = str2;
                }
                this.m_body = string3;
                Bundle extras4 = intent.getExtras();
                if (extras4 != null) {
                    str = extras4.getString("Subject");
                }
                if (str != null) {
                    str2 = str;
                }
                this.m_subject = str2;
                Bundle extras5 = intent.getExtras();
                this.m_attachLog = extras5 != null ? extras5.getBoolean("AttachSystemLog") : false;
                Bundle extras6 = intent.getExtras();
                this.m_attachUserLog = extras6 != null ? extras6.getBoolean("AttachUserLog") : false;
                Bundle extras7 = intent.getExtras();
                if (extras7 != null) {
                    z = extras7.getBoolean("HtmlMode");
                }
                this.useHtml = z;
                mo24689O1();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo24677v2() {
        int i = this.sendOption;
        if (i == 0) {
            m12131m3();
        } else if (i == 1) {
            m12132n3();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13706o.m87929f(parcel, "out");
        super.writeToParcel(parcel, i);
        parcel.writeString(this.m_fromEmailAddress);
        parcel.writeString(this.m_emailAddress);
        parcel.writeString(this.m_subject);
        parcel.writeString(this.m_body);
        parcel.writeInt(this.m_attachLog ^ true ? 1 : 0);
        parcel.writeInt(this.m_attachUserLog ^ true ? 1 : 0);
        parcel.writeInt(this.sendOption);
        parcel.writeInt(this.useHtml ^ true ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo24679x2(int i) {
        this.sendOption = i;
    }

    private SendEmailAction() {
        this.m_fromEmailAddress = "";
        this.m_emailAddress = "";
        this.m_subject = "";
        this.m_body = "";
        m12127D1();
    }

    private SendEmailAction(Parcel parcel) {
        super(parcel);
        String str = "";
        this.m_fromEmailAddress = str;
        this.m_emailAddress = str;
        this.m_subject = str;
        this.m_body = str;
        m12127D1();
        String readString = parcel.readString();
        this.m_fromEmailAddress = readString == null ? str : readString;
        String readString2 = parcel.readString();
        this.m_emailAddress = readString2 == null ? str : readString2;
        String readString3 = parcel.readString();
        this.m_subject = readString3 == null ? str : readString3;
        String readString4 = parcel.readString();
        this.m_body = readString4 != null ? readString4 : str;
        boolean z = true;
        this.m_attachLog = parcel.readInt() == 0;
        this.m_attachUserLog = parcel.readInt() == 0;
        this.sendOption = parcel.readInt();
        this.useHtml = parcel.readInt() != 0 ? false : z;
    }
}
