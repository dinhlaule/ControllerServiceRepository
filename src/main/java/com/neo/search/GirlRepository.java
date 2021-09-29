package com.neo.search;

import org.springframework.stereotype.Repository;

@Repository
public class GirlRepository implements GirlRepositoryImpl {
	public Girl getGirlByName(String name) {
		// Ở đây tôi ví dụ là database đã trả về một cô gái với tên đúng như tham số
		// Còn thực tế phải query trong CSDL
		return new Girl(name);
	}
}