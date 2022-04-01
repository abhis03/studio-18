package com.mca.studio18.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder


public class BlogModel {
	
	public int blogid;
	public String blogdate;
	public String blogwriter;
	public String blogcontent;

}
