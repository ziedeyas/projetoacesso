package br.com.arq.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.arq.entity.Users;

public interface UsersRepository extends MongoRepository<Users, String> {
	public default List<Users> findAll() {
		// TODO Auto-generated method stub
		return null;
	}



	

	
}
