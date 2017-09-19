package com.github.common.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@SuppressWarnings("serial")
@MappedSuperclass
public class AuditEntity implements Serializable
{

	@Column(name = "created_time", updatable = false)
	private LocalDateTime createdTime;

	@Column(name = "updated_time")
	private LocalDateTime updatedTime;

	@Column(name = "created_id", updatable = false)
	private Long createdId;

	@Column(name = "updated_id")
	private Long updatedId;

	public LocalDateTime getCreatedTime()
	{
		return createdTime;
	}

	public void setCreatedTime(LocalDateTime createdTime)
	{
		this.createdTime = createdTime;
	}

	public LocalDateTime getUpdatedTime()
	{
		return updatedTime;
	}

	public void setUpdatedTime(LocalDateTime updatedTime)
	{
		this.updatedTime = updatedTime;
	}

	public Long getCreatedId()
	{
		return createdId;
	}

	public void setCreatedId(Long createdId)
	{
		this.createdId = createdId;
	}

	public Long getUpdatedId()
	{
		return updatedId;
	}

	public void setUpdatedId(Long updatedId)
	{
		this.updatedId = updatedId;
	}
}
