package okhttp3.internal.connection;

import java.net.Proxy;
import kotlin.Metadata;

@Metadata(mo71666bv = {1, 0, 3}, mo71669k = 3, mo71670mv = {1, 4, 0})
/* renamed from: okhttp3.internal.connection.g */
public final /* synthetic */ class C15950g {

    /* renamed from: a */
    public static final /* synthetic */ int[] f65707a;

    static {
        int[] iArr = new int[Proxy.Type.values().length];
        f65707a = iArr;
        iArr[Proxy.Type.DIRECT.ordinal()] = 1;
        iArr[Proxy.Type.HTTP.ordinal()] = 2;
    }
}
