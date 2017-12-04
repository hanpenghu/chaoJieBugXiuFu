package com.ipace.chaoJie.A004Dto;

import java.util.ArrayList;
import java.util.List;

public class MfBlnZExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MfBlnZExample() {
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

        public Criteria andCsdbIsNull() {
            addCriterion("CSDB is null");
            return (Criteria) this;
        }

        public Criteria andCsdbIsNotNull() {
            addCriterion("CSDB is not null");
            return (Criteria) this;
        }

        public Criteria andCsdbEqualTo(String value) {
            addCriterion("CSDB =", value, "csdb");
            return (Criteria) this;
        }

        public Criteria andCsdbNotEqualTo(String value) {
            addCriterion("CSDB <>", value, "csdb");
            return (Criteria) this;
        }

        public Criteria andCsdbGreaterThan(String value) {
            addCriterion("CSDB >", value, "csdb");
            return (Criteria) this;
        }

        public Criteria andCsdbGreaterThanOrEqualTo(String value) {
            addCriterion("CSDB >=", value, "csdb");
            return (Criteria) this;
        }

        public Criteria andCsdbLessThan(String value) {
            addCriterion("CSDB <", value, "csdb");
            return (Criteria) this;
        }

        public Criteria andCsdbLessThanOrEqualTo(String value) {
            addCriterion("CSDB <=", value, "csdb");
            return (Criteria) this;
        }

        public Criteria andCsdbLike(String value) {
            addCriterion("CSDB like", value, "csdb");
            return (Criteria) this;
        }

        public Criteria andCsdbNotLike(String value) {
            addCriterion("CSDB not like", value, "csdb");
            return (Criteria) this;
        }

        public Criteria andCsdbIn(List<String> values) {
            addCriterion("CSDB in", values, "csdb");
            return (Criteria) this;
        }

        public Criteria andCsdbNotIn(List<String> values) {
            addCriterion("CSDB not in", values, "csdb");
            return (Criteria) this;
        }

        public Criteria andCsdbBetween(String value1, String value2) {
            addCriterion("CSDB between", value1, value2, "csdb");
            return (Criteria) this;
        }

        public Criteria andCsdbNotBetween(String value1, String value2) {
            addCriterion("CSDB not between", value1, value2, "csdb");
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