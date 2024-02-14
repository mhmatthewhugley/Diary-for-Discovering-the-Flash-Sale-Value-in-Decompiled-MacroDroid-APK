package p436xd;

import java.io.InputStream;
import java.net.URL;
import java.util.Iterator;
import org.mockito.exceptions.base.MockitoException;
import p291ie.C12517a;
import p321le.C15633d;

/* renamed from: xd.d */
/* compiled from: PluginFinder */
class C16931d {

    /* renamed from: a */
    private final C15633d f68192a;

    public C16931d(C15633d dVar) {
        this.f68192a = dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo80122a(Iterable<URL> iterable) {
        Iterator<URL> it = iterable.iterator();
        while (true) {
            InputStream inputStream = null;
            if (!it.hasNext()) {
                return null;
            }
            URL next = it.next();
            try {
                inputStream = next.openStream();
                String a = new C16930c().mo80121a(inputStream);
                if (a != null) {
                    if (this.f68192a.mo74997a(a)) {
                        C12517a.m83627b(inputStream);
                        return a;
                    }
                }
                C12517a.m83627b(inputStream);
            } catch (Exception e) {
                throw new MockitoException("Problems reading plugin implementation from: " + next, e);
            } catch (Throwable th) {
                C12517a.m83627b(inputStream);
                throw th;
            }
        }
    }
}
