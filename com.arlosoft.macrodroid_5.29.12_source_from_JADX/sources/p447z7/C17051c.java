package p447z7;

import com.sun.mail.util.PropUtil;
import java.util.Date;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MailDateFormat;

/* renamed from: z7.c */
/* compiled from: ENVELOPE */
public class C17051c implements C17058j {

    /* renamed from: A */
    static final char[] f68450A = {'E', 'N', 'V', 'E', 'L', 'O', 'P', 'E'};

    /* renamed from: B */
    private static final MailDateFormat f68451B = new MailDateFormat();

    /* renamed from: C */
    private static final boolean f68452C = PropUtil.getBooleanSystemProperty("mail.imap.parse.debug", false);

    /* renamed from: a */
    public Date f68453a;

    /* renamed from: c */
    public String f68454c;

    /* renamed from: d */
    public InternetAddress[] f68455d;

    /* renamed from: f */
    public InternetAddress[] f68456f;

    /* renamed from: g */
    public InternetAddress[] f68457g;

    /* renamed from: o */
    public InternetAddress[] f68458o;

    /* renamed from: p */
    public InternetAddress[] f68459p;

    /* renamed from: s */
    public InternetAddress[] f68460s;

    /* renamed from: z */
    public String f68461z;
}
