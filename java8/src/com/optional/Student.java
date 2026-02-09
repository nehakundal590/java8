package com.optional;

import java.util.Optional;

public class Student {
	public Optional<String> getStudentNameByID(int id) {
		if(id==100) {
			return Optional.ofNullable("vinod");
		}
		if(id==101) {
		return Optional.ofNullable("ajay");
		}
		if(id==102) {
			return Optional.ofNullable("hitesh");
		}
		if(id==103) {
			return Optional.ofNullable("neha");
		}
		if(id==104) {
			return Optional.ofNullable("raksha");
		}
		return Optional.ofNullable(null);
	}

}
