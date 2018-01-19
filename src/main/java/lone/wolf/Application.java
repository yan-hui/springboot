package lone.wolf;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @Description:
 * @author: hechunhui
 * @CreateTime: 2017/12/4 18:11
 * @ModifyBy:
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {

//        SpringApplication.run(Application.class, args);
        /**
         * 关闭启动图标banner
         */
        SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);
        builder.bannerMode(Banner.Mode.OFF).run(args);
    }
}
