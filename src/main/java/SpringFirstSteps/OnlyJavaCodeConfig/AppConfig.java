package SpringFirstSteps.OnlyJavaCodeConfig;

/*

Для обозначения класса как конфигурационного - необходимо указывать аннотацию
@Configuration

Для использования автоматического сканирования нашего пакета
@ComponentScan("package_name")

@PropertySource - аннотация для указания myApp.properties файла для дальнейшей DI

*/


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/*
Это первый способ конфигурации с автоматическим сканом наших компонентов
*/
@Configuration
@ComponentScan("SpringFirstSteps.OnlyJavaCodeConfig")
public class AppConfig {
}

/*
Это второй способ, где все бины и DI будут прописаны вручную
При этом способе нет смысла писать @Component, так как поиска не будет
Также не используется @Autowired
*/
@Configuration
@PropertySource("classpath:myApp.properties")
class AppConfig2 {
    @Bean
    public Cat catBean() {
        return new Cat();
    }

    @Bean
    public CatOwner catOwnerBean() {
        return new CatOwner(catBean());
        // здесь происходит DI
    }

    @Bean
    public Person personBean() {
        return new Person();
    }


}
