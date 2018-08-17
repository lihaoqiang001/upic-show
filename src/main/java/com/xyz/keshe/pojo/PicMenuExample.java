package com.xyz.keshe.pojo;

import java.util.ArrayList;
import java.util.List;

public class PicMenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PicMenuExample() {
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

        public Criteria andMIdIsNull() {
            addCriterion("m_id is null");
            return (Criteria) this;
        }

        public Criteria andMIdIsNotNull() {
            addCriterion("m_id is not null");
            return (Criteria) this;
        }

        public Criteria andMIdEqualTo(Integer value) {
            addCriterion("m_id =", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotEqualTo(Integer value) {
            addCriterion("m_id <>", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThan(Integer value) {
            addCriterion("m_id >", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_id >=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThan(Integer value) {
            addCriterion("m_id <", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThanOrEqualTo(Integer value) {
            addCriterion("m_id <=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdIn(List<Integer> values) {
            addCriterion("m_id in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotIn(List<Integer> values) {
            addCriterion("m_id not in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdBetween(Integer value1, Integer value2) {
            addCriterion("m_id between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m_id not between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMTwoIsNull() {
            addCriterion("m_two is null");
            return (Criteria) this;
        }

        public Criteria andMTwoIsNotNull() {
            addCriterion("m_two is not null");
            return (Criteria) this;
        }

        public Criteria andMTwoEqualTo(String value) {
            addCriterion("m_two =", value, "mTwo");
            return (Criteria) this;
        }

        public Criteria andMTwoNotEqualTo(String value) {
            addCriterion("m_two <>", value, "mTwo");
            return (Criteria) this;
        }

        public Criteria andMTwoGreaterThan(String value) {
            addCriterion("m_two >", value, "mTwo");
            return (Criteria) this;
        }

        public Criteria andMTwoGreaterThanOrEqualTo(String value) {
            addCriterion("m_two >=", value, "mTwo");
            return (Criteria) this;
        }

        public Criteria andMTwoLessThan(String value) {
            addCriterion("m_two <", value, "mTwo");
            return (Criteria) this;
        }

        public Criteria andMTwoLessThanOrEqualTo(String value) {
            addCriterion("m_two <=", value, "mTwo");
            return (Criteria) this;
        }

        public Criteria andMTwoLike(String value) {
            addCriterion("m_two like", value, "mTwo");
            return (Criteria) this;
        }

        public Criteria andMTwoNotLike(String value) {
            addCriterion("m_two not like", value, "mTwo");
            return (Criteria) this;
        }

        public Criteria andMTwoIn(List<String> values) {
            addCriterion("m_two in", values, "mTwo");
            return (Criteria) this;
        }

        public Criteria andMTwoNotIn(List<String> values) {
            addCriterion("m_two not in", values, "mTwo");
            return (Criteria) this;
        }

        public Criteria andMTwoBetween(String value1, String value2) {
            addCriterion("m_two between", value1, value2, "mTwo");
            return (Criteria) this;
        }

        public Criteria andMTwoNotBetween(String value1, String value2) {
            addCriterion("m_two not between", value1, value2, "mTwo");
            return (Criteria) this;
        }

        public Criteria andMOneIsNull() {
            addCriterion("m_one is null");
            return (Criteria) this;
        }

        public Criteria andMOneIsNotNull() {
            addCriterion("m_one is not null");
            return (Criteria) this;
        }

        public Criteria andMOneEqualTo(String value) {
            addCriterion("m_one =", value, "mOne");
            return (Criteria) this;
        }

        public Criteria andMOneNotEqualTo(String value) {
            addCriterion("m_one <>", value, "mOne");
            return (Criteria) this;
        }

        public Criteria andMOneGreaterThan(String value) {
            addCriterion("m_one >", value, "mOne");
            return (Criteria) this;
        }

        public Criteria andMOneGreaterThanOrEqualTo(String value) {
            addCriterion("m_one >=", value, "mOne");
            return (Criteria) this;
        }

        public Criteria andMOneLessThan(String value) {
            addCriterion("m_one <", value, "mOne");
            return (Criteria) this;
        }

        public Criteria andMOneLessThanOrEqualTo(String value) {
            addCriterion("m_one <=", value, "mOne");
            return (Criteria) this;
        }

        public Criteria andMOneLike(String value) {
            addCriterion("m_one like", value, "mOne");
            return (Criteria) this;
        }

        public Criteria andMOneNotLike(String value) {
            addCriterion("m_one not like", value, "mOne");
            return (Criteria) this;
        }

        public Criteria andMOneIn(List<String> values) {
            addCriterion("m_one in", values, "mOne");
            return (Criteria) this;
        }

        public Criteria andMOneNotIn(List<String> values) {
            addCriterion("m_one not in", values, "mOne");
            return (Criteria) this;
        }

        public Criteria andMOneBetween(String value1, String value2) {
            addCriterion("m_one between", value1, value2, "mOne");
            return (Criteria) this;
        }

        public Criteria andMOneNotBetween(String value1, String value2) {
            addCriterion("m_one not between", value1, value2, "mOne");
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