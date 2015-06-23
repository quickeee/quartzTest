package com.dhu.quartzTest.domain;

import com.dhu.quartzTest.util.Constant;

public class ScheduleJob {
	private String jobName;
	/* job group */
	private String jobGroup;
	/* job状态 */
	private String jobStatus;
	/* cron表达式 */
	private String cronExpression;
	/* 任务描述 */
	private String desc;

	public ScheduleJob() {
		jobGroup = Constant.JOB_GROUP_NAME;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getJobGroup() {
		return jobGroup;
	}

	public void setJobGroup(String jobGroup) {
		this.jobGroup = jobGroup;
	}

	public String getJobStatus() {
		return jobStatus;
	}

	public void setJobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
	}

	public String getCronExpression() {
		return cronExpression;
	}

	public void setCronExpression(String cronExpression) {
		this.cronExpression = cronExpression;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}