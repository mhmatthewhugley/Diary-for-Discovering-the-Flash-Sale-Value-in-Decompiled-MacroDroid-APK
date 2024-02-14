package p146p4;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p083e4.C7275g;
import p084e5.C7284c;
import p102h4.C7376a;
import p102h4.C7384g;
import p108i4.C7401d;
import p146p4.C8105n;

/* renamed from: p4.f */
/* compiled from: FileLoader */
public class C8083f<Data> implements C8105n<File, Data> {

    /* renamed from: a */
    private final C8088d<Data> f19674a;

    /* renamed from: p4.f$a */
    /* compiled from: FileLoader */
    public static class C8084a<Data> implements C8107o<File, Data> {

        /* renamed from: a */
        private final C8088d<Data> f19675a;

        public C8084a(C8088d<Data> dVar) {
            this.f19675a = dVar;
        }

        @NonNull
        /* renamed from: a */
        public final C8105n<File, Data> mo38078a(@NonNull C8113r rVar) {
            return new C8083f(this.f19675a);
        }
    }

    /* renamed from: p4.f$b */
    /* compiled from: FileLoader */
    public static class C8085b extends C8084a<ParcelFileDescriptor> {

        /* renamed from: p4.f$b$a */
        /* compiled from: FileLoader */
        class C8086a implements C8088d<ParcelFileDescriptor> {
            C8086a() {
            }

            /* renamed from: a */
            public Class<ParcelFileDescriptor> mo38095a() {
                return ParcelFileDescriptor.class;
            }

            /* renamed from: d */
            public void mo38096b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            /* renamed from: e */
            public ParcelFileDescriptor mo38097c(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public C8085b() {
            super(new C8086a());
        }
    }

    /* renamed from: p4.f$c */
    /* compiled from: FileLoader */
    private static final class C8087c<Data> implements C7401d<Data> {

        /* renamed from: a */
        private final File f19676a;

        /* renamed from: c */
        private final C8088d<Data> f19677c;

        /* renamed from: d */
        private Data f19678d;

        C8087c(File file, C8088d<Data> dVar) {
            this.f19676a = file;
            this.f19677c = dVar;
        }

        @NonNull
        /* renamed from: a */
        public Class<Data> mo37430a() {
            return this.f19677c.mo38095a();
        }

        /* renamed from: b */
        public void mo37435b() {
            Data data = this.f19678d;
            if (data != null) {
                try {
                    this.f19677c.mo38096b(data);
                } catch (IOException unused) {
                }
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
                Data c = this.f19677c.mo38097c(this.f19676a);
                this.f19678d = c;
                aVar.mo33008e(c);
            } catch (FileNotFoundException e) {
                Log.isLoggable("FileLoader", 3);
                aVar.mo33006c(e);
            }
        }
    }

    /* renamed from: p4.f$d */
    /* compiled from: FileLoader */
    public interface C8088d<Data> {
        /* renamed from: a */
        Class<Data> mo38095a();

        /* renamed from: b */
        void mo38096b(Data data) throws IOException;

        /* renamed from: c */
        Data mo38097c(File file) throws FileNotFoundException;
    }

    /* renamed from: p4.f$e */
    /* compiled from: FileLoader */
    public static class C8089e extends C8084a<InputStream> {

        /* renamed from: p4.f$e$a */
        /* compiled from: FileLoader */
        class C8090a implements C8088d<InputStream> {
            C8090a() {
            }

            /* renamed from: a */
            public Class<InputStream> mo38095a() {
                return InputStream.class;
            }

            /* renamed from: d */
            public void mo38096b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            /* renamed from: e */
            public InputStream mo38097c(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }
        }

        public C8089e() {
            super(new C8090a());
        }
    }

    public C8083f(C8088d<Data> dVar) {
        this.f19674a = dVar;
    }

    /* renamed from: c */
    public C8105n.C8106a<Data> mo38074b(@NonNull File file, int i, int i2, @NonNull C7384g gVar) {
        return new C8105n.C8106a<>(new C7284c(file), new C8087c(file, this.f19674a));
    }

    /* renamed from: d */
    public boolean mo38073a(@NonNull File file) {
        return true;
    }
}
