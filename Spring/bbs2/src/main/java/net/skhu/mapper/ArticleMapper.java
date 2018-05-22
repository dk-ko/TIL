package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import net.skhu.dto.Article;
import net.skhu.model.Option;
import net.skhu.model.Pagination;

@Mapper
public interface ArticleMapper {

    Article findOne(int id);
    List<Article> findAll(Pagination pagination);
    int count(Pagination pagination);
    Article findTopByBoardIdOrderByNoDesc(int boardId);
    void delete(int id);
    void update(@Param("id") int id, @Param("title") String title, @Param("body") String body);
    void insert(Article article);

    Option[] searchBy = { new Option(0, "검색 없음"), new Option(1, "글쓴이"),
                          new Option(2, "제목"), new Option(3, "본문")  };
    Option[] orderBy = { new Option(0, "최근 글"), new Option(1, "오래된 글"),
                         new Option(2, "글쓴이") };
}
