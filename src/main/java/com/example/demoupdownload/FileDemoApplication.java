package com.example.demoupdownload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.example.demoupdownload.property.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({
    FileStorageProperties.class
})
public class FileDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileDemoApplication.class, args);
	}

}
