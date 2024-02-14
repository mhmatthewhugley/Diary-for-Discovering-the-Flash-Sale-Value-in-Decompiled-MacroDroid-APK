package com.google.android.gms.auth.api.signin.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class zze implements Runnable {

    /* renamed from: d */
    private static final Logger f2931d = new Logger("RevokeAccessOperation", new String[0]);

    /* renamed from: a */
    private final String f2932a;

    /* renamed from: c */
    private final StatusPendingResult f2933c = new StatusPendingResult((GoogleApiClient) null);

    private zze(String str) {
        this.f2932a = Preconditions.m4484g(str);
    }

    /* renamed from: a */
    public static PendingResult<Status> m3358a(@Nullable String str) {
        if (str == null) {
            return PendingResults.m3682a(new Status(4), (GoogleApiClient) null);
        }
        zze zze = new zze(str);
        new Thread(zze).start();
        return zze.f2933c;
    }

    public final void run() {
        Status status = Status.f3140z;
        try {
            String valueOf = String.valueOf(this.f2932a);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(valueOf.length() != 0 ? "https://accounts.google.com/o/oauth2/revoke?token=".concat(valueOf) : new String("https://accounts.google.com/o/oauth2/revoke?token=")).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f3138p;
            } else {
                f2931d.mo21839c("Unable to revoke access!", new Object[0]);
            }
            Logger logger = f2931d;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Response Code: ");
            sb.append(responseCode);
            logger.mo21837a(sb.toString(), new Object[0]);
        } catch (IOException e) {
            Logger logger2 = f2931d;
            String valueOf2 = String.valueOf(e.toString());
            logger2.mo21839c(valueOf2.length() != 0 ? "IOException when revoking access: ".concat(valueOf2) : new String("IOException when revoking access: "), new Object[0]);
        } catch (Exception e2) {
            Logger logger3 = f2931d;
            String valueOf3 = String.valueOf(e2.toString());
            logger3.mo21839c(valueOf3.length() != 0 ? "Exception when revoking access: ".concat(valueOf3) : new String("Exception when revoking access: "), new Object[0]);
        }
        this.f2933c.mo21329l(status);
    }
}
