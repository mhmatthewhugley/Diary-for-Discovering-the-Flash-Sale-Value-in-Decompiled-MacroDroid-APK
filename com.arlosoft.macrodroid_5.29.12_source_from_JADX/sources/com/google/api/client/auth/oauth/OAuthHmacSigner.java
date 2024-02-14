package com.google.api.client.auth.oauth;

import com.google.api.client.util.Base64;
import com.google.api.client.util.Beta;
import com.google.api.client.util.StringUtils;
import com.tencent.soter.core.keystore.KeyPropertiesCompact;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

@Beta
public final class OAuthHmacSigner implements OAuthSigner {

    /* renamed from: a */
    public String f52157a;

    /* renamed from: b */
    public String f52158b;

    /* renamed from: a */
    public String mo60064a() {
        return "HMAC-SHA1";
    }

    /* renamed from: b */
    public String mo60065b(String str) throws GeneralSecurityException {
        StringBuilder sb = new StringBuilder();
        String str2 = this.f52157a;
        if (str2 != null) {
            sb.append(OAuthParameters.m71469g(str2));
        }
        sb.append('&');
        String str3 = this.f52158b;
        if (str3 != null) {
            sb.append(OAuthParameters.m71469g(str3));
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(StringUtils.m72727a(sb.toString()), KeyPropertiesCompact.KEY_ALGORITHM_HMAC_SHA1);
        Mac instance = Mac.getInstance(KeyPropertiesCompact.KEY_ALGORITHM_HMAC_SHA1);
        instance.init(secretKeySpec);
        return Base64.m72635b(instance.doFinal(StringUtils.m72727a(str)));
    }
}
