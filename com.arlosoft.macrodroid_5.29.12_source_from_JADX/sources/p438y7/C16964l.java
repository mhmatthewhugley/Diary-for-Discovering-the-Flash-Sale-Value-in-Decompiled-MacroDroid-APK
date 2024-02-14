package p438y7;

import com.sun.mail.util.CRLFOutputStream;
import java.io.IOException;
import javax.mail.Message;
import javax.mail.MessagingException;
import p430x7.C16851b;

/* renamed from: y7.l */
/* compiled from: IMAPFolder */
class C16964l implements C16851b {

    /* renamed from: a */
    private Message f68342a;

    /* renamed from: b */
    private int f68343b = -1;

    /* renamed from: c */
    private byte[] f68344c;

    public C16964l(Message message, int i) throws MessagingException, IOException {
        this.f68342a = message;
        C16962j jVar = new C16962j(i);
        CRLFOutputStream cRLFOutputStream = new CRLFOutputStream(jVar);
        message.writeTo(cRLFOutputStream);
        cRLFOutputStream.flush();
        this.f68343b = jVar.mo80194c();
        this.f68344c = jVar.mo80193b();
    }
}
