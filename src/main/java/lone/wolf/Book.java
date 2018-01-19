package lone.wolf;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @author: hechunhui
 * @CreateTime: 2018/1/19 11:33
 * @ModifyBy:
 */
@Component
@ConfigurationProperties(prefix = "book",locations = "classpath:book.properties")
public class Book {
    private String name;
    private String author;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
