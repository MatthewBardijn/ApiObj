package com.example.demoupdownload;

import org.apache.catalina.webresources.FileResource;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.fileUpload;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.nio.file.Path;
import java.nio.file.Paths;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FileDemoApplicationTests {

	private MockMvc mockMvc;
	 
	@Rule
	public TemporaryFolder folder = new TemporaryFolder();
	 
	@Before
	public void setUp() throws Exception {
	}
	@Test
	public void should_upload_image_to_upload_path() throws Exception {
	
	MockMultipartFile file = new MockMultipartFile("file", "hello.obj", "application/x-tgif", "Hello, World!".getBytes());
	MockHttpServletRequestBuilder builder =
	          MockMvcRequestBuilders.multipart("/upload")
	                                .file(file);
	Path filePath = Paths.get("C:/Users/Matthew/Downloads/jee/demo/Temp");
	
	assertThat(filePath.getRoot().resolve("hello.txt")).exists();
	}
	
}
