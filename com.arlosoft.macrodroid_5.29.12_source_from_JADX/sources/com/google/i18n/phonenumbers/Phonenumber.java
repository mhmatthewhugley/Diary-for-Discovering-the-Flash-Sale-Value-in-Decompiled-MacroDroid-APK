package com.google.i18n.phonenumbers;

import java.io.Serializable;
import java.util.Objects;

public final class Phonenumber {

    public static class PhoneNumber implements Serializable {
        private static final long serialVersionUID = 1;
        private CountryCodeSource countryCodeSource_ = CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN;
        private int countryCode_ = 0;
        private String extension_ = "";
        private boolean hasCountryCode;
        private boolean hasCountryCodeSource;
        private boolean hasExtension;
        private boolean hasItalianLeadingZero;
        private boolean hasNationalNumber;
        private boolean hasNumberOfLeadingZeros;
        private boolean hasPreferredDomesticCarrierCode;
        private boolean hasRawInput;
        private boolean italianLeadingZero_ = false;
        private long nationalNumber_ = 0;
        private int numberOfLeadingZeros_ = 1;
        private String preferredDomesticCarrierCode_ = "";
        private String rawInput_ = "";

        public enum CountryCodeSource {
            FROM_NUMBER_WITH_PLUS_SIGN,
            FROM_NUMBER_WITH_IDD,
            FROM_NUMBER_WITHOUT_PLUS_SIGN,
            FROM_DEFAULT_COUNTRY
        }

        /* renamed from: A */
        public PhoneNumber mo64454A(String str) {
            Objects.requireNonNull(str);
            this.hasExtension = true;
            this.extension_ = str;
            return this;
        }

        /* renamed from: B */
        public PhoneNumber mo64455B(boolean z) {
            this.hasItalianLeadingZero = true;
            this.italianLeadingZero_ = z;
            return this;
        }

        /* renamed from: C */
        public PhoneNumber mo64456C(long j) {
            this.hasNationalNumber = true;
            this.nationalNumber_ = j;
            return this;
        }

        /* renamed from: D */
        public PhoneNumber mo64457D(int i) {
            this.hasNumberOfLeadingZeros = true;
            this.numberOfLeadingZeros_ = i;
            return this;
        }

        /* renamed from: E */
        public PhoneNumber mo64458E(String str) {
            Objects.requireNonNull(str);
            this.hasPreferredDomesticCarrierCode = true;
            this.preferredDomesticCarrierCode_ = str;
            return this;
        }

        /* renamed from: F */
        public PhoneNumber mo64459F(String str) {
            Objects.requireNonNull(str);
            this.hasRawInput = true;
            this.rawInput_ = str;
            return this;
        }

        /* renamed from: a */
        public PhoneNumber mo64460a() {
            this.hasCountryCodeSource = false;
            this.countryCodeSource_ = CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN;
            return this;
        }

        /* renamed from: b */
        public PhoneNumber mo64461b() {
            this.hasExtension = false;
            this.extension_ = "";
            return this;
        }

        /* renamed from: c */
        public PhoneNumber mo64462c() {
            this.hasPreferredDomesticCarrierCode = false;
            this.preferredDomesticCarrierCode_ = "";
            return this;
        }

        /* renamed from: d */
        public PhoneNumber mo64463d() {
            this.hasRawInput = false;
            this.rawInput_ = "";
            return this;
        }

        /* renamed from: e */
        public boolean mo64464e(PhoneNumber phoneNumber) {
            if (phoneNumber == null) {
                return false;
            }
            if (this == phoneNumber) {
                return true;
            }
            if (this.countryCode_ == phoneNumber.countryCode_ && this.nationalNumber_ == phoneNumber.nationalNumber_ && this.extension_.equals(phoneNumber.extension_) && this.italianLeadingZero_ == phoneNumber.italianLeadingZero_ && this.numberOfLeadingZeros_ == phoneNumber.numberOfLeadingZeros_ && this.rawInput_.equals(phoneNumber.rawInput_) && this.countryCodeSource_ == phoneNumber.countryCodeSource_ && this.preferredDomesticCarrierCode_.equals(phoneNumber.preferredDomesticCarrierCode_) && mo64481u() == phoneNumber.mo64481u()) {
                return true;
            }
            return false;
        }

        public boolean equals(Object obj) {
            return (obj instanceof PhoneNumber) && mo64464e((PhoneNumber) obj);
        }

