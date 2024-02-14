package p375r6;

import com.koushikdutta.async.C11694b;
import java.io.File;
import java.io.IOException;
import p366q6.C16217a;
import p366q6.C16218b;
import p366q6.C16224h;
import p393t6.C16570a;

/* renamed from: r6.a */
/* compiled from: ResponseCacheMiddleware */
public class C16350a extends C16224h {

    /* renamed from: a */
    private boolean f66839a = true;

    /* renamed from: b */
    private C16570a f66840b;

    /* renamed from: c */
    private C11694b f66841c;

    private C16350a() {
    }

    /* renamed from: a */
    public static C16350a m98042a(C16217a aVar, File file, long j) throws IOException {
        for (C16218b bVar : aVar.mo78736a()) {
            if (bVar instanceof C16350a) {
                throw new IOException("Response cache already added to http client");
            }
        }
        C16350a aVar2 = new C16350a();
        aVar2.f66841c = aVar.mo78738c();
        aVar2.f66840b = new C16570a(file, j, false);
        aVar.mo78740e(aVar2);
        return aVar2;
    }
}
