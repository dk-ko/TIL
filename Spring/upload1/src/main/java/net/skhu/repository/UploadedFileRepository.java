package net.skhu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.skhu.domain.UploadedFile;

public interface UploadedFileRepository extends JpaRepository<UploadedFile, Integer>{
	
}
