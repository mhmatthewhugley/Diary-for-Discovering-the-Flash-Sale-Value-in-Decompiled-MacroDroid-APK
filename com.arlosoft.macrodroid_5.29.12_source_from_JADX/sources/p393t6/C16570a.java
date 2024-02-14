package p393t6;

import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;

/* renamed from: t6.a */
/* compiled from: FileCache */
public class C16570a {

    /* renamed from: i */
    private static String f67360i = "MD5";

    /* renamed from: j */
    static MessageDigest f67361j;

    /* renamed from: a */
    boolean f67362a;

    /* renamed from: b */
    Random f67363b = new Random();

    /* renamed from: c */
    long f67364c = 4096;

    /* renamed from: d */
    C16574d f67365d;

    /* renamed from: e */
    File f67366e;

    /* renamed from: f */
    long f67367f;

    /* renamed from: g */
    Comparator<File> f67368g = new C16571a();

    /* renamed from: h */
    boolean f67369h;

    /* renamed from: t6.a$a */
    /* compiled from: FileCache */
    class C16571a implements Comparator<File> {
        C16571a() {
        }

        /* renamed from: a */
        public int compare(File file, File file2) {
            long lastModified = file.lastModified();
            long lastModified2 = file2.lastModified();
            if (lastModified < lastModified2) {
                return -1;
            }
            return lastModified2 > lastModified ? 1 : 0;
        }
    }

    /* renamed from: t6.a$b */
    /* compiled from: FileCache */
    class C16572b extends Thread {
        C16572b() {
        }

        public void run() {
            C16570a.this.mo79385c();
        }
    }

    /* renamed from: t6.a$c */
    /* compiled from: FileCache */
    class C16573c {

        /* renamed from: a */
        final long f67372a;

        public C16573c(File file) {
            this.f67372a = file.length();
        }
    }

    /* renamed from: t6.a$d */
    /* compiled from: FileCache */
    class C16574d extends C16577d<String, C16573c> {
        public C16574d() {
            super(C16570a.this.f67367f);
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo79389b(boolean z, String str, C16573c cVar, C16573c cVar2) {
            super.mo79389b(z, str, cVar, cVar2);
            if (cVar2 == null && !C16570a.this.f67369h) {
                new File(C16570a.this.f67366e, str).delete();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public long mo79390f(String str, C16573c cVar) {
            return Math.max(C16570a.this.f67364c, cVar.f67372a);
        }
    }

    static {
        try {
            f67361j = MessageDigest.getInstance(KeyPropertiesCompact.DIGEST_MD5);
        } catch (NoSuchAlgorithmException e) {
            MessageDigest b = m98796b();
            f67361j = b;
            if (b == null) {
                throw new RuntimeException(e);
            }
        }
        try {
            f67361j = (MessageDigest) f67361j.clone();
        } catch (CloneNotSupportedException unused) {
        }
    }

    public C16570a(File file, long j, boolean z) {
        this.f67366e = file;
        this.f67367f = j;
        this.f67362a = z;
        this.f67365d = new C16574d();
        file.mkdirs();
        m98795a();
    }

    /* renamed from: a */
    private void m98795a() {
        if (this.f67362a) {
            new C16572b().start();
        } else {
            mo79385c();
        }
    }

    /* renamed from: b */
    private static MessageDigest m98796b() {
        if (!KeyPropertiesCompact.DIGEST_MD5.equals(f67360i)) {
            return null;
        }
        for (Provider services : Security.getProviders()) {
            for (Provider.Service algorithm : services.getServices()) {
                String algorithm2 = algorithm.getAlgorithm();
                f67360i = algorithm2;
                try {
                    MessageDigest instance = MessageDigest.getInstance(algorithm2);
                    if (instance != null) {
                        return instance;
                    }
                } catch (NoSuchAlgorithmException unused) {
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo79385c() {
        this.f67369h = true;
        try {
            File[] listFiles = this.f67366e.listFiles();
            if (listFiles != null) {
                ArrayList arrayList = new ArrayList();
                Collections.addAll(arrayList, listFiles);
                Collections.sort(arrayList, this.f67368g);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    File file = (File) it.next();
                    String name = file.getName();
                    this.f67365d.mo79398d(name, new C16573c(file));
                    this.f67365d.mo79397c(name);
                }
                this.f67369h = false;
            }
        } finally {
            this.f67369h = false;
        }
    }
}
