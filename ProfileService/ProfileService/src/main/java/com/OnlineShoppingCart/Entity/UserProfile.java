package com.OnlineShoppingCart.Entity;

import java.time.LocalDate;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.Email;
//import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "userProfile")
public class UserProfile {
	@Id


	@Positive(message = "Profile Id must be Positive")
	private Integer profileId;
	@NotEmpty(message = "Name should not be empty")
	private String fullName;
	@Pattern(regexp = "^[a-zA-Z0-9_*]+@[a-zA-Z0-9_*]+\\.[a-zA-Z0-9_*]+$", message = "Please enter a valid email address")
	private String emailId;
	@NotNull(message = "not null")
	private Long mobileNumber;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate dateOfBirth;
	@NotNull
	private String gender;
	@NotNull
	private Address address;

}
