package com.shu.copartner.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActRuJobExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActRuJobExample() {
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
            addCriterion("ID_ is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID_ is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID_ =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID_ <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID_ >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID_ >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID_ <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID_ <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID_ like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID_ not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID_ in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID_ not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID_ between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID_ not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRevIsNull() {
            addCriterion("REV_ is null");
            return (Criteria) this;
        }

        public Criteria andRevIsNotNull() {
            addCriterion("REV_ is not null");
            return (Criteria) this;
        }

        public Criteria andRevEqualTo(Integer value) {
            addCriterion("REV_ =", value, "rev");
            return (Criteria) this;
        }

        public Criteria andRevNotEqualTo(Integer value) {
            addCriterion("REV_ <>", value, "rev");
            return (Criteria) this;
        }

        public Criteria andRevGreaterThan(Integer value) {
            addCriterion("REV_ >", value, "rev");
            return (Criteria) this;
        }

        public Criteria andRevGreaterThanOrEqualTo(Integer value) {
            addCriterion("REV_ >=", value, "rev");
            return (Criteria) this;
        }

        public Criteria andRevLessThan(Integer value) {
            addCriterion("REV_ <", value, "rev");
            return (Criteria) this;
        }

        public Criteria andRevLessThanOrEqualTo(Integer value) {
            addCriterion("REV_ <=", value, "rev");
            return (Criteria) this;
        }

        public Criteria andRevIn(List<Integer> values) {
            addCriterion("REV_ in", values, "rev");
            return (Criteria) this;
        }

        public Criteria andRevNotIn(List<Integer> values) {
            addCriterion("REV_ not in", values, "rev");
            return (Criteria) this;
        }

        public Criteria andRevBetween(Integer value1, Integer value2) {
            addCriterion("REV_ between", value1, value2, "rev");
            return (Criteria) this;
        }

        public Criteria andRevNotBetween(Integer value1, Integer value2) {
            addCriterion("REV_ not between", value1, value2, "rev");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE_ is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE_ is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE_ =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE_ <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE_ >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE_ >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE_ <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE_ <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE_ like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE_ not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE_ in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE_ not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE_ between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE_ not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andLockExpTimeIsNull() {
            addCriterion("LOCK_EXP_TIME_ is null");
            return (Criteria) this;
        }

        public Criteria andLockExpTimeIsNotNull() {
            addCriterion("LOCK_EXP_TIME_ is not null");
            return (Criteria) this;
        }

        public Criteria andLockExpTimeEqualTo(Date value) {
            addCriterion("LOCK_EXP_TIME_ =", value, "lockExpTime");
            return (Criteria) this;
        }

        public Criteria andLockExpTimeNotEqualTo(Date value) {
            addCriterion("LOCK_EXP_TIME_ <>", value, "lockExpTime");
            return (Criteria) this;
        }

        public Criteria andLockExpTimeGreaterThan(Date value) {
            addCriterion("LOCK_EXP_TIME_ >", value, "lockExpTime");
            return (Criteria) this;
        }

        public Criteria andLockExpTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LOCK_EXP_TIME_ >=", value, "lockExpTime");
            return (Criteria) this;
        }

        public Criteria andLockExpTimeLessThan(Date value) {
            addCriterion("LOCK_EXP_TIME_ <", value, "lockExpTime");
            return (Criteria) this;
        }

        public Criteria andLockExpTimeLessThanOrEqualTo(Date value) {
            addCriterion("LOCK_EXP_TIME_ <=", value, "lockExpTime");
            return (Criteria) this;
        }

        public Criteria andLockExpTimeIn(List<Date> values) {
            addCriterion("LOCK_EXP_TIME_ in", values, "lockExpTime");
            return (Criteria) this;
        }

        public Criteria andLockExpTimeNotIn(List<Date> values) {
            addCriterion("LOCK_EXP_TIME_ not in", values, "lockExpTime");
            return (Criteria) this;
        }

        public Criteria andLockExpTimeBetween(Date value1, Date value2) {
            addCriterion("LOCK_EXP_TIME_ between", value1, value2, "lockExpTime");
            return (Criteria) this;
        }

        public Criteria andLockExpTimeNotBetween(Date value1, Date value2) {
            addCriterion("LOCK_EXP_TIME_ not between", value1, value2, "lockExpTime");
            return (Criteria) this;
        }

        public Criteria andLockOwnerIsNull() {
            addCriterion("LOCK_OWNER_ is null");
            return (Criteria) this;
        }

        public Criteria andLockOwnerIsNotNull() {
            addCriterion("LOCK_OWNER_ is not null");
            return (Criteria) this;
        }

        public Criteria andLockOwnerEqualTo(String value) {
            addCriterion("LOCK_OWNER_ =", value, "lockOwner");
            return (Criteria) this;
        }

        public Criteria andLockOwnerNotEqualTo(String value) {
            addCriterion("LOCK_OWNER_ <>", value, "lockOwner");
            return (Criteria) this;
        }

        public Criteria andLockOwnerGreaterThan(String value) {
            addCriterion("LOCK_OWNER_ >", value, "lockOwner");
            return (Criteria) this;
        }

        public Criteria andLockOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("LOCK_OWNER_ >=", value, "lockOwner");
            return (Criteria) this;
        }

        public Criteria andLockOwnerLessThan(String value) {
            addCriterion("LOCK_OWNER_ <", value, "lockOwner");
            return (Criteria) this;
        }

        public Criteria andLockOwnerLessThanOrEqualTo(String value) {
            addCriterion("LOCK_OWNER_ <=", value, "lockOwner");
            return (Criteria) this;
        }

        public Criteria andLockOwnerLike(String value) {
            addCriterion("LOCK_OWNER_ like", value, "lockOwner");
            return (Criteria) this;
        }

        public Criteria andLockOwnerNotLike(String value) {
            addCriterion("LOCK_OWNER_ not like", value, "lockOwner");
            return (Criteria) this;
        }

        public Criteria andLockOwnerIn(List<String> values) {
            addCriterion("LOCK_OWNER_ in", values, "lockOwner");
            return (Criteria) this;
        }

        public Criteria andLockOwnerNotIn(List<String> values) {
            addCriterion("LOCK_OWNER_ not in", values, "lockOwner");
            return (Criteria) this;
        }

        public Criteria andLockOwnerBetween(String value1, String value2) {
            addCriterion("LOCK_OWNER_ between", value1, value2, "lockOwner");
            return (Criteria) this;
        }

        public Criteria andLockOwnerNotBetween(String value1, String value2) {
            addCriterion("LOCK_OWNER_ not between", value1, value2, "lockOwner");
            return (Criteria) this;
        }

        public Criteria andExclusiveIsNull() {
            addCriterion("EXCLUSIVE_ is null");
            return (Criteria) this;
        }

        public Criteria andExclusiveIsNotNull() {
            addCriterion("EXCLUSIVE_ is not null");
            return (Criteria) this;
        }

        public Criteria andExclusiveEqualTo(Boolean value) {
            addCriterion("EXCLUSIVE_ =", value, "exclusive");
            return (Criteria) this;
        }

        public Criteria andExclusiveNotEqualTo(Boolean value) {
            addCriterion("EXCLUSIVE_ <>", value, "exclusive");
            return (Criteria) this;
        }

        public Criteria andExclusiveGreaterThan(Boolean value) {
            addCriterion("EXCLUSIVE_ >", value, "exclusive");
            return (Criteria) this;
        }

        public Criteria andExclusiveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("EXCLUSIVE_ >=", value, "exclusive");
            return (Criteria) this;
        }

        public Criteria andExclusiveLessThan(Boolean value) {
            addCriterion("EXCLUSIVE_ <", value, "exclusive");
            return (Criteria) this;
        }

        public Criteria andExclusiveLessThanOrEqualTo(Boolean value) {
            addCriterion("EXCLUSIVE_ <=", value, "exclusive");
            return (Criteria) this;
        }

        public Criteria andExclusiveIn(List<Boolean> values) {
            addCriterion("EXCLUSIVE_ in", values, "exclusive");
            return (Criteria) this;
        }

        public Criteria andExclusiveNotIn(List<Boolean> values) {
            addCriterion("EXCLUSIVE_ not in", values, "exclusive");
            return (Criteria) this;
        }

        public Criteria andExclusiveBetween(Boolean value1, Boolean value2) {
            addCriterion("EXCLUSIVE_ between", value1, value2, "exclusive");
            return (Criteria) this;
        }

        public Criteria andExclusiveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("EXCLUSIVE_ not between", value1, value2, "exclusive");
            return (Criteria) this;
        }

        public Criteria andExecutionIdIsNull() {
            addCriterion("EXECUTION_ID_ is null");
            return (Criteria) this;
        }

        public Criteria andExecutionIdIsNotNull() {
            addCriterion("EXECUTION_ID_ is not null");
            return (Criteria) this;
        }

        public Criteria andExecutionIdEqualTo(String value) {
            addCriterion("EXECUTION_ID_ =", value, "executionId");
            return (Criteria) this;
        }

        public Criteria andExecutionIdNotEqualTo(String value) {
            addCriterion("EXECUTION_ID_ <>", value, "executionId");
            return (Criteria) this;
        }

        public Criteria andExecutionIdGreaterThan(String value) {
            addCriterion("EXECUTION_ID_ >", value, "executionId");
            return (Criteria) this;
        }

        public Criteria andExecutionIdGreaterThanOrEqualTo(String value) {
            addCriterion("EXECUTION_ID_ >=", value, "executionId");
            return (Criteria) this;
        }

        public Criteria andExecutionIdLessThan(String value) {
            addCriterion("EXECUTION_ID_ <", value, "executionId");
            return (Criteria) this;
        }

        public Criteria andExecutionIdLessThanOrEqualTo(String value) {
            addCriterion("EXECUTION_ID_ <=", value, "executionId");
            return (Criteria) this;
        }

        public Criteria andExecutionIdLike(String value) {
            addCriterion("EXECUTION_ID_ like", value, "executionId");
            return (Criteria) this;
        }

        public Criteria andExecutionIdNotLike(String value) {
            addCriterion("EXECUTION_ID_ not like", value, "executionId");
            return (Criteria) this;
        }

        public Criteria andExecutionIdIn(List<String> values) {
            addCriterion("EXECUTION_ID_ in", values, "executionId");
            return (Criteria) this;
        }

        public Criteria andExecutionIdNotIn(List<String> values) {
            addCriterion("EXECUTION_ID_ not in", values, "executionId");
            return (Criteria) this;
        }

        public Criteria andExecutionIdBetween(String value1, String value2) {
            addCriterion("EXECUTION_ID_ between", value1, value2, "executionId");
            return (Criteria) this;
        }

        public Criteria andExecutionIdNotBetween(String value1, String value2) {
            addCriterion("EXECUTION_ID_ not between", value1, value2, "executionId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdIsNull() {
            addCriterion("PROCESS_INSTANCE_ID_ is null");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdIsNotNull() {
            addCriterion("PROCESS_INSTANCE_ID_ is not null");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdEqualTo(String value) {
            addCriterion("PROCESS_INSTANCE_ID_ =", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdNotEqualTo(String value) {
            addCriterion("PROCESS_INSTANCE_ID_ <>", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdGreaterThan(String value) {
            addCriterion("PROCESS_INSTANCE_ID_ >", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESS_INSTANCE_ID_ >=", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdLessThan(String value) {
            addCriterion("PROCESS_INSTANCE_ID_ <", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdLessThanOrEqualTo(String value) {
            addCriterion("PROCESS_INSTANCE_ID_ <=", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdLike(String value) {
            addCriterion("PROCESS_INSTANCE_ID_ like", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdNotLike(String value) {
            addCriterion("PROCESS_INSTANCE_ID_ not like", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdIn(List<String> values) {
            addCriterion("PROCESS_INSTANCE_ID_ in", values, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdNotIn(List<String> values) {
            addCriterion("PROCESS_INSTANCE_ID_ not in", values, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdBetween(String value1, String value2) {
            addCriterion("PROCESS_INSTANCE_ID_ between", value1, value2, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdNotBetween(String value1, String value2) {
            addCriterion("PROCESS_INSTANCE_ID_ not between", value1, value2, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcDefIdIsNull() {
            addCriterion("PROC_DEF_ID_ is null");
            return (Criteria) this;
        }

        public Criteria andProcDefIdIsNotNull() {
            addCriterion("PROC_DEF_ID_ is not null");
            return (Criteria) this;
        }

        public Criteria andProcDefIdEqualTo(String value) {
            addCriterion("PROC_DEF_ID_ =", value, "procDefId");
            return (Criteria) this;
        }

        public Criteria andProcDefIdNotEqualTo(String value) {
            addCriterion("PROC_DEF_ID_ <>", value, "procDefId");
            return (Criteria) this;
        }

        public Criteria andProcDefIdGreaterThan(String value) {
            addCriterion("PROC_DEF_ID_ >", value, "procDefId");
            return (Criteria) this;
        }

        public Criteria andProcDefIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROC_DEF_ID_ >=", value, "procDefId");
            return (Criteria) this;
        }

        public Criteria andProcDefIdLessThan(String value) {
            addCriterion("PROC_DEF_ID_ <", value, "procDefId");
            return (Criteria) this;
        }

        public Criteria andProcDefIdLessThanOrEqualTo(String value) {
            addCriterion("PROC_DEF_ID_ <=", value, "procDefId");
            return (Criteria) this;
        }

        public Criteria andProcDefIdLike(String value) {
            addCriterion("PROC_DEF_ID_ like", value, "procDefId");
            return (Criteria) this;
        }

        public Criteria andProcDefIdNotLike(String value) {
            addCriterion("PROC_DEF_ID_ not like", value, "procDefId");
            return (Criteria) this;
        }

        public Criteria andProcDefIdIn(List<String> values) {
            addCriterion("PROC_DEF_ID_ in", values, "procDefId");
            return (Criteria) this;
        }

        public Criteria andProcDefIdNotIn(List<String> values) {
            addCriterion("PROC_DEF_ID_ not in", values, "procDefId");
            return (Criteria) this;
        }

        public Criteria andProcDefIdBetween(String value1, String value2) {
            addCriterion("PROC_DEF_ID_ between", value1, value2, "procDefId");
            return (Criteria) this;
        }

        public Criteria andProcDefIdNotBetween(String value1, String value2) {
            addCriterion("PROC_DEF_ID_ not between", value1, value2, "procDefId");
            return (Criteria) this;
        }

        public Criteria andRetriesIsNull() {
            addCriterion("RETRIES_ is null");
            return (Criteria) this;
        }

        public Criteria andRetriesIsNotNull() {
            addCriterion("RETRIES_ is not null");
            return (Criteria) this;
        }

        public Criteria andRetriesEqualTo(Integer value) {
            addCriterion("RETRIES_ =", value, "retries");
            return (Criteria) this;
        }

        public Criteria andRetriesNotEqualTo(Integer value) {
            addCriterion("RETRIES_ <>", value, "retries");
            return (Criteria) this;
        }

        public Criteria andRetriesGreaterThan(Integer value) {
            addCriterion("RETRIES_ >", value, "retries");
            return (Criteria) this;
        }

        public Criteria andRetriesGreaterThanOrEqualTo(Integer value) {
            addCriterion("RETRIES_ >=", value, "retries");
            return (Criteria) this;
        }

        public Criteria andRetriesLessThan(Integer value) {
            addCriterion("RETRIES_ <", value, "retries");
            return (Criteria) this;
        }

        public Criteria andRetriesLessThanOrEqualTo(Integer value) {
            addCriterion("RETRIES_ <=", value, "retries");
            return (Criteria) this;
        }

        public Criteria andRetriesIn(List<Integer> values) {
            addCriterion("RETRIES_ in", values, "retries");
            return (Criteria) this;
        }

        public Criteria andRetriesNotIn(List<Integer> values) {
            addCriterion("RETRIES_ not in", values, "retries");
            return (Criteria) this;
        }

        public Criteria andRetriesBetween(Integer value1, Integer value2) {
            addCriterion("RETRIES_ between", value1, value2, "retries");
            return (Criteria) this;
        }

        public Criteria andRetriesNotBetween(Integer value1, Integer value2) {
            addCriterion("RETRIES_ not between", value1, value2, "retries");
            return (Criteria) this;
        }

        public Criteria andExceptionStackIdIsNull() {
            addCriterion("EXCEPTION_STACK_ID_ is null");
            return (Criteria) this;
        }

        public Criteria andExceptionStackIdIsNotNull() {
            addCriterion("EXCEPTION_STACK_ID_ is not null");
            return (Criteria) this;
        }

        public Criteria andExceptionStackIdEqualTo(String value) {
            addCriterion("EXCEPTION_STACK_ID_ =", value, "exceptionStackId");
            return (Criteria) this;
        }

        public Criteria andExceptionStackIdNotEqualTo(String value) {
            addCriterion("EXCEPTION_STACK_ID_ <>", value, "exceptionStackId");
            return (Criteria) this;
        }

        public Criteria andExceptionStackIdGreaterThan(String value) {
            addCriterion("EXCEPTION_STACK_ID_ >", value, "exceptionStackId");
            return (Criteria) this;
        }

        public Criteria andExceptionStackIdGreaterThanOrEqualTo(String value) {
            addCriterion("EXCEPTION_STACK_ID_ >=", value, "exceptionStackId");
            return (Criteria) this;
        }

        public Criteria andExceptionStackIdLessThan(String value) {
            addCriterion("EXCEPTION_STACK_ID_ <", value, "exceptionStackId");
            return (Criteria) this;
        }

        public Criteria andExceptionStackIdLessThanOrEqualTo(String value) {
            addCriterion("EXCEPTION_STACK_ID_ <=", value, "exceptionStackId");
            return (Criteria) this;
        }

        public Criteria andExceptionStackIdLike(String value) {
            addCriterion("EXCEPTION_STACK_ID_ like", value, "exceptionStackId");
            return (Criteria) this;
        }

        public Criteria andExceptionStackIdNotLike(String value) {
            addCriterion("EXCEPTION_STACK_ID_ not like", value, "exceptionStackId");
            return (Criteria) this;
        }

        public Criteria andExceptionStackIdIn(List<String> values) {
            addCriterion("EXCEPTION_STACK_ID_ in", values, "exceptionStackId");
            return (Criteria) this;
        }

        public Criteria andExceptionStackIdNotIn(List<String> values) {
            addCriterion("EXCEPTION_STACK_ID_ not in", values, "exceptionStackId");
            return (Criteria) this;
        }

        public Criteria andExceptionStackIdBetween(String value1, String value2) {
            addCriterion("EXCEPTION_STACK_ID_ between", value1, value2, "exceptionStackId");
            return (Criteria) this;
        }

        public Criteria andExceptionStackIdNotBetween(String value1, String value2) {
            addCriterion("EXCEPTION_STACK_ID_ not between", value1, value2, "exceptionStackId");
            return (Criteria) this;
        }

        public Criteria andExceptionMsgIsNull() {
            addCriterion("EXCEPTION_MSG_ is null");
            return (Criteria) this;
        }

        public Criteria andExceptionMsgIsNotNull() {
            addCriterion("EXCEPTION_MSG_ is not null");
            return (Criteria) this;
        }

        public Criteria andExceptionMsgEqualTo(String value) {
            addCriterion("EXCEPTION_MSG_ =", value, "exceptionMsg");
            return (Criteria) this;
        }

        public Criteria andExceptionMsgNotEqualTo(String value) {
            addCriterion("EXCEPTION_MSG_ <>", value, "exceptionMsg");
            return (Criteria) this;
        }

        public Criteria andExceptionMsgGreaterThan(String value) {
            addCriterion("EXCEPTION_MSG_ >", value, "exceptionMsg");
            return (Criteria) this;
        }

        public Criteria andExceptionMsgGreaterThanOrEqualTo(String value) {
            addCriterion("EXCEPTION_MSG_ >=", value, "exceptionMsg");
            return (Criteria) this;
        }

        public Criteria andExceptionMsgLessThan(String value) {
            addCriterion("EXCEPTION_MSG_ <", value, "exceptionMsg");
            return (Criteria) this;
        }

        public Criteria andExceptionMsgLessThanOrEqualTo(String value) {
            addCriterion("EXCEPTION_MSG_ <=", value, "exceptionMsg");
            return (Criteria) this;
        }

        public Criteria andExceptionMsgLike(String value) {
            addCriterion("EXCEPTION_MSG_ like", value, "exceptionMsg");
            return (Criteria) this;
        }

        public Criteria andExceptionMsgNotLike(String value) {
            addCriterion("EXCEPTION_MSG_ not like", value, "exceptionMsg");
            return (Criteria) this;
        }

        public Criteria andExceptionMsgIn(List<String> values) {
            addCriterion("EXCEPTION_MSG_ in", values, "exceptionMsg");
            return (Criteria) this;
        }

        public Criteria andExceptionMsgNotIn(List<String> values) {
            addCriterion("EXCEPTION_MSG_ not in", values, "exceptionMsg");
            return (Criteria) this;
        }

        public Criteria andExceptionMsgBetween(String value1, String value2) {
            addCriterion("EXCEPTION_MSG_ between", value1, value2, "exceptionMsg");
            return (Criteria) this;
        }

        public Criteria andExceptionMsgNotBetween(String value1, String value2) {
            addCriterion("EXCEPTION_MSG_ not between", value1, value2, "exceptionMsg");
            return (Criteria) this;
        }

        public Criteria andDuedateIsNull() {
            addCriterion("DUEDATE_ is null");
            return (Criteria) this;
        }

        public Criteria andDuedateIsNotNull() {
            addCriterion("DUEDATE_ is not null");
            return (Criteria) this;
        }

        public Criteria andDuedateEqualTo(Date value) {
            addCriterion("DUEDATE_ =", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateNotEqualTo(Date value) {
            addCriterion("DUEDATE_ <>", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateGreaterThan(Date value) {
            addCriterion("DUEDATE_ >", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateGreaterThanOrEqualTo(Date value) {
            addCriterion("DUEDATE_ >=", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateLessThan(Date value) {
            addCriterion("DUEDATE_ <", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateLessThanOrEqualTo(Date value) {
            addCriterion("DUEDATE_ <=", value, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateIn(List<Date> values) {
            addCriterion("DUEDATE_ in", values, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateNotIn(List<Date> values) {
            addCriterion("DUEDATE_ not in", values, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateBetween(Date value1, Date value2) {
            addCriterion("DUEDATE_ between", value1, value2, "duedate");
            return (Criteria) this;
        }

        public Criteria andDuedateNotBetween(Date value1, Date value2) {
            addCriterion("DUEDATE_ not between", value1, value2, "duedate");
            return (Criteria) this;
        }

        public Criteria andRepeatIsNull() {
            addCriterion("REPEAT_ is null");
            return (Criteria) this;
        }

        public Criteria andRepeatIsNotNull() {
            addCriterion("REPEAT_ is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatEqualTo(String value) {
            addCriterion("REPEAT_ =", value, "repeat");
            return (Criteria) this;
        }

        public Criteria andRepeatNotEqualTo(String value) {
            addCriterion("REPEAT_ <>", value, "repeat");
            return (Criteria) this;
        }

        public Criteria andRepeatGreaterThan(String value) {
            addCriterion("REPEAT_ >", value, "repeat");
            return (Criteria) this;
        }

        public Criteria andRepeatGreaterThanOrEqualTo(String value) {
            addCriterion("REPEAT_ >=", value, "repeat");
            return (Criteria) this;
        }

        public Criteria andRepeatLessThan(String value) {
            addCriterion("REPEAT_ <", value, "repeat");
            return (Criteria) this;
        }

        public Criteria andRepeatLessThanOrEqualTo(String value) {
            addCriterion("REPEAT_ <=", value, "repeat");
            return (Criteria) this;
        }

        public Criteria andRepeatLike(String value) {
            addCriterion("REPEAT_ like", value, "repeat");
            return (Criteria) this;
        }

        public Criteria andRepeatNotLike(String value) {
            addCriterion("REPEAT_ not like", value, "repeat");
            return (Criteria) this;
        }

        public Criteria andRepeatIn(List<String> values) {
            addCriterion("REPEAT_ in", values, "repeat");
            return (Criteria) this;
        }

        public Criteria andRepeatNotIn(List<String> values) {
            addCriterion("REPEAT_ not in", values, "repeat");
            return (Criteria) this;
        }

        public Criteria andRepeatBetween(String value1, String value2) {
            addCriterion("REPEAT_ between", value1, value2, "repeat");
            return (Criteria) this;
        }

        public Criteria andRepeatNotBetween(String value1, String value2) {
            addCriterion("REPEAT_ not between", value1, value2, "repeat");
            return (Criteria) this;
        }

        public Criteria andHandlerTypeIsNull() {
            addCriterion("HANDLER_TYPE_ is null");
            return (Criteria) this;
        }

        public Criteria andHandlerTypeIsNotNull() {
            addCriterion("HANDLER_TYPE_ is not null");
            return (Criteria) this;
        }

        public Criteria andHandlerTypeEqualTo(String value) {
            addCriterion("HANDLER_TYPE_ =", value, "handlerType");
            return (Criteria) this;
        }

        public Criteria andHandlerTypeNotEqualTo(String value) {
            addCriterion("HANDLER_TYPE_ <>", value, "handlerType");
            return (Criteria) this;
        }

        public Criteria andHandlerTypeGreaterThan(String value) {
            addCriterion("HANDLER_TYPE_ >", value, "handlerType");
            return (Criteria) this;
        }

        public Criteria andHandlerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("HANDLER_TYPE_ >=", value, "handlerType");
            return (Criteria) this;
        }

        public Criteria andHandlerTypeLessThan(String value) {
            addCriterion("HANDLER_TYPE_ <", value, "handlerType");
            return (Criteria) this;
        }

        public Criteria andHandlerTypeLessThanOrEqualTo(String value) {
            addCriterion("HANDLER_TYPE_ <=", value, "handlerType");
            return (Criteria) this;
        }

        public Criteria andHandlerTypeLike(String value) {
            addCriterion("HANDLER_TYPE_ like", value, "handlerType");
            return (Criteria) this;
        }

        public Criteria andHandlerTypeNotLike(String value) {
            addCriterion("HANDLER_TYPE_ not like", value, "handlerType");
            return (Criteria) this;
        }

        public Criteria andHandlerTypeIn(List<String> values) {
            addCriterion("HANDLER_TYPE_ in", values, "handlerType");
            return (Criteria) this;
        }

        public Criteria andHandlerTypeNotIn(List<String> values) {
            addCriterion("HANDLER_TYPE_ not in", values, "handlerType");
            return (Criteria) this;
        }

        public Criteria andHandlerTypeBetween(String value1, String value2) {
            addCriterion("HANDLER_TYPE_ between", value1, value2, "handlerType");
            return (Criteria) this;
        }

        public Criteria andHandlerTypeNotBetween(String value1, String value2) {
            addCriterion("HANDLER_TYPE_ not between", value1, value2, "handlerType");
            return (Criteria) this;
        }

        public Criteria andHandlerCfgIsNull() {
            addCriterion("HANDLER_CFG_ is null");
            return (Criteria) this;
        }

        public Criteria andHandlerCfgIsNotNull() {
            addCriterion("HANDLER_CFG_ is not null");
            return (Criteria) this;
        }

        public Criteria andHandlerCfgEqualTo(String value) {
            addCriterion("HANDLER_CFG_ =", value, "handlerCfg");
            return (Criteria) this;
        }

        public Criteria andHandlerCfgNotEqualTo(String value) {
            addCriterion("HANDLER_CFG_ <>", value, "handlerCfg");
            return (Criteria) this;
        }

        public Criteria andHandlerCfgGreaterThan(String value) {
            addCriterion("HANDLER_CFG_ >", value, "handlerCfg");
            return (Criteria) this;
        }

        public Criteria andHandlerCfgGreaterThanOrEqualTo(String value) {
            addCriterion("HANDLER_CFG_ >=", value, "handlerCfg");
            return (Criteria) this;
        }

        public Criteria andHandlerCfgLessThan(String value) {
            addCriterion("HANDLER_CFG_ <", value, "handlerCfg");
            return (Criteria) this;
        }

        public Criteria andHandlerCfgLessThanOrEqualTo(String value) {
            addCriterion("HANDLER_CFG_ <=", value, "handlerCfg");
            return (Criteria) this;
        }

        public Criteria andHandlerCfgLike(String value) {
            addCriterion("HANDLER_CFG_ like", value, "handlerCfg");
            return (Criteria) this;
        }

        public Criteria andHandlerCfgNotLike(String value) {
            addCriterion("HANDLER_CFG_ not like", value, "handlerCfg");
            return (Criteria) this;
        }

        public Criteria andHandlerCfgIn(List<String> values) {
            addCriterion("HANDLER_CFG_ in", values, "handlerCfg");
            return (Criteria) this;
        }

        public Criteria andHandlerCfgNotIn(List<String> values) {
            addCriterion("HANDLER_CFG_ not in", values, "handlerCfg");
            return (Criteria) this;
        }

        public Criteria andHandlerCfgBetween(String value1, String value2) {
            addCriterion("HANDLER_CFG_ between", value1, value2, "handlerCfg");
            return (Criteria) this;
        }

        public Criteria andHandlerCfgNotBetween(String value1, String value2) {
            addCriterion("HANDLER_CFG_ not between", value1, value2, "handlerCfg");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNull() {
            addCriterion("TENANT_ID_ is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNotNull() {
            addCriterion("TENANT_ID_ is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdEqualTo(String value) {
            addCriterion("TENANT_ID_ =", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotEqualTo(String value) {
            addCriterion("TENANT_ID_ <>", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThan(String value) {
            addCriterion("TENANT_ID_ >", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThanOrEqualTo(String value) {
            addCriterion("TENANT_ID_ >=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThan(String value) {
            addCriterion("TENANT_ID_ <", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThanOrEqualTo(String value) {
            addCriterion("TENANT_ID_ <=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLike(String value) {
            addCriterion("TENANT_ID_ like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotLike(String value) {
            addCriterion("TENANT_ID_ not like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIn(List<String> values) {
            addCriterion("TENANT_ID_ in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotIn(List<String> values) {
            addCriterion("TENANT_ID_ not in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdBetween(String value1, String value2) {
            addCriterion("TENANT_ID_ between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotBetween(String value1, String value2) {
            addCriterion("TENANT_ID_ not between", value1, value2, "tenantId");
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