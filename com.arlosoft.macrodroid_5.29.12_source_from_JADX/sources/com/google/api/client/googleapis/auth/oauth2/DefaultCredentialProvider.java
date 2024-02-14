package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.auth.oauth2.TokenResponse;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.util.Beta;
import java.io.IOException;
import java.io.InputStream;

@Beta
class DefaultCredentialProvider extends SystemEnvironmentProvider {

    /* renamed from: b */
    private GoogleCredential f52238b = null;

    /* renamed from: c */
    private Environment f52239c = null;

    /* renamed from: com.google.api.client.googleapis.auth.oauth2.DefaultCredentialProvider$1 */
    static /* synthetic */ class C108241 {

        /* renamed from: a */
        static final /* synthetic */ int[] f52240a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.api.client.googleapis.auth.oauth2.DefaultCredentialProvider$Environment[] r0 = com.google.api.client.googleapis.auth.oauth2.DefaultCredentialProvider.Environment.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f52240a = r0
                com.google.api.client.googleapis.auth.oauth2.DefaultCredentialProvider$Environment r1 = com.google.api.client.googleapis.auth.oauth2.DefaultCredentialProvider.Environment.ENVIRONMENT_VARIABLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f52240a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.api.client.googleapis.auth.oauth2.DefaultCredentialProvider$Environment r1 = com.google.api.client.googleapis.auth.oauth2.DefaultCredentialProvider.Environment.WELL_KNOWN_FILE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f52240a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.api.client.googleapis.auth.oauth2.DefaultCredentialProvider$Environment r1 = com.google.api.client.googleapis.auth.oauth2.DefaultCredentialProvider.Environment.APP_ENGINE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f52240a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.api.client.googleapis.auth.oauth2.DefaultCredentialProvider$Environment r1 = com.google.api.client.googleapis.auth.oauth2.DefaultCredentialProvider.Environment.CLOUD_SHELL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f52240a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.api.client.googleapis.auth.oauth2.DefaultCredentialProvider$Environment r1 = com.google.api.client.googleapis.auth.oauth2.DefaultCredentialProvider.Environment.COMPUTE_ENGINE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.api.client.googleapis.auth.oauth2.DefaultCredentialProvider.C108241.<clinit>():void");
        }
    }

    private static class ComputeGoogleCredential extends GoogleCredential {

        /* renamed from: u */
        private static final String f52241u = String.valueOf(OAuth2Utils.m71811a()).concat("/computeMetadata/v1/instance/service-accounts/default/token");

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public TokenResponse mo60097d() throws IOException {
            HttpRequest a = mo60106m().mo60467c().mo60444a(new GenericUrl(mo60105l()));
            JsonObjectParser jsonObjectParser = new JsonObjectParser(mo60103j());
            a.mo60437v(jsonObjectParser);
            a.mo60420e().mo60078d("Metadata-Flavor", "Google");
            a.mo60440y(false);
            HttpResponse a2 = a.mo60416a();
            int g = a2.mo60454g();
            if (g == 200) {
                InputStream b = a2.mo60449b();
                if (b != null) {
                    return (TokenResponse) jsonObjectParser.mo60213a(b, a2.mo60450c(), TokenResponse.class);
                }
                throw new IOException("Empty content from metadata token server request.");
            } else if (g == 404) {
                throw new IOException(String.format("Error code %s trying to get security access token from Compute Engine metadata for the default service account. This may be because the virtual machine instance does not have permission scopes specified.", new Object[]{Integer.valueOf(g)}));
            } else {
                throw new IOException(String.format("Unexpected Error code %s trying to get security access token from Compute Engine metadata for the default service account: %s", new Object[]{Integer.valueOf(g), a2.mo60459m()}));
            }
        }
    }

    private enum Environment {
        UNKNOWN,
        ENVIRONMENT_VARIABLE,
        WELL_KNOWN_FILE,
        CLOUD_SHELL,
        APP_ENGINE,
        COMPUTE_ENGINE
    }

    DefaultCredentialProvider() {
    }
}
