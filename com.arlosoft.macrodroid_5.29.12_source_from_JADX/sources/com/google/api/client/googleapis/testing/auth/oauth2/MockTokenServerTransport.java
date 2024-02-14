package com.google.api.client.googleapis.testing.auth.oauth2;

import com.google.api.client.googleapis.testing.TestUtils;
import com.google.api.client.http.LowLevelHttpRequest;
import com.google.api.client.http.LowLevelHttpResponse;
import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.json.webtoken.JsonWebSignature;
import com.google.api.client.testing.http.MockHttpTransport;
import com.google.api.client.testing.http.MockLowLevelHttpRequest;
import com.google.api.client.testing.http.MockLowLevelHttpResponse;
import com.google.api.client.util.Beta;
import com.twofortyfouram.locale.sdk.host.TaskerPlugin;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Beta
public class MockTokenServerTransport extends MockHttpTransport {

    /* renamed from: j */
    static final JsonFactory f52380j = new JacksonFactory();

    /* renamed from: f */
    final String f52381f;

    /* renamed from: g */
    Map<String, String> f52382g;

    /* renamed from: h */
    Map<String, String> f52383h;

    /* renamed from: i */
    Map<String, String> f52384i;

    public MockTokenServerTransport() {
        this("https://accounts.google.com/o/oauth2/token");
    }

    /* renamed from: b */
    public LowLevelHttpRequest mo60266b(String str, String str2) throws IOException {
        if (str2.equals(this.f52381f)) {
            return new MockLowLevelHttpRequest(str2) {
                /* renamed from: b */
                public LowLevelHttpResponse mo60256b() throws IOException {
                    String str;
                    Map<String, String> a = TestUtils.m71931a(mo60638l());
                    String str2 = a.get("client_id");
                    if (str2 != null) {
                        if (MockTokenServerTransport.this.f52383h.containsKey(str2)) {
                            String str3 = a.get("client_secret");
                            String str4 = MockTokenServerTransport.this.f52383h.get(str2);
                            if (str3 == null || !str3.equals(str4)) {
                                throw new IOException("Client secret not found.");
                            }
                            String str5 = a.get("refresh_token");
                            if (MockTokenServerTransport.this.f52384i.containsKey(str5)) {
                                str = MockTokenServerTransport.this.f52384i.get(str5);
                            } else {
                                throw new IOException("Refresh Token not found.");
                            }
                        } else {
                            throw new IOException("Client ID not found.");
                        }
                    } else if (!a.containsKey("grant_type")) {
                        throw new IOException("Unknown token type.");
                    } else if ("urn:ietf:params:oauth:grant-type:jwt-bearer".equals(a.get("grant_type"))) {
                        JsonWebSignature b = JsonWebSignature.m72350b(MockTokenServerTransport.f52380j, a.get("assertion"));
                        String l = b.mo60152a().mo60558l();
                        if (MockTokenServerTransport.this.f52382g.containsKey(l)) {
                            String str6 = MockTokenServerTransport.this.f52382g.get(l);
                            String str7 = (String) b.mo60152a().get("scope");
                            if (str7 == null || str7.length() == 0) {
                                throw new IOException("Scopes not found.");
                            }
                            str = str6;
                        } else {
                            throw new IOException("Service Account Email not found as issuer.");
                        }
                    } else {
                        throw new IOException("Unexpected Grant Type.");
                    }
                    GenericJson genericJson = new GenericJson();
                    genericJson.mo60518g(MockTokenServerTransport.f52380j);
                    genericJson.put("access_token", str);
                    genericJson.put("expires_in", Integer.valueOf(TaskerPlugin.Setting.REQUESTED_TIMEOUT_MS_NEVER));
                    genericJson.put("token_type", "Bearer");
                    return new MockLowLevelHttpResponse().mo60645o("application/json; charset=UTF-8").mo60642l(genericJson.mo60519h());
                }
            };
        }
        return super.mo60266b(str, str2);
    }

    public MockTokenServerTransport(String str) {
        this.f52382g = new HashMap();
        this.f52383h = new HashMap();
        this.f52384i = new HashMap();
        this.f52381f = str;
    }
}
