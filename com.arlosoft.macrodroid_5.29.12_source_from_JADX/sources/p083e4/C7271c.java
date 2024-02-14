package p083e4;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.C6685j;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p063b5.C2252e;
import p063b5.C2253f;
import p067c5.C2275e;
import p067c5.C2278h;
import p090f5.C7315j;
import p090f5.C7316k;
import p095g4.C7333a;
import p102h4.C7377b;
import p102h4.C7385h;
import p108i4.C7414k;
import p126l4.C7667b;
import p126l4.C7669d;
import p132m4.C7923h;
import p140o4.C8035a;
import p146p4.C8063a;
import p146p4.C8067b;
import p146p4.C8074c;
import p146p4.C8075d;
import p146p4.C8078e;
import p146p4.C8083f;
import p146p4.C8091g;
import p146p4.C8098k;
import p146p4.C8117s;
import p146p4.C8122t;
import p146p4.C8123u;
import p146p4.C8127v;
import p146p4.C8130w;
import p146p4.C8135x;
import p152q4.C8167a;
import p152q4.C8169b;
import p152q4.C8171c;
import p152q4.C8173d;
import p152q4.C8175e;
import p164s4.C10186a;
import p164s4.C10187b;
import p164s4.C10188c;
import p164s4.C10191f;
import p164s4.C10194i;
import p164s4.C10207k;
import p164s4.C10213n;
import p164s4.C10219s;
import p164s4.C10220t;
import p164s4.C10224v;
import p164s4.C10226w;
import p169t4.C10253a;
import p174u4.C10295d;
import p174u4.C10296e;
import p179v4.C10321a;
import p185w4.C10332a;
import p185w4.C10336c;
import p185w4.C10338d;
import p185w4.C10346h;
import p185w4.C10348j;
import p191x4.C10379a;
import p191x4.C10380b;
import p191x4.C10381c;
import p191x4.C10382d;
import p196y4.C10412d;
import p196y4.C10422l;
import p201z4.C10437b;
import p201z4.C10439d;

/* renamed from: e4.c */
/* compiled from: Glide */
public class C7271c implements ComponentCallbacks2 {

    /* renamed from: C */
    private static volatile C7271c f17708C;

    /* renamed from: D */
    private static volatile boolean f17709D;

    /* renamed from: A */
    private final List<C7278i> f17710A = new ArrayList();

    /* renamed from: B */
    private C7274f f17711B = C7274f.NORMAL;

    /* renamed from: a */
    private final C6685j f17712a;

    /* renamed from: c */
    private final C7669d f17713c;

    /* renamed from: d */
    private final C7923h f17714d;

    /* renamed from: f */
    private final C8035a f17715f;

    /* renamed from: g */
    private final C7273e f17716g;

    /* renamed from: o */
    private final Registry f17717o;

    /* renamed from: p */
    private final C7667b f17718p;

    /* renamed from: s */
    private final C10422l f17719s;

    /* renamed from: z */
    private final C10412d f17720z;

