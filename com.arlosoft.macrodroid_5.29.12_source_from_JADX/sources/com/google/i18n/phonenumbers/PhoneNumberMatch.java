package com.google.i18n.phonenumbers;

import com.google.i18n.phonenumbers.Phonenumber;
import java.util.Arrays;

public final class PhoneNumberMatch {

    /* renamed from: a */
    private final int f56079a;

    /* renamed from: b */
    private final String f56080b;

    /* renamed from: c */
    private final Phonenumber.PhoneNumber f56081c;

    PhoneNumberMatch(int i, String str, Phonenumber.PhoneNumber phoneNumber) {
        if (i < 0) {
            throw new IllegalArgumentException("Start index must be >= 0.");
        } else if (str == null || phoneNumber == null) {
            throw null;
        } else {
            this.f56079a = i;
            this.f56080b = str;
            this.f56081c = phoneNumber;
        }
    }

    /* renamed from: a */
    public int mo64330a() {
        return this.f56079a + this.f56080b.length();
    }

    /* renamed from: b */
    public int mo64331b() {
        return this.f56079a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhoneNumberMatch)) {
            return false;
        }
        PhoneNumberMatch phoneNumberMatch = (PhoneNumberMatch) obj;
        if (!this.f56080b.equals(phoneNumberMatch.f56080b) || this.f56079a != phoneNumberMatch.f56079a || !this.f56081c.equals(phoneNumberMatch.f56081c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f56079a), this.f56080b, this.f56081c});
    }

    public String toString() {
        return "PhoneNumberMatch [" + mo64331b() + "," + mo64330a() + ") " + this.f56080b;
    }
}