        /* renamed from: f */
        public int mo64466f() {
            return this.countryCode_;
        }

        /* renamed from: g */
        public CountryCodeSource mo64467g() {
            return this.countryCodeSource_;
        }

        /* renamed from: h */
        public String mo64468h() {
            return this.extension_;
        }

        public int hashCode() {
            int i = 1231;
            int f = (((((((((((((((2173 + mo64466f()) * 53) + Long.valueOf(mo64470i()).hashCode()) * 53) + mo64468h().hashCode()) * 53) + (mo64483w() ? 1231 : 1237)) * 53) + mo64471j()) * 53) + mo64473l().hashCode()) * 53) + mo64467g().hashCode()) * 53) + mo64472k().hashCode()) * 53;
            if (!mo64481u()) {
                i = 1237;
            }
            return f + i;
        }

        /* renamed from: i */
        public long mo64470i() {
            return this.nationalNumber_;
        }

        /* renamed from: j */
        public int mo64471j() {
            return this.numberOfLeadingZeros_;
        }

        /* renamed from: k */
        public String mo64472k() {
            return this.preferredDomesticCarrierCode_;
        }

        /* renamed from: l */
        public String mo64473l() {
            return this.rawInput_;
        }

        /* renamed from: m */
        public boolean mo64474m() {
            return this.hasCountryCode;
        }

        /* renamed from: n */
        public boolean mo64475n() {
            return this.hasCountryCodeSource;
        }

        /* renamed from: p */
        public boolean mo64476p() {
            return this.hasExtension;
        }

        /* renamed from: q */
        public boolean mo64477q() {
            return this.hasItalianLeadingZero;
        }

        /* renamed from: r */
        public boolean mo64478r() {
            return this.hasNationalNumber;
        }

        /* renamed from: t */
        public boolean mo64479t() {
            return this.hasNumberOfLeadingZeros;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Country Code: ");
            sb.append(this.countryCode_);
            sb.append(" National Number: ");
            sb.append(this.nationalNumber_);
            if (mo64477q() && mo64483w()) {
                sb.append(" Leading Zero(s): true");
            }
            if (mo64479t()) {
                sb.append(" Number of leading zeros: ");
                sb.append(this.numberOfLeadingZeros_);
            }
            if (mo64476p()) {
                sb.append(" Extension: ");
                sb.append(this.extension_);
            }
            if (mo64475n()) {
                sb.append(" Country Code Source: ");
                sb.append(this.countryCodeSource_);
            }
            if (mo64481u()) {
                sb.append(" Preferred Domestic Carrier Code: ");
                sb.append(this.preferredDomesticCarrierCode_);
            }
            return sb.toString();
        }

        /* renamed from: u */
        public boolean mo64481u() {
            return this.hasPreferredDomesticCarrierCode;
        }

        /* renamed from: v */
        public boolean mo64482v() {
            return this.hasRawInput;
        }

        /* renamed from: w */
        public boolean mo64483w() {
            return this.italianLeadingZero_;
        }

        /* renamed from: x */
        public PhoneNumber mo64484x(PhoneNumber phoneNumber) {
            if (phoneNumber.mo64474m()) {
                mo64485y(phoneNumber.mo64466f());
            }
            if (phoneNumber.mo64478r()) {
                mo64456C(phoneNumber.mo64470i());
            }
            if (phoneNumber.mo64476p()) {
                mo64454A(phoneNumber.mo64468h());
            }
            if (phoneNumber.mo64477q()) {
                mo64455B(phoneNumber.mo64483w());
            }
            if (phoneNumber.mo64479t()) {
                mo64457D(phoneNumber.mo64471j());
            }
            if (phoneNumber.mo64482v()) {
                mo64459F(phoneNumber.mo64473l());
            }
            if (phoneNumber.mo64475n()) {
                mo64486z(phoneNumber.mo64467g());
            }
            if (phoneNumber.mo64481u()) {
                mo64458E(phoneNumber.mo64472k());
            }
            return this;
        }

        /* renamed from: y */
        public PhoneNumber mo64485y(int i) {
            this.hasCountryCode = true;
            this.countryCode_ = i;
            return this;
        }

        /* renamed from: z */
        public PhoneNumber mo64486z(CountryCodeSource countryCodeSource) {
            Objects.requireNonNull(countryCodeSource);
            this.hasCountryCodeSource = true;
            this.countryCodeSource_ = countryCodeSource;
            return this;
        }
    }

    private Phonenumber() {
    }
}
