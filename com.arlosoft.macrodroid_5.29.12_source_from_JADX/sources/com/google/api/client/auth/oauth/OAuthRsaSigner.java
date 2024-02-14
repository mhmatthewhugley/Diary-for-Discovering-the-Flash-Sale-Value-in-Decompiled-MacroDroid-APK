package com.google.api.client.auth.oauth;

import com.google.api.client.util.Base64;
import com.google.api.client.util.Beta;
import com.google.api.client.util.SecurityUtils;
import com.google.api.client.util.StringUtils;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;

@Beta
public final class OAuthRsaSigner implements OAuthSigner {

    /* renamed from: a */
    public PrivateKey f52172a;

    /* renamed from: a */
    public String mo60064a() {
        return "RSA-SHA1";
    }

    /* renamed from: b */
    public String mo60065b(String str) throws GeneralSecurityException {
        return Base64.m72635b(SecurityUtils.m72723c(SecurityUtils.m72721a(), this.f52172a, StringUtils.m72727a(str)));
    }
}
