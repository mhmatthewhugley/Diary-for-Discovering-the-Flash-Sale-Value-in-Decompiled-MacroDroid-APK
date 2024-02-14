package p259f7;

import android.content.Context;
import androidx.core.location.LocationRequestCompat;
import com.yalantis.ucrop.C11913a;
import p267g7.C12313b;
import p267g7.C12314c;

/* renamed from: f7.a */
/* compiled from: Config */
public class C12241a {

    /* renamed from: a */
    private C11913a.C11914a f58733a;

    /* renamed from: b */
    private long f58734b = LocationRequestCompat.PASSIVE_INTERVAL;

    /* renamed from: c */
    private C12314c f58735c = new C12313b();

    /* renamed from: d */
    private boolean f58736d = false;

    /* renamed from: e */
    private boolean f58737e = false;

    /* renamed from: f */
    private boolean f58738f = false;

    /* renamed from: g */
    private String f58739g = null;

    /* renamed from: h */
    private String[] f58740h = null;

    /* renamed from: i */
    private boolean f58741i = false;

    /* renamed from: j */
    private boolean f58742j = false;

    /* renamed from: k */
    private boolean f58743k = false;

    /* renamed from: l */
    private String f58744l = null;

    /* renamed from: m */
    private String f58745m = null;

    /* renamed from: a */
    public String mo68525a(Context context) {
        String str = this.f58744l;
        if (str != null && str.trim().length() != 0) {
            return this.f58744l;
        }
        return context.getPackageName() + "." + "file_provider";
    }

    /* renamed from: b */
    public String mo68526b() {
        String str = this.f58745m;
        return (str == null || str.trim().length() == 0) ? "RxPaparazzo" : this.f58745m;
    }

    /* renamed from: c */
    public long mo68527c() {
        return this.f58734b;
    }

    /* renamed from: d */
    public String mo68528d(String str) {
        String str2 = this.f58739g;
        return str2 == null ? str : str2;
    }

    /* renamed from: e */
    public String[] mo68529e() {
        String[] strArr = this.f58740h;
        if (strArr == null) {
            return null;
        }
        return strArr;
    }

    /* renamed from: f */
    public C11913a.C11914a mo68530f() {
        return this.f58733a;
    }

    /* renamed from: g */
    public C12314c mo68531g() {
        return this.f58735c;
    }

    /* renamed from: h */
    public boolean mo68532h() {
        return this.f58736d;
    }

    /* renamed from: i */
    public boolean mo68533i() {
        return this.f58737e;
    }

    /* renamed from: j */
    public boolean mo68534j() {
        return this.f58741i;
    }

    /* renamed from: k */
    public boolean mo68535k() {
        return this.f58743k;
    }

    /* renamed from: l */
    public boolean mo68536l() {
        return this.f58742j;
    }

    /* renamed from: m */
    public boolean mo68537m() {
        return this.f58738f;
    }

    /* renamed from: n */
    public void mo68538n(C11913a.C11914a aVar) {
        this.f58733a = aVar;
        this.f58736d = true;
    }

    /* renamed from: o */
    public void mo68539o(boolean z) {
        this.f58737e = z;
    }

    /* renamed from: p */
    public void mo68540p(String str) {
        this.f58744l = str;
    }

    /* renamed from: q */
    public void mo68541q(String str) {
        this.f58745m = str;
    }

    /* renamed from: r */
    public void mo68542r(String str) {
        this.f58739g = str;
    }

    /* renamed from: s */
    public void mo68543s(C12314c cVar) {
        this.f58735c = cVar;
    }

    /* renamed from: t */
    public void mo68544t(boolean z) {
        this.f58738f = z;
    }
}
