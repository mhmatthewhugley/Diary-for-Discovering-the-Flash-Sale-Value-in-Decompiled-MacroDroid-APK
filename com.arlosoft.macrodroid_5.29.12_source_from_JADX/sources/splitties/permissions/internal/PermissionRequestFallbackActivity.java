package splitties.permissions.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13710s;
import p397ta.C16605d;
import p433xa.C16887m;
import p475tf.C17456a;
import p475tf.C17459d;
import p481xf.C17513a;

@RequiresApi(23)
@RestrictTo({RestrictTo.Scope.LIBRARY})
@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\b\u0001\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J/\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0013"}, mo71668d2 = {"Lsplitties/permissions/internal/PermissionRequestFallbackActivity;", "Landroid/app/Activity;", "Landroid/os/Bundle;", "savedInstanceState", "Lja/u;", "onCreate", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "<init>", "()V", "a", "b", "permissions_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: PermissionRequestFallbackActivity.kt */
public final class PermissionRequestFallbackActivity extends Activity {

    /* renamed from: a */
    public static final C17440a f69214a = new C17440a((C13695i) null);

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR?\u0010\u000b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u00022\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u00028F@FX\u0002¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000e"}, mo71668d2 = {"Lsplitties/permissions/internal/PermissionRequestFallbackActivity$b;", "Ltf/d;", "", "", "<set-?>", "permissionNames$delegate", "Lta/d;", "g", "()[Ljava/lang/String;", "setPermissionNames", "([Ljava/lang/String;)V", "permissionNames", "<init>", "()V", "permissions_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: splitties.permissions.internal.PermissionRequestFallbackActivity$b */
    /* compiled from: PermissionRequestFallbackActivity.kt */
    public static final class C17442b extends C17459d {

        /* renamed from: e */
        static final /* synthetic */ C16887m[] f69219e = {C13687e0.m87871e(new C13710s(C17442b.class, "permissionNames", "getPermissionNames()[Ljava/lang/String;", 0))};

        /* renamed from: f */
        private static final C16605d f69220f;

        /* renamed from: g */
        public static final C17442b f69221g;

        static {
            C17442b bVar = new C17442b();
            f69221g = bVar;
            f69220f = C17456a.m101238c(bVar);
        }

        private C17442b() {
        }

        /* renamed from: g */
        public final String[] mo80795g() {
            return (String[]) f69220f.mo32407a(this, f69219e[0]);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C17442b bVar = C17442b.f69221g;
        Intent intent = getIntent();
        C13706o.m87928e(intent, "intent");
        try {
            bVar.mo80833f(true);
            Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = new Bundle();
            }
            bVar.mo80832e(extras);
            String[] g = bVar.mo80795g();
            if (g != null) {
                requestPermissions(g, 1);
            } else {
                finish();
            }
        } finally {
            bVar.mo80832e((Bundle) null);
            bVar.mo80833f(false);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C13706o.m87929f(strArr, "permissions");
        C13706o.m87929f(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        setResult(-1, new Intent().putExtra("grantResult", iArr));
        finish();
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo71668d2 = {"Lsplitties/permissions/internal/PermissionRequestFallbackActivity$a;", "Lxf/a;", "Lsplitties/permissions/internal/PermissionRequestFallbackActivity;", "Lsplitties/permissions/internal/PermissionRequestFallbackActivity$b;", "", "GRANT_RESULT", "Ljava/lang/String;", "<init>", "()V", "permissions_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: splitties.permissions.internal.PermissionRequestFallbackActivity$a */
    /* compiled from: PermissionRequestFallbackActivity.kt */
    public static final class C17440a implements C17513a<PermissionRequestFallbackActivity, C17442b> {

        /* renamed from: a */
        private final /* synthetic */ C17513a<PermissionRequestFallbackActivity, ? extends C17442b> f69215a;

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, mo71668d2 = {"splitties/permissions/internal/PermissionRequestFallbackActivity$a$a", "Lxf/a;", "Ljava/lang/Class;", "a", "Ljava/lang/Class;", "getKlass", "()Ljava/lang/Class;", "klass", "intents_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
        /* renamed from: splitties.permissions.internal.PermissionRequestFallbackActivity$a$a */
        /* compiled from: IntentSpec.kt */
        public static final class C17441a implements C17513a<PermissionRequestFallbackActivity, C17442b> {

            /* renamed from: a */
            private final Class<PermissionRequestFallbackActivity> f69216a = PermissionRequestFallbackActivity.class;

            /* renamed from: b */
            private final C17442b f69217b;

            /* renamed from: c */
            final /* synthetic */ C17459d f69218c;

            /* JADX WARNING: type inference failed for: r2v0, types: [splitties.permissions.internal.PermissionRequestFallbackActivity$b, tf.d] */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C17441a(p475tf.C17459d r2) {
                /*
                    r1 = this;
                    r1.f69218c = r2
                    r1.<init>()
                    java.lang.Class<splitties.permissions.internal.PermissionRequestFallbackActivity> r0 = splitties.permissions.internal.PermissionRequestFallbackActivity.class
                    r1.f69216a = r0
                    r1.f69217b = r2
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: splitties.permissions.internal.PermissionRequestFallbackActivity.C17440a.C17441a.<init>(tf.d):void");
            }
        }

        private C17440a() {
            this.f69215a = new C17441a(C17442b.f69221g);
        }

        public /* synthetic */ C17440a(C13695i iVar) {
            this();
        }
    }
}
