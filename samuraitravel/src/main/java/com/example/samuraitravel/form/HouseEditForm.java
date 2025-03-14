package com.example.samuraitravel.form;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;



@Data
@AllArgsConstructor
public class HouseEditForm {
	@NotNull
	private Integer id;
	
	@NotBlank(message = "民宿名を入力してください。")
	private String name;
	
	private MultipartFile imageFle;
	
	@NotBlank(message = "説明を入力してください。")
	private String description;
	
	

}
