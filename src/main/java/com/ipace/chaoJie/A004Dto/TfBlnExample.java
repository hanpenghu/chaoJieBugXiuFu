package com.ipace.chaoJie.A004Dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TfBlnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TfBlnExample() {
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

        public Criteria andItmIsNull() {
            addCriterion("ITM is null");
            return (Criteria) this;
        }

        public Criteria andItmIsNotNull() {
            addCriterion("ITM is not null");
            return (Criteria) this;
        }

        public Criteria andItmEqualTo(Integer value) {
            addCriterion("ITM =", value, "itm");
            return (Criteria) this;
        }

        public Criteria andItmNotEqualTo(Integer value) {
            addCriterion("ITM <>", value, "itm");
            return (Criteria) this;
        }

        public Criteria andItmGreaterThan(Integer value) {
            addCriterion("ITM >", value, "itm");
            return (Criteria) this;
        }

        public Criteria andItmGreaterThanOrEqualTo(Integer value) {
            addCriterion("ITM >=", value, "itm");
            return (Criteria) this;
        }

        public Criteria andItmLessThan(Integer value) {
            addCriterion("ITM <", value, "itm");
            return (Criteria) this;
        }

        public Criteria andItmLessThanOrEqualTo(Integer value) {
            addCriterion("ITM <=", value, "itm");
            return (Criteria) this;
        }

        public Criteria andItmIn(List<Integer> values) {
            addCriterion("ITM in", values, "itm");
            return (Criteria) this;
        }

        public Criteria andItmNotIn(List<Integer> values) {
            addCriterion("ITM not in", values, "itm");
            return (Criteria) this;
        }

        public Criteria andItmBetween(Integer value1, Integer value2) {
            addCriterion("ITM between", value1, value2, "itm");
            return (Criteria) this;
        }

        public Criteria andItmNotBetween(Integer value1, Integer value2) {
            addCriterion("ITM not between", value1, value2, "itm");
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

        public Criteria andPrdNameIsNull() {
            addCriterion("PRD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPrdNameIsNotNull() {
            addCriterion("PRD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPrdNameEqualTo(String value) {
            addCriterion("PRD_NAME =", value, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameNotEqualTo(String value) {
            addCriterion("PRD_NAME <>", value, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameGreaterThan(String value) {
            addCriterion("PRD_NAME >", value, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRD_NAME >=", value, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameLessThan(String value) {
            addCriterion("PRD_NAME <", value, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameLessThanOrEqualTo(String value) {
            addCriterion("PRD_NAME <=", value, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameLike(String value) {
            addCriterion("PRD_NAME like", value, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameNotLike(String value) {
            addCriterion("PRD_NAME not like", value, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameIn(List<String> values) {
            addCriterion("PRD_NAME in", values, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameNotIn(List<String> values) {
            addCriterion("PRD_NAME not in", values, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameBetween(String value1, String value2) {
            addCriterion("PRD_NAME between", value1, value2, "prdName");
            return (Criteria) this;
        }

        public Criteria andPrdNameNotBetween(String value1, String value2) {
            addCriterion("PRD_NAME not between", value1, value2, "prdName");
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

        public Criteria andUnitIsNull() {
            addCriterion("UNIT is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("UNIT =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("UNIT <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("UNIT >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("UNIT <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("UNIT <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("UNIT like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("UNIT not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("UNIT in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("UNIT not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("UNIT between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("UNIT not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andQtyIsNull() {
            addCriterion("QTY is null");
            return (Criteria) this;
        }

        public Criteria andQtyIsNotNull() {
            addCriterion("QTY is not null");
            return (Criteria) this;
        }

        public Criteria andQtyEqualTo(BigDecimal value) {
            addCriterion("QTY =", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotEqualTo(BigDecimal value) {
            addCriterion("QTY <>", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyGreaterThan(BigDecimal value) {
            addCriterion("QTY >", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY >=", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyLessThan(BigDecimal value) {
            addCriterion("QTY <", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY <=", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyIn(List<BigDecimal> values) {
            addCriterion("QTY in", values, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotIn(List<BigDecimal> values) {
            addCriterion("QTY not in", values, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY between", value1, value2, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY not between", value1, value2, "qty");
            return (Criteria) this;
        }

        public Criteria andQty1IsNull() {
            addCriterion("QTY1 is null");
            return (Criteria) this;
        }

        public Criteria andQty1IsNotNull() {
            addCriterion("QTY1 is not null");
            return (Criteria) this;
        }

        public Criteria andQty1EqualTo(BigDecimal value) {
            addCriterion("QTY1 =", value, "qty1");
            return (Criteria) this;
        }

        public Criteria andQty1NotEqualTo(BigDecimal value) {
            addCriterion("QTY1 <>", value, "qty1");
            return (Criteria) this;
        }

        public Criteria andQty1GreaterThan(BigDecimal value) {
            addCriterion("QTY1 >", value, "qty1");
            return (Criteria) this;
        }

        public Criteria andQty1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1 >=", value, "qty1");
            return (Criteria) this;
        }

        public Criteria andQty1LessThan(BigDecimal value) {
            addCriterion("QTY1 <", value, "qty1");
            return (Criteria) this;
        }

        public Criteria andQty1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1 <=", value, "qty1");
            return (Criteria) this;
        }

        public Criteria andQty1In(List<BigDecimal> values) {
            addCriterion("QTY1 in", values, "qty1");
            return (Criteria) this;
        }

        public Criteria andQty1NotIn(List<BigDecimal> values) {
            addCriterion("QTY1 not in", values, "qty1");
            return (Criteria) this;
        }

        public Criteria andQty1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1 between", value1, value2, "qty1");
            return (Criteria) this;
        }

        public Criteria andQty1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1 not between", value1, value2, "qty1");
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

        public Criteria andAmtRntIsNull() {
            addCriterion("AMT_RNT is null");
            return (Criteria) this;
        }

        public Criteria andAmtRntIsNotNull() {
            addCriterion("AMT_RNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmtRntEqualTo(BigDecimal value) {
            addCriterion("AMT_RNT =", value, "amtRnt");
            return (Criteria) this;
        }

        public Criteria andAmtRntNotEqualTo(BigDecimal value) {
            addCriterion("AMT_RNT <>", value, "amtRnt");
            return (Criteria) this;
        }

        public Criteria andAmtRntGreaterThan(BigDecimal value) {
            addCriterion("AMT_RNT >", value, "amtRnt");
            return (Criteria) this;
        }

        public Criteria andAmtRntGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_RNT >=", value, "amtRnt");
            return (Criteria) this;
        }

        public Criteria andAmtRntLessThan(BigDecimal value) {
            addCriterion("AMT_RNT <", value, "amtRnt");
            return (Criteria) this;
        }

        public Criteria andAmtRntLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_RNT <=", value, "amtRnt");
            return (Criteria) this;
        }

        public Criteria andAmtRntIn(List<BigDecimal> values) {
            addCriterion("AMT_RNT in", values, "amtRnt");
            return (Criteria) this;
        }

        public Criteria andAmtRntNotIn(List<BigDecimal> values) {
            addCriterion("AMT_RNT not in", values, "amtRnt");
            return (Criteria) this;
        }

        public Criteria andAmtRntBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_RNT between", value1, value2, "amtRnt");
            return (Criteria) this;
        }

        public Criteria andAmtRntNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_RNT not between", value1, value2, "amtRnt");
            return (Criteria) this;
        }

        public Criteria andAmtnRntNetIsNull() {
            addCriterion("AMTN_RNT_NET is null");
            return (Criteria) this;
        }

        public Criteria andAmtnRntNetIsNotNull() {
            addCriterion("AMTN_RNT_NET is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnRntNetEqualTo(BigDecimal value) {
            addCriterion("AMTN_RNT_NET =", value, "amtnRntNet");
            return (Criteria) this;
        }

        public Criteria andAmtnRntNetNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_RNT_NET <>", value, "amtnRntNet");
            return (Criteria) this;
        }

        public Criteria andAmtnRntNetGreaterThan(BigDecimal value) {
            addCriterion("AMTN_RNT_NET >", value, "amtnRntNet");
            return (Criteria) this;
        }

        public Criteria andAmtnRntNetGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_RNT_NET >=", value, "amtnRntNet");
            return (Criteria) this;
        }

        public Criteria andAmtnRntNetLessThan(BigDecimal value) {
            addCriterion("AMTN_RNT_NET <", value, "amtnRntNet");
            return (Criteria) this;
        }

        public Criteria andAmtnRntNetLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_RNT_NET <=", value, "amtnRntNet");
            return (Criteria) this;
        }

        public Criteria andAmtnRntNetIn(List<BigDecimal> values) {
            addCriterion("AMTN_RNT_NET in", values, "amtnRntNet");
            return (Criteria) this;
        }

        public Criteria andAmtnRntNetNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_RNT_NET not in", values, "amtnRntNet");
            return (Criteria) this;
        }

        public Criteria andAmtnRntNetBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_RNT_NET between", value1, value2, "amtnRntNet");
            return (Criteria) this;
        }

        public Criteria andAmtnRntNetNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_RNT_NET not between", value1, value2, "amtnRntNet");
            return (Criteria) this;
        }

        public Criteria andTaxRntIsNull() {
            addCriterion("TAX_RNT is null");
            return (Criteria) this;
        }

        public Criteria andTaxRntIsNotNull() {
            addCriterion("TAX_RNT is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRntEqualTo(BigDecimal value) {
            addCriterion("TAX_RNT =", value, "taxRnt");
            return (Criteria) this;
        }

        public Criteria andTaxRntNotEqualTo(BigDecimal value) {
            addCriterion("TAX_RNT <>", value, "taxRnt");
            return (Criteria) this;
        }

        public Criteria andTaxRntGreaterThan(BigDecimal value) {
            addCriterion("TAX_RNT >", value, "taxRnt");
            return (Criteria) this;
        }

        public Criteria andTaxRntGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_RNT >=", value, "taxRnt");
            return (Criteria) this;
        }

        public Criteria andTaxRntLessThan(BigDecimal value) {
            addCriterion("TAX_RNT <", value, "taxRnt");
            return (Criteria) this;
        }

        public Criteria andTaxRntLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_RNT <=", value, "taxRnt");
            return (Criteria) this;
        }

        public Criteria andTaxRntIn(List<BigDecimal> values) {
            addCriterion("TAX_RNT in", values, "taxRnt");
            return (Criteria) this;
        }

        public Criteria andTaxRntNotIn(List<BigDecimal> values) {
            addCriterion("TAX_RNT not in", values, "taxRnt");
            return (Criteria) this;
        }

        public Criteria andTaxRntBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_RNT between", value1, value2, "taxRnt");
            return (Criteria) this;
        }

        public Criteria andTaxRntNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_RNT not between", value1, value2, "taxRnt");
            return (Criteria) this;
        }

        public Criteria andUpIsNull() {
            addCriterion("UP is null");
            return (Criteria) this;
        }

        public Criteria andUpIsNotNull() {
            addCriterion("UP is not null");
            return (Criteria) this;
        }

        public Criteria andUpEqualTo(BigDecimal value) {
            addCriterion("UP =", value, "up");
            return (Criteria) this;
        }

        public Criteria andUpNotEqualTo(BigDecimal value) {
            addCriterion("UP <>", value, "up");
            return (Criteria) this;
        }

        public Criteria andUpGreaterThan(BigDecimal value) {
            addCriterion("UP >", value, "up");
            return (Criteria) this;
        }

        public Criteria andUpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP >=", value, "up");
            return (Criteria) this;
        }

        public Criteria andUpLessThan(BigDecimal value) {
            addCriterion("UP <", value, "up");
            return (Criteria) this;
        }

        public Criteria andUpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP <=", value, "up");
            return (Criteria) this;
        }

        public Criteria andUpIn(List<BigDecimal> values) {
            addCriterion("UP in", values, "up");
            return (Criteria) this;
        }

        public Criteria andUpNotIn(List<BigDecimal> values) {
            addCriterion("UP not in", values, "up");
            return (Criteria) this;
        }

        public Criteria andUpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP between", value1, value2, "up");
            return (Criteria) this;
        }

        public Criteria andUpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP not between", value1, value2, "up");
            return (Criteria) this;
        }

        public Criteria andAmtIsNull() {
            addCriterion("AMT is null");
            return (Criteria) this;
        }

        public Criteria andAmtIsNotNull() {
            addCriterion("AMT is not null");
            return (Criteria) this;
        }

        public Criteria andAmtEqualTo(BigDecimal value) {
            addCriterion("AMT =", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtNotEqualTo(BigDecimal value) {
            addCriterion("AMT <>", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtGreaterThan(BigDecimal value) {
            addCriterion("AMT >", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT >=", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtLessThan(BigDecimal value) {
            addCriterion("AMT <", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT <=", value, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtIn(List<BigDecimal> values) {
            addCriterion("AMT in", values, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtNotIn(List<BigDecimal> values) {
            addCriterion("AMT not in", values, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT between", value1, value2, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT not between", value1, value2, "amt");
            return (Criteria) this;
        }

        public Criteria andAmtnIsNull() {
            addCriterion("AMTN is null");
            return (Criteria) this;
        }

        public Criteria andAmtnIsNotNull() {
            addCriterion("AMTN is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnEqualTo(BigDecimal value) {
            addCriterion("AMTN =", value, "amtn");
            return (Criteria) this;
        }

        public Criteria andAmtnNotEqualTo(BigDecimal value) {
            addCriterion("AMTN <>", value, "amtn");
            return (Criteria) this;
        }

        public Criteria andAmtnGreaterThan(BigDecimal value) {
            addCriterion("AMTN >", value, "amtn");
            return (Criteria) this;
        }

        public Criteria andAmtnGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN >=", value, "amtn");
            return (Criteria) this;
        }

        public Criteria andAmtnLessThan(BigDecimal value) {
            addCriterion("AMTN <", value, "amtn");
            return (Criteria) this;
        }

        public Criteria andAmtnLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN <=", value, "amtn");
            return (Criteria) this;
        }

        public Criteria andAmtnIn(List<BigDecimal> values) {
            addCriterion("AMTN in", values, "amtn");
            return (Criteria) this;
        }

        public Criteria andAmtnNotIn(List<BigDecimal> values) {
            addCriterion("AMTN not in", values, "amtn");
            return (Criteria) this;
        }

        public Criteria andAmtnBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN between", value1, value2, "amtn");
            return (Criteria) this;
        }

        public Criteria andAmtnNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN not between", value1, value2, "amtn");
            return (Criteria) this;
        }

        public Criteria andQtyRtnIsNull() {
            addCriterion("QTY_RTN is null");
            return (Criteria) this;
        }

        public Criteria andQtyRtnIsNotNull() {
            addCriterion("QTY_RTN is not null");
            return (Criteria) this;
        }

        public Criteria andQtyRtnEqualTo(BigDecimal value) {
            addCriterion("QTY_RTN =", value, "qtyRtn");
            return (Criteria) this;
        }

        public Criteria andQtyRtnNotEqualTo(BigDecimal value) {
            addCriterion("QTY_RTN <>", value, "qtyRtn");
            return (Criteria) this;
        }

        public Criteria andQtyRtnGreaterThan(BigDecimal value) {
            addCriterion("QTY_RTN >", value, "qtyRtn");
            return (Criteria) this;
        }

        public Criteria andQtyRtnGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_RTN >=", value, "qtyRtn");
            return (Criteria) this;
        }

        public Criteria andQtyRtnLessThan(BigDecimal value) {
            addCriterion("QTY_RTN <", value, "qtyRtn");
            return (Criteria) this;
        }

        public Criteria andQtyRtnLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_RTN <=", value, "qtyRtn");
            return (Criteria) this;
        }

        public Criteria andQtyRtnIn(List<BigDecimal> values) {
            addCriterion("QTY_RTN in", values, "qtyRtn");
            return (Criteria) this;
        }

        public Criteria andQtyRtnNotIn(List<BigDecimal> values) {
            addCriterion("QTY_RTN not in", values, "qtyRtn");
            return (Criteria) this;
        }

        public Criteria andQtyRtnBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_RTN between", value1, value2, "qtyRtn");
            return (Criteria) this;
        }

        public Criteria andQtyRtnNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_RTN not between", value1, value2, "qtyRtn");
            return (Criteria) this;
        }

        public Criteria andQtyRtnUnshIsNull() {
            addCriterion("QTY_RTN_UNSH is null");
            return (Criteria) this;
        }

        public Criteria andQtyRtnUnshIsNotNull() {
            addCriterion("QTY_RTN_UNSH is not null");
            return (Criteria) this;
        }

        public Criteria andQtyRtnUnshEqualTo(BigDecimal value) {
            addCriterion("QTY_RTN_UNSH =", value, "qtyRtnUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyRtnUnshNotEqualTo(BigDecimal value) {
            addCriterion("QTY_RTN_UNSH <>", value, "qtyRtnUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyRtnUnshGreaterThan(BigDecimal value) {
            addCriterion("QTY_RTN_UNSH >", value, "qtyRtnUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyRtnUnshGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_RTN_UNSH >=", value, "qtyRtnUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyRtnUnshLessThan(BigDecimal value) {
            addCriterion("QTY_RTN_UNSH <", value, "qtyRtnUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyRtnUnshLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_RTN_UNSH <=", value, "qtyRtnUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyRtnUnshIn(List<BigDecimal> values) {
            addCriterion("QTY_RTN_UNSH in", values, "qtyRtnUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyRtnUnshNotIn(List<BigDecimal> values) {
            addCriterion("QTY_RTN_UNSH not in", values, "qtyRtnUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyRtnUnshBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_RTN_UNSH between", value1, value2, "qtyRtnUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyRtnUnshNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_RTN_UNSH not between", value1, value2, "qtyRtnUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1RtnIsNull() {
            addCriterion("QTY1_RTN is null");
            return (Criteria) this;
        }

        public Criteria andQty1RtnIsNotNull() {
            addCriterion("QTY1_RTN is not null");
            return (Criteria) this;
        }

        public Criteria andQty1RtnEqualTo(BigDecimal value) {
            addCriterion("QTY1_RTN =", value, "qty1Rtn");
            return (Criteria) this;
        }

        public Criteria andQty1RtnNotEqualTo(BigDecimal value) {
            addCriterion("QTY1_RTN <>", value, "qty1Rtn");
            return (Criteria) this;
        }

        public Criteria andQty1RtnGreaterThan(BigDecimal value) {
            addCriterion("QTY1_RTN >", value, "qty1Rtn");
            return (Criteria) this;
        }

        public Criteria andQty1RtnGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_RTN >=", value, "qty1Rtn");
            return (Criteria) this;
        }

        public Criteria andQty1RtnLessThan(BigDecimal value) {
            addCriterion("QTY1_RTN <", value, "qty1Rtn");
            return (Criteria) this;
        }

        public Criteria andQty1RtnLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_RTN <=", value, "qty1Rtn");
            return (Criteria) this;
        }

        public Criteria andQty1RtnIn(List<BigDecimal> values) {
            addCriterion("QTY1_RTN in", values, "qty1Rtn");
            return (Criteria) this;
        }

        public Criteria andQty1RtnNotIn(List<BigDecimal> values) {
            addCriterion("QTY1_RTN not in", values, "qty1Rtn");
            return (Criteria) this;
        }

        public Criteria andQty1RtnBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_RTN between", value1, value2, "qty1Rtn");
            return (Criteria) this;
        }

        public Criteria andQty1RtnNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_RTN not between", value1, value2, "qty1Rtn");
            return (Criteria) this;
        }

        public Criteria andQty1RtnUnshIsNull() {
            addCriterion("QTY1_RTN_UNSH is null");
            return (Criteria) this;
        }

        public Criteria andQty1RtnUnshIsNotNull() {
            addCriterion("QTY1_RTN_UNSH is not null");
            return (Criteria) this;
        }

        public Criteria andQty1RtnUnshEqualTo(BigDecimal value) {
            addCriterion("QTY1_RTN_UNSH =", value, "qty1RtnUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1RtnUnshNotEqualTo(BigDecimal value) {
            addCriterion("QTY1_RTN_UNSH <>", value, "qty1RtnUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1RtnUnshGreaterThan(BigDecimal value) {
            addCriterion("QTY1_RTN_UNSH >", value, "qty1RtnUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1RtnUnshGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_RTN_UNSH >=", value, "qty1RtnUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1RtnUnshLessThan(BigDecimal value) {
            addCriterion("QTY1_RTN_UNSH <", value, "qty1RtnUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1RtnUnshLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_RTN_UNSH <=", value, "qty1RtnUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1RtnUnshIn(List<BigDecimal> values) {
            addCriterion("QTY1_RTN_UNSH in", values, "qty1RtnUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1RtnUnshNotIn(List<BigDecimal> values) {
            addCriterion("QTY1_RTN_UNSH not in", values, "qty1RtnUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1RtnUnshBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_RTN_UNSH between", value1, value2, "qty1RtnUnsh");
            return (Criteria) this;
        }

        public Criteria andQty1RtnUnshNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_RTN_UNSH not between", value1, value2, "qty1RtnUnsh");
            return (Criteria) this;
        }

        public Criteria andPreBlNoIsNull() {
            addCriterion("PRE_BL_NO is null");
            return (Criteria) this;
        }

        public Criteria andPreBlNoIsNotNull() {
            addCriterion("PRE_BL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPreBlNoEqualTo(String value) {
            addCriterion("PRE_BL_NO =", value, "preBlNo");
            return (Criteria) this;
        }

        public Criteria andPreBlNoNotEqualTo(String value) {
            addCriterion("PRE_BL_NO <>", value, "preBlNo");
            return (Criteria) this;
        }

        public Criteria andPreBlNoGreaterThan(String value) {
            addCriterion("PRE_BL_NO >", value, "preBlNo");
            return (Criteria) this;
        }

        public Criteria andPreBlNoGreaterThanOrEqualTo(String value) {
            addCriterion("PRE_BL_NO >=", value, "preBlNo");
            return (Criteria) this;
        }

        public Criteria andPreBlNoLessThan(String value) {
            addCriterion("PRE_BL_NO <", value, "preBlNo");
            return (Criteria) this;
        }

        public Criteria andPreBlNoLessThanOrEqualTo(String value) {
            addCriterion("PRE_BL_NO <=", value, "preBlNo");
            return (Criteria) this;
        }

        public Criteria andPreBlNoLike(String value) {
            addCriterion("PRE_BL_NO like", value, "preBlNo");
            return (Criteria) this;
        }

        public Criteria andPreBlNoNotLike(String value) {
            addCriterion("PRE_BL_NO not like", value, "preBlNo");
            return (Criteria) this;
        }

        public Criteria andPreBlNoIn(List<String> values) {
            addCriterion("PRE_BL_NO in", values, "preBlNo");
            return (Criteria) this;
        }

        public Criteria andPreBlNoNotIn(List<String> values) {
            addCriterion("PRE_BL_NO not in", values, "preBlNo");
            return (Criteria) this;
        }

        public Criteria andPreBlNoBetween(String value1, String value2) {
            addCriterion("PRE_BL_NO between", value1, value2, "preBlNo");
            return (Criteria) this;
        }

        public Criteria andPreBlNoNotBetween(String value1, String value2) {
            addCriterion("PRE_BL_NO not between", value1, value2, "preBlNo");
            return (Criteria) this;
        }

        public Criteria andPreItmIsNull() {
            addCriterion("PRE_ITM is null");
            return (Criteria) this;
        }

        public Criteria andPreItmIsNotNull() {
            addCriterion("PRE_ITM is not null");
            return (Criteria) this;
        }

        public Criteria andPreItmEqualTo(Integer value) {
            addCriterion("PRE_ITM =", value, "preItm");
            return (Criteria) this;
        }

        public Criteria andPreItmNotEqualTo(Integer value) {
            addCriterion("PRE_ITM <>", value, "preItm");
            return (Criteria) this;
        }

        public Criteria andPreItmGreaterThan(Integer value) {
            addCriterion("PRE_ITM >", value, "preItm");
            return (Criteria) this;
        }

        public Criteria andPreItmGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRE_ITM >=", value, "preItm");
            return (Criteria) this;
        }

        public Criteria andPreItmLessThan(Integer value) {
            addCriterion("PRE_ITM <", value, "preItm");
            return (Criteria) this;
        }

        public Criteria andPreItmLessThanOrEqualTo(Integer value) {
            addCriterion("PRE_ITM <=", value, "preItm");
            return (Criteria) this;
        }

        public Criteria andPreItmIn(List<Integer> values) {
            addCriterion("PRE_ITM in", values, "preItm");
            return (Criteria) this;
        }

        public Criteria andPreItmNotIn(List<Integer> values) {
            addCriterion("PRE_ITM not in", values, "preItm");
            return (Criteria) this;
        }

        public Criteria andPreItmBetween(Integer value1, Integer value2) {
            addCriterion("PRE_ITM between", value1, value2, "preItm");
            return (Criteria) this;
        }

        public Criteria andPreItmNotBetween(Integer value1, Integer value2) {
            addCriterion("PRE_ITM not between", value1, value2, "preItm");
            return (Criteria) this;
        }

        public Criteria andPakUnitIsNull() {
            addCriterion("PAK_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andPakUnitIsNotNull() {
            addCriterion("PAK_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andPakUnitEqualTo(String value) {
            addCriterion("PAK_UNIT =", value, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitNotEqualTo(String value) {
            addCriterion("PAK_UNIT <>", value, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitGreaterThan(String value) {
            addCriterion("PAK_UNIT >", value, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitGreaterThanOrEqualTo(String value) {
            addCriterion("PAK_UNIT >=", value, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitLessThan(String value) {
            addCriterion("PAK_UNIT <", value, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitLessThanOrEqualTo(String value) {
            addCriterion("PAK_UNIT <=", value, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitLike(String value) {
            addCriterion("PAK_UNIT like", value, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitNotLike(String value) {
            addCriterion("PAK_UNIT not like", value, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitIn(List<String> values) {
            addCriterion("PAK_UNIT in", values, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitNotIn(List<String> values) {
            addCriterion("PAK_UNIT not in", values, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitBetween(String value1, String value2) {
            addCriterion("PAK_UNIT between", value1, value2, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakUnitNotBetween(String value1, String value2) {
            addCriterion("PAK_UNIT not between", value1, value2, "pakUnit");
            return (Criteria) this;
        }

        public Criteria andPakExcIsNull() {
            addCriterion("PAK_EXC is null");
            return (Criteria) this;
        }

        public Criteria andPakExcIsNotNull() {
            addCriterion("PAK_EXC is not null");
            return (Criteria) this;
        }

        public Criteria andPakExcEqualTo(BigDecimal value) {
            addCriterion("PAK_EXC =", value, "pakExc");
            return (Criteria) this;
        }

        public Criteria andPakExcNotEqualTo(BigDecimal value) {
            addCriterion("PAK_EXC <>", value, "pakExc");
            return (Criteria) this;
        }

        public Criteria andPakExcGreaterThan(BigDecimal value) {
            addCriterion("PAK_EXC >", value, "pakExc");
            return (Criteria) this;
        }

        public Criteria andPakExcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAK_EXC >=", value, "pakExc");
            return (Criteria) this;
        }

        public Criteria andPakExcLessThan(BigDecimal value) {
            addCriterion("PAK_EXC <", value, "pakExc");
            return (Criteria) this;
        }

        public Criteria andPakExcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAK_EXC <=", value, "pakExc");
            return (Criteria) this;
        }

        public Criteria andPakExcIn(List<BigDecimal> values) {
            addCriterion("PAK_EXC in", values, "pakExc");
            return (Criteria) this;
        }

        public Criteria andPakExcNotIn(List<BigDecimal> values) {
            addCriterion("PAK_EXC not in", values, "pakExc");
            return (Criteria) this;
        }

        public Criteria andPakExcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAK_EXC between", value1, value2, "pakExc");
            return (Criteria) this;
        }

        public Criteria andPakExcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAK_EXC not between", value1, value2, "pakExc");
            return (Criteria) this;
        }

        public Criteria andPakNwIsNull() {
            addCriterion("PAK_NW is null");
            return (Criteria) this;
        }

        public Criteria andPakNwIsNotNull() {
            addCriterion("PAK_NW is not null");
            return (Criteria) this;
        }

        public Criteria andPakNwEqualTo(BigDecimal value) {
            addCriterion("PAK_NW =", value, "pakNw");
            return (Criteria) this;
        }

        public Criteria andPakNwNotEqualTo(BigDecimal value) {
            addCriterion("PAK_NW <>", value, "pakNw");
            return (Criteria) this;
        }

        public Criteria andPakNwGreaterThan(BigDecimal value) {
            addCriterion("PAK_NW >", value, "pakNw");
            return (Criteria) this;
        }

        public Criteria andPakNwGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAK_NW >=", value, "pakNw");
            return (Criteria) this;
        }

        public Criteria andPakNwLessThan(BigDecimal value) {
            addCriterion("PAK_NW <", value, "pakNw");
            return (Criteria) this;
        }

        public Criteria andPakNwLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAK_NW <=", value, "pakNw");
            return (Criteria) this;
        }

        public Criteria andPakNwIn(List<BigDecimal> values) {
            addCriterion("PAK_NW in", values, "pakNw");
            return (Criteria) this;
        }

        public Criteria andPakNwNotIn(List<BigDecimal> values) {
            addCriterion("PAK_NW not in", values, "pakNw");
            return (Criteria) this;
        }

        public Criteria andPakNwBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAK_NW between", value1, value2, "pakNw");
            return (Criteria) this;
        }

        public Criteria andPakNwNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAK_NW not between", value1, value2, "pakNw");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitIsNull() {
            addCriterion("PAK_WEIGHT_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitIsNotNull() {
            addCriterion("PAK_WEIGHT_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitEqualTo(String value) {
            addCriterion("PAK_WEIGHT_UNIT =", value, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitNotEqualTo(String value) {
            addCriterion("PAK_WEIGHT_UNIT <>", value, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitGreaterThan(String value) {
            addCriterion("PAK_WEIGHT_UNIT >", value, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitGreaterThanOrEqualTo(String value) {
            addCriterion("PAK_WEIGHT_UNIT >=", value, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitLessThan(String value) {
            addCriterion("PAK_WEIGHT_UNIT <", value, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitLessThanOrEqualTo(String value) {
            addCriterion("PAK_WEIGHT_UNIT <=", value, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitLike(String value) {
            addCriterion("PAK_WEIGHT_UNIT like", value, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitNotLike(String value) {
            addCriterion("PAK_WEIGHT_UNIT not like", value, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitIn(List<String> values) {
            addCriterion("PAK_WEIGHT_UNIT in", values, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitNotIn(List<String> values) {
            addCriterion("PAK_WEIGHT_UNIT not in", values, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitBetween(String value1, String value2) {
            addCriterion("PAK_WEIGHT_UNIT between", value1, value2, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakWeightUnitNotBetween(String value1, String value2) {
            addCriterion("PAK_WEIGHT_UNIT not between", value1, value2, "pakWeightUnit");
            return (Criteria) this;
        }

        public Criteria andPakGwIsNull() {
            addCriterion("PAK_GW is null");
            return (Criteria) this;
        }

        public Criteria andPakGwIsNotNull() {
            addCriterion("PAK_GW is not null");
            return (Criteria) this;
        }

        public Criteria andPakGwEqualTo(BigDecimal value) {
            addCriterion("PAK_GW =", value, "pakGw");
            return (Criteria) this;
        }

        public Criteria andPakGwNotEqualTo(BigDecimal value) {
            addCriterion("PAK_GW <>", value, "pakGw");
            return (Criteria) this;
        }

        public Criteria andPakGwGreaterThan(BigDecimal value) {
            addCriterion("PAK_GW >", value, "pakGw");
            return (Criteria) this;
        }

        public Criteria andPakGwGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAK_GW >=", value, "pakGw");
            return (Criteria) this;
        }

        public Criteria andPakGwLessThan(BigDecimal value) {
            addCriterion("PAK_GW <", value, "pakGw");
            return (Criteria) this;
        }

        public Criteria andPakGwLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAK_GW <=", value, "pakGw");
            return (Criteria) this;
        }

        public Criteria andPakGwIn(List<BigDecimal> values) {
            addCriterion("PAK_GW in", values, "pakGw");
            return (Criteria) this;
        }

        public Criteria andPakGwNotIn(List<BigDecimal> values) {
            addCriterion("PAK_GW not in", values, "pakGw");
            return (Criteria) this;
        }

        public Criteria andPakGwBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAK_GW between", value1, value2, "pakGw");
            return (Criteria) this;
        }

        public Criteria andPakGwNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAK_GW not between", value1, value2, "pakGw");
            return (Criteria) this;
        }

        public Criteria andPakMeastIsNull() {
            addCriterion("PAK_MEAST is null");
            return (Criteria) this;
        }

        public Criteria andPakMeastIsNotNull() {
            addCriterion("PAK_MEAST is not null");
            return (Criteria) this;
        }

        public Criteria andPakMeastEqualTo(BigDecimal value) {
            addCriterion("PAK_MEAST =", value, "pakMeast");
            return (Criteria) this;
        }

        public Criteria andPakMeastNotEqualTo(BigDecimal value) {
            addCriterion("PAK_MEAST <>", value, "pakMeast");
            return (Criteria) this;
        }

        public Criteria andPakMeastGreaterThan(BigDecimal value) {
            addCriterion("PAK_MEAST >", value, "pakMeast");
            return (Criteria) this;
        }

        public Criteria andPakMeastGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAK_MEAST >=", value, "pakMeast");
            return (Criteria) this;
        }

        public Criteria andPakMeastLessThan(BigDecimal value) {
            addCriterion("PAK_MEAST <", value, "pakMeast");
            return (Criteria) this;
        }

        public Criteria andPakMeastLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAK_MEAST <=", value, "pakMeast");
            return (Criteria) this;
        }

        public Criteria andPakMeastIn(List<BigDecimal> values) {
            addCriterion("PAK_MEAST in", values, "pakMeast");
            return (Criteria) this;
        }

        public Criteria andPakMeastNotIn(List<BigDecimal> values) {
            addCriterion("PAK_MEAST not in", values, "pakMeast");
            return (Criteria) this;
        }

        public Criteria andPakMeastBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAK_MEAST between", value1, value2, "pakMeast");
            return (Criteria) this;
        }

        public Criteria andPakMeastNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAK_MEAST not between", value1, value2, "pakMeast");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitIsNull() {
            addCriterion("PAK_MEAST_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitIsNotNull() {
            addCriterion("PAK_MEAST_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitEqualTo(String value) {
            addCriterion("PAK_MEAST_UNIT =", value, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitNotEqualTo(String value) {
            addCriterion("PAK_MEAST_UNIT <>", value, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitGreaterThan(String value) {
            addCriterion("PAK_MEAST_UNIT >", value, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitGreaterThanOrEqualTo(String value) {
            addCriterion("PAK_MEAST_UNIT >=", value, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitLessThan(String value) {
            addCriterion("PAK_MEAST_UNIT <", value, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitLessThanOrEqualTo(String value) {
            addCriterion("PAK_MEAST_UNIT <=", value, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitLike(String value) {
            addCriterion("PAK_MEAST_UNIT like", value, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitNotLike(String value) {
            addCriterion("PAK_MEAST_UNIT not like", value, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitIn(List<String> values) {
            addCriterion("PAK_MEAST_UNIT in", values, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitNotIn(List<String> values) {
            addCriterion("PAK_MEAST_UNIT not in", values, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitBetween(String value1, String value2) {
            addCriterion("PAK_MEAST_UNIT between", value1, value2, "pakMeastUnit");
            return (Criteria) this;
        }

        public Criteria andPakMeastUnitNotBetween(String value1, String value2) {
            addCriterion("PAK_MEAST_UNIT not between", value1, value2, "pakMeastUnit");
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

        public Criteria andAmtnComIsNull() {
            addCriterion("AMTN_COM is null");
            return (Criteria) this;
        }

        public Criteria andAmtnComIsNotNull() {
            addCriterion("AMTN_COM is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnComEqualTo(BigDecimal value) {
            addCriterion("AMTN_COM =", value, "amtnCom");
            return (Criteria) this;
        }

        public Criteria andAmtnComNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_COM <>", value, "amtnCom");
            return (Criteria) this;
        }

        public Criteria andAmtnComGreaterThan(BigDecimal value) {
            addCriterion("AMTN_COM >", value, "amtnCom");
            return (Criteria) this;
        }

        public Criteria andAmtnComGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_COM >=", value, "amtnCom");
            return (Criteria) this;
        }

        public Criteria andAmtnComLessThan(BigDecimal value) {
            addCriterion("AMTN_COM <", value, "amtnCom");
            return (Criteria) this;
        }

        public Criteria andAmtnComLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_COM <=", value, "amtnCom");
            return (Criteria) this;
        }

        public Criteria andAmtnComIn(List<BigDecimal> values) {
            addCriterion("AMTN_COM in", values, "amtnCom");
            return (Criteria) this;
        }

        public Criteria andAmtnComNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_COM not in", values, "amtnCom");
            return (Criteria) this;
        }

        public Criteria andAmtnComBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_COM between", value1, value2, "amtnCom");
            return (Criteria) this;
        }

        public Criteria andAmtnComNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_COM not between", value1, value2, "amtnCom");
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

        public Criteria andCstStdIsNull() {
            addCriterion("CST_STD is null");
            return (Criteria) this;
        }

        public Criteria andCstStdIsNotNull() {
            addCriterion("CST_STD is not null");
            return (Criteria) this;
        }

        public Criteria andCstStdEqualTo(BigDecimal value) {
            addCriterion("CST_STD =", value, "cstStd");
            return (Criteria) this;
        }

        public Criteria andCstStdNotEqualTo(BigDecimal value) {
            addCriterion("CST_STD <>", value, "cstStd");
            return (Criteria) this;
        }

        public Criteria andCstStdGreaterThan(BigDecimal value) {
            addCriterion("CST_STD >", value, "cstStd");
            return (Criteria) this;
        }

        public Criteria andCstStdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_STD >=", value, "cstStd");
            return (Criteria) this;
        }

        public Criteria andCstStdLessThan(BigDecimal value) {
            addCriterion("CST_STD <", value, "cstStd");
            return (Criteria) this;
        }

        public Criteria andCstStdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_STD <=", value, "cstStd");
            return (Criteria) this;
        }

        public Criteria andCstStdIn(List<BigDecimal> values) {
            addCriterion("CST_STD in", values, "cstStd");
            return (Criteria) this;
        }

        public Criteria andCstStdNotIn(List<BigDecimal> values) {
            addCriterion("CST_STD not in", values, "cstStd");
            return (Criteria) this;
        }

        public Criteria andCstStdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_STD between", value1, value2, "cstStd");
            return (Criteria) this;
        }

        public Criteria andCstStdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_STD not between", value1, value2, "cstStd");
            return (Criteria) this;
        }

        public Criteria andUpQty1IsNull() {
            addCriterion("UP_QTY1 is null");
            return (Criteria) this;
        }

        public Criteria andUpQty1IsNotNull() {
            addCriterion("UP_QTY1 is not null");
            return (Criteria) this;
        }

        public Criteria andUpQty1EqualTo(BigDecimal value) {
            addCriterion("UP_QTY1 =", value, "upQty1");
            return (Criteria) this;
        }

        public Criteria andUpQty1NotEqualTo(BigDecimal value) {
            addCriterion("UP_QTY1 <>", value, "upQty1");
            return (Criteria) this;
        }

        public Criteria andUpQty1GreaterThan(BigDecimal value) {
            addCriterion("UP_QTY1 >", value, "upQty1");
            return (Criteria) this;
        }

        public Criteria andUpQty1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_QTY1 >=", value, "upQty1");
            return (Criteria) this;
        }

        public Criteria andUpQty1LessThan(BigDecimal value) {
            addCriterion("UP_QTY1 <", value, "upQty1");
            return (Criteria) this;
        }

        public Criteria andUpQty1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_QTY1 <=", value, "upQty1");
            return (Criteria) this;
        }

        public Criteria andUpQty1In(List<BigDecimal> values) {
            addCriterion("UP_QTY1 in", values, "upQty1");
            return (Criteria) this;
        }

        public Criteria andUpQty1NotIn(List<BigDecimal> values) {
            addCriterion("UP_QTY1 not in", values, "upQty1");
            return (Criteria) this;
        }

        public Criteria andUpQty1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_QTY1 between", value1, value2, "upQty1");
            return (Criteria) this;
        }

        public Criteria andUpQty1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_QTY1 not between", value1, value2, "upQty1");
            return (Criteria) this;
        }

        public Criteria andEstItmIsNull() {
            addCriterion("EST_ITM is null");
            return (Criteria) this;
        }

        public Criteria andEstItmIsNotNull() {
            addCriterion("EST_ITM is not null");
            return (Criteria) this;
        }

        public Criteria andEstItmEqualTo(Integer value) {
            addCriterion("EST_ITM =", value, "estItm");
            return (Criteria) this;
        }

        public Criteria andEstItmNotEqualTo(Integer value) {
            addCriterion("EST_ITM <>", value, "estItm");
            return (Criteria) this;
        }

        public Criteria andEstItmGreaterThan(Integer value) {
            addCriterion("EST_ITM >", value, "estItm");
            return (Criteria) this;
        }

        public Criteria andEstItmGreaterThanOrEqualTo(Integer value) {
            addCriterion("EST_ITM >=", value, "estItm");
            return (Criteria) this;
        }

        public Criteria andEstItmLessThan(Integer value) {
            addCriterion("EST_ITM <", value, "estItm");
            return (Criteria) this;
        }

        public Criteria andEstItmLessThanOrEqualTo(Integer value) {
            addCriterion("EST_ITM <=", value, "estItm");
            return (Criteria) this;
        }

        public Criteria andEstItmIn(List<Integer> values) {
            addCriterion("EST_ITM in", values, "estItm");
            return (Criteria) this;
        }

        public Criteria andEstItmNotIn(List<Integer> values) {
            addCriterion("EST_ITM not in", values, "estItm");
            return (Criteria) this;
        }

        public Criteria andEstItmBetween(Integer value1, Integer value2) {
            addCriterion("EST_ITM between", value1, value2, "estItm");
            return (Criteria) this;
        }

        public Criteria andEstItmNotBetween(Integer value1, Integer value2) {
            addCriterion("EST_ITM not between", value1, value2, "estItm");
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

        public Criteria andQtyCkUnshIsNull() {
            addCriterion("QTY_CK_UNSH is null");
            return (Criteria) this;
        }

        public Criteria andQtyCkUnshIsNotNull() {
            addCriterion("QTY_CK_UNSH is not null");
            return (Criteria) this;
        }

        public Criteria andQtyCkUnshEqualTo(BigDecimal value) {
            addCriterion("QTY_CK_UNSH =", value, "qtyCkUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyCkUnshNotEqualTo(BigDecimal value) {
            addCriterion("QTY_CK_UNSH <>", value, "qtyCkUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyCkUnshGreaterThan(BigDecimal value) {
            addCriterion("QTY_CK_UNSH >", value, "qtyCkUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyCkUnshGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_CK_UNSH >=", value, "qtyCkUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyCkUnshLessThan(BigDecimal value) {
            addCriterion("QTY_CK_UNSH <", value, "qtyCkUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyCkUnshLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_CK_UNSH <=", value, "qtyCkUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyCkUnshIn(List<BigDecimal> values) {
            addCriterion("QTY_CK_UNSH in", values, "qtyCkUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyCkUnshNotIn(List<BigDecimal> values) {
            addCriterion("QTY_CK_UNSH not in", values, "qtyCkUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyCkUnshBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_CK_UNSH between", value1, value2, "qtyCkUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyCkUnshNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_CK_UNSH not between", value1, value2, "qtyCkUnsh");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoIsNull() {
            addCriterion("SUP_PRD_NO is null");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoIsNotNull() {
            addCriterion("SUP_PRD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoEqualTo(String value) {
            addCriterion("SUP_PRD_NO =", value, "supPrdNo");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoNotEqualTo(String value) {
            addCriterion("SUP_PRD_NO <>", value, "supPrdNo");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoGreaterThan(String value) {
            addCriterion("SUP_PRD_NO >", value, "supPrdNo");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoGreaterThanOrEqualTo(String value) {
            addCriterion("SUP_PRD_NO >=", value, "supPrdNo");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoLessThan(String value) {
            addCriterion("SUP_PRD_NO <", value, "supPrdNo");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoLessThanOrEqualTo(String value) {
            addCriterion("SUP_PRD_NO <=", value, "supPrdNo");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoLike(String value) {
            addCriterion("SUP_PRD_NO like", value, "supPrdNo");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoNotLike(String value) {
            addCriterion("SUP_PRD_NO not like", value, "supPrdNo");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoIn(List<String> values) {
            addCriterion("SUP_PRD_NO in", values, "supPrdNo");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoNotIn(List<String> values) {
            addCriterion("SUP_PRD_NO not in", values, "supPrdNo");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoBetween(String value1, String value2) {
            addCriterion("SUP_PRD_NO between", value1, value2, "supPrdNo");
            return (Criteria) this;
        }

        public Criteria andSupPrdNoNotBetween(String value1, String value2) {
            addCriterion("SUP_PRD_NO not between", value1, value2, "supPrdNo");
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

        public Criteria andIdNoIsNull() {
            addCriterion("ID_NO is null");
            return (Criteria) this;
        }

        public Criteria andIdNoIsNotNull() {
            addCriterion("ID_NO is not null");
            return (Criteria) this;
        }

        public Criteria andIdNoEqualTo(String value) {
            addCriterion("ID_NO =", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotEqualTo(String value) {
            addCriterion("ID_NO <>", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThan(String value) {
            addCriterion("ID_NO >", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("ID_NO >=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThan(String value) {
            addCriterion("ID_NO <", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLessThanOrEqualTo(String value) {
            addCriterion("ID_NO <=", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoLike(String value) {
            addCriterion("ID_NO like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotLike(String value) {
            addCriterion("ID_NO not like", value, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoIn(List<String> values) {
            addCriterion("ID_NO in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotIn(List<String> values) {
            addCriterion("ID_NO not in", values, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoBetween(String value1, String value2) {
            addCriterion("ID_NO between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andIdNoNotBetween(String value1, String value2) {
            addCriterion("ID_NO not between", value1, value2, "idNo");
            return (Criteria) this;
        }

        public Criteria andComposeIdnoIsNull() {
            addCriterion("COMPOSE_IDNO is null");
            return (Criteria) this;
        }

        public Criteria andComposeIdnoIsNotNull() {
            addCriterion("COMPOSE_IDNO is not null");
            return (Criteria) this;
        }

        public Criteria andComposeIdnoEqualTo(String value) {
            addCriterion("COMPOSE_IDNO =", value, "composeIdno");
            return (Criteria) this;
        }

        public Criteria andComposeIdnoNotEqualTo(String value) {
            addCriterion("COMPOSE_IDNO <>", value, "composeIdno");
            return (Criteria) this;
        }

        public Criteria andComposeIdnoGreaterThan(String value) {
            addCriterion("COMPOSE_IDNO >", value, "composeIdno");
            return (Criteria) this;
        }

        public Criteria andComposeIdnoGreaterThanOrEqualTo(String value) {
            addCriterion("COMPOSE_IDNO >=", value, "composeIdno");
            return (Criteria) this;
        }

        public Criteria andComposeIdnoLessThan(String value) {
            addCriterion("COMPOSE_IDNO <", value, "composeIdno");
            return (Criteria) this;
        }

        public Criteria andComposeIdnoLessThanOrEqualTo(String value) {
            addCriterion("COMPOSE_IDNO <=", value, "composeIdno");
            return (Criteria) this;
        }

        public Criteria andComposeIdnoLike(String value) {
            addCriterion("COMPOSE_IDNO like", value, "composeIdno");
            return (Criteria) this;
        }

        public Criteria andComposeIdnoNotLike(String value) {
            addCriterion("COMPOSE_IDNO not like", value, "composeIdno");
            return (Criteria) this;
        }

        public Criteria andComposeIdnoIn(List<String> values) {
            addCriterion("COMPOSE_IDNO in", values, "composeIdno");
            return (Criteria) this;
        }

        public Criteria andComposeIdnoNotIn(List<String> values) {
            addCriterion("COMPOSE_IDNO not in", values, "composeIdno");
            return (Criteria) this;
        }

        public Criteria andComposeIdnoBetween(String value1, String value2) {
            addCriterion("COMPOSE_IDNO between", value1, value2, "composeIdno");
            return (Criteria) this;
        }

        public Criteria andComposeIdnoNotBetween(String value1, String value2) {
            addCriterion("COMPOSE_IDNO not between", value1, value2, "composeIdno");
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

        public Criteria andAmtFpIsNull() {
            addCriterion("AMT_FP is null");
            return (Criteria) this;
        }

        public Criteria andAmtFpIsNotNull() {
            addCriterion("AMT_FP is not null");
            return (Criteria) this;
        }

        public Criteria andAmtFpEqualTo(BigDecimal value) {
            addCriterion("AMT_FP =", value, "amtFp");
            return (Criteria) this;
        }

        public Criteria andAmtFpNotEqualTo(BigDecimal value) {
            addCriterion("AMT_FP <>", value, "amtFp");
            return (Criteria) this;
        }

        public Criteria andAmtFpGreaterThan(BigDecimal value) {
            addCriterion("AMT_FP >", value, "amtFp");
            return (Criteria) this;
        }

        public Criteria andAmtFpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_FP >=", value, "amtFp");
            return (Criteria) this;
        }

        public Criteria andAmtFpLessThan(BigDecimal value) {
            addCriterion("AMT_FP <", value, "amtFp");
            return (Criteria) this;
        }

        public Criteria andAmtFpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMT_FP <=", value, "amtFp");
            return (Criteria) this;
        }

        public Criteria andAmtFpIn(List<BigDecimal> values) {
            addCriterion("AMT_FP in", values, "amtFp");
            return (Criteria) this;
        }

        public Criteria andAmtFpNotIn(List<BigDecimal> values) {
            addCriterion("AMT_FP not in", values, "amtFp");
            return (Criteria) this;
        }

        public Criteria andAmtFpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_FP between", value1, value2, "amtFp");
            return (Criteria) this;
        }

        public Criteria andAmtFpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMT_FP not between", value1, value2, "amtFp");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFpIsNull() {
            addCriterion("AMTN_NET_FP is null");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFpIsNotNull() {
            addCriterion("AMTN_NET_FP is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFpEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_FP =", value, "amtnNetFp");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFpNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_FP <>", value, "amtnNetFp");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFpGreaterThan(BigDecimal value) {
            addCriterion("AMTN_NET_FP >", value, "amtnNetFp");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_FP >=", value, "amtnNetFp");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFpLessThan(BigDecimal value) {
            addCriterion("AMTN_NET_FP <", value, "amtnNetFp");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_FP <=", value, "amtnNetFp");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFpIn(List<BigDecimal> values) {
            addCriterion("AMTN_NET_FP in", values, "amtnNetFp");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFpNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_NET_FP not in", values, "amtnNetFp");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_NET_FP between", value1, value2, "amtnNetFp");
            return (Criteria) this;
        }

        public Criteria andAmtnNetFpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_NET_FP not between", value1, value2, "amtnNetFp");
            return (Criteria) this;
        }

        public Criteria andTaxFpIsNull() {
            addCriterion("TAX_FP is null");
            return (Criteria) this;
        }

        public Criteria andTaxFpIsNotNull() {
            addCriterion("TAX_FP is not null");
            return (Criteria) this;
        }

        public Criteria andTaxFpEqualTo(BigDecimal value) {
            addCriterion("TAX_FP =", value, "taxFp");
            return (Criteria) this;
        }

        public Criteria andTaxFpNotEqualTo(BigDecimal value) {
            addCriterion("TAX_FP <>", value, "taxFp");
            return (Criteria) this;
        }

        public Criteria andTaxFpGreaterThan(BigDecimal value) {
            addCriterion("TAX_FP >", value, "taxFp");
            return (Criteria) this;
        }

        public Criteria andTaxFpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_FP >=", value, "taxFp");
            return (Criteria) this;
        }

        public Criteria andTaxFpLessThan(BigDecimal value) {
            addCriterion("TAX_FP <", value, "taxFp");
            return (Criteria) this;
        }

        public Criteria andTaxFpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_FP <=", value, "taxFp");
            return (Criteria) this;
        }

        public Criteria andTaxFpIn(List<BigDecimal> values) {
            addCriterion("TAX_FP in", values, "taxFp");
            return (Criteria) this;
        }

        public Criteria andTaxFpNotIn(List<BigDecimal> values) {
            addCriterion("TAX_FP not in", values, "taxFp");
            return (Criteria) this;
        }

        public Criteria andTaxFpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_FP between", value1, value2, "taxFp");
            return (Criteria) this;
        }

        public Criteria andTaxFpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_FP not between", value1, value2, "taxFp");
            return (Criteria) this;
        }

        public Criteria andQtyFpIsNull() {
            addCriterion("QTY_FP is null");
            return (Criteria) this;
        }

        public Criteria andQtyFpIsNotNull() {
            addCriterion("QTY_FP is not null");
            return (Criteria) this;
        }

        public Criteria andQtyFpEqualTo(BigDecimal value) {
            addCriterion("QTY_FP =", value, "qtyFp");
            return (Criteria) this;
        }

        public Criteria andQtyFpNotEqualTo(BigDecimal value) {
            addCriterion("QTY_FP <>", value, "qtyFp");
            return (Criteria) this;
        }

        public Criteria andQtyFpGreaterThan(BigDecimal value) {
            addCriterion("QTY_FP >", value, "qtyFp");
            return (Criteria) this;
        }

        public Criteria andQtyFpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_FP >=", value, "qtyFp");
            return (Criteria) this;
        }

        public Criteria andQtyFpLessThan(BigDecimal value) {
            addCriterion("QTY_FP <", value, "qtyFp");
            return (Criteria) this;
        }

        public Criteria andQtyFpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_FP <=", value, "qtyFp");
            return (Criteria) this;
        }

        public Criteria andQtyFpIn(List<BigDecimal> values) {
            addCriterion("QTY_FP in", values, "qtyFp");
            return (Criteria) this;
        }

        public Criteria andQtyFpNotIn(List<BigDecimal> values) {
            addCriterion("QTY_FP not in", values, "qtyFp");
            return (Criteria) this;
        }

        public Criteria andQtyFpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_FP between", value1, value2, "qtyFp");
            return (Criteria) this;
        }

        public Criteria andQtyFpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_FP not between", value1, value2, "qtyFp");
            return (Criteria) this;
        }

        public Criteria andRkNoIsNull() {
            addCriterion("RK_NO is null");
            return (Criteria) this;
        }

        public Criteria andRkNoIsNotNull() {
            addCriterion("RK_NO is not null");
            return (Criteria) this;
        }

        public Criteria andRkNoEqualTo(String value) {
            addCriterion("RK_NO =", value, "rkNo");
            return (Criteria) this;
        }

        public Criteria andRkNoNotEqualTo(String value) {
            addCriterion("RK_NO <>", value, "rkNo");
            return (Criteria) this;
        }

        public Criteria andRkNoGreaterThan(String value) {
            addCriterion("RK_NO >", value, "rkNo");
            return (Criteria) this;
        }

        public Criteria andRkNoGreaterThanOrEqualTo(String value) {
            addCriterion("RK_NO >=", value, "rkNo");
            return (Criteria) this;
        }

        public Criteria andRkNoLessThan(String value) {
            addCriterion("RK_NO <", value, "rkNo");
            return (Criteria) this;
        }

        public Criteria andRkNoLessThanOrEqualTo(String value) {
            addCriterion("RK_NO <=", value, "rkNo");
            return (Criteria) this;
        }

        public Criteria andRkNoLike(String value) {
            addCriterion("RK_NO like", value, "rkNo");
            return (Criteria) this;
        }

        public Criteria andRkNoNotLike(String value) {
            addCriterion("RK_NO not like", value, "rkNo");
            return (Criteria) this;
        }

        public Criteria andRkNoIn(List<String> values) {
            addCriterion("RK_NO in", values, "rkNo");
            return (Criteria) this;
        }

        public Criteria andRkNoNotIn(List<String> values) {
            addCriterion("RK_NO not in", values, "rkNo");
            return (Criteria) this;
        }

        public Criteria andRkNoBetween(String value1, String value2) {
            addCriterion("RK_NO between", value1, value2, "rkNo");
            return (Criteria) this;
        }

        public Criteria andRkNoNotBetween(String value1, String value2) {
            addCriterion("RK_NO not between", value1, value2, "rkNo");
            return (Criteria) this;
        }

        public Criteria andCkNoIsNull() {
            addCriterion("CK_NO is null");
            return (Criteria) this;
        }

        public Criteria andCkNoIsNotNull() {
            addCriterion("CK_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCkNoEqualTo(String value) {
            addCriterion("CK_NO =", value, "ckNo");
            return (Criteria) this;
        }

        public Criteria andCkNoNotEqualTo(String value) {
            addCriterion("CK_NO <>", value, "ckNo");
            return (Criteria) this;
        }

        public Criteria andCkNoGreaterThan(String value) {
            addCriterion("CK_NO >", value, "ckNo");
            return (Criteria) this;
        }

        public Criteria andCkNoGreaterThanOrEqualTo(String value) {
            addCriterion("CK_NO >=", value, "ckNo");
            return (Criteria) this;
        }

        public Criteria andCkNoLessThan(String value) {
            addCriterion("CK_NO <", value, "ckNo");
            return (Criteria) this;
        }

        public Criteria andCkNoLessThanOrEqualTo(String value) {
            addCriterion("CK_NO <=", value, "ckNo");
            return (Criteria) this;
        }

        public Criteria andCkNoLike(String value) {
            addCriterion("CK_NO like", value, "ckNo");
            return (Criteria) this;
        }

        public Criteria andCkNoNotLike(String value) {
            addCriterion("CK_NO not like", value, "ckNo");
            return (Criteria) this;
        }

        public Criteria andCkNoIn(List<String> values) {
            addCriterion("CK_NO in", values, "ckNo");
            return (Criteria) this;
        }

        public Criteria andCkNoNotIn(List<String> values) {
            addCriterion("CK_NO not in", values, "ckNo");
            return (Criteria) this;
        }

        public Criteria andCkNoBetween(String value1, String value2) {
            addCriterion("CK_NO between", value1, value2, "ckNo");
            return (Criteria) this;
        }

        public Criteria andCkNoNotBetween(String value1, String value2) {
            addCriterion("CK_NO not between", value1, value2, "ckNo");
            return (Criteria) this;
        }

        public Criteria andTiItmIsNull() {
            addCriterion("TI_ITM is null");
            return (Criteria) this;
        }

        public Criteria andTiItmIsNotNull() {
            addCriterion("TI_ITM is not null");
            return (Criteria) this;
        }

        public Criteria andTiItmEqualTo(Integer value) {
            addCriterion("TI_ITM =", value, "tiItm");
            return (Criteria) this;
        }

        public Criteria andTiItmNotEqualTo(Integer value) {
            addCriterion("TI_ITM <>", value, "tiItm");
            return (Criteria) this;
        }

        public Criteria andTiItmGreaterThan(Integer value) {
            addCriterion("TI_ITM >", value, "tiItm");
            return (Criteria) this;
        }

        public Criteria andTiItmGreaterThanOrEqualTo(Integer value) {
            addCriterion("TI_ITM >=", value, "tiItm");
            return (Criteria) this;
        }

        public Criteria andTiItmLessThan(Integer value) {
            addCriterion("TI_ITM <", value, "tiItm");
            return (Criteria) this;
        }

        public Criteria andTiItmLessThanOrEqualTo(Integer value) {
            addCriterion("TI_ITM <=", value, "tiItm");
            return (Criteria) this;
        }

        public Criteria andTiItmIn(List<Integer> values) {
            addCriterion("TI_ITM in", values, "tiItm");
            return (Criteria) this;
        }

        public Criteria andTiItmNotIn(List<Integer> values) {
            addCriterion("TI_ITM not in", values, "tiItm");
            return (Criteria) this;
        }

        public Criteria andTiItmBetween(Integer value1, Integer value2) {
            addCriterion("TI_ITM between", value1, value2, "tiItm");
            return (Criteria) this;
        }

        public Criteria andTiItmNotBetween(Integer value1, Integer value2) {
            addCriterion("TI_ITM not between", value1, value2, "tiItm");
            return (Criteria) this;
        }

        public Criteria andQcFlagIsNull() {
            addCriterion("QC_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andQcFlagIsNotNull() {
            addCriterion("QC_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andQcFlagEqualTo(String value) {
            addCriterion("QC_FLAG =", value, "qcFlag");
            return (Criteria) this;
        }

        public Criteria andQcFlagNotEqualTo(String value) {
            addCriterion("QC_FLAG <>", value, "qcFlag");
            return (Criteria) this;
        }

        public Criteria andQcFlagGreaterThan(String value) {
            addCriterion("QC_FLAG >", value, "qcFlag");
            return (Criteria) this;
        }

        public Criteria andQcFlagGreaterThanOrEqualTo(String value) {
            addCriterion("QC_FLAG >=", value, "qcFlag");
            return (Criteria) this;
        }

        public Criteria andQcFlagLessThan(String value) {
            addCriterion("QC_FLAG <", value, "qcFlag");
            return (Criteria) this;
        }

        public Criteria andQcFlagLessThanOrEqualTo(String value) {
            addCriterion("QC_FLAG <=", value, "qcFlag");
            return (Criteria) this;
        }

        public Criteria andQcFlagLike(String value) {
            addCriterion("QC_FLAG like", value, "qcFlag");
            return (Criteria) this;
        }

        public Criteria andQcFlagNotLike(String value) {
            addCriterion("QC_FLAG not like", value, "qcFlag");
            return (Criteria) this;
        }

        public Criteria andQcFlagIn(List<String> values) {
            addCriterion("QC_FLAG in", values, "qcFlag");
            return (Criteria) this;
        }

        public Criteria andQcFlagNotIn(List<String> values) {
            addCriterion("QC_FLAG not in", values, "qcFlag");
            return (Criteria) this;
        }

        public Criteria andQcFlagBetween(String value1, String value2) {
            addCriterion("QC_FLAG between", value1, value2, "qcFlag");
            return (Criteria) this;
        }

        public Criteria andQcFlagNotBetween(String value1, String value2) {
            addCriterion("QC_FLAG not between", value1, value2, "qcFlag");
            return (Criteria) this;
        }

        public Criteria andQcItmIsNull() {
            addCriterion("QC_ITM is null");
            return (Criteria) this;
        }

        public Criteria andQcItmIsNotNull() {
            addCriterion("QC_ITM is not null");
            return (Criteria) this;
        }

        public Criteria andQcItmEqualTo(Integer value) {
            addCriterion("QC_ITM =", value, "qcItm");
            return (Criteria) this;
        }

        public Criteria andQcItmNotEqualTo(Integer value) {
            addCriterion("QC_ITM <>", value, "qcItm");
            return (Criteria) this;
        }

        public Criteria andQcItmGreaterThan(Integer value) {
            addCriterion("QC_ITM >", value, "qcItm");
            return (Criteria) this;
        }

        public Criteria andQcItmGreaterThanOrEqualTo(Integer value) {
            addCriterion("QC_ITM >=", value, "qcItm");
            return (Criteria) this;
        }

        public Criteria andQcItmLessThan(Integer value) {
            addCriterion("QC_ITM <", value, "qcItm");
            return (Criteria) this;
        }

        public Criteria andQcItmLessThanOrEqualTo(Integer value) {
            addCriterion("QC_ITM <=", value, "qcItm");
            return (Criteria) this;
        }

        public Criteria andQcItmIn(List<Integer> values) {
            addCriterion("QC_ITM in", values, "qcItm");
            return (Criteria) this;
        }

        public Criteria andQcItmNotIn(List<Integer> values) {
            addCriterion("QC_ITM not in", values, "qcItm");
            return (Criteria) this;
        }

        public Criteria andQcItmBetween(Integer value1, Integer value2) {
            addCriterion("QC_ITM between", value1, value2, "qcItm");
            return (Criteria) this;
        }

        public Criteria andQcItmNotBetween(Integer value1, Integer value2) {
            addCriterion("QC_ITM not between", value1, value2, "qcItm");
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

        public Criteria andOsItmIsNull() {
            addCriterion("OS_ITM is null");
            return (Criteria) this;
        }

        public Criteria andOsItmIsNotNull() {
            addCriterion("OS_ITM is not null");
            return (Criteria) this;
        }

        public Criteria andOsItmEqualTo(Integer value) {
            addCriterion("OS_ITM =", value, "osItm");
            return (Criteria) this;
        }

        public Criteria andOsItmNotEqualTo(Integer value) {
            addCriterion("OS_ITM <>", value, "osItm");
            return (Criteria) this;
        }

        public Criteria andOsItmGreaterThan(Integer value) {
            addCriterion("OS_ITM >", value, "osItm");
            return (Criteria) this;
        }

        public Criteria andOsItmGreaterThanOrEqualTo(Integer value) {
            addCriterion("OS_ITM >=", value, "osItm");
            return (Criteria) this;
        }

        public Criteria andOsItmLessThan(Integer value) {
            addCriterion("OS_ITM <", value, "osItm");
            return (Criteria) this;
        }

        public Criteria andOsItmLessThanOrEqualTo(Integer value) {
            addCriterion("OS_ITM <=", value, "osItm");
            return (Criteria) this;
        }

        public Criteria andOsItmIn(List<Integer> values) {
            addCriterion("OS_ITM in", values, "osItm");
            return (Criteria) this;
        }

        public Criteria andOsItmNotIn(List<Integer> values) {
            addCriterion("OS_ITM not in", values, "osItm");
            return (Criteria) this;
        }

        public Criteria andOsItmBetween(Integer value1, Integer value2) {
            addCriterion("OS_ITM between", value1, value2, "osItm");
            return (Criteria) this;
        }

        public Criteria andOsItmNotBetween(Integer value1, Integer value2) {
            addCriterion("OS_ITM not between", value1, value2, "osItm");
            return (Criteria) this;
        }

        public Criteria andTaxRtoIsNull() {
            addCriterion("TAX_RTO is null");
            return (Criteria) this;
        }

        public Criteria andTaxRtoIsNotNull() {
            addCriterion("TAX_RTO is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRtoEqualTo(BigDecimal value) {
            addCriterion("TAX_RTO =", value, "taxRto");
            return (Criteria) this;
        }

        public Criteria andTaxRtoNotEqualTo(BigDecimal value) {
            addCriterion("TAX_RTO <>", value, "taxRto");
            return (Criteria) this;
        }

        public Criteria andTaxRtoGreaterThan(BigDecimal value) {
            addCriterion("TAX_RTO >", value, "taxRto");
            return (Criteria) this;
        }

        public Criteria andTaxRtoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_RTO >=", value, "taxRto");
            return (Criteria) this;
        }

        public Criteria andTaxRtoLessThan(BigDecimal value) {
            addCriterion("TAX_RTO <", value, "taxRto");
            return (Criteria) this;
        }

        public Criteria andTaxRtoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_RTO <=", value, "taxRto");
            return (Criteria) this;
        }

        public Criteria andTaxRtoIn(List<BigDecimal> values) {
            addCriterion("TAX_RTO in", values, "taxRto");
            return (Criteria) this;
        }

        public Criteria andTaxRtoNotIn(List<BigDecimal> values) {
            addCriterion("TAX_RTO not in", values, "taxRto");
            return (Criteria) this;
        }

        public Criteria andTaxRtoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_RTO between", value1, value2, "taxRto");
            return (Criteria) this;
        }

        public Criteria andTaxRtoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_RTO not between", value1, value2, "taxRto");
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

        public Criteria andDepRkIsNull() {
            addCriterion("DEP_RK is null");
            return (Criteria) this;
        }

        public Criteria andDepRkIsNotNull() {
            addCriterion("DEP_RK is not null");
            return (Criteria) this;
        }

        public Criteria andDepRkEqualTo(String value) {
            addCriterion("DEP_RK =", value, "depRk");
            return (Criteria) this;
        }

        public Criteria andDepRkNotEqualTo(String value) {
            addCriterion("DEP_RK <>", value, "depRk");
            return (Criteria) this;
        }

        public Criteria andDepRkGreaterThan(String value) {
            addCriterion("DEP_RK >", value, "depRk");
            return (Criteria) this;
        }

        public Criteria andDepRkGreaterThanOrEqualTo(String value) {
            addCriterion("DEP_RK >=", value, "depRk");
            return (Criteria) this;
        }

        public Criteria andDepRkLessThan(String value) {
            addCriterion("DEP_RK <", value, "depRk");
            return (Criteria) this;
        }

        public Criteria andDepRkLessThanOrEqualTo(String value) {
            addCriterion("DEP_RK <=", value, "depRk");
            return (Criteria) this;
        }

        public Criteria andDepRkLike(String value) {
            addCriterion("DEP_RK like", value, "depRk");
            return (Criteria) this;
        }

        public Criteria andDepRkNotLike(String value) {
            addCriterion("DEP_RK not like", value, "depRk");
            return (Criteria) this;
        }

        public Criteria andDepRkIn(List<String> values) {
            addCriterion("DEP_RK in", values, "depRk");
            return (Criteria) this;
        }

        public Criteria andDepRkNotIn(List<String> values) {
            addCriterion("DEP_RK not in", values, "depRk");
            return (Criteria) this;
        }

        public Criteria andDepRkBetween(String value1, String value2) {
            addCriterion("DEP_RK between", value1, value2, "depRk");
            return (Criteria) this;
        }

        public Criteria andDepRkNotBetween(String value1, String value2) {
            addCriterion("DEP_RK not between", value1, value2, "depRk");
            return (Criteria) this;
        }

        public Criteria andTrdIdIsNull() {
            addCriterion("TRD_ID is null");
            return (Criteria) this;
        }

        public Criteria andTrdIdIsNotNull() {
            addCriterion("TRD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTrdIdEqualTo(String value) {
            addCriterion("TRD_ID =", value, "trdId");
            return (Criteria) this;
        }

        public Criteria andTrdIdNotEqualTo(String value) {
            addCriterion("TRD_ID <>", value, "trdId");
            return (Criteria) this;
        }

        public Criteria andTrdIdGreaterThan(String value) {
            addCriterion("TRD_ID >", value, "trdId");
            return (Criteria) this;
        }

        public Criteria andTrdIdGreaterThanOrEqualTo(String value) {
            addCriterion("TRD_ID >=", value, "trdId");
            return (Criteria) this;
        }

        public Criteria andTrdIdLessThan(String value) {
            addCriterion("TRD_ID <", value, "trdId");
            return (Criteria) this;
        }

        public Criteria andTrdIdLessThanOrEqualTo(String value) {
            addCriterion("TRD_ID <=", value, "trdId");
            return (Criteria) this;
        }

        public Criteria andTrdIdLike(String value) {
            addCriterion("TRD_ID like", value, "trdId");
            return (Criteria) this;
        }

        public Criteria andTrdIdNotLike(String value) {
            addCriterion("TRD_ID not like", value, "trdId");
            return (Criteria) this;
        }

        public Criteria andTrdIdIn(List<String> values) {
            addCriterion("TRD_ID in", values, "trdId");
            return (Criteria) this;
        }

        public Criteria andTrdIdNotIn(List<String> values) {
            addCriterion("TRD_ID not in", values, "trdId");
            return (Criteria) this;
        }

        public Criteria andTrdIdBetween(String value1, String value2) {
            addCriterion("TRD_ID between", value1, value2, "trdId");
            return (Criteria) this;
        }

        public Criteria andTrdIdNotBetween(String value1, String value2) {
            addCriterion("TRD_ID not between", value1, value2, "trdId");
            return (Criteria) this;
        }

        public Criteria andTrdNoIsNull() {
            addCriterion("TRD_NO is null");
            return (Criteria) this;
        }

        public Criteria andTrdNoIsNotNull() {
            addCriterion("TRD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTrdNoEqualTo(String value) {
            addCriterion("TRD_NO =", value, "trdNo");
            return (Criteria) this;
        }

        public Criteria andTrdNoNotEqualTo(String value) {
            addCriterion("TRD_NO <>", value, "trdNo");
            return (Criteria) this;
        }

        public Criteria andTrdNoGreaterThan(String value) {
            addCriterion("TRD_NO >", value, "trdNo");
            return (Criteria) this;
        }

        public Criteria andTrdNoGreaterThanOrEqualTo(String value) {
            addCriterion("TRD_NO >=", value, "trdNo");
            return (Criteria) this;
        }

        public Criteria andTrdNoLessThan(String value) {
            addCriterion("TRD_NO <", value, "trdNo");
            return (Criteria) this;
        }

        public Criteria andTrdNoLessThanOrEqualTo(String value) {
            addCriterion("TRD_NO <=", value, "trdNo");
            return (Criteria) this;
        }

        public Criteria andTrdNoLike(String value) {
            addCriterion("TRD_NO like", value, "trdNo");
            return (Criteria) this;
        }

        public Criteria andTrdNoNotLike(String value) {
            addCriterion("TRD_NO not like", value, "trdNo");
            return (Criteria) this;
        }

        public Criteria andTrdNoIn(List<String> values) {
            addCriterion("TRD_NO in", values, "trdNo");
            return (Criteria) this;
        }

        public Criteria andTrdNoNotIn(List<String> values) {
            addCriterion("TRD_NO not in", values, "trdNo");
            return (Criteria) this;
        }

        public Criteria andTrdNoBetween(String value1, String value2) {
            addCriterion("TRD_NO between", value1, value2, "trdNo");
            return (Criteria) this;
        }

        public Criteria andTrdNoNotBetween(String value1, String value2) {
            addCriterion("TRD_NO not between", value1, value2, "trdNo");
            return (Criteria) this;
        }

        public Criteria andTrdItmIsNull() {
            addCriterion("TRD_ITM is null");
            return (Criteria) this;
        }

        public Criteria andTrdItmIsNotNull() {
            addCriterion("TRD_ITM is not null");
            return (Criteria) this;
        }

        public Criteria andTrdItmEqualTo(Integer value) {
            addCriterion("TRD_ITM =", value, "trdItm");
            return (Criteria) this;
        }

        public Criteria andTrdItmNotEqualTo(Integer value) {
            addCriterion("TRD_ITM <>", value, "trdItm");
            return (Criteria) this;
        }

        public Criteria andTrdItmGreaterThan(Integer value) {
            addCriterion("TRD_ITM >", value, "trdItm");
            return (Criteria) this;
        }

        public Criteria andTrdItmGreaterThanOrEqualTo(Integer value) {
            addCriterion("TRD_ITM >=", value, "trdItm");
            return (Criteria) this;
        }

        public Criteria andTrdItmLessThan(Integer value) {
            addCriterion("TRD_ITM <", value, "trdItm");
            return (Criteria) this;
        }

        public Criteria andTrdItmLessThanOrEqualTo(Integer value) {
            addCriterion("TRD_ITM <=", value, "trdItm");
            return (Criteria) this;
        }

        public Criteria andTrdItmIn(List<Integer> values) {
            addCriterion("TRD_ITM in", values, "trdItm");
            return (Criteria) this;
        }

        public Criteria andTrdItmNotIn(List<Integer> values) {
            addCriterion("TRD_ITM not in", values, "trdItm");
            return (Criteria) this;
        }

        public Criteria andTrdItmBetween(Integer value1, Integer value2) {
            addCriterion("TRD_ITM between", value1, value2, "trdItm");
            return (Criteria) this;
        }

        public Criteria andTrdItmNotBetween(Integer value1, Integer value2) {
            addCriterion("TRD_ITM not between", value1, value2, "trdItm");
            return (Criteria) this;
        }

        public Criteria andBzKndIsNull() {
            addCriterion("BZ_KND is null");
            return (Criteria) this;
        }

        public Criteria andBzKndIsNotNull() {
            addCriterion("BZ_KND is not null");
            return (Criteria) this;
        }

        public Criteria andBzKndEqualTo(String value) {
            addCriterion("BZ_KND =", value, "bzKnd");
            return (Criteria) this;
        }

        public Criteria andBzKndNotEqualTo(String value) {
            addCriterion("BZ_KND <>", value, "bzKnd");
            return (Criteria) this;
        }

        public Criteria andBzKndGreaterThan(String value) {
            addCriterion("BZ_KND >", value, "bzKnd");
            return (Criteria) this;
        }

        public Criteria andBzKndGreaterThanOrEqualTo(String value) {
            addCriterion("BZ_KND >=", value, "bzKnd");
            return (Criteria) this;
        }

        public Criteria andBzKndLessThan(String value) {
            addCriterion("BZ_KND <", value, "bzKnd");
            return (Criteria) this;
        }

        public Criteria andBzKndLessThanOrEqualTo(String value) {
            addCriterion("BZ_KND <=", value, "bzKnd");
            return (Criteria) this;
        }

        public Criteria andBzKndLike(String value) {
            addCriterion("BZ_KND like", value, "bzKnd");
            return (Criteria) this;
        }

        public Criteria andBzKndNotLike(String value) {
            addCriterion("BZ_KND not like", value, "bzKnd");
            return (Criteria) this;
        }

        public Criteria andBzKndIn(List<String> values) {
            addCriterion("BZ_KND in", values, "bzKnd");
            return (Criteria) this;
        }

        public Criteria andBzKndNotIn(List<String> values) {
            addCriterion("BZ_KND not in", values, "bzKnd");
            return (Criteria) this;
        }

        public Criteria andBzKndBetween(String value1, String value2) {
            addCriterion("BZ_KND between", value1, value2, "bzKnd");
            return (Criteria) this;
        }

        public Criteria andBzKndNotBetween(String value1, String value2) {
            addCriterion("BZ_KND not between", value1, value2, "bzKnd");
            return (Criteria) this;
        }

        public Criteria andUpMainIsNull() {
            addCriterion("UP_MAIN is null");
            return (Criteria) this;
        }

        public Criteria andUpMainIsNotNull() {
            addCriterion("UP_MAIN is not null");
            return (Criteria) this;
        }

        public Criteria andUpMainEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN =", value, "upMain");
            return (Criteria) this;
        }

        public Criteria andUpMainNotEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN <>", value, "upMain");
            return (Criteria) this;
        }

        public Criteria andUpMainGreaterThan(BigDecimal value) {
            addCriterion("UP_MAIN >", value, "upMain");
            return (Criteria) this;
        }

        public Criteria andUpMainGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN >=", value, "upMain");
            return (Criteria) this;
        }

        public Criteria andUpMainLessThan(BigDecimal value) {
            addCriterion("UP_MAIN <", value, "upMain");
            return (Criteria) this;
        }

        public Criteria andUpMainLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN <=", value, "upMain");
            return (Criteria) this;
        }

        public Criteria andUpMainIn(List<BigDecimal> values) {
            addCriterion("UP_MAIN in", values, "upMain");
            return (Criteria) this;
        }

        public Criteria andUpMainNotIn(List<BigDecimal> values) {
            addCriterion("UP_MAIN not in", values, "upMain");
            return (Criteria) this;
        }

        public Criteria andUpMainBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_MAIN between", value1, value2, "upMain");
            return (Criteria) this;
        }

        public Criteria andUpMainNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_MAIN not between", value1, value2, "upMain");
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

        public Criteria andUpStdIsNull() {
            addCriterion("UP_STD is null");
            return (Criteria) this;
        }

        public Criteria andUpStdIsNotNull() {
            addCriterion("UP_STD is not null");
            return (Criteria) this;
        }

        public Criteria andUpStdEqualTo(BigDecimal value) {
            addCriterion("UP_STD =", value, "upStd");
            return (Criteria) this;
        }

        public Criteria andUpStdNotEqualTo(BigDecimal value) {
            addCriterion("UP_STD <>", value, "upStd");
            return (Criteria) this;
        }

        public Criteria andUpStdGreaterThan(BigDecimal value) {
            addCriterion("UP_STD >", value, "upStd");
            return (Criteria) this;
        }

        public Criteria andUpStdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_STD >=", value, "upStd");
            return (Criteria) this;
        }

        public Criteria andUpStdLessThan(BigDecimal value) {
            addCriterion("UP_STD <", value, "upStd");
            return (Criteria) this;
        }

        public Criteria andUpStdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_STD <=", value, "upStd");
            return (Criteria) this;
        }

        public Criteria andUpStdIn(List<BigDecimal> values) {
            addCriterion("UP_STD in", values, "upStd");
            return (Criteria) this;
        }

        public Criteria andUpStdNotIn(List<BigDecimal> values) {
            addCriterion("UP_STD not in", values, "upStd");
            return (Criteria) this;
        }

        public Criteria andUpStdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_STD between", value1, value2, "upStd");
            return (Criteria) this;
        }

        public Criteria andUpStdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_STD not between", value1, value2, "upStd");
            return (Criteria) this;
        }

        public Criteria andCstIfrsIsNull() {
            addCriterion("CST_IFRS is null");
            return (Criteria) this;
        }

        public Criteria andCstIfrsIsNotNull() {
            addCriterion("CST_IFRS is not null");
            return (Criteria) this;
        }

        public Criteria andCstIfrsEqualTo(BigDecimal value) {
            addCriterion("CST_IFRS =", value, "cstIfrs");
            return (Criteria) this;
        }

        public Criteria andCstIfrsNotEqualTo(BigDecimal value) {
            addCriterion("CST_IFRS <>", value, "cstIfrs");
            return (Criteria) this;
        }

        public Criteria andCstIfrsGreaterThan(BigDecimal value) {
            addCriterion("CST_IFRS >", value, "cstIfrs");
            return (Criteria) this;
        }

        public Criteria andCstIfrsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_IFRS >=", value, "cstIfrs");
            return (Criteria) this;
        }

        public Criteria andCstIfrsLessThan(BigDecimal value) {
            addCriterion("CST_IFRS <", value, "cstIfrs");
            return (Criteria) this;
        }

        public Criteria andCstIfrsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_IFRS <=", value, "cstIfrs");
            return (Criteria) this;
        }

        public Criteria andCstIfrsIn(List<BigDecimal> values) {
            addCriterion("CST_IFRS in", values, "cstIfrs");
            return (Criteria) this;
        }

        public Criteria andCstIfrsNotIn(List<BigDecimal> values) {
            addCriterion("CST_IFRS not in", values, "cstIfrs");
            return (Criteria) this;
        }

        public Criteria andCstIfrsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_IFRS between", value1, value2, "cstIfrs");
            return (Criteria) this;
        }

        public Criteria andCstIfrsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_IFRS not between", value1, value2, "cstIfrs");
            return (Criteria) this;
        }

        public Criteria andCstStdIfrsIsNull() {
            addCriterion("CST_STD_IFRS is null");
            return (Criteria) this;
        }

        public Criteria andCstStdIfrsIsNotNull() {
            addCriterion("CST_STD_IFRS is not null");
            return (Criteria) this;
        }

        public Criteria andCstStdIfrsEqualTo(BigDecimal value) {
            addCriterion("CST_STD_IFRS =", value, "cstStdIfrs");
            return (Criteria) this;
        }

        public Criteria andCstStdIfrsNotEqualTo(BigDecimal value) {
            addCriterion("CST_STD_IFRS <>", value, "cstStdIfrs");
            return (Criteria) this;
        }

        public Criteria andCstStdIfrsGreaterThan(BigDecimal value) {
            addCriterion("CST_STD_IFRS >", value, "cstStdIfrs");
            return (Criteria) this;
        }

        public Criteria andCstStdIfrsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_STD_IFRS >=", value, "cstStdIfrs");
            return (Criteria) this;
        }

        public Criteria andCstStdIfrsLessThan(BigDecimal value) {
            addCriterion("CST_STD_IFRS <", value, "cstStdIfrs");
            return (Criteria) this;
        }

        public Criteria andCstStdIfrsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CST_STD_IFRS <=", value, "cstStdIfrs");
            return (Criteria) this;
        }

        public Criteria andCstStdIfrsIn(List<BigDecimal> values) {
            addCriterion("CST_STD_IFRS in", values, "cstStdIfrs");
            return (Criteria) this;
        }

        public Criteria andCstStdIfrsNotIn(List<BigDecimal> values) {
            addCriterion("CST_STD_IFRS not in", values, "cstStdIfrs");
            return (Criteria) this;
        }

        public Criteria andCstStdIfrsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_STD_IFRS between", value1, value2, "cstStdIfrs");
            return (Criteria) this;
        }

        public Criteria andCstStdIfrsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CST_STD_IFRS not between", value1, value2, "cstStdIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnIfrsIsNull() {
            addCriterion("AMTN_IFRS is null");
            return (Criteria) this;
        }

        public Criteria andAmtnIfrsIsNotNull() {
            addCriterion("AMTN_IFRS is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnIfrsEqualTo(BigDecimal value) {
            addCriterion("AMTN_IFRS =", value, "amtnIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnIfrsNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_IFRS <>", value, "amtnIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnIfrsGreaterThan(BigDecimal value) {
            addCriterion("AMTN_IFRS >", value, "amtnIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnIfrsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_IFRS >=", value, "amtnIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnIfrsLessThan(BigDecimal value) {
            addCriterion("AMTN_IFRS <", value, "amtnIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnIfrsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_IFRS <=", value, "amtnIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnIfrsIn(List<BigDecimal> values) {
            addCriterion("AMTN_IFRS in", values, "amtnIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnIfrsNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_IFRS not in", values, "amtnIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnIfrsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_IFRS between", value1, value2, "amtnIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnIfrsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_IFRS not between", value1, value2, "amtnIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsIsNull() {
            addCriterion("AMTN_NET_IFRS is null");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsIsNotNull() {
            addCriterion("AMTN_NET_IFRS is not null");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_IFRS =", value, "amtnNetIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsNotEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_IFRS <>", value, "amtnNetIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsGreaterThan(BigDecimal value) {
            addCriterion("AMTN_NET_IFRS >", value, "amtnNetIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_IFRS >=", value, "amtnNetIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsLessThan(BigDecimal value) {
            addCriterion("AMTN_NET_IFRS <", value, "amtnNetIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMTN_NET_IFRS <=", value, "amtnNetIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsIn(List<BigDecimal> values) {
            addCriterion("AMTN_NET_IFRS in", values, "amtnNetIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsNotIn(List<BigDecimal> values) {
            addCriterion("AMTN_NET_IFRS not in", values, "amtnNetIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_NET_IFRS between", value1, value2, "amtnNetIfrs");
            return (Criteria) this;
        }

        public Criteria andAmtnNetIfrsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMTN_NET_IFRS not between", value1, value2, "amtnNetIfrs");
            return (Criteria) this;
        }

        public Criteria andTaxIfrsIsNull() {
            addCriterion("TAX_IFRS is null");
            return (Criteria) this;
        }

        public Criteria andTaxIfrsIsNotNull() {
            addCriterion("TAX_IFRS is not null");
            return (Criteria) this;
        }

        public Criteria andTaxIfrsEqualTo(BigDecimal value) {
            addCriterion("TAX_IFRS =", value, "taxIfrs");
            return (Criteria) this;
        }

        public Criteria andTaxIfrsNotEqualTo(BigDecimal value) {
            addCriterion("TAX_IFRS <>", value, "taxIfrs");
            return (Criteria) this;
        }

        public Criteria andTaxIfrsGreaterThan(BigDecimal value) {
            addCriterion("TAX_IFRS >", value, "taxIfrs");
            return (Criteria) this;
        }

        public Criteria andTaxIfrsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_IFRS >=", value, "taxIfrs");
            return (Criteria) this;
        }

        public Criteria andTaxIfrsLessThan(BigDecimal value) {
            addCriterion("TAX_IFRS <", value, "taxIfrs");
            return (Criteria) this;
        }

        public Criteria andTaxIfrsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_IFRS <=", value, "taxIfrs");
            return (Criteria) this;
        }

        public Criteria andTaxIfrsIn(List<BigDecimal> values) {
            addCriterion("TAX_IFRS in", values, "taxIfrs");
            return (Criteria) this;
        }

        public Criteria andTaxIfrsNotIn(List<BigDecimal> values) {
            addCriterion("TAX_IFRS not in", values, "taxIfrs");
            return (Criteria) this;
        }

        public Criteria andTaxIfrsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_IFRS between", value1, value2, "taxIfrs");
            return (Criteria) this;
        }

        public Criteria andTaxIfrsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_IFRS not between", value1, value2, "taxIfrs");
            return (Criteria) this;
        }

        public Criteria andUpMainIfrsIsNull() {
            addCriterion("UP_MAIN_IFRS is null");
            return (Criteria) this;
        }

        public Criteria andUpMainIfrsIsNotNull() {
            addCriterion("UP_MAIN_IFRS is not null");
            return (Criteria) this;
        }

        public Criteria andUpMainIfrsEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_IFRS =", value, "upMainIfrs");
            return (Criteria) this;
        }

        public Criteria andUpMainIfrsNotEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_IFRS <>", value, "upMainIfrs");
            return (Criteria) this;
        }

        public Criteria andUpMainIfrsGreaterThan(BigDecimal value) {
            addCriterion("UP_MAIN_IFRS >", value, "upMainIfrs");
            return (Criteria) this;
        }

        public Criteria andUpMainIfrsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_IFRS >=", value, "upMainIfrs");
            return (Criteria) this;
        }

        public Criteria andUpMainIfrsLessThan(BigDecimal value) {
            addCriterion("UP_MAIN_IFRS <", value, "upMainIfrs");
            return (Criteria) this;
        }

        public Criteria andUpMainIfrsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_MAIN_IFRS <=", value, "upMainIfrs");
            return (Criteria) this;
        }

        public Criteria andUpMainIfrsIn(List<BigDecimal> values) {
            addCriterion("UP_MAIN_IFRS in", values, "upMainIfrs");
            return (Criteria) this;
        }

        public Criteria andUpMainIfrsNotIn(List<BigDecimal> values) {
            addCriterion("UP_MAIN_IFRS not in", values, "upMainIfrs");
            return (Criteria) this;
        }

        public Criteria andUpMainIfrsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_MAIN_IFRS between", value1, value2, "upMainIfrs");
            return (Criteria) this;
        }

        public Criteria andUpMainIfrsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_MAIN_IFRS not between", value1, value2, "upMainIfrs");
            return (Criteria) this;
        }

        public Criteria andUpStdIfrsIsNull() {
            addCriterion("UP_STD_IFRS is null");
            return (Criteria) this;
        }

        public Criteria andUpStdIfrsIsNotNull() {
            addCriterion("UP_STD_IFRS is not null");
            return (Criteria) this;
        }

        public Criteria andUpStdIfrsEqualTo(BigDecimal value) {
            addCriterion("UP_STD_IFRS =", value, "upStdIfrs");
            return (Criteria) this;
        }

        public Criteria andUpStdIfrsNotEqualTo(BigDecimal value) {
            addCriterion("UP_STD_IFRS <>", value, "upStdIfrs");
            return (Criteria) this;
        }

        public Criteria andUpStdIfrsGreaterThan(BigDecimal value) {
            addCriterion("UP_STD_IFRS >", value, "upStdIfrs");
            return (Criteria) this;
        }

        public Criteria andUpStdIfrsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_STD_IFRS >=", value, "upStdIfrs");
            return (Criteria) this;
        }

        public Criteria andUpStdIfrsLessThan(BigDecimal value) {
            addCriterion("UP_STD_IFRS <", value, "upStdIfrs");
            return (Criteria) this;
        }

        public Criteria andUpStdIfrsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UP_STD_IFRS <=", value, "upStdIfrs");
            return (Criteria) this;
        }

        public Criteria andUpStdIfrsIn(List<BigDecimal> values) {
            addCriterion("UP_STD_IFRS in", values, "upStdIfrs");
            return (Criteria) this;
        }

        public Criteria andUpStdIfrsNotIn(List<BigDecimal> values) {
            addCriterion("UP_STD_IFRS not in", values, "upStdIfrs");
            return (Criteria) this;
        }

        public Criteria andUpStdIfrsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_STD_IFRS between", value1, value2, "upStdIfrs");
            return (Criteria) this;
        }

        public Criteria andUpStdIfrsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UP_STD_IFRS not between", value1, value2, "upStdIfrs");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkIsNull() {
            addCriterion("SUP_PRD_MARK is null");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkIsNotNull() {
            addCriterion("SUP_PRD_MARK is not null");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkEqualTo(String value) {
            addCriterion("SUP_PRD_MARK =", value, "supPrdMark");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkNotEqualTo(String value) {
            addCriterion("SUP_PRD_MARK <>", value, "supPrdMark");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkGreaterThan(String value) {
            addCriterion("SUP_PRD_MARK >", value, "supPrdMark");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkGreaterThanOrEqualTo(String value) {
            addCriterion("SUP_PRD_MARK >=", value, "supPrdMark");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkLessThan(String value) {
            addCriterion("SUP_PRD_MARK <", value, "supPrdMark");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkLessThanOrEqualTo(String value) {
            addCriterion("SUP_PRD_MARK <=", value, "supPrdMark");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkLike(String value) {
            addCriterion("SUP_PRD_MARK like", value, "supPrdMark");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkNotLike(String value) {
            addCriterion("SUP_PRD_MARK not like", value, "supPrdMark");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkIn(List<String> values) {
            addCriterion("SUP_PRD_MARK in", values, "supPrdMark");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkNotIn(List<String> values) {
            addCriterion("SUP_PRD_MARK not in", values, "supPrdMark");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkBetween(String value1, String value2) {
            addCriterion("SUP_PRD_MARK between", value1, value2, "supPrdMark");
            return (Criteria) this;
        }

        public Criteria andSupPrdMarkNotBetween(String value1, String value2) {
            addCriterion("SUP_PRD_MARK not between", value1, value2, "supPrdMark");
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

        public Criteria andQty1FpIsNull() {
            addCriterion("QTY1_FP is null");
            return (Criteria) this;
        }

        public Criteria andQty1FpIsNotNull() {
            addCriterion("QTY1_FP is not null");
            return (Criteria) this;
        }

        public Criteria andQty1FpEqualTo(BigDecimal value) {
            addCriterion("QTY1_FP =", value, "qty1Fp");
            return (Criteria) this;
        }

        public Criteria andQty1FpNotEqualTo(BigDecimal value) {
            addCriterion("QTY1_FP <>", value, "qty1Fp");
            return (Criteria) this;
        }

        public Criteria andQty1FpGreaterThan(BigDecimal value) {
            addCriterion("QTY1_FP >", value, "qty1Fp");
            return (Criteria) this;
        }

        public Criteria andQty1FpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_FP >=", value, "qty1Fp");
            return (Criteria) this;
        }

        public Criteria andQty1FpLessThan(BigDecimal value) {
            addCriterion("QTY1_FP <", value, "qty1Fp");
            return (Criteria) this;
        }

        public Criteria andQty1FpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY1_FP <=", value, "qty1Fp");
            return (Criteria) this;
        }

        public Criteria andQty1FpIn(List<BigDecimal> values) {
            addCriterion("QTY1_FP in", values, "qty1Fp");
            return (Criteria) this;
        }

        public Criteria andQty1FpNotIn(List<BigDecimal> values) {
            addCriterion("QTY1_FP not in", values, "qty1Fp");
            return (Criteria) this;
        }

        public Criteria andQty1FpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_FP between", value1, value2, "qty1Fp");
            return (Criteria) this;
        }

        public Criteria andQty1FpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY1_FP not between", value1, value2, "qty1Fp");
            return (Criteria) this;
        }

        public Criteria andIsSpIsNull() {
            addCriterion("IS_SP is null");
            return (Criteria) this;
        }

        public Criteria andIsSpIsNotNull() {
            addCriterion("IS_SP is not null");
            return (Criteria) this;
        }

        public Criteria andIsSpEqualTo(String value) {
            addCriterion("IS_SP =", value, "isSp");
            return (Criteria) this;
        }

        public Criteria andIsSpNotEqualTo(String value) {
            addCriterion("IS_SP <>", value, "isSp");
            return (Criteria) this;
        }

        public Criteria andIsSpGreaterThan(String value) {
            addCriterion("IS_SP >", value, "isSp");
            return (Criteria) this;
        }

        public Criteria andIsSpGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SP >=", value, "isSp");
            return (Criteria) this;
        }

        public Criteria andIsSpLessThan(String value) {
            addCriterion("IS_SP <", value, "isSp");
            return (Criteria) this;
        }

        public Criteria andIsSpLessThanOrEqualTo(String value) {
            addCriterion("IS_SP <=", value, "isSp");
            return (Criteria) this;
        }

        public Criteria andIsSpLike(String value) {
            addCriterion("IS_SP like", value, "isSp");
            return (Criteria) this;
        }

        public Criteria andIsSpNotLike(String value) {
            addCriterion("IS_SP not like", value, "isSp");
            return (Criteria) this;
        }

        public Criteria andIsSpIn(List<String> values) {
            addCriterion("IS_SP in", values, "isSp");
            return (Criteria) this;
        }

        public Criteria andIsSpNotIn(List<String> values) {
            addCriterion("IS_SP not in", values, "isSp");
            return (Criteria) this;
        }

        public Criteria andIsSpBetween(String value1, String value2) {
            addCriterion("IS_SP between", value1, value2, "isSp");
            return (Criteria) this;
        }

        public Criteria andIsSpNotBetween(String value1, String value2) {
            addCriterion("IS_SP not between", value1, value2, "isSp");
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

        public Criteria andXpmNoIsNull() {
            addCriterion("XPM_NO is null");
            return (Criteria) this;
        }

        public Criteria andXpmNoIsNotNull() {
            addCriterion("XPM_NO is not null");
            return (Criteria) this;
        }

        public Criteria andXpmNoEqualTo(String value) {
            addCriterion("XPM_NO =", value, "xpmNo");
            return (Criteria) this;
        }

        public Criteria andXpmNoNotEqualTo(String value) {
            addCriterion("XPM_NO <>", value, "xpmNo");
            return (Criteria) this;
        }

        public Criteria andXpmNoGreaterThan(String value) {
            addCriterion("XPM_NO >", value, "xpmNo");
            return (Criteria) this;
        }

        public Criteria andXpmNoGreaterThanOrEqualTo(String value) {
            addCriterion("XPM_NO >=", value, "xpmNo");
            return (Criteria) this;
        }

        public Criteria andXpmNoLessThan(String value) {
            addCriterion("XPM_NO <", value, "xpmNo");
            return (Criteria) this;
        }

        public Criteria andXpmNoLessThanOrEqualTo(String value) {
            addCriterion("XPM_NO <=", value, "xpmNo");
            return (Criteria) this;
        }

        public Criteria andXpmNoLike(String value) {
            addCriterion("XPM_NO like", value, "xpmNo");
            return (Criteria) this;
        }

        public Criteria andXpmNoNotLike(String value) {
            addCriterion("XPM_NO not like", value, "xpmNo");
            return (Criteria) this;
        }

        public Criteria andXpmNoIn(List<String> values) {
            addCriterion("XPM_NO in", values, "xpmNo");
            return (Criteria) this;
        }

        public Criteria andXpmNoNotIn(List<String> values) {
            addCriterion("XPM_NO not in", values, "xpmNo");
            return (Criteria) this;
        }

        public Criteria andXpmNoBetween(String value1, String value2) {
            addCriterion("XPM_NO between", value1, value2, "xpmNo");
            return (Criteria) this;
        }

        public Criteria andXpmNoNotBetween(String value1, String value2) {
            addCriterion("XPM_NO not between", value1, value2, "xpmNo");
            return (Criteria) this;
        }

        public Criteria andXpmNo1IsNull() {
            addCriterion("XPM_NO1 is null");
            return (Criteria) this;
        }

        public Criteria andXpmNo1IsNotNull() {
            addCriterion("XPM_NO1 is not null");
            return (Criteria) this;
        }

        public Criteria andXpmNo1EqualTo(String value) {
            addCriterion("XPM_NO1 =", value, "xpmNo1");
            return (Criteria) this;
        }

        public Criteria andXpmNo1NotEqualTo(String value) {
            addCriterion("XPM_NO1 <>", value, "xpmNo1");
            return (Criteria) this;
        }

        public Criteria andXpmNo1GreaterThan(String value) {
            addCriterion("XPM_NO1 >", value, "xpmNo1");
            return (Criteria) this;
        }

        public Criteria andXpmNo1GreaterThanOrEqualTo(String value) {
            addCriterion("XPM_NO1 >=", value, "xpmNo1");
            return (Criteria) this;
        }

        public Criteria andXpmNo1LessThan(String value) {
            addCriterion("XPM_NO1 <", value, "xpmNo1");
            return (Criteria) this;
        }

        public Criteria andXpmNo1LessThanOrEqualTo(String value) {
            addCriterion("XPM_NO1 <=", value, "xpmNo1");
            return (Criteria) this;
        }

        public Criteria andXpmNo1Like(String value) {
            addCriterion("XPM_NO1 like", value, "xpmNo1");
            return (Criteria) this;
        }

        public Criteria andXpmNo1NotLike(String value) {
            addCriterion("XPM_NO1 not like", value, "xpmNo1");
            return (Criteria) this;
        }

        public Criteria andXpmNo1In(List<String> values) {
            addCriterion("XPM_NO1 in", values, "xpmNo1");
            return (Criteria) this;
        }

        public Criteria andXpmNo1NotIn(List<String> values) {
            addCriterion("XPM_NO1 not in", values, "xpmNo1");
            return (Criteria) this;
        }

        public Criteria andXpmNo1Between(String value1, String value2) {
            addCriterion("XPM_NO1 between", value1, value2, "xpmNo1");
            return (Criteria) this;
        }

        public Criteria andXpmNo1NotBetween(String value1, String value2) {
            addCriterion("XPM_NO1 not between", value1, value2, "xpmNo1");
            return (Criteria) this;
        }

        public Criteria andChkXzlIsNull() {
            addCriterion("CHK_XZL is null");
            return (Criteria) this;
        }

        public Criteria andChkXzlIsNotNull() {
            addCriterion("CHK_XZL is not null");
            return (Criteria) this;
        }

        public Criteria andChkXzlEqualTo(String value) {
            addCriterion("CHK_XZL =", value, "chkXzl");
            return (Criteria) this;
        }

        public Criteria andChkXzlNotEqualTo(String value) {
            addCriterion("CHK_XZL <>", value, "chkXzl");
            return (Criteria) this;
        }

        public Criteria andChkXzlGreaterThan(String value) {
            addCriterion("CHK_XZL >", value, "chkXzl");
            return (Criteria) this;
        }

        public Criteria andChkXzlGreaterThanOrEqualTo(String value) {
            addCriterion("CHK_XZL >=", value, "chkXzl");
            return (Criteria) this;
        }

        public Criteria andChkXzlLessThan(String value) {
            addCriterion("CHK_XZL <", value, "chkXzl");
            return (Criteria) this;
        }

        public Criteria andChkXzlLessThanOrEqualTo(String value) {
            addCriterion("CHK_XZL <=", value, "chkXzl");
            return (Criteria) this;
        }

        public Criteria andChkXzlLike(String value) {
            addCriterion("CHK_XZL like", value, "chkXzl");
            return (Criteria) this;
        }

        public Criteria andChkXzlNotLike(String value) {
            addCriterion("CHK_XZL not like", value, "chkXzl");
            return (Criteria) this;
        }

        public Criteria andChkXzlIn(List<String> values) {
            addCriterion("CHK_XZL in", values, "chkXzl");
            return (Criteria) this;
        }

        public Criteria andChkXzlNotIn(List<String> values) {
            addCriterion("CHK_XZL not in", values, "chkXzl");
            return (Criteria) this;
        }

        public Criteria andChkXzlBetween(String value1, String value2) {
            addCriterion("CHK_XZL between", value1, value2, "chkXzl");
            return (Criteria) this;
        }

        public Criteria andChkXzlNotBetween(String value1, String value2) {
            addCriterion("CHK_XZL not between", value1, value2, "chkXzl");
            return (Criteria) this;
        }

        public Criteria andQtyFaIsNull() {
            addCriterion("QTY_FA is null");
            return (Criteria) this;
        }

        public Criteria andQtyFaIsNotNull() {
            addCriterion("QTY_FA is not null");
            return (Criteria) this;
        }

        public Criteria andQtyFaEqualTo(BigDecimal value) {
            addCriterion("QTY_FA =", value, "qtyFa");
            return (Criteria) this;
        }

        public Criteria andQtyFaNotEqualTo(BigDecimal value) {
            addCriterion("QTY_FA <>", value, "qtyFa");
            return (Criteria) this;
        }

        public Criteria andQtyFaGreaterThan(BigDecimal value) {
            addCriterion("QTY_FA >", value, "qtyFa");
            return (Criteria) this;
        }

        public Criteria andQtyFaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_FA >=", value, "qtyFa");
            return (Criteria) this;
        }

        public Criteria andQtyFaLessThan(BigDecimal value) {
            addCriterion("QTY_FA <", value, "qtyFa");
            return (Criteria) this;
        }

        public Criteria andQtyFaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_FA <=", value, "qtyFa");
            return (Criteria) this;
        }

        public Criteria andQtyFaIn(List<BigDecimal> values) {
            addCriterion("QTY_FA in", values, "qtyFa");
            return (Criteria) this;
        }

        public Criteria andQtyFaNotIn(List<BigDecimal> values) {
            addCriterion("QTY_FA not in", values, "qtyFa");
            return (Criteria) this;
        }

        public Criteria andQtyFaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_FA between", value1, value2, "qtyFa");
            return (Criteria) this;
        }

        public Criteria andQtyFaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_FA not between", value1, value2, "qtyFa");
            return (Criteria) this;
        }

        public Criteria andQtyFaUnshIsNull() {
            addCriterion("QTY_FA_UNSH is null");
            return (Criteria) this;
        }

        public Criteria andQtyFaUnshIsNotNull() {
            addCriterion("QTY_FA_UNSH is not null");
            return (Criteria) this;
        }

        public Criteria andQtyFaUnshEqualTo(BigDecimal value) {
            addCriterion("QTY_FA_UNSH =", value, "qtyFaUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyFaUnshNotEqualTo(BigDecimal value) {
            addCriterion("QTY_FA_UNSH <>", value, "qtyFaUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyFaUnshGreaterThan(BigDecimal value) {
            addCriterion("QTY_FA_UNSH >", value, "qtyFaUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyFaUnshGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_FA_UNSH >=", value, "qtyFaUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyFaUnshLessThan(BigDecimal value) {
            addCriterion("QTY_FA_UNSH <", value, "qtyFaUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyFaUnshLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY_FA_UNSH <=", value, "qtyFaUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyFaUnshIn(List<BigDecimal> values) {
            addCriterion("QTY_FA_UNSH in", values, "qtyFaUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyFaUnshNotIn(List<BigDecimal> values) {
            addCriterion("QTY_FA_UNSH not in", values, "qtyFaUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyFaUnshBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_FA_UNSH between", value1, value2, "qtyFaUnsh");
            return (Criteria) this;
        }

        public Criteria andQtyFaUnshNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY_FA_UNSH not between", value1, value2, "qtyFaUnsh");
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