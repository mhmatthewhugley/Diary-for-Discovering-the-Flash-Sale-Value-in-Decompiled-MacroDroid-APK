package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzbep {

    /* renamed from: a */
    private final zzbev f26711a;

    /* renamed from: b */
    private final zzbge f26712b;

    /* renamed from: c */
    private final boolean f26713c;

    private zzbep() {
        this.f26712b = zzbgf.m43336H();
        this.f26713c = false;
        this.f26711a = new zzbev();
    }

    /* renamed from: a */
    public static zzbep m43241a() {
        return new zzbep();
    }

    /* renamed from: d */
    private final synchronized String m43242d(int i) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", new Object[]{this.f26712b.mo42583E(), Long.valueOf(zzt.m2889b().mo21952c()), Integer.valueOf(i - 1), Base64.encodeToString(((zzbgf) this.f26712b.mo47341h()).mo47050p(), 3)});
    }

    /* renamed from: e */
    private final synchronized void m43243e(int i) {
        FileOutputStream fileOutputStream;
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            try {
                fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
                try {
                    fileOutputStream.write(m43242d(i).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        zze.m2645k("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    zze.m2645k("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        zze.m2645k("Could not close Clearcut output stream.");
                    }
                }
            } catch (FileNotFoundException unused4) {
                zze.m2645k("Could not find file for Clearcut");
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused5) {
                    zze.m2645k("Could not close Clearcut output stream.");
                }
                throw th;
            }
        }
    }

    /* renamed from: f */
    private final synchronized void m43244f(int i) {
        zzbge zzbge = this.f26712b;
        zzbge.mo42587v();
        List<String> b = zzbjc.m43541b();
        ArrayList arrayList = new ArrayList();
        for (String split : b) {
            for (String valueOf : split.split(",")) {
                try {
                    arrayList.add(Long.valueOf(valueOf));
                } catch (NumberFormatException unused) {
                    zze.m2645k("Experiment ID is not a number");
                }
            }
        }
        zzbge.mo42586u(arrayList);
        zzbeu zzbeu = new zzbeu(this.f26711a, ((zzbgf) this.f26712b.mo47341h()).mo47050p(), (zzbet) null);
        int i2 = i - 1;
        zzbeu.mo42554a(i2);
        zzbeu.mo42555c();
        zze.m2645k("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i2, 10))));
    }

    /* renamed from: b */
    public final synchronized void mo42550b(zzbeo zzbeo) {
        if (this.f26713c) {
            try {
                zzbeo.mo42549a(this.f26712b);
            } catch (NullPointerException e) {
                zzt.m2904q().mo43503t(e, "AdMobClearcutLogger.modify");
            }
        }
    }

    /* renamed from: c */
    public final synchronized void mo42551c(int i) {
        if (this.f26713c) {
            if (((Boolean) zzay.m1924c().mo42663b(zzbjc.f27076b4)).booleanValue()) {
                m43243e(i);
            } else {
                m43244f(i);
            }
        }
    }

    public zzbep(zzbev zzbev) {
        this.f26712b = zzbgf.m43336H();
        this.f26711a = zzbev;
        this.f26713c = ((Boolean) zzay.m1924c().mo42663b(zzbjc.f27066a4)).booleanValue();
    }
}
