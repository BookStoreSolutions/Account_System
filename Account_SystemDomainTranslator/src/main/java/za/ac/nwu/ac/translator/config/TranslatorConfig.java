package za.ac.nwu.ac.translator.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import za.ac.nwu.ac.repo.config.RepositoryConfig;

@Import({RepositoryConfig.class})
@Configuration
@ComponentScan(basePackages = {
        "za.ac.nwu.ac.translator"
        /*"za.ac.nwu.ac..web.sb.controller",
        "za.ac.nwu.ac.web.sb.exception"*/
})
public class TranslatorConfig {
}