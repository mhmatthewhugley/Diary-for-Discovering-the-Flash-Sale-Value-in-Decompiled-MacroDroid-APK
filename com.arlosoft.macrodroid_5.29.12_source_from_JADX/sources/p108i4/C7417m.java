package p108i4;

import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: i4.m */
/* compiled from: StreamAssetPathFetcher */
public class C7417m extends C7399b<InputStream> {
    public C7417m(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @NonNull
    /* renamed from: a */
    public Class<InputStream> mo37430a() {
        return InputStream.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo37436c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public InputStream mo37439e(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}
