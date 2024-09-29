package ${package}.${packageName.replace('/','.')}.components.configuration;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Configurable;

/**
 * SwaggerConfiguration
 * <p>
 * SwaggerConfiguration class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE BACSYSTEM APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author cbaciliod
 * @author dbacilio88@outllok.es
 * @since 25/09/2024
 */

@Configurable
@OpenAPIDefinition(
        info = @Info(
                title = "api-microservices-application",
                version = "1.0.0",
                description = "api-microservices-application"

        )
)
public class SwaggerConfiguration {
}
