package net.skhu.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.skhu.domain.Article;
import net.skhu.domain.Board;
import net.skhu.model.Pagination;
import net.skhu.repository.ArticleRepository;
import net.skhu.repository.BoardRepository;

@Controller
@RequestMapping("article")
public class ArticleController {
	
	@Autowired ArticleRepository articleRepository;
	@Autowired BoardRepository boardRepository;
	
	@RequestMapping("list")
	public String list(Pagination pagination, Model model) {
		System.out.println("list controller");
		Optional<Board> result = boardRepository.findById(pagination.getBd()); 
		Board board = result.orElse(new Board());
		List<Article> list = articleRepository.findAll(pagination);
		model.addAttribute("board",board);
		model.addAttribute("list",list);
		model.addAttribute("orderBy",ArticleRepository.orderBy);
		model.addAttribute("searchBy", ArticleRepository.searchBy);
		return "article/list";
	}
	
	@RequestMapping("view")
	public String view(@RequestParam("id") int id, Pagination pagination, Model model) {
		System.out.println("view controller");
		Optional result = articleRepository.findById(id);
		Article article = (Article) result.orElse(new Article());
		model.addAttribute("article", article);
		return "article/view";
	}

}
