package p036l;

import android.os.Handler;
import android.os.Looper;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import javax.mail.Authenticator;
import javax.mail.Part;
import javax.mail.PasswordAuthentication;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import org.apache.http.cookie.ClientCookie;
import org.jsoup.safety.Whitelist;
import p338nd.C15788a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b$\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bI\u0010JJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0004J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0004J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0004J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0004J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aJ\u0010\u0010\u001f\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dJ\u0006\u0010 \u001a\u00020\u0002J\u0006\u0010!\u001a\u00020\u0013J\u000e\u0010\"\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004R(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010#\u001a\u0004\u0018\u00010\u00048\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010&R4\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010'2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010'8\u0006@BX\u000e¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R(\u0010,\u001a\u0004\u0018\u00010\u00042\b\u0010#\u001a\u0004\u0018\u00010\u00048\u0006@BX\u000e¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b-\u0010&R4\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010'2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010'8\u0006@BX\u000e¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b/\u0010+R(\u00100\u001a\u0004\u0018\u00010\u00042\b\u0010#\u001a\u0004\u0018\u00010\u00048\u0006@BX\u000e¢\u0006\f\n\u0004\b0\u0010$\u001a\u0004\b1\u0010&R4\u00102\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010'2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010'8\u0006@BX\u000e¢\u0006\f\n\u0004\b2\u0010)\u001a\u0004\b3\u0010+R(\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010#\u001a\u0004\u0018\u00010\u00048\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b4\u0010&R(\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010#\u001a\u0004\u0018\u00010\u00048\u0006@BX\u000e¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b5\u0010&R(\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010#\u001a\u0004\u0018\u00010\u00048\u0006@BX\u000e¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b6\u0010&R$\u00107\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u00138\u0006@BX\u000e¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R$\u0010\r\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00048\u0006@BX\u000e¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b;\u0010&R(\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010#\u001a\u0004\u0018\u00010\u00048\u0006@BX\u000e¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b<\u0010&R(\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010#\u001a\u0004\u0018\u00010\u00048\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0011\u0010$\u001a\u0004\b=\u0010&R$\u0010\u0014\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u00138\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0014\u00108\u001a\u0004\b>\u0010:R$\u0010\u0016\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00048\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0016\u0010$\u001a\u0004\b?\u0010&R(\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\u0010#\u001a\u0004\u0018\u00010\u00048\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0018\u0010$\u001a\u0004\b@\u0010&R4\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010'2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010'8\u0006@BX\u000e¢\u0006\f\n\u0004\bA\u0010)\u001a\u0004\bB\u0010+R(\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\u0010#\u001a\u0004\u0018\u00010\u00048\u0006@BX\u000e¢\u0006\f\n\u0004\b\u001b\u0010$\u001a\u0004\bC\u0010&R(\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010#\u001a\u0004\u0018\u00010\u001d8\u0006@BX\u000e¢\u0006\f\n\u0004\b\u001e\u0010D\u001a\u0004\bE\u0010FR$\u0010G\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u00138\u0006@BX\u000e¢\u0006\f\n\u0004\bG\u00108\u001a\u0004\bH\u0010:¨\u0006K"}, mo71668d2 = {"Ll/b;", "", "Lja/u;", "h", "", "to", "N", "from", "i", "subject", "M", "body", "g", "smtp", "I", "smtpUsername", "K", "smtpPassword", "J", "", "isStartTLSEnabled", "C", "port", "G", "attachment", "f", "Ll/d;", "type", "O", "Ll/c;", "successCallback", "F", "E", "H", "L", "<set-?>", "Ljava/lang/String;", "y", "()Ljava/lang/String;", "", "toRecipients", "Ljava/util/List;", "z", "()Ljava/util/List;", "cc", "o", "ccRecipients", "p", "bcc", "l", "bccRecipients", "m", "q", "w", "n", "isJavascriptDisabled", "Z", "B", "()Z", "t", "v", "u", "D", "s", "j", "attachments", "k", "A", "Ll/c;", "x", "()Ll/c;", "mailSuccess", "r", "<init>", "()V", "maildroidx_release"}, mo71669k = 1, mo71670mv = {1, 4, 2})
/* renamed from: l.b */
/* compiled from: MaildroidX.kt */
public class C1994b {

