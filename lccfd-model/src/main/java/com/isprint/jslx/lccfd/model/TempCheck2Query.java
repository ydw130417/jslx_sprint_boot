package com.isprint.jslx.lccfd.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TempCheck2Query {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public TempCheck2Query() {
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

    public void setPageNo(Integer pageNo) {
        this.pageNo=pageNo;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setStartRow(Integer startRow) {
        this.startRow=startRow;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize=pageSize;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setFields(String fields) {
        this.fields=fields;
    }

    public String getFields() {
        return fields;
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

        public Criteria andTimuIdIsNull() {
            addCriterion("timu_id is null");
            return (Criteria) this;
        }

        public Criteria andTimuIdIsNotNull() {
            addCriterion("timu_id is not null");
            return (Criteria) this;
        }

        public Criteria andTimuIdEqualTo(String value) {
            addCriterion("timu_id =", value, "timuId");
            return (Criteria) this;
        }

        public Criteria andTimuIdNotEqualTo(String value) {
            addCriterion("timu_id <>", value, "timuId");
            return (Criteria) this;
        }

        public Criteria andTimuIdGreaterThan(String value) {
            addCriterion("timu_id >", value, "timuId");
            return (Criteria) this;
        }

        public Criteria andTimuIdGreaterThanOrEqualTo(String value) {
            addCriterion("timu_id >=", value, "timuId");
            return (Criteria) this;
        }

        public Criteria andTimuIdLessThan(String value) {
            addCriterion("timu_id <", value, "timuId");
            return (Criteria) this;
        }

        public Criteria andTimuIdLessThanOrEqualTo(String value) {
            addCriterion("timu_id <=", value, "timuId");
            return (Criteria) this;
        }

        public Criteria andTimuIdLike(String value) {
            addCriterion("timu_id like", value, "timuId");
            return (Criteria) this;
        }

        public Criteria andTimuIdNotLike(String value) {
            addCriterion("timu_id not like", value, "timuId");
            return (Criteria) this;
        }

        public Criteria andTimuIdIn(List<String> values) {
            addCriterion("timu_id in", values, "timuId");
            return (Criteria) this;
        }

        public Criteria andTimuIdNotIn(List<String> values) {
            addCriterion("timu_id not in", values, "timuId");
            return (Criteria) this;
        }

        public Criteria andTimuIdBetween(String value1, String value2) {
            addCriterion("timu_id between", value1, value2, "timuId");
            return (Criteria) this;
        }

        public Criteria andTimuIdNotBetween(String value1, String value2) {
            addCriterion("timu_id not between", value1, value2, "timuId");
            return (Criteria) this;
        }

        public Criteria andTimuPicIsNull() {
            addCriterion("timu_pic is null");
            return (Criteria) this;
        }

        public Criteria andTimuPicIsNotNull() {
            addCriterion("timu_pic is not null");
            return (Criteria) this;
        }

        public Criteria andTimuPicEqualTo(String value) {
            addCriterion("timu_pic =", value, "timuPic");
            return (Criteria) this;
        }

        public Criteria andTimuPicNotEqualTo(String value) {
            addCriterion("timu_pic <>", value, "timuPic");
            return (Criteria) this;
        }

        public Criteria andTimuPicGreaterThan(String value) {
            addCriterion("timu_pic >", value, "timuPic");
            return (Criteria) this;
        }

        public Criteria andTimuPicGreaterThanOrEqualTo(String value) {
            addCriterion("timu_pic >=", value, "timuPic");
            return (Criteria) this;
        }

        public Criteria andTimuPicLessThan(String value) {
            addCriterion("timu_pic <", value, "timuPic");
            return (Criteria) this;
        }

        public Criteria andTimuPicLessThanOrEqualTo(String value) {
            addCriterion("timu_pic <=", value, "timuPic");
            return (Criteria) this;
        }

        public Criteria andTimuPicLike(String value) {
            addCriterion("timu_pic like", value, "timuPic");
            return (Criteria) this;
        }

        public Criteria andTimuPicNotLike(String value) {
            addCriterion("timu_pic not like", value, "timuPic");
            return (Criteria) this;
        }

        public Criteria andTimuPicIn(List<String> values) {
            addCriterion("timu_pic in", values, "timuPic");
            return (Criteria) this;
        }

        public Criteria andTimuPicNotIn(List<String> values) {
            addCriterion("timu_pic not in", values, "timuPic");
            return (Criteria) this;
        }

        public Criteria andTimuPicBetween(String value1, String value2) {
            addCriterion("timu_pic between", value1, value2, "timuPic");
            return (Criteria) this;
        }

        public Criteria andTimuPicNotBetween(String value1, String value2) {
            addCriterion("timu_pic not between", value1, value2, "timuPic");
            return (Criteria) this;
        }

        public Criteria andSimIdIsNull() {
            addCriterion("sim_id is null");
            return (Criteria) this;
        }

        public Criteria andSimIdIsNotNull() {
            addCriterion("sim_id is not null");
            return (Criteria) this;
        }

        public Criteria andSimIdEqualTo(String value) {
            addCriterion("sim_id =", value, "simId");
            return (Criteria) this;
        }

        public Criteria andSimIdNotEqualTo(String value) {
            addCriterion("sim_id <>", value, "simId");
            return (Criteria) this;
        }

        public Criteria andSimIdGreaterThan(String value) {
            addCriterion("sim_id >", value, "simId");
            return (Criteria) this;
        }

        public Criteria andSimIdGreaterThanOrEqualTo(String value) {
            addCriterion("sim_id >=", value, "simId");
            return (Criteria) this;
        }

        public Criteria andSimIdLessThan(String value) {
            addCriterion("sim_id <", value, "simId");
            return (Criteria) this;
        }

        public Criteria andSimIdLessThanOrEqualTo(String value) {
            addCriterion("sim_id <=", value, "simId");
            return (Criteria) this;
        }

        public Criteria andSimIdLike(String value) {
            addCriterion("sim_id like", value, "simId");
            return (Criteria) this;
        }

        public Criteria andSimIdNotLike(String value) {
            addCriterion("sim_id not like", value, "simId");
            return (Criteria) this;
        }

        public Criteria andSimIdIn(List<String> values) {
            addCriterion("sim_id in", values, "simId");
            return (Criteria) this;
        }

        public Criteria andSimIdNotIn(List<String> values) {
            addCriterion("sim_id not in", values, "simId");
            return (Criteria) this;
        }

        public Criteria andSimIdBetween(String value1, String value2) {
            addCriterion("sim_id between", value1, value2, "simId");
            return (Criteria) this;
        }

        public Criteria andSimIdNotBetween(String value1, String value2) {
            addCriterion("sim_id not between", value1, value2, "simId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNull() {
            addCriterion("subject_id is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNotNull() {
            addCriterion("subject_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdEqualTo(Integer value) {
            addCriterion("subject_id =", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotEqualTo(Integer value) {
            addCriterion("subject_id <>", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThan(Integer value) {
            addCriterion("subject_id >", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("subject_id >=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThan(Integer value) {
            addCriterion("subject_id <", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("subject_id <=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIn(List<Integer> values) {
            addCriterion("subject_id in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotIn(List<Integer> values) {
            addCriterion("subject_id not in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdBetween(Integer value1, Integer value2) {
            addCriterion("subject_id between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("subject_id not between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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