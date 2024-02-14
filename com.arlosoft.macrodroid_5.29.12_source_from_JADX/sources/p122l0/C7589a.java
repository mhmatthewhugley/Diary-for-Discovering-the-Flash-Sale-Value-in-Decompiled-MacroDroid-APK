package p122l0;

import android.content.Context;
import androidx.annotation.RequiresApi;
import com.android.p023dx.Code;
import com.android.p023dx.DexMaker;
import com.android.p023dx.Local;
import com.android.p023dx.MethodId;
import com.android.p023dx.TypeId;
import java.io.IOException;

/* renamed from: l0.a */
/* compiled from: CallbackMaker */
public final class C7589a {

    /* renamed from: a */
    private final C7590b f18493a;

    /* renamed from: b */
    Context f18494b;

    /* renamed from: c */
    Class<?> f18495c;

    /* renamed from: d */
    DexMaker f18496d;

    @RequiresApi(api = 21)
    public C7589a(Context context, C7590b bVar) {
        Class<?> cls;
        this.f18494b = context;
        this.f18493a = bVar;
        try {
            cls = Class.forName("android.net.ConnectivityManager$OnStartTetheringCallback");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            cls = null;
        }
        TypeId<?> typeId = TypeId.get(cls);
        this.f18496d = new DexMaker();
        TypeId typeId2 = TypeId.get("LTetheringCallback;");
        this.f18496d.declare(typeId2, "TetheringCallback.generated", 1, typeId, new TypeId[0]);
        this.f18496d.declare(typeId2.getField(TypeId.get(C7590b.class), "callback"), 2, (Object) null);
        mo37660a(typeId2, typeId);
        try {
            this.f18495c = this.f18496d.generateAndLoad(C7589a.class.getClassLoader(), this.f18494b.getCodeCacheDir()).loadClass("TetheringCallback");
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (ClassNotFoundException e3) {
            e3.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo37660a(TypeId<?> typeId, TypeId<?> typeId2) {
        MethodId<?, Void> constructor = typeId2.getConstructor(new TypeId[0]);
        Code declare = this.f18496d.declare(typeId.getConstructor(TypeId.INT), 1);
        declare.invokeDirect(constructor, (Local) null, declare.getThis(typeId), new Local[0]);
        declare.returnVoid();
    }

    /* renamed from: b */
    public Class<?> mo37661b() {
        return this.f18495c;
    }
}
