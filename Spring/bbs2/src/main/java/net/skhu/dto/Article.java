package net.skhu.dto;

import java.util.Date;

import lombok.Data;

@Data
public class Article {
	int id;
	int no;
	Date writeTime;
	String title;
	String body;
	int boardId;
	int userId;
	String userName;
}
