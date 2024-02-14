package p438y7;

import com.sun.mail.iap.ProtocolException;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.MethodNotSupportedException;
import p438y7.C16941c;
import p447z7.C17055g;
import p447z7.C17059k;

/* renamed from: y7.a */
/* compiled from: DefaultFolder */
public class C16937a extends C16941c {

    /* renamed from: y7.a$a */
    /* compiled from: DefaultFolder */
    class C16938a implements C16941c.C16953l {

        /* renamed from: a */
        final /* synthetic */ String f68206a;

        C16938a(String str) {
            this.f68206a = str;
        }

        /* renamed from: a */
        public Object mo80128a(C17055g gVar) throws ProtocolException {
            return gVar.mo80290G("", this.f68206a);
        }
    }

    /* renamed from: y7.a$b */
    /* compiled from: DefaultFolder */
    class C16939b implements C16941c.C16953l {

        /* renamed from: a */
        final /* synthetic */ String f68208a;

        C16939b(String str) {
            this.f68208a = str;
        }

        /* renamed from: a */
        public Object mo80128a(C17055g gVar) throws ProtocolException {
            return gVar.mo80292I("", this.f68208a);
        }
    }

    protected C16937a(C16960i iVar) {
        super("", 65535, iVar, (Boolean) null);
        this.f68243p = true;
        this.f68239d = 2;
    }

    public void appendMessages(Message[] messageArr) throws MessagingException {
        throw new MethodNotSupportedException("Cannot append to Default Folder");
    }

    public boolean delete(boolean z) throws MessagingException {
        throw new MethodNotSupportedException("Cannot delete Default Folder");
    }

    public Message[] expunge() throws MessagingException {
        throw new MethodNotSupportedException("Cannot expunge Default Folder");
    }

    public Folder getFolder(String str) throws MessagingException {
        return ((C16960i) this.store).mo80174A(str, 65535);
    }

    public synchronized String getName() {
        return this.f68237a;
    }

    public Folder getParent() {
        return null;
    }

    public boolean hasNewMessages() throws MessagingException {
        return false;
    }

    public synchronized Folder[] list(String str) throws MessagingException {
        C17059k[] kVarArr = (C17059k[]) mo80146s(new C16938a(str));
        if (kVarArr == null) {
            return new Folder[0];
        }
        int length = kVarArr.length;
        C16941c[] cVarArr = new C16941c[length];
        for (int i = 0; i < length; i++) {
            cVarArr[i] = ((C16960i) this.store).mo80176C(kVarArr[i]);
        }
        return cVarArr;
    }

    public synchronized Folder[] listSubscribed(String str) throws MessagingException {
        C17059k[] kVarArr = (C17059k[]) mo80146s(new C16939b(str));
        if (kVarArr == null) {
            return new Folder[0];
        }
        int length = kVarArr.length;
        C16941c[] cVarArr = new C16941c[length];
        for (int i = 0; i < length; i++) {
            cVarArr[i] = ((C16960i) this.store).mo80176C(kVarArr[i]);
        }
        return cVarArr;
    }

    public boolean renameTo(Folder folder) throws MessagingException {
        throw new MethodNotSupportedException("Cannot rename Default Folder");
    }
}
