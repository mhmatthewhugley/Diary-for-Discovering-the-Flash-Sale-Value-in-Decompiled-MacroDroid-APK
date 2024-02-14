package p401te;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StreamCorruptedException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.threeten.p356bp.zone.ZoneRulesException;
import p383re.C16501d;

/* renamed from: te.c */
/* compiled from: TzdbZoneRulesProvider */
public final class C16625c extends C16636h {

    /* renamed from: c */
    private List<String> f67477c;

    /* renamed from: d */
    private final ConcurrentNavigableMap<String, C16626a> f67478d = new ConcurrentSkipListMap();

    /* renamed from: e */
    private Set<String> f67479e = new CopyOnWriteArraySet();

    /* renamed from: te.c$a */
    /* compiled from: TzdbZoneRulesProvider */
    static class C16626a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f67480a;

        /* renamed from: b */
        private final String[] f67481b;

        /* renamed from: c */
        private final short[] f67482c;

        /* renamed from: d */
        private final AtomicReferenceArray<Object> f67483d;

        C16626a(String str, String[] strArr, short[] sArr, AtomicReferenceArray<Object> atomicReferenceArray) {
            this.f67483d = atomicReferenceArray;
            this.f67480a = str;
            this.f67481b = strArr;
            this.f67482c = sArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C16631f mo79515b(short s) throws Exception {
            Object obj = this.f67483d.get(s);
            if (obj instanceof byte[]) {
                obj = C16623a.m98988a(new DataInputStream(new ByteArrayInputStream((byte[]) obj)));
                this.f67483d.set(s, obj);
            }
            return (C16631f) obj;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C16631f mo79516c(String str) {
            int binarySearch = Arrays.binarySearch(this.f67481b, str);
            if (binarySearch < 0) {
                return null;
            }
            try {
                return mo79515b(this.f67482c[binarySearch]);
            } catch (Exception e) {
                throw new ZoneRulesException("Invalid binary time-zone data: TZDB:" + str + ", version: " + this.f67480a, e);
            }
        }

        public String toString() {
            return this.f67480a;
        }
    }

    public C16625c(InputStream inputStream) {
        try {
            m99008g(inputStream);
        } catch (Exception e) {
            throw new ZoneRulesException("Unable to load TZDB time-zone rules", e);
        }
    }

    /* renamed from: g */
    private boolean m99008g(InputStream inputStream) throws IOException, StreamCorruptedException {
        boolean z = false;
        for (C16626a next : m99009h(inputStream)) {
            C16626a aVar = (C16626a) this.f67478d.putIfAbsent(next.f67480a, next);
            if (aVar == null || aVar.f67480a.equals(next.f67480a)) {
                z = true;
            } else {
                throw new ZoneRulesException("Data already loaded for TZDB time-zone rules version: " + next.f67480a);
            }
        }
        return z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Iterable<p401te.C16625c.C16626a> m99009h(java.io.InputStream r13) throws java.io.IOException, java.io.StreamCorruptedException {
        /*
            r12 = this;
            java.io.DataInputStream r0 = new java.io.DataInputStream
            r0.<init>(r13)
            byte r13 = r0.readByte()
            java.lang.String r1 = "File format not recognised"
            r2 = 1
            if (r13 != r2) goto L_0x0099
            java.lang.String r13 = r0.readUTF()
            java.lang.String r2 = "TZDB"
            boolean r13 = r2.equals(r13)
            if (r13 == 0) goto L_0x0093
            short r13 = r0.readShort()
            java.lang.String[] r1 = new java.lang.String[r13]
            r2 = 0
            r3 = 0
        L_0x0022:
            if (r3 >= r13) goto L_0x002d
            java.lang.String r4 = r0.readUTF()
            r1[r3] = r4
            int r3 = r3 + 1
            goto L_0x0022
        L_0x002d:
            short r3 = r0.readShort()
            java.lang.String[] r4 = new java.lang.String[r3]
            r5 = 0
        L_0x0034:
            if (r5 >= r3) goto L_0x003f
            java.lang.String r6 = r0.readUTF()
            r4[r5] = r6
            int r5 = r5 + 1
            goto L_0x0034
        L_0x003f:
            java.util.List r3 = java.util.Arrays.asList(r4)
            r12.f67477c = r3
            short r3 = r0.readShort()
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r6 = 0
        L_0x004c:
            if (r6 >= r3) goto L_0x005c
            short r7 = r0.readShort()
            byte[] r7 = new byte[r7]
            r0.readFully(r7)
            r5[r6] = r7
            int r6 = r6 + 1
            goto L_0x004c
        L_0x005c:
            java.util.concurrent.atomic.AtomicReferenceArray r3 = new java.util.concurrent.atomic.AtomicReferenceArray
            r3.<init>(r5)
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>(r13)
            r6 = 0
        L_0x0067:
            if (r6 >= r13) goto L_0x0092
            short r7 = r0.readShort()
            java.lang.String[] r8 = new java.lang.String[r7]
            short[] r9 = new short[r7]
            r10 = 0
        L_0x0072:
            if (r10 >= r7) goto L_0x0085
            short r11 = r0.readShort()
            r11 = r4[r11]
            r8[r10] = r11
            short r11 = r0.readShort()
            r9[r10] = r11
            int r10 = r10 + 1
            goto L_0x0072
        L_0x0085:
            te.c$a r7 = new te.c$a
            r10 = r1[r6]
            r7.<init>(r10, r8, r9, r3)
            r5.add(r7)
            int r6 = r6 + 1
            goto L_0x0067
        L_0x0092:
            return r5
        L_0x0093:
            java.io.StreamCorruptedException r13 = new java.io.StreamCorruptedException
            r13.<init>(r1)
            throw r13
        L_0x0099:
            java.io.StreamCorruptedException r13 = new java.io.StreamCorruptedException
            r13.<init>(r1)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p401te.C16625c.m99009h(java.io.InputStream):java.lang.Iterable");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C16631f mo79512c(String str, boolean z) {
        C16501d.m98548i(str, "zoneId");
        C16631f c = ((C16626a) this.f67478d.lastEntry().getValue()).mo79516c(str);
        if (c != null) {
            return c;
        }
        throw new ZoneRulesException("Unknown time-zone ID: " + str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Set<String> mo79513d() {
        return new HashSet(this.f67477c);
    }

    public String toString() {
        return "TZDB";
    }
}
