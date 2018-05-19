package net.skhu.domain;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.Data;

@Data
@Entity
public class UploadedFile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	String fileName;
	int fileSize;
	Date fileTime;
	
	@Basic(fetch=FetchType.LAZY)
	@Lob
	byte[] data;

}
