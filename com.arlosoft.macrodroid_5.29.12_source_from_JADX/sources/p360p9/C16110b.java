package p360p9;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.UIDFolder;
import p226cd.C11179b;
import p226cd.C11188e;
import p360p9.C16132i;
import p369q9.C16236a;
import p369q9.C16239c;
import p369q9.C16240d;
import p369q9.C16252i;

/* renamed from: p9.b */
/* compiled from: ExceptionHandlingFrameWriter */
final class C16110b implements C16239c {

    /* renamed from: f */
    private static final Logger f66089f = Logger.getLogger(C16124h.class.getName());

    /* renamed from: a */
    private final C16111a f66090a;

    /* renamed from: c */
    private final C16239c f66091c;

    /* renamed from: d */
    private final C16132i f66092d;

    /* renamed from: p9.b$a */
    /* compiled from: ExceptionHandlingFrameWriter */
    interface C16111a {
        /* renamed from: a */
        void mo78457a(Throwable th);
    }

    C16110b(C16111a aVar, C16239c cVar) {
        this(aVar, cVar, new C16132i(Level.FINE, (Class<?>) C16124h.class));
    }

    @VisibleForTesting
    /* renamed from: b */
    static Level m96745b(Throwable th) {
        if (th.getClass().equals(IOException.class)) {
            return Level.FINE;
        }
        return Level.INFO;
    }

    /* renamed from: P0 */
    public void mo78445P0(C16252i iVar) {
        this.f66092d.mo78515j(C16132i.C16133a.OUTBOUND);
        try {
            this.f66091c.mo78445P0(iVar);
        } catch (IOException e) {
            this.f66090a.mo78457a(e);
        }
    }

    /* renamed from: T0 */
    public int mo78446T0() {
        return this.f66091c.mo78446T0();
    }

    /* renamed from: X0 */
    public void mo78447X0(boolean z, int i, C11179b bVar, int i2) {
        this.f66092d.mo78507b(C16132i.C16133a.OUTBOUND, i, bVar.mo62416T(), i2, z);
        try {
            this.f66091c.mo78447X0(z, i, bVar, i2);
        } catch (IOException e) {
            this.f66090a.mo78457a(e);
        }
    }

    public void close() {
        try {
            this.f66091c.close();
        } catch (IOException e) {
            f66089f.log(m96745b(e), "Failed closing connection", e);
        }
    }

    /* renamed from: d */
    public void mo78449d(int i, long j) {
        this.f66092d.mo78516k(C16132i.C16133a.OUTBOUND, i, j);
        try {
            this.f66091c.mo78449d(i, j);
        } catch (IOException e) {
            this.f66090a.mo78457a(e);
        }
    }

    /* renamed from: d0 */
    public void mo78450d0() {
        try {
            this.f66091c.mo78450d0();
        } catch (IOException e) {
            this.f66090a.mo78457a(e);
        }
    }

    /* renamed from: f2 */
    public void mo78451f2(boolean z, boolean z2, int i, int i2, List<C16240d> list) {
        try {
            this.f66091c.mo78451f2(z, z2, i, i2, list);
        } catch (IOException e) {
            this.f66090a.mo78457a(e);
        }
    }

    public void flush() {
        try {
            this.f66091c.flush();
        } catch (IOException e) {
            this.f66090a.mo78457a(e);
        }
    }

    /* renamed from: k */
    public void mo78453k(boolean z, int i, int i2) {
        if (z) {
            this.f66092d.mo78511f(C16132i.C16133a.OUTBOUND, (UIDFolder.MAXUID & ((long) i2)) | (((long) i) << 32));
        } else {
            this.f66092d.mo78510e(C16132i.C16133a.OUTBOUND, (UIDFolder.MAXUID & ((long) i2)) | (((long) i) << 32));
        }
        try {
            this.f66091c.mo78453k(z, i, i2);
        } catch (IOException e) {
            this.f66090a.mo78457a(e);
        }
    }

    /* renamed from: m1 */
    public void mo78454m1(C16252i iVar) {
        this.f66092d.mo78514i(C16132i.C16133a.OUTBOUND, iVar);
        try {
            this.f66091c.mo78454m1(iVar);
        } catch (IOException e) {
            this.f66090a.mo78457a(e);
        }
    }

    /* renamed from: r1 */
    public void mo78455r1(int i, C16236a aVar, byte[] bArr) {
        this.f66092d.mo78508c(C16132i.C16133a.OUTBOUND, i, aVar, C11188e.m75104r(bArr));
        try {
            this.f66091c.mo78455r1(i, aVar, bArr);
            this.f66091c.flush();
        } catch (IOException e) {
            this.f66090a.mo78457a(e);
        }
    }

    /* renamed from: t */
    public void mo78456t(int i, C16236a aVar) {
        this.f66092d.mo78513h(C16132i.C16133a.OUTBOUND, i, aVar);
        try {
            this.f66091c.mo78456t(i, aVar);
        } catch (IOException e) {
            this.f66090a.mo78457a(e);
        }
    }

    @VisibleForTesting
    C16110b(C16111a aVar, C16239c cVar, C16132i iVar) {
        this.f66090a = (C16111a) Preconditions.m5393t(aVar, "transportExceptionHandler");
        this.f66091c = (C16239c) Preconditions.m5393t(cVar, "frameWriter");
        this.f66092d = (C16132i) Preconditions.m5393t(iVar, "frameLogger");
    }
}
