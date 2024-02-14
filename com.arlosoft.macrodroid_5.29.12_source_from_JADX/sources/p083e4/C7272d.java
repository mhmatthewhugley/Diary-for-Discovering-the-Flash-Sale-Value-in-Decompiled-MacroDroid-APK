package p083e4;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.bumptech.glide.load.engine.C6685j;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p063b5.C2252e;
import p063b5.C2253f;
import p126l4.C7667b;
import p126l4.C7669d;
import p126l4.C7670e;
import p126l4.C7675i;
import p126l4.C7678j;
import p132m4.C7910a;
import p132m4.C7920f;
import p132m4.C7922g;
import p132m4.C7923h;
import p132m4.C7925i;
import p137n4.C7977a;
import p196y4.C10412d;
import p196y4.C10415f;
import p196y4.C10422l;

/* renamed from: e4.d */
/* compiled from: GlideBuilder */
public final class C7272d {

    /* renamed from: a */
    private final Map<Class<?>, C7281j<?, ?>> f17721a = new ArrayMap();

    /* renamed from: b */
    private C6685j f17722b;

    /* renamed from: c */
    private C7669d f17723c;

    /* renamed from: d */
    private C7667b f17724d;

    /* renamed from: e */
    private C7923h f17725e;

    /* renamed from: f */
    private C7977a f17726f;

    /* renamed from: g */
    private C7977a f17727g;

    /* renamed from: h */
    private C7910a.C7911a f17728h;

    /* renamed from: i */
    private C7925i f17729i;

    /* renamed from: j */
    private C10412d f17730j;

    /* renamed from: k */
    private int f17731k = 4;

    /* renamed from: l */
    private C2253f f17732l = new C2253f();
    @Nullable

    /* renamed from: m */
    private C10422l.C10424b f17733m;

    /* renamed from: n */
    private C7977a f17734n;

    /* renamed from: o */
    private boolean f17735o;
    @Nullable

    /* renamed from: p */
    private List<C2252e<Object>> f17736p;

    /* renamed from: q */
    private boolean f17737q;

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: a */
    public C7271c mo37156a(@NonNull Context context) {
        if (this.f17726f == null) {
            this.f17726f = C7977a.m33268f();
        }
        if (this.f17727g == null) {
            this.f17727g = C7977a.m33266d();
        }
        if (this.f17734n == null) {
            this.f17734n = C7977a.m33264b();
        }
        if (this.f17729i == null) {
            this.f17729i = new C7925i.C7926a(context).mo37824a();
        }
        if (this.f17730j == null) {
            this.f17730j = new C10415f();
        }
        if (this.f17723c == null) {
            int b = this.f17729i.mo37822b();
            if (b > 0) {
                this.f17723c = new C7678j((long) b);
            } else {
                this.f17723c = new C7670e();
            }
        }
        if (this.f17724d == null) {
            this.f17724d = new C7675i(this.f17729i.mo37821a());
        }
        if (this.f17725e == null) {
            this.f17725e = new C7922g((long) this.f17729i.mo37823d());
        }
        if (this.f17728h == null) {
            this.f17728h = new C7920f(context);
        }
        if (this.f17722b == null) {
            this.f17722b = new C6685j(this.f17725e, this.f17728h, this.f17727g, this.f17726f, C7977a.m33270h(), C7977a.m33264b(), this.f17735o);
        }
        List<C2252e<Object>> list = this.f17736p;
        if (list == null) {
            this.f17736p = Collections.emptyList();
        } else {
            this.f17736p = Collections.unmodifiableList(list);
        }
        return new C7271c(context, this.f17722b, this.f17725e, this.f17723c, this.f17724d, new C10422l(this.f17733m), this.f17730j, this.f17731k, (C2253f) this.f17732l.mo24484R(), this.f17721a, this.f17736p, this.f17737q);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo37157b(@Nullable C10422l.C10424b bVar) {
        this.f17733m = bVar;
    }
}
