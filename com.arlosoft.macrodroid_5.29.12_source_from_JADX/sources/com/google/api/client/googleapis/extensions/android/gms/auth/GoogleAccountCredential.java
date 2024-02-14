package com.google.api.client.googleapis.extensions.android.gms.auth;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.GoogleAuthUtil;
import com.google.android.gms.auth.GooglePlayServicesAvailabilityException;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.AccountPicker;
import com.google.api.client.googleapis.extensions.android.accounts.GoogleAccountManager;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpUnsuccessfulResponseHandler;
import com.google.api.client.util.BackOff;
import com.google.api.client.util.Beta;
import com.google.api.client.util.Joiner;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Sleeper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

@Beta
public class GoogleAccountCredential implements HttpRequestInitializer {

    /* renamed from: a */
    final Context f52285a;

    /* renamed from: b */
    final String f52286b;

    /* renamed from: c */
    private final GoogleAccountManager f52287c;

    /* renamed from: d */
    private String f52288d;

    /* renamed from: e */
    private Account f52289e;

    /* renamed from: f */
    private Sleeper f52290f = Sleeper.f52834a;

    /* renamed from: g */
    private BackOff f52291g;

    @Beta
    class RequestHandler implements HttpExecuteInterceptor, HttpUnsuccessfulResponseHandler {

        /* renamed from: a */
        boolean f52292a;

        /* renamed from: b */
        String f52293b;

        RequestHandler() {
        }

        /* renamed from: a */
        public boolean mo60096a(HttpRequest httpRequest, HttpResponse httpResponse, boolean z) {
            if (httpResponse.mo60454g() != 401 || this.f52292a) {
                return false;
            }
            this.f52292a = true;
            GoogleAuthUtil.m3118e(GoogleAccountCredential.this.f52285a, this.f52293b);
            return true;
        }

        /* renamed from: b */
        public void mo60066b(HttpRequest httpRequest) throws IOException {
            try {
                this.f52293b = GoogleAccountCredential.this.mo60272d();
                HttpHeaders e = httpRequest.mo60420e();
                String valueOf = String.valueOf(this.f52293b);
                e.mo60376B(valueOf.length() != 0 ? "Bearer ".concat(valueOf) : new String("Bearer "));
            } catch (GooglePlayServicesAvailabilityException e2) {
                throw new GooglePlayServicesAvailabilityIOException(e2);
            } catch (UserRecoverableAuthException e3) {
                throw new UserRecoverableAuthIOException(e3);
            } catch (GoogleAuthException e4) {
                throw new GoogleAuthIOException(e4);
            }
        }
    }

    public GoogleAccountCredential(Context context, String str) {
        this.f52287c = new GoogleAccountManager(context);
        this.f52285a = context;
        this.f52286b = str;
    }

    /* renamed from: h */
    public static GoogleAccountCredential m71830h(Context context, Collection<String> collection) {
        Preconditions.m72713a(collection != null && collection.iterator().hasNext());
        String valueOf = String.valueOf(Joiner.m72699b(' ').mo60765a(collection));
        return new GoogleAccountCredential(context, valueOf.length() != 0 ? "oauth2: ".concat(valueOf) : new String("oauth2: "));
    }

    /* renamed from: a */
    public final Account mo60270a() {
        return this.f52289e;
    }

    /* renamed from: b */
    public final String mo60271b() {
        return this.f52288d;
    }

    /* renamed from: c */
    public void mo60067c(HttpRequest httpRequest) {
        RequestHandler requestHandler = new RequestHandler();
        httpRequest.mo60436u(requestHandler);
        httpRequest.mo60441z(requestHandler);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:3|4|5) */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r1 = r3.f52291g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (r1 == null) goto L_0x0020;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x0007 A[LOOP:0: B:3:0x0007->B:14:0x0007, LOOP_START, SYNTHETIC, Splitter:B:3:0x0007] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo60272d() throws java.io.IOException, com.google.android.gms.auth.GoogleAuthException {
        /*
            r3 = this;
            com.google.api.client.util.BackOff r0 = r3.f52291g
            if (r0 == 0) goto L_0x0007
            r0.reset()
        L_0x0007:
            android.content.Context r0 = r3.f52285a     // Catch:{ IOException -> 0x0012 }
            java.lang.String r1 = r3.f52288d     // Catch:{ IOException -> 0x0012 }
            java.lang.String r2 = r3.f52286b     // Catch:{ IOException -> 0x0012 }
            java.lang.String r0 = com.google.android.gms.auth.GoogleAuthUtil.m3117d(r0, r1, r2)     // Catch:{ IOException -> 0x0012 }
            return r0
        L_0x0012:
            r0 = move-exception
            com.google.api.client.util.BackOff r1 = r3.f52291g     // Catch:{ InterruptedException -> 0x0007 }
            if (r1 == 0) goto L_0x0020
            com.google.api.client.util.Sleeper r2 = r3.f52290f     // Catch:{ InterruptedException -> 0x0007 }
            boolean r1 = com.google.api.client.util.BackOffUtils.m72633a(r2, r1)     // Catch:{ InterruptedException -> 0x0007 }
            if (r1 == 0) goto L_0x0020
            goto L_0x0007
        L_0x0020:
            throw r0     // Catch:{ InterruptedException -> 0x0007 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.api.client.googleapis.extensions.android.gms.auth.GoogleAccountCredential.mo60272d():java.lang.String");
    }

    /* renamed from: e */
    public final Intent mo60273e() {
        return AccountPicker.m3475a(this.f52289e, (ArrayList<Account>) null, new String[]{"com.google"}, true, (String) null, (String) null, (String[]) null, (Bundle) null);
    }

    /* renamed from: f */
    public GoogleAccountCredential mo60274f(BackOff backOff) {
        this.f52291g = backOff;
        return this;
    }

    /* renamed from: g */
    public final GoogleAccountCredential mo60275g(String str) {
        Account a = this.f52287c.mo60268a(str);
        this.f52289e = a;
        if (a == null) {
            str = null;
        }
        this.f52288d = str;
        return this;
    }
}
