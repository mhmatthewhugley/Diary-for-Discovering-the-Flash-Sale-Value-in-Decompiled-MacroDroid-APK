package p146p4;

import android.util.Base64;
import androidx.annotation.NonNull;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import p083e4.C7275g;
import p084e5.C7284c;
import p102h4.C7376a;
import p102h4.C7384g;
import p108i4.C7401d;
import p146p4.C8105n;

/* renamed from: p4.e */
/* compiled from: DataUrlLoader */
public final class C8078e<Model, Data> implements C8105n<Model, Data> {

    /* renamed from: a */
    private final C8079a<Data> f19668a;

    /* renamed from: p4.e$a */
    /* compiled from: DataUrlLoader */
    public interface C8079a<Data> {
        /* renamed from: a */
        Class<Data> mo38088a();

        /* renamed from: b */
        void mo38089b(Data data) throws IOException;

        Data decode(String str) throws IllegalArgumentException;
    }

    /* renamed from: p4.e$b */
    /* compiled from: DataUrlLoader */
    private static final class C8080b<Data> implements C7401d<Data> {

        /* renamed from: a */
        private final String f19669a;

        /* renamed from: c */
        private final C8079a<Data> f19670c;

        /* renamed from: d */
        private Data f19671d;

        C8080b(String str, C8079a<Data> aVar) {
            this.f19669a = str;
            this.f19670c = aVar;
        }

        @NonNull
        /* renamed from: a */
        public Class<Data> mo37430a() {
            return this.f19670c.mo38088a();
        }

        /* renamed from: b */
        public void mo37435b() {
            try {
                this.f19670c.mo38089b(this.f19671d);
            } catch (IOException unused) {
            }
        }

        public void cancel() {
        }

        @NonNull
        /* renamed from: d */
        public C7376a mo37438d() {
            return C7376a.LOCAL;
        }

        /* renamed from: f */
        public void mo37440f(@NonNull C7275g gVar, @NonNull C7401d.C7402a<? super Data> aVar) {
            try {
                Data decode = this.f19670c.decode(this.f19669a);
                this.f19671d = decode;
                aVar.mo33008e(decode);
            } catch (IllegalArgumentException e) {
                aVar.mo33006c(e);
            }
        }
    }

    /* renamed from: p4.e$c */
    /* compiled from: DataUrlLoader */
    public static final class C8081c<Model> implements C8107o<Model, InputStream> {

        /* renamed from: a */
        private final C8079a<InputStream> f19672a = new C8082a();

        /* renamed from: p4.e$c$a */
        /* compiled from: DataUrlLoader */
        class C8082a implements C8079a<InputStream> {
            C8082a() {
            }

            /* renamed from: a */
            public Class<InputStream> mo38088a() {
                return InputStream.class;
            }

            /* renamed from: c */
            public void mo38089b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            /* renamed from: d */
            public InputStream decode(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    } else if (str.substring(0, indexOf).endsWith(";base64")) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                } else {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
            }
        }

        @NonNull
        /* renamed from: a */
        public C8105n<Model, InputStream> mo38078a(@NonNull C8113r rVar) {
            return new C8078e(this.f19672a);
        }
    }

    public C8078e(C8079a<Data> aVar) {
        this.f19668a = aVar;
    }

    /* renamed from: a */
    public boolean mo38073a(@NonNull Model model) {
        return model.toString().startsWith("data:image");
    }

    /* renamed from: b */
    public C8105n.C8106a<Data> mo38074b(@NonNull Model model, int i, int i2, @NonNull C7384g gVar) {
        return new C8105n.C8106a<>(new C7284c(model), new C8080b(model.toString(), this.f19668a));
    }
}
