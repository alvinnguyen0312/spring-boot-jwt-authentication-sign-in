package com.javaspring.security.entity;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthRequest
{
	private String userName;
	private String passWord;
}
//end class