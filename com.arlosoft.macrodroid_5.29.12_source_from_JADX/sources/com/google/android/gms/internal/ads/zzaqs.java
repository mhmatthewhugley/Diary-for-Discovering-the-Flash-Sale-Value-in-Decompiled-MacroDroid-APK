package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.ads.internal.client.zzay;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaqs extends zzarq {

    /* renamed from: A */
    private static final zzarr f25350A = new zzarr();

    /* renamed from: z */
    private final Context f25351z;

    public zzaqs(zzaqe zzaqe, String str, String str2, zzamk zzamk, int i, int i2, Context context, zzamd zzamd) {
        super(zzaqe, "hhtrMjcGMTQSGdrv1+l2gakNTe0Pfchc8VT5kRHtsehlafuJ8JEE4iewNV4y5I/U", "o5W1eROpLyVNcsDGW3Y0lGc2x/V+mDPvMXouv3gbW6M=", zzamk, i, 27);
        this.f25351z = context;
    }

    /* renamed from: d */
    private final String m42159d() {
        try {
            if (this.f25384c.mo41815l() != null) {
                this.f25384c.mo41815l().get();
            }
            zzana c = this.f25384c.mo41807c();
            if (c == null || !c.mo41740p0()) {
                return null;
            }
            return c.mo41738D0();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41843a() throws IllegalAccessException, InvocationTargetException {
        zzanq zzanq;
        int i;
        Boolean bool;
        AtomicReference a = f25350A.mo41850a(this.f25351z.getPackageName());
        synchronized (a) {
            zzanq zzanq2 = (zzanq) a.get();
            if (zzanq2 == null || zzaqh.m42134g(zzanq2.f24980a) || zzanq2.f24980a.equals(ExifInterface.LONGITUDE_EAST) || zzanq2.f24980a.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (!zzaqh.m42134g((String) null)) {
                    i = 5;
                } else {
                    if (!zzaqh.m42134g((String) null)) {
                        bool = Boolean.FALSE;
                    } else {
                        bool = Boolean.FALSE;
                    }
                    i = (!bool.booleanValue() || !this.f25384c.mo41817p()) ? 3 : 4;
                }
                Boolean valueOf = Boolean.valueOf(i == 3);
                Boolean bool2 = (Boolean) zzay.m1924c().mo42663b(zzbjc.f27045Y1);
                String c = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f27036X1)).booleanValue() ? mo41844c() : null;
                if (bool2.booleanValue() && this.f25384c.mo41817p() && zzaqh.m42134g(c)) {
                    c = m42159d();
                }
                zzanq zzanq3 = new zzanq((String) this.f25388o.invoke((Object) null, new Object[]{this.f25351z, valueOf, c}));
                if (zzaqh.m42134g(zzanq3.f24980a) || zzanq3.f24980a.equals(ExifInterface.LONGITUDE_EAST)) {
                    int i2 = i - 1;
                    if (i2 == 3) {
                        String d = m42159d();
                        if (!zzaqh.m42134g(d)) {
                            zzanq3.f24980a = d;
                        }
                    } else if (i2 == 4) {
                        throw null;
                    }
                }
                a.set(zzanq3);
            }
            zzanq = (zzanq) a.get();
        }
        synchronized (this.f25387g) {
            if (zzanq != null) {
                this.f25387g.mo41665I0(zzanq.f24980a);
                this.f25387g.mo41678U(zzanq.f24981b);
                this.f25387g.mo41680X(zzanq.f24982c);
                this.f25387g.mo41697p0(zzanq.f24983d);
                this.f25387g.mo41664H0(zzanq.f24984e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo41844c() {
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            byte[] i = zzaqh.m42136i((String) zzay.m1924c().mo42663b(zzbjc.f27054Z1));
            ArrayList arrayList = new ArrayList();
            arrayList.add(instance.generateCertificate(new ByteArrayInputStream(i)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(instance.generateCertificate(new ByteArrayInputStream(zzaqh.m42136i((String) zzay.m1924c().mo42663b(zzbjc.f27064a2)))));
            }
            Context context = this.f25351z;
            String packageName = context.getPackageName();
            this.f25384c.mo41814k();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals(ExifInterface.LATITUDE_SOUTH)) {
                return null;
            }
            zzfzy C = zzfzy.m51441C();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new zzars(C));
            return (String) C.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
