package com.OnlineShoppingCart.Entity;
import org.springframework.data.mongodb.core.mapping.Document;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="address")
public class Address {
	@Id

	private int houseNumber;
	private String streetName;
	private String colonyName;
	private String city;
	private String state;
	@NotNull
	private int pincode;


}
	
