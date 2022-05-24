package Pj.Bumsu.Kim;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import Pj.Bumsu.Kim.db.StdDb;

@Controller
public class StdController {
	@Autowired
	private StdDb stddb;
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String admission(Model model) {

		return "admissionCollege";
	}
	
	@RequestMapping(value="/stdinput.do",method=RequestMethod.POST)
	public String stdinput(@ModelAttribute disabled ret, Model model) {
		model.addAttribute("msg", ret);
		stddb.create_disabled(ret);
		return "result";
	}
	@RequestMapping(value="/std1.do",method=RequestMethod.GET)
	public String eprocess1(Model model)
	{
		model.addAttribute("msg",new disabled());
		return "stdinput";
	}
	
	@RequestMapping(value="/document_input.do",method=RequestMethod.POST)
	public String document_input(@ModelAttribute document ret, Model model) {
		model.addAttribute("msg", ret);
		stddb.create_document(ret);
		return "document_result";
	}
	@RequestMapping(value="/std1_document.do",method=RequestMethod.GET)
	public String eprocess2(Model model)
	{
		model.addAttribute("msg",new document());
		return "document_input";
	}
	
	@RequestMapping(value="/expat12_input.do",method=RequestMethod.POST)
	public String expat12_input(@ModelAttribute expat12 ret, Model model) {
		model.addAttribute("msg", ret);
		stddb.create_expat12(ret);
		return "expat12_result";
	}
	@RequestMapping(value="/std1_expat12.do",method=RequestMethod.GET)
	public String eprocess3(Model model)
	{
		model.addAttribute("msg",new expat12());
		return "expat12_input";
	}
	
	@RequestMapping(value="/expat3_input.do",method=RequestMethod.POST)
	public String expat3_input(@ModelAttribute expat3 ret, Model model) {
		model.addAttribute("msg", ret);
		stddb.create_expat3(ret);
		return "expat3_result";
	}
	@RequestMapping(value="/std1_expat3.do",method=RequestMethod.GET)
	public String eprocess4(Model model)
	{
		model.addAttribute("msg",new expat3());
		return "expat3_input";
	}
	
	@RequestMapping(value="/RuralArea_input.do",method=RequestMethod.POST)
	public String RuralAera_input(@ModelAttribute RuralArea ret, Model model) {
		model.addAttribute("msg", ret);
		stddb.create_Rural(ret);
		return "RuralArea_result";
	}
	@RequestMapping(value="/std1_RuralArea.do",method=RequestMethod.GET)
	public String eprocess5(Model model)
	{
		model.addAttribute("msg",new RuralArea());
		return "RuralArea_input";
	}
	
	@RequestMapping(value="/specialhigh_input.do",method=RequestMethod.POST)
	public String specialhigh_input(@ModelAttribute specialhigh ret, Model model) {
		model.addAttribute("msg", ret);
		stddb.create_special(ret);
		return "specialhigh_result";
	}
	@RequestMapping(value="/std1_specialhigh.do",method=RequestMethod.GET)
	public String eprocess6(Model model)
	{
		model.addAttribute("msg",new specialhigh());
		return "specialhigh_input";
	}
	
