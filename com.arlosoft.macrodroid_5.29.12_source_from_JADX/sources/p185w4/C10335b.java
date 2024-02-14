package p185w4;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p095g4.C7333a;
import p126l4.C7667b;
import p126l4.C7669d;

/* renamed from: w4.b */
/* compiled from: GifBitmapProvider */
public final class C10335b implements C7333a.C7334a {

    /* renamed from: a */
    private final C7669d f23513a;
    @Nullable

    /* renamed from: b */
    private final C7667b f23514b;

    public C10335b(C7669d dVar, @Nullable C7667b bVar) {
        this.f23513a = dVar;
        this.f23514b = bVar;
    }

    /* renamed from: a */
    public void mo37307a(@NonNull Bitmap bitmap) {
        this.f23513a.mo37692c(bitmap);
    }

    @NonNull
    /* renamed from: b */
    public byte[] mo37308b(int i) {
        C7667b bVar = this.f23514b;
        if (bVar == null) {
            return new byte[i];
        }
        return (byte[]) bVar.mo37684c(i, byte[].class);
    }

    @NonNull
    /* renamed from: c */
    public Bitmap mo37309c(int i, int i2, @NonNull Bitmap.Config config) {
        return this.f23513a.mo37694e(i, i2, config);
    }

    @NonNull
    /* renamed from: d */
    public int[] mo37310d(int i) {
        C7667b bVar = this.f23514b;
        if (bVar == null) {
            return new int[i];
        }
        return (int[]) bVar.mo37684c(i, int[].class);
    }

    /* renamed from: e */
    public void mo37311e(@NonNull byte[] bArr) {
        C7667b bVar = this.f23514b;
        if (bVar != null) {
            bVar.put(bArr);
        }
    }

    /* renamed from: f */
    public void mo37312f(@NonNull int[] iArr) {
        C7667b bVar = this.f23514b;
        if (bVar != null) {
            bVar.put(iArr);
        }
    }
}
