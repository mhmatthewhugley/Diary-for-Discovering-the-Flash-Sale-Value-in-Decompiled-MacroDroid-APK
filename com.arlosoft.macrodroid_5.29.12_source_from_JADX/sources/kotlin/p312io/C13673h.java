package kotlin.p312io;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.sequences.C15118h;
import p379ra.C16368a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0002R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, mo71668d2 = {"Lkotlin/io/h;", "Lkotlin/sequences/h;", "", "", "iterator", "Ljava/io/BufferedReader;", "a", "Ljava/io/BufferedReader;", "reader", "<init>", "(Ljava/io/BufferedReader;)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: kotlin.io.h */
/* compiled from: ReadWrite.kt */
final class C13673h implements C15118h<String> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final BufferedReader f61911a;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0002R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, mo71668d2 = {"kotlin/io/h$a", "", "", "", "hasNext", "a", "Ljava/lang/String;", "nextValue", "c", "Z", "done", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: kotlin.io.h$a */
    /* compiled from: ReadWrite.kt */
    public static final class C13674a implements Iterator<String>, C16368a {

        /* renamed from: a */
        private String f61912a;

        /* renamed from: c */
        private boolean f61913c;

        /* renamed from: d */
        final /* synthetic */ C13673h f61914d;

        C13674a(C13673h hVar) {
            this.f61914d = hVar;
        }

        /* renamed from: a */
        public String next() {
            if (hasNext()) {
                String str = this.f61912a;
                this.f61912a = null;
                C13706o.m87926c(str);
                return str;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f61912a == null && !this.f61913c) {
                String readLine = this.f61914d.f61911a.readLine();
                this.f61912a = readLine;
                if (readLine == null) {
                    this.f61913c = true;
                }
            }
            if (this.f61912a != null) {
                return true;
            }
            return false;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C13673h(BufferedReader bufferedReader) {
        C13706o.m87929f(bufferedReader, "reader");
        this.f61911a = bufferedReader;
    }

    public Iterator<String> iterator() {
        return new C13674a(this);
    }
}
