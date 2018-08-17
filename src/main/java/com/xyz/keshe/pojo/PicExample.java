package com.xyz.keshe.pojo;

import java.util.ArrayList;
import java.util.List;

public class PicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PicExample() {
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

        public Criteria andPIdIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(Integer value) {
            addCriterion("p_id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(Integer value) {
            addCriterion("p_id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(Integer value) {
            addCriterion("p_id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(Integer value) {
            addCriterion("p_id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(Integer value) {
            addCriterion("p_id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<Integer> values) {
            addCriterion("p_id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<Integer> values) {
            addCriterion("p_id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(Integer value1, Integer value2) {
            addCriterion("p_id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(Integer value1, Integer value2) {
            addCriterion("p_id not between", value1, value2, "pId");
            return (Criteria) this;
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

        public Criteria andPUrlIsNull() {
            addCriterion("p_url is null");
            return (Criteria) this;
        }

        public Criteria andPUrlIsNotNull() {
            addCriterion("p_url is not null");
            return (Criteria) this;
        }

        public Criteria andPUrlEqualTo(String value) {
            addCriterion("p_url =", value, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlNotEqualTo(String value) {
            addCriterion("p_url <>", value, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlGreaterThan(String value) {
            addCriterion("p_url >", value, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlGreaterThanOrEqualTo(String value) {
            addCriterion("p_url >=", value, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlLessThan(String value) {
            addCriterion("p_url <", value, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlLessThanOrEqualTo(String value) {
            addCriterion("p_url <=", value, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlLike(String value) {
            addCriterion("p_url like", value, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlNotLike(String value) {
            addCriterion("p_url not like", value, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlIn(List<String> values) {
            addCriterion("p_url in", values, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlNotIn(List<String> values) {
            addCriterion("p_url not in", values, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlBetween(String value1, String value2) {
            addCriterion("p_url between", value1, value2, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPUrlNotBetween(String value1, String value2) {
            addCriterion("p_url not between", value1, value2, "pUrl");
            return (Criteria) this;
        }

        public Criteria andPDownloadIsNull() {
            addCriterion("p_download is null");
            return (Criteria) this;
        }

        public Criteria andPDownloadIsNotNull() {
            addCriterion("p_download is not null");
            return (Criteria) this;
        }

        public Criteria andPDownloadEqualTo(Integer value) {
            addCriterion("p_download =", value, "pDownload");
            return (Criteria) this;
        }

        public Criteria andPDownloadNotEqualTo(Integer value) {
            addCriterion("p_download <>", value, "pDownload");
            return (Criteria) this;
        }

        public Criteria andPDownloadGreaterThan(Integer value) {
            addCriterion("p_download >", value, "pDownload");
            return (Criteria) this;
        }

        public Criteria andPDownloadGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_download >=", value, "pDownload");
            return (Criteria) this;
        }

        public Criteria andPDownloadLessThan(Integer value) {
            addCriterion("p_download <", value, "pDownload");
            return (Criteria) this;
        }

        public Criteria andPDownloadLessThanOrEqualTo(Integer value) {
            addCriterion("p_download <=", value, "pDownload");
            return (Criteria) this;
        }

        public Criteria andPDownloadIn(List<Integer> values) {
            addCriterion("p_download in", values, "pDownload");
            return (Criteria) this;
        }

        public Criteria andPDownloadNotIn(List<Integer> values) {
            addCriterion("p_download not in", values, "pDownload");
            return (Criteria) this;
        }

        public Criteria andPDownloadBetween(Integer value1, Integer value2) {
            addCriterion("p_download between", value1, value2, "pDownload");
            return (Criteria) this;
        }

        public Criteria andPDownloadNotBetween(Integer value1, Integer value2) {
            addCriterion("p_download not between", value1, value2, "pDownload");
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