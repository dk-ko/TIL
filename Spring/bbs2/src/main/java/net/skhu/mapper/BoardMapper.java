package net.skhu.mapper;

import org.apache.ibatis.annotations.Mapper;

import net.skhu.dto.Board;

@Mapper
public interface BoardMapper {
	Board findOne(int id);
}
