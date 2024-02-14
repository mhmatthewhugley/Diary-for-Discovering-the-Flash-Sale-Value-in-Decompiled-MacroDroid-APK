package com.google.android.play.core.splitcompat;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final class zzm {

    /* renamed from: b */
    private static final Pattern f51783b = Pattern.compile("lib/([^/]+)/(.*\\.so)$");

    /* renamed from: a */
    private final zze f51784a;

    zzm(zze zze) throws IOException {
        this.f51784a = zze;
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ Set m71099a(zzm zzm, Set set, zzs zzs, ZipFile zipFile) {
        HashSet hashSet = new HashSet();
        zzm.m71102f(zzs, set, new zzi(zzm, hashSet, zzs, zipFile));
        return hashSet;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e1 A[SYNTHETIC, Splitter:B:31:0x00e1] */
    @androidx.annotation.RequiresApi(21)
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m71101e(com.google.android.play.core.splitcompat.zzs r12, com.google.android.play.core.splitcompat.zzj r13) throws java.io.IOException {
        /*
            java.util.zip.ZipFile r0 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x00dd }
            java.io.File r1 = r12.mo59935a()     // Catch:{ IOException -> 0x00dd }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00dd }
            java.lang.String r12 = r12.mo59936b()     // Catch:{ IOException -> 0x00db }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ IOException -> 0x00db }
            r1.<init>()     // Catch:{ IOException -> 0x00db }
            java.util.Enumeration r2 = r0.entries()     // Catch:{ IOException -> 0x00db }
        L_0x0016:
            boolean r3 = r2.hasMoreElements()     // Catch:{ IOException -> 0x00db }
            r4 = 2
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L_0x0064
            java.lang.Object r3 = r2.nextElement()     // Catch:{ IOException -> 0x00db }
            java.util.zip.ZipEntry r3 = (java.util.zip.ZipEntry) r3     // Catch:{ IOException -> 0x00db }
            java.lang.String r7 = r3.getName()     // Catch:{ IOException -> 0x00db }
            java.util.regex.Pattern r8 = f51783b     // Catch:{ IOException -> 0x00db }
            java.util.regex.Matcher r7 = r8.matcher(r7)     // Catch:{ IOException -> 0x00db }
            boolean r8 = r7.matches()     // Catch:{ IOException -> 0x00db }
            if (r8 == 0) goto L_0x0016
            java.lang.String r8 = r7.group(r6)     // Catch:{ IOException -> 0x00db }
            java.lang.String r7 = r7.group(r4)     // Catch:{ IOException -> 0x00db }
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ IOException -> 0x00db }
            r9[r5] = r12     // Catch:{ IOException -> 0x00db }
            r9[r6] = r7     // Catch:{ IOException -> 0x00db }
            r9[r4] = r8     // Catch:{ IOException -> 0x00db }
            java.lang.String r4 = "NativeLibraryExtractor: split '%s' has native library '%s' for ABI '%s'"
            java.lang.String.format(r4, r9)     // Catch:{ IOException -> 0x00db }
            java.lang.Object r4 = r1.get(r8)     // Catch:{ IOException -> 0x00db }
            java.util.Set r4 = (java.util.Set) r4     // Catch:{ IOException -> 0x00db }
            if (r4 != 0) goto L_0x005b
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ IOException -> 0x00db }
            r4.<init>()     // Catch:{ IOException -> 0x00db }
            r1.put(r8, r4)     // Catch:{ IOException -> 0x00db }
        L_0x005b:
            com.google.android.play.core.splitcompat.zzl r5 = new com.google.android.play.core.splitcompat.zzl     // Catch:{ IOException -> 0x00db }
            r5.<init>(r3, r7)     // Catch:{ IOException -> 0x00db }
            r4.add(r5)     // Catch:{ IOException -> 0x00db }
            goto L_0x0016
        L_0x0064:
            java.util.HashMap r12 = new java.util.HashMap     // Catch:{ IOException -> 0x00db }
            r12.<init>()     // Catch:{ IOException -> 0x00db }
            java.lang.String[] r2 = android.os.Build.SUPPORTED_ABIS     // Catch:{ IOException -> 0x00db }
            int r3 = r2.length     // Catch:{ IOException -> 0x00db }
            r7 = 0
        L_0x006d:
            if (r7 >= r3) goto L_0x00cb
            r8 = r2[r7]     // Catch:{ IOException -> 0x00db }
            boolean r9 = r1.containsKey(r8)     // Catch:{ IOException -> 0x00db }
            if (r9 == 0) goto L_0x00bf
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ IOException -> 0x00db }
            r9[r5] = r8     // Catch:{ IOException -> 0x00db }
            java.lang.String r10 = "NativeLibraryExtractor: there are native libraries for supported ABI %s; will use this ABI"
            java.lang.String.format(r10, r9)     // Catch:{ IOException -> 0x00db }
            java.lang.Object r9 = r1.get(r8)     // Catch:{ IOException -> 0x00db }
            java.util.Set r9 = (java.util.Set) r9     // Catch:{ IOException -> 0x00db }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ IOException -> 0x00db }
        L_0x008a:
            boolean r10 = r9.hasNext()     // Catch:{ IOException -> 0x00db }
            if (r10 == 0) goto L_0x00c8
            java.lang.Object r10 = r9.next()     // Catch:{ IOException -> 0x00db }
            com.google.android.play.core.splitcompat.zzl r10 = (com.google.android.play.core.splitcompat.zzl) r10     // Catch:{ IOException -> 0x00db }
            java.lang.String r11 = r10.f51781a     // Catch:{ IOException -> 0x00db }
            boolean r11 = r12.containsKey(r11)     // Catch:{ IOException -> 0x00db }
            if (r11 == 0) goto L_0x00ac
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x00db }
            java.lang.String r10 = r10.f51781a     // Catch:{ IOException -> 0x00db }
            r11[r5] = r10     // Catch:{ IOException -> 0x00db }
            r11[r6] = r8     // Catch:{ IOException -> 0x00db }
            java.lang.String r10 = "NativeLibraryExtractor: skipping library %s for ABI %s; already present for a better ABI"
            java.lang.String.format(r10, r11)     // Catch:{ IOException -> 0x00db }
            goto L_0x008a
        L_0x00ac:
            java.lang.String r11 = r10.f51781a     // Catch:{ IOException -> 0x00db }
            r12.put(r11, r10)     // Catch:{ IOException -> 0x00db }
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x00db }
            java.lang.String r10 = r10.f51781a     // Catch:{ IOException -> 0x00db }
            r11[r5] = r10     // Catch:{ IOException -> 0x00db }
            r11[r6] = r8     // Catch:{ IOException -> 0x00db }
            java.lang.String r10 = "NativeLibraryExtractor: using library %s for ABI %s"
            java.lang.String.format(r10, r11)     // Catch:{ IOException -> 0x00db }
            goto L_0x008a
        L_0x00bf:
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ IOException -> 0x00db }
            r9[r5] = r8     // Catch:{ IOException -> 0x00db }
            java.lang.String r8 = "NativeLibraryExtractor: there are no native libraries for supported ABI %s"
            java.lang.String.format(r8, r9)     // Catch:{ IOException -> 0x00db }
        L_0x00c8:
            int r7 = r7 + 1
            goto L_0x006d
        L_0x00cb:
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ IOException -> 0x00db }
            java.util.Collection r12 = r12.values()     // Catch:{ IOException -> 0x00db }
            r1.<init>(r12)     // Catch:{ IOException -> 0x00db }
            r13.mo59955a(r0, r1)     // Catch:{ IOException -> 0x00db }
            r0.close()     // Catch:{ IOException -> 0x00db }
            return
        L_0x00db:
            r12 = move-exception
            goto L_0x00df
        L_0x00dd:
            r12 = move-exception
            r0 = 0
        L_0x00df:
            if (r0 == 0) goto L_0x00e4
            r0.close()     // Catch:{ IOException -> 0x00e4 }
        L_0x00e4:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitcompat.zzm.m71101e(com.google.android.play.core.splitcompat.zzs, com.google.android.play.core.splitcompat.zzj):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m71102f(zzs zzs, Set set, zzk zzk) throws IOException {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzl zzl = (zzl) it.next();
            File c = this.f51784a.mo59943c(zzs.mo59936b(), zzl.f51781a);
            boolean z = false;
            if (c.exists() && c.length() == zzl.f51782b.getSize() && zze.m71071p(c)) {
                z = true;
            }
            zzk.mo59954a(zzl, c, z);
        }
    }

    /* access modifiers changed from: package-private */
    @RequiresApi(21)
    @Nullable
    /* renamed from: b */
    public final Set mo59956b(zzs zzs) throws IOException {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        HashSet hashSet = new HashSet();
        m71101e(zzs, new zzg(this, zzs, hashSet, atomicBoolean));
        if (atomicBoolean.get()) {
            return hashSet;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    @RequiresApi(21)
    /* renamed from: c */
    public final Set mo59957c() throws IOException {
        Set<zzs> j = this.f51784a.mo59950j();
        for (String str : this.f51784a.mo59948h()) {
            Iterator it = j.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((zzs) it.next()).mo59936b().equals(str)) {
                        break;
                    }
                } else {
                    Log.i("SplitCompat", String.format("NativeLibraryExtractor: extracted split '%s' has no corresponding split; deleting", new Object[]{str}));
                    this.f51784a.mo59952n(str);
                    break;
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (zzs zzs : j) {
            HashSet hashSet2 = new HashSet();
            m71101e(zzs, new zzh(this, hashSet2, zzs));
            for (File file : this.f51784a.mo59949i(zzs.mo59936b())) {
                if (!hashSet2.contains(file)) {
                    Log.i("SplitCompat", String.format("NativeLibraryExtractor: file '%s' found in split '%s' that is not in the split file '%s'; removing", new Object[]{file.getAbsolutePath(), zzs.mo59936b(), zzs.mo59935a().getAbsolutePath()}));
                    this.f51784a.mo59953o(file);
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }
}
