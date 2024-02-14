package com.google.api.services.gmail.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

public final class SendAs extends GenericJson {
    @Key
    private String displayName;
    @Key
    private Boolean isDefault;
    @Key
    private Boolean isPrimary;
    @Key
    private String replyToAddress;
    @Key
    private String sendAsEmail;
    @Key
    private String signature;
    @Key
    private SmtpMsa smtpMsa;
    @Key
    private Boolean treatAsAlias;
    @Key
    private String verificationStatus;

    /* renamed from: k */
    public SendAs mo60137e() {
        return (SendAs) super.clone();
    }

    /* renamed from: l */
    public SendAs mo60138f(String str, Object obj) {
        return (SendAs) super.mo60078d(str, obj);
    }
}
