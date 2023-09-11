package com.esypharma.app.serviceImp;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;

import com.esypharma.app.dal.ManufacturerDao;
import com.esypharma.app.service.UserService;
import com.esypharma.models.Manufacturer;
import com.esypharma.repository.UserRepository;
 
@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ManufacturerDao manufacturerDao;
	
	
	/*
	 * @Autowired private ;
	 */
	
	public void getAllUser() {
		
		System.out.println(userRepository.findAll());
		System.out.println(userRepository.findByUsername("vishal000"));
		//System.out.println(userRepository.findAllByRoleName("ROLE_USER"));
		//System.out.println(userRepository.findAllByUserRolesName("ROLE_USER"));
	}
	
	
	@Override
	public boolean addManufacturer(Manufacturer manufacturer,String userID) {
		manufacturer.setId(userID);
		
		manufacturerDao.saveManufacture(manufacturer);
		return true;
	}
	

}