    C7271c(@NonNull Context context, @NonNull C6685j jVar, @NonNull C7923h hVar, @NonNull C7669d dVar, @NonNull C7667b bVar, @NonNull C10422l lVar, @NonNull C10412d dVar2, int i, @NonNull C2253f fVar, @NonNull Map<Class<?>, C7281j<?, ?>> map, @NonNull List<C2252e<Object>> list, boolean z) {
        Context context2 = context;
        C7923h hVar2 = hVar;
        C7669d dVar3 = dVar;
        C7667b bVar2 = bVar;
        Class<C7333a> cls = C7333a.class;
        Class<String> cls2 = String.class;
        Class<Integer> cls3 = Integer.class;
        Class<byte[]> cls4 = byte[].class;
        this.f17712a = jVar;
        this.f17713c = dVar3;
        this.f17718p = bVar2;
        this.f17714d = hVar2;
        this.f17719s = lVar;
        this.f17720z = dVar2;
        this.f17715f = new C8035a(hVar2, dVar3, (C7377b) fVar.mo24517r().mo37379c(C10207k.f23319f));
        Resources resources = context.getResources();
        Registry registry = new Registry();
        this.f17717o = registry;
        registry.mo32972o(new C10194i());
        if (Build.VERSION.SDK_INT >= 27) {
            registry.mo32972o(new C10213n());
        }
        List<ImageHeaderParser> g = registry.mo32964g();
        C10207k kVar = new C10207k(g, resources.getDisplayMetrics(), dVar3, bVar2);
        C10332a aVar = new C10332a(context2, g, dVar3, bVar2);
        C7385h<ParcelFileDescriptor, Bitmap> g2 = C10226w.m40231g(dVar);
        C10191f fVar2 = new C10191f(kVar);
        C10220t tVar = new C10220t(kVar, bVar2);
        C10295d dVar4 = new C10295d(context2);
        C8117s.C8120c cVar = new C8117s.C8120c(resources);
        Class<byte[]> cls5 = cls4;
        C8117s.C8121d dVar5 = new C8117s.C8121d(resources);
        C8117s.C8119b bVar3 = new C8117s.C8119b(resources);
        Class<String> cls6 = cls2;
        C8117s.C8118a aVar2 = new C8117s.C8118a(resources);
        C10188c cVar2 = new C10188c(bVar2);
        C8117s.C8121d dVar6 = dVar5;
        C10379a aVar3 = new C10379a();
        C10382d dVar7 = new C10382d();
        ContentResolver contentResolver = context.getContentResolver();
        Class<Integer> cls7 = cls3;
        C8117s.C8119b bVar4 = bVar3;
        C8117s.C8120c cVar3 = cVar;
        Registry p = registry.mo32959a(ByteBuffer.class, new C8074c()).mo32959a(InputStream.class, new C8122t(bVar2)).mo32963e("Bitmap", ByteBuffer.class, Bitmap.class, fVar2).mo32963e("Bitmap", InputStream.class, Bitmap.class, tVar).mo32963e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, g2).mo32963e("Bitmap", AssetFileDescriptor.class, Bitmap.class, C10226w.m40227c(dVar)).mo32962d(Bitmap.class, Bitmap.class, C8127v.C8128a.m33775b()).mo32963e("Bitmap", Bitmap.class, Bitmap.class, new C10224v()).mo32960b(Bitmap.class, cVar2).mo32963e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C10186a(resources, fVar2)).mo32963e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C10186a(resources, tVar)).mo32963e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C10186a(resources, g2)).mo32960b(BitmapDrawable.class, new C10187b(dVar3, cVar2)).mo32963e("Gif", InputStream.class, C10336c.class, new C10348j(g, aVar, bVar2)).mo32963e("Gif", ByteBuffer.class, C10336c.class, aVar).mo32960b(C10336c.class, new C10338d()).mo32962d(cls, cls, C8127v.C8128a.m33775b()).mo32963e("Bitmap", cls, Bitmap.class, new C10346h(dVar3)).mo32961c(Uri.class, Drawable.class, dVar4).mo32961c(Uri.class, Bitmap.class, new C10219s(dVar4, dVar3)).mo32973p(new C10253a.C10254a()).mo32962d(File.class, ByteBuffer.class, new C8075d.C8077b()).mo32962d(File.class, InputStream.class, new C8083f.C8089e()).mo32961c(File.class, File.class, new C10321a()).mo32962d(File.class, ParcelFileDescriptor.class, new C8083f.C8085b()).mo32962d(File.class, File.class, C8127v.C8128a.m33775b()).mo32973p(new C7414k.C7415a(bVar2));
        Class cls8 = Integer.TYPE;
        C8117s.C8120c cVar4 = cVar3;
        C8117s.C8119b bVar5 = bVar4;
        Class<Integer> cls9 = cls7;
        C8117s.C8121d dVar8 = dVar6;
        C8117s.C8118a aVar4 = aVar2;
        Class<String> cls10 = cls6;
        Context context3 = context;
        ContentResolver contentResolver2 = contentResolver;
        Class<byte[]> cls11 = cls5;
        C10379a aVar5 = aVar3;
        C10382d dVar9 = dVar7;
        p.mo32962d(cls8, InputStream.class, cVar4).mo32962d(cls8, ParcelFileDescriptor.class, bVar5).mo32962d(cls9, InputStream.class, cVar4).mo32962d(cls9, ParcelFileDescriptor.class, bVar5).mo32962d(cls9, Uri.class, dVar8).mo32962d(cls8, AssetFileDescriptor.class, aVar4).mo32962d(cls9, AssetFileDescriptor.class, aVar4).mo32962d(cls8, Uri.class, dVar8).mo32962d(cls10, InputStream.class, new C8078e.C8081c()).mo32962d(Uri.class, InputStream.class, new C8078e.C8081c()).mo32962d(cls10, InputStream.class, new C8123u.C8126c()).mo32962d(cls10, ParcelFileDescriptor.class, new C8123u.C8125b()).mo32962d(cls10, AssetFileDescriptor.class, new C8123u.C8124a()).mo32962d(Uri.class, InputStream.class, new C8169b.C8170a()).mo32962d(Uri.class, InputStream.class, new C8063a.C8066c(context.getAssets())).mo32962d(Uri.class, ParcelFileDescriptor.class, new C8063a.C8065b(context.getAssets())).mo32962d(Uri.class, InputStream.class, new C8171c.C8172a(context3)).mo32962d(Uri.class, InputStream.class, new C8173d.C8174a(context3)).mo32962d(Uri.class, InputStream.class, new C8130w.C8134d(contentResolver2)).mo32962d(Uri.class, ParcelFileDescriptor.class, new C8130w.C8132b(contentResolver2)).mo32962d(Uri.class, AssetFileDescriptor.class, new C8130w.C8131a(contentResolver2)).mo32962d(Uri.class, InputStream.class, new C8135x.C8136a()).mo32962d(URL.class, InputStream.class, new C8175e.C8176a()).mo32962d(Uri.class, File.class, new C8098k.C8099a(context3)).mo32962d(C8091g.class, InputStream.class, new C8167a.C8168a()).mo32962d(cls11, ByteBuffer.class, new C8067b.C8068a()).mo32962d(cls11, InputStream.class, new C8067b.C8072d()).mo32962d(Uri.class, Uri.class, C8127v.C8128a.m33775b()).mo32962d(Drawable.class, Drawable.class, C8127v.C8128a.m33775b()).mo32961c(Drawable.class, Drawable.class, new C10296e()).mo32974q(Bitmap.class, BitmapDrawable.class, new C10380b(resources)).mo32974q(Bitmap.class, cls11, aVar5).mo32974q(Drawable.class, cls11, new C10381c(dVar3, aVar5, dVar9)).mo32974q(C10336c.class, cls11, dVar9);
        this.f17716g = new C7273e(context, bVar, registry, new C2275e(), fVar, map, list, jVar, z, i);
    }

    /* renamed from: a */
    private static void m30010a(@NonNull Context context) {
        if (!f17709D) {
            f17709D = true;
            m30014m(context);
            f17709D = false;
            return;
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    @NonNull
    /* renamed from: c */
    public static C7271c m30011c(@NonNull Context context) {
        if (f17708C == null) {
            synchronized (C7271c.class) {
                if (f17708C == null) {
                    m30010a(context);
                }
            }
        }
        return f17708C;
    }

    @Nullable
    /* renamed from: d */
    private static C7269a m30012d() {
        try {
            return (C7269a) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
        } catch (InstantiationException e) {
            m30016q(e);
        } catch (IllegalAccessException e2) {
            m30016q(e2);
        } catch (NoSuchMethodException e3) {
            m30016q(e3);
        } catch (InvocationTargetException e4) {
            m30016q(e4);
        }
        return null;
    }

    @NonNull
    /* renamed from: l */
    private static C10422l m30013l(@Nullable Context context) {
        C7315j.m30205e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m30011c(context).mo37148k();
    }

    /* renamed from: m */
    private static void m30014m(@NonNull Context context) {
        m30015n(context, new C7272d());
    }

    /* renamed from: n */
    private static void m30015n(@NonNull Context context, @NonNull C7272d dVar) {
        Context applicationContext = context.getApplicationContext();
        C7269a d = m30012d();
        List<C10437b> emptyList = Collections.emptyList();
        if (d == null || d.mo41183c()) {
            emptyList = new C10439d(applicationContext).mo41187a();
        }
        if (d != null && !d.mo37139d().isEmpty()) {
            Set<Class<?>> d2 = d.mo37139d();
            Iterator<C10437b> it = emptyList.iterator();
            while (it.hasNext()) {
                C10437b next = it.next();
                if (d2.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("AppGlideModule excludes manifest GlideModule: ");
                        sb.append(next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            for (C10437b bVar : emptyList) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Discovered GlideModule from manifest: ");
                sb2.append(bVar.getClass());
            }
        }
        dVar.mo37157b(d != null ? d.mo37140e() : null);
        for (C10437b b : emptyList) {
            b.mo41185b(applicationContext, dVar);
        }
        if (d != null) {
            d.mo41182b(applicationContext, dVar);
        }
        C7271c a = dVar.mo37156a(applicationContext);
        for (C10437b a2 : emptyList) {
            a2.mo41184a(applicationContext, a, a.f17717o);
        }
        if (d != null) {
            d.mo41186a(applicationContext, a, a.f17717o);
        }
        applicationContext.registerComponentCallbacks(a);
        f17708C = a;
    }

    /* renamed from: q */
    private static void m30016q(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    @NonNull
    /* renamed from: t */
    public static C7278i m30017t(@NonNull Context context) {
        return m30013l(context).mo41125d(context);
    }

    @NonNull
    /* renamed from: u */
    public static C7278i m30018u(@NonNull FragmentActivity fragmentActivity) {
        return m30013l(fragmentActivity).mo41126e(fragmentActivity);
    }

    /* renamed from: b */
    public void mo37141b() {
        C7316k.m30206a();
        this.f17714d.mo37820b();
        this.f17713c.mo37691b();
        this.f17718p.mo37683b();
    }

    @NonNull
    /* renamed from: e */
    public C7667b mo37142e() {
        return this.f17718p;
    }

    @NonNull
    /* renamed from: f */
    public C7669d mo37143f() {
        return this.f17713c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C10412d mo37144g() {
        return this.f17720z;
    }

    @NonNull
    /* renamed from: h */
    public Context mo37145h() {
        return this.f17716g.getBaseContext();
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: i */
    public C7273e mo37146i() {
        return this.f17716g;
    }

    @NonNull
    /* renamed from: j */
    public Registry mo37147j() {
        return this.f17717o;
    }

    @NonNull
    /* renamed from: k */
    public C10422l mo37148k() {
        return this.f17719s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo37149o(C7278i iVar) {
        synchronized (this.f17710A) {
            if (!this.f17710A.contains(iVar)) {
                this.f17710A.add(iVar);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        mo37141b();
    }

    public void onTrimMemory(int i) {
        mo37154r(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo37153p(@NonNull C2278h<?> hVar) {
        synchronized (this.f17710A) {
            for (C7278i y : this.f17710A) {
                if (y.mo37196y(hVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: r */
    public void mo37154r(int i) {
        C7316k.m30206a();
        this.f17714d.mo37814a(i);
        this.f17713c.mo37690a(i);
        this.f17718p.mo37682a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo37155s(C7278i iVar) {
        synchronized (this.f17710A) {
            if (this.f17710A.contains(iVar)) {
                this.f17710A.remove(iVar);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }
}
