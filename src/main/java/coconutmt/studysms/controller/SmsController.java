package coconutmt.studysms.controller;

import coconutmt.studysms.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmsController {

    @Autowired
    private SmsService smsService;

    @RequestMapping("/send/{phone}")
    public String send(@PathVariable("phone") String phone){
        smsService.send(phone,"", "");
        return "Ok";
    }

}
