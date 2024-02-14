package com.google.api.client.googleapis.testing.compute;

import com.google.api.client.googleapis.auth.oauth2.OAuth2Utils;
import com.google.api.client.http.LowLevelHttpRequest;
import com.google.api.client.http.LowLevelHttpResponse;
import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.testing.http.MockHttpTransport;
import com.google.api.client.testing.http.MockLowLevelHttpRequest;
import com.google.api.client.testing.http.MockLowLevelHttpResponse;
import com.google.api.client.util.Beta;
import com.twofortyfouram.locale.sdk.host.TaskerPlugin;
import java.io.IOException;

@Beta
public class MockMetadataServerTransport extends MockHttpTransport {

    /* renamed from: h */
    private static final String f52386h;

    /* renamed from: i */
    private static final String f52387i;

    /* renamed from: j */
    static final JsonFactory f52388j = new JacksonFactory();

    /* renamed from: f */
    String f52389f;

    /* renamed from: g */
    Integer f52390g;

    static {
        String a = OAuth2Utils.m71811a();
        f52386h = a;
        f52387i = String.valueOf(a).concat("/computeMetadata/v1/instance/service-accounts/default/token");
    }

    /* renamed from: b */
    public LowLevelHttpRequest mo60266b(String str, String str2) throws IOException {
        if (str2.equals(f52387i)) {
            return new MockLowLevelHttpRequest(str2) {
                /* renamed from: b */
                public LowLevelHttpResponse mo60256b() throws IOException {
                    if (MockMetadataServerTransport.this.f52390g != null) {
                        return new MockLowLevelHttpResponse().mo60646p(MockMetadataServerTransport.this.f52390g.intValue()).mo60642l("Token Fetch Error");
                    }
                    if ("Google".equals(mo60639m("Metadata-Flavor"))) {
                        GenericJson genericJson = new GenericJson();
                        genericJson.mo60518g(MockMetadataServerTransport.f52388j);
                        genericJson.put("access_token", MockMetadataServerTransport.this.f52389f);
                        genericJson.put("expires_in", Integer.valueOf(TaskerPlugin.Setting.REQUESTED_TIMEOUT_MS_NEVER));
                        genericJson.put("token_type", "Bearer");
                        return new MockLowLevelHttpResponse().mo60645o("application/json; charset=UTF-8").mo60642l(genericJson.mo60519h());
                    }
                    throw new IOException("Metadata request header not found.");
                }
            };
        }
        if (str2.equals(f52386h)) {
            return new MockLowLevelHttpRequest(str2) {
                /* renamed from: b */
                public LowLevelHttpResponse mo60256b() {
                    MockLowLevelHttpResponse mockLowLevelHttpResponse = new MockLowLevelHttpResponse();
                    mockLowLevelHttpResponse.mo60641k("Metadata-Flavor", "Google");
                    return mockLowLevelHttpResponse;
                }
            };
        }
        return super.mo60266b(str, str2);
    }
}
