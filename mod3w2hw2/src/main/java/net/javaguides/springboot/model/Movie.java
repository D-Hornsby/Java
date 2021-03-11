package net.javaguides.springboot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.*;

//import lombok.Setter;
//these 2 go together. can use to ignore other stuff in the json you don't want
@JsonIgnoreProperties


//these 2 annotations are the exact same as typing 
//Public Movie ()
//{super()};
//due to the lombok package we chose that is now im pom
@NoArgsConstructor
@AllArgsConstructor

//the getter and setter here threw lombok are the same are writing them all out
//@Getter
//@Setter
//so now taking this out and using Data threw lombok that = implements that check all 
//and replaces @getters and @setters and a constructor
@Data
//that saved us a ton of line of code 

//make character names just like what is in the json. 

public class Movie {
	private int movie_id;
	private String title;
	private String director;
	

	
}
