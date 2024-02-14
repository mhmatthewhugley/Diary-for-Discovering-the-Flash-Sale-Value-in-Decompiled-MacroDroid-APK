package p108i4;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;
import java.io.IOException;
import p083e4.C7275g;
import p102h4.C7376a;
import p108i4.C7401d;

/* renamed from: i4.l */
/* compiled from: LocalUriFetcher */
public abstract class C7416l<T> implements C7401d<T> {

    /* renamed from: a */
    private final Uri f18121a;

    /* renamed from: c */
    private final ContentResolver f18122c;

    /* renamed from: d */
    private T f18123d;

    public C7416l(ContentResolver contentResolver, Uri uri) {
        this.f18122c = contentResolver;
        this.f18121a = uri;
    }

    /* renamed from: b */
    public void mo37435b() {
        T t = this.f18123d;
        if (t != null) {
            try {
                mo37431c(t);
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo37431c(T t) throws IOException;

    public void cancel() {
    }

    @NonNull
    /* renamed from: d */
    public C7376a mo37438d() {
        return C7376a.LOCAL;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract T mo37432e(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    /* renamed from: f */
    public final void mo37440f(@NonNull C7275g gVar, @NonNull C7401d.C7402a<? super T> aVar) {
        try {
            T e = mo37432e(this.f18121a, this.f18122c);
            this.f18123d = e;
            aVar.mo33008e(e);
        } catch (FileNotFoundException e2) {
            Log.isLoggable("LocalUriFetcher", 3);
            aVar.mo33006c(e2);
        }
    }
}
