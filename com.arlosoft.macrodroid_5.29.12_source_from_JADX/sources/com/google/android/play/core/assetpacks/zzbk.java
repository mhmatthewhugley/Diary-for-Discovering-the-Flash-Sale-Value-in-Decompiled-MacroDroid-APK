package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.zzcm;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzbk extends zzcm {

    /* renamed from: a */
    private final File f51284a;

    /* renamed from: c */
    private final File f51285c;

    /* renamed from: d */
    private final NavigableMap f51286d = new TreeMap();

    zzbk(File file, File file2) throws IOException {
        this.f51284a = file;
        this.f51285c = file2;
        List<File> a = zzep.m70730a(file, file2);
        if (!a.isEmpty()) {
            long j = 0;
            for (File file3 : a) {
                this.f51286d.put(Long.valueOf(j), file3);
                j += file3.length();
            }
            return;
        }
        throw new zzck(String.format("Virtualized slice archive empty for %s, %s", new Object[]{file, file2}));
    }

    /* renamed from: f */
    private final InputStream m70593f(long j, Long l) throws IOException {
        FileInputStream fileInputStream = new FileInputStream((File) this.f51286d.get(l));
        if (fileInputStream.skip(j - l.longValue()) == j - l.longValue()) {
            return fileInputStream;
        }
        throw new zzck(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", new Object[]{l}));
    }

    /* renamed from: b */
    public final long mo59655b() {
        Map.Entry lastEntry = this.f51286d.lastEntry();
        return ((Long) lastEntry.getKey()).longValue() + ((File) lastEntry.getValue()).length();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final InputStream mo59656c(long j, long j2) throws IOException {
        if (j < 0 || j2 < 0) {
            throw new zzck(String.format("Invalid input parameters %s, %s", new Object[]{Long.valueOf(j), Long.valueOf(j2)}));
        }
        long j3 = j + j2;
        if (j3 <= mo59655b()) {
            Long l = (Long) this.f51286d.floorKey(Long.valueOf(j));
            Long l2 = (Long) this.f51286d.floorKey(Long.valueOf(j3));
            if (l.equals(l2)) {
                return new zzbj(m70593f(j, l), j2);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(m70593f(j, l));
            Collection values = this.f51286d.subMap(l, false, l2, false).values();
            if (!values.isEmpty()) {
                arrayList.add(new zzdr(Collections.enumeration(values)));
            }
            arrayList.add(new zzbj(new FileInputStream((File) this.f51286d.get(l2)), j2 - (l2.longValue() - j)));
            return new SequenceInputStream(Collections.enumeration(arrayList));
        }
        throw new zzck(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", new Object[]{Long.valueOf(mo59655b()), Long.valueOf(j3)}));
    }

    public final void close() {
    }
}
