package kotlin.p312io;

import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import kotlin.sequences.C15118h;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u001e\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u001a\u0010\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006*\u00020\u0000\u001a\u0010\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t*\u00020\b\u001a\n\u0010\u000b\u001a\u00020\u0002*\u00020\u0000\u001a\u001c\u0010\u0011\u001a\u00020\u0010*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¨\u0006\u0012"}, mo71668d2 = {"Ljava/io/Reader;", "Lkotlin/Function1;", "", "Lja/u;", "action", "c", "", "e", "Ljava/io/BufferedReader;", "Lkotlin/sequences/h;", "d", "f", "Ljava/io/Writer;", "out", "", "bufferSize", "", "a", "kotlin-stdlib"}, mo71669k = 2, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.io.i */
/* compiled from: ReadWrite.kt */
public final class C13675i {

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"", "it", "Lja/u;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.io.i$a */
    /* compiled from: ReadWrite.kt */
    static final class C13676a extends C13708q implements C16265l<String, C13339u> {
        final /* synthetic */ ArrayList<String> $result;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13676a(ArrayList<String> arrayList) {
            super(1);
            this.$result = arrayList;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return C13339u.f61331a;
        }

        public final void invoke(String str) {
            C13706o.m87929f(str, "it");
            this.$result.add(str);
        }
    }

    /* renamed from: a */
    public static final long m87858a(Reader reader, Writer writer, int i) {
        C13706o.m87929f(reader, "<this>");
        C13706o.m87929f(writer, "out");
        char[] cArr = new char[i];
        int read = reader.read(cArr);
        long j = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j += (long) read;
            read = reader.read(cArr);
        }
        return j;
    }

    /* renamed from: b */
    public static /* synthetic */ long m87859b(Reader reader, Writer writer, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return m87858a(reader, writer, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        kotlin.p312io.C13667b.m87853a(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        throw r0;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m87860c(java.io.Reader r3, p370qa.C16265l<? super java.lang.String, p297ja.C13339u> r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C13706o.m87929f(r3, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.C13706o.m87929f(r4, r0)
            boolean r0 = r3 instanceof java.io.BufferedReader
            if (r0 == 0) goto L_0x0011
            java.io.BufferedReader r3 = (java.io.BufferedReader) r3
            goto L_0x0019
        L_0x0011:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r1 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r3, r1)
            r3 = r0
        L_0x0019:
            r0 = 0
            kotlin.sequences.h r1 = m87861d(r3)     // Catch:{ all -> 0x0036 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0036 }
        L_0x0022:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0036 }
            if (r2 == 0) goto L_0x0030
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0036 }
            r4.invoke(r2)     // Catch:{ all -> 0x0036 }
            goto L_0x0022
        L_0x0030:
            ja.u r4 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x0036 }
            kotlin.p312io.C13667b.m87853a(r3, r0)
            return
        L_0x0036:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            kotlin.p312io.C13667b.m87853a(r3, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p312io.C13675i.m87860c(java.io.Reader, qa.l):void");
    }

    /* renamed from: d */
    public static final C15118h<String> m87861d(BufferedReader bufferedReader) {
        C13706o.m87929f(bufferedReader, "<this>");
        return C15125n.m93469d(new C13673h(bufferedReader));
    }

    /* renamed from: e */
    public static final List<String> m87862e(Reader reader) {
        C13706o.m87929f(reader, "<this>");
        ArrayList arrayList = new ArrayList();
        m87860c(reader, new C13676a(arrayList));
        return arrayList;
    }

    /* renamed from: f */
    public static final String m87863f(Reader reader) {
        C13706o.m87929f(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        m87859b(reader, stringWriter, 0, 2, (Object) null);
        String stringWriter2 = stringWriter.toString();
        C13706o.m87928e(stringWriter2, "buffer.toString()");
        return stringWriter2;
    }
}
