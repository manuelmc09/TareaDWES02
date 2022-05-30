package com.manuelmc09.TareaDWES02.modelo;

import java.time.LocalDateTime;

public class TodoItem {

	private String description;
	private LocalDateTime createDate;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}

}
