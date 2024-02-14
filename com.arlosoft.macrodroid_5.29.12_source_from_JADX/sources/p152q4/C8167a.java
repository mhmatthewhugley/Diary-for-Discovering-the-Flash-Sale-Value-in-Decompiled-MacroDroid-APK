package p152q4;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;
import p102h4.C7381f;
import p102h4.C7384g;
import p108i4.C7411j;
import p146p4.C8091g;
import p146p4.C8102m;
import p146p4.C8105n;
import p146p4.C8107o;
import p146p4.C8113r;

/* renamed from: q4.a */
/* compiled from: HttpGlideUrlLoader */
public class C8167a implements C8105n<C8091g, InputStream> {

    /* renamed from: b */
    public static final C7381f<Integer> f19798b = C7381f.m30485f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);
    @Nullable

    /* renamed from: a */
    private final C8102m<C8091g, C8091g> f19799a;

    /* renamed from: q4.a$a */
    /* compiled from: HttpGlideUrlLoader */
    public static class C8168a implements C8107o<C8091g, InputStream> {

        /* renamed from: a */
        private final C8102m<C8091g, C8091g> f19800a = new C8102m<>(500);

        @NonNull
        /* renamed from: a */
        public C8105n<C8091g, InputStream> mo38078a(C8113r rVar) {
            return new C8167a(this.f19800a);
        }
    }

    public C8167a(@Nullable C8102m<C8091g, C8091g> mVar) {
        this.f19799a = mVar;
    }

    /* renamed from: c */
    public C8105n.C8106a<InputStream> mo38074b(@NonNull C8091g gVar, int i, int i2, @NonNull C7384g gVar2) {
        C8102m<C8091g, C8091g> mVar = this.f19799a;
        if (mVar != null) {
            C8091g a = mVar.mo38118a(gVar, 0, 0);
            if (a == null) {
                this.f19799a.mo38119b(gVar, 0, 0, gVar);
            } else {
                gVar = a;
            }
        }
        return new C8105n.C8106a<>(gVar, new C7411j(gVar, ((Integer) gVar2.mo37379c(f19798b)).intValue()));
    }

    /* renamed from: d */
    public boolean mo38073a(@NonNull C8091g gVar) {
        return true;
    }
}
