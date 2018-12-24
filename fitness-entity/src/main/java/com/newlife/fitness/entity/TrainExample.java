package com.newlife.fitness.entity;

import java.util.ArrayList;
import java.util.List;

public class TrainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainExample() {
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

        public Criteria andTUsernameIsNull() {
            addCriterion("t_userName is null");
            return (Criteria) this;
        }

        public Criteria andTUsernameIsNotNull() {
            addCriterion("t_userName is not null");
            return (Criteria) this;
        }

        public Criteria andTUsernameEqualTo(String value) {
            addCriterion("t_userName =", value, "tUsername");
            return (Criteria) this;
        }

        public Criteria andTUsernameNotEqualTo(String value) {
            addCriterion("t_userName <>", value, "tUsername");
            return (Criteria) this;
        }

        public Criteria andTUsernameGreaterThan(String value) {
            addCriterion("t_userName >", value, "tUsername");
            return (Criteria) this;
        }

        public Criteria andTUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("t_userName >=", value, "tUsername");
            return (Criteria) this;
        }

        public Criteria andTUsernameLessThan(String value) {
            addCriterion("t_userName <", value, "tUsername");
            return (Criteria) this;
        }

        public Criteria andTUsernameLessThanOrEqualTo(String value) {
            addCriterion("t_userName <=", value, "tUsername");
            return (Criteria) this;
        }

        public Criteria andTUsernameLike(String value) {
            addCriterion("t_userName like", value, "tUsername");
            return (Criteria) this;
        }

        public Criteria andTUsernameNotLike(String value) {
            addCriterion("t_userName not like", value, "tUsername");
            return (Criteria) this;
        }

        public Criteria andTUsernameIn(List<String> values) {
            addCriterion("t_userName in", values, "tUsername");
            return (Criteria) this;
        }

        public Criteria andTUsernameNotIn(List<String> values) {
            addCriterion("t_userName not in", values, "tUsername");
            return (Criteria) this;
        }

        public Criteria andTUsernameBetween(String value1, String value2) {
            addCriterion("t_userName between", value1, value2, "tUsername");
            return (Criteria) this;
        }

        public Criteria andTUsernameNotBetween(String value1, String value2) {
            addCriterion("t_userName not between", value1, value2, "tUsername");
            return (Criteria) this;
        }

        public Criteria andTLoginnameIsNull() {
            addCriterion("t_loginName is null");
            return (Criteria) this;
        }

        public Criteria andTLoginnameIsNotNull() {
            addCriterion("t_loginName is not null");
            return (Criteria) this;
        }

        public Criteria andTLoginnameEqualTo(String value) {
            addCriterion("t_loginName =", value, "tLoginname");
            return (Criteria) this;
        }

        public Criteria andTLoginnameNotEqualTo(String value) {
            addCriterion("t_loginName <>", value, "tLoginname");
            return (Criteria) this;
        }

        public Criteria andTLoginnameGreaterThan(String value) {
            addCriterion("t_loginName >", value, "tLoginname");
            return (Criteria) this;
        }

        public Criteria andTLoginnameGreaterThanOrEqualTo(String value) {
            addCriterion("t_loginName >=", value, "tLoginname");
            return (Criteria) this;
        }

        public Criteria andTLoginnameLessThan(String value) {
            addCriterion("t_loginName <", value, "tLoginname");
            return (Criteria) this;
        }

        public Criteria andTLoginnameLessThanOrEqualTo(String value) {
            addCriterion("t_loginName <=", value, "tLoginname");
            return (Criteria) this;
        }

        public Criteria andTLoginnameLike(String value) {
            addCriterion("t_loginName like", value, "tLoginname");
            return (Criteria) this;
        }

        public Criteria andTLoginnameNotLike(String value) {
            addCriterion("t_loginName not like", value, "tLoginname");
            return (Criteria) this;
        }

        public Criteria andTLoginnameIn(List<String> values) {
            addCriterion("t_loginName in", values, "tLoginname");
            return (Criteria) this;
        }

        public Criteria andTLoginnameNotIn(List<String> values) {
            addCriterion("t_loginName not in", values, "tLoginname");
            return (Criteria) this;
        }

        public Criteria andTLoginnameBetween(String value1, String value2) {
            addCriterion("t_loginName between", value1, value2, "tLoginname");
            return (Criteria) this;
        }

        public Criteria andTLoginnameNotBetween(String value1, String value2) {
            addCriterion("t_loginName not between", value1, value2, "tLoginname");
            return (Criteria) this;
        }

        public Criteria andTPasswordIsNull() {
            addCriterion("t_password is null");
            return (Criteria) this;
        }

        public Criteria andTPasswordIsNotNull() {
            addCriterion("t_password is not null");
            return (Criteria) this;
        }

        public Criteria andTPasswordEqualTo(String value) {
            addCriterion("t_password =", value, "tPassword");
            return (Criteria) this;
        }

        public Criteria andTPasswordNotEqualTo(String value) {
            addCriterion("t_password <>", value, "tPassword");
            return (Criteria) this;
        }

        public Criteria andTPasswordGreaterThan(String value) {
            addCriterion("t_password >", value, "tPassword");
            return (Criteria) this;
        }

        public Criteria andTPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("t_password >=", value, "tPassword");
            return (Criteria) this;
        }

        public Criteria andTPasswordLessThan(String value) {
            addCriterion("t_password <", value, "tPassword");
            return (Criteria) this;
        }

        public Criteria andTPasswordLessThanOrEqualTo(String value) {
            addCriterion("t_password <=", value, "tPassword");
            return (Criteria) this;
        }

        public Criteria andTPasswordLike(String value) {
            addCriterion("t_password like", value, "tPassword");
            return (Criteria) this;
        }

        public Criteria andTPasswordNotLike(String value) {
            addCriterion("t_password not like", value, "tPassword");
            return (Criteria) this;
        }

        public Criteria andTPasswordIn(List<String> values) {
            addCriterion("t_password in", values, "tPassword");
            return (Criteria) this;
        }

        public Criteria andTPasswordNotIn(List<String> values) {
            addCriterion("t_password not in", values, "tPassword");
            return (Criteria) this;
        }

        public Criteria andTPasswordBetween(String value1, String value2) {
            addCriterion("t_password between", value1, value2, "tPassword");
            return (Criteria) this;
        }

        public Criteria andTPasswordNotBetween(String value1, String value2) {
            addCriterion("t_password not between", value1, value2, "tPassword");
            return (Criteria) this;
        }

        public Criteria andTSexIsNull() {
            addCriterion("t_sex is null");
            return (Criteria) this;
        }

        public Criteria andTSexIsNotNull() {
            addCriterion("t_sex is not null");
            return (Criteria) this;
        }

        public Criteria andTSexEqualTo(String value) {
            addCriterion("t_sex =", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexNotEqualTo(String value) {
            addCriterion("t_sex <>", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexGreaterThan(String value) {
            addCriterion("t_sex >", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexGreaterThanOrEqualTo(String value) {
            addCriterion("t_sex >=", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexLessThan(String value) {
            addCriterion("t_sex <", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexLessThanOrEqualTo(String value) {
            addCriterion("t_sex <=", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexLike(String value) {
            addCriterion("t_sex like", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexNotLike(String value) {
            addCriterion("t_sex not like", value, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexIn(List<String> values) {
            addCriterion("t_sex in", values, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexNotIn(List<String> values) {
            addCriterion("t_sex not in", values, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexBetween(String value1, String value2) {
            addCriterion("t_sex between", value1, value2, "tSex");
            return (Criteria) this;
        }

        public Criteria andTSexNotBetween(String value1, String value2) {
            addCriterion("t_sex not between", value1, value2, "tSex");
            return (Criteria) this;
        }

        public Criteria andTAgeIsNull() {
            addCriterion("t_age is null");
            return (Criteria) this;
        }

        public Criteria andTAgeIsNotNull() {
            addCriterion("t_age is not null");
            return (Criteria) this;
        }

        public Criteria andTAgeEqualTo(Integer value) {
            addCriterion("t_age =", value, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeNotEqualTo(Integer value) {
            addCriterion("t_age <>", value, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeGreaterThan(Integer value) {
            addCriterion("t_age >", value, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_age >=", value, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeLessThan(Integer value) {
            addCriterion("t_age <", value, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeLessThanOrEqualTo(Integer value) {
            addCriterion("t_age <=", value, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeIn(List<Integer> values) {
            addCriterion("t_age in", values, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeNotIn(List<Integer> values) {
            addCriterion("t_age not in", values, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeBetween(Integer value1, Integer value2) {
            addCriterion("t_age between", value1, value2, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("t_age not between", value1, value2, "tAge");
            return (Criteria) this;
        }

        public Criteria andTAddressIsNull() {
            addCriterion("t_address is null");
            return (Criteria) this;
        }

        public Criteria andTAddressIsNotNull() {
            addCriterion("t_address is not null");
            return (Criteria) this;
        }

        public Criteria andTAddressEqualTo(String value) {
            addCriterion("t_address =", value, "tAddress");
            return (Criteria) this;
        }

        public Criteria andTAddressNotEqualTo(String value) {
            addCriterion("t_address <>", value, "tAddress");
            return (Criteria) this;
        }

        public Criteria andTAddressGreaterThan(String value) {
            addCriterion("t_address >", value, "tAddress");
            return (Criteria) this;
        }

        public Criteria andTAddressGreaterThanOrEqualTo(String value) {
            addCriterion("t_address >=", value, "tAddress");
            return (Criteria) this;
        }

        public Criteria andTAddressLessThan(String value) {
            addCriterion("t_address <", value, "tAddress");
            return (Criteria) this;
        }

        public Criteria andTAddressLessThanOrEqualTo(String value) {
            addCriterion("t_address <=", value, "tAddress");
            return (Criteria) this;
        }

        public Criteria andTAddressLike(String value) {
            addCriterion("t_address like", value, "tAddress");
            return (Criteria) this;
        }

        public Criteria andTAddressNotLike(String value) {
            addCriterion("t_address not like", value, "tAddress");
            return (Criteria) this;
        }

        public Criteria andTAddressIn(List<String> values) {
            addCriterion("t_address in", values, "tAddress");
            return (Criteria) this;
        }

        public Criteria andTAddressNotIn(List<String> values) {
            addCriterion("t_address not in", values, "tAddress");
            return (Criteria) this;
        }

        public Criteria andTAddressBetween(String value1, String value2) {
            addCriterion("t_address between", value1, value2, "tAddress");
            return (Criteria) this;
        }

        public Criteria andTAddressNotBetween(String value1, String value2) {
            addCriterion("t_address not between", value1, value2, "tAddress");
            return (Criteria) this;
        }

        public Criteria andTEmailIsNull() {
            addCriterion("t_email is null");
            return (Criteria) this;
        }

        public Criteria andTEmailIsNotNull() {
            addCriterion("t_email is not null");
            return (Criteria) this;
        }

        public Criteria andTEmailEqualTo(String value) {
            addCriterion("t_email =", value, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailNotEqualTo(String value) {
            addCriterion("t_email <>", value, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailGreaterThan(String value) {
            addCriterion("t_email >", value, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailGreaterThanOrEqualTo(String value) {
            addCriterion("t_email >=", value, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailLessThan(String value) {
            addCriterion("t_email <", value, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailLessThanOrEqualTo(String value) {
            addCriterion("t_email <=", value, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailLike(String value) {
            addCriterion("t_email like", value, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailNotLike(String value) {
            addCriterion("t_email not like", value, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailIn(List<String> values) {
            addCriterion("t_email in", values, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailNotIn(List<String> values) {
            addCriterion("t_email not in", values, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailBetween(String value1, String value2) {
            addCriterion("t_email between", value1, value2, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTEmailNotBetween(String value1, String value2) {
            addCriterion("t_email not between", value1, value2, "tEmail");
            return (Criteria) this;
        }

        public Criteria andTPhoneIsNull() {
            addCriterion("t_phone is null");
            return (Criteria) this;
        }

        public Criteria andTPhoneIsNotNull() {
            addCriterion("t_phone is not null");
            return (Criteria) this;
        }

        public Criteria andTPhoneEqualTo(String value) {
            addCriterion("t_phone =", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneNotEqualTo(String value) {
            addCriterion("t_phone <>", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneGreaterThan(String value) {
            addCriterion("t_phone >", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("t_phone >=", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneLessThan(String value) {
            addCriterion("t_phone <", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneLessThanOrEqualTo(String value) {
            addCriterion("t_phone <=", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneLike(String value) {
            addCriterion("t_phone like", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneNotLike(String value) {
            addCriterion("t_phone not like", value, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneIn(List<String> values) {
            addCriterion("t_phone in", values, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneNotIn(List<String> values) {
            addCriterion("t_phone not in", values, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneBetween(String value1, String value2) {
            addCriterion("t_phone between", value1, value2, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTPhoneNotBetween(String value1, String value2) {
            addCriterion("t_phone not between", value1, value2, "tPhone");
            return (Criteria) this;
        }

        public Criteria andTIsvipIsNull() {
            addCriterion("t_isVip is null");
            return (Criteria) this;
        }

        public Criteria andTIsvipIsNotNull() {
            addCriterion("t_isVip is not null");
            return (Criteria) this;
        }

        public Criteria andTIsvipEqualTo(String value) {
            addCriterion("t_isVip =", value, "tIsvip");
            return (Criteria) this;
        }

        public Criteria andTIsvipNotEqualTo(String value) {
            addCriterion("t_isVip <>", value, "tIsvip");
            return (Criteria) this;
        }

        public Criteria andTIsvipGreaterThan(String value) {
            addCriterion("t_isVip >", value, "tIsvip");
            return (Criteria) this;
        }

        public Criteria andTIsvipGreaterThanOrEqualTo(String value) {
            addCriterion("t_isVip >=", value, "tIsvip");
            return (Criteria) this;
        }

        public Criteria andTIsvipLessThan(String value) {
            addCriterion("t_isVip <", value, "tIsvip");
            return (Criteria) this;
        }

        public Criteria andTIsvipLessThanOrEqualTo(String value) {
            addCriterion("t_isVip <=", value, "tIsvip");
            return (Criteria) this;
        }

        public Criteria andTIsvipLike(String value) {
            addCriterion("t_isVip like", value, "tIsvip");
            return (Criteria) this;
        }

        public Criteria andTIsvipNotLike(String value) {
            addCriterion("t_isVip not like", value, "tIsvip");
            return (Criteria) this;
        }

        public Criteria andTIsvipIn(List<String> values) {
            addCriterion("t_isVip in", values, "tIsvip");
            return (Criteria) this;
        }

        public Criteria andTIsvipNotIn(List<String> values) {
            addCriterion("t_isVip not in", values, "tIsvip");
            return (Criteria) this;
        }

        public Criteria andTIsvipBetween(String value1, String value2) {
            addCriterion("t_isVip between", value1, value2, "tIsvip");
            return (Criteria) this;
        }

        public Criteria andTIsvipNotBetween(String value1, String value2) {
            addCriterion("t_isVip not between", value1, value2, "tIsvip");
            return (Criteria) this;
        }

        public Criteria andTImgurlIsNull() {
            addCriterion("t_imgUrl is null");
            return (Criteria) this;
        }

        public Criteria andTImgurlIsNotNull() {
            addCriterion("t_imgUrl is not null");
            return (Criteria) this;
        }

        public Criteria andTImgurlEqualTo(String value) {
            addCriterion("t_imgUrl =", value, "tImgurl");
            return (Criteria) this;
        }

        public Criteria andTImgurlNotEqualTo(String value) {
            addCriterion("t_imgUrl <>", value, "tImgurl");
            return (Criteria) this;
        }

        public Criteria andTImgurlGreaterThan(String value) {
            addCriterion("t_imgUrl >", value, "tImgurl");
            return (Criteria) this;
        }

        public Criteria andTImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("t_imgUrl >=", value, "tImgurl");
            return (Criteria) this;
        }

        public Criteria andTImgurlLessThan(String value) {
            addCriterion("t_imgUrl <", value, "tImgurl");
            return (Criteria) this;
        }

        public Criteria andTImgurlLessThanOrEqualTo(String value) {
            addCriterion("t_imgUrl <=", value, "tImgurl");
            return (Criteria) this;
        }

        public Criteria andTImgurlLike(String value) {
            addCriterion("t_imgUrl like", value, "tImgurl");
            return (Criteria) this;
        }

        public Criteria andTImgurlNotLike(String value) {
            addCriterion("t_imgUrl not like", value, "tImgurl");
            return (Criteria) this;
        }

        public Criteria andTImgurlIn(List<String> values) {
            addCriterion("t_imgUrl in", values, "tImgurl");
            return (Criteria) this;
        }

        public Criteria andTImgurlNotIn(List<String> values) {
            addCriterion("t_imgUrl not in", values, "tImgurl");
            return (Criteria) this;
        }

        public Criteria andTImgurlBetween(String value1, String value2) {
            addCriterion("t_imgUrl between", value1, value2, "tImgurl");
            return (Criteria) this;
        }

        public Criteria andTImgurlNotBetween(String value1, String value2) {
            addCriterion("t_imgUrl not between", value1, value2, "tImgurl");
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