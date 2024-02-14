package p052x;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import org.apache.commons.p353io.IOUtils;
import p001a0.C0006d;

/* renamed from: x.a */
/* compiled from: DefaultLottieFetchResult */
public class C2156a implements C2159d {
    @NonNull

    /* renamed from: a */
    private final HttpURLConnection f6764a;

    public C2156a(@NonNull HttpURLConnection httpURLConnection) {
        this.f6764a = httpURLConnection;
    }

    /* renamed from: b */
    private String m8920b(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append(10);
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e) {
                throw e;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    @Nullable
    /* renamed from: G1 */
    public String mo24376G1() {
        try {
            if (mo24377J0()) {
                return null;
            }
            return "Unable to fetch " + this.f6764a.getURL() + ". Failed with " + this.f6764a.getResponseCode() + IOUtils.LINE_SEPARATOR_UNIX + m8920b(this.f6764a);
        } catch (IOException e) {
            C0006d.m33d("get error failed ", e);
            return e.getMessage();
        }
    }

    /* renamed from: J0 */
    public boolean mo24377J0() {
        try {
            return this.f6764a.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    public void close() {
        this.f6764a.disconnect();
    }

    @Nullable
    /* renamed from: r0 */
    public String mo24379r0() {
        return this.f6764a.getContentType();
    }

    @NonNull
    /* renamed from: u0 */
    public InputStream mo24380u0() throws IOException {
        return this.f6764a.getInputStream();
    }
}
