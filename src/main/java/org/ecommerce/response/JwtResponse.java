package org.ecommerce.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtResponse {
	private String status;
	private String jwtToken;
	private String message;
	private String userType;
	public void setJwtToken(String jwtToken2) {
		// TODO Auto-generated method stub
		
	}
	public void setStatus(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setMessage(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setUserType(String string) {
		// TODO Auto-generated method stub
		
	}

}
