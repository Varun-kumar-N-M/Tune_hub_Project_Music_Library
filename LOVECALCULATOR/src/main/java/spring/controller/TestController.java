
package spring.controller;

import java.util.List;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springlc.lc.api.CommunicationDTO;
import com.springlc.lc.api.Phone;
import com.springlc.lc.api.RegisterUserINfoDTO;



@Controller
public class TestController {

	@RequestMapping("/register")
	public String sayHello(@Valid @ModelAttribute("userInforeg") RegisterUserINfoDTO userInfore, BindingResult result) {
		if (result.hasErrors()) {
			List<ObjectError> allErrors = result.getAllErrors();
			for (ObjectError temp : allErrors) {
				System.out.println(temp);
			}
			return "home-page";
		}
		Phone phone = new Phone();
		phone.setCountrycode("91");
		phone.setUserNumber("2233445566");

		CommunicationDTO communication = new CommunicationDTO();
		communication.setPhone(phone);
		userInfore.setCommunicationdto(communication);

		return "register-page";

	}

	@RequestMapping("/register-success")
	public String displayregisterdata(@ModelAttribute("userInforeg") RegisterUserINfoDTO userInfore,
			BindingResult result) {
		if (result.hasErrors()) {
			List<ObjectError> allErrors = result.getAllErrors();
			for (ObjectError temp : allErrors) {
				System.out.println(temp);
			}
			return "home-page";
		}
		return "register-data";
	}

}
