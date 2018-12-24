package com.newlife.fitness.entity;

import java.util.ArrayList;
import java.util.List;

public class DUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DUserExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDUsernameIsNull() {
            addCriterion("d_userName is null");
            return (Criteria) this;
        }

        public Criteria andDUsernameIsNotNull() {
            addCriterion("d_userName is not null");
            return (Criteria) this;
        }

        public Criteria andDUsernameEqualTo(String value) {
            addCriterion("d_userName =", value, "dUsername");
            return (Criteria) this;
        }

        public Criteria andDUsernameNotEqualTo(String value) {
            addCriterion("d_userName <>", value, "dUsername");
            return (Criteria) this;
        }

        public Criteria andDUsernameGreaterThan(String value) {
            addCriterion("d_userName >", value, "dUsername");
            return (Criteria) this;
        }

        public Criteria andDUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("d_userName >=", value, "dUsername");
            return (Criteria) this;
        }

        public Criteria andDUsernameLessThan(String value) {
            addCriterion("d_userName <", value, "dUsername");
            return (Criteria) this;
        }

        public Criteria andDUsernameLessThanOrEqualTo(String value) {
            addCriterion("d_userName <=", value, "dUsername");
            return (Criteria) this;
        }

        public Criteria andDUsernameLike(String value) {
            addCriterion("d_userName like", value, "dUsername");
            return (Criteria) this;
        }

        public Criteria andDUsernameNotLike(String value) {
            addCriterion("d_userName not like", value, "dUsername");
            return (Criteria) this;
        }

        public Criteria andDUsernameIn(List<String> values) {
            addCriterion("d_userName in", values, "dUsername");
            return (Criteria) this;
        }

        public Criteria andDUsernameNotIn(List<String> values) {
            addCriterion("d_userName not in", values, "dUsername");
            return (Criteria) this;
        }

        public Criteria andDUsernameBetween(String value1, String value2) {
            addCriterion("d_userName between", value1, value2, "dUsername");
            return (Criteria) this;
        }

        public Criteria andDUsernameNotBetween(String value1, String value2) {
            addCriterion("d_userName not between", value1, value2, "dUsername");
            return (Criteria) this;
        }

        public Criteria andDLoginnameIsNull() {
            addCriterion("d_loginName is null");
            return (Criteria) this;
        }

        public Criteria andDLoginnameIsNotNull() {
            addCriterion("d_loginName is not null");
            return (Criteria) this;
        }

        public Criteria andDLoginnameEqualTo(String value) {
            addCriterion("d_loginName =", value, "dLoginname");
            return (Criteria) this;
        }

        public Criteria andDLoginnameNotEqualTo(String value) {
            addCriterion("d_loginName <>", value, "dLoginname");
            return (Criteria) this;
        }

        public Criteria andDLoginnameGreaterThan(String value) {
            addCriterion("d_loginName >", value, "dLoginname");
            return (Criteria) this;
        }

        public Criteria andDLoginnameGreaterThanOrEqualTo(String value) {
            addCriterion("d_loginName >=", value, "dLoginname");
            return (Criteria) this;
        }

        public Criteria andDLoginnameLessThan(String value) {
            addCriterion("d_loginName <", value, "dLoginname");
            return (Criteria) this;
        }

        public Criteria andDLoginnameLessThanOrEqualTo(String value) {
            addCriterion("d_loginName <=", value, "dLoginname");
            return (Criteria) this;
        }

        public Criteria andDLoginnameLike(String value) {
            addCriterion("d_loginName like", value, "dLoginname");
            return (Criteria) this;
        }

        public Criteria andDLoginnameNotLike(String value) {
            addCriterion("d_loginName not like", value, "dLoginname");
            return (Criteria) this;
        }

        public Criteria andDLoginnameIn(List<String> values) {
            addCriterion("d_loginName in", values, "dLoginname");
            return (Criteria) this;
        }

        public Criteria andDLoginnameNotIn(List<String> values) {
            addCriterion("d_loginName not in", values, "dLoginname");
            return (Criteria) this;
        }

        public Criteria andDLoginnameBetween(String value1, String value2) {
            addCriterion("d_loginName between", value1, value2, "dLoginname");
            return (Criteria) this;
        }

        public Criteria andDLoginnameNotBetween(String value1, String value2) {
            addCriterion("d_loginName not between", value1, value2, "dLoginname");
            return (Criteria) this;
        }

        public Criteria andDPasswordIsNull() {
            addCriterion("d_passWord is null");
            return (Criteria) this;
        }

        public Criteria andDPasswordIsNotNull() {
            addCriterion("d_passWord is not null");
            return (Criteria) this;
        }

        public Criteria andDPasswordEqualTo(String value) {
            addCriterion("d_passWord =", value, "dPassword");
            return (Criteria) this;
        }

        public Criteria andDPasswordNotEqualTo(String value) {
            addCriterion("d_passWord <>", value, "dPassword");
            return (Criteria) this;
        }

        public Criteria andDPasswordGreaterThan(String value) {
            addCriterion("d_passWord >", value, "dPassword");
            return (Criteria) this;
        }

        public Criteria andDPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("d_passWord >=", value, "dPassword");
            return (Criteria) this;
        }

        public Criteria andDPasswordLessThan(String value) {
            addCriterion("d_passWord <", value, "dPassword");
            return (Criteria) this;
        }

        public Criteria andDPasswordLessThanOrEqualTo(String value) {
            addCriterion("d_passWord <=", value, "dPassword");
            return (Criteria) this;
        }

        public Criteria andDPasswordLike(String value) {
            addCriterion("d_passWord like", value, "dPassword");
            return (Criteria) this;
        }

        public Criteria andDPasswordNotLike(String value) {
            addCriterion("d_passWord not like", value, "dPassword");
            return (Criteria) this;
        }

        public Criteria andDPasswordIn(List<String> values) {
            addCriterion("d_passWord in", values, "dPassword");
            return (Criteria) this;
        }

        public Criteria andDPasswordNotIn(List<String> values) {
            addCriterion("d_passWord not in", values, "dPassword");
            return (Criteria) this;
        }

        public Criteria andDPasswordBetween(String value1, String value2) {
            addCriterion("d_passWord between", value1, value2, "dPassword");
            return (Criteria) this;
        }

        public Criteria andDPasswordNotBetween(String value1, String value2) {
            addCriterion("d_passWord not between", value1, value2, "dPassword");
            return (Criteria) this;
        }

        public Criteria andDSexIsNull() {
            addCriterion("d_sex is null");
            return (Criteria) this;
        }

        public Criteria andDSexIsNotNull() {
            addCriterion("d_sex is not null");
            return (Criteria) this;
        }

        public Criteria andDSexEqualTo(String value) {
            addCriterion("d_sex =", value, "dSex");
            return (Criteria) this;
        }

        public Criteria andDSexNotEqualTo(String value) {
            addCriterion("d_sex <>", value, "dSex");
            return (Criteria) this;
        }

        public Criteria andDSexGreaterThan(String value) {
            addCriterion("d_sex >", value, "dSex");
            return (Criteria) this;
        }

        public Criteria andDSexGreaterThanOrEqualTo(String value) {
            addCriterion("d_sex >=", value, "dSex");
            return (Criteria) this;
        }

        public Criteria andDSexLessThan(String value) {
            addCriterion("d_sex <", value, "dSex");
            return (Criteria) this;
        }

        public Criteria andDSexLessThanOrEqualTo(String value) {
            addCriterion("d_sex <=", value, "dSex");
            return (Criteria) this;
        }

        public Criteria andDSexLike(String value) {
            addCriterion("d_sex like", value, "dSex");
            return (Criteria) this;
        }

        public Criteria andDSexNotLike(String value) {
            addCriterion("d_sex not like", value, "dSex");
            return (Criteria) this;
        }

        public Criteria andDSexIn(List<String> values) {
            addCriterion("d_sex in", values, "dSex");
            return (Criteria) this;
        }

        public Criteria andDSexNotIn(List<String> values) {
            addCriterion("d_sex not in", values, "dSex");
            return (Criteria) this;
        }

        public Criteria andDSexBetween(String value1, String value2) {
            addCriterion("d_sex between", value1, value2, "dSex");
            return (Criteria) this;
        }

        public Criteria andDSexNotBetween(String value1, String value2) {
            addCriterion("d_sex not between", value1, value2, "dSex");
            return (Criteria) this;
        }

        public Criteria andDEmailIsNull() {
            addCriterion("d_email is null");
            return (Criteria) this;
        }

        public Criteria andDEmailIsNotNull() {
            addCriterion("d_email is not null");
            return (Criteria) this;
        }

        public Criteria andDEmailEqualTo(String value) {
            addCriterion("d_email =", value, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailNotEqualTo(String value) {
            addCriterion("d_email <>", value, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailGreaterThan(String value) {
            addCriterion("d_email >", value, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailGreaterThanOrEqualTo(String value) {
            addCriterion("d_email >=", value, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailLessThan(String value) {
            addCriterion("d_email <", value, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailLessThanOrEqualTo(String value) {
            addCriterion("d_email <=", value, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailLike(String value) {
            addCriterion("d_email like", value, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailNotLike(String value) {
            addCriterion("d_email not like", value, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailIn(List<String> values) {
            addCriterion("d_email in", values, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailNotIn(List<String> values) {
            addCriterion("d_email not in", values, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailBetween(String value1, String value2) {
            addCriterion("d_email between", value1, value2, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDEmailNotBetween(String value1, String value2) {
            addCriterion("d_email not between", value1, value2, "dEmail");
            return (Criteria) this;
        }

        public Criteria andDPhoneIsNull() {
            addCriterion("d_phone is null");
            return (Criteria) this;
        }

        public Criteria andDPhoneIsNotNull() {
            addCriterion("d_phone is not null");
            return (Criteria) this;
        }

        public Criteria andDPhoneEqualTo(String value) {
            addCriterion("d_phone =", value, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneNotEqualTo(String value) {
            addCriterion("d_phone <>", value, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneGreaterThan(String value) {
            addCriterion("d_phone >", value, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("d_phone >=", value, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneLessThan(String value) {
            addCriterion("d_phone <", value, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneLessThanOrEqualTo(String value) {
            addCriterion("d_phone <=", value, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneLike(String value) {
            addCriterion("d_phone like", value, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneNotLike(String value) {
            addCriterion("d_phone not like", value, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneIn(List<String> values) {
            addCriterion("d_phone in", values, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneNotIn(List<String> values) {
            addCriterion("d_phone not in", values, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneBetween(String value1, String value2) {
            addCriterion("d_phone between", value1, value2, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDPhoneNotBetween(String value1, String value2) {
            addCriterion("d_phone not between", value1, value2, "dPhone");
            return (Criteria) this;
        }

        public Criteria andDImgurlIsNull() {
            addCriterion("d_imgUrl is null");
            return (Criteria) this;
        }

        public Criteria andDImgurlIsNotNull() {
            addCriterion("d_imgUrl is not null");
            return (Criteria) this;
        }

        public Criteria andDImgurlEqualTo(String value) {
            addCriterion("d_imgUrl =", value, "dImgurl");
            return (Criteria) this;
        }

        public Criteria andDImgurlNotEqualTo(String value) {
            addCriterion("d_imgUrl <>", value, "dImgurl");
            return (Criteria) this;
        }

        public Criteria andDImgurlGreaterThan(String value) {
            addCriterion("d_imgUrl >", value, "dImgurl");
            return (Criteria) this;
        }

        public Criteria andDImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("d_imgUrl >=", value, "dImgurl");
            return (Criteria) this;
        }

        public Criteria andDImgurlLessThan(String value) {
            addCriterion("d_imgUrl <", value, "dImgurl");
            return (Criteria) this;
        }

        public Criteria andDImgurlLessThanOrEqualTo(String value) {
            addCriterion("d_imgUrl <=", value, "dImgurl");
            return (Criteria) this;
        }

        public Criteria andDImgurlLike(String value) {
            addCriterion("d_imgUrl like", value, "dImgurl");
            return (Criteria) this;
        }

        public Criteria andDImgurlNotLike(String value) {
            addCriterion("d_imgUrl not like", value, "dImgurl");
            return (Criteria) this;
        }

        public Criteria andDImgurlIn(List<String> values) {
            addCriterion("d_imgUrl in", values, "dImgurl");
            return (Criteria) this;
        }

        public Criteria andDImgurlNotIn(List<String> values) {
            addCriterion("d_imgUrl not in", values, "dImgurl");
            return (Criteria) this;
        }

        public Criteria andDImgurlBetween(String value1, String value2) {
            addCriterion("d_imgUrl between", value1, value2, "dImgurl");
            return (Criteria) this;
        }

        public Criteria andDImgurlNotBetween(String value1, String value2) {
            addCriterion("d_imgUrl not between", value1, value2, "dImgurl");
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