package com.google.i18n.phonenumbers;

import com.google.i18n.phonenumbers.MetadataManager;
import com.google.i18n.phonenumbers.Phonemetadata;
import java.util.concurrent.atomic.AtomicReference;

final class SingleFileMetadataSourceImpl implements MetadataSource {

    /* renamed from: a */
    private final String f56200a;

    /* renamed from: b */
    private final MetadataLoader f56201b;

    /* renamed from: c */
    private final AtomicReference<MetadataManager.SingleFileMetadataMaps> f56202c;

    /* renamed from: a */
    public Phonemetadata.PhoneMetadata mo64326a(String str) {
        return MetadataManager.m78742e(this.f56202c, this.f56200a, this.f56201b).mo64325b(str);
    }

    /* renamed from: b */
    public Phonemetadata.PhoneMetadata mo64327b(int i) {
        return MetadataManager.m78742e(this.f56202c, this.f56200a, this.f56201b).mo64324a(i);
    }
}
