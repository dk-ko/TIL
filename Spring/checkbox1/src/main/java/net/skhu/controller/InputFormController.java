package net.skhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.skhu.model.InputFormModel;
import net.skhu.model.Option;

@Controller
public class InputFormController {
	//input Form1
	@RequestMapping(value="inputForm1", method=RequestMethod.GET)
	public String inputForm1(Model model) {
		System.out.println("input1-get-start");
		InputFormModel inputFormModel = new InputFormModel();
		inputFormModel.setColor1("yellow");
		inputFormModel.setColor2(new String[] {"red","blue"});
		inputFormModel.setColor3("blue");
		model.addAttribute("inputFormModel", inputFormModel);
		System.out.println("input1-get-end");
		System.out.println(inputFormModel.getColor1());
		return "inputForm1";
	}
	
	@RequestMapping(value="inputForm1", method=RequestMethod.POST)
	public String inputForm1(Model model, InputFormModel inputFormModel) {
		System.out.println("input1 post");
		return "inputForm1";
	}
	
	//inputForm2
	String[] colors = new String[] { "red", "yello", "blue" };
	
	@RequestMapping(value="inputForm2", method=RequestMethod.GET)
	public String inputForm2(Model model) {
		System.out.println("input2 get");
		InputFormModel inputFormModel = new InputFormModel();
		inputFormModel.setColor1("yellow");
		inputFormModel.setColor2(new String[] {"red", "blue"});
		inputFormModel.setColor3("blue");
		model.addAttribute("inputFormModel", inputFormModel);
		model.addAttribute("colors", colors);
		return "inputForm2";
	}
	
	@RequestMapping(value="inputForm2", method=RequestMethod.POST)
    public String inputForm2(Model model, InputFormModel inputFormModel) {
		System.out.println("input2 post");
        model.addAttribute("colors", colors);
        return "inputForm2";
    }
	
	Option[] options = new Option[] {
			new Option("red", "빨강"),
			new Option("yello", "노랑"),
			new Option("blue", "파랑")
	};
	
	@RequestMapping(value="inputForm3", method=RequestMethod.GET)
	public String inputForm3(Model model) {
		System.out.println("input3 get");
		InputFormModel inputFormModel = new InputFormModel();
		inputFormModel.setColor1("yellow");
		inputFormModel.setColor2(new String[] {"red", "blue"});
		inputFormModel.setColor3("blue");
		model.addAttribute("inputFormModel", inputFormModel);
		model.addAttribute("options", options);
		return "inputForm3";
	}
	
	@RequestMapping(value="inputForm3", method=RequestMethod.POST)
	public String inputForm3(Model model, InputFormModel inputFormModel) {
		System.out.println("input3 post");
		model.addAttribute("options", options);
		return "inputForm3";
	}
	
}