	@RequestMapping(value="/subject_input.do",method=RequestMethod.POST)
	public String subject_input(@ModelAttribute subject ret, Model model) {
		model.addAttribute("msg", ret);
		stddb.create_subject(ret);
		return "subject_result";
	}
	@RequestMapping(value="/std1_subject.do",method=RequestMethod.GET)
	public String eprocess7(Model model)
	{
		model.addAttribute("msg",new subject());
		return "subject_input";
	}
	
	
	
	
	@RequestMapping(value="/std_list.do",method=RequestMethod.GET)
	public String getStudent(Model model,@RequestParam(value="seq",required=false,defaultValue="0")int seq) {
		if(seq==0) {
			List<disabled> std=stddb.select1();
			model.addAttribute("std_cmd",std);
			return "list";
			
		}else {
			disabled std=stddb.select1(seq);
			model.addAttribute("msg",std);
			return "result";
		}
	}
	@RequestMapping(value="/std_list_if.do",method=RequestMethod.GET)
	public String getStudent1(Model model,@RequestParam(value="seq",required=false,defaultValue="0")int seq) {
		if(seq==0) {
			List<disabled> std=stddb.select1_1();
			model.addAttribute("std_cmd",std);
			return "list_if";
			
		}else {
			disabled std=stddb.select1_1(seq);
			model.addAttribute("msg",std);
			return "result";
		}
	}
	@RequestMapping(value="/document_list.do",method=RequestMethod.GET)
	public String getdocument(Model model,@RequestParam(value="seq",required=false,defaultValue="0")int seq) {
		if(seq==0) {
			List<document> std=stddb.select2();
			model.addAttribute("std_cmd",std);
			return "document_list";
			
		}else {
			document std=stddb.select2(seq);
			model.addAttribute("msg",std);
			return "document_result";
		}
	}
	@RequestMapping(value="/document_list_if.do",method=RequestMethod.GET)
	public String getdocument1(Model model,@RequestParam(value="seq",required=false,defaultValue="0")int seq) {
		if(seq==0) {
			List<document> std=stddb.select2_1();
			model.addAttribute("std_cmd",std);
			return "document_list_if";
			
		}else {
			document std=stddb.select2_1(seq);
			model.addAttribute("msg",std);
			return "document_result";
		}
	}
	@RequestMapping(value="/expat12_list.do",method=RequestMethod.GET)
	public String getexpat12(Model model,@RequestParam(value="seq",required=false,defaultValue="0")int seq) {
		if(seq==0) {
			List<expat12> std=stddb.select3();
			model.addAttribute("std_cmd",std);
			return "expat12_list";
			
		}else {
			expat12 std=stddb.select3(seq);
			model.addAttribute("msg",std);
			return "expat12_result";
		}
	}
	@RequestMapping(value="/expat12_list_if.do",method=RequestMethod.GET)
	public String getexpat12_1(Model model,@RequestParam(value="seq",required=false,defaultValue="0")int seq) {
		if(seq==0) {
			List<expat12> std=stddb.select3_1();
			model.addAttribute("std_cmd",std);
			return "expat12_list_if";
			
		}else {
			expat12 std=stddb.select3_1(seq);
			model.addAttribute("msg",std);
			return "expat12_result";
		}
	}
	@RequestMapping(value="/expat3_list.do",method=RequestMethod.GET)
	public String getexpat3(Model model,@RequestParam(value="seq",required=false,defaultValue="0")int seq) {
		if(seq==0) {
			List<expat3> std=stddb.select4();
			model.addAttribute("std_cmd",std);
			return "expat3_list";
			
		}else {
			expat3 std=stddb.select4(seq);
			model.addAttribute("msg",std);
			return "expat3_result";
		}
	}
	@RequestMapping(value="/expat3_list_if.do",method=RequestMethod.GET)
	public String getexpat3_1(Model model,@RequestParam(value="seq",required=false,defaultValue="0")int seq) {
		if(seq==0) {
			List<expat3> std=stddb.select4_1();
			model.addAttribute("std_cmd",std);
			return "expat3_list_if";
			
		}else {
			expat3 std=stddb.select4_1(seq);
			model.addAttribute("msg",std);
			return "expat3_result";
		}
	}
	
	@RequestMapping(value="/RuralArea_list.do",method=RequestMethod.GET)
	public String getRuralArea(Model model,@RequestParam(value="seq",required=false,defaultValue="0")int seq) {
		if(seq==0) {
			List<RuralArea> std=stddb.select5();
			model.addAttribute("std_cmd",std);
			return "RuralArea_list";
			
		}else {
			RuralArea std=stddb.select5(seq);
			model.addAttribute("msg",std);
			return "RuralArea_result";
		}
	}
	@RequestMapping(value="/RuralArea_list_if.do",method=RequestMethod.GET)
	public String getRuralArea_1(Model model,@RequestParam(value="seq",required=false,defaultValue="0")int seq) {
		if(seq==0) {
			List<RuralArea> std=stddb.select5_1();
			model.addAttribute("std_cmd",std);
			return "RuralArea_list_if";
			
		}else {
			RuralArea std=stddb.select5_1(seq);
			model.addAttribute("msg",std);
			return "RuralArea_result";
		}
	}
	@RequestMapping(value="/specialhigh_list.do",method=RequestMethod.GET)
	public String getspecialhigh(Model model,@RequestParam(value="seq",required=false,defaultValue="0")int seq) {
		if(seq==0) {
			List<specialhigh> std=stddb.select6();
			model.addAttribute("std_cmd",std);
			return "specialhigh_list";
			
		}else {
			specialhigh std=stddb.select6(seq);
			model.addAttribute("msg",std);
			return "specialhigh_result";
		}
	}
	@RequestMapping(value="/specialhigh_list_if.do",method=RequestMethod.GET)
	public String getspecialhigh_1(Model model,@RequestParam(value="seq",required=false,defaultValue="0")int seq) {
		if(seq==0) {
			List<specialhigh> std=stddb.select6_1();
			model.addAttribute("std_cmd",std);
			return "specialhigh_list_if";
			
		}else {
			specialhigh std=stddb.select6_1(seq);
			model.addAttribute("msg",std);
			return "specialhigh_result";
		}
	}
	
	@RequestMapping(value="/subject_list.do",method=RequestMethod.GET)
	public String getsubject(Model model,@RequestParam(value="seq",required=false,defaultValue="0")int seq) {
		if(seq==0) {
			List<subject> std=stddb.select7();
			model.addAttribute("std_cmd",std);
			return "subject_list";
			
		}else {
			subject std=stddb.select7(seq);
			model.addAttribute("msg",std);
			return "subject_result";
		}
	}
	@RequestMapping(value="/subject_list_if.do",method=RequestMethod.GET)
	public String getsubject1(Model model,@RequestParam(value="seq",required=false,defaultValue="0")int seq) {
		if(seq==0) {
			List<subject> std=stddb.select8();
			model.addAttribute("std_cmd",std);
			return "subject_list_if";
			
		}else {
			subject std=stddb.select8(seq);
			model.addAttribute("msg",std);
			return "subject_result";
		}
	}
	
	
	
}
