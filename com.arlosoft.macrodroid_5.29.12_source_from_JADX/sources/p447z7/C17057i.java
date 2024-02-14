package p447z7;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.mail.internet.MailDateFormat;

/* renamed from: z7.i */
/* compiled from: INTERNALDATE */
public class C17057i implements C17058j {

    /* renamed from: c */
    static final char[] f68471c = {'I', 'N', 'T', 'E', 'R', 'N', 'A', 'L', 'D', 'A', 'T', 'E'};

    /* renamed from: d */
    private static final MailDateFormat f68472d = new MailDateFormat();

    /* renamed from: f */
    private static SimpleDateFormat f68473f = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss ", Locale.US);

    /* renamed from: a */
    protected Date f68474a;

    /* renamed from: a */
    public Date mo80333a() {
        return this.f68474a;
    }
}
