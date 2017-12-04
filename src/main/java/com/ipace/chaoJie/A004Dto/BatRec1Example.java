package com.ipace.chaoJie.A004Dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BatRec1Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BatRec1Example() {
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

        public Criteria andCstIsNull() {
            addCriterion("CST is null");
            return (Criteria) this;
        }

        public Criteria andCstIsNotNull() {
            addCriterion("CST is not null");
            return (Criteria) this;
        }

        public Criteria andCstEqualTo(BigDecimal value) {
            addCriterion("CST =", value, "cst");
            return (Criteria) this;
        }

        public Criteria andCstNotEqualTo(BigDecimal value) {
            addCriterion("CST <>", value, "cst");
            return (Criteria) this;
        }

        public Criteria andCstGreaterThan(BigDecimal value) {
            addCriterion("CST >", value, "cst");
            return (Criteria) this;
        }

        public Criteria andCstGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST >=", value, "cst");
            return (Criteria) this;
        }

        public Criteria andCstLessThan(BigDecimal value) {
            addCriterion("CST <", value, "cst");
            return (Criteria) this;
        }

        public Criteria andCstLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST <=", value, "cst");
            return (Criteria) this;
        }

        public Criteria andCstIn(List<BigDecimal> values) {
            addCriterion("CST in", values, "cst");
            return (Criteria) this;
        }

        public Criteria andCstNotIn(List<BigDecimal> values) {
            addCriterion("CST not in", values, "cst");
            return (Criteria) this;
        }

        public Criteria andCstBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST between", value1, value2, "cst");
            return (Criteria) this;
        }

        public Criteria andCstNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST not between", value1, value2, "cst");
            return (Criteria) this;
        }

        public Criteria andQtyLrnIsNull() {
            addCriterion("QTY_LRN is null");
            return (Criteria) this;
        }

        public Criteria andQtyLrnIsNotNull() {
            addCriterion("QTY_LRN is not null");
            return (Criteria) this;
        }

        public Criteria andQtyLrnEqualTo(BigDecimal value) {
            addCriterion("QTY_LRN =", value, "qtyLrn");
            return (Criteria) this;
        }

        public Criteria andQtyLrnNotEqualTo(BigDecimal value) {
            addCriterion("QTY_LRN <>", value, "qtyLrn");
            return (Criteria) this;
        }

        public Criteria andQtyLrnGreaterThan(BigDecimal value) {
            addCriterion("QTY_LRN >", value, "qtyLrn");
            return (Criteria) this;
        }

        public Criteria andQtyLrnGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_LRN >=", value, "qtyLrn");
            return (Criteria) this;
        }

        public Criteria andQtyLrnLessThan(BigDecimal value) {
            addCriterion("QTY_LRN <", value, "qtyLrn");
            return (Criteria) this;
        }

        public Criteria andQtyLrnLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_LRN <=", value, "qtyLrn");
            return (Criteria) this;
        }

        public Criteria andQtyLrnIn(List<BigDecimal> values) {
            addCriterion("QTY_LRN in", values, "qtyLrn");
            return (Criteria) this;
        }

        public Criteria andQtyLrnNotIn(List<BigDecimal> values) {
            addCriterion("QTY_LRN not in", values, "qtyLrn");
            return (Criteria) this;
        }

        public Criteria andQtyLrnBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_LRN between", value1, value2, "qtyLrn");
            return (Criteria) this;
        }

        public Criteria andQtyLrnNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_LRN not between", value1, value2, "qtyLrn");
            return (Criteria) this;
        }

        public Criteria andQtyBrwIsNull() {
            addCriterion("QTY_BRW is null");
            return (Criteria) this;
        }

        public Criteria andQtyBrwIsNotNull() {
            addCriterion("QTY_BRW is not null");
            return (Criteria) this;
        }

        public Criteria andQtyBrwEqualTo(BigDecimal value) {
            addCriterion("QTY_BRW =", value, "qtyBrw");
            return (Criteria) this;
        }

        public Criteria andQtyBrwNotEqualTo(BigDecimal value) {
            addCriterion("QTY_BRW <>", value, "qtyBrw");
            return (Criteria) this;
        }

        public Criteria andQtyBrwGreaterThan(BigDecimal value) {
            addCriterion("QTY_BRW >", value, "qtyBrw");
            return (Criteria) this;
        }

        public Criteria andQtyBrwGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_BRW >=", value, "qtyBrw");
            return (Criteria) this;
        }

        public Criteria andQtyBrwLessThan(BigDecimal value) {
            addCriterion("QTY_BRW <", value, "qtyBrw");
            return (Criteria) this;
        }

        public Criteria andQtyBrwLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_BRW <=", value, "qtyBrw");
            return (Criteria) this;
        }

        public Criteria andQtyBrwIn(List<BigDecimal> values) {
            addCriterion("QTY_BRW in", values, "qtyBrw");
            return (Criteria) this;
        }

        public Criteria andQtyBrwNotIn(List<BigDecimal> values) {
            addCriterion("QTY_BRW not in", values, "qtyBrw");
            return (Criteria) this;
        }

        public Criteria andQtyBrwBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_BRW between", value1, value2, "qtyBrw");
            return (Criteria) this;
        }

        public Criteria andQtyBrwNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_BRW not between", value1, value2, "qtyBrw");
            return (Criteria) this;
        }

        public Criteria andQtyOnWayIsNull() {
            addCriterion("QTY_ON_WAY is null");
            return (Criteria) this;
        }

        public Criteria andQtyOnWayIsNotNull() {
            addCriterion("QTY_ON_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andQtyOnWayEqualTo(BigDecimal value) {
            addCriterion("QTY_ON_WAY =", value, "qtyOnWay");
            return (Criteria) this;
        }

        public Criteria andQtyOnWayNotEqualTo(BigDecimal value) {
            addCriterion("QTY_ON_WAY <>", value, "qtyOnWay");
            return (Criteria) this;
        }

        public Criteria andQtyOnWayGreaterThan(BigDecimal value) {
            addCriterion("QTY_ON_WAY >", value, "qtyOnWay");
            return (Criteria) this;
        }

        public Criteria andQtyOnWayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_ON_WAY >=", value, "qtyOnWay");
            return (Criteria) this;
        }

        public Criteria andQtyOnWayLessThan(BigDecimal value) {
            addCriterion("QTY_ON_WAY <", value, "qtyOnWay");
            return (Criteria) this;
        }

        public Criteria andQtyOnWayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_ON_WAY <=", value, "qtyOnWay");
            return (Criteria) this;
        }

        public Criteria andQtyOnWayIn(List<BigDecimal> values) {
            addCriterion("QTY_ON_WAY in", values, "qtyOnWay");
            return (Criteria) this;
        }

        public Criteria andQtyOnWayNotIn(List<BigDecimal> values) {
            addCriterion("QTY_ON_WAY not in", values, "qtyOnWay");
            return (Criteria) this;
        }

        public Criteria andQtyOnWayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_ON_WAY between", value1, value2, "qtyOnWay");
            return (Criteria) this;
        }

        public Criteria andQtyOnWayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_ON_WAY not between", value1, value2, "qtyOnWay");
            return (Criteria) this;
        }

        public Criteria andQtyOnPrcIsNull() {
            addCriterion("QTY_ON_PRC is null");
            return (Criteria) this;
        }

        public Criteria andQtyOnPrcIsNotNull() {
            addCriterion("QTY_ON_PRC is not null");
            return (Criteria) this;
        }

        public Criteria andQtyOnPrcEqualTo(BigDecimal value) {
            addCriterion("QTY_ON_PRC =", value, "qtyOnPrc");
            return (Criteria) this;
        }

        public Criteria andQtyOnPrcNotEqualTo(BigDecimal value) {
            addCriterion("QTY_ON_PRC <>", value, "qtyOnPrc");
            return (Criteria) this;
        }

        public Criteria andQtyOnPrcGreaterThan(BigDecimal value) {
            addCriterion("QTY_ON_PRC >", value, "qtyOnPrc");
            return (Criteria) this;
        }

        public Criteria andQtyOnPrcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_ON_PRC >=", value, "qtyOnPrc");
            return (Criteria) this;
        }

        public Criteria andQtyOnPrcLessThan(BigDecimal value) {
            addCriterion("QTY_ON_PRC <", value, "qtyOnPrc");
            return (Criteria) this;
        }

        public Criteria andQtyOnPrcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_ON_PRC <=", value, "qtyOnPrc");
            return (Criteria) this;
        }

        public Criteria andQtyOnPrcIn(List<BigDecimal> values) {
            addCriterion("QTY_ON_PRC in", values, "qtyOnPrc");
            return (Criteria) this;
        }

        public Criteria andQtyOnPrcNotIn(List<BigDecimal> values) {
            addCriterion("QTY_ON_PRC not in", values, "qtyOnPrc");
            return (Criteria) this;
        }

        public Criteria andQtyOnPrcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_ON_PRC between", value1, value2, "qtyOnPrc");
            return (Criteria) this;
        }

        public Criteria andQtyOnPrcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_ON_PRC not between", value1, value2, "qtyOnPrc");
            return (Criteria) this;
        }

        public Criteria andQtyOnRsvIsNull() {
            addCriterion("QTY_ON_RSV is null");
            return (Criteria) this;
        }

        public Criteria andQtyOnRsvIsNotNull() {
            addCriterion("QTY_ON_RSV is not null");
            return (Criteria) this;
        }

        public Criteria andQtyOnRsvEqualTo(BigDecimal value) {
            addCriterion("QTY_ON_RSV =", value, "qtyOnRsv");
            return (Criteria) this;
        }

        public Criteria andQtyOnRsvNotEqualTo(BigDecimal value) {
            addCriterion("QTY_ON_RSV <>", value, "qtyOnRsv");
            return (Criteria) this;
        }

        public Criteria andQtyOnRsvGreaterThan(BigDecimal value) {
            addCriterion("QTY_ON_RSV >", value, "qtyOnRsv");
            return (Criteria) this;
        }

        public Criteria andQtyOnRsvGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_ON_RSV >=", value, "qtyOnRsv");
            return (Criteria) this;
        }

        public Criteria andQtyOnRsvLessThan(BigDecimal value) {
            addCriterion("QTY_ON_RSV <", value, "qtyOnRsv");
            return (Criteria) this;
        }

        public Criteria andQtyOnRsvLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_ON_RSV <=", value, "qtyOnRsv");
            return (Criteria) this;
        }

        public Criteria andQtyOnRsvIn(List<BigDecimal> values) {
            addCriterion("QTY_ON_RSV in", values, "qtyOnRsv");
            return (Criteria) this;
        }

        public Criteria andQtyOnRsvNotIn(List<BigDecimal> values) {
            addCriterion("QTY_ON_RSV not in", values, "qtyOnRsv");
            return (Criteria) this;
        }

        public Criteria andQtyOnRsvBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_ON_RSV between", value1, value2, "qtyOnRsv");
            return (Criteria) this;
        }

        public Criteria andQtyOnRsvNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_ON_RSV not between", value1, value2, "qtyOnRsv");
            return (Criteria) this;
        }

        public Criteria andQtyOnOdrIsNull() {
            addCriterion("QTY_ON_ODR is null");
            return (Criteria) this;
        }

        public Criteria andQtyOnOdrIsNotNull() {
            addCriterion("QTY_ON_ODR is not null");
            return (Criteria) this;
        }

        public Criteria andQtyOnOdrEqualTo(BigDecimal value) {
            addCriterion("QTY_ON_ODR =", value, "qtyOnOdr");
            return (Criteria) this;
        }

        public Criteria andQtyOnOdrNotEqualTo(BigDecimal value) {
            addCriterion("QTY_ON_ODR <>", value, "qtyOnOdr");
            return (Criteria) this;
        }

        public Criteria andQtyOnOdrGreaterThan(BigDecimal value) {
            addCriterion("QTY_ON_ODR >", value, "qtyOnOdr");
            return (Criteria) this;
        }

        public Criteria andQtyOnOdrGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_ON_ODR >=", value, "qtyOnOdr");
            return (Criteria) this;
        }

        public Criteria andQtyOnOdrLessThan(BigDecimal value) {
            addCriterion("QTY_ON_ODR <", value, "qtyOnOdr");
            return (Criteria) this;
        }

        public Criteria andQtyOnOdrLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_ON_ODR <=", value, "qtyOnOdr");
            return (Criteria) this;
        }

        public Criteria andQtyOnOdrIn(List<BigDecimal> values) {
            addCriterion("QTY_ON_ODR in", values, "qtyOnOdr");
            return (Criteria) this;
        }

        public Criteria andQtyOnOdrNotIn(List<BigDecimal> values) {
            addCriterion("QTY_ON_ODR not in", values, "qtyOnOdr");
            return (Criteria) this;
        }

        public Criteria andQtyOnOdrBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_ON_ODR between", value1, value2, "qtyOnOdr");
            return (Criteria) this;
        }

        public Criteria andQtyOnOdrNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_ON_ODR not between", value1, value2, "qtyOnOdr");
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

        public Criteria andQty1LrnIsNull() {
            addCriterion("QTY1_LRN is null");
            return (Criteria) this;
        }

        public Criteria andQty1LrnIsNotNull() {
            addCriterion("QTY1_LRN is not null");
            return (Criteria) this;
        }

        public Criteria andQty1LrnEqualTo(BigDecimal value) {
            addCriterion("QTY1_LRN =", value, "qty1Lrn");
            return (Criteria) this;
        }

        public Criteria andQty1LrnNotEqualTo(BigDecimal value) {
            addCriterion("QTY1_LRN <>", value, "qty1Lrn");
            return (Criteria) this;
        }

        public Criteria andQty1LrnGreaterThan(BigDecimal value) {
            addCriterion("QTY1_LRN >", value, "qty1Lrn");
            return (Criteria) this;
        }

        public Criteria andQty1LrnGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_LRN >=", value, "qty1Lrn");
            return (Criteria) this;
        }

        public Criteria andQty1LrnLessThan(BigDecimal value) {
            addCriterion("QTY1_LRN <", value, "qty1Lrn");
            return (Criteria) this;
        }

        public Criteria andQty1LrnLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_LRN <=", value, "qty1Lrn");
            return (Criteria) this;
        }

        public Criteria andQty1LrnIn(List<BigDecimal> values) {
            addCriterion("QTY1_LRN in", values, "qty1Lrn");
            return (Criteria) this;
        }

        public Criteria andQty1LrnNotIn(List<BigDecimal> values) {
            addCriterion("QTY1_LRN not in", values, "qty1Lrn");
            return (Criteria) this;
        }

        public Criteria andQty1LrnBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_LRN between", value1, value2, "qty1Lrn");
            return (Criteria) this;
        }

        public Criteria andQty1LrnNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_LRN not between", value1, value2, "qty1Lrn");
            return (Criteria) this;
        }

        public Criteria andQty1BrwIsNull() {
            addCriterion("QTY1_BRW is null");
            return (Criteria) this;
        }

        public Criteria andQty1BrwIsNotNull() {
            addCriterion("QTY1_BRW is not null");
            return (Criteria) this;
        }

        public Criteria andQty1BrwEqualTo(BigDecimal value) {
            addCriterion("QTY1_BRW =", value, "qty1Brw");
            return (Criteria) this;
        }

        public Criteria andQty1BrwNotEqualTo(BigDecimal value) {
            addCriterion("QTY1_BRW <>", value, "qty1Brw");
            return (Criteria) this;
        }

        public Criteria andQty1BrwGreaterThan(BigDecimal value) {
            addCriterion("QTY1_BRW >", value, "qty1Brw");
            return (Criteria) this;
        }

        public Criteria andQty1BrwGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_BRW >=", value, "qty1Brw");
            return (Criteria) this;
        }

        public Criteria andQty1BrwLessThan(BigDecimal value) {
            addCriterion("QTY1_BRW <", value, "qty1Brw");
            return (Criteria) this;
        }

        public Criteria andQty1BrwLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_BRW <=", value, "qty1Brw");
            return (Criteria) this;
        }

        public Criteria andQty1BrwIn(List<BigDecimal> values) {
            addCriterion("QTY1_BRW in", values, "qty1Brw");
            return (Criteria) this;
        }

        public Criteria andQty1BrwNotIn(List<BigDecimal> values) {
            addCriterion("QTY1_BRW not in", values, "qty1Brw");
            return (Criteria) this;
        }

        public Criteria andQty1BrwBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_BRW between", value1, value2, "qty1Brw");
            return (Criteria) this;
        }

        public Criteria andQty1BrwNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_BRW not between", value1, value2, "qty1Brw");
            return (Criteria) this;
        }

        public Criteria andPassIsNull() {
            addCriterion("PASS is null");
            return (Criteria) this;
        }

        public Criteria andPassIsNotNull() {
            addCriterion("PASS is not null");
            return (Criteria) this;
        }

        public Criteria andPassEqualTo(String value) {
            addCriterion("PASS =", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotEqualTo(String value) {
            addCriterion("PASS <>", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassGreaterThan(String value) {
            addCriterion("PASS >", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassGreaterThanOrEqualTo(String value) {
            addCriterion("PASS >=", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLessThan(String value) {
            addCriterion("PASS <", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLessThanOrEqualTo(String value) {
            addCriterion("PASS <=", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLike(String value) {
            addCriterion("PASS like", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotLike(String value) {
            addCriterion("PASS not like", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassIn(List<String> values) {
            addCriterion("PASS in", values, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotIn(List<String> values) {
            addCriterion("PASS not in", values, "pass");
            return (Criteria) this;
        }

        public Criteria andPassBetween(String value1, String value2) {
            addCriterion("PASS between", value1, value2, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotBetween(String value1, String value2) {
            addCriterion("PASS not between", value1, value2, "pass");
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

        public Criteria andQtyMaxIsNull() {
            addCriterion("QTY_MAX is null");
            return (Criteria) this;
        }

        public Criteria andQtyMaxIsNotNull() {
            addCriterion("QTY_MAX is not null");
            return (Criteria) this;
        }

        public Criteria andQtyMaxEqualTo(BigDecimal value) {
            addCriterion("QTY_MAX =", value, "qtyMax");
            return (Criteria) this;
        }

        public Criteria andQtyMaxNotEqualTo(BigDecimal value) {
            addCriterion("QTY_MAX <>", value, "qtyMax");
            return (Criteria) this;
        }

        public Criteria andQtyMaxGreaterThan(BigDecimal value) {
            addCriterion("QTY_MAX >", value, "qtyMax");
            return (Criteria) this;
        }

        public Criteria andQtyMaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_MAX >=", value, "qtyMax");
            return (Criteria) this;
        }

        public Criteria andQtyMaxLessThan(BigDecimal value) {
            addCriterion("QTY_MAX <", value, "qtyMax");
            return (Criteria) this;
        }

        public Criteria andQtyMaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_MAX <=", value, "qtyMax");
            return (Criteria) this;
        }

        public Criteria andQtyMaxIn(List<BigDecimal> values) {
            addCriterion("QTY_MAX in", values, "qtyMax");
            return (Criteria) this;
        }

        public Criteria andQtyMaxNotIn(List<BigDecimal> values) {
            addCriterion("QTY_MAX not in", values, "qtyMax");
            return (Criteria) this;
        }

        public Criteria andQtyMaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_MAX between", value1, value2, "qtyMax");
            return (Criteria) this;
        }

        public Criteria andQtyMaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_MAX not between", value1, value2, "qtyMax");
            return (Criteria) this;
        }

        public Criteria andQtyMinIsNull() {
            addCriterion("QTY_MIN is null");
            return (Criteria) this;
        }

        public Criteria andQtyMinIsNotNull() {
            addCriterion("QTY_MIN is not null");
            return (Criteria) this;
        }

        public Criteria andQtyMinEqualTo(BigDecimal value) {
            addCriterion("QTY_MIN =", value, "qtyMin");
            return (Criteria) this;
        }

        public Criteria andQtyMinNotEqualTo(BigDecimal value) {
            addCriterion("QTY_MIN <>", value, "qtyMin");
            return (Criteria) this;
        }

        public Criteria andQtyMinGreaterThan(BigDecimal value) {
            addCriterion("QTY_MIN >", value, "qtyMin");
            return (Criteria) this;
        }

        public Criteria andQtyMinGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_MIN >=", value, "qtyMin");
            return (Criteria) this;
        }

        public Criteria andQtyMinLessThan(BigDecimal value) {
            addCriterion("QTY_MIN <", value, "qtyMin");
            return (Criteria) this;
        }

        public Criteria andQtyMinLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_MIN <=", value, "qtyMin");
            return (Criteria) this;
        }

        public Criteria andQtyMinIn(List<BigDecimal> values) {
            addCriterion("QTY_MIN in", values, "qtyMin");
            return (Criteria) this;
        }

        public Criteria andQtyMinNotIn(List<BigDecimal> values) {
            addCriterion("QTY_MIN not in", values, "qtyMin");
            return (Criteria) this;
        }

        public Criteria andQtyMinBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_MIN between", value1, value2, "qtyMin");
            return (Criteria) this;
        }

        public Criteria andQtyMinNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_MIN not between", value1, value2, "qtyMin");
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

        public Criteria andLstIndIsNull() {
            addCriterion("LST_IND is null");
            return (Criteria) this;
        }

        public Criteria andLstIndIsNotNull() {
            addCriterion("LST_IND is not null");
            return (Criteria) this;
        }

        public Criteria andLstIndEqualTo(Date value) {
            addCriterion("LST_IND =", value, "lstInd");
            return (Criteria) this;
        }

        public Criteria andLstIndNotEqualTo(Date value) {
            addCriterion("LST_IND <>", value, "lstInd");
            return (Criteria) this;
        }

        public Criteria andLstIndGreaterThan(Date value) {
            addCriterion("LST_IND >", value, "lstInd");
            return (Criteria) this;
        }

        public Criteria andLstIndGreaterThanOrEqualTo(Date value) {
            addCriterion("LST_IND >=", value, "lstInd");
            return (Criteria) this;
        }

        public Criteria andLstIndLessThan(Date value) {
            addCriterion("LST_IND <", value, "lstInd");
            return (Criteria) this;
        }

        public Criteria andLstIndLessThanOrEqualTo(Date value) {
            addCriterion("LST_IND <=", value, "lstInd");
            return (Criteria) this;
        }

        public Criteria andLstIndIn(List<Date> values) {
            addCriterion("LST_IND in", values, "lstInd");
            return (Criteria) this;
        }

        public Criteria andLstIndNotIn(List<Date> values) {
            addCriterion("LST_IND not in", values, "lstInd");
            return (Criteria) this;
        }

        public Criteria andLstIndBetween(Date value1, Date value2) {
            addCriterion("LST_IND between", value1, value2, "lstInd");
            return (Criteria) this;
        }

        public Criteria andLstIndNotBetween(Date value1, Date value2) {
            addCriterion("LST_IND not between", value1, value2, "lstInd");
            return (Criteria) this;
        }

        public Criteria andQtySaIsNull() {
            addCriterion("QTY_SA is null");
            return (Criteria) this;
        }

        public Criteria andQtySaIsNotNull() {
            addCriterion("QTY_SA is not null");
            return (Criteria) this;
        }

        public Criteria andQtySaEqualTo(BigDecimal value) {
            addCriterion("QTY_SA =", value, "qtySa");
            return (Criteria) this;
        }

        public Criteria andQtySaNotEqualTo(BigDecimal value) {
            addCriterion("QTY_SA <>", value, "qtySa");
            return (Criteria) this;
        }

        public Criteria andQtySaGreaterThan(BigDecimal value) {
            addCriterion("QTY_SA >", value, "qtySa");
            return (Criteria) this;
        }

        public Criteria andQtySaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_SA >=", value, "qtySa");
            return (Criteria) this;
        }

        public Criteria andQtySaLessThan(BigDecimal value) {
            addCriterion("QTY_SA <", value, "qtySa");
            return (Criteria) this;
        }

        public Criteria andQtySaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_SA <=", value, "qtySa");
            return (Criteria) this;
        }

        public Criteria andQtySaIn(List<BigDecimal> values) {
            addCriterion("QTY_SA in", values, "qtySa");
            return (Criteria) this;
        }

        public Criteria andQtySaNotIn(List<BigDecimal> values) {
            addCriterion("QTY_SA not in", values, "qtySa");
            return (Criteria) this;
        }

        public Criteria andQtySaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_SA between", value1, value2, "qtySa");
            return (Criteria) this;
        }

        public Criteria andQtySaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_SA not between", value1, value2, "qtySa");
            return (Criteria) this;
        }

        public Criteria andQtyRkIsNull() {
            addCriterion("QTY_RK is null");
            return (Criteria) this;
        }

        public Criteria andQtyRkIsNotNull() {
            addCriterion("QTY_RK is not null");
            return (Criteria) this;
        }

        public Criteria andQtyRkEqualTo(BigDecimal value) {
            addCriterion("QTY_RK =", value, "qtyRk");
            return (Criteria) this;
        }

        public Criteria andQtyRkNotEqualTo(BigDecimal value) {
            addCriterion("QTY_RK <>", value, "qtyRk");
            return (Criteria) this;
        }

        public Criteria andQtyRkGreaterThan(BigDecimal value) {
            addCriterion("QTY_RK >", value, "qtyRk");
            return (Criteria) this;
        }

        public Criteria andQtyRkGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_RK >=", value, "qtyRk");
            return (Criteria) this;
        }

        public Criteria andQtyRkLessThan(BigDecimal value) {
            addCriterion("QTY_RK <", value, "qtyRk");
            return (Criteria) this;
        }

        public Criteria andQtyRkLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_RK <=", value, "qtyRk");
            return (Criteria) this;
        }

        public Criteria andQtyRkIn(List<BigDecimal> values) {
            addCriterion("QTY_RK in", values, "qtyRk");
            return (Criteria) this;
        }

        public Criteria andQtyRkNotIn(List<BigDecimal> values) {
            addCriterion("QTY_RK not in", values, "qtyRk");
            return (Criteria) this;
        }

        public Criteria andQtyRkBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_RK between", value1, value2, "qtyRk");
            return (Criteria) this;
        }

        public Criteria andQtyRkNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_RK not between", value1, value2, "qtyRk");
            return (Criteria) this;
        }

        public Criteria andQtyZgIsNull() {
            addCriterion("QTY_ZG is null");
            return (Criteria) this;
        }

        public Criteria andQtyZgIsNotNull() {
            addCriterion("QTY_ZG is not null");
            return (Criteria) this;
        }

        public Criteria andQtyZgEqualTo(BigDecimal value) {
            addCriterion("QTY_ZG =", value, "qtyZg");
            return (Criteria) this;
        }

        public Criteria andQtyZgNotEqualTo(BigDecimal value) {
            addCriterion("QTY_ZG <>", value, "qtyZg");
            return (Criteria) this;
        }

        public Criteria andQtyZgGreaterThan(BigDecimal value) {
            addCriterion("QTY_ZG >", value, "qtyZg");
            return (Criteria) this;
        }

        public Criteria andQtyZgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_ZG >=", value, "qtyZg");
            return (Criteria) this;
        }

        public Criteria andQtyZgLessThan(BigDecimal value) {
            addCriterion("QTY_ZG <", value, "qtyZg");
            return (Criteria) this;
        }

        public Criteria andQtyZgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_ZG <=", value, "qtyZg");
            return (Criteria) this;
        }

        public Criteria andQtyZgIn(List<BigDecimal> values) {
            addCriterion("QTY_ZG in", values, "qtyZg");
            return (Criteria) this;
        }

        public Criteria andQtyZgNotIn(List<BigDecimal> values) {
            addCriterion("QTY_ZG not in", values, "qtyZg");
            return (Criteria) this;
        }

        public Criteria andQtyZgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_ZG between", value1, value2, "qtyZg");
            return (Criteria) this;
        }

        public Criteria andQtyZgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_ZG not between", value1, value2, "qtyZg");
            return (Criteria) this;
        }

        public Criteria andQtyCkIsNull() {
            addCriterion("QTY_CK is null");
            return (Criteria) this;
        }

        public Criteria andQtyCkIsNotNull() {
            addCriterion("QTY_CK is not null");
            return (Criteria) this;
        }

        public Criteria andQtyCkEqualTo(BigDecimal value) {
            addCriterion("QTY_CK =", value, "qtyCk");
            return (Criteria) this;
        }

        public Criteria andQtyCkNotEqualTo(BigDecimal value) {
            addCriterion("QTY_CK <>", value, "qtyCk");
            return (Criteria) this;
        }

        public Criteria andQtyCkGreaterThan(BigDecimal value) {
            addCriterion("QTY_CK >", value, "qtyCk");
            return (Criteria) this;
        }

        public Criteria andQtyCkGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_CK >=", value, "qtyCk");
            return (Criteria) this;
        }

        public Criteria andQtyCkLessThan(BigDecimal value) {
            addCriterion("QTY_CK <", value, "qtyCk");
            return (Criteria) this;
        }

        public Criteria andQtyCkLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_CK <=", value, "qtyCk");
            return (Criteria) this;
        }

        public Criteria andQtyCkIn(List<BigDecimal> values) {
            addCriterion("QTY_CK in", values, "qtyCk");
            return (Criteria) this;
        }

        public Criteria andQtyCkNotIn(List<BigDecimal> values) {
            addCriterion("QTY_CK not in", values, "qtyCk");
            return (Criteria) this;
        }

        public Criteria andQtyCkBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_CK between", value1, value2, "qtyCk");
            return (Criteria) this;
        }

        public Criteria andQtyCkNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_CK not between", value1, value2, "qtyCk");
            return (Criteria) this;
        }

        public Criteria andQtySqIsNull() {
            addCriterion("QTY_SQ is null");
            return (Criteria) this;
        }

        public Criteria andQtySqIsNotNull() {
            addCriterion("QTY_SQ is not null");
            return (Criteria) this;
        }

        public Criteria andQtySqEqualTo(BigDecimal value) {
            addCriterion("QTY_SQ =", value, "qtySq");
            return (Criteria) this;
        }

        public Criteria andQtySqNotEqualTo(BigDecimal value) {
            addCriterion("QTY_SQ <>", value, "qtySq");
            return (Criteria) this;
        }

        public Criteria andQtySqGreaterThan(BigDecimal value) {
            addCriterion("QTY_SQ >", value, "qtySq");
            return (Criteria) this;
        }

        public Criteria andQtySqGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_SQ >=", value, "qtySq");
            return (Criteria) this;
        }

        public Criteria andQtySqLessThan(BigDecimal value) {
            addCriterion("QTY_SQ <", value, "qtySq");
            return (Criteria) this;
        }

        public Criteria andQtySqLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_SQ <=", value, "qtySq");
            return (Criteria) this;
        }

        public Criteria andQtySqIn(List<BigDecimal> values) {
            addCriterion("QTY_SQ in", values, "qtySq");
            return (Criteria) this;
        }

        public Criteria andQtySqNotIn(List<BigDecimal> values) {
            addCriterion("QTY_SQ not in", values, "qtySq");
            return (Criteria) this;
        }

        public Criteria andQtySqBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_SQ between", value1, value2, "qtySq");
            return (Criteria) this;
        }

        public Criteria andQtySqNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_SQ not between", value1, value2, "qtySq");
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

        public Criteria andChqcDdIsNull() {
            addCriterion("CHQC_DD is null");
            return (Criteria) this;
        }

        public Criteria andChqcDdIsNotNull() {
            addCriterion("CHQC_DD is not null");
            return (Criteria) this;
        }

        public Criteria andChqcDdEqualTo(Date value) {
            addCriterion("CHQC_DD =", value, "chqcDd");
            return (Criteria) this;
        }

        public Criteria andChqcDdNotEqualTo(Date value) {
            addCriterion("CHQC_DD <>", value, "chqcDd");
            return (Criteria) this;
        }

        public Criteria andChqcDdGreaterThan(Date value) {
            addCriterion("CHQC_DD >", value, "chqcDd");
            return (Criteria) this;
        }

        public Criteria andChqcDdGreaterThanOrEqualTo(Date value) {
            addCriterion("CHQC_DD >=", value, "chqcDd");
            return (Criteria) this;
        }

        public Criteria andChqcDdLessThan(Date value) {
            addCriterion("CHQC_DD <", value, "chqcDd");
            return (Criteria) this;
        }

        public Criteria andChqcDdLessThanOrEqualTo(Date value) {
            addCriterion("CHQC_DD <=", value, "chqcDd");
            return (Criteria) this;
        }

        public Criteria andChqcDdIn(List<Date> values) {
            addCriterion("CHQC_DD in", values, "chqcDd");
            return (Criteria) this;
        }

        public Criteria andChqcDdNotIn(List<Date> values) {
            addCriterion("CHQC_DD not in", values, "chqcDd");
            return (Criteria) this;
        }

        public Criteria andChqcDdBetween(Date value1, Date value2) {
            addCriterion("CHQC_DD between", value1, value2, "chqcDd");
            return (Criteria) this;
        }

        public Criteria andChqcDdNotBetween(Date value1, Date value2) {
            addCriterion("CHQC_DD not between", value1, value2, "chqcDd");
            return (Criteria) this;
        }

        public Criteria andQtySwIsNull() {
            addCriterion("QTY_SW is null");
            return (Criteria) this;
        }

        public Criteria andQtySwIsNotNull() {
            addCriterion("QTY_SW is not null");
            return (Criteria) this;
        }

        public Criteria andQtySwEqualTo(BigDecimal value) {
            addCriterion("QTY_SW =", value, "qtySw");
            return (Criteria) this;
        }

        public Criteria andQtySwNotEqualTo(BigDecimal value) {
            addCriterion("QTY_SW <>", value, "qtySw");
            return (Criteria) this;
        }

        public Criteria andQtySwGreaterThan(BigDecimal value) {
            addCriterion("QTY_SW >", value, "qtySw");
            return (Criteria) this;
        }

        public Criteria andQtySwGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_SW >=", value, "qtySw");
            return (Criteria) this;
        }

        public Criteria andQtySwLessThan(BigDecimal value) {
            addCriterion("QTY_SW <", value, "qtySw");
            return (Criteria) this;
        }

        public Criteria andQtySwLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_SW <=", value, "qtySw");
            return (Criteria) this;
        }

        public Criteria andQtySwIn(List<BigDecimal> values) {
            addCriterion("QTY_SW in", values, "qtySw");
            return (Criteria) this;
        }

        public Criteria andQtySwNotIn(List<BigDecimal> values) {
            addCriterion("QTY_SW not in", values, "qtySw");
            return (Criteria) this;
        }

        public Criteria andQtySwBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_SW between", value1, value2, "qtySw");
            return (Criteria) this;
        }

        public Criteria andQtySwNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_SW not between", value1, value2, "qtySw");
            return (Criteria) this;
        }

        public Criteria andQtyWxIsNull() {
            addCriterion("QTY_WX is null");
            return (Criteria) this;
        }

        public Criteria andQtyWxIsNotNull() {
            addCriterion("QTY_WX is not null");
            return (Criteria) this;
        }

        public Criteria andQtyWxEqualTo(BigDecimal value) {
            addCriterion("QTY_WX =", value, "qtyWx");
            return (Criteria) this;
        }

        public Criteria andQtyWxNotEqualTo(BigDecimal value) {
            addCriterion("QTY_WX <>", value, "qtyWx");
            return (Criteria) this;
        }

        public Criteria andQtyWxGreaterThan(BigDecimal value) {
            addCriterion("QTY_WX >", value, "qtyWx");
            return (Criteria) this;
        }

        public Criteria andQtyWxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_WX >=", value, "qtyWx");
            return (Criteria) this;
        }

        public Criteria andQtyWxLessThan(BigDecimal value) {
            addCriterion("QTY_WX <", value, "qtyWx");
            return (Criteria) this;
        }

        public Criteria andQtyWxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_WX <=", value, "qtyWx");
            return (Criteria) this;
        }

        public Criteria andQtyWxIn(List<BigDecimal> values) {
            addCriterion("QTY_WX in", values, "qtyWx");
            return (Criteria) this;
        }

        public Criteria andQtyWxNotIn(List<BigDecimal> values) {
            addCriterion("QTY_WX not in", values, "qtyWx");
            return (Criteria) this;
        }

        public Criteria andQtyWxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_WX between", value1, value2, "qtyWx");
            return (Criteria) this;
        }

        public Criteria andQtyWxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_WX not between", value1, value2, "qtyWx");
            return (Criteria) this;
        }

        public Criteria andQtyWsIsNull() {
            addCriterion("QTY_WS is null");
            return (Criteria) this;
        }

        public Criteria andQtyWsIsNotNull() {
            addCriterion("QTY_WS is not null");
            return (Criteria) this;
        }

        public Criteria andQtyWsEqualTo(BigDecimal value) {
            addCriterion("QTY_WS =", value, "qtyWs");
            return (Criteria) this;
        }

        public Criteria andQtyWsNotEqualTo(BigDecimal value) {
            addCriterion("QTY_WS <>", value, "qtyWs");
            return (Criteria) this;
        }

        public Criteria andQtyWsGreaterThan(BigDecimal value) {
            addCriterion("QTY_WS >", value, "qtyWs");
            return (Criteria) this;
        }

        public Criteria andQtyWsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_WS >=", value, "qtyWs");
            return (Criteria) this;
        }

        public Criteria andQtyWsLessThan(BigDecimal value) {
            addCriterion("QTY_WS <", value, "qtyWs");
            return (Criteria) this;
        }

        public Criteria andQtyWsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_WS <=", value, "qtyWs");
            return (Criteria) this;
        }

        public Criteria andQtyWsIn(List<BigDecimal> values) {
            addCriterion("QTY_WS in", values, "qtyWs");
            return (Criteria) this;
        }

        public Criteria andQtyWsNotIn(List<BigDecimal> values) {
            addCriterion("QTY_WS not in", values, "qtyWs");
            return (Criteria) this;
        }

        public Criteria andQtyWsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_WS between", value1, value2, "qtyWs");
            return (Criteria) this;
        }

        public Criteria andQtyWsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_WS not between", value1, value2, "qtyWs");
            return (Criteria) this;
        }

        public Criteria andQtyWsKcIsNull() {
            addCriterion("QTY_WS_KC is null");
            return (Criteria) this;
        }

        public Criteria andQtyWsKcIsNotNull() {
            addCriterion("QTY_WS_KC is not null");
            return (Criteria) this;
        }

        public Criteria andQtyWsKcEqualTo(BigDecimal value) {
            addCriterion("QTY_WS_KC =", value, "qtyWsKc");
            return (Criteria) this;
        }

        public Criteria andQtyWsKcNotEqualTo(BigDecimal value) {
            addCriterion("QTY_WS_KC <>", value, "qtyWsKc");
            return (Criteria) this;
        }

        public Criteria andQtyWsKcGreaterThan(BigDecimal value) {
            addCriterion("QTY_WS_KC >", value, "qtyWsKc");
            return (Criteria) this;
        }

        public Criteria andQtyWsKcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_WS_KC >=", value, "qtyWsKc");
            return (Criteria) this;
        }

        public Criteria andQtyWsKcLessThan(BigDecimal value) {
            addCriterion("QTY_WS_KC <", value, "qtyWsKc");
            return (Criteria) this;
        }

        public Criteria andQtyWsKcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_WS_KC <=", value, "qtyWsKc");
            return (Criteria) this;
        }

        public Criteria andQtyWsKcIn(List<BigDecimal> values) {
            addCriterion("QTY_WS_KC in", values, "qtyWsKc");
            return (Criteria) this;
        }

        public Criteria andQtyWsKcNotIn(List<BigDecimal> values) {
            addCriterion("QTY_WS_KC not in", values, "qtyWsKc");
            return (Criteria) this;
        }

        public Criteria andQtyWsKcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_WS_KC between", value1, value2, "qtyWsKc");
            return (Criteria) this;
        }

        public Criteria andQtyWsKcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_WS_KC not between", value1, value2, "qtyWsKc");
            return (Criteria) this;
        }

        public Criteria andQtyQlIsNull() {
            addCriterion("QTY_QL is null");
            return (Criteria) this;
        }

        public Criteria andQtyQlIsNotNull() {
            addCriterion("QTY_QL is not null");
            return (Criteria) this;
        }

        public Criteria andQtyQlEqualTo(BigDecimal value) {
            addCriterion("QTY_QL =", value, "qtyQl");
            return (Criteria) this;
        }

        public Criteria andQtyQlNotEqualTo(BigDecimal value) {
            addCriterion("QTY_QL <>", value, "qtyQl");
            return (Criteria) this;
        }

        public Criteria andQtyQlGreaterThan(BigDecimal value) {
            addCriterion("QTY_QL >", value, "qtyQl");
            return (Criteria) this;
        }

        public Criteria andQtyQlGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_QL >=", value, "qtyQl");
            return (Criteria) this;
        }

        public Criteria andQtyQlLessThan(BigDecimal value) {
            addCriterion("QTY_QL <", value, "qtyQl");
            return (Criteria) this;
        }

        public Criteria andQtyQlLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_QL <=", value, "qtyQl");
            return (Criteria) this;
        }

        public Criteria andQtyQlIn(List<BigDecimal> values) {
            addCriterion("QTY_QL in", values, "qtyQl");
            return (Criteria) this;
        }

        public Criteria andQtyQlNotIn(List<BigDecimal> values) {
            addCriterion("QTY_QL not in", values, "qtyQl");
            return (Criteria) this;
        }

        public Criteria andQtyQlBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_QL between", value1, value2, "qtyQl");
            return (Criteria) this;
        }

        public Criteria andQtyQlNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_QL not between", value1, value2, "qtyQl");
            return (Criteria) this;
        }

        public Criteria andQtyQ2IsNull() {
            addCriterion("QTY_Q2 is null");
            return (Criteria) this;
        }

        public Criteria andQtyQ2IsNotNull() {
            addCriterion("QTY_Q2 is not null");
            return (Criteria) this;
        }

        public Criteria andQtyQ2EqualTo(BigDecimal value) {
            addCriterion("QTY_Q2 =", value, "qtyQ2");
            return (Criteria) this;
        }

        public Criteria andQtyQ2NotEqualTo(BigDecimal value) {
            addCriterion("QTY_Q2 <>", value, "qtyQ2");
            return (Criteria) this;
        }

        public Criteria andQtyQ2GreaterThan(BigDecimal value) {
            addCriterion("QTY_Q2 >", value, "qtyQ2");
            return (Criteria) this;
        }

        public Criteria andQtyQ2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_Q2 >=", value, "qtyQ2");
            return (Criteria) this;
        }

        public Criteria andQtyQ2LessThan(BigDecimal value) {
            addCriterion("QTY_Q2 <", value, "qtyQ2");
            return (Criteria) this;
        }

        public Criteria andQtyQ2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_Q2 <=", value, "qtyQ2");
            return (Criteria) this;
        }

        public Criteria andQtyQ2In(List<BigDecimal> values) {
            addCriterion("QTY_Q2 in", values, "qtyQ2");
            return (Criteria) this;
        }

        public Criteria andQtyQ2NotIn(List<BigDecimal> values) {
            addCriterion("QTY_Q2 not in", values, "qtyQ2");
            return (Criteria) this;
        }

        public Criteria andQtyQ2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_Q2 between", value1, value2, "qtyQ2");
            return (Criteria) this;
        }

        public Criteria andQtyQ2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_Q2 not between", value1, value2, "qtyQ2");
            return (Criteria) this;
        }

        public Criteria andQtyQ2YlIsNull() {
            addCriterion("QTY_Q2_YL is null");
            return (Criteria) this;
        }

        public Criteria andQtyQ2YlIsNotNull() {
            addCriterion("QTY_Q2_YL is not null");
            return (Criteria) this;
        }

        public Criteria andQtyQ2YlEqualTo(BigDecimal value) {
            addCriterion("QTY_Q2_YL =", value, "qtyQ2Yl");
            return (Criteria) this;
        }

        public Criteria andQtyQ2YlNotEqualTo(BigDecimal value) {
            addCriterion("QTY_Q2_YL <>", value, "qtyQ2Yl");
            return (Criteria) this;
        }

        public Criteria andQtyQ2YlGreaterThan(BigDecimal value) {
            addCriterion("QTY_Q2_YL >", value, "qtyQ2Yl");
            return (Criteria) this;
        }

        public Criteria andQtyQ2YlGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_Q2_YL >=", value, "qtyQ2Yl");
            return (Criteria) this;
        }

        public Criteria andQtyQ2YlLessThan(BigDecimal value) {
            addCriterion("QTY_Q2_YL <", value, "qtyQ2Yl");
            return (Criteria) this;
        }

        public Criteria andQtyQ2YlLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_Q2_YL <=", value, "qtyQ2Yl");
            return (Criteria) this;
        }

        public Criteria andQtyQ2YlIn(List<BigDecimal> values) {
            addCriterion("QTY_Q2_YL in", values, "qtyQ2Yl");
            return (Criteria) this;
        }

        public Criteria andQtyQ2YlNotIn(List<BigDecimal> values) {
            addCriterion("QTY_Q2_YL not in", values, "qtyQ2Yl");
            return (Criteria) this;
        }

        public Criteria andQtyQ2YlBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_Q2_YL between", value1, value2, "qtyQ2Yl");
            return (Criteria) this;
        }

        public Criteria andQtyQ2YlNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_Q2_YL not between", value1, value2, "qtyQ2Yl");
            return (Criteria) this;
        }

        public Criteria andQtyQ3IsNull() {
            addCriterion("QTY_Q3 is null");
            return (Criteria) this;
        }

        public Criteria andQtyQ3IsNotNull() {
            addCriterion("QTY_Q3 is not null");
            return (Criteria) this;
        }

        public Criteria andQtyQ3EqualTo(BigDecimal value) {
            addCriterion("QTY_Q3 =", value, "qtyQ3");
            return (Criteria) this;
        }

        public Criteria andQtyQ3NotEqualTo(BigDecimal value) {
            addCriterion("QTY_Q3 <>", value, "qtyQ3");
            return (Criteria) this;
        }

        public Criteria andQtyQ3GreaterThan(BigDecimal value) {
            addCriterion("QTY_Q3 >", value, "qtyQ3");
            return (Criteria) this;
        }

        public Criteria andQtyQ3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_Q3 >=", value, "qtyQ3");
            return (Criteria) this;
        }

        public Criteria andQtyQ3LessThan(BigDecimal value) {
            addCriterion("QTY_Q3 <", value, "qtyQ3");
            return (Criteria) this;
        }

        public Criteria andQtyQ3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_Q3 <=", value, "qtyQ3");
            return (Criteria) this;
        }

        public Criteria andQtyQ3In(List<BigDecimal> values) {
            addCriterion("QTY_Q3 in", values, "qtyQ3");
            return (Criteria) this;
        }

        public Criteria andQtyQ3NotIn(List<BigDecimal> values) {
            addCriterion("QTY_Q3 not in", values, "qtyQ3");
            return (Criteria) this;
        }

        public Criteria andQtyQ3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_Q3 between", value1, value2, "qtyQ3");
            return (Criteria) this;
        }

        public Criteria andQtyQ3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_Q3 not between", value1, value2, "qtyQ3");
            return (Criteria) this;
        }

        public Criteria andCstBxIsNull() {
            addCriterion("CST_BX is null");
            return (Criteria) this;
        }

        public Criteria andCstBxIsNotNull() {
            addCriterion("CST_BX is not null");
            return (Criteria) this;
        }

        public Criteria andCstBxEqualTo(BigDecimal value) {
            addCriterion("CST_BX =", value, "cstBx");
            return (Criteria) this;
        }

        public Criteria andCstBxNotEqualTo(BigDecimal value) {
            addCriterion("CST_BX <>", value, "cstBx");
            return (Criteria) this;
        }

        public Criteria andCstBxGreaterThan(BigDecimal value) {
            addCriterion("CST_BX >", value, "cstBx");
            return (Criteria) this;
        }

        public Criteria andCstBxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_BX >=", value, "cstBx");
            return (Criteria) this;
        }

        public Criteria andCstBxLessThan(BigDecimal value) {
            addCriterion("CST_BX <", value, "cstBx");
            return (Criteria) this;
        }

        public Criteria andCstBxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_BX <=", value, "cstBx");
            return (Criteria) this;
        }

        public Criteria andCstBxIn(List<BigDecimal> values) {
            addCriterion("CST_BX in", values, "cstBx");
            return (Criteria) this;
        }

        public Criteria andCstBxNotIn(List<BigDecimal> values) {
            addCriterion("CST_BX not in", values, "cstBx");
            return (Criteria) this;
        }

        public Criteria andCstBxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_BX between", value1, value2, "cstBx");
            return (Criteria) this;
        }

        public Criteria andCstBxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_BX not between", value1, value2, "cstBx");
            return (Criteria) this;
        }

        public Criteria andQtySqrIsNull() {
            addCriterion("QTY_SQR is null");
            return (Criteria) this;
        }

        public Criteria andQtySqrIsNotNull() {
            addCriterion("QTY_SQR is not null");
            return (Criteria) this;
        }

        public Criteria andQtySqrEqualTo(BigDecimal value) {
            addCriterion("QTY_SQR =", value, "qtySqr");
            return (Criteria) this;
        }

        public Criteria andQtySqrNotEqualTo(BigDecimal value) {
            addCriterion("QTY_SQR <>", value, "qtySqr");
            return (Criteria) this;
        }

        public Criteria andQtySqrGreaterThan(BigDecimal value) {
            addCriterion("QTY_SQR >", value, "qtySqr");
            return (Criteria) this;
        }

        public Criteria andQtySqrGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_SQR >=", value, "qtySqr");
            return (Criteria) this;
        }

        public Criteria andQtySqrLessThan(BigDecimal value) {
            addCriterion("QTY_SQR <", value, "qtySqr");
            return (Criteria) this;
        }

        public Criteria andQtySqrLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_SQR <=", value, "qtySqr");
            return (Criteria) this;
        }

        public Criteria andQtySqrIn(List<BigDecimal> values) {
            addCriterion("QTY_SQR in", values, "qtySqr");
            return (Criteria) this;
        }

        public Criteria andQtySqrNotIn(List<BigDecimal> values) {
            addCriterion("QTY_SQR not in", values, "qtySqr");
            return (Criteria) this;
        }

        public Criteria andQtySqrBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_SQR between", value1, value2, "qtySqr");
            return (Criteria) this;
        }

        public Criteria andQtySqrNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_SQR not between", value1, value2, "qtySqr");
            return (Criteria) this;
        }

        public Criteria andQtySqcIsNull() {
            addCriterion("QTY_SQC is null");
            return (Criteria) this;
        }

        public Criteria andQtySqcIsNotNull() {
            addCriterion("QTY_SQC is not null");
            return (Criteria) this;
        }

        public Criteria andQtySqcEqualTo(BigDecimal value) {
            addCriterion("QTY_SQC =", value, "qtySqc");
            return (Criteria) this;
        }

        public Criteria andQtySqcNotEqualTo(BigDecimal value) {
            addCriterion("QTY_SQC <>", value, "qtySqc");
            return (Criteria) this;
        }

        public Criteria andQtySqcGreaterThan(BigDecimal value) {
            addCriterion("QTY_SQC >", value, "qtySqc");
            return (Criteria) this;
        }

        public Criteria andQtySqcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_SQC >=", value, "qtySqc");
            return (Criteria) this;
        }

        public Criteria andQtySqcLessThan(BigDecimal value) {
            addCriterion("QTY_SQC <", value, "qtySqc");
            return (Criteria) this;
        }

        public Criteria andQtySqcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_SQC <=", value, "qtySqc");
            return (Criteria) this;
        }

        public Criteria andQtySqcIn(List<BigDecimal> values) {
            addCriterion("QTY_SQC in", values, "qtySqc");
            return (Criteria) this;
        }

        public Criteria andQtySqcNotIn(List<BigDecimal> values) {
            addCriterion("QTY_SQC not in", values, "qtySqc");
            return (Criteria) this;
        }

        public Criteria andQtySqcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_SQC between", value1, value2, "qtySqc");
            return (Criteria) this;
        }

        public Criteria andQtySqcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_SQC not between", value1, value2, "qtySqc");
            return (Criteria) this;
        }

        public Criteria andQtyLockIsNull() {
            addCriterion("QTY_LOCK is null");
            return (Criteria) this;
        }

        public Criteria andQtyLockIsNotNull() {
            addCriterion("QTY_LOCK is not null");
            return (Criteria) this;
        }

        public Criteria andQtyLockEqualTo(BigDecimal value) {
            addCriterion("QTY_LOCK =", value, "qtyLock");
            return (Criteria) this;
        }

        public Criteria andQtyLockNotEqualTo(BigDecimal value) {
            addCriterion("QTY_LOCK <>", value, "qtyLock");
            return (Criteria) this;
        }

        public Criteria andQtyLockGreaterThan(BigDecimal value) {
            addCriterion("QTY_LOCK >", value, "qtyLock");
            return (Criteria) this;
        }

        public Criteria andQtyLockGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_LOCK >=", value, "qtyLock");
            return (Criteria) this;
        }

        public Criteria andQtyLockLessThan(BigDecimal value) {
            addCriterion("QTY_LOCK <", value, "qtyLock");
            return (Criteria) this;
        }

        public Criteria andQtyLockLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_LOCK <=", value, "qtyLock");
            return (Criteria) this;
        }

        public Criteria andQtyLockIn(List<BigDecimal> values) {
            addCriterion("QTY_LOCK in", values, "qtyLock");
            return (Criteria) this;
        }

        public Criteria andQtyLockNotIn(List<BigDecimal> values) {
            addCriterion("QTY_LOCK not in", values, "qtyLock");
            return (Criteria) this;
        }

        public Criteria andQtyLockBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_LOCK between", value1, value2, "qtyLock");
            return (Criteria) this;
        }

        public Criteria andQtyLockNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_LOCK not between", value1, value2, "qtyLock");
            return (Criteria) this;
        }

        public Criteria andScDdIsNull() {
            addCriterion("SC_DD is null");
            return (Criteria) this;
        }

        public Criteria andScDdIsNotNull() {
            addCriterion("SC_DD is not null");
            return (Criteria) this;
        }

        public Criteria andScDdEqualTo(Date value) {
            addCriterion("SC_DD =", value, "scDd");
            return (Criteria) this;
        }

        public Criteria andScDdNotEqualTo(Date value) {
            addCriterion("SC_DD <>", value, "scDd");
            return (Criteria) this;
        }

        public Criteria andScDdGreaterThan(Date value) {
            addCriterion("SC_DD >", value, "scDd");
            return (Criteria) this;
        }

        public Criteria andScDdGreaterThanOrEqualTo(Date value) {
            addCriterion("SC_DD >=", value, "scDd");
            return (Criteria) this;
        }

        public Criteria andScDdLessThan(Date value) {
            addCriterion("SC_DD <", value, "scDd");
            return (Criteria) this;
        }

        public Criteria andScDdLessThanOrEqualTo(Date value) {
            addCriterion("SC_DD <=", value, "scDd");
            return (Criteria) this;
        }

        public Criteria andScDdIn(List<Date> values) {
            addCriterion("SC_DD in", values, "scDd");
            return (Criteria) this;
        }

        public Criteria andScDdNotIn(List<Date> values) {
            addCriterion("SC_DD not in", values, "scDd");
            return (Criteria) this;
        }

        public Criteria andScDdBetween(Date value1, Date value2) {
            addCriterion("SC_DD between", value1, value2, "scDd");
            return (Criteria) this;
        }

        public Criteria andScDdNotBetween(Date value1, Date value2) {
            addCriterion("SC_DD not between", value1, value2, "scDd");
            return (Criteria) this;
        }

        public Criteria andQtyJhIsNull() {
            addCriterion("QTY_JH is null");
            return (Criteria) this;
        }

        public Criteria andQtyJhIsNotNull() {
            addCriterion("QTY_JH is not null");
            return (Criteria) this;
        }

        public Criteria andQtyJhEqualTo(BigDecimal value) {
            addCriterion("QTY_JH =", value, "qtyJh");
            return (Criteria) this;
        }

        public Criteria andQtyJhNotEqualTo(BigDecimal value) {
            addCriterion("QTY_JH <>", value, "qtyJh");
            return (Criteria) this;
        }

        public Criteria andQtyJhGreaterThan(BigDecimal value) {
            addCriterion("QTY_JH >", value, "qtyJh");
            return (Criteria) this;
        }

        public Criteria andQtyJhGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_JH >=", value, "qtyJh");
            return (Criteria) this;
        }

        public Criteria andQtyJhLessThan(BigDecimal value) {
            addCriterion("QTY_JH <", value, "qtyJh");
            return (Criteria) this;
        }

        public Criteria andQtyJhLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_JH <=", value, "qtyJh");
            return (Criteria) this;
        }

        public Criteria andQtyJhIn(List<BigDecimal> values) {
            addCriterion("QTY_JH in", values, "qtyJh");
            return (Criteria) this;
        }

        public Criteria andQtyJhNotIn(List<BigDecimal> values) {
            addCriterion("QTY_JH not in", values, "qtyJh");
            return (Criteria) this;
        }

        public Criteria andQtyJhBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_JH between", value1, value2, "qtyJh");
            return (Criteria) this;
        }

        public Criteria andQtyJhNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_JH not between", value1, value2, "qtyJh");
            return (Criteria) this;
        }

        public Criteria andLstOtdQcIsNull() {
            addCriterion("LST_OTD_QC is null");
            return (Criteria) this;
        }

        public Criteria andLstOtdQcIsNotNull() {
            addCriterion("LST_OTD_QC is not null");
            return (Criteria) this;
        }

        public Criteria andLstOtdQcEqualTo(Date value) {
            addCriterion("LST_OTD_QC =", value, "lstOtdQc");
            return (Criteria) this;
        }

        public Criteria andLstOtdQcNotEqualTo(Date value) {
            addCriterion("LST_OTD_QC <>", value, "lstOtdQc");
            return (Criteria) this;
        }

        public Criteria andLstOtdQcGreaterThan(Date value) {
            addCriterion("LST_OTD_QC >", value, "lstOtdQc");
            return (Criteria) this;
        }

        public Criteria andLstOtdQcGreaterThanOrEqualTo(Date value) {
            addCriterion("LST_OTD_QC >=", value, "lstOtdQc");
            return (Criteria) this;
        }

        public Criteria andLstOtdQcLessThan(Date value) {
            addCriterion("LST_OTD_QC <", value, "lstOtdQc");
            return (Criteria) this;
        }

        public Criteria andLstOtdQcLessThanOrEqualTo(Date value) {
            addCriterion("LST_OTD_QC <=", value, "lstOtdQc");
            return (Criteria) this;
        }

        public Criteria andLstOtdQcIn(List<Date> values) {
            addCriterion("LST_OTD_QC in", values, "lstOtdQc");
            return (Criteria) this;
        }

        public Criteria andLstOtdQcNotIn(List<Date> values) {
            addCriterion("LST_OTD_QC not in", values, "lstOtdQc");
            return (Criteria) this;
        }

        public Criteria andLstOtdQcBetween(Date value1, Date value2) {
            addCriterion("LST_OTD_QC between", value1, value2, "lstOtdQc");
            return (Criteria) this;
        }

        public Criteria andLstOtdQcNotBetween(Date value1, Date value2) {
            addCriterion("LST_OTD_QC not between", value1, value2, "lstOtdQc");
            return (Criteria) this;
        }

        public Criteria andLstIndQcIsNull() {
            addCriterion("LST_IND_QC is null");
            return (Criteria) this;
        }

        public Criteria andLstIndQcIsNotNull() {
            addCriterion("LST_IND_QC is not null");
            return (Criteria) this;
        }

        public Criteria andLstIndQcEqualTo(Date value) {
            addCriterion("LST_IND_QC =", value, "lstIndQc");
            return (Criteria) this;
        }

        public Criteria andLstIndQcNotEqualTo(Date value) {
            addCriterion("LST_IND_QC <>", value, "lstIndQc");
            return (Criteria) this;
        }

        public Criteria andLstIndQcGreaterThan(Date value) {
            addCriterion("LST_IND_QC >", value, "lstIndQc");
            return (Criteria) this;
        }

        public Criteria andLstIndQcGreaterThanOrEqualTo(Date value) {
            addCriterion("LST_IND_QC >=", value, "lstIndQc");
            return (Criteria) this;
        }

        public Criteria andLstIndQcLessThan(Date value) {
            addCriterion("LST_IND_QC <", value, "lstIndQc");
            return (Criteria) this;
        }

        public Criteria andLstIndQcLessThanOrEqualTo(Date value) {
            addCriterion("LST_IND_QC <=", value, "lstIndQc");
            return (Criteria) this;
        }

        public Criteria andLstIndQcIn(List<Date> values) {
            addCriterion("LST_IND_QC in", values, "lstIndQc");
            return (Criteria) this;
        }

        public Criteria andLstIndQcNotIn(List<Date> values) {
            addCriterion("LST_IND_QC not in", values, "lstIndQc");
            return (Criteria) this;
        }

        public Criteria andLstIndQcBetween(Date value1, Date value2) {
            addCriterion("LST_IND_QC between", value1, value2, "lstIndQc");
            return (Criteria) this;
        }

        public Criteria andLstIndQcNotBetween(Date value1, Date value2) {
            addCriterion("LST_IND_QC not between", value1, value2, "lstIndQc");
            return (Criteria) this;
        }

        public Criteria andQty1LockIsNull() {
            addCriterion("QTY1_LOCK is null");
            return (Criteria) this;
        }

        public Criteria andQty1LockIsNotNull() {
            addCriterion("QTY1_LOCK is not null");
            return (Criteria) this;
        }

        public Criteria andQty1LockEqualTo(BigDecimal value) {
            addCriterion("QTY1_LOCK =", value, "qty1Lock");
            return (Criteria) this;
        }

        public Criteria andQty1LockNotEqualTo(BigDecimal value) {
            addCriterion("QTY1_LOCK <>", value, "qty1Lock");
            return (Criteria) this;
        }

        public Criteria andQty1LockGreaterThan(BigDecimal value) {
            addCriterion("QTY1_LOCK >", value, "qty1Lock");
            return (Criteria) this;
        }

        public Criteria andQty1LockGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_LOCK >=", value, "qty1Lock");
            return (Criteria) this;
        }

        public Criteria andQty1LockLessThan(BigDecimal value) {
            addCriterion("QTY1_LOCK <", value, "qty1Lock");
            return (Criteria) this;
        }

        public Criteria andQty1LockLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_LOCK <=", value, "qty1Lock");
            return (Criteria) this;
        }

        public Criteria andQty1LockIn(List<BigDecimal> values) {
            addCriterion("QTY1_LOCK in", values, "qty1Lock");
            return (Criteria) this;
        }

        public Criteria andQty1LockNotIn(List<BigDecimal> values) {
            addCriterion("QTY1_LOCK not in", values, "qty1Lock");
            return (Criteria) this;
        }

        public Criteria andQty1LockBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_LOCK between", value1, value2, "qty1Lock");
            return (Criteria) this;
        }

        public Criteria andQty1LockNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_LOCK not between", value1, value2, "qty1Lock");
            return (Criteria) this;
        }

        public Criteria andQtyT3IsNull() {
            addCriterion("QTY_T3 is null");
            return (Criteria) this;
        }

        public Criteria andQtyT3IsNotNull() {
            addCriterion("QTY_T3 is not null");
            return (Criteria) this;
        }

        public Criteria andQtyT3EqualTo(BigDecimal value) {
            addCriterion("QTY_T3 =", value, "qtyT3");
            return (Criteria) this;
        }

        public Criteria andQtyT3NotEqualTo(BigDecimal value) {
            addCriterion("QTY_T3 <>", value, "qtyT3");
            return (Criteria) this;
        }

        public Criteria andQtyT3GreaterThan(BigDecimal value) {
            addCriterion("QTY_T3 >", value, "qtyT3");
            return (Criteria) this;
        }

        public Criteria andQtyT3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_T3 >=", value, "qtyT3");
            return (Criteria) this;
        }

        public Criteria andQtyT3LessThan(BigDecimal value) {
            addCriterion("QTY_T3 <", value, "qtyT3");
            return (Criteria) this;
        }

        public Criteria andQtyT3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_T3 <=", value, "qtyT3");
            return (Criteria) this;
        }

        public Criteria andQtyT3In(List<BigDecimal> values) {
            addCriterion("QTY_T3 in", values, "qtyT3");
            return (Criteria) this;
        }

        public Criteria andQtyT3NotIn(List<BigDecimal> values) {
            addCriterion("QTY_T3 not in", values, "qtyT3");
            return (Criteria) this;
        }

        public Criteria andQtyT3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_T3 between", value1, value2, "qtyT3");
            return (Criteria) this;
        }

        public Criteria andQtyT3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_T3 not between", value1, value2, "qtyT3");
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