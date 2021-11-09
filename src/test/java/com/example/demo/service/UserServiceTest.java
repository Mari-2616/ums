//package com.example.demo.service;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//
//import com.example.demo.entity.User;
//import com.example.demo.repo.UserRepository;
//
//@SpringBootTest
//public class UserServiceTest {
//
//	@MockBean
//	private UserRepository urepo;
//
//	@Autowired
//	private IUserService uservice;
//
//	@Test
//	public void testSaveUserShouldReturnSavedUser() {
//		User user = new User("Prudhvi", "prudhvi", "prudhvi@gmail.com", "Mumbai");
//		when(urepo.save(user)).thenReturn(user);
//
//		User savedUser = uservice.saveUser(user);
//		assertThat(savedUser).isNotNull();
//		Assertions.assertEquals(user.getUsername(), savedUser.getUsername());
//
//	}
//
//	@Test
//	public void testDeleteUser()
//	{
//		Integer uid=1;
//		uservice.deleteUser(uid);
//		verify(urepo,times(1)).deleteById(uid);
//	}
//
//	@Test
//	public void testGetUserByEmail()
//	{
//		String email="prudhvi@gmail.com";
//		User user=new User("Prudhvi","prudhvi",email,"Goa");
//		when(urepo.findByEmail(email)).thenReturn(Optional.of(user));
//		Optional<User> userByEmail=uservice.getUserByEmail(email);
//		System.out.println("User By Email :"+userByEmail.get());
//		Assertions.assertTrue(userByEmail.isPresent());
//		assertThat(userByEmail.get().getEmail()).isEqualTo(email);
//	}
//
//	@Test
//	public void testGetUserByCity() {
//
//		String city = "Dindigul";
//		String city2 = "Salem";
//		User user = new User("Mari", "mari", "mari@gmail.com", city);
//		User user2 = new User("Sathya", "sathya", "sathya@gmail.com", city2);
//		when(urepo.findByCity(city)).thenReturn(Optional.of(user));
//		when(urepo.findByCity(city2)).thenReturn(Optional.of(user2));
//		Optional<User> userByCity = uservice.getAllUsersByCity(city2);
//		System.out.println(userByCity.get());
//		Assertions.assertTrue(userByCity.isPresent());
//		assertThat(userByCity.get().getCity()).isEqualTo(city2);
//	}
//
//	@Test
//	public void testGetUserByID(){
//
//		Integer id1 = 1;
//		Integer id2 = 2;
//		User user = new User(id1, "Mari", "mari", "mari@gmail.com", "Dindigul");
//		User user2 = new User(id2, "Sathya", "sathya", "sathya@gmail.com", "Salem");
//		when(urepo.findById(id1)).thenReturn(Optional.of(user));
//		when(urepo.findById(id2)).thenReturn(Optional.of(user2));
//		Optional<User> userById = uservice.getUserById(id1);
//		assertThat(userById.get().getUsername()).isEqualTo("Mari");
//	}
//
//	@Test
//	public void testGetAllUsers() {
//
//		User user = new User("Mari", "mari", "mari@gmail.com", "Dindigul");
//		User user2 = new User("Sathya", "sathya", "sathya@gmail.com", "Salem");
//		List<User> userList = new ArrayList<>();
//		userList.add(user);
//
//		when(urepo.findAll()).thenReturn(userList );
//	}
//
//
//}
