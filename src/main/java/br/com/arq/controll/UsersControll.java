package br.com.arq.controll;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.arq.entity.Users;
import br.com.arq.repository.UsersRepository;

@ResponseBody
@RestController
@RequestMapping("/api/users")
public class UsersControll {
	
	
@Autowired
	private UsersRepository usersRepository;
    @GetMapping("/listAll")
    public ResponseEntity<?> findAll(){
    	return ResponseEntity.status(200).body(usersRepository.findAll());
    }
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody Users users){
    	try {
    		users.setStatus("created");
            users.setToken(UUID.randomUUID().toString());
    		Users resp = usersRepository.save(users);
    	if(resp==null) {
    		throw new IllegalArgumentException("error encontrado");
    	}
    	  return ResponseEntity.status(200).body(resp);
    }
    catch(Exception ex) {
   return ResponseEntity.status(500).body("error: data exists "+ex.getMessage());
      }
   }
}