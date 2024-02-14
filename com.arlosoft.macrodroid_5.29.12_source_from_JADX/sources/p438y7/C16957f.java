package p438y7;

import java.util.ArrayList;
import java.util.List;
import javax.mail.BodyPart;
import javax.mail.MessagingException;
import javax.mail.MultipartDataSource;
import javax.mail.internet.MimePart;
import javax.mail.internet.MimePartDataSource;
import p447z7.C17050b;

/* renamed from: y7.f */
/* compiled from: IMAPMultipartDataSource */
public class C16957f extends MimePartDataSource implements MultipartDataSource {

    /* renamed from: a */
    private List<C16940b> f68309a;

    protected C16957f(MimePart mimePart, C17050b[] bVarArr, String str, C16955e eVar) {
        super(mimePart);
        String str2;
        this.f68309a = new ArrayList(bVarArr.length);
        for (int i = 0; i < bVarArr.length; i++) {
            List<C16940b> list = this.f68309a;
            C17050b bVar = bVarArr[i];
            if (str == null) {
                str2 = Integer.toString(i + 1);
            } else {
                str2 = str + "." + Integer.toString(i + 1);
            }
            list.add(new C16940b(bVar, str2, eVar));
        }
    }

    public BodyPart getBodyPart(int i) throws MessagingException {
        return this.f68309a.get(i);
    }

    public int getCount() {
        return this.f68309a.size();
    }
}
