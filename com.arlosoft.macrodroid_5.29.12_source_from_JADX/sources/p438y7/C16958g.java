package p438y7;

import com.sun.mail.iap.ProtocolException;
import javax.mail.Flags;
import javax.mail.FolderClosedException;
import javax.mail.MessageRemovedException;
import javax.mail.MessagingException;
import javax.mail.MethodNotSupportedException;
import p447z7.C17050b;
import p447z7.C17051c;
import p447z7.C17055g;

/* renamed from: y7.g */
/* compiled from: IMAPNestedMessage */
public class C16958g extends C16955e {

    /* renamed from: p */
    private C16955e f68310p;

    C16958g(C16955e eVar, C17050b bVar, C17051c cVar, String str) {
        super(eVar.mo80161e());
        this.f68310p = eVar;
        this.f68284a = bVar;
        this.f68285b = cVar;
        this.f68292i = str;
        mo80158K(eVar.mo80167u());
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public boolean mo80155A() {
        return this.f68310p.mo80155A();
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public boolean mo80156C() throws FolderClosedException {
        return this.f68310p.mo80156C();
    }

    public int getSize() throws MessagingException {
        return this.f68284a.f68445g;
    }

    public boolean isExpunged() {
        return this.f68310p.isExpunged();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo80163q() throws MessageRemovedException {
        this.f68310p.mo80163q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public int mo80165s() {
        return this.f68310p.mo80165s();
    }

    public synchronized void setFlags(Flags flags, boolean z) throws MessagingException {
        throw new MethodNotSupportedException("Cannot set flags on this nested message");
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public Object mo80166t() {
        return this.f68310p.mo80166t();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public C17055g mo80168v() throws ProtocolException, FolderClosedException {
        return this.f68310p.mo80168v();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public int mo80169w() {
        return this.f68310p.mo80169w();
    }
}
