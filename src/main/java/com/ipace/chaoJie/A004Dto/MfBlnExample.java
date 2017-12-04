package com.ipace.chaoJie.A004Dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MfBlnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MfBlnExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andBlIdIsNull() {
            addCriterion("BL_ID is null");
            return (Criteria) this;
        }

        public Criteria andBlIdIsNotNull() {
            addCriterion("BL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBlIdEqualTo(String value) {
            addCriterion("BL_ID =", value, "blId");
            return (Criteria) this;
        }

        public Criteria andBlIdNotEqualTo(String value) {
            addCriterion("BL_ID <>", value, "blId");
            return (Criteria) this;
        }

        public Criteria andBlIdGreaterThan(String value) {
            addCriterion("BL_ID >", value, "blId");
            return (Criteria) this;
        }

        public Criteria andBlIdGreaterThanOrEqualTo(String value) {
            addCriterion("BL_ID >=", value, "blId");
            return (Criteria) this;
        }

        public Criteria andBlIdLessThan(String value) {
            addCriterion("BL_ID <", value, "blId");
            return (Criteria) this;
        }

        public Criteria andBlIdLessThanOrEqualTo(String value) {
            addCriterion("BL_ID <=", value, "blId");
            return (Criteria) this;
        }

        public Criteria andBlIdLike(String value) {
            addCriterion("BL_ID like", value, "blId");
            return (Criteria) this;
        }

        public Criteria andBlIdNotLike(String value) {
            addCriterion("BL_ID not like", value, "blId");
            return (Criteria) this;
        }

        public Criteria andBlIdIn(List<String> values) {
            addCriterion("BL_ID in", values, "blId");
            return (Criteria) this;
        }

        public Criteria andBlIdNotIn(List<String> values) {
            addCriterion("BL_ID not in", values, "blId");
            return (Criteria) this;
        }

        public Criteria andBlIdBetween(String value1, String value2) {
            addCriterion("BL_ID between", value1, value2, "blId");
            return (Criteria) this;
        }

        public Criteria andBlIdNotBetween(String value1, String value2) {
            addCriterion("BL_ID not between", value1, value2, "blId");
            return (Criteria) this;
        }

        public Criteria andBlNoIsNull() {
            addCriterion("BL_NO is null");
            return (Criteria) this;
        }

        public Criteria andBlNoIsNotNull() {
            addCriterion("BL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBlNoEqualTo(String value) {
            addCriterion("BL_NO =", value, "blNo");
            return (Criteria) this;
        }

        public Criteria andBlNoNotEqualTo(String value) {
            addCriterion("BL_NO <>", value, "blNo");
            return (Criteria) this;
        }

        public Criteria andBlNoGreaterThan(String value) {
            addCriterion("BL_NO >", value, "blNo");
            return (Criteria) this;
        }

        public Criteria andBlNoGreaterThanOrEqualTo(String value) {
            addCriterion("BL_NO >=", value, "blNo");
            return (Criteria) this;
        }

        public Criteria andBlNoLessThan(String value) {
            addCriterion("BL_NO <", value, "blNo");
            return (Criteria) this;
        }

        public Criteria andBlNoLessThanOrEqualTo(String value) {
            addCriterion("BL_NO <=", value, "blNo");
            return (Criteria) this;
        }

        public Criteria andBlNoLike(String value) {
            addCriterion("BL_NO like", value, "blNo");
            return (Criteria) this;
        }

        public Criteria andBlNoNotLike(String value) {
            addCriterion("BL_NO not like", value, "blNo");
            return (Criteria) this;
        }

        public Criteria andBlNoIn(List<String> values) {
            addCriterion("BL_NO in", values, "blNo");
            return (Criteria) this;
        }

        public Criteria andBlNoNotIn(List<String> values) {
            addCriterion("BL_NO not in", values, "blNo");
            return (Criteria) this;
        }

        public Criteria andBlNoBetween(String value1, String value2) {
            addCriterion("BL_NO between", value1, value2, "blNo");
            return (Criteria) this;
        }

        public Criteria andBlNoNotBetween(String value1, String value2) {
            addCriterion("BL_NO not between", value1, value2, "blNo");
            return (Criteria) this;
        }

        public Criteria andBatNoIsNull() {
            addCriterion("BAT_NO is null");
            return (Criteria) this;
        }

        public Criteria andBatNoIsNotNull() {
            addCriterion("BAT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBatNoEqualTo(String value) {
            addCriterion("BAT_NO =", value, "batNo");
            return (Criteria) this;
        }

        public Criteria andBatNoNotEqualTo(String value) {
            addCriterion("BAT_NO <>", value, "batNo");
            return (Criteria) this;
        }

        public Criteria andBatNoGreaterThan(String value) {
            addCriterion("BAT_NO >", value, "batNo");
            return (Criteria) this;
        }

        public Criteria andBatNoGreaterThanOrEqualTo(String value) {
            addCriterion("BAT_NO >=", value, "batNo");
            return (Criteria) this;
        }

        public Criteria andBatNoLessThan(String value) {
            addCriterion("BAT_NO <", value, "batNo");
            return (Criteria) this;
        }

        public Criteria andBatNoLessThanOrEqualTo(String value) {
            addCriterion("BAT_NO <=", value, "batNo");
            return (Criteria) this;
        }

        public Criteria andBatNoLike(String value) {
            addCriterion("BAT_NO like", value, "batNo");
            return (Criteria) this;
        }

        public Criteria andBatNoNotLike(String value) {
            addCriterion("BAT_NO not like", value, "batNo");
            return (Criteria) this;
        }

        public Criteria andBatNoIn(List<String> values) {
            addCriterion("BAT_NO in", values, "batNo");
            return (Criteria) this;
        }

        public Criteria andBatNoNotIn(List<String> values) {
            addCriterion("BAT_NO not in", values, "batNo");
            return (Criteria) this;
        }

        public Criteria andBatNoBetween(String value1, String value2) {
            addCriterion("BAT_NO between", value1, value2, "batNo");
            return (Criteria) this;
        }

        public Criteria andBatNoNotBetween(String value1, String value2) {
            addCriterion("BAT_NO not between", value1, value2, "batNo");
            return (Criteria) this;
        }

        public Criteria andBlModIsNull() {
            addCriterion("BL_MOD is null");
            return (Criteria) this;
        }

        public Criteria andBlModIsNotNull() {
            addCriterion("BL_MOD is not null");
            return (Criteria) this;
        }

        public Criteria andBlModEqualTo(String value) {
            addCriterion("BL_MOD =", value, "blMod");
            return (Criteria) this;
        }

        public Criteria andBlModNotEqualTo(String value) {
            addCriterion("BL_MOD <>", value, "blMod");
            return (Criteria) this;
        }

        public Criteria andBlModGreaterThan(String value) {
            addCriterion("BL_MOD >", value, "blMod");
            return (Criteria) this;
        }

        public Criteria andBlModGreaterThanOrEqualTo(String value) {
            addCriterion("BL_MOD >=", value, "blMod");
            return (Criteria) this;
        }

        public Criteria andBlModLessThan(String value) {
            addCriterion("BL_MOD <", value, "blMod");
            return (Criteria) this;
        }

        public Criteria andBlModLessThanOrEqualTo(String value) {
            addCriterion("BL_MOD <=", value, "blMod");
            return (Criteria) this;
        }

        public Criteria andBlModLike(String value) {
            addCriterion("BL_MOD like", value, "blMod");
            return (Criteria) this;
        }

        public Criteria andBlModNotLike(String value) {
            addCriterion("BL_MOD not like", value, "blMod");
            return (Criteria) this;
        }

        public Criteria andBlModIn(List<String> values) {
            addCriterion("BL_MOD in", values, "blMod");
            return (Criteria) this;
        }

        public Criteria andBlModNotIn(List<String> values) {
            addCriterion("BL_MOD not in", values, "blMod");
            return (Criteria) this;
        }

        public Criteria andBlModBetween(String value1, String value2) {
            addCriterion("BL_MOD between", value1, value2, "blMod");
            return (Criteria) this;
        }

        public Criteria andBlModNotBetween(String value1, String value2) {
            addCriterion("BL_MOD not between", value1, value2, "blMod");
            return (Criteria) this;
        }

        public Criteria andBlUpIsNull() {
            addCriterion("BL_UP is null");
            return (Criteria) this;
        }

        public Criteria andBlUpIsNotNull() {
            addCriterion("BL_UP is not null");
            return (Criteria) this;
        }

        public Criteria andBlUpEqualTo(BigDecimal value) {
            addCriterion("BL_UP =", value, "blUp");
            return (Criteria) this;
        }

        public Criteria andBlUpNotEqualTo(BigDecimal value) {
            addCriterion("BL_UP <>", value, "blUp");
            return (Criteria) this;
        }

        public Criteria andBlUpGreaterThan(BigDecimal value) {
            addCriterion("BL_UP >", value, "blUp");
            return (Criteria) this;
        }

        public Criteria andBlUpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BL_UP >=", value, "blUp");
            return (Criteria) this;
        }

        public Criteria andBlUpLessThan(BigDecimal value) {
            addCriterion("BL_UP <", value, "blUp");
            return (Criteria) this;
        }

        public Criteria andBlUpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BL_UP <=", value, "blUp");
            return (Criteria) this;
        }

        public Criteria andBlUpIn(List<BigDecimal> values) {
            addCriterion("BL_UP in", values, "blUp");
            return (Criteria) this;
        }

        public Criteria andBlUpNotIn(List<BigDecimal> values) {
            addCriterion("BL_UP not in", values, "blUp");
            return (Criteria) this;
        }

        public Criteria andBlUpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BL_UP between", value1, value2, "blUp");
            return (Criteria) this;
        }

        public Criteria andBlUpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BL_UP not between", value1, value2, "blUp");
            return (Criteria) this;
        }

        public Criteria andAmtPledIsNull() {
            addCriterion("AMT_PLED is null");
            return (Criteria) this;
        }

        public Criteria andAmtPledIsNotNull() {
            addCriterion("AMT_PLED is not null");
            return (Criteria) this;
        }

        public Criteria andAmtPledEqualTo(BigDecimal value) {
            addCriterion("AMT_PLED =", value, "amtPled");
            return (Criteria) this;
        }

        public Criteria andAmtPledNotEqualTo(BigDecimal value) {
            addCriterion("AMT_PLED <>", value, "amtPled");
            return (Criteria) this;
        }

        public Criteria andAmtPledGreaterThan(BigDecimal value) {
            addCriterion("AMT_PLED >", value, "amtPled");
            return (Criteria) this;
        }

        public Criteria andAmtPledGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_PLED >=", value, "amtPled");
            return (Criteria) this;
        }

        public Criteria andAmtPledLessThan(BigDecimal value) {
            addCriterion("AMT_PLED <", value, "amtPled");
            return (Criteria) this;
        }

        public Criteria andAmtPledLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_PLED <=", value, "amtPled");
            return (Criteria) this;
        }

        public Criteria andAmtPledIn(List<BigDecimal> values) {
            addCriterion("AMT_PLED in", values, "amtPled");
            return (Criteria) this;
        }

        public Criteria andAmtPledNotIn(List<BigDecimal> values) {
            addCriterion("AMT_PLED not in", values, "amtPled");
            return (Criteria) this;
        }

        public Criteria andAmtPledBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_PLED between", value1, value2, "amtPled");
            return (Criteria) this;
        }

        public Criteria andAmtPledNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_PLED not between", value1, value2, "amtPled");
            return (Criteria) this;
        }

        public Criteria andAmtFineIsNull() {
            addCriterion("AMT_FINE is null");
            return (Criteria) this;
        }

        public Criteria andAmtFineIsNotNull() {
            addCriterion("AMT_FINE is not null");
            return (Criteria) this;
        }

        public Criteria andAmtFineEqualTo(BigDecimal value) {
            addCriterion("AMT_FINE =", value, "amtFine");
            return (Criteria) this;
        }

        public Criteria andAmtFineNotEqualTo(BigDecimal value) {
            addCriterion("AMT_FINE <>", value, "amtFine");
            return (Criteria) this;
        }

        public Criteria andAmtFineGreaterThan(BigDecimal value) {
            addCriterion("AMT_FINE >", value, "amtFine");
            return (Criteria) this;
        }

        public Criteria andAmtFineGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_FINE >=", value, "amtFine");
            return (Criteria) this;
        }

        public Criteria andAmtFineLessThan(BigDecimal value) {
            addCriterion("AMT_FINE <", value, "amtFine");
            return (Criteria) this;
        }

        public Criteria andAmtFineLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_FINE <=", value, "amtFine");
            return (Criteria) this;
        }

        public Criteria andAmtFineIn(List<BigDecimal> values) {
            addCriterion("AMT_FINE in", values, "amtFine");
            return (Criteria) this;
        }

        public Criteria andAmtFineNotIn(List<BigDecimal> values) {
            addCriterion("AMT_FINE not in", values, "amtFine");
            return (Criteria) this;
        }

        public Criteria andAmtFineBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_FINE between", value1, value2, "amtFine");
            return (Criteria) this;
        }

        public Criteria andAmtFineNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_FINE not between", value1, value2, "amtFine");
            return (Criteria) this;
        }

        public Criteria andAmtCpenIsNull() {
            addCriterion("AMT_CPEN is null");
            return (Criteria) this;
        }

        public Criteria andAmtCpenIsNotNull() {
            addCriterion("AMT_CPEN is not null");
            return (Criteria) this;
        }

        public Criteria andAmtCpenEqualTo(BigDecimal value) {
            addCriterion("AMT_CPEN =", value, "amtCpen");
            return (Criteria) this;
        }

        public Criteria andAmtCpenNotEqualTo(BigDecimal value) {
            addCriterion("AMT_CPEN <>", value, "amtCpen");
            return (Criteria) this;
        }

        public Criteria andAmtCpenGreaterThan(BigDecimal value) {
            addCriterion("AMT_CPEN >", value, "amtCpen");
            return (Criteria) this;
        }

        public Criteria andAmtCpenGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_CPEN >=", value, "amtCpen");
            return (Criteria) this;
        }

        public Criteria andAmtCpenLessThan(BigDecimal value) {
            addCriterion("AMT_CPEN <", value, "amtCpen");
            return (Criteria) this;
        }

        public Criteria andAmtCpenLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_CPEN <=", value, "amtCpen");
            return (Criteria) this;
        }

        public Criteria andAmtCpenIn(List<BigDecimal> values) {
            addCriterion("AMT_CPEN in", values, "amtCpen");
            return (Criteria) this;
        }

        public Criteria andAmtCpenNotIn(List<BigDecimal> values) {
            addCriterion("AMT_CPEN not in", values, "amtCpen");
            return (Criteria) this;
        }

        public Criteria andAmtCpenBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_CPEN between", value1, value2, "amtCpen");
            return (Criteria) this;
        }

        public Criteria andAmtCpenNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_CPEN not between", value1, value2, "amtCpen");
            return (Criteria) this;
        }

        public Criteria andAccPointIsNull() {
            addCriterion("ACC_POINT is null");
            return (Criteria) this;
        }

        public Criteria andAccPointIsNotNull() {
            addCriterion("ACC_POINT is not null");
            return (Criteria) this;
        }

        public Criteria andAccPointEqualTo(Short value) {
            addCriterion("ACC_POINT =", value, "accPoint");
            return (Criteria) this;
        }

        public Criteria andAccPointNotEqualTo(Short value) {
            addCriterion("ACC_POINT <>", value, "accPoint");
            return (Criteria) this;
        }

        public Criteria andAccPointGreaterThan(Short value) {
            addCriterion("ACC_POINT >", value, "accPoint");
            return (Criteria) this;
        }

        public Criteria andAccPointGreaterThanOrEqualTo(Short value) {
            addCriterion("ACC_POINT >=", value, "accPoint");
            return (Criteria) this;
        }

        public Criteria andAccPointLessThan(Short value) {
            addCriterion("ACC_POINT <", value, "accPoint");
            return (Criteria) this;
        }

        public Criteria andAccPointLessThanOrEqualTo(Short value) {
            addCriterion("ACC_POINT <=", value, "accPoint");
            return (Criteria) this;
        }

        public Criteria andAccPointIn(List<Short> values) {
            addCriterion("ACC_POINT in", values, "accPoint");
            return (Criteria) this;
        }

        public Criteria andAccPointNotIn(List<Short> values) {
            addCriterion("ACC_POINT not in", values, "accPoint");
            return (Criteria) this;
        }

        public Criteria andAccPointBetween(Short value1, Short value2) {
            addCriterion("ACC_POINT between", value1, value2, "accPoint");
            return (Criteria) this;
        }

        public Criteria andAccPointNotBetween(Short value1, Short value2) {
            addCriterion("ACC_POINT not between", value1, value2, "accPoint");
            return (Criteria) this;
        }

        public Criteria andCusNoIsNull() {
            addCriterion("CUS_NO is null");
            return (Criteria) this;
        }

        public Criteria andCusNoIsNotNull() {
            addCriterion("CUS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCusNoEqualTo(String value) {
            addCriterion("CUS_NO =", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoNotEqualTo(String value) {
            addCriterion("CUS_NO <>", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoGreaterThan(String value) {
            addCriterion("CUS_NO >", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoGreaterThanOrEqualTo(String value) {
            addCriterion("CUS_NO >=", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoLessThan(String value) {
            addCriterion("CUS_NO <", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoLessThanOrEqualTo(String value) {
            addCriterion("CUS_NO <=", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoLike(String value) {
            addCriterion("CUS_NO like", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoNotLike(String value) {
            addCriterion("CUS_NO not like", value, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoIn(List<String> values) {
            addCriterion("CUS_NO in", values, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoNotIn(List<String> values) {
            addCriterion("CUS_NO not in", values, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoBetween(String value1, String value2) {
            addCriterion("CUS_NO between", value1, value2, "cusNo");
            return (Criteria) this;
        }

        public Criteria andCusNoNotBetween(String value1, String value2) {
            addCriterion("CUS_NO not between", value1, value2, "cusNo");
            return (Criteria) this;
        }

        public Criteria andBlDdIsNull() {
            addCriterion("BL_DD is null");
            return (Criteria) this;
        }

        public Criteria andBlDdIsNotNull() {
            addCriterion("BL_DD is not null");
            return (Criteria) this;
        }

        public Criteria andBlDdEqualTo(Date value) {
            addCriterion("BL_DD =", value, "blDd");
            return (Criteria) this;
        }

        public Criteria andBlDdNotEqualTo(Date value) {
            addCriterion("BL_DD <>", value, "blDd");
            return (Criteria) this;
        }

        public Criteria andBlDdGreaterThan(Date value) {
            addCriterion("BL_DD >", value, "blDd");
            return (Criteria) this;
        }

        public Criteria andBlDdGreaterThanOrEqualTo(Date value) {
            addCriterion("BL_DD >=", value, "blDd");
            return (Criteria) this;
        }

        public Criteria andBlDdLessThan(Date value) {
            addCriterion("BL_DD <", value, "blDd");
            return (Criteria) this;
        }

        public Criteria andBlDdLessThanOrEqualTo(Date value) {
            addCriterion("BL_DD <=", value, "blDd");
            return (Criteria) this;
        }

        public Criteria andBlDdIn(List<Date> values) {
            addCriterion("BL_DD in", values, "blDd");
            return (Criteria) this;
        }

        public Criteria andBlDdNotIn(List<Date> values) {
            addCriterion("BL_DD not in", values, "blDd");
            return (Criteria) this;
        }

        public Criteria andBlDdBetween(Date value1, Date value2) {
            addCriterion("BL_DD between", value1, value2, "blDd");
            return (Criteria) this;
        }

        public Criteria andBlDdNotBetween(Date value1, Date value2) {
            addCriterion("BL_DD not between", value1, value2, "blDd");
            return (Criteria) this;
        }

        public Criteria andPayDdIsNull() {
            addCriterion("PAY_DD is null");
            return (Criteria) this;
        }

        public Criteria andPayDdIsNotNull() {
            addCriterion("PAY_DD is not null");
            return (Criteria) this;
        }

        public Criteria andPayDdEqualTo(Date value) {
            addCriterion("PAY_DD =", value, "payDd");
            return (Criteria) this;
        }

        public Criteria andPayDdNotEqualTo(Date value) {
            addCriterion("PAY_DD <>", value, "payDd");
            return (Criteria) this;
        }

        public Criteria andPayDdGreaterThan(Date value) {
            addCriterion("PAY_DD >", value, "payDd");
            return (Criteria) this;
        }

        public Criteria andPayDdGreaterThanOrEqualTo(Date value) {
            addCriterion("PAY_DD >=", value, "payDd");
            return (Criteria) this;
        }

        public Criteria andPayDdLessThan(Date value) {
            addCriterion("PAY_DD <", value, "payDd");
            return (Criteria) this;
        }

        public Criteria andPayDdLessThanOrEqualTo(Date value) {
            addCriterion("PAY_DD <=", value, "payDd");
            return (Criteria) this;
        }

        public Criteria andPayDdIn(List<Date> values) {
            addCriterion("PAY_DD in", values, "payDd");
            return (Criteria) this;
        }

        public Criteria andPayDdNotIn(List<Date> values) {
            addCriterion("PAY_DD not in", values, "payDd");
            return (Criteria) this;
        }

        public Criteria andPayDdBetween(Date value1, Date value2) {
            addCriterion("PAY_DD between", value1, value2, "payDd");
            return (Criteria) this;
        }

        public Criteria andPayDdNotBetween(Date value1, Date value2) {
            addCriterion("PAY_DD not between", value1, value2, "payDd");
            return (Criteria) this;
        }

        public Criteria andRepBlNoIsNull() {
            addCriterion("REP_BL_NO is null");
            return (Criteria) this;
        }

        public Criteria andRepBlNoIsNotNull() {
            addCriterion("REP_BL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andRepBlNoEqualTo(String value) {
            addCriterion("REP_BL_NO =", value, "repBlNo");
            return (Criteria) this;
        }

        public Criteria andRepBlNoNotEqualTo(String value) {
            addCriterion("REP_BL_NO <>", value, "repBlNo");
            return (Criteria) this;
        }

        public Criteria andRepBlNoGreaterThan(String value) {
            addCriterion("REP_BL_NO >", value, "repBlNo");
            return (Criteria) this;
        }

        public Criteria andRepBlNoGreaterThanOrEqualTo(String value) {
            addCriterion("REP_BL_NO >=", value, "repBlNo");
            return (Criteria) this;
        }

        public Criteria andRepBlNoLessThan(String value) {
            addCriterion("REP_BL_NO <", value, "repBlNo");
            return (Criteria) this;
        }

        public Criteria andRepBlNoLessThanOrEqualTo(String value) {
            addCriterion("REP_BL_NO <=", value, "repBlNo");
            return (Criteria) this;
        }

        public Criteria andRepBlNoLike(String value) {
            addCriterion("REP_BL_NO like", value, "repBlNo");
            return (Criteria) this;
        }

        public Criteria andRepBlNoNotLike(String value) {
            addCriterion("REP_BL_NO not like", value, "repBlNo");
            return (Criteria) this;
        }

        public Criteria andRepBlNoIn(List<String> values) {
            addCriterion("REP_BL_NO in", values, "repBlNo");
            return (Criteria) this;
        }

        public Criteria andRepBlNoNotIn(List<String> values) {
            addCriterion("REP_BL_NO not in", values, "repBlNo");
            return (Criteria) this;
        }

        public Criteria andRepBlNoBetween(String value1, String value2) {
            addCriterion("REP_BL_NO between", value1, value2, "repBlNo");
            return (Criteria) this;
        }

        public Criteria andRepBlNoNotBetween(String value1, String value2) {
            addCriterion("REP_BL_NO not between", value1, value2, "repBlNo");
            return (Criteria) this;
        }

        public Criteria andArpNoIsNull() {
            addCriterion("ARP_NO is null");
            return (Criteria) this;
        }

        public Criteria andArpNoIsNotNull() {
            addCriterion("ARP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andArpNoEqualTo(String value) {
            addCriterion("ARP_NO =", value, "arpNo");
            return (Criteria) this;
        }

        public Criteria andArpNoNotEqualTo(String value) {
            addCriterion("ARP_NO <>", value, "arpNo");
            return (Criteria) this;
        }

        public Criteria andArpNoGreaterThan(String value) {
            addCriterion("ARP_NO >", value, "arpNo");
            return (Criteria) this;
        }

        public Criteria andArpNoGreaterThanOrEqualTo(String value) {
            addCriterion("ARP_NO >=", value, "arpNo");
            return (Criteria) this;
        }

        public Criteria andArpNoLessThan(String value) {
            addCriterion("ARP_NO <", value, "arpNo");
            return (Criteria) this;
        }

        public Criteria andArpNoLessThanOrEqualTo(String value) {
            addCriterion("ARP_NO <=", value, "arpNo");
            return (Criteria) this;
        }

        public Criteria andArpNoLike(String value) {
            addCriterion("ARP_NO like", value, "arpNo");
            return (Criteria) this;
        }

        public Criteria andArpNoNotLike(String value) {
            addCriterion("ARP_NO not like", value, "arpNo");
            return (Criteria) this;
        }

        public Criteria andArpNoIn(List<String> values) {
            addCriterion("ARP_NO in", values, "arpNo");
            return (Criteria) this;
        }

        public Criteria andArpNoNotIn(List<String> values) {
            addCriterion("ARP_NO not in", values, "arpNo");
            return (Criteria) this;
        }

        public Criteria andArpNoBetween(String value1, String value2) {
            addCriterion("ARP_NO between", value1, value2, "arpNo");
            return (Criteria) this;
        }

        public Criteria andArpNoNotBetween(String value1, String value2) {
            addCriterion("ARP_NO not between", value1, value2, "arpNo");
            return (Criteria) this;
        }

        public Criteria andVohIdIsNull() {
            addCriterion("VOH_ID is null");
            return (Criteria) this;
        }

        public Criteria andVohIdIsNotNull() {
            addCriterion("VOH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVohIdEqualTo(String value) {
            addCriterion("VOH_ID =", value, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdNotEqualTo(String value) {
            addCriterion("VOH_ID <>", value, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdGreaterThan(String value) {
            addCriterion("VOH_ID >", value, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdGreaterThanOrEqualTo(String value) {
            addCriterion("VOH_ID >=", value, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdLessThan(String value) {
            addCriterion("VOH_ID <", value, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdLessThanOrEqualTo(String value) {
            addCriterion("VOH_ID <=", value, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdLike(String value) {
            addCriterion("VOH_ID like", value, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdNotLike(String value) {
            addCriterion("VOH_ID not like", value, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdIn(List<String> values) {
            addCriterion("VOH_ID in", values, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdNotIn(List<String> values) {
            addCriterion("VOH_ID not in", values, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdBetween(String value1, String value2) {
            addCriterion("VOH_ID between", value1, value2, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohIdNotBetween(String value1, String value2) {
            addCriterion("VOH_ID not between", value1, value2, "vohId");
            return (Criteria) this;
        }

        public Criteria andVohNoIsNull() {
            addCriterion("VOH_NO is null");
            return (Criteria) this;
        }

        public Criteria andVohNoIsNotNull() {
            addCriterion("VOH_NO is not null");
            return (Criteria) this;
        }

        public Criteria andVohNoEqualTo(String value) {
            addCriterion("VOH_NO =", value, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoNotEqualTo(String value) {
            addCriterion("VOH_NO <>", value, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoGreaterThan(String value) {
            addCriterion("VOH_NO >", value, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoGreaterThanOrEqualTo(String value) {
            addCriterion("VOH_NO >=", value, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoLessThan(String value) {
            addCriterion("VOH_NO <", value, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoLessThanOrEqualTo(String value) {
            addCriterion("VOH_NO <=", value, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoLike(String value) {
            addCriterion("VOH_NO like", value, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoNotLike(String value) {
            addCriterion("VOH_NO not like", value, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoIn(List<String> values) {
            addCriterion("VOH_NO in", values, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoNotIn(List<String> values) {
            addCriterion("VOH_NO not in", values, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoBetween(String value1, String value2) {
            addCriterion("VOH_NO between", value1, value2, "vohNo");
            return (Criteria) this;
        }

        public Criteria andVohNoNotBetween(String value1, String value2) {
            addCriterion("VOH_NO not between", value1, value2, "vohNo");
            return (Criteria) this;
        }

        public Criteria andDepIsNull() {
            addCriterion("DEP is null");
            return (Criteria) this;
        }

        public Criteria andDepIsNotNull() {
            addCriterion("DEP is not null");
            return (Criteria) this;
        }

        public Criteria andDepEqualTo(String value) {
            addCriterion("DEP =", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepNotEqualTo(String value) {
            addCriterion("DEP <>", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepGreaterThan(String value) {
            addCriterion("DEP >", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepGreaterThanOrEqualTo(String value) {
            addCriterion("DEP >=", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepLessThan(String value) {
            addCriterion("DEP <", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepLessThanOrEqualTo(String value) {
            addCriterion("DEP <=", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepLike(String value) {
            addCriterion("DEP like", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepNotLike(String value) {
            addCriterion("DEP not like", value, "dep");
            return (Criteria) this;
        }

        public Criteria andDepIn(List<String> values) {
            addCriterion("DEP in", values, "dep");
            return (Criteria) this;
        }

        public Criteria andDepNotIn(List<String> values) {
            addCriterion("DEP not in", values, "dep");
            return (Criteria) this;
        }

        public Criteria andDepBetween(String value1, String value2) {
            addCriterion("DEP between", value1, value2, "dep");
            return (Criteria) this;
        }

        public Criteria andDepNotBetween(String value1, String value2) {
            addCriterion("DEP not between", value1, value2, "dep");
            return (Criteria) this;
        }

        public Criteria andInvNoIsNull() {
            addCriterion("INV_NO is null");
            return (Criteria) this;
        }

        public Criteria andInvNoIsNotNull() {
            addCriterion("INV_NO is not null");
            return (Criteria) this;
        }

        public Criteria andInvNoEqualTo(String value) {
            addCriterion("INV_NO =", value, "invNo");
            return (Criteria) this;
        }

        public Criteria andInvNoNotEqualTo(String value) {
            addCriterion("INV_NO <>", value, "invNo");
            return (Criteria) this;
        }

        public Criteria andInvNoGreaterThan(String value) {
            addCriterion("INV_NO >", value, "invNo");
            return (Criteria) this;
        }

        public Criteria andInvNoGreaterThanOrEqualTo(String value) {
            addCriterion("INV_NO >=", value, "invNo");
            return (Criteria) this;
        }

        public Criteria andInvNoLessThan(String value) {
            addCriterion("INV_NO <", value, "invNo");
            return (Criteria) this;
        }

        public Criteria andInvNoLessThanOrEqualTo(String value) {
            addCriterion("INV_NO <=", value, "invNo");
            return (Criteria) this;
        }

        public Criteria andInvNoLike(String value) {
            addCriterion("INV_NO like", value, "invNo");
            return (Criteria) this;
        }

        public Criteria andInvNoNotLike(String value) {
            addCriterion("INV_NO not like", value, "invNo");
            return (Criteria) this;
        }

        public Criteria andInvNoIn(List<String> values) {
            addCriterion("INV_NO in", values, "invNo");
            return (Criteria) this;
        }

        public Criteria andInvNoNotIn(List<String> values) {
            addCriterion("INV_NO not in", values, "invNo");
            return (Criteria) this;
        }

        public Criteria andInvNoBetween(String value1, String value2) {
            addCriterion("INV_NO between", value1, value2, "invNo");
            return (Criteria) this;
        }

        public Criteria andInvNoNotBetween(String value1, String value2) {
            addCriterion("INV_NO not between", value1, value2, "invNo");
            return (Criteria) this;
        }

        public Criteria andTradMthIsNull() {
            addCriterion("TRAD_MTH is null");
            return (Criteria) this;
        }

        public Criteria andTradMthIsNotNull() {
            addCriterion("TRAD_MTH is not null");
            return (Criteria) this;
        }

        public Criteria andTradMthEqualTo(String value) {
            addCriterion("TRAD_MTH =", value, "tradMth");
            return (Criteria) this;
        }

        public Criteria andTradMthNotEqualTo(String value) {
            addCriterion("TRAD_MTH <>", value, "tradMth");
            return (Criteria) this;
        }

        public Criteria andTradMthGreaterThan(String value) {
            addCriterion("TRAD_MTH >", value, "tradMth");
            return (Criteria) this;
        }

        public Criteria andTradMthGreaterThanOrEqualTo(String value) {
            addCriterion("TRAD_MTH >=", value, "tradMth");
            return (Criteria) this;
        }

        public Criteria andTradMthLessThan(String value) {
            addCriterion("TRAD_MTH <", value, "tradMth");
            return (Criteria) this;
        }

        public Criteria andTradMthLessThanOrEqualTo(String value) {
            addCriterion("TRAD_MTH <=", value, "tradMth");
            return (Criteria) this;
        }

        public Criteria andTradMthLike(String value) {
            addCriterion("TRAD_MTH like", value, "tradMth");
            return (Criteria) this;
        }

        public Criteria andTradMthNotLike(String value) {
            addCriterion("TRAD_MTH not like", value, "tradMth");
            return (Criteria) this;
        }

        public Criteria andTradMthIn(List<String> values) {
            addCriterion("TRAD_MTH in", values, "tradMth");
            return (Criteria) this;
        }

        public Criteria andTradMthNotIn(List<String> values) {
            addCriterion("TRAD_MTH not in", values, "tradMth");
            return (Criteria) this;
        }

        public Criteria andTradMthBetween(String value1, String value2) {
            addCriterion("TRAD_MTH between", value1, value2, "tradMth");
            return (Criteria) this;
        }

        public Criteria andTradMthNotBetween(String value1, String value2) {
            addCriterion("TRAD_MTH not between", value1, value2, "tradMth");
            return (Criteria) this;
        }

        public Criteria andBuyMthIsNull() {
            addCriterion("BUY_MTH is null");
            return (Criteria) this;
        }

        public Criteria andBuyMthIsNotNull() {
            addCriterion("BUY_MTH is not null");
            return (Criteria) this;
        }

        public Criteria andBuyMthEqualTo(String value) {
            addCriterion("BUY_MTH =", value, "buyMth");
            return (Criteria) this;
        }

        public Criteria andBuyMthNotEqualTo(String value) {
            addCriterion("BUY_MTH <>", value, "buyMth");
            return (Criteria) this;
        }

        public Criteria andBuyMthGreaterThan(String value) {
            addCriterion("BUY_MTH >", value, "buyMth");
            return (Criteria) this;
        }

        public Criteria andBuyMthGreaterThanOrEqualTo(String value) {
            addCriterion("BUY_MTH >=", value, "buyMth");
            return (Criteria) this;
        }

        public Criteria andBuyMthLessThan(String value) {
            addCriterion("BUY_MTH <", value, "buyMth");
            return (Criteria) this;
        }

        public Criteria andBuyMthLessThanOrEqualTo(String value) {
            addCriterion("BUY_MTH <=", value, "buyMth");
            return (Criteria) this;
        }

        public Criteria andBuyMthLike(String value) {
            addCriterion("BUY_MTH like", value, "buyMth");
            return (Criteria) this;
        }

        public Criteria andBuyMthNotLike(String value) {
            addCriterion("BUY_MTH not like", value, "buyMth");
            return (Criteria) this;
        }

        public Criteria andBuyMthIn(List<String> values) {
            addCriterion("BUY_MTH in", values, "buyMth");
            return (Criteria) this;
        }

        public Criteria andBuyMthNotIn(List<String> values) {
            addCriterion("BUY_MTH not in", values, "buyMth");
            return (Criteria) this;
        }

        public Criteria andBuyMthBetween(String value1, String value2) {
            addCriterion("BUY_MTH between", value1, value2, "buyMth");
            return (Criteria) this;
        }

        public Criteria andBuyMthNotBetween(String value1, String value2) {
            addCriterion("BUY_MTH not between", value1, value2, "buyMth");
            return (Criteria) this;
        }

        public Criteria andSendMthIsNull() {
            addCriterion("SEND_MTH is null");
            return (Criteria) this;
        }

        public Criteria andSendMthIsNotNull() {
            addCriterion("SEND_MTH is not null");
            return (Criteria) this;
        }

        public Criteria andSendMthEqualTo(String value) {
            addCriterion("SEND_MTH =", value, "sendMth");
            return (Criteria) this;
        }

        public Criteria andSendMthNotEqualTo(String value) {
            addCriterion("SEND_MTH <>", value, "sendMth");
            return (Criteria) this;
        }

        public Criteria andSendMthGreaterThan(String value) {
            addCriterion("SEND_MTH >", value, "sendMth");
            return (Criteria) this;
        }

        public Criteria andSendMthGreaterThanOrEqualTo(String value) {
            addCriterion("SEND_MTH >=", value, "sendMth");
            return (Criteria) this;
        }

        public Criteria andSendMthLessThan(String value) {
            addCriterion("SEND_MTH <", value, "sendMth");
            return (Criteria) this;
        }

        public Criteria andSendMthLessThanOrEqualTo(String value) {
            addCriterion("SEND_MTH <=", value, "sendMth");
            return (Criteria) this;
        }

        public Criteria andSendMthLike(String value) {
            addCriterion("SEND_MTH like", value, "sendMth");
            return (Criteria) this;
        }

        public Criteria andSendMthNotLike(String value) {
            addCriterion("SEND_MTH not like", value, "sendMth");
            return (Criteria) this;
        }

        public Criteria andSendMthIn(List<String> values) {
            addCriterion("SEND_MTH in", values, "sendMth");
            return (Criteria) this;
        }

        public Criteria andSendMthNotIn(List<String> values) {
            addCriterion("SEND_MTH not in", values, "sendMth");
            return (Criteria) this;
        }

        public Criteria andSendMthBetween(String value1, String value2) {
            addCriterion("SEND_MTH between", value1, value2, "sendMth");
            return (Criteria) this;
        }

        public Criteria andSendMthNotBetween(String value1, String value2) {
            addCriterion("SEND_MTH not between", value1, value2, "sendMth");
            return (Criteria) this;
        }

        public Criteria andRpNoIsNull() {
            addCriterion("RP_NO is null");
            return (Criteria) this;
        }

        public Criteria andRpNoIsNotNull() {
            addCriterion("RP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andRpNoEqualTo(String value) {
            addCriterion("RP_NO =", value, "rpNo");
            return (Criteria) this;
        }

        public Criteria andRpNoNotEqualTo(String value) {
            addCriterion("RP_NO <>", value, "rpNo");
            return (Criteria) this;
        }

        public Criteria andRpNoGreaterThan(String value) {
            addCriterion("RP_NO >", value, "rpNo");
            return (Criteria) this;
        }

        public Criteria andRpNoGreaterThanOrEqualTo(String value) {
            addCriterion("RP_NO >=", value, "rpNo");
            return (Criteria) this;
        }

        public Criteria andRpNoLessThan(String value) {
            addCriterion("RP_NO <", value, "rpNo");
            return (Criteria) this;
        }

        public Criteria andRpNoLessThanOrEqualTo(String value) {
            addCriterion("RP_NO <=", value, "rpNo");
            return (Criteria) this;
        }

        public Criteria andRpNoLike(String value) {
            addCriterion("RP_NO like", value, "rpNo");
            return (Criteria) this;
        }

        public Criteria andRpNoNotLike(String value) {
            addCriterion("RP_NO not like", value, "rpNo");
            return (Criteria) this;
        }

        public Criteria andRpNoIn(List<String> values) {
            addCriterion("RP_NO in", values, "rpNo");
            return (Criteria) this;
        }

        public Criteria andRpNoNotIn(List<String> values) {
            addCriterion("RP_NO not in", values, "rpNo");
            return (Criteria) this;
        }

        public Criteria andRpNoBetween(String value1, String value2) {
            addCriterion("RP_NO between", value1, value2, "rpNo");
            return (Criteria) this;
        }

        public Criteria andRpNoNotBetween(String value1, String value2) {
            addCriterion("RP_NO not between", value1, value2, "rpNo");
            return (Criteria) this;
        }

        public Criteria andZhangIdIsNull() {
            addCriterion("ZHANG_ID is null");
            return (Criteria) this;
        }

        public Criteria andZhangIdIsNotNull() {
            addCriterion("ZHANG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andZhangIdEqualTo(String value) {
            addCriterion("ZHANG_ID =", value, "zhangId");
            return (Criteria) this;
        }

        public Criteria andZhangIdNotEqualTo(String value) {
            addCriterion("ZHANG_ID <>", value, "zhangId");
            return (Criteria) this;
        }

        public Criteria andZhangIdGreaterThan(String value) {
            addCriterion("ZHANG_ID >", value, "zhangId");
            return (Criteria) this;
        }

        public Criteria andZhangIdGreaterThanOrEqualTo(String value) {
            addCriterion("ZHANG_ID >=", value, "zhangId");
            return (Criteria) this;
        }

        public Criteria andZhangIdLessThan(String value) {
            addCriterion("ZHANG_ID <", value, "zhangId");
            return (Criteria) this;
        }

        public Criteria andZhangIdLessThanOrEqualTo(String value) {
            addCriterion("ZHANG_ID <=", value, "zhangId");
            return (Criteria) this;
        }

        public Criteria andZhangIdLike(String value) {
            addCriterion("ZHANG_ID like", value, "zhangId");
            return (Criteria) this;
        }

        public Criteria andZhangIdNotLike(String value) {
            addCriterion("ZHANG_ID not like", value, "zhangId");
            return (Criteria) this;
        }

        public Criteria andZhangIdIn(List<String> values) {
            addCriterion("ZHANG_ID in", values, "zhangId");
            return (Criteria) this;
        }

        public Criteria andZhangIdNotIn(List<String> values) {
            addCriterion("ZHANG_ID not in", values, "zhangId");
            return (Criteria) this;
        }

        public Criteria andZhangIdBetween(String value1, String value2) {
            addCriterion("ZHANG_ID between", value1, value2, "zhangId");
            return (Criteria) this;
        }

        public Criteria andZhangIdNotBetween(String value1, String value2) {
            addCriterion("ZHANG_ID not between", value1, value2, "zhangId");
            return (Criteria) this;
        }

        public Criteria andCurIdIsNull() {
            addCriterion("CUR_ID is null");
            return (Criteria) this;
        }

        public Criteria andCurIdIsNotNull() {
            addCriterion("CUR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCurIdEqualTo(String value) {
            addCriterion("CUR_ID =", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdNotEqualTo(String value) {
            addCriterion("CUR_ID <>", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdGreaterThan(String value) {
            addCriterion("CUR_ID >", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUR_ID >=", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdLessThan(String value) {
            addCriterion("CUR_ID <", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdLessThanOrEqualTo(String value) {
            addCriterion("CUR_ID <=", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdLike(String value) {
            addCriterion("CUR_ID like", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdNotLike(String value) {
            addCriterion("CUR_ID not like", value, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdIn(List<String> values) {
            addCriterion("CUR_ID in", values, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdNotIn(List<String> values) {
            addCriterion("CUR_ID not in", values, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdBetween(String value1, String value2) {
            addCriterion("CUR_ID between", value1, value2, "curId");
            return (Criteria) this;
        }

        public Criteria andCurIdNotBetween(String value1, String value2) {
            addCriterion("CUR_ID not between", value1, value2, "curId");
            return (Criteria) this;
        }

        public Criteria andExcRtoIsNull() {
            addCriterion("EXC_RTO is null");
            return (Criteria) this;
        }

        public Criteria andExcRtoIsNotNull() {
            addCriterion("EXC_RTO is not null");
            return (Criteria) this;
        }

        public Criteria andExcRtoEqualTo(BigDecimal value) {
            addCriterion("EXC_RTO =", value, "excRto");
            return (Criteria) this;
        }

        public Criteria andExcRtoNotEqualTo(BigDecimal value) {
            addCriterion("EXC_RTO <>", value, "excRto");
            return (Criteria) this;
        }

        public Criteria andExcRtoGreaterThan(BigDecimal value) {
            addCriterion("EXC_RTO >", value, "excRto");
            return (Criteria) this;
        }

        public Criteria andExcRtoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXC_RTO >=", value, "excRto");
            return (Criteria) this;
        }

        public Criteria andExcRtoLessThan(BigDecimal value) {
            addCriterion("EXC_RTO <", value, "excRto");
            return (Criteria) this;
        }

        public Criteria andExcRtoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXC_RTO <=", value, "excRto");
            return (Criteria) this;
        }

        public Criteria andExcRtoIn(List<BigDecimal> values) {
            addCriterion("EXC_RTO in", values, "excRto");
            return (Criteria) this;
        }

        public Criteria andExcRtoNotIn(List<BigDecimal> values) {
            addCriterion("EXC_RTO not in", values, "excRto");
            return (Criteria) this;
        }

        public Criteria andExcRtoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXC_RTO between", value1, value2, "excRto");
            return (Criteria) this;
        }

        public Criteria andExcRtoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXC_RTO not between", value1, value2, "excRto");
            return (Criteria) this;
        }

        public Criteria andSalNoIsNull() {
            addCriterion("SAL_NO is null");
            return (Criteria) this;
        }

        public Criteria andSalNoIsNotNull() {
            addCriterion("SAL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSalNoEqualTo(String value) {
            addCriterion("SAL_NO =", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoNotEqualTo(String value) {
            addCriterion("SAL_NO <>", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoGreaterThan(String value) {
            addCriterion("SAL_NO >", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoGreaterThanOrEqualTo(String value) {
            addCriterion("SAL_NO >=", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoLessThan(String value) {
            addCriterion("SAL_NO <", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoLessThanOrEqualTo(String value) {
            addCriterion("SAL_NO <=", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoLike(String value) {
            addCriterion("SAL_NO like", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoNotLike(String value) {
            addCriterion("SAL_NO not like", value, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoIn(List<String> values) {
            addCriterion("SAL_NO in", values, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoNotIn(List<String> values) {
            addCriterion("SAL_NO not in", values, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoBetween(String value1, String value2) {
            addCriterion("SAL_NO between", value1, value2, "salNo");
            return (Criteria) this;
        }

        public Criteria andSalNoNotBetween(String value1, String value2) {
            addCriterion("SAL_NO not between", value1, value2, "salNo");
            return (Criteria) this;
        }

        public Criteria andBlDaysIsNull() {
            addCriterion("BL_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andBlDaysIsNotNull() {
            addCriterion("BL_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andBlDaysEqualTo(Short value) {
            addCriterion("BL_DAYS =", value, "blDays");
            return (Criteria) this;
        }

        public Criteria andBlDaysNotEqualTo(Short value) {
            addCriterion("BL_DAYS <>", value, "blDays");
            return (Criteria) this;
        }

        public Criteria andBlDaysGreaterThan(Short value) {
            addCriterion("BL_DAYS >", value, "blDays");
            return (Criteria) this;
        }

        public Criteria andBlDaysGreaterThanOrEqualTo(Short value) {
            addCriterion("BL_DAYS >=", value, "blDays");
            return (Criteria) this;
        }

        public Criteria andBlDaysLessThan(Short value) {
            addCriterion("BL_DAYS <", value, "blDays");
            return (Criteria) this;
        }

        public Criteria andBlDaysLessThanOrEqualTo(Short value) {
            addCriterion("BL_DAYS <=", value, "blDays");
            return (Criteria) this;
        }

        public Criteria andBlDaysIn(List<Short> values) {
            addCriterion("BL_DAYS in", values, "blDays");
            return (Criteria) this;
        }

        public Criteria andBlDaysNotIn(List<Short> values) {
            addCriterion("BL_DAYS not in", values, "blDays");
            return (Criteria) this;
        }

        public Criteria andBlDaysBetween(Short value1, Short value2) {
            addCriterion("BL_DAYS between", value1, value2, "blDays");
            return (Criteria) this;
        }

        public Criteria andBlDaysNotBetween(Short value1, Short value2) {
            addCriterion("BL_DAYS not between", value1, value2, "blDays");
            return (Criteria) this;
        }

        public Criteria andRtnDdIsNull() {
            addCriterion("RTN_DD is null");
            return (Criteria) this;
        }

        public Criteria andRtnDdIsNotNull() {
            addCriterion("RTN_DD is not null");
            return (Criteria) this;
        }

        public Criteria andRtnDdEqualTo(Date value) {
            addCriterion("RTN_DD =", value, "rtnDd");
            return (Criteria) this;
        }

        public Criteria andRtnDdNotEqualTo(Date value) {
            addCriterion("RTN_DD <>", value, "rtnDd");
            return (Criteria) this;
        }

        public Criteria andRtnDdGreaterThan(Date value) {
            addCriterion("RTN_DD >", value, "rtnDd");
            return (Criteria) this;
        }

        public Criteria andRtnDdGreaterThanOrEqualTo(Date value) {
            addCriterion("RTN_DD >=", value, "rtnDd");
            return (Criteria) this;
        }

        public Criteria andRtnDdLessThan(Date value) {
            addCriterion("RTN_DD <", value, "rtnDd");
            return (Criteria) this;
        }

        public Criteria andRtnDdLessThanOrEqualTo(Date value) {
            addCriterion("RTN_DD <=", value, "rtnDd");
            return (Criteria) this;
        }

        public Criteria andRtnDdIn(List<Date> values) {
            addCriterion("RTN_DD in", values, "rtnDd");
            return (Criteria) this;
        }

        public Criteria andRtnDdNotIn(List<Date> values) {
            addCriterion("RTN_DD not in", values, "rtnDd");
            return (Criteria) this;
        }

        public Criteria andRtnDdBetween(Date value1, Date value2) {
            addCriterion("RTN_DD between", value1, value2, "rtnDd");
            return (Criteria) this;
        }

        public Criteria andRtnDdNotBetween(Date value1, Date value2) {
            addCriterion("RTN_DD not between", value1, value2, "rtnDd");
            return (Criteria) this;
        }

        public Criteria andClsIdIsNull() {
            addCriterion("CLS_ID is null");
            return (Criteria) this;
        }

        public Criteria andClsIdIsNotNull() {
            addCriterion("CLS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andClsIdEqualTo(String value) {
            addCriterion("CLS_ID =", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdNotEqualTo(String value) {
            addCriterion("CLS_ID <>", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdGreaterThan(String value) {
            addCriterion("CLS_ID >", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdGreaterThanOrEqualTo(String value) {
            addCriterion("CLS_ID >=", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdLessThan(String value) {
            addCriterion("CLS_ID <", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdLessThanOrEqualTo(String value) {
            addCriterion("CLS_ID <=", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdLike(String value) {
            addCriterion("CLS_ID like", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdNotLike(String value) {
            addCriterion("CLS_ID not like", value, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdIn(List<String> values) {
            addCriterion("CLS_ID in", values, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdNotIn(List<String> values) {
            addCriterion("CLS_ID not in", values, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdBetween(String value1, String value2) {
            addCriterion("CLS_ID between", value1, value2, "clsId");
            return (Criteria) this;
        }

        public Criteria andClsIdNotBetween(String value1, String value2) {
            addCriterion("CLS_ID not between", value1, value2, "clsId");
            return (Criteria) this;
        }

        public Criteria andTaxIsNull() {
            addCriterion("TAX is null");
            return (Criteria) this;
        }

        public Criteria andTaxIsNotNull() {
            addCriterion("TAX is not null");
            return (Criteria) this;
        }

        public Criteria andTaxEqualTo(BigDecimal value) {
            addCriterion("TAX =", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotEqualTo(BigDecimal value) {
            addCriterion("TAX <>", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThan(BigDecimal value) {
            addCriterion("TAX >", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX >=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThan(BigDecimal value) {
            addCriterion("TAX <", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX <=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxIn(List<BigDecimal> values) {
            addCriterion("TAX in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotIn(List<BigDecimal> values) {
            addCriterion("TAX not in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX not between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIsNull() {
            addCriterion("AMTN_NET is null");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIsNotNull() {
            addCriterion("AMTN_NET is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnNetEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET =", value, "amtnNet");
            return (Criteria) this;
        }

        public Criteria andAmtnNetNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET <>", value, "amtnNet");
            return (Criteria) this;
        }

        public Criteria andAmtnNetGreaterThan(BigDecimal value) {
            addCriterion("AMTN_NET >", value, "amtnNet");
            return (Criteria) this;
        }

        public Criteria andAmtnNetGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET >=", value, "amtnNet");
            return (Criteria) this;
        }

        public Criteria andAmtnNetLessThan(BigDecimal value) {
            addCriterion("AMTN_NET <", value, "amtnNet");
            return (Criteria) this;
        }

        public Criteria andAmtnNetLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET <=", value, "amtnNet");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIn(List<BigDecimal> values) {
            addCriterion("AMTN_NET in", values, "amtnNet");
            return (Criteria) this;
        }

        public Criteria andAmtnNetNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_NET not in", values, "amtnNet");
            return (Criteria) this;
        }

        public Criteria andAmtnNetBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_NET between", value1, value2, "amtnNet");
            return (Criteria) this;
        }

        public Criteria andAmtnNetNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_NET not between", value1, value2, "amtnNet");
            return (Criteria) this;
        }

        public Criteria andAmtNetIsNull() {
            addCriterion("AMT_NET is null");
            return (Criteria) this;
        }

        public Criteria andAmtNetIsNotNull() {
            addCriterion("AMT_NET is not null");
            return (Criteria) this;
        }

        public Criteria andAmtNetEqualTo(BigDecimal value) {
            addCriterion("AMT_NET =", value, "amtNet");
            return (Criteria) this;
        }

        public Criteria andAmtNetNotEqualTo(BigDecimal value) {
            addCriterion("AMT_NET <>", value, "amtNet");
            return (Criteria) this;
        }

        public Criteria andAmtNetGreaterThan(BigDecimal value) {
            addCriterion("AMT_NET >", value, "amtNet");
            return (Criteria) this;
        }

        public Criteria andAmtNetGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_NET >=", value, "amtNet");
            return (Criteria) this;
        }

        public Criteria andAmtNetLessThan(BigDecimal value) {
            addCriterion("AMT_NET <", value, "amtNet");
            return (Criteria) this;
        }

        public Criteria andAmtNetLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_NET <=", value, "amtNet");
            return (Criteria) this;
        }

        public Criteria andAmtNetIn(List<BigDecimal> values) {
            addCriterion("AMT_NET in", values, "amtNet");
            return (Criteria) this;
        }

        public Criteria andAmtNetNotIn(List<BigDecimal> values) {
            addCriterion("AMT_NET not in", values, "amtNet");
            return (Criteria) this;
        }

        public Criteria andAmtNetBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_NET between", value1, value2, "amtNet");
            return (Criteria) this;
        }

        public Criteria andAmtNetNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_NET not between", value1, value2, "amtNet");
            return (Criteria) this;
        }

        public Criteria andTaxIdIsNull() {
            addCriterion("TAX_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaxIdIsNotNull() {
            addCriterion("TAX_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaxIdEqualTo(String value) {
            addCriterion("TAX_ID =", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdNotEqualTo(String value) {
            addCriterion("TAX_ID <>", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdGreaterThan(String value) {
            addCriterion("TAX_ID >", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_ID >=", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdLessThan(String value) {
            addCriterion("TAX_ID <", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdLessThanOrEqualTo(String value) {
            addCriterion("TAX_ID <=", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdLike(String value) {
            addCriterion("TAX_ID like", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdNotLike(String value) {
            addCriterion("TAX_ID not like", value, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdIn(List<String> values) {
            addCriterion("TAX_ID in", values, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdNotIn(List<String> values) {
            addCriterion("TAX_ID not in", values, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdBetween(String value1, String value2) {
            addCriterion("TAX_ID between", value1, value2, "taxId");
            return (Criteria) this;
        }

        public Criteria andTaxIdNotBetween(String value1, String value2) {
            addCriterion("TAX_ID not between", value1, value2, "taxId");
            return (Criteria) this;
        }

        public Criteria andPayMthIsNull() {
            addCriterion("PAY_MTH is null");
            return (Criteria) this;
        }

        public Criteria andPayMthIsNotNull() {
            addCriterion("PAY_MTH is not null");
            return (Criteria) this;
        }

        public Criteria andPayMthEqualTo(String value) {
            addCriterion("PAY_MTH =", value, "payMth");
            return (Criteria) this;
        }

        public Criteria andPayMthNotEqualTo(String value) {
            addCriterion("PAY_MTH <>", value, "payMth");
            return (Criteria) this;
        }

        public Criteria andPayMthGreaterThan(String value) {
            addCriterion("PAY_MTH >", value, "payMth");
            return (Criteria) this;
        }

        public Criteria andPayMthGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_MTH >=", value, "payMth");
            return (Criteria) this;
        }

        public Criteria andPayMthLessThan(String value) {
            addCriterion("PAY_MTH <", value, "payMth");
            return (Criteria) this;
        }

        public Criteria andPayMthLessThanOrEqualTo(String value) {
            addCriterion("PAY_MTH <=", value, "payMth");
            return (Criteria) this;
        }

        public Criteria andPayMthLike(String value) {
            addCriterion("PAY_MTH like", value, "payMth");
            return (Criteria) this;
        }

        public Criteria andPayMthNotLike(String value) {
            addCriterion("PAY_MTH not like", value, "payMth");
            return (Criteria) this;
        }

        public Criteria andPayMthIn(List<String> values) {
            addCriterion("PAY_MTH in", values, "payMth");
            return (Criteria) this;
        }

        public Criteria andPayMthNotIn(List<String> values) {
            addCriterion("PAY_MTH not in", values, "payMth");
            return (Criteria) this;
        }

        public Criteria andPayMthBetween(String value1, String value2) {
            addCriterion("PAY_MTH between", value1, value2, "payMth");
            return (Criteria) this;
        }

        public Criteria andPayMthNotBetween(String value1, String value2) {
            addCriterion("PAY_MTH not between", value1, value2, "payMth");
            return (Criteria) this;
        }

        public Criteria andPayDaysIsNull() {
            addCriterion("PAY_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andPayDaysIsNotNull() {
            addCriterion("PAY_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andPayDaysEqualTo(Short value) {
            addCriterion("PAY_DAYS =", value, "payDays");
            return (Criteria) this;
        }

        public Criteria andPayDaysNotEqualTo(Short value) {
            addCriterion("PAY_DAYS <>", value, "payDays");
            return (Criteria) this;
        }

        public Criteria andPayDaysGreaterThan(Short value) {
            addCriterion("PAY_DAYS >", value, "payDays");
            return (Criteria) this;
        }

        public Criteria andPayDaysGreaterThanOrEqualTo(Short value) {
            addCriterion("PAY_DAYS >=", value, "payDays");
            return (Criteria) this;
        }

        public Criteria andPayDaysLessThan(Short value) {
            addCriterion("PAY_DAYS <", value, "payDays");
            return (Criteria) this;
        }

        public Criteria andPayDaysLessThanOrEqualTo(Short value) {
            addCriterion("PAY_DAYS <=", value, "payDays");
            return (Criteria) this;
        }

        public Criteria andPayDaysIn(List<Short> values) {
            addCriterion("PAY_DAYS in", values, "payDays");
            return (Criteria) this;
        }

        public Criteria andPayDaysNotIn(List<Short> values) {
            addCriterion("PAY_DAYS not in", values, "payDays");
            return (Criteria) this;
        }

        public Criteria andPayDaysBetween(Short value1, Short value2) {
            addCriterion("PAY_DAYS between", value1, value2, "payDays");
            return (Criteria) this;
        }

        public Criteria andPayDaysNotBetween(Short value1, Short value2) {
            addCriterion("PAY_DAYS not between", value1, value2, "payDays");
            return (Criteria) this;
        }

        public Criteria andChkDaysIsNull() {
            addCriterion("CHK_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andChkDaysIsNotNull() {
            addCriterion("CHK_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andChkDaysEqualTo(Short value) {
            addCriterion("CHK_DAYS =", value, "chkDays");
            return (Criteria) this;
        }

        public Criteria andChkDaysNotEqualTo(Short value) {
            addCriterion("CHK_DAYS <>", value, "chkDays");
            return (Criteria) this;
        }

        public Criteria andChkDaysGreaterThan(Short value) {
            addCriterion("CHK_DAYS >", value, "chkDays");
            return (Criteria) this;
        }

        public Criteria andChkDaysGreaterThanOrEqualTo(Short value) {
            addCriterion("CHK_DAYS >=", value, "chkDays");
            return (Criteria) this;
        }

        public Criteria andChkDaysLessThan(Short value) {
            addCriterion("CHK_DAYS <", value, "chkDays");
            return (Criteria) this;
        }

        public Criteria andChkDaysLessThanOrEqualTo(Short value) {
            addCriterion("CHK_DAYS <=", value, "chkDays");
            return (Criteria) this;
        }

        public Criteria andChkDaysIn(List<Short> values) {
            addCriterion("CHK_DAYS in", values, "chkDays");
            return (Criteria) this;
        }

        public Criteria andChkDaysNotIn(List<Short> values) {
            addCriterion("CHK_DAYS not in", values, "chkDays");
            return (Criteria) this;
        }

        public Criteria andChkDaysBetween(Short value1, Short value2) {
            addCriterion("CHK_DAYS between", value1, value2, "chkDays");
            return (Criteria) this;
        }

        public Criteria andChkDaysNotBetween(Short value1, Short value2) {
            addCriterion("CHK_DAYS not between", value1, value2, "chkDays");
            return (Criteria) this;
        }

        public Criteria andPayRemIsNull() {
            addCriterion("PAY_REM is null");
            return (Criteria) this;
        }

        public Criteria andPayRemIsNotNull() {
            addCriterion("PAY_REM is not null");
            return (Criteria) this;
        }

        public Criteria andPayRemEqualTo(String value) {
            addCriterion("PAY_REM =", value, "payRem");
            return (Criteria) this;
        }

        public Criteria andPayRemNotEqualTo(String value) {
            addCriterion("PAY_REM <>", value, "payRem");
            return (Criteria) this;
        }

        public Criteria andPayRemGreaterThan(String value) {
            addCriterion("PAY_REM >", value, "payRem");
            return (Criteria) this;
        }

        public Criteria andPayRemGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_REM >=", value, "payRem");
            return (Criteria) this;
        }

        public Criteria andPayRemLessThan(String value) {
            addCriterion("PAY_REM <", value, "payRem");
            return (Criteria) this;
        }

        public Criteria andPayRemLessThanOrEqualTo(String value) {
            addCriterion("PAY_REM <=", value, "payRem");
            return (Criteria) this;
        }

        public Criteria andPayRemLike(String value) {
            addCriterion("PAY_REM like", value, "payRem");
            return (Criteria) this;
        }

        public Criteria andPayRemNotLike(String value) {
            addCriterion("PAY_REM not like", value, "payRem");
            return (Criteria) this;
        }

        public Criteria andPayRemIn(List<String> values) {
            addCriterion("PAY_REM in", values, "payRem");
            return (Criteria) this;
        }

        public Criteria andPayRemNotIn(List<String> values) {
            addCriterion("PAY_REM not in", values, "payRem");
            return (Criteria) this;
        }

        public Criteria andPayRemBetween(String value1, String value2) {
            addCriterion("PAY_REM between", value1, value2, "payRem");
            return (Criteria) this;
        }

        public Criteria andPayRemNotBetween(String value1, String value2) {
            addCriterion("PAY_REM not between", value1, value2, "payRem");
            return (Criteria) this;
        }

        public Criteria andSendWhIsNull() {
            addCriterion("SEND_WH is null");
            return (Criteria) this;
        }

        public Criteria andSendWhIsNotNull() {
            addCriterion("SEND_WH is not null");
            return (Criteria) this;
        }

        public Criteria andSendWhEqualTo(String value) {
            addCriterion("SEND_WH =", value, "sendWh");
            return (Criteria) this;
        }

        public Criteria andSendWhNotEqualTo(String value) {
            addCriterion("SEND_WH <>", value, "sendWh");
            return (Criteria) this;
        }

        public Criteria andSendWhGreaterThan(String value) {
            addCriterion("SEND_WH >", value, "sendWh");
            return (Criteria) this;
        }

        public Criteria andSendWhGreaterThanOrEqualTo(String value) {
            addCriterion("SEND_WH >=", value, "sendWh");
            return (Criteria) this;
        }

        public Criteria andSendWhLessThan(String value) {
            addCriterion("SEND_WH <", value, "sendWh");
            return (Criteria) this;
        }

        public Criteria andSendWhLessThanOrEqualTo(String value) {
            addCriterion("SEND_WH <=", value, "sendWh");
            return (Criteria) this;
        }

        public Criteria andSendWhLike(String value) {
            addCriterion("SEND_WH like", value, "sendWh");
            return (Criteria) this;
        }

        public Criteria andSendWhNotLike(String value) {
            addCriterion("SEND_WH not like", value, "sendWh");
            return (Criteria) this;
        }

        public Criteria andSendWhIn(List<String> values) {
            addCriterion("SEND_WH in", values, "sendWh");
            return (Criteria) this;
        }

        public Criteria andSendWhNotIn(List<String> values) {
            addCriterion("SEND_WH not in", values, "sendWh");
            return (Criteria) this;
        }

        public Criteria andSendWhBetween(String value1, String value2) {
            addCriterion("SEND_WH between", value1, value2, "sendWh");
            return (Criteria) this;
        }

        public Criteria andSendWhNotBetween(String value1, String value2) {
            addCriterion("SEND_WH not between", value1, value2, "sendWh");
            return (Criteria) this;
        }

        public Criteria andEndDaysIsNull() {
            addCriterion("END_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andEndDaysIsNotNull() {
            addCriterion("END_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andEndDaysEqualTo(Short value) {
            addCriterion("END_DAYS =", value, "endDays");
            return (Criteria) this;
        }

        public Criteria andEndDaysNotEqualTo(Short value) {
            addCriterion("END_DAYS <>", value, "endDays");
            return (Criteria) this;
        }

        public Criteria andEndDaysGreaterThan(Short value) {
            addCriterion("END_DAYS >", value, "endDays");
            return (Criteria) this;
        }

        public Criteria andEndDaysGreaterThanOrEqualTo(Short value) {
            addCriterion("END_DAYS >=", value, "endDays");
            return (Criteria) this;
        }

        public Criteria andEndDaysLessThan(Short value) {
            addCriterion("END_DAYS <", value, "endDays");
            return (Criteria) this;
        }

        public Criteria andEndDaysLessThanOrEqualTo(Short value) {
            addCriterion("END_DAYS <=", value, "endDays");
            return (Criteria) this;
        }

        public Criteria andEndDaysIn(List<Short> values) {
            addCriterion("END_DAYS in", values, "endDays");
            return (Criteria) this;
        }

        public Criteria andEndDaysNotIn(List<Short> values) {
            addCriterion("END_DAYS not in", values, "endDays");
            return (Criteria) this;
        }

        public Criteria andEndDaysBetween(Short value1, Short value2) {
            addCriterion("END_DAYS between", value1, value2, "endDays");
            return (Criteria) this;
        }

        public Criteria andEndDaysNotBetween(Short value1, Short value2) {
            addCriterion("END_DAYS not between", value1, value2, "endDays");
            return (Criteria) this;
        }

        public Criteria andChkDdIsNull() {
            addCriterion("CHK_DD is null");
            return (Criteria) this;
        }

        public Criteria andChkDdIsNotNull() {
            addCriterion("CHK_DD is not null");
            return (Criteria) this;
        }

        public Criteria andChkDdEqualTo(Date value) {
            addCriterion("CHK_DD =", value, "chkDd");
            return (Criteria) this;
        }

        public Criteria andChkDdNotEqualTo(Date value) {
            addCriterion("CHK_DD <>", value, "chkDd");
            return (Criteria) this;
        }

        public Criteria andChkDdGreaterThan(Date value) {
            addCriterion("CHK_DD >", value, "chkDd");
            return (Criteria) this;
        }

        public Criteria andChkDdGreaterThanOrEqualTo(Date value) {
            addCriterion("CHK_DD >=", value, "chkDd");
            return (Criteria) this;
        }

        public Criteria andChkDdLessThan(Date value) {
            addCriterion("CHK_DD <", value, "chkDd");
            return (Criteria) this;
        }

        public Criteria andChkDdLessThanOrEqualTo(Date value) {
            addCriterion("CHK_DD <=", value, "chkDd");
            return (Criteria) this;
        }

        public Criteria andChkDdIn(List<Date> values) {
            addCriterion("CHK_DD in", values, "chkDd");
            return (Criteria) this;
        }

        public Criteria andChkDdNotIn(List<Date> values) {
            addCriterion("CHK_DD not in", values, "chkDd");
            return (Criteria) this;
        }

        public Criteria andChkDdBetween(Date value1, Date value2) {
            addCriterion("CHK_DD between", value1, value2, "chkDd");
            return (Criteria) this;
        }

        public Criteria andChkDdNotBetween(Date value1, Date value2) {
            addCriterion("CHK_DD not between", value1, value2, "chkDd");
            return (Criteria) this;
        }

        public Criteria andIntDaysIsNull() {
            addCriterion("INT_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andIntDaysIsNotNull() {
            addCriterion("INT_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andIntDaysEqualTo(Short value) {
            addCriterion("INT_DAYS =", value, "intDays");
            return (Criteria) this;
        }

        public Criteria andIntDaysNotEqualTo(Short value) {
            addCriterion("INT_DAYS <>", value, "intDays");
            return (Criteria) this;
        }

        public Criteria andIntDaysGreaterThan(Short value) {
            addCriterion("INT_DAYS >", value, "intDays");
            return (Criteria) this;
        }

        public Criteria andIntDaysGreaterThanOrEqualTo(Short value) {
            addCriterion("INT_DAYS >=", value, "intDays");
            return (Criteria) this;
        }

        public Criteria andIntDaysLessThan(Short value) {
            addCriterion("INT_DAYS <", value, "intDays");
            return (Criteria) this;
        }

        public Criteria andIntDaysLessThanOrEqualTo(Short value) {
            addCriterion("INT_DAYS <=", value, "intDays");
            return (Criteria) this;
        }

        public Criteria andIntDaysIn(List<Short> values) {
            addCriterion("INT_DAYS in", values, "intDays");
            return (Criteria) this;
        }

        public Criteria andIntDaysNotIn(List<Short> values) {
            addCriterion("INT_DAYS not in", values, "intDays");
            return (Criteria) this;
        }

        public Criteria andIntDaysBetween(Short value1, Short value2) {
            addCriterion("INT_DAYS between", value1, value2, "intDays");
            return (Criteria) this;
        }

        public Criteria andIntDaysNotBetween(Short value1, Short value2) {
            addCriterion("INT_DAYS not between", value1, value2, "intDays");
            return (Criteria) this;
        }

        public Criteria andEstDdIsNull() {
            addCriterion("EST_DD is null");
            return (Criteria) this;
        }

        public Criteria andEstDdIsNotNull() {
            addCriterion("EST_DD is not null");
            return (Criteria) this;
        }

        public Criteria andEstDdEqualTo(Date value) {
            addCriterion("EST_DD =", value, "estDd");
            return (Criteria) this;
        }

        public Criteria andEstDdNotEqualTo(Date value) {
            addCriterion("EST_DD <>", value, "estDd");
            return (Criteria) this;
        }

        public Criteria andEstDdGreaterThan(Date value) {
            addCriterion("EST_DD >", value, "estDd");
            return (Criteria) this;
        }

        public Criteria andEstDdGreaterThanOrEqualTo(Date value) {
            addCriterion("EST_DD >=", value, "estDd");
            return (Criteria) this;
        }

        public Criteria andEstDdLessThan(Date value) {
            addCriterion("EST_DD <", value, "estDd");
            return (Criteria) this;
        }

        public Criteria andEstDdLessThanOrEqualTo(Date value) {
            addCriterion("EST_DD <=", value, "estDd");
            return (Criteria) this;
        }

        public Criteria andEstDdIn(List<Date> values) {
            addCriterion("EST_DD in", values, "estDd");
            return (Criteria) this;
        }

        public Criteria andEstDdNotIn(List<Date> values) {
            addCriterion("EST_DD not in", values, "estDd");
            return (Criteria) this;
        }

        public Criteria andEstDdBetween(Date value1, Date value2) {
            addCriterion("EST_DD between", value1, value2, "estDd");
            return (Criteria) this;
        }

        public Criteria andEstDdNotBetween(Date value1, Date value2) {
            addCriterion("EST_DD not between", value1, value2, "estDd");
            return (Criteria) this;
        }

        public Criteria andUsrIsNull() {
            addCriterion("USR is null");
            return (Criteria) this;
        }

        public Criteria andUsrIsNotNull() {
            addCriterion("USR is not null");
            return (Criteria) this;
        }

        public Criteria andUsrEqualTo(String value) {
            addCriterion("USR =", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrNotEqualTo(String value) {
            addCriterion("USR <>", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrGreaterThan(String value) {
            addCriterion("USR >", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrGreaterThanOrEqualTo(String value) {
            addCriterion("USR >=", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrLessThan(String value) {
            addCriterion("USR <", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrLessThanOrEqualTo(String value) {
            addCriterion("USR <=", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrLike(String value) {
            addCriterion("USR like", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrNotLike(String value) {
            addCriterion("USR not like", value, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrIn(List<String> values) {
            addCriterion("USR in", values, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrNotIn(List<String> values) {
            addCriterion("USR not in", values, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrBetween(String value1, String value2) {
            addCriterion("USR between", value1, value2, "usr");
            return (Criteria) this;
        }

        public Criteria andUsrNotBetween(String value1, String value2) {
            addCriterion("USR not between", value1, value2, "usr");
            return (Criteria) this;
        }

        public Criteria andChkManIsNull() {
            addCriterion("CHK_MAN is null");
            return (Criteria) this;
        }

        public Criteria andChkManIsNotNull() {
            addCriterion("CHK_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andChkManEqualTo(String value) {
            addCriterion("CHK_MAN =", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManNotEqualTo(String value) {
            addCriterion("CHK_MAN <>", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManGreaterThan(String value) {
            addCriterion("CHK_MAN >", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_MAN >=", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManLessThan(String value) {
            addCriterion("CHK_MAN <", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManLessThanOrEqualTo(String value) {
            addCriterion("CHK_MAN <=", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManLike(String value) {
            addCriterion("CHK_MAN like", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManNotLike(String value) {
            addCriterion("CHK_MAN not like", value, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManIn(List<String> values) {
            addCriterion("CHK_MAN in", values, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManNotIn(List<String> values) {
            addCriterion("CHK_MAN not in", values, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManBetween(String value1, String value2) {
            addCriterion("CHK_MAN between", value1, value2, "chkMan");
            return (Criteria) this;
        }

        public Criteria andChkManNotBetween(String value1, String value2) {
            addCriterion("CHK_MAN not between", value1, value2, "chkMan");
            return (Criteria) this;
        }

        public Criteria andPrtSwIsNull() {
            addCriterion("PRT_SW is null");
            return (Criteria) this;
        }

        public Criteria andPrtSwIsNotNull() {
            addCriterion("PRT_SW is not null");
            return (Criteria) this;
        }

        public Criteria andPrtSwEqualTo(String value) {
            addCriterion("PRT_SW =", value, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwNotEqualTo(String value) {
            addCriterion("PRT_SW <>", value, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwGreaterThan(String value) {
            addCriterion("PRT_SW >", value, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwGreaterThanOrEqualTo(String value) {
            addCriterion("PRT_SW >=", value, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwLessThan(String value) {
            addCriterion("PRT_SW <", value, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwLessThanOrEqualTo(String value) {
            addCriterion("PRT_SW <=", value, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwLike(String value) {
            addCriterion("PRT_SW like", value, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwNotLike(String value) {
            addCriterion("PRT_SW not like", value, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwIn(List<String> values) {
            addCriterion("PRT_SW in", values, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwNotIn(List<String> values) {
            addCriterion("PRT_SW not in", values, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwBetween(String value1, String value2) {
            addCriterion("PRT_SW between", value1, value2, "prtSw");
            return (Criteria) this;
        }

        public Criteria andPrtSwNotBetween(String value1, String value2) {
            addCriterion("PRT_SW not between", value1, value2, "prtSw");
            return (Criteria) this;
        }

        public Criteria andCpySwIsNull() {
            addCriterion("CPY_SW is null");
            return (Criteria) this;
        }

        public Criteria andCpySwIsNotNull() {
            addCriterion("CPY_SW is not null");
            return (Criteria) this;
        }

        public Criteria andCpySwEqualTo(String value) {
            addCriterion("CPY_SW =", value, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwNotEqualTo(String value) {
            addCriterion("CPY_SW <>", value, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwGreaterThan(String value) {
            addCriterion("CPY_SW >", value, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwGreaterThanOrEqualTo(String value) {
            addCriterion("CPY_SW >=", value, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwLessThan(String value) {
            addCriterion("CPY_SW <", value, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwLessThanOrEqualTo(String value) {
            addCriterion("CPY_SW <=", value, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwLike(String value) {
            addCriterion("CPY_SW like", value, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwNotLike(String value) {
            addCriterion("CPY_SW not like", value, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwIn(List<String> values) {
            addCriterion("CPY_SW in", values, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwNotIn(List<String> values) {
            addCriterion("CPY_SW not in", values, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwBetween(String value1, String value2) {
            addCriterion("CPY_SW between", value1, value2, "cpySw");
            return (Criteria) this;
        }

        public Criteria andCpySwNotBetween(String value1, String value2) {
            addCriterion("CPY_SW not between", value1, value2, "cpySw");
            return (Criteria) this;
        }

        public Criteria andBilNoIsNull() {
            addCriterion("BIL_NO is null");
            return (Criteria) this;
        }

        public Criteria andBilNoIsNotNull() {
            addCriterion("BIL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBilNoEqualTo(String value) {
            addCriterion("BIL_NO =", value, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoNotEqualTo(String value) {
            addCriterion("BIL_NO <>", value, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoGreaterThan(String value) {
            addCriterion("BIL_NO >", value, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoGreaterThanOrEqualTo(String value) {
            addCriterion("BIL_NO >=", value, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoLessThan(String value) {
            addCriterion("BIL_NO <", value, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoLessThanOrEqualTo(String value) {
            addCriterion("BIL_NO <=", value, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoLike(String value) {
            addCriterion("BIL_NO like", value, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoNotLike(String value) {
            addCriterion("BIL_NO not like", value, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoIn(List<String> values) {
            addCriterion("BIL_NO in", values, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoNotIn(List<String> values) {
            addCriterion("BIL_NO not in", values, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoBetween(String value1, String value2) {
            addCriterion("BIL_NO between", value1, value2, "bilNo");
            return (Criteria) this;
        }

        public Criteria andBilNoNotBetween(String value1, String value2) {
            addCriterion("BIL_NO not between", value1, value2, "bilNo");
            return (Criteria) this;
        }

        public Criteria andClsRemIsNull() {
            addCriterion("CLS_REM is null");
            return (Criteria) this;
        }

        public Criteria andClsRemIsNotNull() {
            addCriterion("CLS_REM is not null");
            return (Criteria) this;
        }

        public Criteria andClsRemEqualTo(String value) {
            addCriterion("CLS_REM =", value, "clsRem");
            return (Criteria) this;
        }

        public Criteria andClsRemNotEqualTo(String value) {
            addCriterion("CLS_REM <>", value, "clsRem");
            return (Criteria) this;
        }

        public Criteria andClsRemGreaterThan(String value) {
            addCriterion("CLS_REM >", value, "clsRem");
            return (Criteria) this;
        }

        public Criteria andClsRemGreaterThanOrEqualTo(String value) {
            addCriterion("CLS_REM >=", value, "clsRem");
            return (Criteria) this;
        }

        public Criteria andClsRemLessThan(String value) {
            addCriterion("CLS_REM <", value, "clsRem");
            return (Criteria) this;
        }

        public Criteria andClsRemLessThanOrEqualTo(String value) {
            addCriterion("CLS_REM <=", value, "clsRem");
            return (Criteria) this;
        }

        public Criteria andClsRemLike(String value) {
            addCriterion("CLS_REM like", value, "clsRem");
            return (Criteria) this;
        }

        public Criteria andClsRemNotLike(String value) {
            addCriterion("CLS_REM not like", value, "clsRem");
            return (Criteria) this;
        }

        public Criteria andClsRemIn(List<String> values) {
            addCriterion("CLS_REM in", values, "clsRem");
            return (Criteria) this;
        }

        public Criteria andClsRemNotIn(List<String> values) {
            addCriterion("CLS_REM not in", values, "clsRem");
            return (Criteria) this;
        }

        public Criteria andClsRemBetween(String value1, String value2) {
            addCriterion("CLS_REM between", value1, value2, "clsRem");
            return (Criteria) this;
        }

        public Criteria andClsRemNotBetween(String value1, String value2) {
            addCriterion("CLS_REM not between", value1, value2, "clsRem");
            return (Criteria) this;
        }

        public Criteria andBilIdIsNull() {
            addCriterion("BIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andBilIdIsNotNull() {
            addCriterion("BIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBilIdEqualTo(String value) {
            addCriterion("BIL_ID =", value, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdNotEqualTo(String value) {
            addCriterion("BIL_ID <>", value, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdGreaterThan(String value) {
            addCriterion("BIL_ID >", value, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdGreaterThanOrEqualTo(String value) {
            addCriterion("BIL_ID >=", value, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdLessThan(String value) {
            addCriterion("BIL_ID <", value, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdLessThanOrEqualTo(String value) {
            addCriterion("BIL_ID <=", value, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdLike(String value) {
            addCriterion("BIL_ID like", value, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdNotLike(String value) {
            addCriterion("BIL_ID not like", value, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdIn(List<String> values) {
            addCriterion("BIL_ID in", values, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdNotIn(List<String> values) {
            addCriterion("BIL_ID not in", values, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdBetween(String value1, String value2) {
            addCriterion("BIL_ID between", value1, value2, "bilId");
            return (Criteria) this;
        }

        public Criteria andBilIdNotBetween(String value1, String value2) {
            addCriterion("BIL_ID not between", value1, value2, "bilId");
            return (Criteria) this;
        }

        public Criteria andClsDateIsNull() {
            addCriterion("CLS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andClsDateIsNotNull() {
            addCriterion("CLS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andClsDateEqualTo(Date value) {
            addCriterion("CLS_DATE =", value, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateNotEqualTo(Date value) {
            addCriterion("CLS_DATE <>", value, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateGreaterThan(Date value) {
            addCriterion("CLS_DATE >", value, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CLS_DATE >=", value, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateLessThan(Date value) {
            addCriterion("CLS_DATE <", value, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateLessThanOrEqualTo(Date value) {
            addCriterion("CLS_DATE <=", value, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateIn(List<Date> values) {
            addCriterion("CLS_DATE in", values, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateNotIn(List<Date> values) {
            addCriterion("CLS_DATE not in", values, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateBetween(Date value1, Date value2) {
            addCriterion("CLS_DATE between", value1, value2, "clsDate");
            return (Criteria) this;
        }

        public Criteria andClsDateNotBetween(Date value1, Date value2) {
            addCriterion("CLS_DATE not between", value1, value2, "clsDate");
            return (Criteria) this;
        }

        public Criteria andCkClsIdIsNull() {
            addCriterion("CK_CLS_ID is null");
            return (Criteria) this;
        }

        public Criteria andCkClsIdIsNotNull() {
            addCriterion("CK_CLS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCkClsIdEqualTo(String value) {
            addCriterion("CK_CLS_ID =", value, "ckClsId");
            return (Criteria) this;
        }

        public Criteria andCkClsIdNotEqualTo(String value) {
            addCriterion("CK_CLS_ID <>", value, "ckClsId");
            return (Criteria) this;
        }

        public Criteria andCkClsIdGreaterThan(String value) {
            addCriterion("CK_CLS_ID >", value, "ckClsId");
            return (Criteria) this;
        }

        public Criteria andCkClsIdGreaterThanOrEqualTo(String value) {
            addCriterion("CK_CLS_ID >=", value, "ckClsId");
            return (Criteria) this;
        }

        public Criteria andCkClsIdLessThan(String value) {
            addCriterion("CK_CLS_ID <", value, "ckClsId");
            return (Criteria) this;
        }

        public Criteria andCkClsIdLessThanOrEqualTo(String value) {
            addCriterion("CK_CLS_ID <=", value, "ckClsId");
            return (Criteria) this;
        }

        public Criteria andCkClsIdLike(String value) {
            addCriterion("CK_CLS_ID like", value, "ckClsId");
            return (Criteria) this;
        }

        public Criteria andCkClsIdNotLike(String value) {
            addCriterion("CK_CLS_ID not like", value, "ckClsId");
            return (Criteria) this;
        }

        public Criteria andCkClsIdIn(List<String> values) {
            addCriterion("CK_CLS_ID in", values, "ckClsId");
            return (Criteria) this;
        }

        public Criteria andCkClsIdNotIn(List<String> values) {
            addCriterion("CK_CLS_ID not in", values, "ckClsId");
            return (Criteria) this;
        }

        public Criteria andCkClsIdBetween(String value1, String value2) {
            addCriterion("CK_CLS_ID between", value1, value2, "ckClsId");
            return (Criteria) this;
        }

        public Criteria andCkClsIdNotBetween(String value1, String value2) {
            addCriterion("CK_CLS_ID not between", value1, value2, "ckClsId");
            return (Criteria) this;
        }

        public Criteria andCbIdIsNull() {
            addCriterion("CB_ID is null");
            return (Criteria) this;
        }

        public Criteria andCbIdIsNotNull() {
            addCriterion("CB_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCbIdEqualTo(String value) {
            addCriterion("CB_ID =", value, "cbId");
            return (Criteria) this;
        }

        public Criteria andCbIdNotEqualTo(String value) {
            addCriterion("CB_ID <>", value, "cbId");
            return (Criteria) this;
        }

        public Criteria andCbIdGreaterThan(String value) {
            addCriterion("CB_ID >", value, "cbId");
            return (Criteria) this;
        }

        public Criteria andCbIdGreaterThanOrEqualTo(String value) {
            addCriterion("CB_ID >=", value, "cbId");
            return (Criteria) this;
        }

        public Criteria andCbIdLessThan(String value) {
            addCriterion("CB_ID <", value, "cbId");
            return (Criteria) this;
        }

        public Criteria andCbIdLessThanOrEqualTo(String value) {
            addCriterion("CB_ID <=", value, "cbId");
            return (Criteria) this;
        }

        public Criteria andCbIdLike(String value) {
            addCriterion("CB_ID like", value, "cbId");
            return (Criteria) this;
        }

        public Criteria andCbIdNotLike(String value) {
            addCriterion("CB_ID not like", value, "cbId");
            return (Criteria) this;
        }

        public Criteria andCbIdIn(List<String> values) {
            addCriterion("CB_ID in", values, "cbId");
            return (Criteria) this;
        }

        public Criteria andCbIdNotIn(List<String> values) {
            addCriterion("CB_ID not in", values, "cbId");
            return (Criteria) this;
        }

        public Criteria andCbIdBetween(String value1, String value2) {
            addCriterion("CB_ID between", value1, value2, "cbId");
            return (Criteria) this;
        }

        public Criteria andCbIdNotBetween(String value1, String value2) {
            addCriterion("CB_ID not between", value1, value2, "cbId");
            return (Criteria) this;
        }

        public Criteria andBilTypeIsNull() {
            addCriterion("BIL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBilTypeIsNotNull() {
            addCriterion("BIL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBilTypeEqualTo(String value) {
            addCriterion("BIL_TYPE =", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeNotEqualTo(String value) {
            addCriterion("BIL_TYPE <>", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeGreaterThan(String value) {
            addCriterion("BIL_TYPE >", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BIL_TYPE >=", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeLessThan(String value) {
            addCriterion("BIL_TYPE <", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeLessThanOrEqualTo(String value) {
            addCriterion("BIL_TYPE <=", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeLike(String value) {
            addCriterion("BIL_TYPE like", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeNotLike(String value) {
            addCriterion("BIL_TYPE not like", value, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeIn(List<String> values) {
            addCriterion("BIL_TYPE in", values, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeNotIn(List<String> values) {
            addCriterion("BIL_TYPE not in", values, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeBetween(String value1, String value2) {
            addCriterion("BIL_TYPE between", value1, value2, "bilType");
            return (Criteria) this;
        }

        public Criteria andBilTypeNotBetween(String value1, String value2) {
            addCriterion("BIL_TYPE not between", value1, value2, "bilType");
            return (Criteria) this;
        }

        public Criteria andCasNoIsNull() {
            addCriterion("CAS_NO is null");
            return (Criteria) this;
        }

        public Criteria andCasNoIsNotNull() {
            addCriterion("CAS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCasNoEqualTo(String value) {
            addCriterion("CAS_NO =", value, "casNo");
            return (Criteria) this;
        }

        public Criteria andCasNoNotEqualTo(String value) {
            addCriterion("CAS_NO <>", value, "casNo");
            return (Criteria) this;
        }

        public Criteria andCasNoGreaterThan(String value) {
            addCriterion("CAS_NO >", value, "casNo");
            return (Criteria) this;
        }

        public Criteria andCasNoGreaterThanOrEqualTo(String value) {
            addCriterion("CAS_NO >=", value, "casNo");
            return (Criteria) this;
        }

        public Criteria andCasNoLessThan(String value) {
            addCriterion("CAS_NO <", value, "casNo");
            return (Criteria) this;
        }

        public Criteria andCasNoLessThanOrEqualTo(String value) {
            addCriterion("CAS_NO <=", value, "casNo");
            return (Criteria) this;
        }

        public Criteria andCasNoLike(String value) {
            addCriterion("CAS_NO like", value, "casNo");
            return (Criteria) this;
        }

        public Criteria andCasNoNotLike(String value) {
            addCriterion("CAS_NO not like", value, "casNo");
            return (Criteria) this;
        }

        public Criteria andCasNoIn(List<String> values) {
            addCriterion("CAS_NO in", values, "casNo");
            return (Criteria) this;
        }

        public Criteria andCasNoNotIn(List<String> values) {
            addCriterion("CAS_NO not in", values, "casNo");
            return (Criteria) this;
        }

        public Criteria andCasNoBetween(String value1, String value2) {
            addCriterion("CAS_NO between", value1, value2, "casNo");
            return (Criteria) this;
        }

        public Criteria andCasNoNotBetween(String value1, String value2) {
            addCriterion("CAS_NO not between", value1, value2, "casNo");
            return (Criteria) this;
        }

        public Criteria andCnttNoIsNull() {
            addCriterion("CNTT_NO is null");
            return (Criteria) this;
        }

        public Criteria andCnttNoIsNotNull() {
            addCriterion("CNTT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCnttNoEqualTo(String value) {
            addCriterion("CNTT_NO =", value, "cnttNo");
            return (Criteria) this;
        }

        public Criteria andCnttNoNotEqualTo(String value) {
            addCriterion("CNTT_NO <>", value, "cnttNo");
            return (Criteria) this;
        }

        public Criteria andCnttNoGreaterThan(String value) {
            addCriterion("CNTT_NO >", value, "cnttNo");
            return (Criteria) this;
        }

        public Criteria andCnttNoGreaterThanOrEqualTo(String value) {
            addCriterion("CNTT_NO >=", value, "cnttNo");
            return (Criteria) this;
        }

        public Criteria andCnttNoLessThan(String value) {
            addCriterion("CNTT_NO <", value, "cnttNo");
            return (Criteria) this;
        }

        public Criteria andCnttNoLessThanOrEqualTo(String value) {
            addCriterion("CNTT_NO <=", value, "cnttNo");
            return (Criteria) this;
        }

        public Criteria andCnttNoLike(String value) {
            addCriterion("CNTT_NO like", value, "cnttNo");
            return (Criteria) this;
        }

        public Criteria andCnttNoNotLike(String value) {
            addCriterion("CNTT_NO not like", value, "cnttNo");
            return (Criteria) this;
        }

        public Criteria andCnttNoIn(List<String> values) {
            addCriterion("CNTT_NO in", values, "cnttNo");
            return (Criteria) this;
        }

        public Criteria andCnttNoNotIn(List<String> values) {
            addCriterion("CNTT_NO not in", values, "cnttNo");
            return (Criteria) this;
        }

        public Criteria andCnttNoBetween(String value1, String value2) {
            addCriterion("CNTT_NO between", value1, value2, "cnttNo");
            return (Criteria) this;
        }

        public Criteria andCnttNoNotBetween(String value1, String value2) {
            addCriterion("CNTT_NO not between", value1, value2, "cnttNo");
            return (Criteria) this;
        }

        public Criteria andKpIdIsNull() {
            addCriterion("KP_ID is null");
            return (Criteria) this;
        }

        public Criteria andKpIdIsNotNull() {
            addCriterion("KP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andKpIdEqualTo(String value) {
            addCriterion("KP_ID =", value, "kpId");
            return (Criteria) this;
        }

        public Criteria andKpIdNotEqualTo(String value) {
            addCriterion("KP_ID <>", value, "kpId");
            return (Criteria) this;
        }

        public Criteria andKpIdGreaterThan(String value) {
            addCriterion("KP_ID >", value, "kpId");
            return (Criteria) this;
        }

        public Criteria andKpIdGreaterThanOrEqualTo(String value) {
            addCriterion("KP_ID >=", value, "kpId");
            return (Criteria) this;
        }

        public Criteria andKpIdLessThan(String value) {
            addCriterion("KP_ID <", value, "kpId");
            return (Criteria) this;
        }

        public Criteria andKpIdLessThanOrEqualTo(String value) {
            addCriterion("KP_ID <=", value, "kpId");
            return (Criteria) this;
        }

        public Criteria andKpIdLike(String value) {
            addCriterion("KP_ID like", value, "kpId");
            return (Criteria) this;
        }

        public Criteria andKpIdNotLike(String value) {
            addCriterion("KP_ID not like", value, "kpId");
            return (Criteria) this;
        }

        public Criteria andKpIdIn(List<String> values) {
            addCriterion("KP_ID in", values, "kpId");
            return (Criteria) this;
        }

        public Criteria andKpIdNotIn(List<String> values) {
            addCriterion("KP_ID not in", values, "kpId");
            return (Criteria) this;
        }

        public Criteria andKpIdBetween(String value1, String value2) {
            addCriterion("KP_ID between", value1, value2, "kpId");
            return (Criteria) this;
        }

        public Criteria andKpIdNotBetween(String value1, String value2) {
            addCriterion("KP_ID not between", value1, value2, "kpId");
            return (Criteria) this;
        }

        public Criteria andLzClsIdIsNull() {
            addCriterion("LZ_CLS_ID is null");
            return (Criteria) this;
        }

        public Criteria andLzClsIdIsNotNull() {
            addCriterion("LZ_CLS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLzClsIdEqualTo(String value) {
            addCriterion("LZ_CLS_ID =", value, "lzClsId");
            return (Criteria) this;
        }

        public Criteria andLzClsIdNotEqualTo(String value) {
            addCriterion("LZ_CLS_ID <>", value, "lzClsId");
            return (Criteria) this;
        }

        public Criteria andLzClsIdGreaterThan(String value) {
            addCriterion("LZ_CLS_ID >", value, "lzClsId");
            return (Criteria) this;
        }

        public Criteria andLzClsIdGreaterThanOrEqualTo(String value) {
            addCriterion("LZ_CLS_ID >=", value, "lzClsId");
            return (Criteria) this;
        }

        public Criteria andLzClsIdLessThan(String value) {
            addCriterion("LZ_CLS_ID <", value, "lzClsId");
            return (Criteria) this;
        }

        public Criteria andLzClsIdLessThanOrEqualTo(String value) {
            addCriterion("LZ_CLS_ID <=", value, "lzClsId");
            return (Criteria) this;
        }

        public Criteria andLzClsIdLike(String value) {
            addCriterion("LZ_CLS_ID like", value, "lzClsId");
            return (Criteria) this;
        }

        public Criteria andLzClsIdNotLike(String value) {
            addCriterion("LZ_CLS_ID not like", value, "lzClsId");
            return (Criteria) this;
        }

        public Criteria andLzClsIdIn(List<String> values) {
            addCriterion("LZ_CLS_ID in", values, "lzClsId");
            return (Criteria) this;
        }

        public Criteria andLzClsIdNotIn(List<String> values) {
            addCriterion("LZ_CLS_ID not in", values, "lzClsId");
            return (Criteria) this;
        }

        public Criteria andLzClsIdBetween(String value1, String value2) {
            addCriterion("LZ_CLS_ID between", value1, value2, "lzClsId");
            return (Criteria) this;
        }

        public Criteria andLzClsIdNotBetween(String value1, String value2) {
            addCriterion("LZ_CLS_ID not between", value1, value2, "lzClsId");
            return (Criteria) this;
        }

        public Criteria andMobIdIsNull() {
            addCriterion("MOB_ID is null");
            return (Criteria) this;
        }

        public Criteria andMobIdIsNotNull() {
            addCriterion("MOB_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMobIdEqualTo(String value) {
            addCriterion("MOB_ID =", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdNotEqualTo(String value) {
            addCriterion("MOB_ID <>", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdGreaterThan(String value) {
            addCriterion("MOB_ID >", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdGreaterThanOrEqualTo(String value) {
            addCriterion("MOB_ID >=", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdLessThan(String value) {
            addCriterion("MOB_ID <", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdLessThanOrEqualTo(String value) {
            addCriterion("MOB_ID <=", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdLike(String value) {
            addCriterion("MOB_ID like", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdNotLike(String value) {
            addCriterion("MOB_ID not like", value, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdIn(List<String> values) {
            addCriterion("MOB_ID in", values, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdNotIn(List<String> values) {
            addCriterion("MOB_ID not in", values, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdBetween(String value1, String value2) {
            addCriterion("MOB_ID between", value1, value2, "mobId");
            return (Criteria) this;
        }

        public Criteria andMobIdNotBetween(String value1, String value2) {
            addCriterion("MOB_ID not between", value1, value2, "mobId");
            return (Criteria) this;
        }

        public Criteria andLockManIsNull() {
            addCriterion("LOCK_MAN is null");
            return (Criteria) this;
        }

        public Criteria andLockManIsNotNull() {
            addCriterion("LOCK_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andLockManEqualTo(String value) {
            addCriterion("LOCK_MAN =", value, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManNotEqualTo(String value) {
            addCriterion("LOCK_MAN <>", value, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManGreaterThan(String value) {
            addCriterion("LOCK_MAN >", value, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManGreaterThanOrEqualTo(String value) {
            addCriterion("LOCK_MAN >=", value, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManLessThan(String value) {
            addCriterion("LOCK_MAN <", value, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManLessThanOrEqualTo(String value) {
            addCriterion("LOCK_MAN <=", value, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManLike(String value) {
            addCriterion("LOCK_MAN like", value, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManNotLike(String value) {
            addCriterion("LOCK_MAN not like", value, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManIn(List<String> values) {
            addCriterion("LOCK_MAN in", values, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManNotIn(List<String> values) {
            addCriterion("LOCK_MAN not in", values, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManBetween(String value1, String value2) {
            addCriterion("LOCK_MAN between", value1, value2, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockManNotBetween(String value1, String value2) {
            addCriterion("LOCK_MAN not between", value1, value2, "lockMan");
            return (Criteria) this;
        }

        public Criteria andLockDateIsNull() {
            addCriterion("LOCK_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLockDateIsNotNull() {
            addCriterion("LOCK_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLockDateEqualTo(Date value) {
            addCriterion("LOCK_DATE =", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateNotEqualTo(Date value) {
            addCriterion("LOCK_DATE <>", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateGreaterThan(Date value) {
            addCriterion("LOCK_DATE >", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LOCK_DATE >=", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateLessThan(Date value) {
            addCriterion("LOCK_DATE <", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateLessThanOrEqualTo(Date value) {
            addCriterion("LOCK_DATE <=", value, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateIn(List<Date> values) {
            addCriterion("LOCK_DATE in", values, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateNotIn(List<Date> values) {
            addCriterion("LOCK_DATE not in", values, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateBetween(Date value1, Date value2) {
            addCriterion("LOCK_DATE between", value1, value2, "lockDate");
            return (Criteria) this;
        }

        public Criteria andLockDateNotBetween(Date value1, Date value2) {
            addCriterion("LOCK_DATE not between", value1, value2, "lockDate");
            return (Criteria) this;
        }

        public Criteria andFjNumIsNull() {
            addCriterion("FJ_NUM is null");
            return (Criteria) this;
        }

        public Criteria andFjNumIsNotNull() {
            addCriterion("FJ_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andFjNumEqualTo(Short value) {
            addCriterion("FJ_NUM =", value, "fjNum");
            return (Criteria) this;
        }

        public Criteria andFjNumNotEqualTo(Short value) {
            addCriterion("FJ_NUM <>", value, "fjNum");
            return (Criteria) this;
        }

        public Criteria andFjNumGreaterThan(Short value) {
            addCriterion("FJ_NUM >", value, "fjNum");
            return (Criteria) this;
        }

        public Criteria andFjNumGreaterThanOrEqualTo(Short value) {
            addCriterion("FJ_NUM >=", value, "fjNum");
            return (Criteria) this;
        }

        public Criteria andFjNumLessThan(Short value) {
            addCriterion("FJ_NUM <", value, "fjNum");
            return (Criteria) this;
        }

        public Criteria andFjNumLessThanOrEqualTo(Short value) {
            addCriterion("FJ_NUM <=", value, "fjNum");
            return (Criteria) this;
        }

        public Criteria andFjNumIn(List<Short> values) {
            addCriterion("FJ_NUM in", values, "fjNum");
            return (Criteria) this;
        }

        public Criteria andFjNumNotIn(List<Short> values) {
            addCriterion("FJ_NUM not in", values, "fjNum");
            return (Criteria) this;
        }

        public Criteria andFjNumBetween(Short value1, Short value2) {
            addCriterion("FJ_NUM between", value1, value2, "fjNum");
            return (Criteria) this;
        }

        public Criteria andFjNumNotBetween(Short value1, Short value2) {
            addCriterion("FJ_NUM not between", value1, value2, "fjNum");
            return (Criteria) this;
        }

        public Criteria andSysDateIsNull() {
            addCriterion("SYS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSysDateIsNotNull() {
            addCriterion("SYS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSysDateEqualTo(Date value) {
            addCriterion("SYS_DATE =", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateNotEqualTo(Date value) {
            addCriterion("SYS_DATE <>", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateGreaterThan(Date value) {
            addCriterion("SYS_DATE >", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateGreaterThanOrEqualTo(Date value) {
            addCriterion("SYS_DATE >=", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateLessThan(Date value) {
            addCriterion("SYS_DATE <", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateLessThanOrEqualTo(Date value) {
            addCriterion("SYS_DATE <=", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateIn(List<Date> values) {
            addCriterion("SYS_DATE in", values, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateNotIn(List<Date> values) {
            addCriterion("SYS_DATE not in", values, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateBetween(Date value1, Date value2) {
            addCriterion("SYS_DATE between", value1, value2, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateNotBetween(Date value1, Date value2) {
            addCriterion("SYS_DATE not between", value1, value2, "sysDate");
            return (Criteria) this;
        }

        public Criteria andInvDdIsNull() {
            addCriterion("INV_DD is null");
            return (Criteria) this;
        }

        public Criteria andInvDdIsNotNull() {
            addCriterion("INV_DD is not null");
            return (Criteria) this;
        }

        public Criteria andInvDdEqualTo(Date value) {
            addCriterion("INV_DD =", value, "invDd");
            return (Criteria) this;
        }

        public Criteria andInvDdNotEqualTo(Date value) {
            addCriterion("INV_DD <>", value, "invDd");
            return (Criteria) this;
        }

        public Criteria andInvDdGreaterThan(Date value) {
            addCriterion("INV_DD >", value, "invDd");
            return (Criteria) this;
        }

        public Criteria andInvDdGreaterThanOrEqualTo(Date value) {
            addCriterion("INV_DD >=", value, "invDd");
            return (Criteria) this;
        }

        public Criteria andInvDdLessThan(Date value) {
            addCriterion("INV_DD <", value, "invDd");
            return (Criteria) this;
        }

        public Criteria andInvDdLessThanOrEqualTo(Date value) {
            addCriterion("INV_DD <=", value, "invDd");
            return (Criteria) this;
        }

        public Criteria andInvDdIn(List<Date> values) {
            addCriterion("INV_DD in", values, "invDd");
            return (Criteria) this;
        }

        public Criteria andInvDdNotIn(List<Date> values) {
            addCriterion("INV_DD not in", values, "invDd");
            return (Criteria) this;
        }

        public Criteria andInvDdBetween(Date value1, Date value2) {
            addCriterion("INV_DD between", value1, value2, "invDd");
            return (Criteria) this;
        }

        public Criteria andInvDdNotBetween(Date value1, Date value2) {
            addCriterion("INV_DD not between", value1, value2, "invDd");
            return (Criteria) this;
        }

        public Criteria andInvYmIsNull() {
            addCriterion("INV_YM is null");
            return (Criteria) this;
        }

        public Criteria andInvYmIsNotNull() {
            addCriterion("INV_YM is not null");
            return (Criteria) this;
        }

        public Criteria andInvYmEqualTo(Integer value) {
            addCriterion("INV_YM =", value, "invYm");
            return (Criteria) this;
        }

        public Criteria andInvYmNotEqualTo(Integer value) {
            addCriterion("INV_YM <>", value, "invYm");
            return (Criteria) this;
        }

        public Criteria andInvYmGreaterThan(Integer value) {
            addCriterion("INV_YM >", value, "invYm");
            return (Criteria) this;
        }

        public Criteria andInvYmGreaterThanOrEqualTo(Integer value) {
            addCriterion("INV_YM >=", value, "invYm");
            return (Criteria) this;
        }

        public Criteria andInvYmLessThan(Integer value) {
            addCriterion("INV_YM <", value, "invYm");
            return (Criteria) this;
        }

        public Criteria andInvYmLessThanOrEqualTo(Integer value) {
            addCriterion("INV_YM <=", value, "invYm");
            return (Criteria) this;
        }

        public Criteria andInvYmIn(List<Integer> values) {
            addCriterion("INV_YM in", values, "invYm");
            return (Criteria) this;
        }

        public Criteria andInvYmNotIn(List<Integer> values) {
            addCriterion("INV_YM not in", values, "invYm");
            return (Criteria) this;
        }

        public Criteria andInvYmBetween(Integer value1, Integer value2) {
            addCriterion("INV_YM between", value1, value2, "invYm");
            return (Criteria) this;
        }

        public Criteria andInvYmNotBetween(Integer value1, Integer value2) {
            addCriterion("INV_YM not between", value1, value2, "invYm");
            return (Criteria) this;
        }

        public Criteria andTitleBuyIsNull() {
            addCriterion("TITLE_BUY is null");
            return (Criteria) this;
        }

        public Criteria andTitleBuyIsNotNull() {
            addCriterion("TITLE_BUY is not null");
            return (Criteria) this;
        }

        public Criteria andTitleBuyEqualTo(String value) {
            addCriterion("TITLE_BUY =", value, "titleBuy");
            return (Criteria) this;
        }

        public Criteria andTitleBuyNotEqualTo(String value) {
            addCriterion("TITLE_BUY <>", value, "titleBuy");
            return (Criteria) this;
        }

        public Criteria andTitleBuyGreaterThan(String value) {
            addCriterion("TITLE_BUY >", value, "titleBuy");
            return (Criteria) this;
        }

        public Criteria andTitleBuyGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE_BUY >=", value, "titleBuy");
            return (Criteria) this;
        }

        public Criteria andTitleBuyLessThan(String value) {
            addCriterion("TITLE_BUY <", value, "titleBuy");
            return (Criteria) this;
        }

        public Criteria andTitleBuyLessThanOrEqualTo(String value) {
            addCriterion("TITLE_BUY <=", value, "titleBuy");
            return (Criteria) this;
        }

        public Criteria andTitleBuyLike(String value) {
            addCriterion("TITLE_BUY like", value, "titleBuy");
            return (Criteria) this;
        }

        public Criteria andTitleBuyNotLike(String value) {
            addCriterion("TITLE_BUY not like", value, "titleBuy");
            return (Criteria) this;
        }

        public Criteria andTitleBuyIn(List<String> values) {
            addCriterion("TITLE_BUY in", values, "titleBuy");
            return (Criteria) this;
        }

        public Criteria andTitleBuyNotIn(List<String> values) {
            addCriterion("TITLE_BUY not in", values, "titleBuy");
            return (Criteria) this;
        }

        public Criteria andTitleBuyBetween(String value1, String value2) {
            addCriterion("TITLE_BUY between", value1, value2, "titleBuy");
            return (Criteria) this;
        }

        public Criteria andTitleBuyNotBetween(String value1, String value2) {
            addCriterion("TITLE_BUY not between", value1, value2, "titleBuy");
            return (Criteria) this;
        }

        public Criteria andMethIdIsNull() {
            addCriterion("METH_ID is null");
            return (Criteria) this;
        }

        public Criteria andMethIdIsNotNull() {
            addCriterion("METH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMethIdEqualTo(String value) {
            addCriterion("METH_ID =", value, "methId");
            return (Criteria) this;
        }

        public Criteria andMethIdNotEqualTo(String value) {
            addCriterion("METH_ID <>", value, "methId");
            return (Criteria) this;
        }

        public Criteria andMethIdGreaterThan(String value) {
            addCriterion("METH_ID >", value, "methId");
            return (Criteria) this;
        }

        public Criteria andMethIdGreaterThanOrEqualTo(String value) {
            addCriterion("METH_ID >=", value, "methId");
            return (Criteria) this;
        }

        public Criteria andMethIdLessThan(String value) {
            addCriterion("METH_ID <", value, "methId");
            return (Criteria) this;
        }

        public Criteria andMethIdLessThanOrEqualTo(String value) {
            addCriterion("METH_ID <=", value, "methId");
            return (Criteria) this;
        }

        public Criteria andMethIdLike(String value) {
            addCriterion("METH_ID like", value, "methId");
            return (Criteria) this;
        }

        public Criteria andMethIdNotLike(String value) {
            addCriterion("METH_ID not like", value, "methId");
            return (Criteria) this;
        }

        public Criteria andMethIdIn(List<String> values) {
            addCriterion("METH_ID in", values, "methId");
            return (Criteria) this;
        }

        public Criteria andMethIdNotIn(List<String> values) {
            addCriterion("METH_ID not in", values, "methId");
            return (Criteria) this;
        }

        public Criteria andMethIdBetween(String value1, String value2) {
            addCriterion("METH_ID between", value1, value2, "methId");
            return (Criteria) this;
        }

        public Criteria andMethIdNotBetween(String value1, String value2) {
            addCriterion("METH_ID not between", value1, value2, "methId");
            return (Criteria) this;
        }

        public Criteria andAmtInvIsNull() {
            addCriterion("AMT_INV is null");
            return (Criteria) this;
        }

        public Criteria andAmtInvIsNotNull() {
            addCriterion("AMT_INV is not null");
            return (Criteria) this;
        }

        public Criteria andAmtInvEqualTo(BigDecimal value) {
            addCriterion("AMT_INV =", value, "amtInv");
            return (Criteria) this;
        }

        public Criteria andAmtInvNotEqualTo(BigDecimal value) {
            addCriterion("AMT_INV <>", value, "amtInv");
            return (Criteria) this;
        }

        public Criteria andAmtInvGreaterThan(BigDecimal value) {
            addCriterion("AMT_INV >", value, "amtInv");
            return (Criteria) this;
        }

        public Criteria andAmtInvGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_INV >=", value, "amtInv");
            return (Criteria) this;
        }

        public Criteria andAmtInvLessThan(BigDecimal value) {
            addCriterion("AMT_INV <", value, "amtInv");
            return (Criteria) this;
        }

        public Criteria andAmtInvLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_INV <=", value, "amtInv");
            return (Criteria) this;
        }

        public Criteria andAmtInvIn(List<BigDecimal> values) {
            addCriterion("AMT_INV in", values, "amtInv");
            return (Criteria) this;
        }

        public Criteria andAmtInvNotIn(List<BigDecimal> values) {
            addCriterion("AMT_INV not in", values, "amtInv");
            return (Criteria) this;
        }

        public Criteria andAmtInvBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_INV between", value1, value2, "amtInv");
            return (Criteria) this;
        }

        public Criteria andAmtInvNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_INV not between", value1, value2, "amtInv");
            return (Criteria) this;
        }

        public Criteria andTaxInvIsNull() {
            addCriterion("TAX_INV is null");
            return (Criteria) this;
        }

        public Criteria andTaxInvIsNotNull() {
            addCriterion("TAX_INV is not null");
            return (Criteria) this;
        }

        public Criteria andTaxInvEqualTo(BigDecimal value) {
            addCriterion("TAX_INV =", value, "taxInv");
            return (Criteria) this;
        }

        public Criteria andTaxInvNotEqualTo(BigDecimal value) {
            addCriterion("TAX_INV <>", value, "taxInv");
            return (Criteria) this;
        }

        public Criteria andTaxInvGreaterThan(BigDecimal value) {
            addCriterion("TAX_INV >", value, "taxInv");
            return (Criteria) this;
        }

        public Criteria andTaxInvGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_INV >=", value, "taxInv");
            return (Criteria) this;
        }

        public Criteria andTaxInvLessThan(BigDecimal value) {
            addCriterion("TAX_INV <", value, "taxInv");
            return (Criteria) this;
        }

        public Criteria andTaxInvLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_INV <=", value, "taxInv");
            return (Criteria) this;
        }

        public Criteria andTaxInvIn(List<BigDecimal> values) {
            addCriterion("TAX_INV in", values, "taxInv");
            return (Criteria) this;
        }

        public Criteria andTaxInvNotIn(List<BigDecimal> values) {
            addCriterion("TAX_INV not in", values, "taxInv");
            return (Criteria) this;
        }

        public Criteria andTaxInvBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_INV between", value1, value2, "taxInv");
            return (Criteria) this;
        }

        public Criteria andTaxInvNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_INV not between", value1, value2, "taxInv");
            return (Criteria) this;
        }

        public Criteria andAmtClsIsNull() {
            addCriterion("AMT_CLS is null");
            return (Criteria) this;
        }

        public Criteria andAmtClsIsNotNull() {
            addCriterion("AMT_CLS is not null");
            return (Criteria) this;
        }

        public Criteria andAmtClsEqualTo(BigDecimal value) {
            addCriterion("AMT_CLS =", value, "amtCls");
            return (Criteria) this;
        }

        public Criteria andAmtClsNotEqualTo(BigDecimal value) {
            addCriterion("AMT_CLS <>", value, "amtCls");
            return (Criteria) this;
        }

        public Criteria andAmtClsGreaterThan(BigDecimal value) {
            addCriterion("AMT_CLS >", value, "amtCls");
            return (Criteria) this;
        }

        public Criteria andAmtClsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_CLS >=", value, "amtCls");
            return (Criteria) this;
        }

        public Criteria andAmtClsLessThan(BigDecimal value) {
            addCriterion("AMT_CLS <", value, "amtCls");
            return (Criteria) this;
        }

        public Criteria andAmtClsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_CLS <=", value, "amtCls");
            return (Criteria) this;
        }

        public Criteria andAmtClsIn(List<BigDecimal> values) {
            addCriterion("AMT_CLS in", values, "amtCls");
            return (Criteria) this;
        }

        public Criteria andAmtClsNotIn(List<BigDecimal> values) {
            addCriterion("AMT_CLS not in", values, "amtCls");
            return (Criteria) this;
        }

        public Criteria andAmtClsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_CLS between", value1, value2, "amtCls");
            return (Criteria) this;
        }

        public Criteria andAmtClsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_CLS not between", value1, value2, "amtCls");
            return (Criteria) this;
        }

        public Criteria andAmtnNetClsIsNull() {
            addCriterion("AMTN_NET_CLS is null");
            return (Criteria) this;
        }

        public Criteria andAmtnNetClsIsNotNull() {
            addCriterion("AMTN_NET_CLS is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnNetClsEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_CLS =", value, "amtnNetCls");
            return (Criteria) this;
        }

        public Criteria andAmtnNetClsNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_CLS <>", value, "amtnNetCls");
            return (Criteria) this;
        }

        public Criteria andAmtnNetClsGreaterThan(BigDecimal value) {
            addCriterion("AMTN_NET_CLS >", value, "amtnNetCls");
            return (Criteria) this;
        }

        public Criteria andAmtnNetClsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_CLS >=", value, "amtnNetCls");
            return (Criteria) this;
        }

        public Criteria andAmtnNetClsLessThan(BigDecimal value) {
            addCriterion("AMTN_NET_CLS <", value, "amtnNetCls");
            return (Criteria) this;
        }

        public Criteria andAmtnNetClsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_CLS <=", value, "amtnNetCls");
            return (Criteria) this;
        }

        public Criteria andAmtnNetClsIn(List<BigDecimal> values) {
            addCriterion("AMTN_NET_CLS in", values, "amtnNetCls");
            return (Criteria) this;
        }

        public Criteria andAmtnNetClsNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_NET_CLS not in", values, "amtnNetCls");
            return (Criteria) this;
        }

        public Criteria andAmtnNetClsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_NET_CLS between", value1, value2, "amtnNetCls");
            return (Criteria) this;
        }

        public Criteria andAmtnNetClsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_NET_CLS not between", value1, value2, "amtnNetCls");
            return (Criteria) this;
        }

        public Criteria andTaxClsIsNull() {
            addCriterion("TAX_CLS is null");
            return (Criteria) this;
        }

        public Criteria andTaxClsIsNotNull() {
            addCriterion("TAX_CLS is not null");
            return (Criteria) this;
        }

        public Criteria andTaxClsEqualTo(BigDecimal value) {
            addCriterion("TAX_CLS =", value, "taxCls");
            return (Criteria) this;
        }

        public Criteria andTaxClsNotEqualTo(BigDecimal value) {
            addCriterion("TAX_CLS <>", value, "taxCls");
            return (Criteria) this;
        }

        public Criteria andTaxClsGreaterThan(BigDecimal value) {
            addCriterion("TAX_CLS >", value, "taxCls");
            return (Criteria) this;
        }

        public Criteria andTaxClsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_CLS >=", value, "taxCls");
            return (Criteria) this;
        }

        public Criteria andTaxClsLessThan(BigDecimal value) {
            addCriterion("TAX_CLS <", value, "taxCls");
            return (Criteria) this;
        }

        public Criteria andTaxClsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_CLS <=", value, "taxCls");
            return (Criteria) this;
        }

        public Criteria andTaxClsIn(List<BigDecimal> values) {
            addCriterion("TAX_CLS in", values, "taxCls");
            return (Criteria) this;
        }

        public Criteria andTaxClsNotIn(List<BigDecimal> values) {
            addCriterion("TAX_CLS not in", values, "taxCls");
            return (Criteria) this;
        }

        public Criteria andTaxClsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_CLS between", value1, value2, "taxCls");
            return (Criteria) this;
        }

        public Criteria andTaxClsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_CLS not between", value1, value2, "taxCls");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Integer value) {
            addCriterion("TASK_ID =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Integer value) {
            addCriterion("TASK_ID <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Integer value) {
            addCriterion("TASK_ID >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TASK_ID >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Integer value) {
            addCriterion("TASK_ID <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Integer value) {
            addCriterion("TASK_ID <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Integer> values) {
            addCriterion("TASK_ID in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Integer> values) {
            addCriterion("TASK_ID not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Integer value1, Integer value2) {
            addCriterion("TASK_ID between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TASK_ID not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andPrtUsrIsNull() {
            addCriterion("PRT_USR is null");
            return (Criteria) this;
        }

        public Criteria andPrtUsrIsNotNull() {
            addCriterion("PRT_USR is not null");
            return (Criteria) this;
        }

        public Criteria andPrtUsrEqualTo(String value) {
            addCriterion("PRT_USR =", value, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrNotEqualTo(String value) {
            addCriterion("PRT_USR <>", value, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrGreaterThan(String value) {
            addCriterion("PRT_USR >", value, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrGreaterThanOrEqualTo(String value) {
            addCriterion("PRT_USR >=", value, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrLessThan(String value) {
            addCriterion("PRT_USR <", value, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrLessThanOrEqualTo(String value) {
            addCriterion("PRT_USR <=", value, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrLike(String value) {
            addCriterion("PRT_USR like", value, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrNotLike(String value) {
            addCriterion("PRT_USR not like", value, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrIn(List<String> values) {
            addCriterion("PRT_USR in", values, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrNotIn(List<String> values) {
            addCriterion("PRT_USR not in", values, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrBetween(String value1, String value2) {
            addCriterion("PRT_USR between", value1, value2, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andPrtUsrNotBetween(String value1, String value2) {
            addCriterion("PRT_USR not between", value1, value2, "prtUsr");
            return (Criteria) this;
        }

        public Criteria andTurnIdIsNull() {
            addCriterion("TURN_ID is null");
            return (Criteria) this;
        }

        public Criteria andTurnIdIsNotNull() {
            addCriterion("TURN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTurnIdEqualTo(String value) {
            addCriterion("TURN_ID =", value, "turnId");
            return (Criteria) this;
        }

        public Criteria andTurnIdNotEqualTo(String value) {
            addCriterion("TURN_ID <>", value, "turnId");
            return (Criteria) this;
        }

        public Criteria andTurnIdGreaterThan(String value) {
            addCriterion("TURN_ID >", value, "turnId");
            return (Criteria) this;
        }

        public Criteria andTurnIdGreaterThanOrEqualTo(String value) {
            addCriterion("TURN_ID >=", value, "turnId");
            return (Criteria) this;
        }

        public Criteria andTurnIdLessThan(String value) {
            addCriterion("TURN_ID <", value, "turnId");
            return (Criteria) this;
        }

        public Criteria andTurnIdLessThanOrEqualTo(String value) {
            addCriterion("TURN_ID <=", value, "turnId");
            return (Criteria) this;
        }

        public Criteria andTurnIdLike(String value) {
            addCriterion("TURN_ID like", value, "turnId");
            return (Criteria) this;
        }

        public Criteria andTurnIdNotLike(String value) {
            addCriterion("TURN_ID not like", value, "turnId");
            return (Criteria) this;
        }

        public Criteria andTurnIdIn(List<String> values) {
            addCriterion("TURN_ID in", values, "turnId");
            return (Criteria) this;
        }

        public Criteria andTurnIdNotIn(List<String> values) {
            addCriterion("TURN_ID not in", values, "turnId");
            return (Criteria) this;
        }

        public Criteria andTurnIdBetween(String value1, String value2) {
            addCriterion("TURN_ID between", value1, value2, "turnId");
            return (Criteria) this;
        }

        public Criteria andTurnIdNotBetween(String value1, String value2) {
            addCriterion("TURN_ID not between", value1, value2, "turnId");
            return (Criteria) this;
        }

        public Criteria andOsIdIsNull() {
            addCriterion("OS_ID is null");
            return (Criteria) this;
        }

        public Criteria andOsIdIsNotNull() {
            addCriterion("OS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOsIdEqualTo(String value) {
            addCriterion("OS_ID =", value, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdNotEqualTo(String value) {
            addCriterion("OS_ID <>", value, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdGreaterThan(String value) {
            addCriterion("OS_ID >", value, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdGreaterThanOrEqualTo(String value) {
            addCriterion("OS_ID >=", value, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdLessThan(String value) {
            addCriterion("OS_ID <", value, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdLessThanOrEqualTo(String value) {
            addCriterion("OS_ID <=", value, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdLike(String value) {
            addCriterion("OS_ID like", value, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdNotLike(String value) {
            addCriterion("OS_ID not like", value, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdIn(List<String> values) {
            addCriterion("OS_ID in", values, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdNotIn(List<String> values) {
            addCriterion("OS_ID not in", values, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdBetween(String value1, String value2) {
            addCriterion("OS_ID between", value1, value2, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdNotBetween(String value1, String value2) {
            addCriterion("OS_ID not between", value1, value2, "osId");
            return (Criteria) this;
        }

        public Criteria andOsNoIsNull() {
            addCriterion("OS_NO is null");
            return (Criteria) this;
        }

        public Criteria andOsNoIsNotNull() {
            addCriterion("OS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOsNoEqualTo(String value) {
            addCriterion("OS_NO =", value, "osNo");
            return (Criteria) this;
        }

        public Criteria andOsNoNotEqualTo(String value) {
            addCriterion("OS_NO <>", value, "osNo");
            return (Criteria) this;
        }

        public Criteria andOsNoGreaterThan(String value) {
            addCriterion("OS_NO >", value, "osNo");
            return (Criteria) this;
        }

        public Criteria andOsNoGreaterThanOrEqualTo(String value) {
            addCriterion("OS_NO >=", value, "osNo");
            return (Criteria) this;
        }

        public Criteria andOsNoLessThan(String value) {
            addCriterion("OS_NO <", value, "osNo");
            return (Criteria) this;
        }

        public Criteria andOsNoLessThanOrEqualTo(String value) {
            addCriterion("OS_NO <=", value, "osNo");
            return (Criteria) this;
        }

        public Criteria andOsNoLike(String value) {
            addCriterion("OS_NO like", value, "osNo");
            return (Criteria) this;
        }

        public Criteria andOsNoNotLike(String value) {
            addCriterion("OS_NO not like", value, "osNo");
            return (Criteria) this;
        }

        public Criteria andOsNoIn(List<String> values) {
            addCriterion("OS_NO in", values, "osNo");
            return (Criteria) this;
        }

        public Criteria andOsNoNotIn(List<String> values) {
            addCriterion("OS_NO not in", values, "osNo");
            return (Criteria) this;
        }

        public Criteria andOsNoBetween(String value1, String value2) {
            addCriterion("OS_NO between", value1, value2, "osNo");
            return (Criteria) this;
        }

        public Criteria andOsNoNotBetween(String value1, String value2) {
            addCriterion("OS_NO not between", value1, value2, "osNo");
            return (Criteria) this;
        }

        public Criteria andPoIdIsNull() {
            addCriterion("PO_ID is null");
            return (Criteria) this;
        }

        public Criteria andPoIdIsNotNull() {
            addCriterion("PO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPoIdEqualTo(String value) {
            addCriterion("PO_ID =", value, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdNotEqualTo(String value) {
            addCriterion("PO_ID <>", value, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdGreaterThan(String value) {
            addCriterion("PO_ID >", value, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdGreaterThanOrEqualTo(String value) {
            addCriterion("PO_ID >=", value, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdLessThan(String value) {
            addCriterion("PO_ID <", value, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdLessThanOrEqualTo(String value) {
            addCriterion("PO_ID <=", value, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdLike(String value) {
            addCriterion("PO_ID like", value, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdNotLike(String value) {
            addCriterion("PO_ID not like", value, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdIn(List<String> values) {
            addCriterion("PO_ID in", values, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdNotIn(List<String> values) {
            addCriterion("PO_ID not in", values, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdBetween(String value1, String value2) {
            addCriterion("PO_ID between", value1, value2, "poId");
            return (Criteria) this;
        }

        public Criteria andPoIdNotBetween(String value1, String value2) {
            addCriterion("PO_ID not between", value1, value2, "poId");
            return (Criteria) this;
        }

        public Criteria andSgIdIsNull() {
            addCriterion("SG_ID is null");
            return (Criteria) this;
        }

        public Criteria andSgIdIsNotNull() {
            addCriterion("SG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSgIdEqualTo(String value) {
            addCriterion("SG_ID =", value, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdNotEqualTo(String value) {
            addCriterion("SG_ID <>", value, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdGreaterThan(String value) {
            addCriterion("SG_ID >", value, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdGreaterThanOrEqualTo(String value) {
            addCriterion("SG_ID >=", value, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdLessThan(String value) {
            addCriterion("SG_ID <", value, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdLessThanOrEqualTo(String value) {
            addCriterion("SG_ID <=", value, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdLike(String value) {
            addCriterion("SG_ID like", value, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdNotLike(String value) {
            addCriterion("SG_ID not like", value, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdIn(List<String> values) {
            addCriterion("SG_ID in", values, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdNotIn(List<String> values) {
            addCriterion("SG_ID not in", values, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdBetween(String value1, String value2) {
            addCriterion("SG_ID between", value1, value2, "sgId");
            return (Criteria) this;
        }

        public Criteria andSgIdNotBetween(String value1, String value2) {
            addCriterion("SG_ID not between", value1, value2, "sgId");
            return (Criteria) this;
        }

        public Criteria andQtyClsIsNull() {
            addCriterion("QTY_CLS is null");
            return (Criteria) this;
        }

        public Criteria andQtyClsIsNotNull() {
            addCriterion("QTY_CLS is not null");
            return (Criteria) this;
        }

        public Criteria andQtyClsEqualTo(BigDecimal value) {
            addCriterion("QTY_CLS =", value, "qtyCls");
            return (Criteria) this;
        }

        public Criteria andQtyClsNotEqualTo(BigDecimal value) {
            addCriterion("QTY_CLS <>", value, "qtyCls");
            return (Criteria) this;
        }

        public Criteria andQtyClsGreaterThan(BigDecimal value) {
            addCriterion("QTY_CLS >", value, "qtyCls");
            return (Criteria) this;
        }

        public Criteria andQtyClsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_CLS >=", value, "qtyCls");
            return (Criteria) this;
        }

        public Criteria andQtyClsLessThan(BigDecimal value) {
            addCriterion("QTY_CLS <", value, "qtyCls");
            return (Criteria) this;
        }

        public Criteria andQtyClsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_CLS <=", value, "qtyCls");
            return (Criteria) this;
        }

        public Criteria andQtyClsIn(List<BigDecimal> values) {
            addCriterion("QTY_CLS in", values, "qtyCls");
            return (Criteria) this;
        }

        public Criteria andQtyClsNotIn(List<BigDecimal> values) {
            addCriterion("QTY_CLS not in", values, "qtyCls");
            return (Criteria) this;
        }

        public Criteria andQtyClsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_CLS between", value1, value2, "qtyCls");
            return (Criteria) this;
        }

        public Criteria andQtyClsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_CLS not between", value1, value2, "qtyCls");
            return (Criteria) this;
        }

        public Criteria andContractIsNull() {
            addCriterion("CONTRACT is null");
            return (Criteria) this;
        }

        public Criteria andContractIsNotNull() {
            addCriterion("CONTRACT is not null");
            return (Criteria) this;
        }

        public Criteria andContractEqualTo(String value) {
            addCriterion("CONTRACT =", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractNotEqualTo(String value) {
            addCriterion("CONTRACT <>", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractGreaterThan(String value) {
            addCriterion("CONTRACT >", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT >=", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractLessThan(String value) {
            addCriterion("CONTRACT <", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT <=", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractLike(String value) {
            addCriterion("CONTRACT like", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractNotLike(String value) {
            addCriterion("CONTRACT not like", value, "contract");
            return (Criteria) this;
        }

        public Criteria andContractIn(List<String> values) {
            addCriterion("CONTRACT in", values, "contract");
            return (Criteria) this;
        }

        public Criteria andContractNotIn(List<String> values) {
            addCriterion("CONTRACT not in", values, "contract");
            return (Criteria) this;
        }

        public Criteria andContractBetween(String value1, String value2) {
            addCriterion("CONTRACT between", value1, value2, "contract");
            return (Criteria) this;
        }

        public Criteria andContractNotBetween(String value1, String value2) {
            addCriterion("CONTRACT not between", value1, value2, "contract");
            return (Criteria) this;
        }

        public Criteria andCancelIdIsNull() {
            addCriterion("CANCEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andCancelIdIsNotNull() {
            addCriterion("CANCEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCancelIdEqualTo(String value) {
            addCriterion("CANCEL_ID =", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdNotEqualTo(String value) {
            addCriterion("CANCEL_ID <>", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdGreaterThan(String value) {
            addCriterion("CANCEL_ID >", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdGreaterThanOrEqualTo(String value) {
            addCriterion("CANCEL_ID >=", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdLessThan(String value) {
            addCriterion("CANCEL_ID <", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdLessThanOrEqualTo(String value) {
            addCriterion("CANCEL_ID <=", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdLike(String value) {
            addCriterion("CANCEL_ID like", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdNotLike(String value) {
            addCriterion("CANCEL_ID not like", value, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdIn(List<String> values) {
            addCriterion("CANCEL_ID in", values, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdNotIn(List<String> values) {
            addCriterion("CANCEL_ID not in", values, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdBetween(String value1, String value2) {
            addCriterion("CANCEL_ID between", value1, value2, "cancelId");
            return (Criteria) this;
        }

        public Criteria andCancelIdNotBetween(String value1, String value2) {
            addCriterion("CANCEL_ID not between", value1, value2, "cancelId");
            return (Criteria) this;
        }

        public Criteria andToMjIsNull() {
            addCriterion("TO_MJ is null");
            return (Criteria) this;
        }

        public Criteria andToMjIsNotNull() {
            addCriterion("TO_MJ is not null");
            return (Criteria) this;
        }

        public Criteria andToMjEqualTo(String value) {
            addCriterion("TO_MJ =", value, "toMj");
            return (Criteria) this;
        }

        public Criteria andToMjNotEqualTo(String value) {
            addCriterion("TO_MJ <>", value, "toMj");
            return (Criteria) this;
        }

        public Criteria andToMjGreaterThan(String value) {
            addCriterion("TO_MJ >", value, "toMj");
            return (Criteria) this;
        }

        public Criteria andToMjGreaterThanOrEqualTo(String value) {
            addCriterion("TO_MJ >=", value, "toMj");
            return (Criteria) this;
        }

        public Criteria andToMjLessThan(String value) {
            addCriterion("TO_MJ <", value, "toMj");
            return (Criteria) this;
        }

        public Criteria andToMjLessThanOrEqualTo(String value) {
            addCriterion("TO_MJ <=", value, "toMj");
            return (Criteria) this;
        }

        public Criteria andToMjLike(String value) {
            addCriterion("TO_MJ like", value, "toMj");
            return (Criteria) this;
        }

        public Criteria andToMjNotLike(String value) {
            addCriterion("TO_MJ not like", value, "toMj");
            return (Criteria) this;
        }

        public Criteria andToMjIn(List<String> values) {
            addCriterion("TO_MJ in", values, "toMj");
            return (Criteria) this;
        }

        public Criteria andToMjNotIn(List<String> values) {
            addCriterion("TO_MJ not in", values, "toMj");
            return (Criteria) this;
        }

        public Criteria andToMjBetween(String value1, String value2) {
            addCriterion("TO_MJ between", value1, value2, "toMj");
            return (Criteria) this;
        }

        public Criteria andToMjNotBetween(String value1, String value2) {
            addCriterion("TO_MJ not between", value1, value2, "toMj");
            return (Criteria) this;
        }

        public Criteria andToSbIsNull() {
            addCriterion("TO_SB is null");
            return (Criteria) this;
        }

        public Criteria andToSbIsNotNull() {
            addCriterion("TO_SB is not null");
            return (Criteria) this;
        }

        public Criteria andToSbEqualTo(String value) {
            addCriterion("TO_SB =", value, "toSb");
            return (Criteria) this;
        }

        public Criteria andToSbNotEqualTo(String value) {
            addCriterion("TO_SB <>", value, "toSb");
            return (Criteria) this;
        }

        public Criteria andToSbGreaterThan(String value) {
            addCriterion("TO_SB >", value, "toSb");
            return (Criteria) this;
        }

        public Criteria andToSbGreaterThanOrEqualTo(String value) {
            addCriterion("TO_SB >=", value, "toSb");
            return (Criteria) this;
        }

        public Criteria andToSbLessThan(String value) {
            addCriterion("TO_SB <", value, "toSb");
            return (Criteria) this;
        }

        public Criteria andToSbLessThanOrEqualTo(String value) {
            addCriterion("TO_SB <=", value, "toSb");
            return (Criteria) this;
        }

        public Criteria andToSbLike(String value) {
            addCriterion("TO_SB like", value, "toSb");
            return (Criteria) this;
        }

        public Criteria andToSbNotLike(String value) {
            addCriterion("TO_SB not like", value, "toSb");
            return (Criteria) this;
        }

        public Criteria andToSbIn(List<String> values) {
            addCriterion("TO_SB in", values, "toSb");
            return (Criteria) this;
        }

        public Criteria andToSbNotIn(List<String> values) {
            addCriterion("TO_SB not in", values, "toSb");
            return (Criteria) this;
        }

        public Criteria andToSbBetween(String value1, String value2) {
            addCriterion("TO_SB between", value1, value2, "toSb");
            return (Criteria) this;
        }

        public Criteria andToSbNotBetween(String value1, String value2) {
            addCriterion("TO_SB not between", value1, value2, "toSb");
            return (Criteria) this;
        }

        public Criteria andDisCntIsNull() {
            addCriterion("DIS_CNT is null");
            return (Criteria) this;
        }

        public Criteria andDisCntIsNotNull() {
            addCriterion("DIS_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andDisCntEqualTo(BigDecimal value) {
            addCriterion("DIS_CNT =", value, "disCnt");
            return (Criteria) this;
        }

        public Criteria andDisCntNotEqualTo(BigDecimal value) {
            addCriterion("DIS_CNT <>", value, "disCnt");
            return (Criteria) this;
        }

        public Criteria andDisCntGreaterThan(BigDecimal value) {
            addCriterion("DIS_CNT >", value, "disCnt");
            return (Criteria) this;
        }

        public Criteria andDisCntGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DIS_CNT >=", value, "disCnt");
            return (Criteria) this;
        }

        public Criteria andDisCntLessThan(BigDecimal value) {
            addCriterion("DIS_CNT <", value, "disCnt");
            return (Criteria) this;
        }

        public Criteria andDisCntLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DIS_CNT <=", value, "disCnt");
            return (Criteria) this;
        }

        public Criteria andDisCntIn(List<BigDecimal> values) {
            addCriterion("DIS_CNT in", values, "disCnt");
            return (Criteria) this;
        }

        public Criteria andDisCntNotIn(List<BigDecimal> values) {
            addCriterion("DIS_CNT not in", values, "disCnt");
            return (Criteria) this;
        }

        public Criteria andDisCntBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DIS_CNT between", value1, value2, "disCnt");
            return (Criteria) this;
        }

        public Criteria andDisCntNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DIS_CNT not between", value1, value2, "disCnt");
            return (Criteria) this;
        }

        public Criteria andRtoFqskIsNull() {
            addCriterion("RTO_FQSK is null");
            return (Criteria) this;
        }

        public Criteria andRtoFqskIsNotNull() {
            addCriterion("RTO_FQSK is not null");
            return (Criteria) this;
        }

        public Criteria andRtoFqskEqualTo(BigDecimal value) {
            addCriterion("RTO_FQSK =", value, "rtoFqsk");
            return (Criteria) this;
        }

        public Criteria andRtoFqskNotEqualTo(BigDecimal value) {
            addCriterion("RTO_FQSK <>", value, "rtoFqsk");
            return (Criteria) this;
        }

        public Criteria andRtoFqskGreaterThan(BigDecimal value) {
            addCriterion("RTO_FQSK >", value, "rtoFqsk");
            return (Criteria) this;
        }

        public Criteria andRtoFqskGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RTO_FQSK >=", value, "rtoFqsk");
            return (Criteria) this;
        }

        public Criteria andRtoFqskLessThan(BigDecimal value) {
            addCriterion("RTO_FQSK <", value, "rtoFqsk");
            return (Criteria) this;
        }

        public Criteria andRtoFqskLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RTO_FQSK <=", value, "rtoFqsk");
            return (Criteria) this;
        }

        public Criteria andRtoFqskIn(List<BigDecimal> values) {
            addCriterion("RTO_FQSK in", values, "rtoFqsk");
            return (Criteria) this;
        }

        public Criteria andRtoFqskNotIn(List<BigDecimal> values) {
            addCriterion("RTO_FQSK not in", values, "rtoFqsk");
            return (Criteria) this;
        }

        public Criteria andRtoFqskBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RTO_FQSK between", value1, value2, "rtoFqsk");
            return (Criteria) this;
        }

        public Criteria andRtoFqskNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RTO_FQSK not between", value1, value2, "rtoFqsk");
            return (Criteria) this;
        }

        public Criteria andDateflagFqskIsNull() {
            addCriterion("DATEFLAG_FQSK is null");
            return (Criteria) this;
        }

        public Criteria andDateflagFqskIsNotNull() {
            addCriterion("DATEFLAG_FQSK is not null");
            return (Criteria) this;
        }

        public Criteria andDateflagFqskEqualTo(String value) {
            addCriterion("DATEFLAG_FQSK =", value, "dateflagFqsk");
            return (Criteria) this;
        }

        public Criteria andDateflagFqskNotEqualTo(String value) {
            addCriterion("DATEFLAG_FQSK <>", value, "dateflagFqsk");
            return (Criteria) this;
        }

        public Criteria andDateflagFqskGreaterThan(String value) {
            addCriterion("DATEFLAG_FQSK >", value, "dateflagFqsk");
            return (Criteria) this;
        }

        public Criteria andDateflagFqskGreaterThanOrEqualTo(String value) {
            addCriterion("DATEFLAG_FQSK >=", value, "dateflagFqsk");
            return (Criteria) this;
        }

        public Criteria andDateflagFqskLessThan(String value) {
            addCriterion("DATEFLAG_FQSK <", value, "dateflagFqsk");
            return (Criteria) this;
        }

        public Criteria andDateflagFqskLessThanOrEqualTo(String value) {
            addCriterion("DATEFLAG_FQSK <=", value, "dateflagFqsk");
            return (Criteria) this;
        }

        public Criteria andDateflagFqskLike(String value) {
            addCriterion("DATEFLAG_FQSK like", value, "dateflagFqsk");
            return (Criteria) this;
        }

        public Criteria andDateflagFqskNotLike(String value) {
            addCriterion("DATEFLAG_FQSK not like", value, "dateflagFqsk");
            return (Criteria) this;
        }

        public Criteria andDateflagFqskIn(List<String> values) {
            addCriterion("DATEFLAG_FQSK in", values, "dateflagFqsk");
            return (Criteria) this;
        }

        public Criteria andDateflagFqskNotIn(List<String> values) {
            addCriterion("DATEFLAG_FQSK not in", values, "dateflagFqsk");
            return (Criteria) this;
        }

        public Criteria andDateflagFqskBetween(String value1, String value2) {
            addCriterion("DATEFLAG_FQSK between", value1, value2, "dateflagFqsk");
            return (Criteria) this;
        }

        public Criteria andDateflagFqskNotBetween(String value1, String value2) {
            addCriterion("DATEFLAG_FQSK not between", value1, value2, "dateflagFqsk");
            return (Criteria) this;
        }

        public Criteria andDateFqskIsNull() {
            addCriterion("DATE_FQSK is null");
            return (Criteria) this;
        }

        public Criteria andDateFqskIsNotNull() {
            addCriterion("DATE_FQSK is not null");
            return (Criteria) this;
        }

        public Criteria andDateFqskEqualTo(Date value) {
            addCriterion("DATE_FQSK =", value, "dateFqsk");
            return (Criteria) this;
        }

        public Criteria andDateFqskNotEqualTo(Date value) {
            addCriterion("DATE_FQSK <>", value, "dateFqsk");
            return (Criteria) this;
        }

        public Criteria andDateFqskGreaterThan(Date value) {
            addCriterion("DATE_FQSK >", value, "dateFqsk");
            return (Criteria) this;
        }

        public Criteria andDateFqskGreaterThanOrEqualTo(Date value) {
            addCriterion("DATE_FQSK >=", value, "dateFqsk");
            return (Criteria) this;
        }

        public Criteria andDateFqskLessThan(Date value) {
            addCriterion("DATE_FQSK <", value, "dateFqsk");
            return (Criteria) this;
        }

        public Criteria andDateFqskLessThanOrEqualTo(Date value) {
            addCriterion("DATE_FQSK <=", value, "dateFqsk");
            return (Criteria) this;
        }

        public Criteria andDateFqskIn(List<Date> values) {
            addCriterion("DATE_FQSK in", values, "dateFqsk");
            return (Criteria) this;
        }

        public Criteria andDateFqskNotIn(List<Date> values) {
            addCriterion("DATE_FQSK not in", values, "dateFqsk");
            return (Criteria) this;
        }

        public Criteria andDateFqskBetween(Date value1, Date value2) {
            addCriterion("DATE_FQSK between", value1, value2, "dateFqsk");
            return (Criteria) this;
        }

        public Criteria andDateFqskNotBetween(Date value1, Date value2) {
            addCriterion("DATE_FQSK not between", value1, value2, "dateFqsk");
            return (Criteria) this;
        }

        public Criteria andQsFqskIsNull() {
            addCriterion("QS_FQSK is null");
            return (Criteria) this;
        }

        public Criteria andQsFqskIsNotNull() {
            addCriterion("QS_FQSK is not null");
            return (Criteria) this;
        }

        public Criteria andQsFqskEqualTo(Integer value) {
            addCriterion("QS_FQSK =", value, "qsFqsk");
            return (Criteria) this;
        }

        public Criteria andQsFqskNotEqualTo(Integer value) {
            addCriterion("QS_FQSK <>", value, "qsFqsk");
            return (Criteria) this;
        }

        public Criteria andQsFqskGreaterThan(Integer value) {
            addCriterion("QS_FQSK >", value, "qsFqsk");
            return (Criteria) this;
        }

        public Criteria andQsFqskGreaterThanOrEqualTo(Integer value) {
            addCriterion("QS_FQSK >=", value, "qsFqsk");
            return (Criteria) this;
        }

        public Criteria andQsFqskLessThan(Integer value) {
            addCriterion("QS_FQSK <", value, "qsFqsk");
            return (Criteria) this;
        }

        public Criteria andQsFqskLessThanOrEqualTo(Integer value) {
            addCriterion("QS_FQSK <=", value, "qsFqsk");
            return (Criteria) this;
        }

        public Criteria andQsFqskIn(List<Integer> values) {
            addCriterion("QS_FQSK in", values, "qsFqsk");
            return (Criteria) this;
        }

        public Criteria andQsFqskNotIn(List<Integer> values) {
            addCriterion("QS_FQSK not in", values, "qsFqsk");
            return (Criteria) this;
        }

        public Criteria andQsFqskBetween(Integer value1, Integer value2) {
            addCriterion("QS_FQSK between", value1, value2, "qsFqsk");
            return (Criteria) this;
        }

        public Criteria andQsFqskNotBetween(Integer value1, Integer value2) {
            addCriterion("QS_FQSK not between", value1, value2, "qsFqsk");
            return (Criteria) this;
        }

        public Criteria andCusOsNoIsNull() {
            addCriterion("CUS_OS_NO is null");
            return (Criteria) this;
        }

        public Criteria andCusOsNoIsNotNull() {
            addCriterion("CUS_OS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCusOsNoEqualTo(String value) {
            addCriterion("CUS_OS_NO =", value, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoNotEqualTo(String value) {
            addCriterion("CUS_OS_NO <>", value, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoGreaterThan(String value) {
            addCriterion("CUS_OS_NO >", value, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoGreaterThanOrEqualTo(String value) {
            addCriterion("CUS_OS_NO >=", value, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoLessThan(String value) {
            addCriterion("CUS_OS_NO <", value, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoLessThanOrEqualTo(String value) {
            addCriterion("CUS_OS_NO <=", value, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoLike(String value) {
            addCriterion("CUS_OS_NO like", value, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoNotLike(String value) {
            addCriterion("CUS_OS_NO not like", value, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoIn(List<String> values) {
            addCriterion("CUS_OS_NO in", values, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoNotIn(List<String> values) {
            addCriterion("CUS_OS_NO not in", values, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoBetween(String value1, String value2) {
            addCriterion("CUS_OS_NO between", value1, value2, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCusOsNoNotBetween(String value1, String value2) {
            addCriterion("CUS_OS_NO not between", value1, value2, "cusOsNo");
            return (Criteria) this;
        }

        public Criteria andCurIdIfrsIsNull() {
            addCriterion("CUR_ID_IFRS is null");
            return (Criteria) this;
        }

        public Criteria andCurIdIfrsIsNotNull() {
            addCriterion("CUR_ID_IFRS is not null");
            return (Criteria) this;
        }

        public Criteria andCurIdIfrsEqualTo(String value) {
            addCriterion("CUR_ID_IFRS =", value, "curIdIfrs");
            return (Criteria) this;
        }

        public Criteria andCurIdIfrsNotEqualTo(String value) {
            addCriterion("CUR_ID_IFRS <>", value, "curIdIfrs");
            return (Criteria) this;
        }

        public Criteria andCurIdIfrsGreaterThan(String value) {
            addCriterion("CUR_ID_IFRS >", value, "curIdIfrs");
            return (Criteria) this;
        }

        public Criteria andCurIdIfrsGreaterThanOrEqualTo(String value) {
            addCriterion("CUR_ID_IFRS >=", value, "curIdIfrs");
            return (Criteria) this;
        }

        public Criteria andCurIdIfrsLessThan(String value) {
            addCriterion("CUR_ID_IFRS <", value, "curIdIfrs");
            return (Criteria) this;
        }

        public Criteria andCurIdIfrsLessThanOrEqualTo(String value) {
            addCriterion("CUR_ID_IFRS <=", value, "curIdIfrs");
            return (Criteria) this;
        }

        public Criteria andCurIdIfrsLike(String value) {
            addCriterion("CUR_ID_IFRS like", value, "curIdIfrs");
            return (Criteria) this;
        }

        public Criteria andCurIdIfrsNotLike(String value) {
            addCriterion("CUR_ID_IFRS not like", value, "curIdIfrs");
            return (Criteria) this;
        }

        public Criteria andCurIdIfrsIn(List<String> values) {
            addCriterion("CUR_ID_IFRS in", values, "curIdIfrs");
            return (Criteria) this;
        }

        public Criteria andCurIdIfrsNotIn(List<String> values) {
            addCriterion("CUR_ID_IFRS not in", values, "curIdIfrs");
            return (Criteria) this;
        }

        public Criteria andCurIdIfrsBetween(String value1, String value2) {
            addCriterion("CUR_ID_IFRS between", value1, value2, "curIdIfrs");
            return (Criteria) this;
        }

        public Criteria andCurIdIfrsNotBetween(String value1, String value2) {
            addCriterion("CUR_ID_IFRS not between", value1, value2, "curIdIfrs");
            return (Criteria) this;
        }

        public Criteria andExcRtoIfrsIsNull() {
            addCriterion("EXC_RTO_IFRS is null");
            return (Criteria) this;
        }

        public Criteria andExcRtoIfrsIsNotNull() {
            addCriterion("EXC_RTO_IFRS is not null");
            return (Criteria) this;
        }

        public Criteria andExcRtoIfrsEqualTo(BigDecimal value) {
            addCriterion("EXC_RTO_IFRS =", value, "excRtoIfrs");
            return (Criteria) this;
        }

        public Criteria andExcRtoIfrsNotEqualTo(BigDecimal value) {
            addCriterion("EXC_RTO_IFRS <>", value, "excRtoIfrs");
            return (Criteria) this;
        }

        public Criteria andExcRtoIfrsGreaterThan(BigDecimal value) {
            addCriterion("EXC_RTO_IFRS >", value, "excRtoIfrs");
            return (Criteria) this;
        }

        public Criteria andExcRtoIfrsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXC_RTO_IFRS >=", value, "excRtoIfrs");
            return (Criteria) this;
        }

        public Criteria andExcRtoIfrsLessThan(BigDecimal value) {
            addCriterion("EXC_RTO_IFRS <", value, "excRtoIfrs");
            return (Criteria) this;
        }

        public Criteria andExcRtoIfrsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXC_RTO_IFRS <=", value, "excRtoIfrs");
            return (Criteria) this;
        }

        public Criteria andExcRtoIfrsIn(List<BigDecimal> values) {
            addCriterion("EXC_RTO_IFRS in", values, "excRtoIfrs");
            return (Criteria) this;
        }

        public Criteria andExcRtoIfrsNotIn(List<BigDecimal> values) {
            addCriterion("EXC_RTO_IFRS not in", values, "excRtoIfrs");
            return (Criteria) this;
        }

        public Criteria andExcRtoIfrsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXC_RTO_IFRS between", value1, value2, "excRtoIfrs");
            return (Criteria) this;
        }

        public Criteria andExcRtoIfrsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXC_RTO_IFRS not between", value1, value2, "excRtoIfrs");
            return (Criteria) this;
        }

        public Criteria andPrtDateIsNull() {
            addCriterion("PRT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPrtDateIsNotNull() {
            addCriterion("PRT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPrtDateEqualTo(Date value) {
            addCriterion("PRT_DATE =", value, "prtDate");
            return (Criteria) this;
        }

        public Criteria andPrtDateNotEqualTo(Date value) {
            addCriterion("PRT_DATE <>", value, "prtDate");
            return (Criteria) this;
        }

        public Criteria andPrtDateGreaterThan(Date value) {
            addCriterion("PRT_DATE >", value, "prtDate");
            return (Criteria) this;
        }

        public Criteria andPrtDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PRT_DATE >=", value, "prtDate");
            return (Criteria) this;
        }

        public Criteria andPrtDateLessThan(Date value) {
            addCriterion("PRT_DATE <", value, "prtDate");
            return (Criteria) this;
        }

        public Criteria andPrtDateLessThanOrEqualTo(Date value) {
            addCriterion("PRT_DATE <=", value, "prtDate");
            return (Criteria) this;
        }

        public Criteria andPrtDateIn(List<Date> values) {
            addCriterion("PRT_DATE in", values, "prtDate");
            return (Criteria) this;
        }

        public Criteria andPrtDateNotIn(List<Date> values) {
            addCriterion("PRT_DATE not in", values, "prtDate");
            return (Criteria) this;
        }

        public Criteria andPrtDateBetween(Date value1, Date value2) {
            addCriterion("PRT_DATE between", value1, value2, "prtDate");
            return (Criteria) this;
        }

        public Criteria andPrtDateNotBetween(Date value1, Date value2) {
            addCriterion("PRT_DATE not between", value1, value2, "prtDate");
            return (Criteria) this;
        }

        public Criteria andQty1ClsIsNull() {
            addCriterion("QTY1_CLS is null");
            return (Criteria) this;
        }

        public Criteria andQty1ClsIsNotNull() {
            addCriterion("QTY1_CLS is not null");
            return (Criteria) this;
        }

        public Criteria andQty1ClsEqualTo(BigDecimal value) {
            addCriterion("QTY1_CLS =", value, "qty1Cls");
            return (Criteria) this;
        }

        public Criteria andQty1ClsNotEqualTo(BigDecimal value) {
            addCriterion("QTY1_CLS <>", value, "qty1Cls");
            return (Criteria) this;
        }

        public Criteria andQty1ClsGreaterThan(BigDecimal value) {
            addCriterion("QTY1_CLS >", value, "qty1Cls");
            return (Criteria) this;
        }

        public Criteria andQty1ClsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_CLS >=", value, "qty1Cls");
            return (Criteria) this;
        }

        public Criteria andQty1ClsLessThan(BigDecimal value) {
            addCriterion("QTY1_CLS <", value, "qty1Cls");
            return (Criteria) this;
        }

        public Criteria andQty1ClsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_CLS <=", value, "qty1Cls");
            return (Criteria) this;
        }

        public Criteria andQty1ClsIn(List<BigDecimal> values) {
            addCriterion("QTY1_CLS in", values, "qty1Cls");
            return (Criteria) this;
        }

        public Criteria andQty1ClsNotIn(List<BigDecimal> values) {
            addCriterion("QTY1_CLS not in", values, "qty1Cls");
            return (Criteria) this;
        }

        public Criteria andQty1ClsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_CLS between", value1, value2, "qty1Cls");
            return (Criteria) this;
        }

        public Criteria andQty1ClsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_CLS not between", value1, value2, "qty1Cls");
            return (Criteria) this;
        }

        public Criteria andInvBilIdIsNull() {
            addCriterion("INV_BIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andInvBilIdIsNotNull() {
            addCriterion("INV_BIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInvBilIdEqualTo(String value) {
            addCriterion("INV_BIL_ID =", value, "invBilId");
            return (Criteria) this;
        }

        public Criteria andInvBilIdNotEqualTo(String value) {
            addCriterion("INV_BIL_ID <>", value, "invBilId");
            return (Criteria) this;
        }

        public Criteria andInvBilIdGreaterThan(String value) {
            addCriterion("INV_BIL_ID >", value, "invBilId");
            return (Criteria) this;
        }

        public Criteria andInvBilIdGreaterThanOrEqualTo(String value) {
            addCriterion("INV_BIL_ID >=", value, "invBilId");
            return (Criteria) this;
        }

        public Criteria andInvBilIdLessThan(String value) {
            addCriterion("INV_BIL_ID <", value, "invBilId");
            return (Criteria) this;
        }

        public Criteria andInvBilIdLessThanOrEqualTo(String value) {
            addCriterion("INV_BIL_ID <=", value, "invBilId");
            return (Criteria) this;
        }

        public Criteria andInvBilIdLike(String value) {
            addCriterion("INV_BIL_ID like", value, "invBilId");
            return (Criteria) this;
        }

        public Criteria andInvBilIdNotLike(String value) {
            addCriterion("INV_BIL_ID not like", value, "invBilId");
            return (Criteria) this;
        }

        public Criteria andInvBilIdIn(List<String> values) {
            addCriterion("INV_BIL_ID in", values, "invBilId");
            return (Criteria) this;
        }

        public Criteria andInvBilIdNotIn(List<String> values) {
            addCriterion("INV_BIL_ID not in", values, "invBilId");
            return (Criteria) this;
        }

        public Criteria andInvBilIdBetween(String value1, String value2) {
            addCriterion("INV_BIL_ID between", value1, value2, "invBilId");
            return (Criteria) this;
        }

        public Criteria andInvBilIdNotBetween(String value1, String value2) {
            addCriterion("INV_BIL_ID not between", value1, value2, "invBilId");
            return (Criteria) this;
        }

        public Criteria andInvBilNoIsNull() {
            addCriterion("INV_BIL_NO is null");
            return (Criteria) this;
        }

        public Criteria andInvBilNoIsNotNull() {
            addCriterion("INV_BIL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andInvBilNoEqualTo(String value) {
            addCriterion("INV_BIL_NO =", value, "invBilNo");
            return (Criteria) this;
        }

        public Criteria andInvBilNoNotEqualTo(String value) {
            addCriterion("INV_BIL_NO <>", value, "invBilNo");
            return (Criteria) this;
        }

        public Criteria andInvBilNoGreaterThan(String value) {
            addCriterion("INV_BIL_NO >", value, "invBilNo");
            return (Criteria) this;
        }

        public Criteria andInvBilNoGreaterThanOrEqualTo(String value) {
            addCriterion("INV_BIL_NO >=", value, "invBilNo");
            return (Criteria) this;
        }

        public Criteria andInvBilNoLessThan(String value) {
            addCriterion("INV_BIL_NO <", value, "invBilNo");
            return (Criteria) this;
        }

        public Criteria andInvBilNoLessThanOrEqualTo(String value) {
            addCriterion("INV_BIL_NO <=", value, "invBilNo");
            return (Criteria) this;
        }

        public Criteria andInvBilNoLike(String value) {
            addCriterion("INV_BIL_NO like", value, "invBilNo");
            return (Criteria) this;
        }

        public Criteria andInvBilNoNotLike(String value) {
            addCriterion("INV_BIL_NO not like", value, "invBilNo");
            return (Criteria) this;
        }

        public Criteria andInvBilNoIn(List<String> values) {
            addCriterion("INV_BIL_NO in", values, "invBilNo");
            return (Criteria) this;
        }

        public Criteria andInvBilNoNotIn(List<String> values) {
            addCriterion("INV_BIL_NO not in", values, "invBilNo");
            return (Criteria) this;
        }

        public Criteria andInvBilNoBetween(String value1, String value2) {
            addCriterion("INV_BIL_NO between", value1, value2, "invBilNo");
            return (Criteria) this;
        }

        public Criteria andInvBilNoNotBetween(String value1, String value2) {
            addCriterion("INV_BIL_NO not between", value1, value2, "invBilNo");
            return (Criteria) this;
        }

        public Criteria andCbIdIfrsIsNull() {
            addCriterion("CB_ID_IFRS is null");
            return (Criteria) this;
        }

        public Criteria andCbIdIfrsIsNotNull() {
            addCriterion("CB_ID_IFRS is not null");
            return (Criteria) this;
        }

        public Criteria andCbIdIfrsEqualTo(String value) {
            addCriterion("CB_ID_IFRS =", value, "cbIdIfrs");
            return (Criteria) this;
        }

        public Criteria andCbIdIfrsNotEqualTo(String value) {
            addCriterion("CB_ID_IFRS <>", value, "cbIdIfrs");
            return (Criteria) this;
        }

        public Criteria andCbIdIfrsGreaterThan(String value) {
            addCriterion("CB_ID_IFRS >", value, "cbIdIfrs");
            return (Criteria) this;
        }

        public Criteria andCbIdIfrsGreaterThanOrEqualTo(String value) {
            addCriterion("CB_ID_IFRS >=", value, "cbIdIfrs");
            return (Criteria) this;
        }

        public Criteria andCbIdIfrsLessThan(String value) {
            addCriterion("CB_ID_IFRS <", value, "cbIdIfrs");
            return (Criteria) this;
        }

        public Criteria andCbIdIfrsLessThanOrEqualTo(String value) {
            addCriterion("CB_ID_IFRS <=", value, "cbIdIfrs");
            return (Criteria) this;
        }

        public Criteria andCbIdIfrsLike(String value) {
            addCriterion("CB_ID_IFRS like", value, "cbIdIfrs");
            return (Criteria) this;
        }

        public Criteria andCbIdIfrsNotLike(String value) {
            addCriterion("CB_ID_IFRS not like", value, "cbIdIfrs");
            return (Criteria) this;
        }

        public Criteria andCbIdIfrsIn(List<String> values) {
            addCriterion("CB_ID_IFRS in", values, "cbIdIfrs");
            return (Criteria) this;
        }

        public Criteria andCbIdIfrsNotIn(List<String> values) {
            addCriterion("CB_ID_IFRS not in", values, "cbIdIfrs");
            return (Criteria) this;
        }

        public Criteria andCbIdIfrsBetween(String value1, String value2) {
            addCriterion("CB_ID_IFRS between", value1, value2, "cbIdIfrs");
            return (Criteria) this;
        }

        public Criteria andCbIdIfrsNotBetween(String value1, String value2) {
            addCriterion("CB_ID_IFRS not between", value1, value2, "cbIdIfrs");
            return (Criteria) this;
        }

        public Criteria andLzClsDdIsNull() {
            addCriterion("LZ_CLS_DD is null");
            return (Criteria) this;
        }

        public Criteria andLzClsDdIsNotNull() {
            addCriterion("LZ_CLS_DD is not null");
            return (Criteria) this;
        }

        public Criteria andLzClsDdEqualTo(Date value) {
            addCriterion("LZ_CLS_DD =", value, "lzClsDd");
            return (Criteria) this;
        }

        public Criteria andLzClsDdNotEqualTo(Date value) {
            addCriterion("LZ_CLS_DD <>", value, "lzClsDd");
            return (Criteria) this;
        }

        public Criteria andLzClsDdGreaterThan(Date value) {
            addCriterion("LZ_CLS_DD >", value, "lzClsDd");
            return (Criteria) this;
        }

        public Criteria andLzClsDdGreaterThanOrEqualTo(Date value) {
            addCriterion("LZ_CLS_DD >=", value, "lzClsDd");
            return (Criteria) this;
        }

        public Criteria andLzClsDdLessThan(Date value) {
            addCriterion("LZ_CLS_DD <", value, "lzClsDd");
            return (Criteria) this;
        }

        public Criteria andLzClsDdLessThanOrEqualTo(Date value) {
            addCriterion("LZ_CLS_DD <=", value, "lzClsDd");
            return (Criteria) this;
        }

        public Criteria andLzClsDdIn(List<Date> values) {
            addCriterion("LZ_CLS_DD in", values, "lzClsDd");
            return (Criteria) this;
        }

        public Criteria andLzClsDdNotIn(List<Date> values) {
            addCriterion("LZ_CLS_DD not in", values, "lzClsDd");
            return (Criteria) this;
        }

        public Criteria andLzClsDdBetween(Date value1, Date value2) {
            addCriterion("LZ_CLS_DD between", value1, value2, "lzClsDd");
            return (Criteria) this;
        }

        public Criteria andLzClsDdNotBetween(Date value1, Date value2) {
            addCriterion("LZ_CLS_DD not between", value1, value2, "lzClsDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdIsNull() {
            addCriterion("MODIFY_DD is null");
            return (Criteria) this;
        }

        public Criteria andModifyDdIsNotNull() {
            addCriterion("MODIFY_DD is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDdEqualTo(Date value) {
            addCriterion("MODIFY_DD =", value, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdNotEqualTo(Date value) {
            addCriterion("MODIFY_DD <>", value, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdGreaterThan(Date value) {
            addCriterion("MODIFY_DD >", value, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFY_DD >=", value, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdLessThan(Date value) {
            addCriterion("MODIFY_DD <", value, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdLessThanOrEqualTo(Date value) {
            addCriterion("MODIFY_DD <=", value, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdIn(List<Date> values) {
            addCriterion("MODIFY_DD in", values, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdNotIn(List<Date> values) {
            addCriterion("MODIFY_DD not in", values, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdBetween(Date value1, Date value2) {
            addCriterion("MODIFY_DD between", value1, value2, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyDdNotBetween(Date value1, Date value2) {
            addCriterion("MODIFY_DD not between", value1, value2, "modifyDd");
            return (Criteria) this;
        }

        public Criteria andModifyManIsNull() {
            addCriterion("MODIFY_MAN is null");
            return (Criteria) this;
        }

        public Criteria andModifyManIsNotNull() {
            addCriterion("MODIFY_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andModifyManEqualTo(String value) {
            addCriterion("MODIFY_MAN =", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManNotEqualTo(String value) {
            addCriterion("MODIFY_MAN <>", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManGreaterThan(String value) {
            addCriterion("MODIFY_MAN >", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFY_MAN >=", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManLessThan(String value) {
            addCriterion("MODIFY_MAN <", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManLessThanOrEqualTo(String value) {
            addCriterion("MODIFY_MAN <=", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManLike(String value) {
            addCriterion("MODIFY_MAN like", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManNotLike(String value) {
            addCriterion("MODIFY_MAN not like", value, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManIn(List<String> values) {
            addCriterion("MODIFY_MAN in", values, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManNotIn(List<String> values) {
            addCriterion("MODIFY_MAN not in", values, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManBetween(String value1, String value2) {
            addCriterion("MODIFY_MAN between", value1, value2, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andModifyManNotBetween(String value1, String value2) {
            addCriterion("MODIFY_MAN not between", value1, value2, "modifyMan");
            return (Criteria) this;
        }

        public Criteria andClsidIsNull() {
            addCriterion("CLSID is null");
            return (Criteria) this;
        }

        public Criteria andClsidIsNotNull() {
            addCriterion("CLSID is not null");
            return (Criteria) this;
        }

        public Criteria andClsidEqualTo(String value) {
            addCriterion("CLSID =", value, "clsid");
            return (Criteria) this;
        }

        public Criteria andClsidNotEqualTo(String value) {
            addCriterion("CLSID <>", value, "clsid");
            return (Criteria) this;
        }

        public Criteria andClsidGreaterThan(String value) {
            addCriterion("CLSID >", value, "clsid");
            return (Criteria) this;
        }

        public Criteria andClsidGreaterThanOrEqualTo(String value) {
            addCriterion("CLSID >=", value, "clsid");
            return (Criteria) this;
        }

        public Criteria andClsidLessThan(String value) {
            addCriterion("CLSID <", value, "clsid");
            return (Criteria) this;
        }

        public Criteria andClsidLessThanOrEqualTo(String value) {
            addCriterion("CLSID <=", value, "clsid");
            return (Criteria) this;
        }

        public Criteria andClsidLike(String value) {
            addCriterion("CLSID like", value, "clsid");
            return (Criteria) this;
        }

        public Criteria andClsidNotLike(String value) {
            addCriterion("CLSID not like", value, "clsid");
            return (Criteria) this;
        }

        public Criteria andClsidIn(List<String> values) {
            addCriterion("CLSID in", values, "clsid");
            return (Criteria) this;
        }

        public Criteria andClsidNotIn(List<String> values) {
            addCriterion("CLSID not in", values, "clsid");
            return (Criteria) this;
        }

        public Criteria andClsidBetween(String value1, String value2) {
            addCriterion("CLSID between", value1, value2, "clsid");
            return (Criteria) this;
        }

        public Criteria andClsidNotBetween(String value1, String value2) {
            addCriterion("CLSID not between", value1, value2, "clsid");
            return (Criteria) this;
        }

        public Criteria andScanIdIsNull() {
            addCriterion("SCAN_ID is null");
            return (Criteria) this;
        }

        public Criteria andScanIdIsNotNull() {
            addCriterion("SCAN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andScanIdEqualTo(String value) {
            addCriterion("SCAN_ID =", value, "scanId");
            return (Criteria) this;
        }

        public Criteria andScanIdNotEqualTo(String value) {
            addCriterion("SCAN_ID <>", value, "scanId");
            return (Criteria) this;
        }

        public Criteria andScanIdGreaterThan(String value) {
            addCriterion("SCAN_ID >", value, "scanId");
            return (Criteria) this;
        }

        public Criteria andScanIdGreaterThanOrEqualTo(String value) {
            addCriterion("SCAN_ID >=", value, "scanId");
            return (Criteria) this;
        }

        public Criteria andScanIdLessThan(String value) {
            addCriterion("SCAN_ID <", value, "scanId");
            return (Criteria) this;
        }

        public Criteria andScanIdLessThanOrEqualTo(String value) {
            addCriterion("SCAN_ID <=", value, "scanId");
            return (Criteria) this;
        }

        public Criteria andScanIdLike(String value) {
            addCriterion("SCAN_ID like", value, "scanId");
            return (Criteria) this;
        }

        public Criteria andScanIdNotLike(String value) {
            addCriterion("SCAN_ID not like", value, "scanId");
            return (Criteria) this;
        }

        public Criteria andScanIdIn(List<String> values) {
            addCriterion("SCAN_ID in", values, "scanId");
            return (Criteria) this;
        }

        public Criteria andScanIdNotIn(List<String> values) {
            addCriterion("SCAN_ID not in", values, "scanId");
            return (Criteria) this;
        }

        public Criteria andScanIdBetween(String value1, String value2) {
            addCriterion("SCAN_ID between", value1, value2, "scanId");
            return (Criteria) this;
        }

        public Criteria andScanIdNotBetween(String value1, String value2) {
            addCriterion("SCAN_ID not between", value1, value2, "scanId");
            return (Criteria) this;
        }

        public Criteria andScanUsrIsNull() {
            addCriterion("SCAN_USR is null");
            return (Criteria) this;
        }

        public Criteria andScanUsrIsNotNull() {
            addCriterion("SCAN_USR is not null");
            return (Criteria) this;
        }

        public Criteria andScanUsrEqualTo(String value) {
            addCriterion("SCAN_USR =", value, "scanUsr");
            return (Criteria) this;
        }

        public Criteria andScanUsrNotEqualTo(String value) {
            addCriterion("SCAN_USR <>", value, "scanUsr");
            return (Criteria) this;
        }

        public Criteria andScanUsrGreaterThan(String value) {
            addCriterion("SCAN_USR >", value, "scanUsr");
            return (Criteria) this;
        }

        public Criteria andScanUsrGreaterThanOrEqualTo(String value) {
            addCriterion("SCAN_USR >=", value, "scanUsr");
            return (Criteria) this;
        }

        public Criteria andScanUsrLessThan(String value) {
            addCriterion("SCAN_USR <", value, "scanUsr");
            return (Criteria) this;
        }

        public Criteria andScanUsrLessThanOrEqualTo(String value) {
            addCriterion("SCAN_USR <=", value, "scanUsr");
            return (Criteria) this;
        }

        public Criteria andScanUsrLike(String value) {
            addCriterion("SCAN_USR like", value, "scanUsr");
            return (Criteria) this;
        }

        public Criteria andScanUsrNotLike(String value) {
            addCriterion("SCAN_USR not like", value, "scanUsr");
            return (Criteria) this;
        }

        public Criteria andScanUsrIn(List<String> values) {
            addCriterion("SCAN_USR in", values, "scanUsr");
            return (Criteria) this;
        }

        public Criteria andScanUsrNotIn(List<String> values) {
            addCriterion("SCAN_USR not in", values, "scanUsr");
            return (Criteria) this;
        }

        public Criteria andScanUsrBetween(String value1, String value2) {
            addCriterion("SCAN_USR between", value1, value2, "scanUsr");
            return (Criteria) this;
        }

        public Criteria andScanUsrNotBetween(String value1, String value2) {
            addCriterion("SCAN_USR not between", value1, value2, "scanUsr");
            return (Criteria) this;
        }

        public Criteria andScanDateIsNull() {
            addCriterion("SCAN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andScanDateIsNotNull() {
            addCriterion("SCAN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andScanDateEqualTo(Date value) {
            addCriterion("SCAN_DATE =", value, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateNotEqualTo(Date value) {
            addCriterion("SCAN_DATE <>", value, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateGreaterThan(Date value) {
            addCriterion("SCAN_DATE >", value, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateGreaterThanOrEqualTo(Date value) {
            addCriterion("SCAN_DATE >=", value, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateLessThan(Date value) {
            addCriterion("SCAN_DATE <", value, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateLessThanOrEqualTo(Date value) {
            addCriterion("SCAN_DATE <=", value, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateIn(List<Date> values) {
            addCriterion("SCAN_DATE in", values, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateNotIn(List<Date> values) {
            addCriterion("SCAN_DATE not in", values, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateBetween(Date value1, Date value2) {
            addCriterion("SCAN_DATE between", value1, value2, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateNotBetween(Date value1, Date value2) {
            addCriterion("SCAN_DATE not between", value1, value2, "scanDate");
            return (Criteria) this;
        }

        public Criteria andDzUsrIsNull() {
            addCriterion("DZ_USR is null");
            return (Criteria) this;
        }

        public Criteria andDzUsrIsNotNull() {
            addCriterion("DZ_USR is not null");
            return (Criteria) this;
        }

        public Criteria andDzUsrEqualTo(String value) {
            addCriterion("DZ_USR =", value, "dzUsr");
            return (Criteria) this;
        }

        public Criteria andDzUsrNotEqualTo(String value) {
            addCriterion("DZ_USR <>", value, "dzUsr");
            return (Criteria) this;
        }

        public Criteria andDzUsrGreaterThan(String value) {
            addCriterion("DZ_USR >", value, "dzUsr");
            return (Criteria) this;
        }

        public Criteria andDzUsrGreaterThanOrEqualTo(String value) {
            addCriterion("DZ_USR >=", value, "dzUsr");
            return (Criteria) this;
        }

        public Criteria andDzUsrLessThan(String value) {
            addCriterion("DZ_USR <", value, "dzUsr");
            return (Criteria) this;
        }

        public Criteria andDzUsrLessThanOrEqualTo(String value) {
            addCriterion("DZ_USR <=", value, "dzUsr");
            return (Criteria) this;
        }

        public Criteria andDzUsrLike(String value) {
            addCriterion("DZ_USR like", value, "dzUsr");
            return (Criteria) this;
        }

        public Criteria andDzUsrNotLike(String value) {
            addCriterion("DZ_USR not like", value, "dzUsr");
            return (Criteria) this;
        }

        public Criteria andDzUsrIn(List<String> values) {
            addCriterion("DZ_USR in", values, "dzUsr");
            return (Criteria) this;
        }

        public Criteria andDzUsrNotIn(List<String> values) {
            addCriterion("DZ_USR not in", values, "dzUsr");
            return (Criteria) this;
        }

        public Criteria andDzUsrBetween(String value1, String value2) {
            addCriterion("DZ_USR between", value1, value2, "dzUsr");
            return (Criteria) this;
        }

        public Criteria andDzUsrNotBetween(String value1, String value2) {
            addCriterion("DZ_USR not between", value1, value2, "dzUsr");
            return (Criteria) this;
        }

        public Criteria andDzDateIsNull() {
            addCriterion("DZ_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDzDateIsNotNull() {
            addCriterion("DZ_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDzDateEqualTo(Date value) {
            addCriterion("DZ_DATE =", value, "dzDate");
            return (Criteria) this;
        }

        public Criteria andDzDateNotEqualTo(Date value) {
            addCriterion("DZ_DATE <>", value, "dzDate");
            return (Criteria) this;
        }

        public Criteria andDzDateGreaterThan(Date value) {
            addCriterion("DZ_DATE >", value, "dzDate");
            return (Criteria) this;
        }

        public Criteria andDzDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DZ_DATE >=", value, "dzDate");
            return (Criteria) this;
        }

        public Criteria andDzDateLessThan(Date value) {
            addCriterion("DZ_DATE <", value, "dzDate");
            return (Criteria) this;
        }

        public Criteria andDzDateLessThanOrEqualTo(Date value) {
            addCriterion("DZ_DATE <=", value, "dzDate");
            return (Criteria) this;
        }

        public Criteria andDzDateIn(List<Date> values) {
            addCriterion("DZ_DATE in", values, "dzDate");
            return (Criteria) this;
        }

        public Criteria andDzDateNotIn(List<Date> values) {
            addCriterion("DZ_DATE not in", values, "dzDate");
            return (Criteria) this;
        }

        public Criteria andDzDateBetween(Date value1, Date value2) {
            addCriterion("DZ_DATE between", value1, value2, "dzDate");
            return (Criteria) this;
        }

        public Criteria andDzDateNotBetween(Date value1, Date value2) {
            addCriterion("DZ_DATE not between", value1, value2, "dzDate");
            return (Criteria) this;
        }

        public Criteria andGroupKeyIsNull() {
            addCriterion("GROUP_KEY is null");
            return (Criteria) this;
        }

        public Criteria andGroupKeyIsNotNull() {
            addCriterion("GROUP_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andGroupKeyEqualTo(String value) {
            addCriterion("GROUP_KEY =", value, "groupKey");
            return (Criteria) this;
        }

        public Criteria andGroupKeyNotEqualTo(String value) {
            addCriterion("GROUP_KEY <>", value, "groupKey");
            return (Criteria) this;
        }

        public Criteria andGroupKeyGreaterThan(String value) {
            addCriterion("GROUP_KEY >", value, "groupKey");
            return (Criteria) this;
        }

        public Criteria andGroupKeyGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_KEY >=", value, "groupKey");
            return (Criteria) this;
        }

        public Criteria andGroupKeyLessThan(String value) {
            addCriterion("GROUP_KEY <", value, "groupKey");
            return (Criteria) this;
        }

        public Criteria andGroupKeyLessThanOrEqualTo(String value) {
            addCriterion("GROUP_KEY <=", value, "groupKey");
            return (Criteria) this;
        }

        public Criteria andGroupKeyLike(String value) {
            addCriterion("GROUP_KEY like", value, "groupKey");
            return (Criteria) this;
        }

        public Criteria andGroupKeyNotLike(String value) {
            addCriterion("GROUP_KEY not like", value, "groupKey");
            return (Criteria) this;
        }

        public Criteria andGroupKeyIn(List<String> values) {
            addCriterion("GROUP_KEY in", values, "groupKey");
            return (Criteria) this;
        }

        public Criteria andGroupKeyNotIn(List<String> values) {
            addCriterion("GROUP_KEY not in", values, "groupKey");
            return (Criteria) this;
        }

        public Criteria andGroupKeyBetween(String value1, String value2) {
            addCriterion("GROUP_KEY between", value1, value2, "groupKey");
            return (Criteria) this;
        }

        public Criteria andGroupKeyNotBetween(String value1, String value2) {
            addCriterion("GROUP_KEY not between", value1, value2, "groupKey");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}