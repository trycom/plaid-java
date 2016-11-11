package com.plaid.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Risk {
    private Reason reason;
    private Float score;

    public Reason getReason() {
        return reason;
    }

    public void setReason(Reason reason) {
        this.reason = reason;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    @JsonIgnoreProperties(ignoreUnknown=true)
    public static final class Reason {
        private Float zeroCount;
        private Float ratioLowAverage;
        private Float highRiskClassTxns;
        private Float bankTransfers;
        private Float benfordsLaw;
        private Float transactionAmounts;
        private Float additionalRiskClassTxns;
        private Float foreignFees;
        private Float fractionBankFees;

        public Float getZeroCount() {
            return zeroCount;
        }

        @JsonProperty("zero_count")
        public void setZeroCount(Float zeroCount) {
            this.zeroCount = zeroCount;
        }

        public Float getRatioLowAverage() {
            return ratioLowAverage;
        }

        @JsonProperty("ratio_low_average")
        public void setRatioLowAverage(Float ratioLowAverage) {
            this.ratioLowAverage = ratioLowAverage;
        }

        public Float getHighRiskClassTxns() {
            return highRiskClassTxns;
        }

        @JsonProperty("high_risk_class_txns")
        public void setHighRiskClassTxns(Float highRiskClassTxns) {
            this.highRiskClassTxns = highRiskClassTxns;
        }

        public Float getBankTransfers() {
            return bankTransfers;
        }

        @JsonProperty("bank_transfers")
        public void setBankTransfers(Float bankTransfers) {
            this.bankTransfers = bankTransfers;
        }

        public Float getBenfordsLaw() {
            return benfordsLaw;
        }

        @JsonProperty("benfords_law")
        public void setBenfordsLaw(Float benfordsLaw) {
            this.benfordsLaw = benfordsLaw;
        }

        public Float getTransactionAmounts() {
            return transactionAmounts;
        }

        @JsonProperty("transaction_amounts")
        public void setTransactionAmounts(Float transactionAmounts) {
            this.transactionAmounts = transactionAmounts;
        }

        public Float getAdditionalRiskClassTxns() {
            return additionalRiskClassTxns;
        }

        @JsonProperty("additional_risk_class_txns")
        public void setAdditionalRiskClassTxns(Float additionalRiskClassTxns) {
            this.additionalRiskClassTxns = additionalRiskClassTxns;
        }

        public Float getForeignFees() {
            return foreignFees;
        }

        @JsonProperty("foreign_fees")
        public void setForeignFees(Float foreignFees) {
            this.foreignFees = foreignFees;
        }

        public Float getFractionBankFees() {
            return fractionBankFees;
        }

        @JsonProperty("fraction_bank_fees")
        public void setFractionBankFees(Float fractionBankFees) {
            this.fractionBankFees = fractionBankFees;
        }
    }
}
