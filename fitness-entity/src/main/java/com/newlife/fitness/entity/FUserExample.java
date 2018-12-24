package com.newlife.fitness.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FUserExample() {
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

        public Criteria andFUsernameIsNull() {
            addCriterion("f_userName is null");
            return (Criteria) this;
        }

        public Criteria andFUsernameIsNotNull() {
            addCriterion("f_userName is not null");
            return (Criteria) this;
        }

        public Criteria andFUsernameEqualTo(String value) {
            addCriterion("f_userName =", value, "fUsername");
            return (Criteria) this;
        }

        public Criteria andFUsernameNotEqualTo(String value) {
            addCriterion("f_userName <>", value, "fUsername");
            return (Criteria) this;
        }

        public Criteria andFUsernameGreaterThan(String value) {
            addCriterion("f_userName >", value, "fUsername");
            return (Criteria) this;
        }

        public Criteria andFUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("f_userName >=", value, "fUsername");
            return (Criteria) this;
        }

        public Criteria andFUsernameLessThan(String value) {
            addCriterion("f_userName <", value, "fUsername");
            return (Criteria) this;
        }

        public Criteria andFUsernameLessThanOrEqualTo(String value) {
            addCriterion("f_userName <=", value, "fUsername");
            return (Criteria) this;
        }

        public Criteria andFUsernameLike(String value) {
            addCriterion("f_userName like", value, "fUsername");
            return (Criteria) this;
        }

        public Criteria andFUsernameNotLike(String value) {
            addCriterion("f_userName not like", value, "fUsername");
            return (Criteria) this;
        }

        public Criteria andFUsernameIn(List<String> values) {
            addCriterion("f_userName in", values, "fUsername");
            return (Criteria) this;
        }

        public Criteria andFUsernameNotIn(List<String> values) {
            addCriterion("f_userName not in", values, "fUsername");
            return (Criteria) this;
        }

        public Criteria andFUsernameBetween(String value1, String value2) {
            addCriterion("f_userName between", value1, value2, "fUsername");
            return (Criteria) this;
        }

        public Criteria andFUsernameNotBetween(String value1, String value2) {
            addCriterion("f_userName not between", value1, value2, "fUsername");
            return (Criteria) this;
        }

        public Criteria andFLoginnameIsNull() {
            addCriterion("f_loginName is null");
            return (Criteria) this;
        }

        public Criteria andFLoginnameIsNotNull() {
            addCriterion("f_loginName is not null");
            return (Criteria) this;
        }

        public Criteria andFLoginnameEqualTo(String value) {
            addCriterion("f_loginName =", value, "fLoginname");
            return (Criteria) this;
        }

        public Criteria andFLoginnameNotEqualTo(String value) {
            addCriterion("f_loginName <>", value, "fLoginname");
            return (Criteria) this;
        }

        public Criteria andFLoginnameGreaterThan(String value) {
            addCriterion("f_loginName >", value, "fLoginname");
            return (Criteria) this;
        }

        public Criteria andFLoginnameGreaterThanOrEqualTo(String value) {
            addCriterion("f_loginName >=", value, "fLoginname");
            return (Criteria) this;
        }

        public Criteria andFLoginnameLessThan(String value) {
            addCriterion("f_loginName <", value, "fLoginname");
            return (Criteria) this;
        }

        public Criteria andFLoginnameLessThanOrEqualTo(String value) {
            addCriterion("f_loginName <=", value, "fLoginname");
            return (Criteria) this;
        }

        public Criteria andFLoginnameLike(String value) {
            addCriterion("f_loginName like", value, "fLoginname");
            return (Criteria) this;
        }

        public Criteria andFLoginnameNotLike(String value) {
            addCriterion("f_loginName not like", value, "fLoginname");
            return (Criteria) this;
        }

        public Criteria andFLoginnameIn(List<String> values) {
            addCriterion("f_loginName in", values, "fLoginname");
            return (Criteria) this;
        }

        public Criteria andFLoginnameNotIn(List<String> values) {
            addCriterion("f_loginName not in", values, "fLoginname");
            return (Criteria) this;
        }

        public Criteria andFLoginnameBetween(String value1, String value2) {
            addCriterion("f_loginName between", value1, value2, "fLoginname");
            return (Criteria) this;
        }

        public Criteria andFLoginnameNotBetween(String value1, String value2) {
            addCriterion("f_loginName not between", value1, value2, "fLoginname");
            return (Criteria) this;
        }

        public Criteria andFPasswordIsNull() {
            addCriterion("f_password is null");
            return (Criteria) this;
        }

        public Criteria andFPasswordIsNotNull() {
            addCriterion("f_password is not null");
            return (Criteria) this;
        }

        public Criteria andFPasswordEqualTo(String value) {
            addCriterion("f_password =", value, "fPassword");
            return (Criteria) this;
        }

        public Criteria andFPasswordNotEqualTo(String value) {
            addCriterion("f_password <>", value, "fPassword");
            return (Criteria) this;
        }

        public Criteria andFPasswordGreaterThan(String value) {
            addCriterion("f_password >", value, "fPassword");
            return (Criteria) this;
        }

        public Criteria andFPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("f_password >=", value, "fPassword");
            return (Criteria) this;
        }

        public Criteria andFPasswordLessThan(String value) {
            addCriterion("f_password <", value, "fPassword");
            return (Criteria) this;
        }

        public Criteria andFPasswordLessThanOrEqualTo(String value) {
            addCriterion("f_password <=", value, "fPassword");
            return (Criteria) this;
        }

        public Criteria andFPasswordLike(String value) {
            addCriterion("f_password like", value, "fPassword");
            return (Criteria) this;
        }

        public Criteria andFPasswordNotLike(String value) {
            addCriterion("f_password not like", value, "fPassword");
            return (Criteria) this;
        }

        public Criteria andFPasswordIn(List<String> values) {
            addCriterion("f_password in", values, "fPassword");
            return (Criteria) this;
        }

        public Criteria andFPasswordNotIn(List<String> values) {
            addCriterion("f_password not in", values, "fPassword");
            return (Criteria) this;
        }

        public Criteria andFPasswordBetween(String value1, String value2) {
            addCriterion("f_password between", value1, value2, "fPassword");
            return (Criteria) this;
        }

        public Criteria andFPasswordNotBetween(String value1, String value2) {
            addCriterion("f_password not between", value1, value2, "fPassword");
            return (Criteria) this;
        }

        public Criteria andFSexIsNull() {
            addCriterion("f_sex is null");
            return (Criteria) this;
        }

        public Criteria andFSexIsNotNull() {
            addCriterion("f_sex is not null");
            return (Criteria) this;
        }

        public Criteria andFSexEqualTo(String value) {
            addCriterion("f_sex =", value, "fSex");
            return (Criteria) this;
        }

        public Criteria andFSexNotEqualTo(String value) {
            addCriterion("f_sex <>", value, "fSex");
            return (Criteria) this;
        }

        public Criteria andFSexGreaterThan(String value) {
            addCriterion("f_sex >", value, "fSex");
            return (Criteria) this;
        }

        public Criteria andFSexGreaterThanOrEqualTo(String value) {
            addCriterion("f_sex >=", value, "fSex");
            return (Criteria) this;
        }

        public Criteria andFSexLessThan(String value) {
            addCriterion("f_sex <", value, "fSex");
            return (Criteria) this;
        }

        public Criteria andFSexLessThanOrEqualTo(String value) {
            addCriterion("f_sex <=", value, "fSex");
            return (Criteria) this;
        }

        public Criteria andFSexLike(String value) {
            addCriterion("f_sex like", value, "fSex");
            return (Criteria) this;
        }

        public Criteria andFSexNotLike(String value) {
            addCriterion("f_sex not like", value, "fSex");
            return (Criteria) this;
        }

        public Criteria andFSexIn(List<String> values) {
            addCriterion("f_sex in", values, "fSex");
            return (Criteria) this;
        }

        public Criteria andFSexNotIn(List<String> values) {
            addCriterion("f_sex not in", values, "fSex");
            return (Criteria) this;
        }

        public Criteria andFSexBetween(String value1, String value2) {
            addCriterion("f_sex between", value1, value2, "fSex");
            return (Criteria) this;
        }

        public Criteria andFSexNotBetween(String value1, String value2) {
            addCriterion("f_sex not between", value1, value2, "fSex");
            return (Criteria) this;
        }

        public Criteria andFAgeIsNull() {
            addCriterion("f_age is null");
            return (Criteria) this;
        }

        public Criteria andFAgeIsNotNull() {
            addCriterion("f_age is not null");
            return (Criteria) this;
        }

        public Criteria andFAgeEqualTo(Integer value) {
            addCriterion("f_age =", value, "fAge");
            return (Criteria) this;
        }

        public Criteria andFAgeNotEqualTo(Integer value) {
            addCriterion("f_age <>", value, "fAge");
            return (Criteria) this;
        }

        public Criteria andFAgeGreaterThan(Integer value) {
            addCriterion("f_age >", value, "fAge");
            return (Criteria) this;
        }

        public Criteria andFAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_age >=", value, "fAge");
            return (Criteria) this;
        }

        public Criteria andFAgeLessThan(Integer value) {
            addCriterion("f_age <", value, "fAge");
            return (Criteria) this;
        }

        public Criteria andFAgeLessThanOrEqualTo(Integer value) {
            addCriterion("f_age <=", value, "fAge");
            return (Criteria) this;
        }

        public Criteria andFAgeIn(List<Integer> values) {
            addCriterion("f_age in", values, "fAge");
            return (Criteria) this;
        }

        public Criteria andFAgeNotIn(List<Integer> values) {
            addCriterion("f_age not in", values, "fAge");
            return (Criteria) this;
        }

        public Criteria andFAgeBetween(Integer value1, Integer value2) {
            addCriterion("f_age between", value1, value2, "fAge");
            return (Criteria) this;
        }

        public Criteria andFAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("f_age not between", value1, value2, "fAge");
            return (Criteria) this;
        }

        public Criteria andFAddressIsNull() {
            addCriterion("f_address is null");
            return (Criteria) this;
        }

        public Criteria andFAddressIsNotNull() {
            addCriterion("f_address is not null");
            return (Criteria) this;
        }

        public Criteria andFAddressEqualTo(String value) {
            addCriterion("f_address =", value, "fAddress");
            return (Criteria) this;
        }

        public Criteria andFAddressNotEqualTo(String value) {
            addCriterion("f_address <>", value, "fAddress");
            return (Criteria) this;
        }

        public Criteria andFAddressGreaterThan(String value) {
            addCriterion("f_address >", value, "fAddress");
            return (Criteria) this;
        }

        public Criteria andFAddressGreaterThanOrEqualTo(String value) {
            addCriterion("f_address >=", value, "fAddress");
            return (Criteria) this;
        }

        public Criteria andFAddressLessThan(String value) {
            addCriterion("f_address <", value, "fAddress");
            return (Criteria) this;
        }

        public Criteria andFAddressLessThanOrEqualTo(String value) {
            addCriterion("f_address <=", value, "fAddress");
            return (Criteria) this;
        }

        public Criteria andFAddressLike(String value) {
            addCriterion("f_address like", value, "fAddress");
            return (Criteria) this;
        }

        public Criteria andFAddressNotLike(String value) {
            addCriterion("f_address not like", value, "fAddress");
            return (Criteria) this;
        }

        public Criteria andFAddressIn(List<String> values) {
            addCriterion("f_address in", values, "fAddress");
            return (Criteria) this;
        }

        public Criteria andFAddressNotIn(List<String> values) {
            addCriterion("f_address not in", values, "fAddress");
            return (Criteria) this;
        }

        public Criteria andFAddressBetween(String value1, String value2) {
            addCriterion("f_address between", value1, value2, "fAddress");
            return (Criteria) this;
        }

        public Criteria andFAddressNotBetween(String value1, String value2) {
            addCriterion("f_address not between", value1, value2, "fAddress");
            return (Criteria) this;
        }

        public Criteria andFEmailIsNull() {
            addCriterion("f_email is null");
            return (Criteria) this;
        }

        public Criteria andFEmailIsNotNull() {
            addCriterion("f_email is not null");
            return (Criteria) this;
        }

        public Criteria andFEmailEqualTo(String value) {
            addCriterion("f_email =", value, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailNotEqualTo(String value) {
            addCriterion("f_email <>", value, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailGreaterThan(String value) {
            addCriterion("f_email >", value, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailGreaterThanOrEqualTo(String value) {
            addCriterion("f_email >=", value, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailLessThan(String value) {
            addCriterion("f_email <", value, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailLessThanOrEqualTo(String value) {
            addCriterion("f_email <=", value, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailLike(String value) {
            addCriterion("f_email like", value, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailNotLike(String value) {
            addCriterion("f_email not like", value, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailIn(List<String> values) {
            addCriterion("f_email in", values, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailNotIn(List<String> values) {
            addCriterion("f_email not in", values, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailBetween(String value1, String value2) {
            addCriterion("f_email between", value1, value2, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailNotBetween(String value1, String value2) {
            addCriterion("f_email not between", value1, value2, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFPhoneIsNull() {
            addCriterion("f_phone is null");
            return (Criteria) this;
        }

        public Criteria andFPhoneIsNotNull() {
            addCriterion("f_phone is not null");
            return (Criteria) this;
        }

        public Criteria andFPhoneEqualTo(String value) {
            addCriterion("f_phone =", value, "fPhone");
            return (Criteria) this;
        }

        public Criteria andFPhoneNotEqualTo(String value) {
            addCriterion("f_phone <>", value, "fPhone");
            return (Criteria) this;
        }

        public Criteria andFPhoneGreaterThan(String value) {
            addCriterion("f_phone >", value, "fPhone");
            return (Criteria) this;
        }

        public Criteria andFPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("f_phone >=", value, "fPhone");
            return (Criteria) this;
        }

        public Criteria andFPhoneLessThan(String value) {
            addCriterion("f_phone <", value, "fPhone");
            return (Criteria) this;
        }

        public Criteria andFPhoneLessThanOrEqualTo(String value) {
            addCriterion("f_phone <=", value, "fPhone");
            return (Criteria) this;
        }

        public Criteria andFPhoneLike(String value) {
            addCriterion("f_phone like", value, "fPhone");
            return (Criteria) this;
        }

        public Criteria andFPhoneNotLike(String value) {
            addCriterion("f_phone not like", value, "fPhone");
            return (Criteria) this;
        }

        public Criteria andFPhoneIn(List<String> values) {
            addCriterion("f_phone in", values, "fPhone");
            return (Criteria) this;
        }

        public Criteria andFPhoneNotIn(List<String> values) {
            addCriterion("f_phone not in", values, "fPhone");
            return (Criteria) this;
        }

        public Criteria andFPhoneBetween(String value1, String value2) {
            addCriterion("f_phone between", value1, value2, "fPhone");
            return (Criteria) this;
        }

        public Criteria andFPhoneNotBetween(String value1, String value2) {
            addCriterion("f_phone not between", value1, value2, "fPhone");
            return (Criteria) this;
        }

        public Criteria andFIsvipIsNull() {
            addCriterion("f_isVip is null");
            return (Criteria) this;
        }

        public Criteria andFIsvipIsNotNull() {
            addCriterion("f_isVip is not null");
            return (Criteria) this;
        }

        public Criteria andFIsvipEqualTo(String value) {
            addCriterion("f_isVip =", value, "fIsvip");
            return (Criteria) this;
        }

        public Criteria andFIsvipNotEqualTo(String value) {
            addCriterion("f_isVip <>", value, "fIsvip");
            return (Criteria) this;
        }

        public Criteria andFIsvipGreaterThan(String value) {
            addCriterion("f_isVip >", value, "fIsvip");
            return (Criteria) this;
        }

        public Criteria andFIsvipGreaterThanOrEqualTo(String value) {
            addCriterion("f_isVip >=", value, "fIsvip");
            return (Criteria) this;
        }

        public Criteria andFIsvipLessThan(String value) {
            addCriterion("f_isVip <", value, "fIsvip");
            return (Criteria) this;
        }

        public Criteria andFIsvipLessThanOrEqualTo(String value) {
            addCriterion("f_isVip <=", value, "fIsvip");
            return (Criteria) this;
        }

        public Criteria andFIsvipLike(String value) {
            addCriterion("f_isVip like", value, "fIsvip");
            return (Criteria) this;
        }

        public Criteria andFIsvipNotLike(String value) {
            addCriterion("f_isVip not like", value, "fIsvip");
            return (Criteria) this;
        }

        public Criteria andFIsvipIn(List<String> values) {
            addCriterion("f_isVip in", values, "fIsvip");
            return (Criteria) this;
        }

        public Criteria andFIsvipNotIn(List<String> values) {
            addCriterion("f_isVip not in", values, "fIsvip");
            return (Criteria) this;
        }

        public Criteria andFIsvipBetween(String value1, String value2) {
            addCriterion("f_isVip between", value1, value2, "fIsvip");
            return (Criteria) this;
        }

        public Criteria andFIsvipNotBetween(String value1, String value2) {
            addCriterion("f_isVip not between", value1, value2, "fIsvip");
            return (Criteria) this;
        }

        public Criteria andFImgurlIsNull() {
            addCriterion("f_imgUrl is null");
            return (Criteria) this;
        }

        public Criteria andFImgurlIsNotNull() {
            addCriterion("f_imgUrl is not null");
            return (Criteria) this;
        }

        public Criteria andFImgurlEqualTo(String value) {
            addCriterion("f_imgUrl =", value, "fImgurl");
            return (Criteria) this;
        }

        public Criteria andFImgurlNotEqualTo(String value) {
            addCriterion("f_imgUrl <>", value, "fImgurl");
            return (Criteria) this;
        }

        public Criteria andFImgurlGreaterThan(String value) {
            addCriterion("f_imgUrl >", value, "fImgurl");
            return (Criteria) this;
        }

        public Criteria andFImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("f_imgUrl >=", value, "fImgurl");
            return (Criteria) this;
        }

        public Criteria andFImgurlLessThan(String value) {
            addCriterion("f_imgUrl <", value, "fImgurl");
            return (Criteria) this;
        }

        public Criteria andFImgurlLessThanOrEqualTo(String value) {
            addCriterion("f_imgUrl <=", value, "fImgurl");
            return (Criteria) this;
        }

        public Criteria andFImgurlLike(String value) {
            addCriterion("f_imgUrl like", value, "fImgurl");
            return (Criteria) this;
        }

        public Criteria andFImgurlNotLike(String value) {
            addCriterion("f_imgUrl not like", value, "fImgurl");
            return (Criteria) this;
        }

        public Criteria andFImgurlIn(List<String> values) {
            addCriterion("f_imgUrl in", values, "fImgurl");
            return (Criteria) this;
        }

        public Criteria andFImgurlNotIn(List<String> values) {
            addCriterion("f_imgUrl not in", values, "fImgurl");
            return (Criteria) this;
        }

        public Criteria andFImgurlBetween(String value1, String value2) {
            addCriterion("f_imgUrl between", value1, value2, "fImgurl");
            return (Criteria) this;
        }

        public Criteria andFImgurlNotBetween(String value1, String value2) {
            addCriterion("f_imgUrl not between", value1, value2, "fImgurl");
            return (Criteria) this;
        }

        public Criteria andFVipbegittimeIsNull() {
            addCriterion("f_vipBegiTtime is null");
            return (Criteria) this;
        }

        public Criteria andFVipbegittimeIsNotNull() {
            addCriterion("f_vipBegiTtime is not null");
            return (Criteria) this;
        }

        public Criteria andFVipbegittimeEqualTo(Date value) {
            addCriterion("f_vipBegiTtime =", value, "fVipbegittime");
            return (Criteria) this;
        }

        public Criteria andFVipbegittimeNotEqualTo(Date value) {
            addCriterion("f_vipBegiTtime <>", value, "fVipbegittime");
            return (Criteria) this;
        }

        public Criteria andFVipbegittimeGreaterThan(Date value) {
            addCriterion("f_vipBegiTtime >", value, "fVipbegittime");
            return (Criteria) this;
        }

        public Criteria andFVipbegittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("f_vipBegiTtime >=", value, "fVipbegittime");
            return (Criteria) this;
        }

        public Criteria andFVipbegittimeLessThan(Date value) {
            addCriterion("f_vipBegiTtime <", value, "fVipbegittime");
            return (Criteria) this;
        }

        public Criteria andFVipbegittimeLessThanOrEqualTo(Date value) {
            addCriterion("f_vipBegiTtime <=", value, "fVipbegittime");
            return (Criteria) this;
        }

        public Criteria andFVipbegittimeIn(List<Date> values) {
            addCriterion("f_vipBegiTtime in", values, "fVipbegittime");
            return (Criteria) this;
        }

        public Criteria andFVipbegittimeNotIn(List<Date> values) {
            addCriterion("f_vipBegiTtime not in", values, "fVipbegittime");
            return (Criteria) this;
        }

        public Criteria andFVipbegittimeBetween(Date value1, Date value2) {
            addCriterion("f_vipBegiTtime between", value1, value2, "fVipbegittime");
            return (Criteria) this;
        }

        public Criteria andFVipbegittimeNotBetween(Date value1, Date value2) {
            addCriterion("f_vipBegiTtime not between", value1, value2, "fVipbegittime");
            return (Criteria) this;
        }

        public Criteria andFVipendtimeIsNull() {
            addCriterion("f_vipEndTime is null");
            return (Criteria) this;
        }

        public Criteria andFVipendtimeIsNotNull() {
            addCriterion("f_vipEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andFVipendtimeEqualTo(Date value) {
            addCriterion("f_vipEndTime =", value, "fVipendtime");
            return (Criteria) this;
        }

        public Criteria andFVipendtimeNotEqualTo(Date value) {
            addCriterion("f_vipEndTime <>", value, "fVipendtime");
            return (Criteria) this;
        }

        public Criteria andFVipendtimeGreaterThan(Date value) {
            addCriterion("f_vipEndTime >", value, "fVipendtime");
            return (Criteria) this;
        }

        public Criteria andFVipendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("f_vipEndTime >=", value, "fVipendtime");
            return (Criteria) this;
        }

        public Criteria andFVipendtimeLessThan(Date value) {
            addCriterion("f_vipEndTime <", value, "fVipendtime");
            return (Criteria) this;
        }

        public Criteria andFVipendtimeLessThanOrEqualTo(Date value) {
            addCriterion("f_vipEndTime <=", value, "fVipendtime");
            return (Criteria) this;
        }

        public Criteria andFVipendtimeIn(List<Date> values) {
            addCriterion("f_vipEndTime in", values, "fVipendtime");
            return (Criteria) this;
        }

        public Criteria andFVipendtimeNotIn(List<Date> values) {
            addCriterion("f_vipEndTime not in", values, "fVipendtime");
            return (Criteria) this;
        }

        public Criteria andFVipendtimeBetween(Date value1, Date value2) {
            addCriterion("f_vipEndTime between", value1, value2, "fVipendtime");
            return (Criteria) this;
        }

        public Criteria andFVipendtimeNotBetween(Date value1, Date value2) {
            addCriterion("f_vipEndTime not between", value1, value2, "fVipendtime");
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