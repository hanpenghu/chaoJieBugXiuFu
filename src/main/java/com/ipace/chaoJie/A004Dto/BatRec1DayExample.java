package com.ipace.chaoJie.A004Dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BatRec1DayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BatRec1DayExample() {
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

        public Criteria andWhIsNull() {
            addCriterion("WH is null");
            return (Criteria) this;
        }

        public Criteria andWhIsNotNull() {
            addCriterion("WH is not null");
            return (Criteria) this;
        }

        public Criteria andWhEqualTo(String value) {
            addCriterion("WH =", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhNotEqualTo(String value) {
            addCriterion("WH <>", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhGreaterThan(String value) {
            addCriterion("WH >", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhGreaterThanOrEqualTo(String value) {
            addCriterion("WH >=", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhLessThan(String value) {
            addCriterion("WH <", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhLessThanOrEqualTo(String value) {
            addCriterion("WH <=", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhLike(String value) {
            addCriterion("WH like", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhNotLike(String value) {
            addCriterion("WH not like", value, "wh");
            return (Criteria) this;
        }

        public Criteria andWhIn(List<String> values) {
            addCriterion("WH in", values, "wh");
            return (Criteria) this;
        }

        public Criteria andWhNotIn(List<String> values) {
            addCriterion("WH not in", values, "wh");
            return (Criteria) this;
        }

        public Criteria andWhBetween(String value1, String value2) {
            addCriterion("WH between", value1, value2, "wh");
            return (Criteria) this;
        }

        public Criteria andWhNotBetween(String value1, String value2) {
            addCriterion("WH not between", value1, value2, "wh");
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

        public Criteria andPrdNoIsNull() {
            addCriterion("PRD_NO is null");
            return (Criteria) this;
        }

        public Criteria andPrdNoIsNotNull() {
            addCriterion("PRD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPrdNoEqualTo(String value) {
            addCriterion("PRD_NO =", value, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoNotEqualTo(String value) {
            addCriterion("PRD_NO <>", value, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoGreaterThan(String value) {
            addCriterion("PRD_NO >", value, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoGreaterThanOrEqualTo(String value) {
            addCriterion("PRD_NO >=", value, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoLessThan(String value) {
            addCriterion("PRD_NO <", value, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoLessThanOrEqualTo(String value) {
            addCriterion("PRD_NO <=", value, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoLike(String value) {
            addCriterion("PRD_NO like", value, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoNotLike(String value) {
            addCriterion("PRD_NO not like", value, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoIn(List<String> values) {
            addCriterion("PRD_NO in", values, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoNotIn(List<String> values) {
            addCriterion("PRD_NO not in", values, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoBetween(String value1, String value2) {
            addCriterion("PRD_NO between", value1, value2, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdNoNotBetween(String value1, String value2) {
            addCriterion("PRD_NO not between", value1, value2, "prdNo");
            return (Criteria) this;
        }

        public Criteria andPrdMarkIsNull() {
            addCriterion("PRD_MARK is null");
            return (Criteria) this;
        }

        public Criteria andPrdMarkIsNotNull() {
            addCriterion("PRD_MARK is not null");
            return (Criteria) this;
        }

        public Criteria andPrdMarkEqualTo(String value) {
            addCriterion("PRD_MARK =", value, "prdMark");
            return (Criteria) this;
        }

        public Criteria andPrdMarkNotEqualTo(String value) {
            addCriterion("PRD_MARK <>", value, "prdMark");
            return (Criteria) this;
        }

        public Criteria andPrdMarkGreaterThan(String value) {
            addCriterion("PRD_MARK >", value, "prdMark");
            return (Criteria) this;
        }

        public Criteria andPrdMarkGreaterThanOrEqualTo(String value) {
            addCriterion("PRD_MARK >=", value, "prdMark");
            return (Criteria) this;
        }

        public Criteria andPrdMarkLessThan(String value) {
            addCriterion("PRD_MARK <", value, "prdMark");
            return (Criteria) this;
        }

        public Criteria andPrdMarkLessThanOrEqualTo(String value) {
            addCriterion("PRD_MARK <=", value, "prdMark");
            return (Criteria) this;
        }

        public Criteria andPrdMarkLike(String value) {
            addCriterion("PRD_MARK like", value, "prdMark");
            return (Criteria) this;
        }

        public Criteria andPrdMarkNotLike(String value) {
            addCriterion("PRD_MARK not like", value, "prdMark");
            return (Criteria) this;
        }

        public Criteria andPrdMarkIn(List<String> values) {
            addCriterion("PRD_MARK in", values, "prdMark");
            return (Criteria) this;
        }

        public Criteria andPrdMarkNotIn(List<String> values) {
            addCriterion("PRD_MARK not in", values, "prdMark");
            return (Criteria) this;
        }

        public Criteria andPrdMarkBetween(String value1, String value2) {
            addCriterion("PRD_MARK between", value1, value2, "prdMark");
            return (Criteria) this;
        }

        public Criteria andPrdMarkNotBetween(String value1, String value2) {
            addCriterion("PRD_MARK not between", value1, value2, "prdMark");
            return (Criteria) this;
        }

        public Criteria andRkDdIsNull() {
            addCriterion("RK_DD is null");
            return (Criteria) this;
        }

        public Criteria andRkDdIsNotNull() {
            addCriterion("RK_DD is not null");
            return (Criteria) this;
        }

        public Criteria andRkDdEqualTo(Date value) {
            addCriterion("RK_DD =", value, "rkDd");
            return (Criteria) this;
        }

        public Criteria andRkDdNotEqualTo(Date value) {
            addCriterion("RK_DD <>", value, "rkDd");
            return (Criteria) this;
        }

        public Criteria andRkDdGreaterThan(Date value) {
            addCriterion("RK_DD >", value, "rkDd");
            return (Criteria) this;
        }

        public Criteria andRkDdGreaterThanOrEqualTo(Date value) {
            addCriterion("RK_DD >=", value, "rkDd");
            return (Criteria) this;
        }

        public Criteria andRkDdLessThan(Date value) {
            addCriterion("RK_DD <", value, "rkDd");
            return (Criteria) this;
        }

        public Criteria andRkDdLessThanOrEqualTo(Date value) {
            addCriterion("RK_DD <=", value, "rkDd");
            return (Criteria) this;
        }

        public Criteria andRkDdIn(List<Date> values) {
            addCriterion("RK_DD in", values, "rkDd");
            return (Criteria) this;
        }

        public Criteria andRkDdNotIn(List<Date> values) {
            addCriterion("RK_DD not in", values, "rkDd");
            return (Criteria) this;
        }

        public Criteria andRkDdBetween(Date value1, Date value2) {
            addCriterion("RK_DD between", value1, value2, "rkDd");
            return (Criteria) this;
        }

        public Criteria andRkDdNotBetween(Date value1, Date value2) {
            addCriterion("RK_DD not between", value1, value2, "rkDd");
            return (Criteria) this;
        }

        public Criteria andQtyInIsNull() {
            addCriterion("QTY_IN is null");
            return (Criteria) this;
        }

        public Criteria andQtyInIsNotNull() {
            addCriterion("QTY_IN is not null");
            return (Criteria) this;
        }

        public Criteria andQtyInEqualTo(BigDecimal value) {
            addCriterion("QTY_IN =", value, "qtyIn");
            return (Criteria) this;
        }

        public Criteria andQtyInNotEqualTo(BigDecimal value) {
            addCriterion("QTY_IN <>", value, "qtyIn");
            return (Criteria) this;
        }

        public Criteria andQtyInGreaterThan(BigDecimal value) {
            addCriterion("QTY_IN >", value, "qtyIn");
            return (Criteria) this;
        }

        public Criteria andQtyInGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_IN >=", value, "qtyIn");
            return (Criteria) this;
        }

        public Criteria andQtyInLessThan(BigDecimal value) {
            addCriterion("QTY_IN <", value, "qtyIn");
            return (Criteria) this;
        }

        public Criteria andQtyInLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_IN <=", value, "qtyIn");
            return (Criteria) this;
        }

        public Criteria andQtyInIn(List<BigDecimal> values) {
            addCriterion("QTY_IN in", values, "qtyIn");
            return (Criteria) this;
        }

        public Criteria andQtyInNotIn(List<BigDecimal> values) {
            addCriterion("QTY_IN not in", values, "qtyIn");
            return (Criteria) this;
        }

        public Criteria andQtyInBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_IN between", value1, value2, "qtyIn");
            return (Criteria) this;
        }

        public Criteria andQtyInNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_IN not between", value1, value2, "qtyIn");
            return (Criteria) this;
        }

        public Criteria andQtyInUnshIsNull() {
            addCriterion("QTY_IN_UNSH is null");
            return (Criteria) this;
        }

        public Criteria andQtyInUnshIsNotNull() {
            addCriterion("QTY_IN_UNSH is not null");
            return (Criteria) this;
        }

        public Criteria andQtyInUnshEqualTo(BigDecimal value) {
            addCriterion("QTY_IN_UNSH =", value, "qtyInUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyInUnshNotEqualTo(BigDecimal value) {
            addCriterion("QTY_IN_UNSH <>", value, "qtyInUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyInUnshGreaterThan(BigDecimal value) {
            addCriterion("QTY_IN_UNSH >", value, "qtyInUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyInUnshGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_IN_UNSH >=", value, "qtyInUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyInUnshLessThan(BigDecimal value) {
            addCriterion("QTY_IN_UNSH <", value, "qtyInUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyInUnshLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_IN_UNSH <=", value, "qtyInUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyInUnshIn(List<BigDecimal> values) {
            addCriterion("QTY_IN_UNSH in", values, "qtyInUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyInUnshNotIn(List<BigDecimal> values) {
            addCriterion("QTY_IN_UNSH not in", values, "qtyInUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyInUnshBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_IN_UNSH between", value1, value2, "qtyInUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyInUnshNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_IN_UNSH not between", value1, value2, "qtyInUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyOutIsNull() {
            addCriterion("QTY_OUT is null");
            return (Criteria) this;
        }

        public Criteria andQtyOutIsNotNull() {
            addCriterion("QTY_OUT is not null");
            return (Criteria) this;
        }

        public Criteria andQtyOutEqualTo(BigDecimal value) {
            addCriterion("QTY_OUT =", value, "qtyOut");
            return (Criteria) this;
        }

        public Criteria andQtyOutNotEqualTo(BigDecimal value) {
            addCriterion("QTY_OUT <>", value, "qtyOut");
            return (Criteria) this;
        }

        public Criteria andQtyOutGreaterThan(BigDecimal value) {
            addCriterion("QTY_OUT >", value, "qtyOut");
            return (Criteria) this;
        }

        public Criteria andQtyOutGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_OUT >=", value, "qtyOut");
            return (Criteria) this;
        }

        public Criteria andQtyOutLessThan(BigDecimal value) {
            addCriterion("QTY_OUT <", value, "qtyOut");
            return (Criteria) this;
        }

        public Criteria andQtyOutLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_OUT <=", value, "qtyOut");
            return (Criteria) this;
        }

        public Criteria andQtyOutIn(List<BigDecimal> values) {
            addCriterion("QTY_OUT in", values, "qtyOut");
            return (Criteria) this;
        }

        public Criteria andQtyOutNotIn(List<BigDecimal> values) {
            addCriterion("QTY_OUT not in", values, "qtyOut");
            return (Criteria) this;
        }

        public Criteria andQtyOutBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_OUT between", value1, value2, "qtyOut");
            return (Criteria) this;
        }

        public Criteria andQtyOutNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_OUT not between", value1, value2, "qtyOut");
            return (Criteria) this;
        }

        public Criteria andQtyOutUnshIsNull() {
            addCriterion("QTY_OUT_UNSH is null");
            return (Criteria) this;
        }

        public Criteria andQtyOutUnshIsNotNull() {
            addCriterion("QTY_OUT_UNSH is not null");
            return (Criteria) this;
        }

        public Criteria andQtyOutUnshEqualTo(BigDecimal value) {
            addCriterion("QTY_OUT_UNSH =", value, "qtyOutUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyOutUnshNotEqualTo(BigDecimal value) {
            addCriterion("QTY_OUT_UNSH <>", value, "qtyOutUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyOutUnshGreaterThan(BigDecimal value) {
            addCriterion("QTY_OUT_UNSH >", value, "qtyOutUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyOutUnshGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_OUT_UNSH >=", value, "qtyOutUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyOutUnshLessThan(BigDecimal value) {
            addCriterion("QTY_OUT_UNSH <", value, "qtyOutUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyOutUnshLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_OUT_UNSH <=", value, "qtyOutUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyOutUnshIn(List<BigDecimal> values) {
            addCriterion("QTY_OUT_UNSH in", values, "qtyOutUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyOutUnshNotIn(List<BigDecimal> values) {
            addCriterion("QTY_OUT_UNSH not in", values, "qtyOutUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyOutUnshBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_OUT_UNSH between", value1, value2, "qtyOutUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyOutUnshNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_OUT_UNSH not between", value1, value2, "qtyOutUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1InIsNull() {
            addCriterion("QTY1_IN is null");
            return (Criteria) this;
        }

        public Criteria andQty1InIsNotNull() {
            addCriterion("QTY1_IN is not null");
            return (Criteria) this;
        }

        public Criteria andQty1InEqualTo(BigDecimal value) {
            addCriterion("QTY1_IN =", value, "qty1In");
            return (Criteria) this;
        }

        public Criteria andQty1InNotEqualTo(BigDecimal value) {
            addCriterion("QTY1_IN <>", value, "qty1In");
            return (Criteria) this;
        }

        public Criteria andQty1InGreaterThan(BigDecimal value) {
            addCriterion("QTY1_IN >", value, "qty1In");
            return (Criteria) this;
        }

        public Criteria andQty1InGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_IN >=", value, "qty1In");
            return (Criteria) this;
        }

        public Criteria andQty1InLessThan(BigDecimal value) {
            addCriterion("QTY1_IN <", value, "qty1In");
            return (Criteria) this;
        }

        public Criteria andQty1InLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_IN <=", value, "qty1In");
            return (Criteria) this;
        }

        public Criteria andQty1InIn(List<BigDecimal> values) {
            addCriterion("QTY1_IN in", values, "qty1In");
            return (Criteria) this;
        }

        public Criteria andQty1InNotIn(List<BigDecimal> values) {
            addCriterion("QTY1_IN not in", values, "qty1In");
            return (Criteria) this;
        }

        public Criteria andQty1InBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_IN between", value1, value2, "qty1In");
            return (Criteria) this;
        }

        public Criteria andQty1InNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_IN not between", value1, value2, "qty1In");
            return (Criteria) this;
        }

        public Criteria andQty1InUnshIsNull() {
            addCriterion("QTY1_IN_UNSH is null");
            return (Criteria) this;
        }

        public Criteria andQty1InUnshIsNotNull() {
            addCriterion("QTY1_IN_UNSH is not null");
            return (Criteria) this;
        }

        public Criteria andQty1InUnshEqualTo(BigDecimal value) {
            addCriterion("QTY1_IN_UNSH =", value, "qty1InUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1InUnshNotEqualTo(BigDecimal value) {
            addCriterion("QTY1_IN_UNSH <>", value, "qty1InUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1InUnshGreaterThan(BigDecimal value) {
            addCriterion("QTY1_IN_UNSH >", value, "qty1InUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1InUnshGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_IN_UNSH >=", value, "qty1InUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1InUnshLessThan(BigDecimal value) {
            addCriterion("QTY1_IN_UNSH <", value, "qty1InUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1InUnshLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_IN_UNSH <=", value, "qty1InUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1InUnshIn(List<BigDecimal> values) {
            addCriterion("QTY1_IN_UNSH in", values, "qty1InUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1InUnshNotIn(List<BigDecimal> values) {
            addCriterion("QTY1_IN_UNSH not in", values, "qty1InUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1InUnshBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_IN_UNSH between", value1, value2, "qty1InUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1InUnshNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_IN_UNSH not between", value1, value2, "qty1InUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1OutIsNull() {
            addCriterion("QTY1_OUT is null");
            return (Criteria) this;
        }

        public Criteria andQty1OutIsNotNull() {
            addCriterion("QTY1_OUT is not null");
            return (Criteria) this;
        }

        public Criteria andQty1OutEqualTo(BigDecimal value) {
            addCriterion("QTY1_OUT =", value, "qty1Out");
            return (Criteria) this;
        }

        public Criteria andQty1OutNotEqualTo(BigDecimal value) {
            addCriterion("QTY1_OUT <>", value, "qty1Out");
            return (Criteria) this;
        }

        public Criteria andQty1OutGreaterThan(BigDecimal value) {
            addCriterion("QTY1_OUT >", value, "qty1Out");
            return (Criteria) this;
        }

        public Criteria andQty1OutGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_OUT >=", value, "qty1Out");
            return (Criteria) this;
        }

        public Criteria andQty1OutLessThan(BigDecimal value) {
            addCriterion("QTY1_OUT <", value, "qty1Out");
            return (Criteria) this;
        }

        public Criteria andQty1OutLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_OUT <=", value, "qty1Out");
            return (Criteria) this;
        }

        public Criteria andQty1OutIn(List<BigDecimal> values) {
            addCriterion("QTY1_OUT in", values, "qty1Out");
            return (Criteria) this;
        }

        public Criteria andQty1OutNotIn(List<BigDecimal> values) {
            addCriterion("QTY1_OUT not in", values, "qty1Out");
            return (Criteria) this;
        }

        public Criteria andQty1OutBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_OUT between", value1, value2, "qty1Out");
            return (Criteria) this;
        }

        public Criteria andQty1OutNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_OUT not between", value1, value2, "qty1Out");
            return (Criteria) this;
        }

        public Criteria andQty1OutUnshIsNull() {
            addCriterion("QTY1_OUT_UNSH is null");
            return (Criteria) this;
        }

        public Criteria andQty1OutUnshIsNotNull() {
            addCriterion("QTY1_OUT_UNSH is not null");
            return (Criteria) this;
        }

        public Criteria andQty1OutUnshEqualTo(BigDecimal value) {
            addCriterion("QTY1_OUT_UNSH =", value, "qty1OutUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1OutUnshNotEqualTo(BigDecimal value) {
            addCriterion("QTY1_OUT_UNSH <>", value, "qty1OutUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1OutUnshGreaterThan(BigDecimal value) {
            addCriterion("QTY1_OUT_UNSH >", value, "qty1OutUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1OutUnshGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_OUT_UNSH >=", value, "qty1OutUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1OutUnshLessThan(BigDecimal value) {
            addCriterion("QTY1_OUT_UNSH <", value, "qty1OutUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1OutUnshLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_OUT_UNSH <=", value, "qty1OutUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1OutUnshIn(List<BigDecimal> values) {
            addCriterion("QTY1_OUT_UNSH in", values, "qty1OutUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1OutUnshNotIn(List<BigDecimal> values) {
            addCriterion("QTY1_OUT_UNSH not in", values, "qty1OutUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1OutUnshBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_OUT_UNSH between", value1, value2, "qty1OutUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1OutUnshNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_OUT_UNSH not between", value1, value2, "qty1OutUnsh");
            return (Criteria) this;
        }

        public Criteria andValidDdIsNull() {
            addCriterion("VALID_DD is null");
            return (Criteria) this;
        }

        public Criteria andValidDdIsNotNull() {
            addCriterion("VALID_DD is not null");
            return (Criteria) this;
        }

        public Criteria andValidDdEqualTo(Date value) {
            addCriterion("VALID_DD =", value, "validDd");
            return (Criteria) this;
        }

        public Criteria andValidDdNotEqualTo(Date value) {
            addCriterion("VALID_DD <>", value, "validDd");
            return (Criteria) this;
        }

        public Criteria andValidDdGreaterThan(Date value) {
            addCriterion("VALID_DD >", value, "validDd");
            return (Criteria) this;
        }

        public Criteria andValidDdGreaterThanOrEqualTo(Date value) {
            addCriterion("VALID_DD >=", value, "validDd");
            return (Criteria) this;
        }

        public Criteria andValidDdLessThan(Date value) {
            addCriterion("VALID_DD <", value, "validDd");
            return (Criteria) this;
        }

        public Criteria andValidDdLessThanOrEqualTo(Date value) {
            addCriterion("VALID_DD <=", value, "validDd");
            return (Criteria) this;
        }

        public Criteria andValidDdIn(List<Date> values) {
            addCriterion("VALID_DD in", values, "validDd");
            return (Criteria) this;
        }

        public Criteria andValidDdNotIn(List<Date> values) {
            addCriterion("VALID_DD not in", values, "validDd");
            return (Criteria) this;
        }

        public Criteria andValidDdBetween(Date value1, Date value2) {
            addCriterion("VALID_DD between", value1, value2, "validDd");
            return (Criteria) this;
        }

        public Criteria andValidDdNotBetween(Date value1, Date value2) {
            addCriterion("VALID_DD not between", value1, value2, "validDd");
            return (Criteria) this;
        }

        public Criteria andLstOtdIsNull() {
            addCriterion("LST_OTD is null");
            return (Criteria) this;
        }

        public Criteria andLstOtdIsNotNull() {
            addCriterion("LST_OTD is not null");
            return (Criteria) this;
        }

        public Criteria andLstOtdEqualTo(Date value) {
            addCriterion("LST_OTD =", value, "lstOtd");
            return (Criteria) this;
        }

        public Criteria andLstOtdNotEqualTo(Date value) {
            addCriterion("LST_OTD <>", value, "lstOtd");
            return (Criteria) this;
        }

        public Criteria andLstOtdGreaterThan(Date value) {
            addCriterion("LST_OTD >", value, "lstOtd");
            return (Criteria) this;
        }

        public Criteria andLstOtdGreaterThanOrEqualTo(Date value) {
            addCriterion("LST_OTD >=", value, "lstOtd");
            return (Criteria) this;
        }

        public Criteria andLstOtdLessThan(Date value) {
            addCriterion("LST_OTD <", value, "lstOtd");
            return (Criteria) this;
        }

        public Criteria andLstOtdLessThanOrEqualTo(Date value) {
            addCriterion("LST_OTD <=", value, "lstOtd");
            return (Criteria) this;
        }

        public Criteria andLstOtdIn(List<Date> values) {
            addCriterion("LST_OTD in", values, "lstOtd");
            return (Criteria) this;
        }

        public Criteria andLstOtdNotIn(List<Date> values) {
            addCriterion("LST_OTD not in", values, "lstOtd");
            return (Criteria) this;
        }

        public Criteria andLstOtdBetween(Date value1, Date value2) {
            addCriterion("LST_OTD between", value1, value2, "lstOtd");
            return (Criteria) this;
        }

        public Criteria andLstOtdNotBetween(Date value1, Date value2) {
            addCriterion("LST_OTD not between", value1, value2, "lstOtd");
            return (Criteria) this;
        }

        public Criteria andLockIdIsNull() {
            addCriterion("LOCK_ID is null");
            return (Criteria) this;
        }

        public Criteria andLockIdIsNotNull() {
            addCriterion("LOCK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLockIdEqualTo(String value) {
            addCriterion("LOCK_ID =", value, "lockId");
            return (Criteria) this;
        }

        public Criteria andLockIdNotEqualTo(String value) {
            addCriterion("LOCK_ID <>", value, "lockId");
            return (Criteria) this;
        }

        public Criteria andLockIdGreaterThan(String value) {
            addCriterion("LOCK_ID >", value, "lockId");
            return (Criteria) this;
        }

        public Criteria andLockIdGreaterThanOrEqualTo(String value) {
            addCriterion("LOCK_ID >=", value, "lockId");
            return (Criteria) this;
        }

        public Criteria andLockIdLessThan(String value) {
            addCriterion("LOCK_ID <", value, "lockId");
            return (Criteria) this;
        }

        public Criteria andLockIdLessThanOrEqualTo(String value) {
            addCriterion("LOCK_ID <=", value, "lockId");
            return (Criteria) this;
        }

        public Criteria andLockIdLike(String value) {
            addCriterion("LOCK_ID like", value, "lockId");
            return (Criteria) this;
        }

        public Criteria andLockIdNotLike(String value) {
            addCriterion("LOCK_ID not like", value, "lockId");
            return (Criteria) this;
        }

        public Criteria andLockIdIn(List<String> values) {
            addCriterion("LOCK_ID in", values, "lockId");
            return (Criteria) this;
        }

        public Criteria andLockIdNotIn(List<String> values) {
            addCriterion("LOCK_ID not in", values, "lockId");
            return (Criteria) this;
        }

        public Criteria andLockIdBetween(String value1, String value2) {
            addCriterion("LOCK_ID between", value1, value2, "lockId");
            return (Criteria) this;
        }

        public Criteria andLockIdNotBetween(String value1, String value2) {
            addCriterion("LOCK_ID not between", value1, value2, "lockId");
            return (Criteria) this;
        }

        public Criteria andProduDdIsNull() {
            addCriterion("PRODU_DD is null");
            return (Criteria) this;
        }

        public Criteria andProduDdIsNotNull() {
            addCriterion("PRODU_DD is not null");
            return (Criteria) this;
        }

        public Criteria andProduDdEqualTo(Date value) {
            addCriterion("PRODU_DD =", value, "produDd");
            return (Criteria) this;
        }

        public Criteria andProduDdNotEqualTo(Date value) {
            addCriterion("PRODU_DD <>", value, "produDd");
            return (Criteria) this;
        }

        public Criteria andProduDdGreaterThan(Date value) {
            addCriterion("PRODU_DD >", value, "produDd");
            return (Criteria) this;
        }

        public Criteria andProduDdGreaterThanOrEqualTo(Date value) {
            addCriterion("PRODU_DD >=", value, "produDd");
            return (Criteria) this;
        }

        public Criteria andProduDdLessThan(Date value) {
            addCriterion("PRODU_DD <", value, "produDd");
            return (Criteria) this;
        }

        public Criteria andProduDdLessThanOrEqualTo(Date value) {
            addCriterion("PRODU_DD <=", value, "produDd");
            return (Criteria) this;
        }

        public Criteria andProduDdIn(List<Date> values) {
            addCriterion("PRODU_DD in", values, "produDd");
            return (Criteria) this;
        }

        public Criteria andProduDdNotIn(List<Date> values) {
            addCriterion("PRODU_DD not in", values, "produDd");
            return (Criteria) this;
        }

        public Criteria andProduDdBetween(Date value1, Date value2) {
            addCriterion("PRODU_DD between", value1, value2, "produDd");
            return (Criteria) this;
        }

        public Criteria andProduDdNotBetween(Date value1, Date value2) {
            addCriterion("PRODU_DD not between", value1, value2, "produDd");
            return (Criteria) this;
        }

        public Criteria andRemIsNull() {
            addCriterion("REM is null");
            return (Criteria) this;
        }

        public Criteria andRemIsNotNull() {
            addCriterion("REM is not null");
            return (Criteria) this;
        }

        public Criteria andRemEqualTo(String value) {
            addCriterion("REM =", value, "rem");
            return (Criteria) this;
        }

        public Criteria andRemNotEqualTo(String value) {
            addCriterion("REM <>", value, "rem");
            return (Criteria) this;
        }

        public Criteria andRemGreaterThan(String value) {
            addCriterion("REM >", value, "rem");
            return (Criteria) this;
        }

        public Criteria andRemGreaterThanOrEqualTo(String value) {
            addCriterion("REM >=", value, "rem");
            return (Criteria) this;
        }

        public Criteria andRemLessThan(String value) {
            addCriterion("REM <", value, "rem");
            return (Criteria) this;
        }

        public Criteria andRemLessThanOrEqualTo(String value) {
            addCriterion("REM <=", value, "rem");
            return (Criteria) this;
        }

        public Criteria andRemLike(String value) {
            addCriterion("REM like", value, "rem");
            return (Criteria) this;
        }

        public Criteria andRemNotLike(String value) {
            addCriterion("REM not like", value, "rem");
            return (Criteria) this;
        }

        public Criteria andRemIn(List<String> values) {
            addCriterion("REM in", values, "rem");
            return (Criteria) this;
        }

        public Criteria andRemNotIn(List<String> values) {
            addCriterion("REM not in", values, "rem");
            return (Criteria) this;
        }

        public Criteria andRemBetween(String value1, String value2) {
            addCriterion("REM between", value1, value2, "rem");
            return (Criteria) this;
        }

        public Criteria andRemNotBetween(String value1, String value2) {
            addCriterion("REM not between", value1, value2, "rem");
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