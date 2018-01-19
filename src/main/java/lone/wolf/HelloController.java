package lone.wolf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @author: hechunhui
 * @CreateTime: 2017/12/4 18:10
 * @ModifyBy:
 */
@RestController
@EnableAutoConfiguration
public class HelloController {
    @Autowired
    private Book book;

    @Value(value = "${book.name}")
    private String name;
    @Value(value = "${book.author}")
    private String author;
    @Value(value = "${book.type}")
    private String type;
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/hello/{myName}")
    String index(@PathVariable String myName) {
        return "Hello " + myName + "!!!";
    }
    @RequestMapping("/hello/user")
    public User getUser() {
        User user = new User();
        user.setUsername("小明");
        return user;
    }
    @RequestMapping(value = "/book",produces = "text/plain;charset=UTF-8")
    public String book(){
        return "书名："+name+"作者："+author+"类别："+type;
    }

    @RequestMapping("/book2")
    public String book2() {
        return "Hello Spring Boot! The BookName is "+book.getName()+";and Book Author is "+book.getAuthor()+";and Book type is "+book.getType();
    }

}