    /* renamed from: a */
    private String f6075a;

    /* renamed from: b */
    private List<String> f6076b;

    /* renamed from: c */
    private String f6077c;

    /* renamed from: d */
    private List<String> f6078d;

    /* renamed from: e */
    private String f6079e;

    /* renamed from: f */
    private List<String> f6080f;

    /* renamed from: g */
    private String f6081g;

    /* renamed from: h */
    private String f6082h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f6083i;

    /* renamed from: j */
    private boolean f6084j;

    /* renamed from: k */
    private String f6085k = "";

    /* renamed from: l */
    private String f6086l;

    /* renamed from: m */
    private String f6087m;

    /* renamed from: n */
    private boolean f6088n;

    /* renamed from: o */
    private String f6089o = "";

    /* renamed from: p */
    private String f6090p;

    /* renamed from: q */
    private List<String> f6091q;

    /* renamed from: r */
    private String f6092r;

    /* renamed from: s */
    private C1998c f6093s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f6094t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public String f6095u;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo71668d2 = {"Lja/u;", "run", "()V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 2})
    /* renamed from: l.b$a */
    /* compiled from: MaildroidX.kt */
    static final class C1995a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C1994b f6096a;

        C1995a(C1994b bVar) {
            this.f6096a = bVar;
        }

        public final void run() {
            C1998c x;
            if (this.f6096a.mo24028r()) {
                C1998c x2 = this.f6096a.mo24034x();
                if (x2 != null) {
                    x2.onSuccess();
                    return;
                }
                return;
            }
            String b = this.f6096a.f6095u;
            if (b != null && (x = this.f6096a.mo24034x()) != null) {
                x.mo24041b(b);
            }
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo71668d2 = {"Lja/u;", "run", "()V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 2})
    /* renamed from: l.b$b */
    /* compiled from: MaildroidX.kt */
    static final class C1996b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C1994b f6097a;

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0004"}, mo71668d2 = {"l/b$b$a", "Ljavax/mail/Authenticator;", "Ljavax/mail/PasswordAuthentication;", "getPasswordAuthentication", "maildroidx_release"}, mo71669k = 1, mo71670mv = {1, 4, 2})
        /* renamed from: l.b$b$a */
        /* compiled from: MaildroidX.kt */
        public static final class C1997a extends Authenticator {

            /* renamed from: a */
            final /* synthetic */ C1996b f6098a;

            C1997a(C1996b bVar) {
                this.f6098a = bVar;
            }

            /* access modifiers changed from: protected */
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(this.f6098a.f6097a.mo24032v(), this.f6098a.f6097a.mo24031u());
            }
        }

        C1996b(C1994b bVar) {
            this.f6097a = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:47:0x0141 A[Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2, all -> 0x02d0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x019b A[Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2, all -> 0x02d0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x01b4 A[Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2, all -> 0x02d0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x020e A[Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2, all -> 0x02d0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x0251 A[Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2, all -> 0x02d0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x029d A[Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2, all -> 0x02d0 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r6 = this;
                java.util.Properties r0 = java.lang.System.getProperties()
                l.b r1 = r6.f6097a
                java.lang.String r1 = r1.mo24030t()
                int r1 = r1.length()
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x0014
                r1 = 1
                goto L_0x0015
            L_0x0014:
                r1 = 0
            L_0x0015:
                if (r1 != 0) goto L_0x032b
                l.b r1 = r6.f6097a
                java.lang.String r1 = r1.mo24029s()
                int r1 = r1.length()
                if (r1 != 0) goto L_0x0024
                r2 = 1
            L_0x0024:
                if (r2 != 0) goto L_0x0323
                l.b r1 = r6.f6097a
                java.lang.String r1 = r1.mo24032v()
                java.lang.String r2 = "MaildroidX detected that you didn't pass [smtpUsername] or [smtpPassword] to the builder!"
                if (r1 == 0) goto L_0x031d
                l.b r1 = r6.f6097a
                java.lang.String r1 = r1.mo24031u()
                if (r1 == 0) goto L_0x0317
                l.b r1 = r6.f6097a
                boolean r1 = r1.mo24003B()
                if (r1 == 0) goto L_0x005a
                java.lang.String r1 = "isJavascriptDisabled"
                java.lang.String r2 = "This setting to true can cause distortion problem with CSS in E-mail layout. It should be only used when CSS is not required. "
                android.util.Log.e(r1, r2)
                l.b r1 = r6.f6097a
                java.lang.String r2 = r1.mo24024n()
                if (r2 == 0) goto L_0x0056
                l.b r4 = r6.f6097a
                java.lang.String r2 = r4.mo24013L(r2)
                goto L_0x0057
            L_0x0056:
                r2 = 0
            L_0x0057:
                r1.f6083i = r2
            L_0x005a:
                l.b r1 = r6.f6097a
                java.lang.String r1 = r1.mo24030t()
                java.lang.String r2 = "mail.smtp.host"
                r0.put(r2, r1)
                l.b r1 = r6.f6097a
                java.lang.String r1 = r1.mo24029s()
                java.lang.String r2 = "mail.smtp.socketFactory.port"
                r0.put(r2, r1)
                java.lang.String r1 = "mail.smtp.socketFactory.class"
                java.lang.String r2 = "javax.net.ssl.SSLSocketFactory"
                r0.put(r1, r2)
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                java.lang.String r2 = "mail.smtp.auth"
                r0.put(r2, r1)
                l.b r2 = r6.f6097a
                java.lang.String r2 = r2.mo24029s()
                java.lang.String r4 = "mail.smtp.port"
                r0.put(r4, r2)
                l.b r2 = r6.f6097a
                boolean r2 = r2.mo24005D()
                java.lang.String r4 = "mail.smtp.starttls.enable"
                java.lang.String r5 = "isStartTLSEnabled"
                if (r2 == 0) goto L_0x009e
                java.lang.String r2 = "Your SMTP server has to support STARTTLS, to use this option"
                android.util.Log.i(r5, r2)
                r0.put(r4, r1)
                goto L_0x00a8
            L_0x009e:
                java.lang.String r1 = "MaildroidX: STARTTLS is disabled"
                android.util.Log.i(r5, r1)
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                r0.put(r4, r1)
            L_0x00a8:
                l.b$b$a r1 = new l.b$b$a
                r1.<init>(r6)
                javax.mail.Session r0 = javax.mail.Session.getInstance(r0, r1)
                javax.mail.internet.MimeMessage r1 = new javax.mail.internet.MimeMessage     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                r1.<init>((javax.mail.Session) r0)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                javax.mail.internet.InternetAddress r0 = new javax.mail.internet.InternetAddress     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                l.b r2 = r6.f6097a     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.lang.String r2 = r2.mo24027q()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                r0.<init>(r2)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                r1.setFrom((javax.mail.Address) r0)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                l.b r0 = r6.f6097a     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.util.List r0 = r0.mo24036z()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.lang.String r2 = "null cannot be cast to non-null type kotlin.CharSequence"
                if (r0 == 0) goto L_0x0120
                l.b r0 = r6.f6097a     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.util.List r0 = r0.mo24036z()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                kotlin.jvm.internal.C13706o.m87926c(r0)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                boolean r0 = r0.isEmpty()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                r0 = r0 ^ r3
                if (r0 == 0) goto L_0x0120
                l.b r0 = r6.f6097a     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.util.List r0 = r0.mo24036z()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                kotlin.jvm.internal.C13706o.m87926c(r0)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                int r0 = r0.size()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                if (r0 <= r3) goto L_0x0120
                l.b r0 = r6.f6097a     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.util.List r0 = r0.mo24036z()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                kotlin.jvm.internal.C13706o.m87926c(r0)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
            L_0x00fa:
                boolean r4 = r0.hasNext()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                if (r4 == 0) goto L_0x0139
                java.lang.Object r4 = r0.next()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.lang.String r4 = (java.lang.String) r4     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                javax.mail.Message$RecipientType r5 = javax.mail.Message.RecipientType.f61338TO     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                if (r4 == 0) goto L_0x011a
                java.lang.CharSequence r4 = kotlin.text.C15177w.m93672R0(r4)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.lang.String r4 = r4.toString()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                javax.mail.internet.InternetAddress[] r4 = javax.mail.internet.InternetAddress.parse(r4)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                r1.addRecipients((javax.mail.Message.RecipientType) r5, (javax.mail.Address[]) r4)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                goto L_0x00fa
            L_0x011a:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                r0.<init>(r2)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                throw r0     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
            L_0x0120:
                l.b r0 = r6.f6097a     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.lang.String r0 = r0.mo24035y()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                if (r0 == 0) goto L_0x0139
                javax.mail.Message$RecipientType r4 = javax.mail.Message.RecipientType.f61338TO     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.lang.CharSequence r0 = kotlin.text.C15177w.m93672R0(r0)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.lang.String r0 = r0.toString()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                javax.mail.internet.InternetAddress[] r0 = javax.mail.internet.InternetAddress.parse(r0)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                r1.addRecipients((javax.mail.Message.RecipientType) r4, (javax.mail.Address[]) r0)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
            L_0x0139:
                l.b r0 = r6.f6097a     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.util.List r0 = r0.mo24026p()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                if (r0 == 0) goto L_0x0193
                l.b r0 = r6.f6097a     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.util.List r0 = r0.mo24026p()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                kotlin.jvm.internal.C13706o.m87926c(r0)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                boolean r0 = r0.isEmpty()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                r0 = r0 ^ r3
                if (r0 == 0) goto L_0x0193
                l.b r0 = r6.f6097a     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.util.List r0 = r0.mo24026p()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                kotlin.jvm.internal.C13706o.m87926c(r0)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                int r0 = r0.size()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                if (r0 <= r3) goto L_0x0193
                l.b r0 = r6.f6097a     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.util.List r0 = r0.mo24026p()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                kotlin.jvm.internal.C13706o.m87926c(r0)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
            L_0x016d:
                boolean r4 = r0.hasNext()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                if (r4 == 0) goto L_0x01ac
                java.lang.Object r4 = r0.next()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.lang.String r4 = (java.lang.String) r4     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                javax.mail.Message$RecipientType r5 = javax.mail.Message.RecipientType.f61337CC     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                if (r4 == 0) goto L_0x018d
                java.lang.CharSequence r4 = kotlin.text.C15177w.m93672R0(r4)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.lang.String r4 = r4.toString()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                javax.mail.internet.InternetAddress[] r4 = javax.mail.internet.InternetAddress.parse(r4)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                r1.addRecipients((javax.mail.Message.RecipientType) r5, (javax.mail.Address[]) r4)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                goto L_0x016d
            L_0x018d:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                r0.<init>(r2)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                throw r0     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
            L_0x0193:
                l.b r0 = r6.f6097a     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.lang.String r0 = r0.mo24025o()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                if (r0 == 0) goto L_0x01ac
                javax.mail.Message$RecipientType r4 = javax.mail.Message.RecipientType.f61337CC     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.lang.CharSequence r0 = kotlin.text.C15177w.m93672R0(r0)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.lang.String r0 = r0.toString()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                javax.mail.internet.InternetAddress[] r0 = javax.mail.internet.InternetAddress.parse(r0)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                r1.addRecipients((javax.mail.Message.RecipientType) r4, (javax.mail.Address[]) r0)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
            L_0x01ac:
                l.b r0 = r6.f6097a     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.util.List r0 = r0.mo24023m()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                if (r0 == 0) goto L_0x0206
                l.b r0 = r6.f6097a     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.util.List r0 = r0.mo24023m()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                kotlin.jvm.internal.C13706o.m87926c(r0)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                boolean r0 = r0.isEmpty()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                r0 = r0 ^ r3
                if (r0 == 0) goto L_0x0206
                l.b r0 = r6.f6097a     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.util.List r0 = r0.mo24023m()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                kotlin.jvm.internal.C13706o.m87926c(r0)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                int r0 = r0.size()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                if (r0 <= r3) goto L_0x0206
                l.b r0 = r6.f6097a     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.util.List r0 = r0.mo24023m()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                kotlin.jvm.internal.C13706o.m87926c(r0)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
            L_0x01e0:
                boolean r4 = r0.hasNext()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                if (r4 == 0) goto L_0x021f
                java.lang.Object r4 = r0.next()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.lang.String r4 = (java.lang.String) r4     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                javax.mail.Message$RecipientType r5 = javax.mail.Message.RecipientType.BCC     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                if (r4 == 0) goto L_0x0200
                java.lang.CharSequence r4 = kotlin.text.C15177w.m93672R0(r4)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.lang.String r4 = r4.toString()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                javax.mail.internet.InternetAddress[] r4 = javax.mail.internet.InternetAddress.parse(r4)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                r1.addRecipients((javax.mail.Message.RecipientType) r5, (javax.mail.Address[]) r4)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                goto L_0x01e0
            L_0x0200:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                r0.<init>(r2)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                throw r0     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
            L_0x0206:
                l.b r0 = r6.f6097a     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.lang.String r0 = r0.mo24022l()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                if (r0 == 0) goto L_0x021f
                javax.mail.Message$RecipientType r2 = javax.mail.Message.RecipientType.BCC     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.lang.CharSequence r0 = kotlin.text.C15177w.m93672R0(r0)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.lang.String r0 = r0.toString()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                javax.mail.internet.InternetAddress[] r0 = javax.mail.internet.InternetAddress.parse(r0)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                r1.addRecipients((javax.mail.Message.RecipientType) r2, (javax.mail.Address[]) r0)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
            L_0x021f:
                l.b r0 = r6.f6097a     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.lang.String r0 = r0.mo24033w()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                r1.setSubject(r0)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                javax.mail.internet.MimeBodyPart r0 = new javax.mail.internet.MimeBodyPart     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                r0.<init>()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                l.b r2 = r6.f6097a     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.lang.String r2 = r2.mo24024n()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                l.b r4 = r6.f6097a     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.lang.String r4 = r4.mo24002A()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                r0.setContent(r2, r4)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                javax.mail.internet.MimeMultipart r2 = new javax.mail.internet.MimeMultipart     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                r2.<init>()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                r2.addBodyPart(r0)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                javax.mail.internet.MimeBodyPart r0 = new javax.mail.internet.MimeBodyPart     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                r0.<init>()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                l.b r4 = r6.f6097a     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.util.List r4 = r4.mo24021k()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                if (r4 == 0) goto L_0x0295
                l.b r4 = r6.f6097a     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.util.List r4 = r4.mo24021k()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                kotlin.jvm.internal.C13706o.m87926c(r4)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                boolean r4 = r4.isEmpty()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                r4 = r4 ^ r3
                if (r4 == 0) goto L_0x0295
                l.b r4 = r6.f6097a     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.util.List r4 = r4.mo24021k()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                kotlin.jvm.internal.C13706o.m87926c(r4)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                int r4 = r4.size()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                if (r4 <= r3) goto L_0x0295
                l.b r0 = r6.f6097a     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.util.List r0 = r0.mo24021k()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                kotlin.jvm.internal.C13706o.m87926c(r0)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
            L_0x027d:
                boolean r4 = r0.hasNext()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                if (r4 == 0) goto L_0x02a3
                java.lang.Object r4 = r0.next()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.lang.String r4 = (java.lang.String) r4     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                javax.mail.internet.MimeBodyPart r5 = new javax.mail.internet.MimeBodyPart     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                r5.<init>()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                r5.attachFile((java.lang.String) r4)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                r2.addBodyPart(r5)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                goto L_0x027d
            L_0x0295:
                l.b r4 = r6.f6097a     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.lang.String r4 = r4.mo24020j()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                if (r4 == 0) goto L_0x02a3
                r0.attachFile((java.lang.String) r4)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                r2.addBodyPart(r0)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
            L_0x02a3:
                r1.setContent(r2)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                javax.mail.Transport.send(r1)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                l.b r0 = r6.f6097a     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                r0.f6094t = r3     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.lang.String r0 = "Success"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                r1.<init>()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.lang.String r2 = "Success, mail sent [STATUS: "
                r1.append(r2)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                l.b r2 = r6.f6097a     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                boolean r2 = r2.mo24028r()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                r1.append(r2)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                r2 = 93
                r1.append(r2)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                java.lang.String r1 = r1.toString()     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                android.util.Log.i(r0, r1)     // Catch:{ MessagingException -> 0x02f8, IOException -> 0x02d2 }
                goto L_0x030b
            L_0x02d0:
                r0 = move-exception
                goto L_0x0311
            L_0x02d2:
                r0 = move-exception
                java.lang.String r1 = "IOException"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x02d0 }
                r2.<init>()     // Catch:{ all -> 0x02d0 }
                java.lang.String r3 = "IOException "
                r2.append(r3)     // Catch:{ all -> 0x02d0 }
                r0.printStackTrace()     // Catch:{ all -> 0x02d0 }
                ja.u r3 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x02d0 }
                r2.append(r3)     // Catch:{ all -> 0x02d0 }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x02d0 }
                android.util.Log.e(r1, r2)     // Catch:{ all -> 0x02d0 }
                l.b r1 = r6.f6097a     // Catch:{ all -> 0x02d0 }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x02d0 }
                r1.f6095u = r0     // Catch:{ all -> 0x02d0 }
                goto L_0x030b
            L_0x02f8:
                r0 = move-exception
                java.lang.String r1 = "MessagingException"
                java.lang.String r2 = r0.toString()     // Catch:{ all -> 0x02d0 }
                android.util.Log.e(r1, r2)     // Catch:{ all -> 0x02d0 }
                l.b r1 = r6.f6097a     // Catch:{ all -> 0x02d0 }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x02d0 }
                r1.f6095u = r0     // Catch:{ all -> 0x02d0 }
            L_0x030b:
                l.b r0 = r6.f6097a
                r0.m8305h()
                return
            L_0x0311:
                l.b r1 = r6.f6097a
                r1.m8305h()
                throw r0
            L_0x0317:
                javax.mail.AuthenticationFailedException r0 = new javax.mail.AuthenticationFailedException
                r0.<init>(r2)
                throw r0
            L_0x031d:
                javax.mail.AuthenticationFailedException r0 = new javax.mail.AuthenticationFailedException
                r0.<init>(r2)
                throw r0
            L_0x0323:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "MaildroidX detected that you didn't pass [port] value to the builder!"
                r0.<init>(r1)
                throw r0
            L_0x032b:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "MaildroidX detected that you didn't pass [smtp] value in to the builder!"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p036l.C1994b.C1996b.run():void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m8305h() {
        Handler handler = new Handler(Looper.getMainLooper());
        C1995a aVar = new C1995a(this);
        C1998c cVar = this.f6093s;
        handler.postDelayed(aVar, cVar != null ? cVar.mo24040a() : 0);
    }

    /* renamed from: A */
    public final String mo24002A() {
        return this.f6092r;
    }

    /* renamed from: B */
    public final boolean mo24003B() {
        return this.f6084j;
    }

    /* renamed from: C */
    public final C1994b mo24004C(boolean z) {
        this.f6088n = z;
        return this;
    }

    /* renamed from: D */
    public final boolean mo24005D() {
        return this.f6088n;
    }

    /* renamed from: E */
    public final void mo24006E() {
        mo24009H();
    }

    /* renamed from: F */
    public final C1994b mo24007F(C1998c cVar) {
        this.f6093s = cVar;
        return this;
    }

    /* renamed from: G */
    public final C1994b mo24008G(String str) {
        C13706o.m87929f(str, ClientCookie.PORT_ATTR);
        this.f6089o = str;
        return this;
    }

    /* renamed from: H */
    public final boolean mo24009H() {
        if (C15176v.m93642w(this.f6092r, "HTML", false, 2, (Object) null)) {
            this.f6092r = "text/html; charset=utf-8";
        } else {
            this.f6092r = "text/plain";
        }
        new C1992a().mo24000a().execute(new C1996b(this));
        return false;
    }

    /* renamed from: I */
    public final C1994b mo24010I(String str) {
        C13706o.m87929f(str, "smtp");
        this.f6085k = str;
        return this;
    }

    /* renamed from: J */
    public final C1994b mo24011J(String str) {
        C13706o.m87929f(str, "smtpPassword");
        this.f6087m = str;
        return this;
    }

    /* renamed from: K */
    public final C1994b mo24012K(String str) {
        C13706o.m87929f(str, "smtpUsername");
        this.f6086l = str;
        return this;
    }

    /* renamed from: L */
    public final String mo24013L(String str) {
        C13706o.m87929f(str, "body");
        String clean = C15788a.clean(str, Whitelist.relaxed().addTags(new String[]{"style"}));
        C13706o.m87928e(clean, "strappedString");
        return clean;
    }

    /* renamed from: M */
    public final C1994b mo24014M(String str) {
        C13706o.m87929f(str, "subject");
        this.f6082h = str;
        return this;
    }

    /* renamed from: N */
    public final C1994b mo24015N(String str) {
        C13706o.m87929f(str, TypedValues.Transition.S_TO);
        this.f6075a = str;
        return this;
    }

    /* renamed from: O */
    public final C1994b mo24016O(C1999d dVar) {
        C13706o.m87929f(dVar, "type");
        this.f6092r = dVar.toString();
        return this;
    }

    /* renamed from: f */
    public final C1994b mo24017f(String str) {
        C13706o.m87929f(str, Part.ATTACHMENT);
        this.f6090p = str;
        return this;
    }

    /* renamed from: g */
    public final C1994b mo24018g(String str) {
        C13706o.m87929f(str, "body");
        this.f6083i = str;
        return this;
    }

    /* renamed from: i */
    public final C1994b mo24019i(String str) {
        C13706o.m87929f(str, TypedValues.Transition.S_FROM);
        this.f6081g = str;
        return this;
    }

    /* renamed from: j */
    public final String mo24020j() {
        return this.f6090p;
    }

    /* renamed from: k */
    public final List<String> mo24021k() {
        return this.f6091q;
    }

    /* renamed from: l */
    public final String mo24022l() {
        return this.f6079e;
    }

    /* renamed from: m */
    public final List<String> mo24023m() {
        return this.f6080f;
    }

    /* renamed from: n */
    public final String mo24024n() {
        return this.f6083i;
    }

    /* renamed from: o */
    public final String mo24025o() {
        return this.f6077c;
    }

    /* renamed from: p */
    public final List<String> mo24026p() {
        return this.f6078d;
    }

    /* renamed from: q */
    public final String mo24027q() {
        return this.f6081g;
    }

    /* renamed from: r */
    public final boolean mo24028r() {
        return this.f6094t;
    }

    /* renamed from: s */
    public final String mo24029s() {
        return this.f6089o;
    }

    /* renamed from: t */
    public final String mo24030t() {
        return this.f6085k;
    }

    /* renamed from: u */
    public final String mo24031u() {
        return this.f6087m;
    }

    /* renamed from: v */
    public final String mo24032v() {
        return this.f6086l;
    }

    /* renamed from: w */
    public final String mo24033w() {
        return this.f6082h;
    }

    /* renamed from: x */
    public final C1998c mo24034x() {
        return this.f6093s;
    }

    /* renamed from: y */
    public final String mo24035y() {
        return this.f6075a;
    }

    /* renamed from: z */
    public final List<String> mo24036z() {
        return this.f6076b;
    }
}
