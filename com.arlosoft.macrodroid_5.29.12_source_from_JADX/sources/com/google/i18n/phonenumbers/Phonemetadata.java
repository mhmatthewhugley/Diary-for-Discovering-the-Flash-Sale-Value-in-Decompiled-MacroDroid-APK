package com.google.i18n.phonenumbers;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Phonemetadata {

    public static class NumberFormat implements Externalizable {
        private static final long serialVersionUID = 1;
        private String domesticCarrierCodeFormattingRule_ = "";
        private String format_ = "";
        private boolean hasDomesticCarrierCodeFormattingRule;
        private boolean hasFormat;
        private boolean hasNationalPrefixFormattingRule;
        private boolean hasNationalPrefixOptionalWhenFormatting;
        private boolean hasPattern;
        private List<String> leadingDigitsPattern_ = new ArrayList();
        private String nationalPrefixFormattingRule_ = "";
        private boolean nationalPrefixOptionalWhenFormatting_ = false;
        private String pattern_ = "";

        public static final class Builder extends NumberFormat {
        }

        /* renamed from: a */
        public String mo64369a() {
            return this.domesticCarrierCodeFormattingRule_;
        }

        /* renamed from: b */
        public String mo64370b() {
            return this.format_;
        }

        /* renamed from: c */
        public String mo64371c(int i) {
            return this.leadingDigitsPattern_.get(i);
        }

        /* renamed from: d */
        public String mo64372d() {
            return this.nationalPrefixFormattingRule_;
        }

        /* renamed from: e */
        public String mo64373e() {
            return this.pattern_;
        }

        /* renamed from: f */
        public boolean mo64374f() {
            return this.nationalPrefixOptionalWhenFormatting_;
        }

        /* renamed from: g */
        public int mo64375g() {
            return this.leadingDigitsPattern_.size();
        }

        /* renamed from: h */
        public NumberFormat mo64376h(String str) {
            this.hasDomesticCarrierCodeFormattingRule = true;
            this.domesticCarrierCodeFormattingRule_ = str;
            return this;
        }

        /* renamed from: i */
        public NumberFormat mo64377i(String str) {
            this.hasFormat = true;
            this.format_ = str;
            return this;
        }

        /* renamed from: j */
        public NumberFormat mo64378j(String str) {
            this.hasNationalPrefixFormattingRule = true;
            this.nationalPrefixFormattingRule_ = str;
            return this;
        }

        /* renamed from: k */
        public NumberFormat mo64379k(boolean z) {
            this.hasNationalPrefixOptionalWhenFormatting = true;
            this.nationalPrefixOptionalWhenFormatting_ = z;
            return this;
        }

        /* renamed from: l */
        public NumberFormat mo64380l(String str) {
            this.hasPattern = true;
            this.pattern_ = str;
            return this;
        }

        public void readExternal(ObjectInput objectInput) throws IOException {
            mo64380l(objectInput.readUTF());
            mo64377i(objectInput.readUTF());
            int readInt = objectInput.readInt();
            for (int i = 0; i < readInt; i++) {
                this.leadingDigitsPattern_.add(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                mo64378j(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                mo64376h(objectInput.readUTF());
            }
            mo64379k(objectInput.readBoolean());
        }

        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeUTF(this.pattern_);
            objectOutput.writeUTF(this.format_);
            int g = mo64375g();
            objectOutput.writeInt(g);
            for (int i = 0; i < g; i++) {
                objectOutput.writeUTF(this.leadingDigitsPattern_.get(i));
            }
            objectOutput.writeBoolean(this.hasNationalPrefixFormattingRule);
            if (this.hasNationalPrefixFormattingRule) {
                objectOutput.writeUTF(this.nationalPrefixFormattingRule_);
            }
            objectOutput.writeBoolean(this.hasDomesticCarrierCodeFormattingRule);
            if (this.hasDomesticCarrierCodeFormattingRule) {
                objectOutput.writeUTF(this.domesticCarrierCodeFormattingRule_);
            }
            objectOutput.writeBoolean(this.nationalPrefixOptionalWhenFormatting_);
        }
    }

    public static class PhoneMetadata implements Externalizable {
        private static final long serialVersionUID = 1;
        private PhoneNumberDesc carrierSpecific_ = null;
        private int countryCode_ = 0;
        private PhoneNumberDesc emergency_ = null;
        private PhoneNumberDesc fixedLine_ = null;
        private PhoneNumberDesc generalDesc_ = null;
        private boolean hasCarrierSpecific;
        private boolean hasCountryCode;
        private boolean hasEmergency;
        private boolean hasFixedLine;
        private boolean hasGeneralDesc;
        private boolean hasId;
        private boolean hasInternationalPrefix;
        private boolean hasLeadingDigits;
        private boolean hasLeadingZeroPossible;
        private boolean hasMainCountryForCode;
        private boolean hasMobile;
        private boolean hasMobileNumberPortableRegion;
        private boolean hasNationalPrefix;
        private boolean hasNationalPrefixForParsing;
        private boolean hasNationalPrefixTransformRule;
        private boolean hasNoInternationalDialling;
        private boolean hasPager;
        private boolean hasPersonalNumber;
        private boolean hasPreferredExtnPrefix;
        private boolean hasPreferredInternationalPrefix;
        private boolean hasPremiumRate;
        private boolean hasSameMobileAndFixedLinePattern;
        private boolean hasSharedCost;
        private boolean hasShortCode;
        private boolean hasStandardRate;
        private boolean hasTollFree;
        private boolean hasUan;
        private boolean hasVoicemail;
        private boolean hasVoip;
        private String id_ = "";
        private String internationalPrefix_ = "";
        private List<NumberFormat> intlNumberFormat_ = new ArrayList();
        private String leadingDigits_ = "";
        private boolean leadingZeroPossible_ = false;
        private boolean mainCountryForCode_ = false;
        private boolean mobileNumberPortableRegion_ = false;
        private PhoneNumberDesc mobile_ = null;
        private String nationalPrefixForParsing_ = "";
        private String nationalPrefixTransformRule_ = "";
        private String nationalPrefix_ = "";
        private PhoneNumberDesc noInternationalDialling_ = null;
        private List<NumberFormat> numberFormat_ = new ArrayList();
        private PhoneNumberDesc pager_ = null;
        private PhoneNumberDesc personalNumber_ = null;
        private String preferredExtnPrefix_ = "";
        private String preferredInternationalPrefix_ = "";
        private PhoneNumberDesc premiumRate_ = null;
        private boolean sameMobileAndFixedLinePattern_ = false;
        private PhoneNumberDesc sharedCost_ = null;
        private PhoneNumberDesc shortCode_ = null;
        private PhoneNumberDesc standardRate_ = null;
        private PhoneNumberDesc tollFree_ = null;
        private PhoneNumberDesc uan_ = null;
        private PhoneNumberDesc voicemail_ = null;
        private PhoneNumberDesc voip_ = null;

        public static final class Builder extends PhoneMetadata {
        }

        /* renamed from: A */
        public List<NumberFormat> mo64383A() {
            return this.numberFormat_;
        }

        /* renamed from: B */
        public PhoneMetadata mo64384B(PhoneNumberDesc phoneNumberDesc) {
            Objects.requireNonNull(phoneNumberDesc);
            this.hasCarrierSpecific = true;
            this.carrierSpecific_ = phoneNumberDesc;
            return this;
        }

        /* renamed from: C */
        public PhoneMetadata mo64385C(int i) {
            this.hasCountryCode = true;
            this.countryCode_ = i;
            return this;
        }

        /* renamed from: D */
        public PhoneMetadata mo64386D(PhoneNumberDesc phoneNumberDesc) {
            Objects.requireNonNull(phoneNumberDesc);
            this.hasEmergency = true;
            this.emergency_ = phoneNumberDesc;
            return this;
        }

        /* renamed from: E */
        public PhoneMetadata mo64387E(PhoneNumberDesc phoneNumberDesc) {
            Objects.requireNonNull(phoneNumberDesc);
            this.hasFixedLine = true;
            this.fixedLine_ = phoneNumberDesc;
            return this;
        }

        /* renamed from: F */
        public PhoneMetadata mo64388F(PhoneNumberDesc phoneNumberDesc) {
            Objects.requireNonNull(phoneNumberDesc);
            this.hasGeneralDesc = true;
            this.generalDesc_ = phoneNumberDesc;
            return this;
        }

        /* renamed from: G */
        public PhoneMetadata mo64389G(String str) {
            this.hasId = true;
            this.id_ = str;
            return this;
        }

        /* renamed from: H */
        public PhoneMetadata mo64390H(String str) {
            this.hasInternationalPrefix = true;
            this.internationalPrefix_ = str;
            return this;
        }

        /* renamed from: I */
        public PhoneMetadata mo64391I(String str) {
            this.hasLeadingDigits = true;
            this.leadingDigits_ = str;
            return this;
        }

        /* renamed from: J */
        public PhoneMetadata mo64392J(boolean z) {
            this.hasLeadingZeroPossible = true;
            this.leadingZeroPossible_ = z;
            return this;
        }

        /* renamed from: L */
        public PhoneMetadata mo64393L(boolean z) {
            this.hasMainCountryForCode = true;
            this.mainCountryForCode_ = z;
            return this;
        }

        /* renamed from: M */
        public PhoneMetadata mo64394M(PhoneNumberDesc phoneNumberDesc) {
            Objects.requireNonNull(phoneNumberDesc);
            this.hasMobile = true;
            this.mobile_ = phoneNumberDesc;
            return this;
        }

        /* renamed from: N */
        public PhoneMetadata mo64395N(boolean z) {
            this.hasMobileNumberPortableRegion = true;
            this.mobileNumberPortableRegion_ = z;
            return this;
        }

        /* renamed from: O */
        public PhoneMetadata mo64396O(String str) {
            this.hasNationalPrefix = true;
            this.nationalPrefix_ = str;
            return this;
        }

        /* renamed from: P */
        public PhoneMetadata mo64397P(String str) {
            this.hasNationalPrefixForParsing = true;
            this.nationalPrefixForParsing_ = str;
            return this;
        }

        /* renamed from: Q */
        public PhoneMetadata mo64398Q(String str) {
            this.hasNationalPrefixTransformRule = true;
            this.nationalPrefixTransformRule_ = str;
            return this;
        }

        /* renamed from: R */
        public PhoneMetadata mo64399R(PhoneNumberDesc phoneNumberDesc) {
            Objects.requireNonNull(phoneNumberDesc);
            this.hasNoInternationalDialling = true;
            this.noInternationalDialling_ = phoneNumberDesc;
            return this;
        }

        /* renamed from: T */
        public PhoneMetadata mo64400T(PhoneNumberDesc phoneNumberDesc) {
            Objects.requireNonNull(phoneNumberDesc);
            this.hasPager = true;
            this.pager_ = phoneNumberDesc;
            return this;
        }

        /* renamed from: U */
        public PhoneMetadata mo64401U(PhoneNumberDesc phoneNumberDesc) {
            Objects.requireNonNull(phoneNumberDesc);
            this.hasPersonalNumber = true;
            this.personalNumber_ = phoneNumberDesc;
            return this;
        }

        /* renamed from: V */
        public PhoneMetadata mo64402V(String str) {
            this.hasPreferredExtnPrefix = true;
            this.preferredExtnPrefix_ = str;
            return this;
        }

        /* renamed from: W */
        public PhoneMetadata mo64403W(String str) {
            this.hasPreferredInternationalPrefix = true;
            this.preferredInternationalPrefix_ = str;
            return this;
        }

        /* renamed from: X */
        public PhoneMetadata mo64404X(PhoneNumberDesc phoneNumberDesc) {
            Objects.requireNonNull(phoneNumberDesc);
            this.hasPremiumRate = true;
            this.premiumRate_ = phoneNumberDesc;
            return this;
        }

        /* renamed from: Y */
        public PhoneMetadata mo64405Y(boolean z) {
            this.hasSameMobileAndFixedLinePattern = true;
            this.sameMobileAndFixedLinePattern_ = z;
            return this;
        }

        /* renamed from: Z */
        public PhoneMetadata mo64406Z(PhoneNumberDesc phoneNumberDesc) {
            Objects.requireNonNull(phoneNumberDesc);
            this.hasSharedCost = true;
            this.sharedCost_ = phoneNumberDesc;
            return this;
        }

        /* renamed from: a */
        public int mo64407a() {
            return this.countryCode_;
        }

        /* renamed from: a0 */
        public PhoneMetadata mo64408a0(PhoneNumberDesc phoneNumberDesc) {
            Objects.requireNonNull(phoneNumberDesc);
            this.hasShortCode = true;
            this.shortCode_ = phoneNumberDesc;
            return this;
        }

        /* renamed from: b */
        public PhoneNumberDesc mo64409b() {
            return this.fixedLine_;
        }

        /* renamed from: b0 */
        public PhoneMetadata mo64410b0(PhoneNumberDesc phoneNumberDesc) {
            Objects.requireNonNull(phoneNumberDesc);
            this.hasStandardRate = true;
            this.standardRate_ = phoneNumberDesc;
            return this;
        }

        /* renamed from: c */
        public PhoneNumberDesc mo64411c() {
            return this.generalDesc_;
        }

        /* renamed from: c0 */
        public PhoneMetadata mo64412c0(PhoneNumberDesc phoneNumberDesc) {
            Objects.requireNonNull(phoneNumberDesc);
            this.hasTollFree = true;
            this.tollFree_ = phoneNumberDesc;
            return this;
        }

        /* renamed from: d */
        public String mo64413d() {
            return this.internationalPrefix_;
        }

        /* renamed from: d0 */
        public PhoneMetadata mo64414d0(PhoneNumberDesc phoneNumberDesc) {
            Objects.requireNonNull(phoneNumberDesc);
            this.hasUan = true;
            this.uan_ = phoneNumberDesc;
            return this;
        }

        /* renamed from: e */
        public String mo64415e() {
            return this.leadingDigits_;
        }

        /* renamed from: e0 */
        public PhoneMetadata mo64416e0(PhoneNumberDesc phoneNumberDesc) {
            Objects.requireNonNull(phoneNumberDesc);
            this.hasVoicemail = true;
            this.voicemail_ = phoneNumberDesc;
            return this;
        }

        /* renamed from: f */
        public PhoneNumberDesc mo64417f() {
            return this.mobile_;
        }

        /* renamed from: f0 */
        public PhoneMetadata mo64418f0(PhoneNumberDesc phoneNumberDesc) {
            Objects.requireNonNull(phoneNumberDesc);
            this.hasVoip = true;
            this.voip_ = phoneNumberDesc;
            return this;
        }

        /* renamed from: g */
        public String mo64419g() {
            return this.nationalPrefix_;
        }

        public String getId() {
            return this.id_;
        }

        /* renamed from: h */
        public String mo64421h() {
            return this.nationalPrefixForParsing_;
        }

        /* renamed from: i */
        public String mo64422i() {
            return this.nationalPrefixTransformRule_;
        }

        /* renamed from: j */
        public PhoneNumberDesc mo64423j() {
            return this.pager_;
        }

        /* renamed from: k */
        public PhoneNumberDesc mo64424k() {
            return this.personalNumber_;
        }

        /* renamed from: l */
        public String mo64425l() {
            return this.preferredExtnPrefix_;
        }

        /* renamed from: m */
        public PhoneNumberDesc mo64426m() {
            return this.premiumRate_;
        }

        /* renamed from: n */
        public PhoneNumberDesc mo64427n() {
            return this.sharedCost_;
        }

        /* renamed from: p */
        public PhoneNumberDesc mo64428p() {
            return this.tollFree_;
        }

        /* renamed from: q */
        public PhoneNumberDesc mo64429q() {
            return this.uan_;
        }

        /* renamed from: r */
        public PhoneNumberDesc mo64430r() {
            return this.voicemail_;
        }

        public void readExternal(ObjectInput objectInput) throws IOException {
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc = new PhoneNumberDesc();
                phoneNumberDesc.readExternal(objectInput);
                mo64388F(phoneNumberDesc);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc2 = new PhoneNumberDesc();
                phoneNumberDesc2.readExternal(objectInput);
                mo64387E(phoneNumberDesc2);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc3 = new PhoneNumberDesc();
                phoneNumberDesc3.readExternal(objectInput);
                mo64394M(phoneNumberDesc3);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc4 = new PhoneNumberDesc();
                phoneNumberDesc4.readExternal(objectInput);
                mo64412c0(phoneNumberDesc4);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc5 = new PhoneNumberDesc();
                phoneNumberDesc5.readExternal(objectInput);
                mo64404X(phoneNumberDesc5);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc6 = new PhoneNumberDesc();
                phoneNumberDesc6.readExternal(objectInput);
                mo64406Z(phoneNumberDesc6);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc7 = new PhoneNumberDesc();
                phoneNumberDesc7.readExternal(objectInput);
                mo64401U(phoneNumberDesc7);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc8 = new PhoneNumberDesc();
                phoneNumberDesc8.readExternal(objectInput);
                mo64418f0(phoneNumberDesc8);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc9 = new PhoneNumberDesc();
                phoneNumberDesc9.readExternal(objectInput);
                mo64400T(phoneNumberDesc9);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc10 = new PhoneNumberDesc();
                phoneNumberDesc10.readExternal(objectInput);
                mo64414d0(phoneNumberDesc10);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc11 = new PhoneNumberDesc();
                phoneNumberDesc11.readExternal(objectInput);
                mo64386D(phoneNumberDesc11);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc12 = new PhoneNumberDesc();
                phoneNumberDesc12.readExternal(objectInput);
                mo64416e0(phoneNumberDesc12);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc13 = new PhoneNumberDesc();
                phoneNumberDesc13.readExternal(objectInput);
                mo64408a0(phoneNumberDesc13);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc14 = new PhoneNumberDesc();
                phoneNumberDesc14.readExternal(objectInput);
                mo64410b0(phoneNumberDesc14);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc15 = new PhoneNumberDesc();
                phoneNumberDesc15.readExternal(objectInput);
                mo64384B(phoneNumberDesc15);
            }
            if (objectInput.readBoolean()) {
                PhoneNumberDesc phoneNumberDesc16 = new PhoneNumberDesc();
                phoneNumberDesc16.readExternal(objectInput);
                mo64399R(phoneNumberDesc16);
            }
            mo64389G(objectInput.readUTF());
            mo64385C(objectInput.readInt());
            mo64390H(objectInput.readUTF());
            if (objectInput.readBoolean()) {
                mo64403W(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                mo64396O(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                mo64402V(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                mo64397P(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                mo64398Q(objectInput.readUTF());
            }
            mo64405Y(objectInput.readBoolean());
            int readInt = objectInput.readInt();
            for (int i = 0; i < readInt; i++) {
                NumberFormat numberFormat = new NumberFormat();
                numberFormat.readExternal(objectInput);
                this.numberFormat_.add(numberFormat);
            }
            int readInt2 = objectInput.readInt();
            for (int i2 = 0; i2 < readInt2; i2++) {
                NumberFormat numberFormat2 = new NumberFormat();
                numberFormat2.readExternal(objectInput);
                this.intlNumberFormat_.add(numberFormat2);
            }
            mo64393L(objectInput.readBoolean());
            if (objectInput.readBoolean()) {
                mo64391I(objectInput.readUTF());
            }
            mo64392J(objectInput.readBoolean());
            mo64395N(objectInput.readBoolean());
        }

        /* renamed from: t */
        public PhoneNumberDesc mo64432t() {
            return this.voip_;
        }

        /* renamed from: u */
        public boolean mo64433u() {
            return this.hasLeadingDigits;
        }

        /* renamed from: v */
        public boolean mo64434v() {
            return this.hasPreferredExtnPrefix;
        }

        /* renamed from: w */
        public int mo64435w() {
            return this.intlNumberFormat_.size();
        }

        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeBoolean(this.hasGeneralDesc);
            if (this.hasGeneralDesc) {
                this.generalDesc_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasFixedLine);
            if (this.hasFixedLine) {
                this.fixedLine_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasMobile);
            if (this.hasMobile) {
                this.mobile_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasTollFree);
            if (this.hasTollFree) {
                this.tollFree_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasPremiumRate);
            if (this.hasPremiumRate) {
                this.premiumRate_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasSharedCost);
            if (this.hasSharedCost) {
                this.sharedCost_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasPersonalNumber);
            if (this.hasPersonalNumber) {
                this.personalNumber_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasVoip);
            if (this.hasVoip) {
                this.voip_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasPager);
            if (this.hasPager) {
                this.pager_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasUan);
            if (this.hasUan) {
                this.uan_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasEmergency);
            if (this.hasEmergency) {
                this.emergency_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasVoicemail);
            if (this.hasVoicemail) {
                this.voicemail_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasShortCode);
            if (this.hasShortCode) {
                this.shortCode_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasStandardRate);
            if (this.hasStandardRate) {
                this.standardRate_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasCarrierSpecific);
            if (this.hasCarrierSpecific) {
                this.carrierSpecific_.writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.hasNoInternationalDialling);
            if (this.hasNoInternationalDialling) {
                this.noInternationalDialling_.writeExternal(objectOutput);
            }
            objectOutput.writeUTF(this.id_);
            objectOutput.writeInt(this.countryCode_);
            objectOutput.writeUTF(this.internationalPrefix_);
            objectOutput.writeBoolean(this.hasPreferredInternationalPrefix);
            if (this.hasPreferredInternationalPrefix) {
                objectOutput.writeUTF(this.preferredInternationalPrefix_);
            }
            objectOutput.writeBoolean(this.hasNationalPrefix);
            if (this.hasNationalPrefix) {
                objectOutput.writeUTF(this.nationalPrefix_);
            }
            objectOutput.writeBoolean(this.hasPreferredExtnPrefix);
            if (this.hasPreferredExtnPrefix) {
                objectOutput.writeUTF(this.preferredExtnPrefix_);
            }
            objectOutput.writeBoolean(this.hasNationalPrefixForParsing);
            if (this.hasNationalPrefixForParsing) {
                objectOutput.writeUTF(this.nationalPrefixForParsing_);
            }
            objectOutput.writeBoolean(this.hasNationalPrefixTransformRule);
            if (this.hasNationalPrefixTransformRule) {
                objectOutput.writeUTF(this.nationalPrefixTransformRule_);
            }
            objectOutput.writeBoolean(this.sameMobileAndFixedLinePattern_);
            int z = mo64439z();
            objectOutput.writeInt(z);
            for (int i = 0; i < z; i++) {
                this.numberFormat_.get(i).writeExternal(objectOutput);
            }
            int w = mo64435w();
            objectOutput.writeInt(w);
            for (int i2 = 0; i2 < w; i2++) {
                this.intlNumberFormat_.get(i2).writeExternal(objectOutput);
            }
            objectOutput.writeBoolean(this.mainCountryForCode_);
            objectOutput.writeBoolean(this.hasLeadingDigits);
            if (this.hasLeadingDigits) {
                objectOutput.writeUTF(this.leadingDigits_);
            }
            objectOutput.writeBoolean(this.leadingZeroPossible_);
            objectOutput.writeBoolean(this.mobileNumberPortableRegion_);
        }

        /* renamed from: x */
        public List<NumberFormat> mo64437x() {
            return this.intlNumberFormat_;
        }

        /* renamed from: y */
        public boolean mo64438y() {
            return this.sameMobileAndFixedLinePattern_;
        }

        /* renamed from: z */
        public int mo64439z() {
            return this.numberFormat_.size();
        }
    }

    public static class PhoneMetadataCollection implements Externalizable {
        private static final long serialVersionUID = 1;
        private List<PhoneMetadata> metadata_ = new ArrayList();

        public static final class Builder extends PhoneMetadataCollection {
        }

        /* renamed from: a */
        public int mo64440a() {
            return this.metadata_.size();
        }

        /* renamed from: b */
        public List<PhoneMetadata> mo64441b() {
            return this.metadata_;
        }

        public void readExternal(ObjectInput objectInput) throws IOException {
            int readInt = objectInput.readInt();
            for (int i = 0; i < readInt; i++) {
                PhoneMetadata phoneMetadata = new PhoneMetadata();
                phoneMetadata.readExternal(objectInput);
                this.metadata_.add(phoneMetadata);
            }
        }

        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            int a = mo64440a();
            objectOutput.writeInt(a);
            for (int i = 0; i < a; i++) {
                this.metadata_.get(i).writeExternal(objectOutput);
            }
        }
    }

    public static class PhoneNumberDesc implements Externalizable {
        private static final long serialVersionUID = 1;
        private String exampleNumber_ = "";
        private boolean hasExampleNumber;
        private boolean hasNationalNumberPattern;
        private boolean hasPossibleNumberPattern;
        private String nationalNumberPattern_ = "";
        private List<Integer> possibleLengthLocalOnly_ = new ArrayList();
        private List<Integer> possibleLength_ = new ArrayList();
        private String possibleNumberPattern_ = "";

        public static final class Builder extends PhoneNumberDesc {
        }

        /* renamed from: a */
        public String mo64444a() {
            return this.nationalNumberPattern_;
        }

        /* renamed from: b */
        public int mo64445b() {
            return this.possibleLength_.size();
        }

        /* renamed from: c */
        public List<Integer> mo64446c() {
            return this.possibleLength_;
        }

        /* renamed from: d */
        public int mo64447d() {
            return this.possibleLengthLocalOnly_.size();
        }

        /* renamed from: e */
        public List<Integer> mo64448e() {
            return this.possibleLengthLocalOnly_;
        }

        /* renamed from: f */
        public PhoneNumberDesc mo64449f(String str) {
            this.hasExampleNumber = true;
            this.exampleNumber_ = str;
            return this;
        }

        /* renamed from: g */
        public PhoneNumberDesc mo64450g(String str) {
            this.hasNationalNumberPattern = true;
            this.nationalNumberPattern_ = str;
            return this;
        }

        /* renamed from: h */
        public PhoneNumberDesc mo64451h(String str) {
            this.hasPossibleNumberPattern = true;
            this.possibleNumberPattern_ = str;
            return this;
        }

        public void readExternal(ObjectInput objectInput) throws IOException {
            if (objectInput.readBoolean()) {
                mo64450g(objectInput.readUTF());
            }
            if (objectInput.readBoolean()) {
                mo64451h(objectInput.readUTF());
            }
            int readInt = objectInput.readInt();
            for (int i = 0; i < readInt; i++) {
                this.possibleLength_.add(Integer.valueOf(objectInput.readInt()));
            }
            int readInt2 = objectInput.readInt();
            for (int i2 = 0; i2 < readInt2; i2++) {
                this.possibleLengthLocalOnly_.add(Integer.valueOf(objectInput.readInt()));
            }
            if (objectInput.readBoolean()) {
                mo64449f(objectInput.readUTF());
            }
        }

        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeBoolean(this.hasNationalNumberPattern);
            if (this.hasNationalNumberPattern) {
                objectOutput.writeUTF(this.nationalNumberPattern_);
            }
            objectOutput.writeBoolean(this.hasPossibleNumberPattern);
            if (this.hasPossibleNumberPattern) {
                objectOutput.writeUTF(this.possibleNumberPattern_);
            }
            int b = mo64445b();
            objectOutput.writeInt(b);
            for (int i = 0; i < b; i++) {
                objectOutput.writeInt(this.possibleLength_.get(i).intValue());
            }
            int d = mo64447d();
            objectOutput.writeInt(d);
            for (int i2 = 0; i2 < d; i2++) {
                objectOutput.writeInt(this.possibleLengthLocalOnly_.get(i2).intValue());
            }
            objectOutput.writeBoolean(this.hasExampleNumber);
            if (this.hasExampleNumber) {
                objectOutput.writeUTF(this.exampleNumber_);
            }
        }
    }

    private Phonemetadata() {
    }
}
