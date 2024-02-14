package p052x;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: x.b */
/* compiled from: DefaultLottieNetworkFetcher */
public class C2157b implements C2161f {
    @NonNull
    /* renamed from: a */
    public C2159d mo24381a(@NonNull String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new C2156a(httpURLConnection);
    }
}
