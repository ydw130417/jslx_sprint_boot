package com.isprint.jslx.lccfd.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FdStudentExampaperReportQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public FdStudentExampaperReportQuery() {
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

        public Criteria andExampaperIdIsNull() {
            addCriterion("exampaper_id is null");
            return (Criteria) this;
        }

        public Criteria andExampaperIdIsNotNull() {
            addCriterion("exampaper_id is not null");
            return (Criteria) this;
        }

        public Criteria andExampaperIdEqualTo(Integer value) {
            addCriterion("exampaper_id =", value, "exampaperId");
            return (Criteria) this;
        }

        public Criteria andExampaperIdNotEqualTo(Integer value) {
            addCriterion("exampaper_id <>", value, "exampaperId");
            return (Criteria) this;
        }

        public Criteria andExampaperIdGreaterThan(Integer value) {
            addCriterion("exampaper_id >", value, "exampaperId");
            return (Criteria) this;
        }

        public Criteria andExampaperIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("exampaper_id >=", value, "exampaperId");
            return (Criteria) this;
        }

        public Criteria andExampaperIdLessThan(Integer value) {
            addCriterion("exampaper_id <", value, "exampaperId");
            return (Criteria) this;
        }

        public Criteria andExampaperIdLessThanOrEqualTo(Integer value) {
            addCriterion("exampaper_id <=", value, "exampaperId");
            return (Criteria) this;
        }

        public Criteria andExampaperIdIn(List<Integer> values) {
            addCriterion("exampaper_id in", values, "exampaperId");
            return (Criteria) this;
        }

        public Criteria andExampaperIdNotIn(List<Integer> values) {
            addCriterion("exampaper_id not in", values, "exampaperId");
            return (Criteria) this;
        }

        public Criteria andExampaperIdBetween(Integer value1, Integer value2) {
            addCriterion("exampaper_id between", value1, value2, "exampaperId");
            return (Criteria) this;
        }

        public Criteria andExampaperIdNotBetween(Integer value1, Integer value2) {
            addCriterion("exampaper_id not between", value1, value2, "exampaperId");
            return (Criteria) this;
        }

        public Criteria andExampaperNameIsNull() {
            addCriterion("exampaper_name is null");
            return (Criteria) this;
        }

        public Criteria andExampaperNameIsNotNull() {
            addCriterion("exampaper_name is not null");
            return (Criteria) this;
        }

        public Criteria andExampaperNameEqualTo(String value) {
            addCriterion("exampaper_name =", value, "exampaperName");
            return (Criteria) this;
        }

        public Criteria andExampaperNameNotEqualTo(String value) {
            addCriterion("exampaper_name <>", value, "exampaperName");
            return (Criteria) this;
        }

        public Criteria andExampaperNameGreaterThan(String value) {
            addCriterion("exampaper_name >", value, "exampaperName");
            return (Criteria) this;
        }

        public Criteria andExampaperNameGreaterThanOrEqualTo(String value) {
            addCriterion("exampaper_name >=", value, "exampaperName");
            return (Criteria) this;
        }

        public Criteria andExampaperNameLessThan(String value) {
            addCriterion("exampaper_name <", value, "exampaperName");
            return (Criteria) this;
        }

        public Criteria andExampaperNameLessThanOrEqualTo(String value) {
            addCriterion("exampaper_name <=", value, "exampaperName");
            return (Criteria) this;
        }

        public Criteria andExampaperNameLike(String value) {
            addCriterion("exampaper_name like", value, "exampaperName");
            return (Criteria) this;
        }

        public Criteria andExampaperNameNotLike(String value) {
            addCriterion("exampaper_name not like", value, "exampaperName");
            return (Criteria) this;
        }

        public Criteria andExampaperNameIn(List<String> values) {
            addCriterion("exampaper_name in", values, "exampaperName");
            return (Criteria) this;
        }

        public Criteria andExampaperNameNotIn(List<String> values) {
            addCriterion("exampaper_name not in", values, "exampaperName");
            return (Criteria) this;
        }

        public Criteria andExampaperNameBetween(String value1, String value2) {
            addCriterion("exampaper_name between", value1, value2, "exampaperName");
            return (Criteria) this;
        }

        public Criteria andExampaperNameNotBetween(String value1, String value2) {
            addCriterion("exampaper_name not between", value1, value2, "exampaperName");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(BigDecimal value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(BigDecimal value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(BigDecimal value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(BigDecimal value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<BigDecimal> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<BigDecimal> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andReportIsNull() {
            addCriterion("report is null");
            return (Criteria) this;
        }

        public Criteria andReportIsNotNull() {
            addCriterion("report is not null");
            return (Criteria) this;
        }

        public Criteria andReportEqualTo(String value) {
            addCriterion("report =", value, "report");
            return (Criteria) this;
        }

        public Criteria andReportNotEqualTo(String value) {
            addCriterion("report <>", value, "report");
            return (Criteria) this;
        }

        public Criteria andReportGreaterThan(String value) {
            addCriterion("report >", value, "report");
            return (Criteria) this;
        }

        public Criteria andReportGreaterThanOrEqualTo(String value) {
            addCriterion("report >=", value, "report");
            return (Criteria) this;
        }

        public Criteria andReportLessThan(String value) {
            addCriterion("report <", value, "report");
            return (Criteria) this;
        }

        public Criteria andReportLessThanOrEqualTo(String value) {
            addCriterion("report <=", value, "report");
            return (Criteria) this;
        }

        public Criteria andReportLike(String value) {
            addCriterion("report like", value, "report");
            return (Criteria) this;
        }

        public Criteria andReportNotLike(String value) {
            addCriterion("report not like", value, "report");
            return (Criteria) this;
        }

        public Criteria andReportIn(List<String> values) {
            addCriterion("report in", values, "report");
            return (Criteria) this;
        }

        public Criteria andReportNotIn(List<String> values) {
            addCriterion("report not in", values, "report");
            return (Criteria) this;
        }

        public Criteria andReportBetween(String value1, String value2) {
            addCriterion("report between", value1, value2, "report");
            return (Criteria) this;
        }

        public Criteria andReportNotBetween(String value1, String value2) {
            addCriterion("report not between", value1, value2, "report");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIsNull() {
            addCriterion("school_id is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIsNotNull() {
            addCriterion("school_id is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolIdEqualTo(Integer value) {
            addCriterion("school_id =", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotEqualTo(Integer value) {
            addCriterion("school_id <>", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThan(Integer value) {
            addCriterion("school_id >", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("school_id >=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThan(Integer value) {
            addCriterion("school_id <", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdLessThanOrEqualTo(Integer value) {
            addCriterion("school_id <=", value, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdIn(List<Integer> values) {
            addCriterion("school_id in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotIn(List<Integer> values) {
            addCriterion("school_id not in", values, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdBetween(Integer value1, Integer value2) {
            addCriterion("school_id between", value1, value2, "schoolId");
            return (Criteria) this;
        }

        public Criteria andSchoolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("school_id not between", value1, value2, "schoolId");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNull() {
            addCriterion("grade_id is null");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNotNull() {
            addCriterion("grade_id is not null");
            return (Criteria) this;
        }

        public Criteria andGradeIdEqualTo(Integer value) {
            addCriterion("grade_id =", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotEqualTo(Integer value) {
            addCriterion("grade_id <>", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThan(Integer value) {
            addCriterion("grade_id >", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade_id >=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThan(Integer value) {
            addCriterion("grade_id <", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThanOrEqualTo(Integer value) {
            addCriterion("grade_id <=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdIn(List<Integer> values) {
            addCriterion("grade_id in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotIn(List<Integer> values) {
            addCriterion("grade_id not in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdBetween(Integer value1, Integer value2) {
            addCriterion("grade_id between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("grade_id not between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andClassesIdIsNull() {
            addCriterion("classes_id is null");
            return (Criteria) this;
        }

        public Criteria andClassesIdIsNotNull() {
            addCriterion("classes_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassesIdEqualTo(Integer value) {
            addCriterion("classes_id =", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdNotEqualTo(Integer value) {
            addCriterion("classes_id <>", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdGreaterThan(Integer value) {
            addCriterion("classes_id >", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("classes_id >=", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdLessThan(Integer value) {
            addCriterion("classes_id <", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdLessThanOrEqualTo(Integer value) {
            addCriterion("classes_id <=", value, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdIn(List<Integer> values) {
            addCriterion("classes_id in", values, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdNotIn(List<Integer> values) {
            addCriterion("classes_id not in", values, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdBetween(Integer value1, Integer value2) {
            addCriterion("classes_id between", value1, value2, "classesId");
            return (Criteria) this;
        }

        public Criteria andClassesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("classes_id not between", value1, value2, "classesId");
            return (Criteria) this;
        }

        public Criteria andYearIdIsNull() {
            addCriterion("year_id is null");
            return (Criteria) this;
        }

        public Criteria andYearIdIsNotNull() {
            addCriterion("year_id is not null");
            return (Criteria) this;
        }

        public Criteria andYearIdEqualTo(Integer value) {
            addCriterion("year_id =", value, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdNotEqualTo(Integer value) {
            addCriterion("year_id <>", value, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdGreaterThan(Integer value) {
            addCriterion("year_id >", value, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("year_id >=", value, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdLessThan(Integer value) {
            addCriterion("year_id <", value, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdLessThanOrEqualTo(Integer value) {
            addCriterion("year_id <=", value, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdIn(List<Integer> values) {
            addCriterion("year_id in", values, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdNotIn(List<Integer> values) {
            addCriterion("year_id not in", values, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdBetween(Integer value1, Integer value2) {
            addCriterion("year_id between", value1, value2, "yearId");
            return (Criteria) this;
        }

        public Criteria andYearIdNotBetween(Integer value1, Integer value2) {
            addCriterion("year_id not between", value1, value2, "yearId");
            return (Criteria) this;
        }

        public Criteria andAverageScoreIsNull() {
            addCriterion("average_score is null");
            return (Criteria) this;
        }

        public Criteria andAverageScoreIsNotNull() {
            addCriterion("average_score is not null");
            return (Criteria) this;
        }

        public Criteria andAverageScoreEqualTo(BigDecimal value) {
            addCriterion("average_score =", value, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreNotEqualTo(BigDecimal value) {
            addCriterion("average_score <>", value, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreGreaterThan(BigDecimal value) {
            addCriterion("average_score >", value, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("average_score >=", value, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreLessThan(BigDecimal value) {
            addCriterion("average_score <", value, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("average_score <=", value, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreIn(List<BigDecimal> values) {
            addCriterion("average_score in", values, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreNotIn(List<BigDecimal> values) {
            addCriterion("average_score not in", values, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("average_score between", value1, value2, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("average_score not between", value1, value2, "averageScore");
            return (Criteria) this;
        }

        public Criteria andExceedNumIsNull() {
            addCriterion("exceed_num is null");
            return (Criteria) this;
        }

        public Criteria andExceedNumIsNotNull() {
            addCriterion("exceed_num is not null");
            return (Criteria) this;
        }

        public Criteria andExceedNumEqualTo(Integer value) {
            addCriterion("exceed_num =", value, "exceedNum");
            return (Criteria) this;
        }

        public Criteria andExceedNumNotEqualTo(Integer value) {
            addCriterion("exceed_num <>", value, "exceedNum");
            return (Criteria) this;
        }

        public Criteria andExceedNumGreaterThan(Integer value) {
            addCriterion("exceed_num >", value, "exceedNum");
            return (Criteria) this;
        }

        public Criteria andExceedNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("exceed_num >=", value, "exceedNum");
            return (Criteria) this;
        }

        public Criteria andExceedNumLessThan(Integer value) {
            addCriterion("exceed_num <", value, "exceedNum");
            return (Criteria) this;
        }

        public Criteria andExceedNumLessThanOrEqualTo(Integer value) {
            addCriterion("exceed_num <=", value, "exceedNum");
            return (Criteria) this;
        }

        public Criteria andExceedNumIn(List<Integer> values) {
            addCriterion("exceed_num in", values, "exceedNum");
            return (Criteria) this;
        }

        public Criteria andExceedNumNotIn(List<Integer> values) {
            addCriterion("exceed_num not in", values, "exceedNum");
            return (Criteria) this;
        }

        public Criteria andExceedNumBetween(Integer value1, Integer value2) {
            addCriterion("exceed_num between", value1, value2, "exceedNum");
            return (Criteria) this;
        }

        public Criteria andExceedNumNotBetween(Integer value1, Integer value2) {
            addCriterion("exceed_num not between", value1, value2, "exceedNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNull() {
            addCriterion("total_num is null");
            return (Criteria) this;
        }

        public Criteria andTotalNumIsNotNull() {
            addCriterion("total_num is not null");
            return (Criteria) this;
        }

        public Criteria andTotalNumEqualTo(Integer value) {
            addCriterion("total_num =", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotEqualTo(Integer value) {
            addCriterion("total_num <>", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThan(Integer value) {
            addCriterion("total_num >", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_num >=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThan(Integer value) {
            addCriterion("total_num <", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumLessThanOrEqualTo(Integer value) {
            addCriterion("total_num <=", value, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumIn(List<Integer> values) {
            addCriterion("total_num in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotIn(List<Integer> values) {
            addCriterion("total_num not in", values, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumBetween(Integer value1, Integer value2) {
            addCriterion("total_num between", value1, value2, "totalNum");
            return (Criteria) this;
        }

        public Criteria andTotalNumNotBetween(Integer value1, Integer value2) {
            addCriterion("total_num not between", value1, value2, "totalNum");
            return (Criteria) this;
        }

        public Criteria andBeatProIsNull() {
            addCriterion("beat_pro is null");
            return (Criteria) this;
        }

        public Criteria andBeatProIsNotNull() {
            addCriterion("beat_pro is not null");
            return (Criteria) this;
        }

        public Criteria andBeatProEqualTo(BigDecimal value) {
            addCriterion("beat_pro =", value, "beatPro");
            return (Criteria) this;
        }

        public Criteria andBeatProNotEqualTo(BigDecimal value) {
            addCriterion("beat_pro <>", value, "beatPro");
            return (Criteria) this;
        }

        public Criteria andBeatProGreaterThan(BigDecimal value) {
            addCriterion("beat_pro >", value, "beatPro");
            return (Criteria) this;
        }

        public Criteria andBeatProGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("beat_pro >=", value, "beatPro");
            return (Criteria) this;
        }

        public Criteria andBeatProLessThan(BigDecimal value) {
            addCriterion("beat_pro <", value, "beatPro");
            return (Criteria) this;
        }

        public Criteria andBeatProLessThanOrEqualTo(BigDecimal value) {
            addCriterion("beat_pro <=", value, "beatPro");
            return (Criteria) this;
        }

        public Criteria andBeatProIn(List<BigDecimal> values) {
            addCriterion("beat_pro in", values, "beatPro");
            return (Criteria) this;
        }

        public Criteria andBeatProNotIn(List<BigDecimal> values) {
            addCriterion("beat_pro not in", values, "beatPro");
            return (Criteria) this;
        }

        public Criteria andBeatProBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("beat_pro between", value1, value2, "beatPro");
            return (Criteria) this;
        }

        public Criteria andBeatProNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("beat_pro not between", value1, value2, "beatPro");
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