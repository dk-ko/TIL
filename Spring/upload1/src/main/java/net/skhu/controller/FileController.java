package net.skhu.controller;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.file.Paths;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import net.skhu.domain.UploadedFile;
import net.skhu.repository.UploadedFileRepository;

@Controller
public class FileController {
	@Autowired UploadedFileRepository uploadedFileRepository;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("currentTime", new Date());
		return "file/index";
	}
	
	@RequestMapping("file/list")
	public String list(Model model) {
		System.out.println("control");
		model.addAttribute("files", uploadedFileRepository.findAll());
		return "file/list";
	}
	
	@Transactional
	@RequestMapping(value="file/upload", method=RequestMethod.POST)
	public String upload(@RequestParam("fileUpload") MultipartFile[] uploadFiles) throws IOException {
		System.out.println("upload");
		for(MultipartFile uploadFile : uploadFiles) {
			if(uploadFile.getSize() <= 0) continue;
			String fileName = Paths.get(uploadFile.getOriginalFilename()).getFileName().toString();
			UploadedFile uploadedFile = new UploadedFile();
			uploadedFile.setFileName(fileName);
			uploadedFile.setFileSize((int)uploadFile.getSize());
			uploadedFile.setFileTime(new Date());
			uploadedFile.setData(uploadFile.getBytes());
			uploadedFileRepository.save(uploadedFile);
		}
		return "redirect:list";
	}
	
	@RequestMapping("file/delete")
	public String delete(@RequestParam("id") int id) throws Exception{
		uploadedFileRepository.delete(id);
		return "redirect:list";
	}
	
	@RequestMapping("file/download")
	public void download(@RequestParam("id") int id, HttpServletResponse response) throws Exception {
		UploadedFile uploadedfile = uploadedFileRepository.findOne(id);
		if(uploadedfile == null) return;
		String fileName = URLEncoder.encode(uploadedfile.getFileName(),"UTF-8");
		response.setContentType("application/octet-stream");
		response.setHeader("Content-Disposition", "attachment;filename=" + fileName + ";");
		try (BufferedOutputStream output = new BufferedOutputStream(response.getOutputStream())) {
			output.write(uploadedfile.getData());
		}
	}
}
