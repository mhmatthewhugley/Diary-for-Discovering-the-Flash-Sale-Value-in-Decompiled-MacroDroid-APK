package p132m4;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p090f5.C7312g;
import p090f5.C7315j;
import p090f5.C7316k;
import p096g5.C7339a;
import p096g5.C7348c;
import p102h4.C7380e;

/* renamed from: m4.j */
/* compiled from: SafeKeyGenerator */
public class C7929j {

    /* renamed from: a */
    private final C7312g<C7380e, String> f19045a = new C7312g<>(1000);

    /* renamed from: b */
    private final Pools.Pool<C7931b> f19046b = C7339a.m30345d(10, new C7930a());

    /* renamed from: m4.j$a */
    /* compiled from: SafeKeyGenerator */
    class C7930a implements C7339a.C7343d<C7931b> {
        C7930a() {
        }

        /* renamed from: a */
        public C7931b create() {
            try {
                return new C7931b(MessageDigest.getInstance(KeyPropertiesCompact.DIGEST_SHA256));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: m4.j$b */
    /* compiled from: SafeKeyGenerator */
    private static final class C7931b implements C7339a.C7345f {

        /* renamed from: a */
        final MessageDigest f19048a;

        /* renamed from: c */
        private final C7348c f19049c = C7348c.m30358a();

        C7931b(MessageDigest messageDigest) {
            this.f19048a = messageDigest;
        }

        @NonNull
        /* renamed from: i */
        public C7348c mo24547i() {
            return this.f19049c;
        }
    }

    /* renamed from: a */
    private String m33154a(C7380e eVar) {
        C7931b bVar = (C7931b) C7315j.m30204d(this.f19046b.acquire());
        try {
            eVar.mo33009b(bVar.f19048a);
            return C7316k.m30224s(bVar.f19048a.digest());
        } finally {
            this.f19046b.release(bVar);
        }
    }

    /* renamed from: b */
    public String mo37827b(C7380e eVar) {
        String g;
        synchronized (this.f19045a) {
            g = this.f19045a.mo37254g(eVar);
        }
        if (g == null) {
            g = m33154a(eVar);
        }
        synchronized (this.f19045a) {
            this.f19045a.mo37258k(eVar, g);
        }
        return g;
    }
}
