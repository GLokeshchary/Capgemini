package main.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "booksjunit")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Books {
	@Id
	String bookid;
	String bookname;
	String author;
	int rating;
}
