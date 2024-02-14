package p108i4;

import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.IOException;
import p083e4.C7275g;
import p102h4.C7376a;
import p108i4.C7401d;

/* renamed from: i4.b */
/* compiled from: AssetPathFetcher */
public abstract class C7399b<T> implements C7401d<T> {

    /* renamed from: a */
    private final String f18097a;

    /* renamed from: c */
    private final AssetManager f18098c;

    /* renamed from: d */
    private T f18099d;

    public C7399b(AssetManager assetManager, String str) {
        this.f18098c = assetManager;
        this.f18097a = str;
    }

    /* renamed from: b */
    public void mo37435b() {
        T t = this.f18099d;
        if (t != null) {
            try {
                mo37436c(t);
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo37436c(T t) throws IOException;

    public void cancel() {
    }

    @NonNull
    /* renamed from: d */
    public C7376a mo37438d() {
        return C7376a.LOCAL;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract T mo37439e(AssetManager assetManager, String str) throws IOException;

    /* renamed from: f */
    public void mo37440f(@NonNull C7275g gVar, @NonNull C7401d.C7402a<? super T> aVar) {
        try {
            T e = mo37439e(this.f18098c, this.f18097a);
            this.f18099d = e;
            aVar.mo33008e(e);
        } catch (IOException e2) {
            Log.isLoggable("AssetPathFetcher", 3);
            aVar.mo33006c(e2);
        }
    }
}
