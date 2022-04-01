package com.mca.studio18.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="blog")

public class Blog {
	
	@Column(name="blog_id")
	private Long blogid;
	
	@Column(name="blog_date")
	private String blogdate;
	
	@Column(name="blog_writer")
	private String blogwriter;
	
	@Column(name="blog_content")
	private String blogcontent;

}
