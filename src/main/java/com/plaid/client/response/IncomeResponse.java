package com.plaid.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown=true)
public class IncomeResponse extends AccountsResponse {

    private Income income;

    public Income getIncome() {
        return income;
    }

    public void setIncome(Income income) {
        this.income = income;
    }

    @JsonIgnoreProperties(ignoreUnknown=true)
    public static final class Income {
        private List<IncomeStream> incomeStreams;

        private Double lastYearIncome;
        private Double getLastYearIncomeBeforeTax;

        private Double projectedYearlyIncome;
        private Double projectedYearlyIncomeBeforeTax;

        private Integer maxNumberOfOverlappingIncomeStreams;
        private Integer numberOfIncomeStreams;

        public List<IncomeStream> getIncomeStreams() {
            return incomeStreams;
        }

        @JsonProperty("income_streams")
        public void setIncomeStreams(List<IncomeStream> incomeStreams) {
            this.incomeStreams = incomeStreams;
        }

        public Double getLastYearIncome() {
            return lastYearIncome;
        }

        @JsonProperty("last_year_income")
        public void setLastYearIncome(Double lastYearIncome) {
            this.lastYearIncome = lastYearIncome;
        }

        public Double getGetLastYearIncomeBeforeTax() {
            return getLastYearIncomeBeforeTax;
        }

        @JsonProperty("last_year_income_before_tax")
        public void setGetLastYearIncomeBeforeTax(Double getLastYearIncomeBeforeTax) {
            this.getLastYearIncomeBeforeTax = getLastYearIncomeBeforeTax;
        }

        public Double getProjectedYearlyIncome() {
            return projectedYearlyIncome;
        }

        @JsonProperty("projected_yearly_income")
        public void setProjectedYearlyIncome(Double projectedYearlyIncome) {
            this.projectedYearlyIncome = projectedYearlyIncome;
        }

        public Double getProjectedYearlyIncomeBeforeTax() {
            return projectedYearlyIncomeBeforeTax;
        }

        @JsonProperty("projected_yearly_income_before_tax")
        public void setProjectedYearlyIncomeBeforeTax(Double projectedYearlyIncomeBeforeTax) {
            this.projectedYearlyIncomeBeforeTax = projectedYearlyIncomeBeforeTax;
        }

        public Integer getMaxNumberOfOverlappingIncomeStreams() {
            return maxNumberOfOverlappingIncomeStreams;
        }

        @JsonProperty("max_number_of_overlapping_income_streams")
        public void setMaxNumberOfOverlappingIncomeStreams(Integer maxNumberOfOverlappingIncomeStreams) {
            this.maxNumberOfOverlappingIncomeStreams = maxNumberOfOverlappingIncomeStreams;
        }

        public Integer getNumberOfIncomeStreams() {
            return numberOfIncomeStreams;
        }

        @JsonProperty("number_of_income_streams")
        public void setNumberOfIncomeStreams(Integer numberOfIncomeStreams) {
            this.numberOfIncomeStreams = numberOfIncomeStreams;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown=true)
    public static final class IncomeStream {
        private Double monthlyIncome;
        private Double monthlyStd;
        private Float confidence;
        private Integer days;
        private String name;
        private Integer period;
        private Boolean active;

        public Integer getPeriod() {
            return period;
        }

        public void setPeriod(Integer period) {
            this.period = period;
        }

        public Boolean getActive() {
            return active;
        }

        public void setActive(Boolean active) {
            this.active = active;
        }

        public Double getMonthlyStd() {
            return monthlyStd;
        }

        @JsonProperty("monthly_std")
        public void setMonthlyStd(Double monthlyStd) {
            this.monthlyStd = monthlyStd;
        }

        public Double getMonthlyIncome() {
            return monthlyIncome;
        }

        @JsonProperty("monthly_income")
        public void setMonthlyIncome(Double monthlyIncome) {
            this.monthlyIncome = monthlyIncome;
        }

        public Float getConfidence() {
            return confidence;
        }

        public void setConfidence(Float confidence) {
            this.confidence = confidence;
        }

        public Integer getDays() {
            return days;
        }

        public void setDays(Integer days) {
            this.days = days;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
